package com.example.BookSpringDataJPa.dao;


import com.example.BookSpringDataJPa.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer> {
}
