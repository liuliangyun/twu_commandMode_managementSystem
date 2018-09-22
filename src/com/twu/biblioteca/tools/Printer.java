package com.twu.biblioteca.tools;

import com.twu.biblioteca.model.Book;

import java.util.ArrayList;

public class Printer {
    public void printWelcomeInfo() {
        System.out.print(Constants.SPLIT_LINE);
        System.out.print(Constants.WELCOME_INFO);
    }

    public void printMainMenu() {
        System.out.print(Constants.SPLIT_LINE);
        System.out.print(Constants.MENU_TITLE);
        System.out.print(Constants.LIST_BOOK_OPTION);
        System.out.print(Constants.CHECKOUT_BOOK_OPTION);
        System.out.print(Constants.RETURN_BOOK_OPTION);
//        System.out.print(Constants.LIST_MOVIE_OPTION);
//        System.out.print(Constants.CHECKOUT_MOVIE_OPTION);
//        System.out.print(Constants.USER_INFO_OPTION);
        System.out.print(Constants.QUIT_OPTION);
    }

    public void printExitInfo() {
        System.out.print(Constants.SPLIT_LINE);
        System.out.print(Constants.EXIT_INFO);
    }

    public void printBookList(ArrayList<Book> bookList) {
        System.out.print(Constants.SPLIT_LINE);
        System.out.print(Constants.BOOKLIST_TITLE);
        for (Book book : bookList) {
            if (!book.isCheckOut()) {
                System.out.print(book.getId() + ". "
                        + book.getName() + ", "
                        + book.getProducerName() + ", "
                        + book.getYear() + ".\n");
            }
        }
    }

    public void printCheckoutInfo(boolean isSuccess) {
        System.out.print(Constants.SPLIT_LINE);
        if (isSuccess) {
            System.out.print(Constants.CHECKOUT_BOOK_SUCCESSFUL);
        } else {
            System.out.print(Constants.CHECKOUT_BOOK_UNSUCCESSFUL);
        }
    }

    public void printReturnbackInfo(boolean isSuccess) {
        System.out.print(Constants.SPLIT_LINE);
        if (isSuccess) {
            System.out.print(Constants.RETURN_BOOK_SUCCESSFUL);
        } else {
            System.out.print(Constants.RETURN_BOOK_UNSUCCESSFUL);
        }
    }

    public void printWarnInfo() {
        System.out.print(Constants.SPLIT_LINE);
        System.out.print(Constants.WARN_INFO);
    }
}
