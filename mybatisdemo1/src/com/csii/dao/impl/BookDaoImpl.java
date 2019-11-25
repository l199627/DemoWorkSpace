package com.csii.dao.impl;

import java.util.List;

import javax.management.Query;

import org.apache.ibatis.session.SqlSession;

import com.csii.dao.BookDao;
import com.csii.entity.Book;
import com.csii.util.MybatisUtil;
public class BookDaoImpl implements BookDao {
/* (non-Javadoc)
 * @see com.zl.Dao.impl.CarDao#findCarById(java.lang.Integer)
 */
@Override
public Book findBookById(Integer id) {
	SqlSession ss=MybatisUtil.init().getSession();
	Book b=ss.selectOne("com.csii.dao.BookDao.findBookById", id);
	ss.close();
	return b;
}

@Override
public List<Book> findAllBook() {
	SqlSession ss=MybatisUtil.init().getSession();
	List<Book> bookList=ss.selectList("com.csii.dao.BookDao.findAllBook");
	ss.close();
	return bookList;
}

@Override
public int delectBook(Integer id) {
	SqlSession ss=MybatisUtil.init().getSession();
	 int flag=ss.update("com.csii.dao.BookDao.delectBook", id);
	ss.commit();
	ss.close();
	 return flag;
}

@Override
public int addBook(Book book) {
	SqlSession ss=MybatisUtil.init().getSession();
	int flag=ss.update("com.csii.dao.BookDao.addBook", book);
	ss.commit();
	ss.close();
	 return flag;
}

@Override
public int updateBook(Book book) {
	SqlSession ss=MybatisUtil.init().getSession();
	int flag=ss.update("com.csii.dao.BookDao.updateBook", book);
	ss.commit();
	ss.close();
	 return flag;
}
}
