package edu.icesi.retodezzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;

import edu.icesi.retodezzer.adapter.PlaylistAdapter;
import edu.icesi.retodezzer.model.dto.Data;
import edu.icesi.retodezzer.model.dto.Playlist;
import edu.icesi.retodezzer.model.dto.SearchPlaylist;
import edu.icesi.retodezzer.util.HTTPSWebUtilDomi;

public class MainActivity extends AppCompatActivity {

    private EditText searchEt;
    private ImageButton searchBtn;
    private ListView playlists;
    private ArrayList<SearchPlaylist> playlistArray;
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
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


                new Thread(
                        ()-> {
                            try {
                            HTTPSWebUtilDomi util = new HTTPSWebUtilDomi();
                            String json = null;

                            json = util.GETrequest("https://api.deezer.com/playlist/"+playlistArray.get(position).getId());
                            Log.e(">>>",json);

                            Gson g = new Gson();
                            Playlist playlist  = g.fromJson(json, Playlist.class);

                                Intent intent = new Intent(MainActivity.this, PlaylistActivity.class);
                                intent.putExtra("playlist", playlist);
                                startActivity(intent);


                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                }).start();

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

                        playlistArray = new ArrayList<SearchPlaylist>();

                        for(int i=0; i<data.getData().size(); i++){
                            SearchPlaylist searchPlaylist = data.getData().get(i);
                            playlistArray.add(searchPlaylist);
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
