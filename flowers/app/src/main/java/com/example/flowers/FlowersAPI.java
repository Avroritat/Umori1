package com.example.flowers;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

interface FlowersAPI {
    @GET("/movies")
    Call<List<Flower>> getData();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://cinema.areas.su/up/video/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}