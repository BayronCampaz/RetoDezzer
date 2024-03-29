package edu.icesi.retodezzer.model.dto;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data implements Serializable {

    @SerializedName("data")
    @Expose
    private List<SearchPlaylist> data = null;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("next")
    @Expose
    private String next;

    public List<SearchPlaylist> getData() {
        return data;
    }

    public void setData(List<SearchPlaylist> data) {
        this.data = data;
    }

    public Data withData(List<SearchPlaylist> data) {
        this.data = data;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Data withTotal(Integer total) {
        this.total = total;
        return this;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public Data withNext(String next) {
        this.next = next;
        return this;
    }

}
