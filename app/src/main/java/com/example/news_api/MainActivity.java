package com.example.news_api;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ArrayList<ModelClass> modelClassArrayList ;
    AdapterClass adapterClass ;
    String sources="bbc-news";
    String apikey="33537b352f024237ad4885a461d83081";
    RecyclerView recyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycl);
        modelClassArrayList = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapterClass = new AdapterClass(modelClassArrayList ,this);
        recyclerView.setAdapter(adapterClass);

        findnews();


    }

    private void findnews() {
        ApiUtilize.getApiInterface().getnews(sources,100,apikey).enqueue(new Callback<main_news>() {
            @Override
            public void onResponse(Call<main_news> call, Response<main_news> response) {
                if(response.isSuccessful()){
                    modelClassArrayList.addAll(response.body().getArticles());
                    adapterClass.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<main_news> call, Throwable t) {

            }
        });
    }
}