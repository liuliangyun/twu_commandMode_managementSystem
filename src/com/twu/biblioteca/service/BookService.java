package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Book;

import java.util.ArrayList;

public class BookService {

    public void listAllBooks(ArrayList<Book> bookList) {
        System.out.print("------------------------------------------\n" +
                "图书列表: \n" +
                "编号     书名     作者名     出版年\n");
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            if (!book.isCheckOut()) {
                System.out.println(book.getBookId() + ". "
                        + book.getBookName() + ", "
                        + book.getAuthorName() + ", "
                        + book.getPublishedYear() + ".");
            }
        }
    }

    public void checkoutBook(Long bookId, ArrayList<Book> bookList) {
        Book book = findBookById(bookId, bookList);
        if (book != null && !book.isCheckOut()) {
            book.setCheckOut(true);
            System.out.print("Thank you! Enjoy the book.\n");
        } else {
            System.out.print("That book is not available.\n");
        }
    }

    private Book findBookById(Long bookId, ArrayList<Book> bookList) {
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    public void returnBook(Long bookId, ArrayList<Book> bookList) {
        Book book = findBookById(bookId, bookList);
        if (book != null && book.isCheckOut()) {
            book.setCheckOut(false);
            System.out.print("Thank you for returning the book.\n");
        } else {
            System.out.print("That is not a valid book to return.\n");
        }
    }
}
