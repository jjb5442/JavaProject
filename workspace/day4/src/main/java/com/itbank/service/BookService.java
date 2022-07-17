package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BookDAO;
import com.itbank.model.BookDTO;

@Service
public class BookService {
	@Autowired
	private BookDAO dao;

	public String getVersion() {
		return dao.selectVersion();
	}
	
	public List<BookDTO> getList(String search) {
		if (search == null) {
			return dao.selectBookAll();
		}
		
		return dao.selectBook(search);
	}
}
