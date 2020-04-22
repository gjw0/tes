package com.kk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping("/a")
	@ResponseBody
	public String a() {
		
		System.out.println("ccnn---");
		System.out.println("nnnn---");

		System.out.println("ak22---");
		System.out.println("ak22--");
		
		return "a";
	}
	
	
}
