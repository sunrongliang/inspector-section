package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("index")
	private String index() {
		return "main";
		
	}
	
	@RequestMapping("goto_org")
	private String goto_org() {return "organization";}
	
	@RequestMapping("goto_emp")
	private String goto_emp() {return "employee";}
	
	@RequestMapping("goto_pos")
	private String goto_pos() {return "position";}

}
