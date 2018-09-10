package com.twu.biblioteca.tools;

import com.twu.biblioteca.model.Book;

import java.util.ArrayList;

public class DataSet {
    public ArrayList<Book> setBookList() {
        ArrayList<Book> bookList = new ArrayList<Book>();
        Book book_Java = new Book(
                "深入浅出 Java",
                "Kathy Sierra",
                "2005");
        Book book_JavaScript = new Book(
                "JavaScript 权威指南",
                "David Flanagan",
                "2012");
        bookList.add(book_Java);
        bookList.add(book_JavaScript);
        return bookList;
    }
}
