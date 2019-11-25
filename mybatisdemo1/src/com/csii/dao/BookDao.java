package com.csii.dao;

import java.util.List;

import com.csii.entity.Book;

public interface BookDao {

	Book findBookById(Integer id);
    List<Book> findAllBook();
    int delectBook(Integer id);
    int addBook(Book book);
    int updateBook(Book book);
}