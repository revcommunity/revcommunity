package org.revcommunity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.revcommunity.util.Message;

@Controller
@RequestMapping("/test")
public class Test {

	@RequestMapping(value = "/test")
	public @ResponseBody Message test(){
		return new Message("Servlet Response !");
	}

}
