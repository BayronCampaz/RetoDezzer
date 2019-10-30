package edu.icesi.retodezzer.model.dto;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Song implements Serializable {

    @SerializedName("id")
    @Expose
    private Integer id;
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
    @SerializedName("isrc")
    @Expose
    private String isrc;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("share")
    @Expose
    private String share;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("track_position")
    @Expose
    private Integer trackPosition;
    @SerializedName("disk_number")
    @Expose
    private Integer diskNumber;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("release_date")
    @Expose
    private String releaseDate;
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
    @SerializedName("bpm")
    @Expose
    private Double bpm;
    @SerializedName("gain")
    @Expose
    private Double gain;
    @SerializedName("available_countries")
    @Expose
    private List<String> availableCountries = null;
    @SerializedName("artist")
    @Expose
    private Artist artist;
    @SerializedName("album")
    @Expose
    private Album album;
    @SerializedName("type")
    @Expose
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Song withId(Integer id) {
        this.id = id;
        return this;
    }

    public Boolean getReadable() {
        return readable;
    }

    public void setReadable(Boolean readable) {
        this.readable = readable;
    }

    public Song withReadable(Boolean readable) {
        this.readable = readable;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Song withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTitleShort() {
        return titleShort;
    }

    public void setTitleShort(String titleShort) {
        this.titleShort = titleShort;
    }

    public Song withTitleShort(String titleShort) {
        this.titleShort = titleShort;
        return this;
    }

    public String getTitleVersion() {
        return titleVersion;
    }

    public void setTitleVersion(String titleVersion) {
        this.titleVersion = titleVersion;
    }

    public Song withTitleVersion(String titleVersion) {
        this.titleVersion = titleVersion;
        return this;
    }

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    public Song withIsrc(String isrc) {
        this.isrc = isrc;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Song withLink(String link) {
        this.link = link;
        return this;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public Song withShare(String share) {
        this.share = share;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Song withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getTrackPosition() {
        return trackPosition;
    }

    public void setTrackPosition(Integer trackPosition) {
        this.trackPosition = trackPosition;
    }

    public Song withTrackPosition(Integer trackPosition) {
        this.trackPosition = trackPosition;
        return this;
    }

    public Integer getDiskNumber() {
        return diskNumber;
    }

    public void setDiskNumber(Integer diskNumber) {
        this.diskNumber = diskNumber;
    }

    public Song withDiskNumber(Integer diskNumber) {
        this.diskNumber = diskNumber;
        return this;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Song withRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Song withReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public Boolean getExplicitLyrics() {
        return explicitLyrics;
    }

    public void setExplicitLyrics(Boolean explicitLyrics) {
        this.explicitLyrics = explicitLyrics;
    }

    public Song withExplicitLyrics(Boolean explicitLyrics) {
        this.explicitLyrics = explicitLyrics;
        return this;
    }

    public Integer getExplicitContentLyrics() {
        return explicitContentLyrics;
    }

    public void setExplicitContentLyrics(Integer explicitContentLyrics) {
        this.explicitContentLyrics = explicitContentLyrics;
    }

    public Song withExplicitContentLyrics(Integer explicitContentLyrics) {
        this.explicitContentLyrics = explicitContentLyrics;
        return this;
    }

    public Integer getExplicitContentCover() {
        return explicitContentCover;
    }

    public void setExplicitContentCover(Integer explicitContentCover) {
        this.explicitContentCover = explicitContentCover;
    }

    public Song withExplicitContentCover(Integer explicitContentCover) {
        this.explicitContentCover = explicitContentCover;
        return this;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public Song withPreview(String preview) {
        this.preview = preview;
        return this;
    }

    public Double getBpm() {
        return bpm;
    }

    public void setBpm(Double bpm) {
        this.bpm = bpm;
    }

    public Song withBpm(Double bpm) {
        this.bpm = bpm;
        return this;
    }

    public Double getGain() {
        return gain;
    }

    public void setGain(Double gain) {
        this.gain = gain;
    }

    public Song withGain(Double gain) {
        this.gain = gain;
        return this;
    }

    public List<String> getAvailableCountries() {
        return availableCountries;
    }

    public void setAvailableCountries(List<String> availableCountries) {
        this.availableCountries = availableCountries;
    }

    public Song withAvailableCountries(List<String> availableCountries) {
        this.availableCountries = availableCountries;
        return this;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Song withArtist(Artist artist) {
        this.artist = artist;
        return this;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Song withAlbum(Album album) {
        this.album = album;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Song withType(String type) {
        this.type = type;
        return this;
    }

}