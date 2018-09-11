package com.twu.biblioteca.controller;

import com.twu.biblioteca.service.PageService;

public class PageController {

    private PageService pageService = new PageService();

    public void displayWelcomeInfo() {
        pageService.displayWelcomeInfo();
    }

    public void displayMainMenu() {
        pageService.displayMainMenu();
    }

}
