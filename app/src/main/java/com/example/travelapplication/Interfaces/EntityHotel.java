package com.example.travelapplication.Interfaces;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class EntityHotel {

    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("destinationId")
    @Expose
    private String destinationId;
    @SerializedName("geoId")
    @Expose
    private String geoId;
    @SerializedName("landmarkCityDestinationId")
    @Expose
    private Object landmarkCityDestinationId;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("redirectPage")
    @Expose
    private String redirectPage;
    @SerializedName("type")
    @Expose
    private String type;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public String getGeoId() {
        return geoId;
    }

    public void setGeoId(String geoId) {
        this.geoId = geoId;
    }

    public Object getLandmarkCityDestinationId() {
        return landmarkCityDestinationId;
    }

    public void setLandmarkCityDestinationId(Object landmarkCityDestinationId) {
        this.landmarkCityDestinationId = landmarkCityDestinationId;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRedirectPage() {
        return redirectPage;
    }

    public void setRedirectPage(String redirectPage) {
        this.redirectPage = redirectPage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
