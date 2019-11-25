package com.csii.test;

import com.csii.dao.BookDao;
import com.csii.dao.impl.BookDaoImpl;
import com.csii.entity.Book;

public class Test {

	public static void main(String[] args) {
		BookDao bd=new BookDaoImpl();
		Book book=bd.findBookById(1);
		System.out.println(book);
//		List<Book> bookList=bd.findAllBook();
//		System.out.println(bookList);
//		int flag=bd.delectBook(10);
//		System.out.println(flag);
		//book.setBookname("陈");
		//int flag=bd.updateBook(book);
//		Book book=new Book();
//		book.setBookid(10);
//		book.setBookname("李茂林");
//		book.setLxid(3);
//		book.setAuthor("李茂林");
//		book.setChubanshe("宁夏人民出版社");
//		book.setShijian(new Date());
//		book.setKucun(908);
//		int flag=bd.addBook(book);
//		System.out.println(flag);
	}

}
