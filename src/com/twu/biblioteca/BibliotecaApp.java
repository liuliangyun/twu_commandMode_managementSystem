package com.twu.biblioteca;

import com.twu.biblioteca.controller.BookController;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.tools.DataSet;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    DataSet dataSet = new DataSet();
    ArrayList<Book> bookList = dataSet.setBookList();
    BookController bookController = new BookController();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.run();
    }

    private void run() {
        while (true) {
            printWelcomeInfo();
            displayMainMenu();
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            else if (input.equals("1")) {
                listAllBooks();
            }
            else if (input.equals("2")) {
                checkoutBook();
            }
            else if(input.equals("3")) {
                returnBook();
            }
            else {
                notifyInvalidOption();
            }
        }
    }


    public void notifyInvalidOption() {
        System.out.println("Select a valid option!");
    }

    public void printWelcomeInfo() {
        String welcomeInfo = "------------------------------------------\n" +
                "Welcome to The Bangalore Public Library!\n";
        System.out.print(welcomeInfo);
    }

    public void listAllBooks() {
        bookController.listAllBooks(bookList);
    }

    public void displayMainMenu() {
        String menu = "------------------------------------------\n" +
                "       Main Menu       \n" +
                "List Books, please press 1.\n" +
                "Checkout Book, please press 2.\n" +
                "Return Book, please press 3.\n" +
                "Quit System, please press 0.\n";
        System.out.print(menu);
    }

    public void checkoutBook() {
        System.out.print("Please enter the bookId.\n");
        Long bookId = Long.parseLong(scanner.nextLine());
        bookController.checkoutBook(bookId,bookList);
    }

    public void returnBook() {
        System.out.print("Please enter the bookId.\n");
        Long bookId = Long.parseLong(scanner.nextLine());
        bookController.returnBook(bookId,bookList);
    }
}
