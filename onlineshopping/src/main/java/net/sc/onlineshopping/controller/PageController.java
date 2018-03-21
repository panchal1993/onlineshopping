package net.sc.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.sc.shoppingbackend.dao.CategoryDAO;
import net.sc.shoppingbackend.dto.Category;

@Controller
public class PageController {

	// this is to parse the list from back end and
	// to reflect it to the main page
	@Autowired
	private CategoryDAO categoryDAO;

	// Mapping request so that every page with given
	// url form will go through it
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		// mv.addObject("greeting", "Welcome to Spring Web MVC");
		mv.addObject("title", "Home");

		// Passing the list of categories we got from backend

		mv.addObject("categories", categoryDAO.list());

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
	
	//Metod to load all the products
	//and based on category
	
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		// mv.addObject("greeting", "Welcome to Spring Web MVC");
		mv.addObject("title", "All Products");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickAllProducts", true);
		return mv;
	}
	
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		
		//categoryDAO to fetch a single category
		
		Category category = null;
		category  = categoryDAO.get(id);
		// mv.addObject("greeting", "Welcome to Spring Web MVC");
		mv.addObject("title", category.getName());
		mv.addObject("categories", categoryDAO.list());
		
		//passing the individual category
		mv.addObject("category",category);
		mv.addObject("userClickCategoryProducts", true);
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
