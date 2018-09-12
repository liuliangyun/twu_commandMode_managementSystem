package com.twu.biblioteca.tools;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;

import java.util.ArrayList;

public class DataSet {

    public ArrayList<Book> setBookList() {
        ArrayList<Book> bookList = new ArrayList<Book>();
        Book book_Java = new Book(
                1L,
                "深入浅出 Java",
                "Kathy Sierra",
                "2005");
        Book book_JavaScript = new Book(
                2L,
                "JavaScript 权威指南",
                "David Flanagan",
                "2012");
        bookList.add(book_Java);
        bookList.add(book_JavaScript);
        return bookList;
    }

    public ArrayList<Movie> setMovieList() {
        ArrayList<Movie> movieList = new ArrayList<Movie>();
        Movie movie_Schindler = new Movie(
                1L,
                "辛德勒的名单",
                "史蒂文·斯皮尔伯格",
                "1993",
                9.4);
        Movie movie_Godfather = new Movie(
                2L,
                "教父",
                "弗朗西斯·福特·科波拉",
                "1972",
                9.2);
        movieList.add(movie_Schindler);
        movieList.add(movie_Godfather);
        return movieList;
    }

}
