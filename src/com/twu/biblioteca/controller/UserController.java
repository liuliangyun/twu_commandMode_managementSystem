package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.service.UserService;

import java.util.ArrayList;

public class UserController {

    private UserService userService = new UserService();

    public User logIn(String libraryNumber, String password, ArrayList<User> userList) {
        return userService.logIn(libraryNumber, password, userList);
    }
}
