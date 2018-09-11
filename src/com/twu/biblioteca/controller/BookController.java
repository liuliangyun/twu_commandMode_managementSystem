package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.service.BookService;

import java.util.ArrayList;

public class BookController {

    private BookService bookService = new BookService();

    public void listAllBooks(ArrayList<Book> bookList) {
        bookService.listAllBooks(bookList);
    }

    public void checkoutBook(Long bookId, ArrayList<Book> bookList) {
        bookService.checkoutBook(bookId, bookList);
    }

    public void returnBook(Long bookId, ArrayList<Book> bookList) {
        bookService.returnBook(bookId, bookList);
    }
}
