package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.tools.Constants;

import java.util.ArrayList;

public class MovieService {

    public void listAllMovies(ArrayList<Movie> movieList) {
        System.out.print(Constants.SPLIT_LINE);
        System.out.print(Constants.MOVIELIST_TITLE);
        for (Movie movie : movieList) {
            if (!movie.isCheckOut()) {
                System.out.print(movie.getId() + ". "
                        + movie.getName() + ", "
                        + movie.getProducerName() + ", "
                        + movie.getYear() + ", "
                        + movie.getRate() + ".\n");
            }
        }
    }

    public void checkoutMovie(Long movieId, ArrayList<Movie> movieList) {
        Movie movie = findMovieById(movieId, movieList);
        if (movie != null && !movie.isCheckOut()) {
            movie.setCheckOut(true);
            System.out.print(Constants.CHECKOUT_MOVIE_SUCCESSFUL);
        } else {
            System.out.print(Constants.CHECKOUT_MOVIE_UNSUCCESSFUL);
        }
    }

    private Movie findMovieById(Long movieId, ArrayList<Movie> movieList) {
        for (Movie movie : movieList) {
            if (movie.getId() == movieId) {
                return movie;
            }
        }
        return null;
    }

}
