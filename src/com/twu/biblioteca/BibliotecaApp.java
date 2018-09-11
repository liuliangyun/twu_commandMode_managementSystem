package com.twu.biblioteca;

import com.twu.biblioteca.controller.BookController;
import com.twu.biblioteca.controller.PageController;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.tools.DataSet;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    private DataSet dataSet = new DataSet();
    private ArrayList<Book> bookList = dataSet.setBookList();
    private BookController bookController = new BookController();
    private PageController pageController = new PageController();
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

    public void displayMainMenu() {
        pageController.displayMainMenu();
    }

    private void listAllBooks() {
        bookController.listAllBooks(bookList);
    }

    private void checkoutBook() {
        Long bookId = getInputBookId();
        bookController.checkoutBook(bookId, bookList);
    }


    private void returnBook() {
        Long bookId = getInputBookId();
        bookController.returnBook(bookId, bookList);
    }

    private Long getInputBookId() {
        System.out.print("Please enter the bookId.\n");
        return Long.parseLong(scanner.nextLine());
    }

}
