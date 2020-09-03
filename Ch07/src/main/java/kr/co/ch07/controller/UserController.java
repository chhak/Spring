package kr.co.ch07.controller;


import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.ch07.service.UserService;
import kr.co.ch07.vo.UserVO;

@Controller
public class UserController {
	
	@Inject
	private UserService service;
	
	
	@RequestMapping(value="/user/register", method=RequestMethod.GET)
	public String register() {
		return "user/register";
	}
	
	
	@RequestMapping(value="/user/register", method=RequestMethod.POST)
	public String registerProc(UserVO vo) {
		
		service.insertUser(vo);
		
		return "user/register";
	}

}















