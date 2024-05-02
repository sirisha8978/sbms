package in.ashokit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepository;
import in.ashokit.service.ProductService;

@Controller
	public class ProductController {

	    @Autowired
	    private ProductService productService;

	    @GetMapping("/")
	    public ModelAndView loadForm() {
	    	ModelAndView mav=new ModelAndView();
	    	mav.addObject("pobj",new Product());
	    	mav.setViewName("index");
	    	return mav;
	    }
	    @PostMapping("/product")
	    public ModelAndView saveProduct(Product pobj) {
	    	ModelAndView mav=new    ModelAndView();
	    	boolean status = productService.saveProduct(pobj);
	    	if(status) {
	    		mav.addObject("smsg","Product saved");
	    	}else {
	    		mav.addObject("error","product not saved");
	    	}
	    	mav.addObject("pobj",new Product());
	    	mav.setViewName("index");
	    	return mav;
	    }
	    @GetMapping("/products")
	    public ModelAndView viewProducts() {
	    	List<Product> productsList= productService.getAllProducts();
	    	ModelAndView mav=new ModelAndView();
	    	mav.addObject("plist",productsList);
	    	mav.setViewName("data");
	    	return mav;
	    }	
	    @GetMapping("/edit/{id}")
	    public ModelAndView editProductForm(@PathVariable("id") Long id) {
	        ModelAndView mav = new ModelAndView();
	        Product product = productService.getProductById(id);
	        mav.addObject("product", product);
	        mav.setViewName("edit-form");
	        return mav;
	    }
	   /* @GetMapping("/delete/{id}")
	    public ModelAndView deleteProduct(@PathVariable("id") Long id) {
	        ModelAndView mav = new ModelAndView();
	        productService.deleteProduct(id);
	        mav.setViewName("redirect:/products");
	        return mav;
	    }
	    @PostMapping("/update/{id}")
	    public ModelAndView updateProduct(@PathVariable("id") Long id, @ModelAttribute("product") Product product) {
	        ModelAndView mav = new ModelAndView();
	        productService.updateProduct(id, product);
	        mav.setViewName("redirect:/products");
	        return mav;
	    }*/
}
	 
	    
	    
