package com.twu.biblioteca.service;

import com.twu.biblioteca.tools.Constants;

public class PageService {

    public void displayWelcomeInfo() {
        System.out.print(Constants.SPLIT_LINE);
        System.out.print(Constants.WELCOME_INFO);
    }

    public void displayMainMenu() {
        System.out.print(Constants.SPLIT_LINE);
        System.out.print(Constants.MENU_TITLE);
        System.out.print(Constants.LIST_BOOK_OPTION);
        System.out.print(Constants.CHECKOUT_BOOK_OPTION);
        System.out.print(Constants.RETURN_BOOK_OPTION);
        System.out.print(Constants.LIST_MOVIE_OPTION);
        System.out.print(Constants.QUIT_OPTION);
    }

}
