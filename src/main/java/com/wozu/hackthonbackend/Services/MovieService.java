package com.wozu.hackthonbackend.Services;

import com.wozu.hackthonbackend.Models.Movie;



public interface MovieService {
    public Movie getMovieFromMovieApi(String search);
    public void postMovie(Movie movie);
}
