package com.example.sparklive.models.reponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Expert {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("slug")
    @Expose
    private Object slug;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("profile_pic")
    @Expose
    private String profilePic;
    @SerializedName("banner")
    @Expose
    private String banner;
    @SerializedName("is_profile_pic_set")
    @Expose
    private Boolean isProfilePicSet;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("is_expert")
    @Expose
    private Boolean isExpert;
    @SerializedName("is_expert_live")
    @Expose
    private Boolean isExpertLive;
    @SerializedName("is_tick_verified")
    @Expose
    private Boolean isTickVerified;
    @SerializedName("expert_verification_state")
    @Expose
    private Integer expertVerificationState;
    @SerializedName("short_bio")
    @Expose
    private String shortBio;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("location")
    @Expose
    private Object location;
    @SerializedName("city")
    @Expose
    private Object city;
    @SerializedName("gender")
    @Expose
    private Object gender;
    @SerializedName("expert_categories")
    @Expose
    private List<ExpertCategory> expertCategories = null;
    @SerializedName("expert_misc")
    @Expose
    private ExpertMisc expertMisc;
    @SerializedName("intro_video_url")
    @Expose
    private Object introVideoUrl;
    @SerializedName("payment_url")
    @Expose
    private Object paymentUrl;
    @SerializedName("known_languages")
    @Expose
    private List<String> knownLanguages = null;
    @SerializedName("country_code")
    @Expose
    private String countryCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Object getSlug() {
        return slug;
    }

    public void setSlug(Object slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public Boolean getIsProfilePicSet() {
        return isProfilePicSet;
    }

    public void setIsProfilePicSet(Boolean isProfilePicSet) {
        this.isProfilePicSet = isProfilePicSet;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getIsExpert() {
        return isExpert;
    }

    public void setIsExpert(Boolean isExpert) {
        this.isExpert = isExpert;
    }

    public Boolean getIsExpertLive() {
        return isExpertLive;
    }

    public void setIsExpertLive(Boolean isExpertLive) {
        this.isExpertLive = isExpertLive;
    }

    public Boolean getIsTickVerified() {
        return isTickVerified;
    }

    public void setIsTickVerified(Boolean isTickVerified) {
        this.isTickVerified = isTickVerified;
    }

    public Integer getExpertVerificationState() {
        return expertVerificationState;
    }

    public void setExpertVerificationState(Integer expertVerificationState) {
        this.expertVerificationState = expertVerificationState;
    }

    public String getShortBio() {
        return shortBio;
    }

    public void setShortBio(String shortBio) {
        this.shortBio = shortBio;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public Object getCity() {
        return city;
    }

    public void setCity(Object city) {
        this.city = city;
    }

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public List<ExpertCategory> getExpertCategories() {
        return expertCategories;
    }

    public void setExpertCategories(List<ExpertCategory> expertCategories) {
        this.expertCategories = expertCategories;
    }

    public ExpertMisc getExpertMisc() {
        return expertMisc;
    }

    public void setExpertMisc(ExpertMisc expertMisc) {
        this.expertMisc = expertMisc;
    }

    public Object getIntroVideoUrl() {
        return introVideoUrl;
    }

    public void setIntroVideoUrl(Object introVideoUrl) {
        this.introVideoUrl = introVideoUrl;
    }

    public Object getPaymentUrl() {
        return paymentUrl;
    }

    public void setPaymentUrl(Object paymentUrl) {
        this.paymentUrl = paymentUrl;
    }

    public List<String> getKnownLanguages() {
        return knownLanguages;
    }

    public void setKnownLanguages(List<String> knownLanguages) {
        this.knownLanguages = knownLanguages;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

}
