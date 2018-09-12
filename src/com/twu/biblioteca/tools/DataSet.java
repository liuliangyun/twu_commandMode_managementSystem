package com.twu.biblioteca.tools;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.User;

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
                "1972");
        movieList.add(movie_Schindler);
        movieList.add(movie_Godfather);
        return movieList;
    }

    public ArrayList<User> setUserList() {
        ArrayList<User> userList = new ArrayList<User>();
        User user_Zhangsan = new User(
                "Zhangsan",
                "zhangsan@qq.com",
                "024-1111111",
                "024-1111",
                "1111111");
        User user_Lisi = new User(
                "Lisi",
                "lisi@qq.com",
                "024-2222222",
                "024-2222",
                "2222222");
        userList.add(user_Zhangsan);
        userList.add(user_Lisi);
        return userList;
    }

}
