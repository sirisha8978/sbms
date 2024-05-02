package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Course;

public interface CourseRepository extends JpaRepository<Course,Long> {

	
	List<Course>findByFeeLessThan(double fee);
}
