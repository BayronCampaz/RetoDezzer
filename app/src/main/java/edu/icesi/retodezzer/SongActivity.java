package edu.icesi.retodezzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import edu.icesi.retodezzer.model.dto.Song;

public class SongActivity extends AppCompatActivity {

    private ImageView imageSong;
    private TextView nameSongTv;
    private TextView nameArtistTv;
    private TextView nameAlbumTv;
    private TextView durationSongTv;
    private Button playBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Canción");

        imageSong = findViewById(R.id.song_img);
        nameSongTv = findViewById(R.id.song_name_tv);
        nameArtistTv  = findViewById(R.id.song_artist_tv);
        nameAlbumTv  = findViewById(R.id.song_album_tv);
        durationSongTv  = findViewById(R.id.song_duration_tv);
        playBtn  = findViewById(R.id.play_song_btn);

        Song song = (Song) getIntent().getExtras().getSerializable("song");

        Picasso.get().load(song.getAlbum().getCoverBig()).into(imageSong);
        nameSongTv.setText(song.getTitle());
        nameArtistTv.setText(song.getArtist().getName());
        nameAlbumTv.setText(song.getAlbum().getTitle());

        int minutesDuration = song.getDuration()/ 60;
        int seconds = song.getDuration() % 60;
        String secondString =""+seconds;
        if(seconds < 10){
            secondString = "0"+seconds;
        }
        durationSongTv.setText(minutesDuration + ":" + secondString);

        playBtn.setOnClickListener(view -> {
            Uri uri = Uri.parse(song.getLink());
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
    }
}
