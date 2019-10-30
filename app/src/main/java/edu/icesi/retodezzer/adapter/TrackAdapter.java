package edu.icesi.retodezzer.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import edu.icesi.retodezzer.R;
import edu.icesi.retodezzer.model.dto.Track;


public class TrackAdapter extends BaseAdapter {
    private List<Track> tracks;

    public TrackAdapter(List<Track> tracks){
        this.tracks = tracks;
    }

    @Override
    public int getCount() {
        return tracks.size();
    }

    @Override
    public Object getItem(int i) {
        return tracks.get(i);
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

        Picasso.get().load(tracks.get(position).getAlbum().getCoverMedium()).into(imageSong);

        nameSong.setText(tracks.get(position).getTitle());
        artistSong.setText(tracks.get(position).getArtist().getName());
        int duration = Integer.parseInt(tracks.get(position).getDuration());
        int minutesDuration = duration / 60;
        int seconds = duration % 60;
        String secondString =""+seconds;
        if(seconds < 10){
            secondString = "0"+seconds;
        }
        releaseSong.setText("Duración: " + minutesDuration+":" + secondString);

        return view ;
    }
}
