package com.twu.biblioteca.model;

public class Movie {

    private Long movieId;
    private String movieName;
    private String directorName;
    private String publishedYear;
    private double rate;
    private boolean isCheckout;

    public Movie(Long movieId, String movieName, String directorName, String publishedYear, double rate) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.directorName = directorName;
        this.publishedYear = publishedYear;
        this.rate = rate;
        this.isCheckout = false;
    }

    public Movie(Long movieId, String movieName, String directorName, String publishedYear) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.directorName = directorName;
        this.publishedYear = publishedYear;
        this.isCheckout = false;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public boolean isCheckout() {
        return isCheckout;
    }

    public void setCheckout(boolean checkout) {
        isCheckout = checkout;
    }

}
