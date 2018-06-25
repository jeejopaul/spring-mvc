package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVTwo")
	public String processFormAllCaps(HttpServletRequest request, Model model) {	
		String name = request.getParameter("studentName");
		name = name.toUpperCase();
		model.addAttribute("message", name);
		return "helloworld";
	}
	
	@RequestMapping("/processFormVThree")
	public String processFormAllLower(@RequestParam("studentName") String theName, Model model) {
		theName = theName.toLowerCase();
		model.addAttribute("message", theName);
		return "helloworld";
	}

}
