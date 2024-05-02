package in.ashokit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmpRepository;

@Service
public class EmpService {
	
	private EmpRepository empRepo;
	
	public EmpService(EmpRepository empRepo) {
		this.empRepo=empRepo;
		}
	public void calCustomQueries() {
		//List<Employee> emps=empRepo.getAllEmpsHQL();
		//emps.forEach(System.out::println);
		
		//Employee empById=empRepo.getEmpById(101);
		//System.out.println(empById);
		
		List<Employee> emps=empRepo.getAllEmpsSQL();
		emps.forEach(System.out::println);
	}
	
	public void callFindByMethods() {
		List<Employee> emps=empRepo.findByEsalaryGreaterThanEqual(3000.00);
		emps.forEach(System.out::println);
	}
	
	
	public void getEmps() {
		Iterable<Employee> emps=empRepo.findAll();
		emps.forEach(System.out::println);
	}
	
	public void getEmps(List<Integer> eids) {
		Iterable<Employee> emps=empRepo.findAllById(eids);
		emps.forEach(e->System.out.println(e));
	}
	
	public void getEmps(Integer eid) {
		Optional<Employee> findById=empRepo.findById(eid);
		if(findById.isPresent()) {
			Employee employee=findById.get();
			System.out.println(employee);
			}else {
				System.out.println("Records Not Found");
			}
	}
	
	public  void saveEmps() {
		
		Employee e1=new Employee(101,"siri",1000.00);
		Employee e2=new Employee(102,"sri",5000.00);
		Employee e3=new Employee(103,"vinni",8000.00);
		
		List<Employee> emps=Arrays.asList(e1,e2,e3);
		
		empRepo.saveAll(emps);
		
		System.out.println("Records saved...");
	}
	
	public void saveEmployee() {
		System.out.println("Impl class:"+ empRepo.getClass().getName());
		
		Employee e=new Employee();
		
		e.setEid(204);
		e.setEname("manju");
		e.setEsalary(8500.00);
		//inserting record based on given object
		empRepo.save(e);
		
		System.out.println("record saved...");
	
		}

/*	public void callFindByMethods() {
		List <Employee> emps= empRepo.findByEname("maha");
		emps.forEach(System.out::println);
	}*/
	
		
	}
	


