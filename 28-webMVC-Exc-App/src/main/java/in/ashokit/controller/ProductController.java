package in.ashokit.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import in.ashokit.exception.ProductNotFoundException;

public class ProductController {
	
	@GetMapping("/product{pid}")
	public String getProduct(@PathVariable("pid")Integer pid,Model model) throws Exception{
		
		if(pid >=50) {
			throw new ProductNotFoundException("Invaild product id");
		}
		model.addAttribute("msg","product Name:mouse");
		
		return "index";
	}

}
