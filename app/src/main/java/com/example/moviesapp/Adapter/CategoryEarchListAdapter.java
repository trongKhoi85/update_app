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
import com.example.moviesapp.Activities.Category_List_FilmActivity;
import com.example.moviesapp.Activities.DetailsActivity;
import com.example.moviesapp.Domain.GenreItem;
import com.example.moviesapp.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryEarchListAdapter extends RecyclerView.Adapter<CategoryEarchListAdapter.viewHolder> {
    List<String> items;
    Context context;

    public CategoryEarchListAdapter(List<String> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public CategoryEarchListAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_category,parent,false);
        return new viewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryEarchListAdapter.viewHolder holder, int position) {
        holder.titletxt.setText(items.get(position));
        holder.titletxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(holder.titletxt.getContext(), Category_List_FilmActivity.class);
                intent.putExtra("id",items.get(position).getId());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {return items.size();}

    public static class viewHolder extends RecyclerView.ViewHolder {

            TextView titletxt;

        public viewHolder(View itemView) {
                super(itemView);
                titletxt=itemView.findViewById(R.id.titleTxt);
            }
        }

    }

