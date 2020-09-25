package com.example.sparklive.models.reponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Publisher {

    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("section_id")
    @Expose
    private Object sectionId;
    @SerializedName("fragment")
    @Expose
    private Object fragment;
    @SerializedName("is_subscribe")
    @Expose
    private Boolean isSubscribe;
    @SerializedName("description")
    @Expose
    private String description;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Object getSectionId() {
        return sectionId;
    }

    public void setSectionId(Object sectionId) {
        this.sectionId = sectionId;
    }

    public Object getFragment() {
        return fragment;
    }

    public void setFragment(Object fragment) {
        this.fragment = fragment;
    }

    public Boolean getIsSubscribe() {
        return isSubscribe;
    }

    public void setIsSubscribe(Boolean isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
