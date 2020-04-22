package com.kk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping("/a")
	@ResponseBody
	public String a() {
		
		System.out.println("aann---");
		if(true) {
			System.out.println("asdflask");
			
		}
		int i = 0;
		while(i<10) {
			System.out.println("sdfs");
			i++;
			
		}
		System.out.println("asdfsa---");
		
		return "a";
	}
	
	
}
