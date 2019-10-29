package edu.icesi.retodezzer.model.entity;

import java.io.Serializable;
import java.util.Date;

public class Song implements Serializable {

    private String image;
    private String name;
    private String artist;
    private String album;
    private int duration;
    private String link;
    private Date release;

    public Song() {
    }


    public Song(String image, String name, String artist, String album, int duration, String link, Date release) {
        this.image = image;
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.link = link;
        this.release = release;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {
        this.release = release;
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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
