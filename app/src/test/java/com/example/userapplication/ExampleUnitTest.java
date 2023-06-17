package com.example.userapplication;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.userapplication.modelclasses.User;
import com.example.userapplication.userGeneratorNetwork.UserGeneratorApi;
import com.example.userapplication.userGeneratorNetwork.UserGeneratorService;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getGeneratorUsers() throws IOException {
        UserGeneratorApi userGeneratorApi = new UserGeneratorApi();
        UserGeneratorService userGeneratorService = userGeneratorApi.createGeneratorService();
        Call<List<User>> call = userGeneratorService.getUsers();
        List<User> user = call.execute().body();
        assertNotNull(user);
        assertFalse(user.isEmpty());
        System.out.println(new Gson().toJson(user));
    }
}