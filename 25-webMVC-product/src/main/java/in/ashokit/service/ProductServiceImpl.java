package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
@Autowired
	private ProductRepository productRepo;
	
	@Override
	public boolean saveProduct(Product p) {
		Product savedPro=productRepo.save(p);
		
		return savedPro.getPid() !=null;
	}

	@Override
	public List<Product> getAllProducts() {
		
		return productRepo.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProduct(Long id, Product product) {
		// TODO Auto-generated method stub
		
	}

	/*@Override
	public void deleteProduct(Long id) {
        ProductRepository.deleteById(id);

		}

	@Override
	public void updateProduct(Long id, Product product) {
		 Product existingProduct = getProductById(id);
	        existingProduct.setName(product.getName());
	        existingProduct.setPrice(product.getPrice());
	        existingProduct.setQty(product.getQty());
	        ProductRepository.save(existingProduct);
	    }*/
		
	}


