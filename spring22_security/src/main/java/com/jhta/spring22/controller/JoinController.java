package com.jhta.spring22.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jhta.spring22.service.MyUsersService;
import com.jhta.spring22.vo.MyUsersVo;

@Controller
public class JoinController {
	
	@Autowired private MyUsersService service;
	
	@GetMapping("/join")
	public String joinForm() {
		return "join";
	}
	@PostMapping("/join")
	public String join(MyUsersVo vo,Model model) {
		try {
			service.addUser(vo);
			model.addAttribute("code","success");
		}catch(Exception e) {
			e.printStackTrace();
			model.addAttribute("code","fail");
		}
		return "result";
	}
}
















