package in.ashokit.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Product;



public interface ProductRepository extends JpaRepository<Long,Product>{

	Product save(Product product);

	void deleteById(long id);

    Optional<Long> findById(long id);

	

}

