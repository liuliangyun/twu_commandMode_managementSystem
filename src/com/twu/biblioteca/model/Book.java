package com.twu.biblioteca.model;

public class Book {

    private Long bookId;
    private String bookName;
    private String authorName;
    private String publishedYear;
    private boolean isCheckOut;

    public Book(Long bookId, String bookName, String authorName, String publishedYear) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishedYear = publishedYear;
        this.isCheckOut = false;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }

    public boolean isCheckOut() {
        return isCheckOut;
    }

    public void setCheckOut(boolean checkOut) {
        isCheckOut = checkOut;
    }
}
