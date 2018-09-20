package com.twu.biblioteca.tools;

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
}
