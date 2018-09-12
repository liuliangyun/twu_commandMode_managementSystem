package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.tools.Constants;

import java.util.ArrayList;

public class BookService {

    public void listAllBooks(ArrayList<Book> bookList) {
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

    public void checkoutBook(Long bookId, ArrayList<Book> bookList) {
        Book book = findBookById(bookId, bookList);
        if (book != null && !book.isCheckOut()) {
            book.setCheckOut(true);
            System.out.print(Constants.CHECKOUT_BOOK_SUCCESSFUL);
        } else {
            System.out.print(Constants.CHECKOUT_BOOK_UNSUCCESSFUL);
        }
    }

    private Book findBookById(Long bookId, ArrayList<Book> bookList) {
        for (Book book : bookList) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null;
    }

    public void returnBook(Long bookId, ArrayList<Book> bookList) {
        Book book = findBookById(bookId, bookList);
        if (book != null && book.isCheckOut()) {
            book.setCheckOut(false);
            System.out.print(Constants.RETURN_BOOK_SUCCESSFUL);
        } else {
            System.out.print(Constants.RETURN_BOOK_UNSUCCESSFUL);
        }
    }

}
