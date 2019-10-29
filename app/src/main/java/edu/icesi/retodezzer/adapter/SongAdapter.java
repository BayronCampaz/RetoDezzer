package edu.icesi.retodezzer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import edu.icesi.retodezzer.R;
import edu.icesi.retodezzer.model.entity.Song;

public class SongAdapter extends BaseAdapter {
    private ArrayList<Song> songs;

    public SongAdapter(){
        songs = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return songs.size();
    }

    @Override
    public Object getItem(int i) {
        return songs.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.row_song, null);

        ImageView imageSong = view.findViewById(R.id.song_img);
        TextView nameSong = view.findViewById(R.id.name_song_tv);
        TextView artistSong = view.findViewById(R.id.artist_song_tv);
        TextView releaseSong = view.findViewById(R.id.release_song_tv);

        Picasso.get().load(songs.get(position).getImage()).into(imageSong);

        nameSong.setText(songs.get(position).getName());
        artistSong.setText(songs.get(position).getArtist());
        releaseSong.setText(""+songs.get(position).getRelease());

        return view ;
    }
}
