package com.twu.biblioteca;


import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.service.BookService;
import com.twu.biblioteca.service.MovieService;
import com.twu.biblioteca.service.UserService;
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
    private MovieService movieService = new MovieService();
    private ArrayList<Movie> movieList = new ArrayList<Movie>();
    private ArrayList<User> userList = new ArrayList<User>();
    private UserService userService = new UserService();

    @Before
    public void setUp() {
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

        Movie movie_Schindler = new Movie(
                1L,
                "辛德勒的名单",
                "史蒂文·斯皮尔伯格",
                "1993",
                9.4);
        Movie movie_Godfather = new Movie(
                2L,
                "教父",
                "弗朗西斯·福特·科波拉",
                "1972");
        movieList.add(movie_Schindler);
        movieList.add(movie_Godfather);

        User user_Zhangsan = new User(
                "Zhangsan",
                "zhangsan@qq.com",
                "024-1111111",
                "024-1111",
                "1111111");
        User user_Lisi = new User(
                "Lisi",
                "lisi@qq.com",
                "024-2222222",
                "024-2222",
                "2222222");
        userList.add(user_Zhangsan);
        userList.add(user_Lisi);
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
                "List Movies, please press 4.\n" +
                "Checkout Movie, please press 5.\n" +
                "Display Userinfo, please press 6.\n" +
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
    public void should_print_successful_checkout_book_message() {
        // given
        String expect = "Thank you! Enjoy the book.\n";
        Long bookId = 1L;

        // when
        bookService.checkoutBook(bookId, bookList);

        //then
        assertEquals(output.toString(), expect);
    }

    @Test
    public void should_print_unSuccessful_checkout_book_message() {
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
        Long bookId = bookList.get(0).getId();

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

    @Test
    public void should_list_all_movies() {
        // given
        String expect = "------------------------------------------\n" +
                "编号     电影名称     导演     出版年     评分\n" +
                "1. 辛德勒的名单, 史蒂文·斯皮尔伯格, 1993, 9.4.\n" +
                "2. 教父, 弗朗西斯·福特·科波拉, 1972, 0.0.\n";

        // when
        movieService.listAllMovies(movieList);

        // then
        assertEquals(output.toString(), expect);
    }

    @Test
    public void should_print_successful_checkout_movie_message() {
        // given
        String expect = "Thank you! Enjoy the movie.\n";
        Long movieId = 1L;

        // when
        movieService.checkoutMovie(movieId, movieList);

        //then
        assertEquals(output.toString(), expect);
    }

    @Test
    public void should_print_unSuccessful_checkout_movie_message() {
        // given
        String expect = "That movie is not available.\n";
        Long movieId = 4L;

        // when
        movieService.checkoutMovie(movieId, movieList);

        //then
        assertEquals(output.toString(), expect);
    }

    @Test
    public void should_print_successful_login_message() {
        // given
        String expect = "Login successful! Enjoy yourself.\n";
        String libraryNumber = "024-1111";
        String passWord = "1111111";

        // when
        userService.logIn(libraryNumber, passWord, userList);

        // then
        assertEquals(output.toString(), expect);
    }

    @Test
    public void should_print_unSuccessful_login_message() {
        // given
        String expect = "That user is not available.\n";
        String libraryNumber = "1111";
        String passWord = "1111111";

        // when
        userService.logIn(libraryNumber, passWord, userList);

        // then
        assertEquals(output.toString(), expect);
    }

    @After
    public void tearDown() {
        System.setOut(System.out);
    }

}
