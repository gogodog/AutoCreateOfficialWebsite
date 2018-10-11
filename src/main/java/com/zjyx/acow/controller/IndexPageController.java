package com.zjyx.acow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/page")
public class IndexPageController {

	@RequestMapping("/index")
	public ModelAndView helloworld(){
		ModelAndView mv = new ModelAndView("views/page/index");
		return mv;
	}
}
