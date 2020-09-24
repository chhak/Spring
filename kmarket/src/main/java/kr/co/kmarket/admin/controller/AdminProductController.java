package kr.co.kmarket.admin.controller;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import kr.co.kmarket.admin.persistence.AdminCategory1Repo;
import kr.co.kmarket.admin.persistence.AdminCategory2Repo;
import kr.co.kmarket.admin.service.AdminProductService;
import kr.co.kmarket.vo.Category1Vo;
import kr.co.kmarket.vo.Category2Vo;
import kr.co.kmarket.vo.ProductsVo;

@Controller
public class AdminProductController {

	@Autowired
	private AdminProductService service;
	@Autowired
	private AdminCategory1Repo cate1Repo;
	@Autowired
	private AdminCategory2Repo cate2Repo;
	
	@GetMapping("/admin/product/list")
	public String list(Model model, String pg) {
		
		int start = service.getLimitStart(pg);
		int total = service.selectCountProducts();
		int pageEnd = service.getPageEnd(total);
		
		List<ProductsVo> products = service.selectProducts(start);
		model.addAttribute("products", products);
		model.addAttribute("pageEnd", pageEnd);
		model.addAttribute("currentPg", pg);
		
		return "/admin/product/list";
	}
	
	@GetMapping("/admin/product/register")
	public String register() {
		return "/admin/product/register";
	}
	
	@PostMapping("/admin/product/register")
	public String register(ProductsVo vo, HttpServletRequest req) throws Exception {
		
		
		service.uploadThumb(vo);
		
		vo.setIp(req.getRemoteAddr());
		vo.setRdate(LocalDateTime.now().toString());
		
		service.insertProduct(vo);
		
		
		return "redirect:/admin/product/register";
	}
	
	@ResponseBody
	@GetMapping("/admin/product/cate1")
	public List<Category1Vo> getCate1() {
		return cate1Repo.findAll();
	}
	
	@ResponseBody
	@GetMapping("/admin/product/cate2")
	public List<Category2Vo> getCate2(int code1) {
		return cate2Repo.findByCode1OrderBySeq(code1);
	}
}







