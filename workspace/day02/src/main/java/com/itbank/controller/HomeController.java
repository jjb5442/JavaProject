package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.BookDTO;
import com.itbank.service.BookService;

@Controller
public class HomeController {
	
	@Autowired		// 스프링 컨테이너에서 일치하는 자료형 객체를 자동으로 찾아서 주입
	private BookService bs;
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		String ver = bs.getVersion();
		List<BookDTO> list = bs.getList();
		
		mav.addObject("ver", ver);
		mav.addObject("list", list);
		
		return mav;
	}
	
	@PostMapping("/")
	public ModelAndView home(String search) {
		ModelAndView mav = new ModelAndView("home");
		List<BookDTO> list = bs.getList(search);
		
		mav.addObject("list", list);
		
		return mav;
	}
}
