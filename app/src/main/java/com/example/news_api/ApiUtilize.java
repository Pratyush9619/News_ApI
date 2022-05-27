package com.example.news_api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilize {

    public static Retrofit retrofit = null;

    public static ApiInterface getApiInterface() {

        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(ApiInterface.Base_url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return  retrofit.create(ApiInterface.class);


    }
}

