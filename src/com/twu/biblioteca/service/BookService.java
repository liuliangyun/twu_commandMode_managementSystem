package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Book;

import java.util.ArrayList;

public class BookService {

    public void listAllBooks(ArrayList<Book> bookList) {
        System.out.print("图书列表: \n");
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            System.out.println(book.getBookName() + ", "
                    + book.getAuthorName() + ", "
                    + book.getPublishedYear() + ".");
        }
        System.out.print("------------------------------------------\n");
    }
}
