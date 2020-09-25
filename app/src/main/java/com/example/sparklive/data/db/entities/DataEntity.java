package com.example.sparklive.data.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "data_table")
public class DataEntity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "title")
    private String TITLE;

    @ColumnInfo(name = "exp_image")
    private String EXP_IMAGE;

    @ColumnInfo(name = "exp_name")
    private String EXP_NAME;

    @ColumnInfo(name = "exp_short_description")
    private String EXP_SHORT_DESCRIPTION;

    @ColumnInfo(name = "thumbnail")
    private String THUMBNAIL;

    @ColumnInfo(name = "clicks")
    private String CLICKS;

    @ColumnInfo(name = "likes")
    private String LIKES;

    @ColumnInfo(name = "is_liked")
    private boolean IS_LIKED;

    @ColumnInfo(name = "thumb_description")
    private String THUMB_DESCRIPTION;

    @ColumnInfo(name = "time_uploaded")
    private String TIME_UPLOADED;

    public DataEntity(String TITLE, String EXP_IMAGE, String EXP_NAME, String EXP_SHORT_DESCRIPTION, String THUMBNAIL, String CLICKS, String LIKES, boolean IS_LIKED, String THUMB_DESCRIPTION, String TIME_UPLOADED) {
        this.TITLE = TITLE;
        this.EXP_IMAGE = EXP_IMAGE;
        this.EXP_NAME = EXP_NAME;
        this.EXP_SHORT_DESCRIPTION = EXP_SHORT_DESCRIPTION;
        this.THUMBNAIL = THUMBNAIL;
        this.CLICKS = CLICKS;
        this.LIKES = LIKES;
        this.IS_LIKED = IS_LIKED;
        this.THUMB_DESCRIPTION = THUMB_DESCRIPTION;
        this.TIME_UPLOADED = TIME_UPLOADED;
    }

    public DataEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getEXP_IMAGE() {
        return EXP_IMAGE;
    }

    public void setEXP_IMAGE(String EXP_IMAGE) {
        this.EXP_IMAGE = EXP_IMAGE;
    }

    public String getEXP_NAME() {
        return EXP_NAME;
    }

    public void setEXP_NAME(String EXP_NAME) {
        this.EXP_NAME = EXP_NAME;
    }

    public String getEXP_SHORT_DESCRIPTION() {
        return EXP_SHORT_DESCRIPTION;
    }

    public void setEXP_SHORT_DESCRIPTION(String EXP_SHORT_DESCRIPTION) {
        this.EXP_SHORT_DESCRIPTION = EXP_SHORT_DESCRIPTION;
    }

    public String getTHUMBNAIL() {
        return THUMBNAIL;
    }

    public void setTHUMBNAIL(String THUMBNAIL) {
        this.THUMBNAIL = THUMBNAIL;
    }

    public String getCLICKS() {
        return CLICKS;
    }

    public void setCLICKS(String CLICKS) {
        this.CLICKS = CLICKS;
    }

    public String getLIKES() {
        return LIKES;
    }

    public void setLIKES(String LIKES) {
        this.LIKES = LIKES;
    }

    public boolean isIS_LIKED() {
        return IS_LIKED;
    }

    public void setIS_LIKED(boolean IS_LIKED) {
        this.IS_LIKED = IS_LIKED;
    }

    public String getTHUMB_DESCRIPTION() {
        return THUMB_DESCRIPTION;
    }

    public void setTHUMB_DESCRIPTION(String THUMB_DESCRIPTION) {
        this.THUMB_DESCRIPTION = THUMB_DESCRIPTION;
    }

    public String getTIME_UPLOADED() {
        return TIME_UPLOADED;
    }

    public void setTIME_UPLOADED(String TIME_UPLOADED) {
        this.TIME_UPLOADED = TIME_UPLOADED;
    }
}
