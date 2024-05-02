package in.ashokit.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {

	@GetMapping("/user")
	public String getUser(Model model) {
	
		model.addAttribute("msg", "sirisha mannuva");
		
		return "index";
	}
}
