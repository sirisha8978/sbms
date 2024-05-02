package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

	
   List<Student>findByNameContaining(String name);
}
