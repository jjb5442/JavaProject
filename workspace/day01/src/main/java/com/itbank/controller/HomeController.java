package com.itbank.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
//	@RequestMapping(value = "/ex01", method = RequestMethod.GET)
	@GetMapping("/ex01")		//  spring 4.x 부터 지원되는 어노테이션
	public String ex01() {
		return "ex01";
	}
	
//	@RequestMapping(value = "ex01", method = RequestMethod.POST)
	@PostMapping("/ex01")
	public String ex01(HttpServletRequest request) {
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		
		int sum = n1 + n2;
		
		request.setAttribute("sum", sum);
		
		return "ex01Result";
	}
}
