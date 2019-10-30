package edu.icesi.retodezzer.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Track implements Serializable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("readable")
    @Expose
    private Boolean readable;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("title_short")
    @Expose
    private String titleShort;
    @SerializedName("title_version")
    @Expose
    private String titleVersion;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("rank")
    @Expose
    private String rank;
    @SerializedName("explicit_lyrics")
    @Expose
    private Boolean explicitLyrics;
    @SerializedName("explicit_content_lyrics")
    @Expose
    private Integer explicitContentLyrics;
    @SerializedName("explicit_content_cover")
    @Expose
    private Integer explicitContentCover;
    @SerializedName("preview")
    @Expose
    private String preview;
    @SerializedName("time_add")
    @Expose
    private Integer timeAdd;
    @SerializedName("album")
    @Expose
    private Album album;
    @SerializedName("artist")
    @Expose
    private Artist artist;
    @SerializedName("type")
    @Expose
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Track withId(String id) {
        this.id = id;
        return this;
    }

    public Boolean getReadable() {
        return readable;
    }

    public void setReadable(Boolean readable) {
        this.readable = readable;
    }

    public Track withReadable(Boolean readable) {
        this.readable = readable;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Track withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTitleShort() {
        return titleShort;
    }

    public void setTitleShort(String titleShort) {
        this.titleShort = titleShort;
    }

    public Track withTitleShort(String titleShort) {
        this.titleShort = titleShort;
        return this;
    }

    public String getTitleVersion() {
        return titleVersion;
    }

    public void setTitleVersion(String titleVersion) {
        this.titleVersion = titleVersion;
    }

    public Track withTitleVersion(String titleVersion) {
        this.titleVersion = titleVersion;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Track withLink(String link) {
        this.link = link;
        return this;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Track withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Track withRank(String rank) {
        this.rank = rank;
        return this;
    }

    public Boolean getExplicitLyrics() {
        return explicitLyrics;
    }

    public void setExplicitLyrics(Boolean explicitLyrics) {
        this.explicitLyrics = explicitLyrics;
    }

    public Track withExplicitLyrics(Boolean explicitLyrics) {
        this.explicitLyrics = explicitLyrics;
        return this;
    }

    public Integer getExplicitContentLyrics() {
        return explicitContentLyrics;
    }

    public void setExplicitContentLyrics(Integer explicitContentLyrics) {
        this.explicitContentLyrics = explicitContentLyrics;
    }

    public Track withExplicitContentLyrics(Integer explicitContentLyrics) {
        this.explicitContentLyrics = explicitContentLyrics;
        return this;
    }

    public Integer getExplicitContentCover() {
        return explicitContentCover;
    }

    public void setExplicitContentCover(Integer explicitContentCover) {
        this.explicitContentCover = explicitContentCover;
    }

    public Track withExplicitContentCover(Integer explicitContentCover) {
        this.explicitContentCover = explicitContentCover;
        return this;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public Track withPreview(String preview) {
        this.preview = preview;
        return this;
    }

    public Integer getTimeAdd() {
        return timeAdd;
    }

    public void setTimeAdd(Integer timeAdd) {
        this.timeAdd = timeAdd;
    }

    public Track withTimeAdd(Integer timeAdd) {
        this.timeAdd = timeAdd;
        return this;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Track withArtist(Artist artist) {
        this.artist = artist;
        return this;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Track withType(String type) {
        this.type = type;
        return this;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
