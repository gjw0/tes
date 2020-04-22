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
		if(1 > 0) {
			System.out.println("mmm---");
		}
		else {
			System.out.println("liwe---");
		}
		
		String a = "dsf";
		
		System.out.println("zznn---");
		
		return "a";
	}
	
	
}
