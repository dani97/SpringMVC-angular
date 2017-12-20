package com.dani.library.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dani.library.dao.AuthorDao;
import com.dani.library.model.Author;

@Controller
@RequestMapping("/author")
public class AuthorController {
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody List<List<Author>> getAuthor() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean_conf.xml");
		AuthorDao bookdao = (AuthorDao) context.getBean("authordao");
		ArrayList<List<Author>> al = new ArrayList<List<Author>>();
		al.add(bookdao.getAllAuthors());
		return al;
	}
	
}