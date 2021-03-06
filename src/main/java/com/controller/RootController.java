package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.annotations.Layout;

@Controller
public class RootController {
	
	@Layout(value = "layouts/main")
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public String home(){
		return "home";
	}
	
	@Layout(value = "layouts/main2")
	@RequestMapping(value = "/login",method=RequestMethod.GET)
	public String login(){
		return "login";
	}

}
