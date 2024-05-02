package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Employee;
@Repository
public interface EmpRepository extends CrudRepository<Employee,Integer> {

	@Query("from Employee")
	public List<Employee> getAllEmpsHQL();	
	
	@Query("from Employee where eid=:eid")
	public Employee getEmpById(Integer eid);
	
	@Query(value=" select * from employee ", nativeQuery= true)
	public List<Employee> getAllEmpsSQL();
	
	//select* from employee where ename=:ename;
	public List<Employee> findByEname(String ename);
	
	//select * from employee where esalary=:esalary
	public List<Employee> findByEsalary(Double salary);
	
	//select * from employee where esalary>=:esalary
	public List <Employee> findByEsalaryGreaterThanEqual(double salary);

	
	//select * from employee where ename=:ename
	//public List<Employee> findByEnmaeEndsWith(String ename ,'a');
}
