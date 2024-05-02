package in.ashokit.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

public class Student {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int age;
	private String dept;
	
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinTable(name="STUDENT_COURSE_TABLE",
	joinColumns= {
			@JoinColumn(name="student_id",referencedColumn="id")
	},
	inverseJoinColumns(name="course_id",referencedColumn="id")
	)
	private Set<Course> course;
}


