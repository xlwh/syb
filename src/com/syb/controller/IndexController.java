package com.syb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/syb")
public class IndexController {
	
	@RequestMapping("/index.do")
	public @ResponseBody String index(){
		return "hello";
	}
}
