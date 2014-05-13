package org.dinosaur.skeleton.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String index(ModelMap model){
		model.put("sayHi", "Hi I'm tester..."+HomeController.class);
		return "home";
	}
}
