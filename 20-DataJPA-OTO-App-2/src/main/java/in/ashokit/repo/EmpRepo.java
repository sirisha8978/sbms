package in.ashokit.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp,Integer>{

	 public Optional<Emp> findById(int id);

	

}
