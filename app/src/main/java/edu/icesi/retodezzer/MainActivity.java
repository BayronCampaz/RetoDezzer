package edu.icesi.retodezzer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import edu.icesi.retodezzer.adapter.PlaylistAdapter;

public class MainActivity extends AppCompatActivity {

    private EditText searchEt;
    private ImageButton searchBtn;
    private ListView playlists;
    private PlaylistAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchEt = findViewById(R.id.search_et);
        searchBtn = findViewById(R.id.search_btn);
        playlists = findViewById(R.id.playlist_list);
        adapter = new PlaylistAdapter();
        playlists.setAdapter(adapter);

    }
}
