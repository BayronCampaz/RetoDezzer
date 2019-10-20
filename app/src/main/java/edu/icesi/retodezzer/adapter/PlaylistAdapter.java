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
import edu.icesi.retodezzer.model.entity.Playlist;

public class PlaylistAdapter extends BaseAdapter {

    private ArrayList<Playlist> playlists;

    public PlaylistAdapter(ArrayList playlists){
        this.playlists = playlists;
    }

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
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.row_playlist, null);

        ImageView imagePlaylist = view.findViewById(R.id.playlist_img);
        TextView namePlaylist = view.findViewById(R.id.name_playlist_tv);
        TextView usernamePlaylist = view.findViewById(R.id.username_playlist_tv);
        TextView sizePlaylist = view.findViewById(R.id.size_playlist_tv);

        Picasso.get().load(playlists.get(position).getImage()).into(imagePlaylist);

        namePlaylist.setText(playlists.get(position).getName());
        usernamePlaylist.setText(playlists.get(position).getUser());
        sizePlaylist.setText(""+playlists.get(position).getSongs().size());


        //AQUI FALTA

        return view;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }
}
