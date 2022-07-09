package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// Spring Bean : Spring이 직접 관리하는 객체
// - 프로그램 실행 시 객체를 만들어 두고 제공하게 된다
// 
// Spring Container : Spring이 Spring Bean(객체)을 모아서 보관하는 공간

@Controller		// Spring Bean 으로 등록
@RequestMapping("/ex02")
public class Ex02Controller {

	@GetMapping				// 경로가 필요 없으면 생략 가능
	public void ex02() {	// 반환형이 void면 요청주소와 동일한 이름의 jsp로 포워드
		
	}
	
	@PostMapping 
	public String ex02(int n1, int n2, Model model) {
		int sum = n1 + n2;
		
		model.addAttribute("sum", sum);
		// - request 대신에 jsp에 attribute를 전달할 수 있는 객체
		// - 작성이 더 수월하게 필요한 기능만 빼놓은 객체라고 생각
		
		return "ex02Result";
	}
}
