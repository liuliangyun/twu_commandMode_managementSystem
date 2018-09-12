package com.twu.biblioteca.service;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.tools.Constants;

import java.util.ArrayList;

public class UserService {

    public User logIn(String libraryNumber, String password, ArrayList<User> userList) {
        for (User user : userList) {
            if (user.getLibraryNumber().equals(libraryNumber)
                    && user.getPassWord().equals(password)) {
                System.out.print(Constants.LOGIN_SUCCESSFUL);
                return user;
            }
        }
        System.out.print(Constants.LOGIN_UNSUCCESSFUL);
        return null;
    }
}
