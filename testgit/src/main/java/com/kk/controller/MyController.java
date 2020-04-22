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
			System.out.println("zzasdfasdnn---");
			
		}
		int i = 0;
		while(i<10) {
			System.out.println("zznn---");
			i++;
			
		}
		System.out.println("sasdfasdfasdf---");
		return "a";
	}
	
	
}
