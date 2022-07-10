package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.itbank.model.BookDAO;
import com.itbank.model.BookDTO;

@Service		// 순수 자바 로직을 처리할 클래스를 의미
				// - 주로 게시판의 페이징, 패스워드의 암호화 같은 복잡한 로직을 작성할때 사용
public class BookService {
	
	@Autowired
	private BookDAO dao;

	public String getVersion() {
		
		return dao.selectVersion();
	}

	public List<BookDTO> getList() {
		return dao.selectAll();
	}

	public List<BookDTO> getList(String search) {
		return dao.selectAll(search);
	}

}
