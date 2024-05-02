package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepository;

@Service
	public interface ProductService {
	public boolean saveProduct(Product p) ;
		
		public List<Product> getAllProducts();

		public Product getProductById(Long id);

		public void deleteProduct(Long id);

		public void updateProduct(Long id, Product product);

		


	}

	


