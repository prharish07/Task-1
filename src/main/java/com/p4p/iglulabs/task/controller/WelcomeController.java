package com.p4p.iglulabs.task.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model ,ModelMap modelMap) {
		model.put("message", this.message);
		modelMap.addAttribute("MyMessage", "I am Harish");
		return "welcome";
	}
	
	@RequestMapping("/bootStrap")
	public String bootStrap(Map<String,Object> model,ModelMap modelMap) {
		
		model.put("message","HARISH");
		modelMap.addAttribute("MyMessage", "I am Harish");
		
		return "BootStrapDemo1";
	}
	
	@RequestMapping("/taskDashboard")
	public String taskDashBoard(Map<String,Object> model,ModelMap modelMap) {
		
		model.put("message","HARISH");
		modelMap.addAttribute("MyMessage", "I am Harish");
		
		return "TaskDashboard";
	}

}
