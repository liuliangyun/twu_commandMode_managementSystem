package com.twu.biblioteca;


import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BibiotecaAppTest {

    @Test
    public void should_console_log_welcome_info() {
        // given
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        String expect = "Welcome to The Bangalore Public Library!\n";

        // when
        bibliotecaApp.printWelcomeInfo();

        // then
        assertEquals(output.toString(), expect);

        System.setOut(System.out);
    }
}
