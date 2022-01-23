package com.jhta.spring22.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	@GetMapping("/member/main")
	public String member() {
		return "member/main";
	}
	
	@GetMapping("/admin/main")
	public String admin() {
		return "admin/main";
	}
}
