package com.twu.biblioteca;

import com.twu.biblioteca.controller.BookController;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.tools.DataSet;

import java.util.ArrayList;

public class BibliotecaApp {

    private BookController bookController = new BookController();

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.printWelcomeInfo();
        bibliotecaApp.listAllBooks();
    }

    public void listAllBooks() {
        DataSet dataSet = new DataSet();
        ArrayList<Book> bookList = dataSet.setBookList();
        bookController.listAllBooks(bookList);
    }

    public void printWelcomeInfo() {
        String welcomeInfo = "Welcome to The Bangalore Public Library!\n" +
                "------------------------------------------\n";
        System.out.print(welcomeInfo);
    }
}
