package com.dani.library.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.RowMapper;

import com.dani.library.dao.AuthorDao;
import com.dani.library.model.Book;

public class BookUtil implements RowMapper<Book>{

	@Override
	public Book mapRow(ResultSet rs, int rowCount) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean_conf.xml");
		AuthorDao authorDao = (AuthorDao) context.getBean("authordao");
		// TODO Auto-generated method stub
		Book book = new Book();
		book.setIsbn(rs.getString("isbn"));
		book.setBookName(rs.getString("bookName"));
		book.setCost(rs.getInt("cost"));
		book.setBookType(rs.getString("bookType"));
		book.setAuthor(authorDao.getAuthor(rs.getString("authorCode")));
		return book;
	}

}
