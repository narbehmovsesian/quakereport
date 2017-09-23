package com.example.android.quakereport;

import static com.example.android.quakereport.R.id.date;

/**
 * Created by narbeh on 9/20/17.
 */

public class Earthquake {
    private Double mMagnitude;
    private String mLocation;
    private String mUrl;
    private long mDate;

    public Earthquake(Double magnitude, String location, String url, long date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
        mUrl = url;
    }

    public Double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getDate() {
        return mDate;
    }

    public String getUrl(){
        return mUrl;
    }
}
