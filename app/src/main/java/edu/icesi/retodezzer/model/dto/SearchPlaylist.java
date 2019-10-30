package edu.icesi.retodezzer.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SearchPlaylist implements Serializable {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("public")
    @Expose
    private Boolean _public;
    @SerializedName("nb_tracks")
    @Expose
    private Integer nbTracks;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("picture")
    @Expose
    private String picture;
    @SerializedName("picture_small")
    @Expose
    private String pictureSmall;
    @SerializedName("picture_medium")
    @Expose
    private String pictureMedium;
    @SerializedName("picture_big")
    @Expose
    private String pictureBig;
    @SerializedName("picture_xl")
    @Expose
    private String pictureXl;
    @SerializedName("checksum")
    @Expose
    private String checksum;
    @SerializedName("tracklist")
    @Expose
    private String tracklist;
    @SerializedName("creation_date")
    @Expose
    private String creationDate;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("type")
    @Expose
    private String type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public SearchPlaylist withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SearchPlaylist withTitle(String title) {
        this.title = title;
        return this;
    }

    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public SearchPlaylist withPublic(Boolean _public) {
        this._public = _public;
        return this;
    }

    public Integer getNbTracks() {
        return nbTracks;
    }

    public void setNbTracks(Integer nbTracks) {
        this.nbTracks = nbTracks;
    }

    public SearchPlaylist withNbTracks(Integer nbTracks) {
        this.nbTracks = nbTracks;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public SearchPlaylist withLink(String link) {
        this.link = link;
        return this;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public SearchPlaylist withPicture(String picture) {
        this.picture = picture;
        return this;
    }

    public String getPictureSmall() {
        return pictureSmall;
    }

    public void setPictureSmall(String pictureSmall) {
        this.pictureSmall = pictureSmall;
    }

    public SearchPlaylist withPictureSmall(String pictureSmall) {
        this.pictureSmall = pictureSmall;
        return this;
    }

    public String getPictureMedium() {
        return pictureMedium;
    }

    public void setPictureMedium(String pictureMedium) {
        this.pictureMedium = pictureMedium;
    }

    public SearchPlaylist withPictureMedium(String pictureMedium) {
        this.pictureMedium = pictureMedium;
        return this;
    }

    public String getPictureBig() {
        return pictureBig;
    }

    public void setPictureBig(String pictureBig) {
        this.pictureBig = pictureBig;
    }

    public SearchPlaylist withPictureBig(String pictureBig) {
        this.pictureBig = pictureBig;
        return this;
    }

    public String getPictureXl() {
        return pictureXl;
    }

    public void setPictureXl(String pictureXl) {
        this.pictureXl = pictureXl;
    }

    public SearchPlaylist withPictureXl(String pictureXl) {
        this.pictureXl = pictureXl;
        return this;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public SearchPlaylist withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    public String getTracklist() {
        return tracklist;
    }

    public void setTracklist(String tracklist) {
        this.tracklist = tracklist;
    }

    public SearchPlaylist withTracklist(String tracklist) {
        this.tracklist = tracklist;
        return this;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public SearchPlaylist withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SearchPlaylist withUser(User user) {
        this.user = user;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SearchPlaylist withType(String type) {
        this.type = type;
        return this;
    }

}
