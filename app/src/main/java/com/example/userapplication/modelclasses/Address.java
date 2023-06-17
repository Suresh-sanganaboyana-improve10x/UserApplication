package com.example.userapplication.modelclasses;

import com.google.gson.annotations.SerializedName;

public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private String country;
    @SerializedName("zip")
    private String zipCode;
    @SerializedName("geonameId")
    private Integer geoNameId;
    private String phoneNumber;
    private String ipAddress;
    private String countryCode;
}
