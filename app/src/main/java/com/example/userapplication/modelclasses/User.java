package com.example.userapplication.modelclasses;

import com.google.gson.annotations.SerializedName;

public class User {
    private String name;
    private Integer age;
    private String job;
    @SerializedName("incomeUSD")
    private Integer incomeUsd;
    private Integer creditScore;
    private Boolean married;
    private Boolean hasChildren;
    @SerializedName("height")
    private Integer heightInCentiMeters;
    @SerializedName("weight")
    private Float weightInKgs;
    private String eyeColor;
    private String email;
    private String gender;
    private Boolean hasDegree;
    private String bloodType;
    private String username;
    private Float politicalLeaning;
    private String religion;
    private Address address;
    @SerializedName("doB")
    private String dateOfBirth;
    private Float gpa;
}
