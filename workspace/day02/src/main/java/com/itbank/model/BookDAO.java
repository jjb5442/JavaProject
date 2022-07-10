package com.itbank.model;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository			// DB 접근 및 처리를 위한 스프링 빈
public class BookDAO {
	
	@Autowired 
	private JdbcTemplate jt;

	private RowMapper<BookDTO> rm = (ResultSet rs, int rowNum) -> {
		
		BookDTO dto = new BookDTO();
		
		dto.setName(rs.getString("name"));
		dto.setPrice(rs.getInt("price"));
		dto.setPublishDate(rs.getDate("publishDate"));
		dto.setPublisher(rs.getString("publisher"));
					
		return dto;
	};
	
	public String selectVersion() {
		String sql = "select banner from v$version";
		
		return jt.queryForObject(sql, String.class);
	}

	public List<BookDTO> selectAll() {
		String sql = "select * from book";
		
		return jt.query(sql, rm);
	}

	public List<BookDTO> selectAll(String search) {
		String sql = "select * from book where name like '%" + search + "%'";
		return jt.query(sql, rm);
	}

}
