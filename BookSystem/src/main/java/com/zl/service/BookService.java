package com.zl.service;

import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.zl.pojo.Book;
import com.zl.pojo.FenYe;
import com.zl.pojo.Query;

public interface BookService {
Book findBookById(Integer id);
List<Book> findAllBook();
int delectBook(String[] ids);
int addBook(Book b,CommonsMultipartFile fimg);
int updateBook(Book b,CommonsMultipartFile fimg);
List<Book> queryBookByFy(FenYe fy);
int queryRowCount(Query query);
}
