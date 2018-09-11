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
                "深入浅出 Java",
                "Kathy Sierra",
                "2005");
        Book book_JavaScript = new Book(
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
                "书名     作者名     出版年\n" +
                "深入浅出 Java, Kathy Sierra, 2005.\n" +
                "JavaScript 权威指南, David Flanagan, 2012.\n";

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
        String bookName = "JavaScript 权威指南";

        // when
        bookController.checkoutBook(bookName,bookList);

        //then
        assertEquals(output.toString(), expect);
    }

    @Test
    public void should_print_unSuccessful_checkout_message() {
        // given
        String expect = "That book is not available.\n";
        String bookName = "Java 权威指南";

        // when
        bookController.checkoutBook(bookName,bookList);

        //then
        assertEquals(output.toString(), expect);
    }


    @After
    public void tearDown() throws Exception {
        System.setOut(System.out);
    }
}
