package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.rsocket.RSocketProperties.Server.Spec;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;
import in.ashokit.repo.productRepo;
import in.ashokit.spec.ProductSpecification;

@Service
public  class Productservice {
	
	@Autowired
	private productRepo repo;
	
	
	public void getProducts() {
		List<Product> findAll=repo.findAll();
		findAll.forEach(System.out::println);
	}
	
     public void saveProducts() {
    	 Product p1= new Product();
    	 p1.setCategory("computers");
    	 p1.setName("mouse");
    	 p1.setPrice(1000.00);
    	 
    	 Product p2= new Product();
    	 p2.setCategory("computers");
    	 p2.setName("keyboard");
    	 p2.setPrice(5000.00);
    	 
    	 Product p3= new Product();
    	 p3.setCategory("computers");
    	 p3.setName("monitor");
    	 p3.setPrice(4000.00);
    	 
    	 repo.saveAll(Arrays.asList(p1,p2,p3));
    	 
     }

	public void saveProducts1() {
		// TODO Auto-generated method stub
	}
		
		

	public void getProductSpec(Object object, double d, double e) {
		// TODO Auto-generated method stub
		
	}


}
