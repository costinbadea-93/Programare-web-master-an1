package com.example.demo.repository;

import com.example.demo.model.Book;
import com.example.demo.model.BookReview;
import com.example.demo.model.Library;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class MainRepository {
    private static List<Library> libraryList = new ArrayList<>();

    public MainRepository(){
        List<BookReview> bookReviews = new ArrayList<>();
        bookReviews.add(new BookReview("Costin","This is some content from Costin!"));
        bookReviews.add(new BookReview("Alex","This is some content from Alex!"));
        bookReviews.add(new BookReview("Andrei","This is some content from Andrei!"));

        List<Book> books = new ArrayList<>();
        books.add(new Book("Book1", "Author1", bookReviews));
        books.add(new Book("Book2", "Author2", bookReviews));
        books.add(new Book("Book3", "Author3", bookReviews));

        Library l1 = new Library("Library1","Location1", books);
        Library l2 = new Library("Library2","Location2", books);

        libraryList.add(l1);
        libraryList.add(l2);
    }


    public List<Library> getLibraryList() {
        return libraryList;
    }

    public List<Library> addNewLibrary(Library library){
        libraryList.add(library);
        return libraryList;
    }

    public List<Library> deleteLibraryByName(String name) {
        libraryList = libraryList.stream()
                .filter(library -> !library.getName().equals(name))
                .collect(Collectors.toList());

        return libraryList;
    }

    public Library findLibraryByName(String name) {
        return libraryList.stream()
                .filter(library -> library.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("This library does not exist!!!"));
    }
}
