
package com.example.moviesapp.Domain;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class    ListGenre {

    List<FilmItems> moviesGenre;

    public List<FilmItems> getMoviesGenre() {
        return moviesGenre;
    }

    public void setMoviesFav(List<FilmItems> moviesGenre) {
        this.moviesGenre = moviesGenre;
    }
}

