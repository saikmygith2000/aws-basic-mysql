package com.example.demo.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.ProductsService;

@Controller
public class HomeController {

	@Autowired
	public ProductsService productsService;
	
	@GetMapping("/")
	public String getHome(Model model) {
		model.addAttribute("products", productsService.getAllProducts());
		return "index";
	}
}
