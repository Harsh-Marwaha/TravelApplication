package com.example.travelapplication.Interfaces;


//package com.example;

import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class SuggestionHotel {

    @SerializedName("entities")
    @Expose
    private List<EntityHotel> entities;
    @SerializedName("group")
    @Expose
    private String group;

    public List<EntityHotel> getEntities() {
        return entities;
    }

    public void setEntities(List<EntityHotel> entities) {
        this.entities = entities;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

}