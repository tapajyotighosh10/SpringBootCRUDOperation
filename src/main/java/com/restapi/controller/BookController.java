package com.restapi.controller;

import com.restapi.entity.Book;
import com.restapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;
    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> getBooks() {
        return this.bookService.getAllBooks();
    }
    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public Book getBookById(@PathVariable("id") int id) {
        return this.bookService.getBookById(id);
    }
    @RequestMapping(value = "/add_book", method = RequestMethod.POST)
    public Book addBook(@RequestBody Book b) {
        Book book=this.bookService.createBook(b);
        return book;
    }

}
