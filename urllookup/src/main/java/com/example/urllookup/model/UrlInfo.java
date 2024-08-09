package com.example.urllookup.model;

import com.google.gson.annotations.SerializedName;

public class UrlInfo {
    @SerializedName("is_valid")
    private boolean isValid;
    private String country;
    @SerializedName("country_code")
    private String countryCode;
    @SerializedName("region_code")
    private String regionCode;
    private String region;
    private String city;
    private String zip;
    private double lat;
    private double lon;
    private String timezone;
    private String isp;
    private String url;

    // Getter methods
    public boolean isValid() {
        return isValid;
    }

    public String getCountry() {
        return country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getIsp() {
        return isp;
    }

    public String getUrl() {
        return url;
    }
}
