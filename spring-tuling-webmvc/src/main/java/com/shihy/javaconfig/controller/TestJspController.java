package com.shihy.javaconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xsls on 2019/8/14.
 */
@Controller
@SessionAttributes(names = {"user"})
public class TestJspController {

	@RequestMapping("/showIndex")
	public ModelAndView index(ModelAndView modelAndView) {
		modelAndView.addObject("user","zhangsan");
		modelAndView.setViewName("a");
		return modelAndView;
	}
	@RequestMapping("/showIndex2")
	public String index2(ModelAndView modelAndView) {
		modelAndView.addObject("user","zhangsan");
		return "a";
	}
}
