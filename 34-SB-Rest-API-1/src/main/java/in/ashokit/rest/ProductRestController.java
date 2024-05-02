package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Product;

@RestController
public class ProductRestController {
	
	@GetMapping(value="/product")
			//produces= {"appliaction/xml","appliaction/json"}
			//)
	public ResponseEntity<Product > getProduct(){
		
		Product p=new Product(101,"mouse",7300);
		return new ResponseEntity<>(p,HttpStatus.OK);
	}
	
	@PostMapping(
			value="/product",
			consumes= {"application/xml","appliaction/json"},
			produces="text/plain"
			)
	
	public ResponseEntity<String> addProduct(@RequestBody Product p){
		System.out.println(p);
		return new ResponseEntity<String>("product added",HttpStatus.CREATED);
	}

}
