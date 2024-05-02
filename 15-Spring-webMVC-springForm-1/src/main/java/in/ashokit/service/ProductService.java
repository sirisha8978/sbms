package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;
import in.ashokit.repo.productrepo;

@Service
public class ProductService {

	@Autowired
private static	productrepo repo;
	
	
	public static  boolean saveProduct(Product p) {
		System.out.println("hii");
		p.setName(p.getName());
		p.setPrice(p.getPrice());
		p.setQty(p.getQty());
		
		repo.save(p);
		
		return true;
		}
	public List<Product> getproduct1(){
		List<Product> all=repo.findAll();
		return all;
	}
	public static boolean deleteRecords(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
	public static Object getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}
	public static Optional<Product> getProductById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
		
	}

