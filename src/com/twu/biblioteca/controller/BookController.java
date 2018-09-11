package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.service.BookService;

import java.util.ArrayList;

public class BookController {

    private BookService bookService = new BookService();

    public void listAllBooks(ArrayList<Book> bookList) {
        bookService.listAllBooks(bookList);
    }

    public void checkoutBook(String bookName, ArrayList<Book> bookList) {
        bookService.checkoutBook(bookName, bookList);
    }
}
