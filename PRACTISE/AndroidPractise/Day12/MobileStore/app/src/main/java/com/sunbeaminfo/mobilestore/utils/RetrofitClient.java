package com.sunbeaminfo.mobilestore.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {  // singleton class
    private static RetrofitClient retrofitClient;

    private Api api;
    private RetrofitClient()
    {
        api=new Retrofit.Builder()
                .baseUrl(Api.BASEURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Api.class);
    }
    public static RetrofitClient getInstance()
    {
        if(retrofitClient==null)
            retrofitClient= new RetrofitClient();
        return retrofitClient;
    }

    public Api getApi() {
        return api;
    }
}
