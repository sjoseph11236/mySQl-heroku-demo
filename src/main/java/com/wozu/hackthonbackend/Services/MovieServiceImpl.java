package com.wozu.hackthonbackend.Services;

import com.wozu.hackthonbackend.Models.Movie;
import com.wozu.hackthonbackend.Repositories.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieServiceImpl  implements MovieService{
    @Autowired
    MovieRepo movieRepo;

    @Value("${api_key}")
    private String api_key;

    @Override
    public Movie getMovieFromMovieApi(String search) {
        String url = "http://omdbapi.com/?apikey=" + api_key + "&t=" + search + "&plot=full";
        RestTemplate restTemplate = new RestTemplate();
        return  restTemplate.getForObject(url, Movie.class);
    }

    @Override
    public void postMovie(Movie movie) {
        movieRepo.save(movie);
    }
}
