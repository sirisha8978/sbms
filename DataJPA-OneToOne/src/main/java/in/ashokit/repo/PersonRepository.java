package in.ashokit.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Person;

public interface PersonRepository extends JpaRepository <Person,Integer> {

	

	 

}
