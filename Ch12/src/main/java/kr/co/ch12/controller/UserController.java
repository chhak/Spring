package kr.co.ch12.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ch12.service.UserService;
import kr.co.ch12.vo.UserVo;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/user/register")
	public String register() {
		return "/user/register";
	}
	
	@PostMapping("/user/register")
	public String register(UserVo vo) {
		
		service.insertUser(vo);
		
		return "redirect:/user/list";
	}
	
	@GetMapping("/user/list")
	public String list() {
		return "/user/list";
	}
	
}
