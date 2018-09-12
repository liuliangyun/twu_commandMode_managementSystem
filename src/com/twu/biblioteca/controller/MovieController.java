package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.service.MovieService;

import java.util.ArrayList;

public class MovieController {

    private MovieService movieService = new MovieService();

    public void listAllMovies(ArrayList<Movie> movieList) {
        movieService.listAllMovies(movieList);
    }

    public void checkoutMovie(Long movieId, ArrayList<Movie> movieList) {
        movieService.checkoutMovie(movieId, movieList);
    }
}
