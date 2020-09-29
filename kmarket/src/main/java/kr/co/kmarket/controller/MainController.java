package kr.co.kmarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.kmarket.service.MainService;
import kr.co.kmarket.vo.Category1Vo;

@Controller
public class MainController {
	
	@Autowired
	private MainService service;

	@GetMapping(value={"/", "/index"})
	public String index(Model model) {
		
		List<Category1Vo> cate1List = service.selectCate1();
		model.addAttribute("cate1List", cate1List);
		
		return "/index";
	}
}
