package com.example.moviesapp.Activities;

import android.content.Intent;
import android.graphics.Movie;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.moviesapp.R;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.moviesapp.Adapter.CategoryListAdapter;
import com.example.moviesapp.Adapter.FilmListAdapter;
import com.example.moviesapp.Adapter.SliderAdapter;
import com.example.moviesapp.Domain.Genre;
import com.example.moviesapp.Domain.GenreItem;
import com.example.moviesapp.Domain.ListFilm;
import com.example.moviesapp.Domain.SliderItem;
import com.example.moviesapp.R;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.example.moviesapp.Adapter.ListFavAdapter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Fav_List_Activity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav_list);
        idFilm=getIntent().getIntExtra("id", 0);
        initView();
        sendRequest();
    }
    private void initView() {
    }
    private void sendRequest() {
    }
}