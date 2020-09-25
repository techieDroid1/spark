package com.example.sparklive.models.reponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExpertMisc {

    @SerializedName("Years of Experience")
    @Expose
    private String yearsOfExperience;
    @SerializedName("Number of Lives Touched")
    @Expose
    private String numberOfLivesTouched;
    @SerializedName("City of Residence")
    @Expose
    private String cityOfResidence;

    public String getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getNumberOfLivesTouched() {
        return numberOfLivesTouched;
    }

    public void setNumberOfLivesTouched(String numberOfLivesTouched) {
        this.numberOfLivesTouched = numberOfLivesTouched;
    }

    public String getCityOfResidence() {
        return cityOfResidence;
    }

    public void setCityOfResidence(String cityOfResidence) {
        this.cityOfResidence = cityOfResidence;
    }
}
