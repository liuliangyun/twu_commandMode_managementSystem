package com.twu.biblioteca.model;

public class User {

    private String userName;
    private String email;
    private String phone;
    private String libraryNumber;
    private String passWord;

    public User(String userName, String email, String phone,
                String libraryNumber, String passWord) {
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.libraryNumber = libraryNumber;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(String libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}
