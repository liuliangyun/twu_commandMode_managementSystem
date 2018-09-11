package com.twu.biblioteca;


import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.service.BookService;
import com.twu.biblioteca.service.PageService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BibiotecaAppTest {

    private ByteArrayOutputStream output = new ByteArrayOutputStream();
    private BookService bookService = new BookService();
    private PageService pageService = new PageService();
    private ArrayList<Book> bookList = new ArrayList<Book>();

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
        pageService.displayWelcomeInfo();

        // then
        assertEquals(output.toString(), expect);
    }

    @Test
    public void should_display_main_menu() {
        // given
        String expect = "------------------------------------------\n" +
                "       Main Menu       \n" +
                "List Books, please press 1.\n" +
                "Checkout Book, please press 2.\n" +
                "Return Book, please press 3.\n" +
                "Quit System, please press 0.\n";

        // when
        pageService.displayMainMenu();

        // then
        assertEquals(output.toString(), expect);
    }

    @Test
    public void should_list_all_books() {
        // given
        String expect = "------------------------------------------\n" +
                "编号     书名     作者名     出版年\n" +
                "1. 深入浅出 Java, Kathy Sierra, 2005.\n" +
                "2. JavaScript 权威指南, David Flanagan, 2012.\n";

        // when
        bookService.listAllBooks(bookList);

        // then
        assertEquals(output.toString(), expect);
    }

    @Test
    public void should_print_successful_checkout_message() {
        // given
        String expect = "Thank you! Enjoy the book.\n";
        Long bookId = 1L;

        // when
        bookService.checkoutBook(bookId, bookList);

        //then
        assertEquals(output.toString(), expect);
    }

    @Test
    public void should_print_unSuccessful_checkout_message() {
        // given
        String expect = "That book is not available.\n";
        Long bookId = 4L;

        // when
        bookService.checkoutBook(bookId, bookList);

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
        bookService.returnBook(bookId, bookList);

        // then
        assertEquals(output.toString(), expect);
    }

    @Test
    public void should_print_unSuccessful_return_message() {
        // given
        String expect = "That is not a valid book to return.\n";
        Long bookId = 5L;

        // when
        bookService.returnBook(bookId, bookList);

        // then
        assertEquals(output.toString(), expect);
    }


    @After
    public void tearDown() throws Exception {
        System.setOut(System.out);
    }
}
