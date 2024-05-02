package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import in.ashokit.entity.Product;
import in.ashokit.service.ProductService;

public class ProductController {
	
		@Autowired
	private ProductService pService;
		
		@GetMapping("/get")
		public List<Long> getAllProduct(){
			return pService.getAllProducts();
			}
		
		@GetMapping("/{id}")
		public Long getProductById(@PathVariable Long id) {
			
			return pService.getProductById(id);
			
		}
		@PostMapping("/post")
		public Product saveProduct(@RequestBody Product product) {
			return pService.saveProduct(product);
			
		}
		@DeleteMapping("{id}")
		public void deleteById(@PathVariable Long id) {
			pService.deleteProduct(id);
		}
		
	}




