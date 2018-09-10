package com.twu.biblioteca;

import com.twu.biblioteca.controller.BookController;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.tools.DataSet;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    private BookController bookController = new BookController();

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.run();
    }

    private void run() {
        while (true) {
            printWelcomeInfo();
            displayMainMenu();
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            else if (input.equals("1")) {
                listAllBooks();
            }
            else {
                System.out.println("Select a valid option!");
            }
        }
    }

    public void printWelcomeInfo() {
        String welcomeInfo = "------------------------------------------\n" +
                "Welcome to The Bangalore Public Library!\n";
        System.out.print(welcomeInfo);
    }

    public void listAllBooks() {
        DataSet dataSet = new DataSet();
        ArrayList<Book> bookList = dataSet.setBookList();
        bookController.listAllBooks(bookList);
    }

    public void displayMainMenu() {
        String menu = "------------------------------------------\n" +
                "       Main Menu       \n" +
                "List Books, please press 1.\n" +
                "Exit System, please press 0.\n";
        System.out.print(menu);
    }
}
