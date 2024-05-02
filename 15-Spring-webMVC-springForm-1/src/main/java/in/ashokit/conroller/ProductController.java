package in.ashokit.conroller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.entity.Product;
import in.ashokit.service.ProductService;

@Controller
public class ProductController {

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
		mv.addObject("get",ps.getproduct1());
		mv.setViewName("data");
		return mv;
	}
	 @GetMapping("/success")
	    public ModelAndView getAllProduct() {
	    	ModelAndView mav=new ModelAndView();
	    	mav.addObject("products", ProductService.getAllProducts());
	    	mav.setViewName("success");
			return mav;
	    	
	    }
	    @PostMapping("/dt/{id}")
	    public ModelAndView deleteRecords(@PathVariable Integer id) {
	    	ModelAndView mav= new ModelAndView();
	    	boolean records=ProductService.deleteRecords(id);
	    	if(records) {
	    		mav.addObject("msg1","record deleted");
	    		
	    	}else {
	    		mav.addObject("msg2","records not deleted");
	    	}
			return mav;
	    	
	    }

		
		  @GetMapping("/update/{id}")
		  public ModelAndView editsRecords(@PathVariable Integer id) { 
			  ModelAndView mav=new ModelAndView(); Optional<Product>
		  product=ProductService.getProductById(id); if(product.isPresent()) {
		  mav.addObject("update",product.get());
		  
		  }else { mav.addObject("msg3","product is not available"); }
		  mav.setViewName("edit"); return mav; }
		 
	    @GetMapping("/update")
	    public ModelAndView saveUpdateRecord(Product p) {
	    	ModelAndView mav=new ModelAndView();
	    	boolean saveProduct=ProductService.saveProduct(p);
	    	if(saveProduct) {
	    		mav.addObject("msg4","product updated");
	    		
	    	}else {
	    		mav.addObject("error1","product not updated");
	    	}
	    	mav.setViewName("update");
	    	return mav;
	    }
	    

	    }
	



	
	
	

