package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private  ProductRepo productRepo;
	
	 public void saveProduct() {
		 
	 Product p=new Product();
	p.setPid(2);
	p.setName("mouse");
	p.setPrice(2000.00);
	
	productRepo.save(p);
	System.out.println("product saved...");
	
	 }
	

}
