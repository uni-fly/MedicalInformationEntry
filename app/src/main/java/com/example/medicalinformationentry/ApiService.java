package com.example.medicalinformationentry;
import android.app.Activity;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    @POST("login")
    Call<LoginResponse> login(@Field("username") String username, @Field("password") String password);

    @GET("activities")
    Call<List<Activity>> getActivities();
}

