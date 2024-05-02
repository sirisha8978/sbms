package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo pro;
	public  boolean saveProduct(Product p) {
		p.setName(p.getName());
		p.setPrice(p.getPrice());
		p.setQty(p.getQty());
		
		pro.save(p);
		
		return true;
		}
	public List<Product> getproduct1(){
		List<Product> all=pro.findAll();
		return all;
		
	}
	public Object getproduct() {
		// TODO Auto-generated method stub
		return null;
	}
}
	
	
	


