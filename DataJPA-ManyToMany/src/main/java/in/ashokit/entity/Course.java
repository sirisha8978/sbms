package in.ashokit.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table (name="COURSE_TBL")
public class Course {
	@Id
	@GeneratedValue
	private Long id;
	private String tittle;
   private int modules;
   private double fee;
   
   @ManyToMany(mappedBy="course",fetch=FetchType.LAZY)
   private Set<Student> students;
   
	

}
