package hu.citec.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController{
	
	@GetMapping("/home")
	public String homePage() {
		return "home";
	}
	
	@GetMapping("/aboutMe")
	public String aboutMe() {
		return "about";
	}
	
}
