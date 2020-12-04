package com.example.demo.model;

import java.util.List;

public class Library {
    private String name;
    private String location;
    private List<Book> bookList;

    public Library(){}

    public Library(String name, String location, List<Book> bookList) {
        this.name = name;
        this.location = location;
        this.bookList = bookList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
