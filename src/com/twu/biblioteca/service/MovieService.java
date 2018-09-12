package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.tools.Constants;

import java.util.ArrayList;

public class MovieService {

    public void listAllMovies(ArrayList<Movie> movieList) {
        System.out.print(Constants.SPLIT_LINE);
        System.out.print(Constants.MOVIELIST_TITLE);
        for (Movie movie : movieList) {
            if (!movie.isCheckout()) {
                System.out.print(movie.getMovieId() + ". "
                        + movie.getMovieName() + ", "
                        + movie.getDirectorName() + ", "
                        + movie.getPublishedYear() + ", "
                        + movie.getRate() + ".\n");
            }
        }
    }

}
