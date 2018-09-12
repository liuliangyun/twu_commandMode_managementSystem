package com.twu.biblioteca;

import com.twu.biblioteca.controller.BookController;
import com.twu.biblioteca.controller.MovieController;
import com.twu.biblioteca.controller.PageController;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.tools.DataSet;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    private DataSet dataSet = new DataSet();
    private ArrayList<Book> bookList = dataSet.setBookList();
    private ArrayList<Movie> movieList = dataSet.setMovieList();
    private BookController bookController = new BookController();
    private PageController pageController = new PageController();
    private MovieController movieController = new MovieController();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.run();
    }

    private void run() {
        while (true) {
            displayWelcomeInfo();
            displayMainMenu();
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            } else if (input.equals("1")) {
                listAllBooks();
            } else if (input.equals("2")) {
                checkoutBook();
            } else if (input.equals("3")) {
                returnBook();
            } else if (input.equals(("4"))) {
                listAllMovies();
            } else if (input.equals(("5"))) {
                checkoutMovie();
            } else {
                notifyInvalidOption();
            }
        }
    }

    private void notifyInvalidOption() {
        System.out.println("Select a valid option!");
    }

    private void displayWelcomeInfo() {
        pageController.displayWelcomeInfo();
    }

    private void displayMainMenu() {
        pageController.displayMainMenu();
    }

    private void listAllBooks() {
        bookController.listAllBooks(bookList);
    }

    private void checkoutBook() {
        Long bookId = getInputId();
        bookController.checkoutBook(bookId, bookList);
    }


    private void returnBook() {
        Long bookId = getInputId();
        bookController.returnBook(bookId, bookList);
    }

    private Long getInputId() {
        System.out.print("Please enter the id.\n");
        return Long.parseLong(scanner.nextLine());
    }

    private void listAllMovies() {
        movieController.listAllMovies(movieList);
    }

    private void checkoutMovie() {
        Long movieId = getInputId();
        movieController.checkoutMovie(movieId, movieList);
    }

}
