package com.example.judejoseph.bootcamplocator.model;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

/**
 * Created by judejoseph on 6/1/17.
 *
 * For each marker on map that will have :
 *      Title
 *      Image
 *      Location
 *
 */

public class Trails {

    private String trailTitle;
    private String trailLocation;
    private String trailImageURL;
    private String zipCode;
    private ArrayList<LatLng> trailCoordinates;
    final String DRAWABLE = "@drawable/";

    public ArrayList<LatLng> getTrailCoordinates(){
        return trailCoordinates;
    }

    public String getZipCode(){
        return zipCode;
    }

    public String getStringURL(){
        return DRAWABLE + trailImageURL;
    }

    public String getTrailTitle() {
        return trailTitle;
    }

    public String getTrailLocation() {
        return trailLocation;
    }

    public String getTrailImageURL() {
        return trailImageURL;
    }

    public Trails(ArrayList<LatLng> trailCoordinates, String trailTitle, String trailLocation, String trailImageURL, String zipCode) {
        this.trailCoordinates = trailCoordinates;
        this.trailTitle = trailTitle;
        this.trailLocation = trailLocation;
        this.trailImageURL = trailImageURL;
        this.zipCode = zipCode;
    }

}
