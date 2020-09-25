package com.example.sparklive.models.reponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("score")
    @Expose
    private Double score;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("category")
    @Expose
    private List<String> category = null;
    @SerializedName("video")
    @Expose
    private Video video;
    @SerializedName("slug")
    @Expose
    private Object slug;
    @SerializedName("is_like")
    @Expose
    private Object isLike;
    @SerializedName("publisher")
    @Expose
    private Publisher publisher;
    @SerializedName("item_type")
    @Expose
    private Integer itemType;
    @SerializedName("published_at")
    @Expose
    private String publishedAt;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("post_type")
    @Expose
    private Object postType;
    @SerializedName("action_counts")
    @Expose
    private ActionCounts actionCounts;
    @SerializedName("product_url")
    @Expose
    private String productUrl;
    @SerializedName("expert")
    @Expose
    private Expert expert;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Object getSlug() {
        return slug;
    }

    public void setSlug(Object slug) {
        this.slug = slug;
    }

    public Object getIsLike() {
        return isLike;
    }

    public void setIsLike(Object isLike) {
        this.isLike = isLike;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Integer getItemType() {
        return itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Object getPostType() {
        return postType;
    }

    public void setPostType(Object postType) {
        this.postType = postType;
    }

    public ActionCounts getActionCounts() {
        return actionCounts;
    }

    public void setActionCounts(ActionCounts actionCounts) {
        this.actionCounts = actionCounts;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public Expert getExpert() {
        return expert;
    }

    public void setExpert(Expert expert) {
        this.expert = expert;
    }
}
