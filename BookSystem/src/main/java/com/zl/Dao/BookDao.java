package com.zl.Dao;

import java.util.List;

import com.zl.pojo.Book;
import com.zl.pojo.FenYe;
import com.zl.pojo.Query;

public interface BookDao {

	Book findBookById(Integer id);
List<Book> findAllBook();
int delectBook(Integer id);
int addBook(Book book);
int updateBook(Book book);
List<Book> queryBookByFy(FenYe fy);
int queryRowCount(Query query);
}