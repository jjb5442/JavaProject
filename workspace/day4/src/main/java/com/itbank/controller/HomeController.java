package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.BookDTO;
import com.itbank.service.BookService;

@Controller
public class HomeController {
	
	@Autowired
	private BookService bs;
	
	@GetMapping("/")
	public ModelAndView home(String search) {
		ModelAndView mav = new ModelAndView("home");
		String ver = bs.getVersion();
		List<BookDTO> list = bs.getList(search); 
		mav.addObject("ver", ver);
		mav.addObject("list", list);
		return mav;
	}
}
