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
		//book.setBookname("��");
		//int flag=bd.updateBook(book);
//		Book book=new Book();
//		book.setBookid(10);
//		book.setBookname("��ï��");
//		book.setLxid(3);
//		book.setAuthor("��ï��");
//		book.setChubanshe("�������������");
//		book.setShijian(new Date());
//		book.setKucun(908);
//		int flag=bd.addBook(book);
//		System.out.println(flag);
	}

}
