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
		int i = 0;
		while(i<10) {
			System.out.println("zznn---");
			i++;
		}
		String name = "dfasdfsa";
		if (true) {
			int ass = 4;
			System.out.println("asdfaswersdfasdf");
		}
		System.out.println("sadfsadfwerw---");
		return "a";
	}
	
	
}
