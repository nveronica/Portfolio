package hu.citec.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PortfolioController {
	
	@GetMapping("/home")
	public String homePage() {
		return "home";
	}
	
}
