package com.example.travelapplication.Interfaces;

//package com.example;

import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class ExampleHotel {

    @SerializedName("autoSuggestInstance")
    @Expose
    private Object autoSuggestInstance;
    @SerializedName("misspellingfallback")
    @Expose
    private Boolean misspellingfallback;
    @SerializedName("moresuggestions")
    @Expose
    private Integer moresuggestions;
    @SerializedName("suggestions")
    @Expose
    private List<SuggestionHotel> suggestionHotels;
    @SerializedName("term")
    @Expose
    private String term;
    @SerializedName("trackingID")
    @Expose
    private String trackingID;

    public Object getAutoSuggestInstance() {
        return autoSuggestInstance;
    }

    public void setAutoSuggestInstance(Object autoSuggestInstance) {
        this.autoSuggestInstance = autoSuggestInstance;
    }

    public Boolean getMisspellingfallback() {
        return misspellingfallback;
    }

    public void setMisspellingfallback(Boolean misspellingfallback) {
        this.misspellingfallback = misspellingfallback;
    }

    public Integer getMoresuggestions() {
        return moresuggestions;
    }

    public void setMoresuggestions(Integer moresuggestions) {
        this.moresuggestions = moresuggestions;
    }

    public List<SuggestionHotel> getSuggestions() {
        return suggestionHotels;
    }

    public void setSuggestions(List<SuggestionHotel> suggestionHotels) {
        this.suggestionHotels = suggestionHotels;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getTrackingID() {
        return trackingID;
    }

    public void setTrackingID(String trackingID) {
        this.trackingID = trackingID;
    }

}