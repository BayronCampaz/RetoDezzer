package edu.icesi.retodezzer.model.dto;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tracks implements Serializable {

    @SerializedName("data")
    @Expose
    private List<Track> data = null;
    @SerializedName("checksum")
    @Expose
    private String checksum;

    public List<Track> getData() {
        return data;
    }

    public void setData(List<Track> data) {
        this.data = data;
    }

    public Tracks withData(List<Track> data) {
        this.data = data;
        return this;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public Tracks withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

}
