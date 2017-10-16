package com.springWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringWebTestController 
{
	String message = "Hello there";
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView getModelTest(@RequestParam (value = "name", defaultValue="GO Bruins!") String name)
	{
		ModelAndView myView = new ModelAndView();
		myView.setViewName("helloworld");
		myView.addObject("message", message);
		myView.addObject("name", name);
		return myView;
	}
}
