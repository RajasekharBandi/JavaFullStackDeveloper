package com.capgemini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/greeting")
	public String sayHello(Model model){
		model.addAttribute("greeting", "Narendra");
		return "hello";
	}
}
