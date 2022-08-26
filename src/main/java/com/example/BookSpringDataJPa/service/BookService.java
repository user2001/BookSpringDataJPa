package com.example.BookSpringDataJPa.service;


import com.example.BookSpringDataJPa.entity.Book;

import java.util.List;

public interface BookService {

    public Iterable<Book> findAll();
    public void save(Book book);
}
