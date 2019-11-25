package com.zl.service;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.zl.pojo.Book;

public interface FileUploadService {

	public Book fileUploadBook(Book book,CommonsMultipartFile fimg);
}
