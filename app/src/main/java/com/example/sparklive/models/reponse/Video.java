package com.example.sparklive.models.reponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Video {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("media_details")
    @Expose
    private List<Object> mediaDetails = null;
    @SerializedName("transcoding_id")
    @Expose
    private String transcodingId;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("shoot_location")
    @Expose
    private Object shootLocation;
    @SerializedName("is_live")
    @Expose
    private Boolean isLive;
    @SerializedName("aspect_ratio")
    @Expose
    private String aspectRatio;
    @SerializedName("state")
    @Expose
    private String state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getMediaDetails() {
        return mediaDetails;
    }

    public void setMediaDetails(List<Object> mediaDetails) {
        this.mediaDetails = mediaDetails;
    }

    public String getTranscodingId() {
        return transcodingId;
    }

    public void setTranscodingId(String transcodingId) {
        this.transcodingId = transcodingId;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Object getShootLocation() {
        return shootLocation;
    }

    public void setShootLocation(Object shootLocation) {
        this.shootLocation = shootLocation;
    }

    public Boolean getIsLive() {
        return isLive;
    }

    public void setIsLive(Boolean isLive) {
        this.isLive = isLive;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
