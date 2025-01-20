package com.example.movies.controller;

import com.example.movies.model.Movie;
import com.example.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movies/searchMovies")
    public List<Movie> searchMovies(@RequestParam String query) {
        return movieService.searchMovies(query);
    }
    
    @GetMapping("/movies/getMovieDetails/{movieId}")
    public Movie getMovieDetails(@PathVariable Long movieId) {
        return movieService.getMovieDetails(movieId);
    }

}
