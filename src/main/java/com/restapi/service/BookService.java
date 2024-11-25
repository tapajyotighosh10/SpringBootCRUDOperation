package com.restapi.service;

import com.restapi.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private static List<Book> list = new ArrayList<>();

    static {
        list.add(new Book(13, "Learn Java", "Tapajyoti"));
        list.add(new Book(18, "Learn Golang", "Rahul"));
        list.add(new Book(14, "Learn Python", "Rajdeep"));

    }

    public List<Book> getAllBooks() {
        return list;
    }

    public Book getBookById(int id) {
        Book b = null;
        b = list.stream().filter(e -> e.getId() == id).findFirst().get();
        return b;
    }
    public Book createBook(Book b){
        list.add(b);
        return b;
    }
}
