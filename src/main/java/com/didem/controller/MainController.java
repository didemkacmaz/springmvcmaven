package com.didem.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(MainController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response) {
		logger.info("Spring Example Has Come");
		ModelAndView model = new ModelAndView();
		model.addObject("objName", "Hello World");
		model.setViewName("index");
		return model;

	}

}