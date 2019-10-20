package edu.icesi.retodezzer.model.entity;

import java.util.List;

public class Playlist {

    private String image;
    private String name;
    private String description;
    private String user;
    private int fans;
    private List<Song> songs;

    public Playlist() {
    }

    public Playlist(String image, String name, String description, String user, int fans, List<Song> songs) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.user = user;
        this.fans = fans;
        this.songs = songs;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
