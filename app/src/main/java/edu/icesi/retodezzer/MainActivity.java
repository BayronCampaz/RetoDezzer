package edu.icesi.retodezzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

import edu.icesi.retodezzer.adapter.PlaylistAdapter;
import edu.icesi.retodezzer.model.dto.Data;
import edu.icesi.retodezzer.model.dto.Datum;
import edu.icesi.retodezzer.model.entity.Playlist;
import edu.icesi.retodezzer.util.HTTPSWebUtilDomi;

public class MainActivity extends AppCompatActivity {

    private EditText searchEt;
    private ImageButton searchBtn;
    private ListView playlists;
    private ArrayList<Playlist> playlistArray;
    private PlaylistAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchEt = findViewById(R.id.search_et);
        searchBtn = findViewById(R.id.search_btn);
        playlists = findViewById(R.id.playlist_list);

        playlistArray = new ArrayList<>();

        adapter = new PlaylistAdapter(playlistArray);
        playlists.setAdapter(adapter);


        playlists.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, PlaylistActivity.class);
                intent.putExtra("tracks", playlistArray.get(i));
                startActivity(intent);
            }
        });

        searchBtn.setOnClickListener(view -> {
            String search = searchEt.getText().toString();
            searchPlaylist(search);
        });

    }

    public void searchPlaylist (String search) {
        new Thread(
                () -> {
                    try {
                        HTTPSWebUtilDomi util = new HTTPSWebUtilDomi();
                        String json = util.GETrequest("https://api.deezer.com/search/playlist?q="+search);
                        Log.e(">>>",json);

                        Gson g = new Gson();
                        Data data  = g.fromJson(json, Data.class);

                        playlistArray = new ArrayList<Playlist>();

                        for(int i=0; i<data.getData().size(); i++){
                            Datum datum = data.getData().get(i);
                            Playlist playlist = new Playlist();
                            playlist.setName(datum.getTitle());
                            playlist.setDescription("Fecha de creación " + datum.getCreationDate());
                            playlist.setImage(datum.getPictureSmall());
                            playlist.setUser(datum.getUser().getName());
                            playlistArray.add(playlist);
                        }

                        adapter.setPlaylists(playlistArray);
                        runOnUiThread(()-> adapter.notifyDataSetChanged() );

                        //Tengo que ver donde hago el notifyChanged

                       // runOnUiThread( ()-> searchEt.setText( data.getData().get(0).getTitle() ) );
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        ).start();
    }
}
