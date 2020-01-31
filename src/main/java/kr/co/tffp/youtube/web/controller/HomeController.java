package kr.co.tffp.youtube.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home.hta")
	public String home() {
		
		return "home";
	}
}
