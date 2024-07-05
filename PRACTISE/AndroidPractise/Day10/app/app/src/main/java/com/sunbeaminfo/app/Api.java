package com.sunbeaminfo.app;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface Api {

    public static final String BASE_URL="http://192.168.224.121:8080"; // ip address of Wifi


    @POST("/users/login")
    public Call<JsonObject> loginUser(@Body User user);

    @POST("/users")
    public Call<JsonObject> registerUser(@Body User user);

    @GET("/users/{id}")
    public Call<JsonObject> getUserById(@Path("id") int id);

    @PUT("/users/{id}")
    public Call<JsonObject> updateUser(@Body User user,@Path("id")int id);

    @GET("/users")
    public Call<JsonObject> getAllUsers();
    @DELETE("/users/{id}")
    public Call<JsonObject> deleteUser(@Path("id") int id);

}
