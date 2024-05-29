package com.example.moviesapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.bumptech.glide.Glide;
import com.example.moviesapp.Adapter.ActorListAdapter;
import com.example.moviesapp.Adapter.CategoryEarchListAdapter;
import com.example.moviesapp.Adapter.CategoryListAdapter;
import com.example.moviesapp.Adapter.FilmListAdapter;
import com.example.moviesapp.Domain.FilmItems;
import com.example.moviesapp.Domain.GenreItem;
import com.example.moviesapp.Domain.ListFilm;
import com.example.moviesapp.R;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.text.BreakIterator;
import java.util.ArrayList;

public class Category_List_FilmActivity extends AppCompatActivity {
    private RequestQueue mrequestQueue;
    private StringRequest mstringRequest1;
    private View loading;
    private StringRequest mstringRequest;
    private FilmListAdapter adapterCategoryMovies;
    private AdapterView<Adapter> recyclerCategoryFilmAdapter;
    private Adapter adapterBestMovies;

    private void sendRequestCategoryMovies()
    {
        mrequestQueue=Volley.newRequestQueue(this);
        loading.setVisibility(View.VISIBLE);
        mstringRequest=new StringRequest(Request.Method.GET, "https://moviesapi.ir/api/v1/movies?page=1", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson=new Gson();
                loading.setVisibility(View.GONE);
                ListFilm items=gson.fromJson(response,ListFilm.class);
                adapterCategoryMovies=new FilmListAdapter(items);
                recyclerCategoryFilmAdapter.setAdapter(adapterBestMovies);
            }
        }, new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error) {
                loading.setVisibility(View.GONE);
                Log.i("Movies App", "ErrorResponse: "+ error.toString());
            }
        });
        mrequestQueue.add(mstringRequest);
    }
}

