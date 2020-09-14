package kr.co.farmstory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

	@GetMapping("/board/write")
	public String write(String group, Model model) {
		model.addAttribute("group", group);
		return "/board/write";
	}
	
	@GetMapping("/board/list")
	public String list(String group, Model model) {
		model.addAttribute("group", group);		
		return "/board/list";
	}
	
	@GetMapping("/board/view")
	public String view(String group, Model model) {
		model.addAttribute("group", group);
		return "/board/view";
	}
	
	@GetMapping("/board/modify")
	public String modify(String group, Model model) {
		model.addAttribute("group", group);
		return "/board/modify";
	}
	
	@GetMapping("/board/delete")
	public void delete() {}
	
}
