package com.example.moviesapp.Adapter;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


import com.example.moviesapp.R;

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
import com.example.moviesapp.Domain.ListFilm;
import com.example.moviesapp.Domain.ListFav;
import com.example.moviesapp.R;


public class ListFavAdapter extends RecyclerView.Adapter<ListFavAdapter.viewHolder> {
    ListFav items;
    Context context;
    @NonNull
    @Override
    public ListFavAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_fav, parent, false);
        return new viewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ListFavAdapter.viewHolder holder, int position) {
        holder.titleFav.setText(items.getMoviesFav().get(position).getTitle());
        RequestOptions requestOptions=new RequestOptions();
        Glide.with(context)
                .load(items.getMoviesFav().get(position).getPosterPath())
                .apply(requestOptions)
                .into(holder.picFav);
    }

    @Override
    public int getItemCount() {
        return items.getMoviesFav().size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView picFav;
        TextView titleFav;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            picFav=itemView.findViewById(R.id.picFav);
            titleFav=itemView.findViewById(R.id.titleFav);
        }
    }
}