package edu.icesi.retodezzer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import edu.icesi.retodezzer.adapter.TrackAdapter;
import edu.icesi.retodezzer.model.dto.Playlist;

public class PlaylistActivity extends AppCompatActivity {


    private ImageView playlistImg;
    private TextView nameTv;
    private TextView descriptionTv;
    private TextView numberSongsTv;
    private TextView numberFansTv;
    private ListView songsList;
    private TrackAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);



        playlistImg = findViewById(R.id.playlist_img);
        nameTv = findViewById(R.id.playlist_name_tv);
        descriptionTv = findViewById(R.id.playlist_description_tv);
        numberSongsTv  = findViewById(R.id.playlist_number_songs_tv);
        numberFansTv= findViewById(R.id.playlist_number_fans_tv);
        songsList = findViewById(R.id.song_list);

        Playlist playlist = (Playlist) getIntent().getExtras().getSerializable("playlist");

        adapter = new TrackAdapter(playlist.getTracks().getData());
        songsList.setAdapter(adapter);

        Picasso.get().load(playlist.getPictureBig()).into(playlistImg);

        nameTv.setText(playlist.getTitle());
        descriptionTv.setText(playlist.getDescription());
        numberSongsTv.setText(playlist.getNbTracks() + " canciones");
        numberFansTv.setText(playlist.getFans() + " fans");


    }

}
