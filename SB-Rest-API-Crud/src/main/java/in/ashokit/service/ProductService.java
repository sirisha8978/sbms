package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepository;




@Service
public class ProductService {
	@Autowired
	private ProductRepository prepo;

	public List<Long> getAllProducts() {

		return prepo.findAll();

	}
	public Long getProductById(long id) {
		return prepo.findById(id).orElse(null);
		
	}
	public Product saveProduct(Product product) {
		
		return prepo.save(product);
		
	}
	public void deleteProduct(long id) {
		prepo.deleteById(id);
	}
	
}

