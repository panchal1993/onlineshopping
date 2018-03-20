package net.sc.onlineshopping.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		// mv.addObject("greeting", "Welcome to Spring Web MVC");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		return mv;
	}

	// this is for the about page, providing a view in a form of a page and passing
	// attributes
	// to the main page.jsp
	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		// mv.addObject("greeting", "Welcome to Spring Web MVC");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		// mv.addObject("greeting", "Welcome to Spring Web MVC");
		mv.addObject("title", "Contact");
		mv.addObject("userClickContact", true);
		return mv;
	}

	// This block to pass the values using url, but it becomes lengthy
	// http://localhost:8080/onlineshopping/test?greeting=Welcome%20Bitch
	// @RequestMapping(value="/test")
	// public ModelAndView test(@RequestParam("greeting")String greeting) {
	// ModelAndView mv = new ModelAndView("page");
	// mv.addObject("greeting", greeting);
	// return mv;
	// }
	// This block is used to pass the values using simple url dynamically we can use
	// / to pass tha values
	// http://localhost:8080/onlineshopping/test/Welcome bitch
	// @RequestMapping(value="/test/{greeting}")
	// public ModelAndView test(@PathVariable("greeting")String greeting) {
	// if(greeting == null) {
	// greeting = "Null";
	// }
	// ModelAndView mv = new ModelAndView("page");
	// mv.addObject("greeting", greeting);
	// return mv;
	// }
}
