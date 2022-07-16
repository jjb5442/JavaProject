package com.itbank.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BoardDAO;
import com.itbank.model.BoardDTO;

@Service
public class BoardService {
	@Autowired
	private BoardDAO dao;
	
	public List<BoardDTO> getList(String type, String search) {
		if (type == null) {
			return dao.selectBoardAll();
		}
		
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("type", type);
		param.put("search", search);
		
		return dao.selectSearch(param);
	}

	public BoardDTO getBoard(int idx) {
		return dao.selectOne(idx);
	}
}
