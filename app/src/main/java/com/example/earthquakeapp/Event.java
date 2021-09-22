package com.example.earthquakeapp;

public class Event {

    private String place;
    private double magnitude;
    private Long date;
    private String mUrl;

    public Event(double magnitude, String place, Long date, String url) {

        this.date = date;
        this.place = place;
        this.magnitude = magnitude;
        this.mUrl = url;
    }

    public Long setdate() {
        return date;
    }

    public String setplace() {
        return place;
    }

    public double magnitude() {
        return magnitude;
    }

    public String getUrl() {
        return mUrl;
    }


}
