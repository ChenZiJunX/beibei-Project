package com.beibei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowPageController {
	
	@RequestMapping(value="")
	public String showIndex(){
		return "index";
	}
	
	@RequestMapping(value="/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
}
