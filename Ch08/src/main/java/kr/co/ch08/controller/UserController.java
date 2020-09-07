package kr.co.ch08.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.ch08.service.UserService;
import kr.co.ch08.vo.UserVO;

@Controller
public class UserController {
	
	@Inject
	private UserService service;

	@RequestMapping("/user/register")
	public String register() {
		return "/user/register";
	}
	
	@RequestMapping(value = "/user/register", method = RequestMethod.POST)
	public String register(UserVO vo) {
		service.insertUser(vo);
		return "redirect:/user/list";
	}
	
	@RequestMapping("/user/list")
	public String list(Model model) {
		
		List<UserVO> users = service.selectUsers();
		
		model.addAttribute("users", users);
		
		return "/user/list";
	}
	
	
}
