package com.zl.pojo;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Book {
private Integer bookid;
private String bookname;
private Lx lx;
private String author;
private String chubanshe;
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date shijian;
private Integer kucun;
private String tupian;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(Integer bookid, String bookname, Lx lx, String author, String chubanshe, Date shijian, Integer kucun,
		String tupian) {
	super();
	this.bookid = bookid;
	this.bookname = bookname;
	this.lx = lx;
	this.author = author;
	this.chubanshe = chubanshe;
	this.shijian = shijian;
	this.kucun = kucun;
	this.tupian = tupian;
}
public Integer getBookid() {
	return bookid;
}
public void setBookid(Integer bookid) {
	this.bookid = bookid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public Lx getLx() {
	return lx;
}
public void setLx(Lx lx) {
	this.lx = lx;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getChubanshe() {
	return chubanshe;
}
public void setChubanshe(String chubanshe) {
	this.chubanshe = chubanshe;
}
public Date getShijian() {
	return shijian;
}
public void setShijian(Date shijian) {
	this.shijian = shijian;
}
public Integer getKucun() {
	return kucun;
}
public void setKucun(Integer kucun) {
	this.kucun = kucun;
}
public String getTupian() {
	return tupian;
}
public void setTupian(String tupian) {
	this.tupian = tupian;
}
@Override
public String toString() {
	return "Book [bookid=" + bookid + ", bookname=" + bookname + ", lx=" + lx + ", author=" + author + ", chubanshe="
			+ chubanshe + ", shijian=" + shijian + ", kucun=" + kucun + ", tupian=" + tupian + "]";
}


}