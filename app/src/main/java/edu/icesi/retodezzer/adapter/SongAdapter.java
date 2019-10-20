package edu.icesi.retodezzer.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

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
    public View getView(int i, View view, ViewGroup viewGroup) {


        return null;
    }
}
