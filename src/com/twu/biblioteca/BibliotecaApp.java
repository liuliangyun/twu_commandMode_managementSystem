package com.twu.biblioteca;

import com.twu.biblioteca.command.CheckoutCommand;
import com.twu.biblioteca.command.Command;
import com.twu.biblioteca.command.ListCommand;
import com.twu.biblioteca.command.ReturnbackCommand;
import com.twu.biblioteca.command.StopCommand;
import com.twu.biblioteca.command.WarnCommand;
import com.twu.biblioteca.controller.BookController;
import com.twu.biblioteca.controller.MovieController;
import com.twu.biblioteca.controller.UserController;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.receiver.ManagementSystem;
import com.twu.biblioteca.requester.Keypad;
import com.twu.biblioteca.tools.Printer;

import java.util.Scanner;

public class BibliotecaApp {

    private BookController bookController = new BookController();
    private MovieController movieController = new MovieController();
    private UserController userController = new UserController();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.run();
    }

    private void run() {
        //创建接收者对象
        ManagementSystem managementSystem = new ManagementSystem();

        //创建具体的命令对象
        Command listCommand = new ListCommand(managementSystem);
        Command checkoutCommand = new CheckoutCommand(managementSystem);
        Command returnbackCommand = new ReturnbackCommand(managementSystem);
        Command stopCommand = new StopCommand(managementSystem);
        Command warnCommand = new WarnCommand(managementSystem);

        //创建请求者对象
        Keypad keypad = new Keypad();
        keypad.setListCommand(listCommand);
        keypad.setCheckoutCommand(checkoutCommand);
        keypad.setReturnbackCommand(returnbackCommand);
        keypad.setStopCommand(stopCommand);
        keypad.setWarnCommand(warnCommand);

        //测试
        Printer printer = new Printer();
        while (true) {
            printer.printWelcomeInfo();
            printer.printMainMenu();
            String input = scanner.nextLine();
            if (input.equals("0")) {
                keypad.stop();
                break;
            } else if (input.equals("1")) {
                keypad.list();
            } else if (input.equals("2")) {
                keypad.checkout(getInput());
            } else if (input.equals("3")) {
                keypad.returnback(getInput());
            } else {
                keypad.warn();
            }
        }
    }

    private Long getInput() {
        System.out.print("Please enter the id.\n");
        return Long.parseLong(scanner.nextLine());
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
