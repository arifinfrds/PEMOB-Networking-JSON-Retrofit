package com.example.arifinfrds.retrofit.DataService;

import com.example.arifinfrds.retrofit.Model.User;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DataService {

    @GET("/users/1")
    Call<User> getUserWithId1();

}
