package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.tools.Constants;
import com.twu.biblioteca.tools.DataSet;

import java.util.ArrayList;

public class BookService {
    private DataSet dataSet = new DataSet();
    ArrayList<Book> bookList = dataSet.setBookList();

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public boolean checkoutBook(Long bookId) {
        Book book = findBookById(bookId);
        if (book != null && !book.isCheckOut()) {
            book.setCheckOut(true);
            return true;
        }
        return false;
    }

    public boolean returnbackBook(Long bookId) {
        Book book = findBookById(bookId);
        if (book != null && book.isCheckOut()) {
            book.setCheckOut(false);
            return true;
        } else {
            return false;
        }
    }

    private Book findBookById(Long bookId) {
        for (Book book : bookList) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null;
    }
}
