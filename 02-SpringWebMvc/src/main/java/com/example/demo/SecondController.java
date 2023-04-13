package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class SecondController {
	@GetMapping("/work")
	public String someWork(Model model) {
		model.addAttribute("message","doing some work...");
		return "index";
	}
	
	@GetMapping("/java")
	public String someOtherWork(Model model) {
		model.addAttribute("message","doing some otherrr  work...");
		return "index";
	}
	
	@GetMapping("/job")
	public String someJob(Model model) {
		model.addAttribute("message","doing some jobbb...");
		return "index";
	}
	
	@GetMapping
	public String someOtherJob(Model model) {
		model.addAttribute("message","doing some otherrr  job...");
		return "index";
	}
	
	@PostMapping
	public String someOtherSomeJob(Model model) {
		model.addAttribute("message","doing some otherrr   some other job...");
		return "index";
	}

}
