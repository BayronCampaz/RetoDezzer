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
import edu.icesi.retodezzer.model.dto.SearchPlaylist;

public class PlaylistAdapter extends BaseAdapter {

    private ArrayList<SearchPlaylist> playlists;

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

        Picasso.get().load(playlists.get(position).getPictureMedium()).into(imagePlaylist);

        namePlaylist.setText("Nombre: " + playlists.get(position).getTitle());
        usernamePlaylist.setText("Usuario: " + playlists.get(position).getUser().getName());
        sizePlaylist.setText("Numero de canciones: " + playlists.get(position).getNbTracks());


        //AQUI FALTA

        return view;
    }

    public ArrayList<SearchPlaylist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<SearchPlaylist> playlists) {
        this.playlists = playlists;
    }
}
