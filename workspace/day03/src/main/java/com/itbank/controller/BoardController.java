package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.BoardDTO;
import com.itbank.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService bs; 
	
	@GetMapping("/board")
	public ModelAndView board(String type, String search) {
		ModelAndView mav = new ModelAndView("board");
		
		List<BoardDTO> list = bs.getList(type, search);
		mav.addObject("list", list);
		
		return mav;
	}
	@GetMapping("/board/{idx}")
	public ModelAndView board(@PathVariable int idx) {
		// @PathVariable : 주소상의 특정 값을 매개변수로 받을 수 있다
		ModelAndView mav = new ModelAndView("view");
		BoardDTO dto = bs.getBoard(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	@GetMapping("/write")
	public String board() {
		return "write";
	}
}
