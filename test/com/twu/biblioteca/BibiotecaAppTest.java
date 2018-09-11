package com.twu.biblioteca;


import com.twu.biblioteca.controller.BookController;
import com.twu.biblioteca.model.Book;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BibiotecaAppTest {

    ByteArrayOutputStream output = new ByteArrayOutputStream();
    BibliotecaApp bibliotecaApp = new BibliotecaApp();
    BookController bookController = new BookController();
    ArrayList<Book> bookList = new ArrayList<Book>();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(output));
        Book book_Java = new Book(
                1L,
                "深入浅出 Java",
                "Kathy Sierra",
                "2005");
        Book book_JavaScript = new Book(
                2L,
                "JavaScript 权威指南",
                "David Flanagan",
                "2012");
        bookList.add(book_Java);
        bookList.add(book_JavaScript);
    }

    @Test
    public void should_console_log_welcome_info() {
        // given
        String expect = "------------------------------------------\n" +
                "Welcome to The Bangalore Public Library!\n";

        // when
        bibliotecaApp.printWelcomeInfo();

        // then
        assertEquals(output.toString(), expect);
    }

    @Test
    public void should_list_all_books() {
        // given
        String expect = "------------------------------------------\n" +
                "图书列表: \n" +
                "编号     书名     作者名     出版年\n" +
                "1. 深入浅出 Java, Kathy Sierra, 2005.\n" +
                "2. JavaScript 权威指南, David Flanagan, 2012.\n";

        // when
        bookController.listAllBooks(bookList);

        // then
        assertEquals(output.toString(), expect);
    }

    @Test
    public void should_diaplay_main_menu() {
        // given
        String expect = "------------------------------------------\n" +
                "       Main Menu       \n" +
                "List Books, please press 1.\n" +
                "Checkout Book, please press 2.\n" +
                "Return Book, please press 3.\n" +
                "Quit System, please press 0.\n";

        // when
        bibliotecaApp.displayMainMenu();

        // then
        assertEquals(output.toString(), expect);
    }

    @Test
    public void should_print_successful_checkout_message() {
        // given
        String expect = "Thank you! Enjoy the book.\n";
        Long bookId = 1L;

        // when
        bookController.checkoutBook(bookId, bookList);

        //then
        assertEquals(output.toString(), expect);
    }

    @Test
    public void should_print_unSuccessful_checkout_message() {
        // given
        String expect = "That book is not available.\n";
        Long bookId = 4L;

        // when
        bookController.checkoutBook(bookId, bookList);

        //then
        assertEquals(output.toString(), expect);
    }

    @Test
    public void should_print_successful_return_message() {
        // given
        String expect = "Thank you for returning the book.\n";
        bookList.get(0).setCheckOut(true);
        Long bookId = bookList.get(0).getBookId();

        // when
        bookController.returnBook(bookId, bookList);

        // then
        assertEquals(output.toString(), expect);
    }

    @Test
    public void should_print_unSuccessful_return_message() {
        // given
        String expect = "That is not a valid book to return.\n";
        Long bookId = 5L;

        // when
        bookController.returnBook(bookId, bookList);

        // then
        assertEquals(output.toString(), expect);
    }


    @After
    public void tearDown() throws Exception {
        System.setOut(System.out);
    }
}
