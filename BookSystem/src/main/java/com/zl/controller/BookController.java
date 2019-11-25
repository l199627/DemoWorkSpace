package com.zl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.zl.pojo.Book;
import com.zl.pojo.FenYe;
import com.zl.pojo.Lx;
import com.zl.service.BookService;
import com.zl.service.LxService;
@Controller
@RequestMapping("/bookController")
public class BookController {
	@Autowired
	private BookService bs;
	@Autowired
	private LxService ls;
	@RequestMapping("/toBookList.do")
	public ModelAndView toCarList(FenYe fy) {
		ModelAndView mv=new ModelAndView();
		List<Book> bookList=bs.queryBookByFy(fy);
		List<Lx> lxList=ls.findAllLx();
		mv.addObject("bookList", bookList);
		mv.addObject("lxList", lxList);

		mv.setViewName("/index");
		return mv;
	}
	//É¾³ý
	@RequestMapping("/deleteBook.do")
	public ModelAndView deleteBook(String[] ids) {
		ModelAndView mv=new ModelAndView();
		bs.delectBook(ids);
		mv.setViewName("redirect:toBookList.do");
		return mv;
	}
	//Ôö¼Ó
	@RequestMapping("/lxXianShi.do")
	public ModelAndView lxXianShi() {
		ModelAndView mv=new ModelAndView();
		List<Lx> lxList1=ls.findAllLx();
		mv.addObject("lxList1", lxList1);
		mv.setViewName("/addBook");
		return mv;
	}
		@RequestMapping("/addBook.do")
		public ModelAndView addBook(Book book,@RequestParam("fimg")CommonsMultipartFile fimg) {
			ModelAndView mv=new ModelAndView();
			bs.addBook(book,fimg);
			mv.setViewName("redirect:toBookList.do");
			return mv;
		}
		//ÐÞ¸Ä
		@RequestMapping("/xiuGaiXianshi.do")
		public ModelAndView xiuGaiXianshi(Integer bookid) {
			ModelAndView mv=new ModelAndView();
			Book book=bs.findBookById(bookid);
			mv.addObject("bb", book);
			mv.setViewName("/updateBook");
			return mv;
		}
		@RequestMapping("/updateBook.do")
		public ModelAndView updateBook(Book book,@RequestParam("fimg")CommonsMultipartFile fimg) {
			ModelAndView mv=new ModelAndView();
			bs.updateBook(book,fimg);
			mv.setViewName("redirect:toBookList.do");
			return mv;
		}
}
