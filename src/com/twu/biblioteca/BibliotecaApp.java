package com.twu.biblioteca;

import com.twu.biblioteca.controller.BookController;
import com.twu.biblioteca.controller.MovieController;
import com.twu.biblioteca.controller.PageController;
import com.twu.biblioteca.controller.UserController;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.tools.DataSet;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    private DataSet dataSet = new DataSet();
    private ArrayList<Book> bookList = dataSet.setBookList();
    private ArrayList<Movie> movieList = dataSet.setMovieList();
    private ArrayList<User> userList = dataSet.setUserList();
    private BookController bookController = new BookController();
    private PageController pageController = new PageController();
    private MovieController movieController = new MovieController();
    private UserController userController = new UserController();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.run();
    }

    private void run() {
        User user = null;
        while (true) {
            displayWelcomeInfo();
            displayMainMenu();
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            } else if (input.equals("1")) {
                listAllBooks();
            } else if (input.equals("2")) {
                if (user != null) {
                    checkoutBook();
                } else {
                    user = logIn();
                }
            } else if (input.equals("3")) {
                if (user != null) {
                    returnBook();
                } else {
                    user = logIn();
                }
            } else if (input.equals("4")) {
                listAllMovies();
            } else if (input.equals(("5"))) {
                if (user != null) {
                    checkoutMovie();
                } else {
                    user = logIn();
                }
            } else if (input.equals("6")) {
                if (user != null) {
                    displayUserInfo(user);
                } else {
                    user = logIn();
                }
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

    private User logIn() {
        System.out.print("Please enter the library number.\n");
        String libraryNumber = scanner.nextLine();
        System.out.print("Please enter the password.\n");
        String password = scanner.nextLine();
        return userController.logIn(libraryNumber, password, userList);
    }

    private void displayUserInfo(User user) {
        System.out.print("name: " + user.getUserName()
                + ", email: " + user.getEmail()
                + ", phone: " + user.getPhone()
                + ".\n");
    }

}
