package kr.co.kmarket.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.kmarket.admin.service.AdminProductService;
import kr.co.kmarket.vo.ProductsVo;

@Controller
public class AdminProductController {

	@Autowired
	private AdminProductService service;
	
	@GetMapping("/admin/product/list")
	public String list(Model model) {
		
		List<ProductsVo> products = service.selectProducts();
		model.addAttribute("products", products);
		
		return "/admin/product/list";
	}
	
	@GetMapping("/admin/product/register")
	public String register() {
		return "/admin/product/register";
	}
	
}
