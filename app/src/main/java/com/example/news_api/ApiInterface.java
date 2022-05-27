package com.example.news_api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface  {

    String Base_url = "https://newsapi.org/v2/";

    @GET("top-headlines")
    Call<main_news> getnews(
            @Query("sources") String sources,
            @Query("pageSize") int pagesize,
            @Query("apikey") String apikey
    );

}
