package com.example.sparklive.models.reponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ActionCounts {
    @SerializedName("like")
    @Expose
    private Integer like;
    @SerializedName("click")
    @Expose
    private Integer click;
    @SerializedName("share")
    @Expose
    private Integer share;
    @SerializedName("web_click")
    @Expose
    private Integer webClick;

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public Integer getShare() {
        return share;
    }

    public void setShare(Integer share) {
        this.share = share;
    }

    public Integer getWebClick() {
        return webClick;
    }

    public void setWebClick(Integer webClick) {
        this.webClick = webClick;
    }
}
