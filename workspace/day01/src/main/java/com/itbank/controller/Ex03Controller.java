package com.itbank.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.Person;

@Controller
public class Ex03Controller {
	
	@GetMapping("/ex03")
	public void ex03() {}
	
	@PostMapping("/ex03")
	public ModelAndView ex03(int n1, int n2) {
		ModelAndView mav = new ModelAndView();
		// jsp 이름을 지정할 viewName과
		// attribute를 저장하는 Model을 합쳐놓은 객체
		
		int sum = n1 + n2;
		
		mav.setViewName("ex03Result");
		// - view 이름 (=jsp)을 지정
		
		mav.addObject("sum", sum);
		
		return mav;
	}
	
	@GetMapping("/ex04")
	public void ex04() {}
	
	@PostMapping("/ex04")
	public ModelAndView ex04(Person dto) {
		ModelAndView mav = new ModelAndView("ex04Result");
		// - viewName 은 stter 혹은 생성자로 지정가능
		
		String result = dto.getAge() >= 20 ? "Adult" : "Teenager";
		
		String msg = "%s님은 %d세로 %s입니다";
		
		msg = String.format(msg, dto.getName(), dto.getAge(), result);
		
		mav.addObject("msg", msg);
		
		return mav;
	}
	
	@GetMapping("/ex05")
	public void ex05() {}
	
	@PostMapping("/ex05")
	public ModelAndView ex05(@RequestParam HashMap<String, Object> map) {
//		@RequestParam은 파라미터를 매개변수로 받을 때 선언하는 어노테이션
//		- 일반적인 경우엔 생략이 가능한데, Map 객체로 받을 땐 꼭 선언하여야 한다
//		- Map은 다른 용도로도 사용되기 때문에 정확한 명시가 필요하다

		ModelAndView mav = new ModelAndView("ex05Result");
		
		String name = (String)map.get("name");
		String sAge = (String)map.get("age");
		
		int age = Integer.parseInt(sAge);
		
		String result = age >= 20 ? "Adult" : "Teenager";
		
		String msg = "%s님은 %d세로 %s입니다";
		
		msg = String.format(msg, name, age, result);
		
		mav.addObject("msg", msg);
		
		return mav;
	}
	
	
}
