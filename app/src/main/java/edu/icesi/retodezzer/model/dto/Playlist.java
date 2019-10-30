package edu.icesi.retodezzer.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Playlist implements Serializable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("public")
    @Expose
    private Boolean _public;
    @SerializedName("is_loved_track")
    @Expose
    private Boolean isLovedTrack;
    @SerializedName("collaborative")
    @Expose
    private Boolean collaborative;
    @SerializedName("nb_tracks")
    @Expose
    private Integer nbTracks;
    @SerializedName("fans")
    @Expose
    private Integer fans;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("share")
    @Expose
    private String share;
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
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("tracks")
    @Expose
    private Tracks tracks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Playlist withId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Playlist withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Playlist withDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Playlist withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public Playlist withPublic(Boolean _public) {
        this._public = _public;
        return this;
    }

    public Boolean getIsLovedTrack() {
        return isLovedTrack;
    }

    public void setIsLovedTrack(Boolean isLovedTrack) {
        this.isLovedTrack = isLovedTrack;
    }

    public Playlist withIsLovedTrack(Boolean isLovedTrack) {
        this.isLovedTrack = isLovedTrack;
        return this;
    }

    public Boolean getCollaborative() {
        return collaborative;
    }

    public void setCollaborative(Boolean collaborative) {
        this.collaborative = collaborative;
    }

    public Playlist withCollaborative(Boolean collaborative) {
        this.collaborative = collaborative;
        return this;
    }

    public Integer getNbTracks() {
        return nbTracks;
    }

    public void setNbTracks(Integer nbTracks) {
        this.nbTracks = nbTracks;
    }

    public Playlist withNbTracks(Integer nbTracks) {
        this.nbTracks = nbTracks;
        return this;
    }

    public Integer getFans() {
        return fans;
    }

    public void setFans(Integer fans) {
        this.fans = fans;
    }

    public Playlist withFans(Integer fans) {
        this.fans = fans;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Playlist withLink(String link) {
        this.link = link;
        return this;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public Playlist withShare(String share) {
        this.share = share;
        return this;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Playlist withPicture(String picture) {
        this.picture = picture;
        return this;
    }

    public String getPictureSmall() {
        return pictureSmall;
    }

    public void setPictureSmall(String pictureSmall) {
        this.pictureSmall = pictureSmall;
    }

    public Playlist withPictureSmall(String pictureSmall) {
        this.pictureSmall = pictureSmall;
        return this;
    }

    public String getPictureMedium() {
        return pictureMedium;
    }

    public void setPictureMedium(String pictureMedium) {
        this.pictureMedium = pictureMedium;
    }

    public Playlist withPictureMedium(String pictureMedium) {
        this.pictureMedium = pictureMedium;
        return this;
    }

    public String getPictureBig() {
        return pictureBig;
    }

    public void setPictureBig(String pictureBig) {
        this.pictureBig = pictureBig;
    }

    public Playlist withPictureBig(String pictureBig) {
        this.pictureBig = pictureBig;
        return this;
    }

    public String getPictureXl() {
        return pictureXl;
    }

    public void setPictureXl(String pictureXl) {
        this.pictureXl = pictureXl;
    }

    public Playlist withPictureXl(String pictureXl) {
        this.pictureXl = pictureXl;
        return this;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public Playlist withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    public String getTracklist() {
        return tracklist;
    }

    public void setTracklist(String tracklist) {
        this.tracklist = tracklist;
    }

    public Playlist withTracklist(String tracklist) {
        this.tracklist = tracklist;
        return this;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Playlist withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Playlist withType(String type) {
        this.type = type;
        return this;
    }

    public Tracks getTracks() {
        return tracks;
    }

    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

    public Playlist withTracks(Tracks tracks) {
        this.tracks = tracks;
        return this;
    }

}
