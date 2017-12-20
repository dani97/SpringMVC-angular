package com.dani.library.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dani.library.model.Author;

public class AuthorUtil implements RowMapper<Author> {

	@Override
	public Author mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Author author = new Author();
		author.setAuthorCode(rs.getString("authorCode"));
		author.setAuthorName(rs.getString("authorName"));
		author.setContactDetail(rs.getString("contactDetail"));
		return author;
	}

}
