package in.ashokit.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import in.ashokit.repo.CourseRepository;
import in.ashokit.repo.StudentRepository;

@RestController
@RequestMapping("/student/course")
public class StudentCourseController {
	
	private StudentRepository studentRepository;
	private CourseRepository courseRepository;
	
	public StudentCourseController(StudentRepository studentRepository,CourseRepository courseRepositor) {
		this.studentRepository=studentRepository;
		this.courseRepository=courseRepository;
		
	}
	@PostMapping
	public Student saveStudentWithCourse(@RequestBody Student student) {
		return studentRepository.save(student);
		
	}
	@GetMapping
	public List<Student> findAllStudents(){
		return studentRepository.findAll();
	}
	

}
