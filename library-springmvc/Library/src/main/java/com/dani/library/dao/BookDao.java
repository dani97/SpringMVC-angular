package com.dani.library.dao; 
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.dani.library.model.Book;
import com.dani.library.util.BookUtil;

import java.util.List;

import javax.sql.DataSource;

public class BookDao {
	private NamedParameterJdbcTemplate template;
	BookDao(DataSource dataSource){
		this.template = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public List<Book> getAllBooks() {
		String sql = "select * from books";
		SqlParameterSource sq = new MapSqlParameterSource();
		return this.template.query(sql,sq,new BookUtil());
	}
	
}
