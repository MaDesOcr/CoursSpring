package com.example.firstProjectSB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstThymeleafController {

	@GetMapping("/premierpage")
	public String showFirstPage(Model model) {
		model.addAttribute("premierAttribute", "BONJOUR!");
		return "index2";
	}
	
}
