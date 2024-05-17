package com.example.firstProjectSB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TController {
    
	@GetMapping("/testfront")
    public String viewHomePage(Model model) {
        model.addAttribute("testtest", "test");
        return "index";
    }
}