package com.twu.biblioteca;


import com.twu.biblioteca.controller.BookController;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BibiotecaAppTest {

    ByteArrayOutputStream output;

    @Before
    public void setUp() throws Exception {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void should_console_log_welcome_info() {
        // given
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        String expect = "Welcome to The Bangalore Public Library!\n" +
                "------------------------------------------\n";

        // when
        bibliotecaApp.printWelcomeInfo();

        // then
        assertEquals(output.toString(), expect);
    }

    @Test
    public void should_list_all_books() {
        // given
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        String expect = "图书列表: \n" +
                "深入浅出 Java, Kathy Sierra, 2005.\n" +
                "JavaScript 权威指南, David Flanagan, 2012.\n" +
                "------------------------------------------\n";

        // when
        bibliotecaApp.listAllBooks();

        // then
        assertEquals(output.toString(), expect);
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(System.out);
    }
}
