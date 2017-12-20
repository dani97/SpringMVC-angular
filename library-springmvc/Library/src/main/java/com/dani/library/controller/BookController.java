package com.dani.library.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dani.library.dao.BookDao;
import com.dani.library.model.Book;
@Controller
@RequestMapping("/book")
public class BookController {
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody List<List<Book>> getBook() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean_conf.xml");
		BookDao bookdao = (BookDao) context.getBean("bookdao");
		ArrayList<List<Book>> al = new ArrayList<List<Book>>();
		al.add(bookdao.getAllBooks());
		return al;
	}
	
}
