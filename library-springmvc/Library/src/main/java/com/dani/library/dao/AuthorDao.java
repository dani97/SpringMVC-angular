package com.dani.library.dao;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.dani.library.model.Author;
import com.dani.library.util.AuthorUtil;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;


public class AuthorDao {
	private NamedParameterJdbcTemplate template;
	AuthorDao(DataSource dataSource){
		this.template = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public List<Author> getAllAuthors() {
		String sql = "select * from authors";
		SqlParameterSource sq = new MapSqlParameterSource();
		return this.template.query(sql,sq,new AuthorUtil());
	}
	
	public Author getAuthor(String authorCode) {
		String sql = "select * from authors where authorCode=:author";
		SqlParameterSource sq = new MapSqlParameterSource("author",authorCode);
		return (Author) this.template.query(sql,sq,new AuthorUtil()).get(0);
	}
}
