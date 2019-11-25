package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.zl.Dao.BookDao;
import com.zl.pojo.Book;
import com.zl.pojo.FenYe;
import com.zl.pojo.Query;
import com.zl.service.BookService;
import com.zl.service.FileUploadService;
@Service
public class BookServiceImpl implements BookService {
@Autowired
private BookDao bd;
@Autowired
private FileUploadService fus;
	@Override
	public Book findBookById(Integer id) {
		return bd.findBookById(id);
	}

	@Override
	public List<Book> findAllBook() {
		return bd.findAllBook();
	}

	@Override
	public int delectBook(String[] ids) {
		for(String id:ids) {
			bd.delectBook((new Integer(id)));
		}
		return 1;
	}

	@Override
	public int addBook(Book b,CommonsMultipartFile fimg) {
		b=fus.fileUploadBook(b, fimg);
		return bd.addBook(b);
	}

	@Override
	public int updateBook(Book b,CommonsMultipartFile fimg) {
		b=fus.fileUploadBook(b, fimg);
		return bd.updateBook(b);
	}

	@Override
	public List<Book> queryBookByFy(FenYe fy) {
		//处理当前页码
				if(fy.getPage()==null ||fy.getPage()==0) {
					fy.setPage(1);
				}
				fy.setRowCount(queryRowCount(fy.getQuery()));
		return bd.queryBookByFy(fy);
	}

	@Override
	public int queryRowCount(Query query) {
		return bd.queryRowCount(query);
	}

}
