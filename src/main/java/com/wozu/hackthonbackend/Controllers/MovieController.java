package com.wozu.hackthonbackend.Controllers;

import com.wozu.hackthonbackend.Models.Movie;
import com.wozu.hackthonbackend.Models.Rating;
import com.wozu.hackthonbackend.Services.MovieServiceImpl;
import com.wozu.hackthonbackend.Services.RatingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MovieController {

    @Autowired
    MovieServiceImpl movieServiceImpl;

//    @Autowired
//    RatingServiceImpl ratingServiceImpl;


    @PostMapping("/movie/{search}")
    public String postMovie(@PathVariable String search) {

        Movie movie =  movieServiceImpl.getMovieFromMovieApi(search);

        movieServiceImpl.postMovie(movie);

//        for(Rating rating: movie.getRatings()) {
//            rating.setMovie(movie);
//            ratingServiceImpl.postRating(rating);
//        }

        return "created new Movie ";
    }


}
