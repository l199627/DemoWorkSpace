package com.csii.entity;

import java.util.Date;

public class Book {
	private Integer bookid;
	private String bookname;
	private String author;
	private String chubanshe;
	private Date shijian;
	private Integer kucun;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Integer bookid, String bookname, String author, String chubanshe, Date shijian, Integer kucun) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
		this.chubanshe = chubanshe;
		this.shijian = shijian;
		this.kucun = kucun;
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
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", chubanshe=" + chubanshe
				+ ", shijian=" + shijian + ", kucun=" + kucun + "]";
	}
	
}
