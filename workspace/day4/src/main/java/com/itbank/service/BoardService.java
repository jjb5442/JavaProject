package com.itbank.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BoardDAO;
import com.itbank.model.BoardDTO;

@Service
public class BoardService {
	@Autowired
	private BoardDAO dao;
	
	public Map<String, Object> getList(Integer page, String type, String search) {
//		if (type == null || "".equals(type)) {
//			return dao.selectBoardAll();
//		}
		
		if (page == null) { page = 1; }
		
		Paging p = new Paging(page);
		HashMap<String, Object> param = new HashMap<String, Object>();
		
		param.put("perPage", p.getPerPage());
		param.put("offset", p.getOffset());
		param.put("type", type);
		param.put("search", search);
		
		// paging 정보와, 테이블 정보를 함께 담을 map
		HashMap<String, Object> map = new HashMap<String, Object>();
		int pageCount = dao.selectPageCount(param);
		List<BoardDTO> list = dao.selectBoardAll(param);
		
//		int perCount = 10;
//		int index = (page - 1) / perCount + 1; 
//		int start = perCount * (index - 1) + 1;
		int end = (pageCount > p.getEnd()) ? p.getEnd() : pageCount;
		p.setEnd(end);
		
		map.put("list", list);
		map.put("p", p);
		
		return map;
	}

	public BoardDTO getBoard(int idx) {
		return dao.selectOne(idx);
	}

	public int write(BoardDTO dto) {
		return dao.insert(dto);
	}

	public int modify(BoardDTO dto) {
		return dao.update(dto);
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}
}
