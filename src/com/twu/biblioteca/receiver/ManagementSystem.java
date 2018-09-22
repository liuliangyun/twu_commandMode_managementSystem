package com.twu.biblioteca.receiver;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.service.BookService;
import com.twu.biblioteca.tools.Printer;

import java.util.ArrayList;

//图书管理系统为接收者
public class ManagementSystem {
    private Printer printer = new Printer();
    private BookService bookService = new BookService();

    public void start() {
        printer.printWelcomeInfo();
        printer.printMainMenu();
    }

    public void exit() {
        printer.printExitInfo();
    }

    public void list() {
        ArrayList<Book> bookList = bookService.getBookList();
        printer.printBookList(bookList);
    }

    public void checkout(Long id) {
        boolean isSuccess = bookService.checkoutBook(id);
        printer.printCheckoutInfo(isSuccess);
    }

    public void returnback(Long id) {
        boolean isSuccess = bookService.returnbackBook(id);
        printer.printReturnbackInfo(isSuccess);
    }

    public void warn() {
        printer.printWarnInfo();
    }
}
