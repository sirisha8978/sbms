package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.entity.Product;
import in.ashokit.service.ProductService;
@Controller
public class ProductController {
	
	@Autowired
	private ProductService ps;
	
	@GetMapping("/product")
	public ModelAndView LocalPage(){
	ModelAndView mav=new ModelAndView();
	mav.addObject("proObj",new Product());
	mav.setViewName("index");
	
	return mav;
	}
	@PostMapping("/product")
	public ModelAndView savepage(Product p){
		ModelAndView mv=new ModelAndView();
		if(ps.saveProduct(p)) {
			mv.addObject("proObj", new Product());
			mv.addObject("product","productsaved");
			}
		mv.setViewName("index");
		return mv;
		}
	@GetMapping("/data")
	public ModelAndView getAllProducts() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("get",ps.getproduct());
		mv.setViewName("data");
		return mv;
	}
	
	

}
