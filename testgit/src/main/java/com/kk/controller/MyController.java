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
		int m = 4;
		while(m < 10) {
			System.out.println("sdfasdf");
			m++;
		}
		if(true) {
			System.out.println("sfasdfasdfsdfsadff");
		}
		System.out.println("zznn---");
		
		return "a";
	}
	
	
}
