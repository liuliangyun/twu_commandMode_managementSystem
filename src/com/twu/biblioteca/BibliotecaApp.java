package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.printWelcomeInfo();

    }

    public void printWelcomeInfo() {
        String welcomeInfo = "Welcome to The Bangalore Public Library!\n";
        System.out.print(welcomeInfo);
    }
}
