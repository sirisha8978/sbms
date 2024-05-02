package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class MsgController {
	
	@GetMapping("/welcome")
	
	public String welcomeMethod() {
		return " Welcome to Ashok IT";
	}

	@GetMapping("/greet")
	public String greetMethod( Model model) {
		model.addAttribute("msg"," Good Morning");
		return "index";
	}
}



