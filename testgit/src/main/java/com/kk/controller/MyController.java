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
			System.out.println("sdfas---");
			
		}
		else {
			System.out.println("sdsdffas---");
		}
		
		int i = 3;
		while(i < 20) {
			
			System.out.println("sadfasdffas---");
		}
		
		System.out.println("zznn---");
		
		return "a";
	}
	
	
}
