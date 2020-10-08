package kr.co.kmarket.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.kmarket.service.MainService;
import kr.co.kmarket.service.ShopService;
import kr.co.kmarket.vo.CategoriesVo;
import kr.co.kmarket.vo.ProductsVo;

@Controller
public class ShopController {
	
	@Autowired
	private ShopService service;

	@GetMapping("/shop/search")
	public String search() {
		return "/shop/search";
	}
	
	@GetMapping("/shop/list")
	public String list(int cate1, int cate2, int sort, Model model, HttpSession sess) {
		
		List<ProductsVo> items = service.selectProducts(cate1, cate2, sort);
		String[] tits = service.getTitles(sess, cate1, cate2);
		
		model.addAttribute("tit1", tits[0]);
		model.addAttribute("tit2", tits[1]);
		model.addAttribute("cate1", cate1);
		model.addAttribute("cate2", cate2);
		model.addAttribute("items", items);
		
		return "/shop/list";
	}
	
	@GetMapping("/shop/view")
	public String view(int code, Model model, HttpSession sess) {
		
		ProductsVo vo = service.selectProduct(code);
		String[] tits = service.getTitles(sess, vo.getCate1(), vo.getCate2());
		
		model.addAttribute("tit1", tits[0]);
		model.addAttribute("tit2", tits[1]);
		model.addAttribute(vo);
		
		return "/shop/view";
	}
	
	@GetMapping("/shop/cart")
	public String cart() {
		return "/shop/cart";
	}
	
	@GetMapping("/shop/order")
	public String order() {
		return "/shop/order";
	}
	
	@GetMapping("/shop/order-complete")
	public String orderComplete() {
		return "/shop/order-complete";
	}
}
