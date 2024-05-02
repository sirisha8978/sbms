package in.ashokit.Service;


import java.util.List;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Service;

import in.ashokit.Entity.Employee;
import in.ashokit.repo.EmpRepo;

@Service
public class EmpService {
	@Autowired
	private EmpRepo empRepo;
	
	public EmpService(EmpRepo repo) {
		this.empRepo=repo;
	}
	 
	public void getAllEmps() {
		List<Employee> emps= empRepo.findAll();
		emps.forEach(e->System.out.println(e));
	 }
	
  public void getAllEmpsSort() {
		Sort sort=Sort.by("esalary").ascending();
		List<Employee> emps= empRepo.findAll();
		emps.forEach(e->System.out.println(e));
	 }
  
  
  public void getAllEmpsPagination() {
	  int pageSize=5;  //fixed value
	  int pageNumber=1;  // will come from UI
	  
	  PageRequest pg = PageRequest.of(pageNumber-1, pageSize);

	  Page page = (Page) empRepo.findAll(pg);

	  List<Employee> emps= empRepo.findAll();
	  
		emps.forEach(e->System.out.println(e));
	 }
  
  
  public void getAllEmpsWithFilter() {
	  Employee entity= new Employee();
	  entity.setEname("maha");
	  Example<Employee> example=Example.of(entity);
	   List<Employee> emps= empRepo.findAll(example);
	  
		emps.forEach(e->System.out.println(e));
	 }
  
 
  }
	
	
	
		
	
	


