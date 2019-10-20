package edu.icesi.retodezzer.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import edu.icesi.retodezzer.model.entity.Playlist;

public class PlaylistAdapter extends BaseAdapter {

    private ArrayList<Playlist> playlists;


    @Override
    public int getCount() {
        return playlists.size();
    }

    @Override
    public Object getItem(int i) {
        return playlists.get(i);
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
