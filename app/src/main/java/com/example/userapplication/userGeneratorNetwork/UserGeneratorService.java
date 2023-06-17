package com.example.userapplication.userGeneratorNetwork;

import com.example.userapplication.modelclasses.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserGeneratorService {

    @GET("person/10")
    Call<List<User>> getUsers();
}
