package in.ashokit.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Address;
import in.ashokit.entity.Employee;
import in.ashokit.repo.AddressRepository;
import in.ashokit.repo.EmployeeRepository;

@Service
public class EmpService {
	@Autowired
	private EmployeeRepository empRepo;
	@Autowired
	private AddressRepository addrRepo;
	
	
	
	public void saveEmployee(){
		 
		Employee e=new Employee();
		e.setEmpName("manju");
		e.setEmpsal(59000.00);
		
		Address a1=new Address();
		a1.setCity("tpkm");
		a1.setState("AP");
		a1.setCountry("India");
		a1.setType("present");
		
		Address a2=new Address();
		a2.setCity("hyd");
		a2.setState("TG");
		a2.setCountry("India");
		a2.setType("future");
		
		a1.setEmp(e);
		a2.setEmp(e);
		
		//e.setAddrList(Arrays.asList(a1,a2));
		
		System.out.println("records inserted...");
		
	}

}
