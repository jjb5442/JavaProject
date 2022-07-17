package com.itbank.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.BoardDTO;
import com.itbank.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService bs; 
	
	@GetMapping("/board")
	public ModelAndView board(Integer page, String type, String search) {
		ModelAndView mav = new ModelAndView("board");
		
		Map<String, Object> map = bs.getList(page, type, search);
		mav.addObject("list", map.get("list"));
//		mav.addObject("pageCount", map.get("pageCount"));
//		mav.addObject("start", map.get("start"));
//		mav.addObject("end", map.get("end"));
		mav.addObject("p", map.get("p"));
		
		return mav;
	}
	@GetMapping("/board/{idx}")
	public ModelAndView board(@PathVariable int idx, Integer page, String type, String search) {
		// @PathVariable : 주소상의 특정 값을 매개변수로 받을 수 있다
		ModelAndView mav = new ModelAndView("view");
		BoardDTO dto = bs.getBoard(idx);
		Map<String, Object> map = bs.getList(page, type, search);
		mav.addObject("list", map.get("list"));
		
		mav.addObject("p", map.get("p"));
		mav.addObject("dto", dto);
		
		return mav;
	}
	@GetMapping("/write")
	public String board() {
		return "write";
	}
	@PostMapping("/write")
	public String write(BoardDTO dto) {
		int row = bs.write(dto);
		System.out.println(row == 1 ? "sucess" : "fail");
		return "redirect:/board";
	}
	@GetMapping("/modify/{idx}")
	public ModelAndView modify(@PathVariable int idx) {
		ModelAndView mav = new ModelAndView("write");
		BoardDTO dto = bs.getBoard(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	@PostMapping("/modify/{idx}")
	public String modify(@PathVariable int idx, BoardDTO dto) {
		int row = bs.modify(dto);
		System.out.println(row == 1 ? "sucess" : "fail");
		return "redirect:/board/" + idx;
	}
	@GetMapping("/delete/{idx}")
	public String delete(@PathVariable int idx) {
		int row = bs.delete(idx);
		System.out.println(row == 1 ? "sucess" : "fail");
		return "redirect:/board";
	}
}
