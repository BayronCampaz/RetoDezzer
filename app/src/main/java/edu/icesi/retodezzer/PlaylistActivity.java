package edu.icesi.retodezzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.io.IOException;

import edu.icesi.retodezzer.adapter.TrackAdapter;
import edu.icesi.retodezzer.model.dto.Playlist;
import edu.icesi.retodezzer.model.dto.Song;
import edu.icesi.retodezzer.util.HTTPSWebUtilDomi;

public class PlaylistActivity extends AppCompatActivity {


    private ImageView playlistImg;
    private TextView nameTv;
    private TextView descriptionTv;
    private TextView numberSongsTv;
    private TextView numberFansTv;
    private ListView trackList;
    private TrackAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Playlist");

        playlistImg = findViewById(R.id.playlist_img);
        nameTv = findViewById(R.id.playlist_name_tv);
        descriptionTv = findViewById(R.id.playlist_description_tv);
        numberSongsTv  = findViewById(R.id.playlist_number_songs_tv);
        numberFansTv= findViewById(R.id.playlist_number_fans_tv);
        trackList = findViewById(R.id.song_list);

        Playlist playlist = (Playlist) getIntent().getExtras().getSerializable("playlist");

        adapter = new TrackAdapter(playlist.getTracks().getData());
        trackList.setAdapter(adapter);

        Picasso.get().load(playlist.getPictureBig()).into(playlistImg);

        nameTv.setText(playlist.getTitle());
        descriptionTv.setText(playlist.getDescription());
        numberSongsTv.setText(playlist.getNbTracks() + " canciones");
        numberFansTv.setText(playlist.getFans() + " fans");

        trackList.setOnItemClickListener((adapterView, view, position, l) -> {

            new Thread(
                    ()-> {
                        try {
                            HTTPSWebUtilDomi util = new HTTPSWebUtilDomi();
                            String json = null;

                            String idTrack = playlist.getTracks().getData().get(position).getId();
                            json = util.GETrequest("https://api.deezer.com/track/"+ idTrack);
                            Log.e(">>>",json);

                            Gson g = new Gson();
                            Song song  = g.fromJson(json, Song.class);

                            Intent intent = new Intent(PlaylistActivity.this, SongActivity.class);
                            intent.putExtra("song", song);
                            startActivity(intent);


                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }).start();
        });
    }
}
