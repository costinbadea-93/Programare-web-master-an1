package com.example.demo.model;

import java.util.List;

public class Book {
    private String name;
    private String author;
    private List<BookReview> bookReviews;

    public Book(){}

    public Book(String name, String author, List<BookReview> bookReviews) {
        this.name = name;
        this.author = author;
        this.bookReviews = bookReviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<BookReview> getBookReviews() {
        return bookReviews;
    }

    public void setBookReviews(List<BookReview> bookReviews) {
        this.bookReviews = bookReviews;
    }
}
