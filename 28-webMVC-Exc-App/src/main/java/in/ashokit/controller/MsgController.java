
package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {
	
	@GetMapping("/greet")
	public String getGreet(Model model) {
	
		model.addAttribute("msg", "Hi");
		
		return "index";
	}
	
	@GetMapping("/welcome")
	public String getWelcome(Model model) {
	
		model.addAttribute("msg", "welcome to website");
		
		return "index";
	}
	@ExceptionHandler(value=ArithmeticException.class)
	public String handleAe(ArithmeticException ae) {
		return "exView";
	}

}
