package com.example.userapplication.userGeneratorNetwork;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserGeneratorApi {

    public UserGeneratorService createGeneratorService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://peoplegeneratorapi.live/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        UserGeneratorService userGeneratorService = retrofit.create(UserGeneratorService.class);
        return userGeneratorService;
    }
}
