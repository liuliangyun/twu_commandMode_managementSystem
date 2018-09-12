package com.twu.biblioteca.model;

public class Movie extends Data {

    private double rate;

    public Movie(Long movieId, String movieName, String directorName, String publishedYear, double rate) {
        super(movieId, movieName, directorName, publishedYear);
        this.rate = rate;
    }

    public Movie(Long movieId, String movieName, String directorName, String publishedYear) {
        super(movieId, movieName, directorName, publishedYear);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

}
