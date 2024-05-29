package com.example.moviesapp.Adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.moviesapp.Activities.DetailsActivity;
import com.example.moviesapp.Domain.Genre;
import com.example.moviesapp.Domain.GenreItem;
import com.example.moviesapp.Domain.ListFilm;
import com.example.moviesapp.Domain.ListGenre;
import com.example.moviesapp.R;

import java.util.ArrayList;


public class CategoryFilmAdapter extends RecyclerView.Adapter<CategoryFilmAdapter.viewHolder> {

    ListGenre items;
    Context context;

    @NonNull
    @Override
    public CategoryFilmAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_category_film,parent,false);
        return new viewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryFilmAdapter.viewHolder holder, int position) {
        holder.titleGenre.setText(items.getMoviesGenre().get(position).getTitle());
        RequestOptions requestOptions=new RequestOptions();
        Glide.with(context)
                .load(items.getMoviesGenre().get(position).getPosterPath())
                .apply(requestOptions)
                .into(holder.picGenre);
    }

    @Override
    public int getItemCount() {
        return items.getMoviesGenre().size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {

        ImageView picGenre;

        TextView titleGenre;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}