
package com.example.moviesapp.Domain;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class    ListFav {

    List<FilmItems> moviesFav;

    public List<FilmItems> getMoviesFav() {
        return moviesFav;
    }

    public void setMoviesFav(List<FilmItems> moviesFav) {
        this.moviesFav = moviesFav;
    }
}
