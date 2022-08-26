package com.example.BookSpringDataJPa.controller;

import com.example.BookSpringDataJPa.entity.Book;
import com.example.BookSpringDataJPa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("/books")
    public Iterable<Book> getAllBooks(){
        return bookService.findAll();
    }
    @PostMapping("/books")
    public Book createBook(@RequestBody Book book){
         bookService.save(book);
        return book;
    }
}
