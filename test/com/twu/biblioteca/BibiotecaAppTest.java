package com.twu.biblioteca;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BibiotecaAppTest {

    ByteArrayOutputStream output = new ByteArrayOutputStream();
    BibliotecaApp bibliotecaApp = new BibliotecaApp();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(output));
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
        bibliotecaApp.listAllBooks();

        // then
        assertEquals(output.toString(), expect);
    }

    @Test
    public void should_diaplay_main_menu() {
        // given
        String expect = "------------------------------------------\n" +
                "       Main Menu       \n" +
                "List Books, please press 1.\n" +
                "Exit System, please press 0.\n";

        // when
        bibliotecaApp.displayMainMenu();

        // then
        assertEquals(output.toString(), expect);
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(System.out);
    }
}
