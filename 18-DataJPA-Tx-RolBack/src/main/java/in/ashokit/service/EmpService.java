package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Address;
import in.ashokit.entity.Emp;
import in.ashokit.repo.AddrRepo;
import in.ashokit.repo.EmpRepo;
import jakarta.persistence.criteria.Expression;
import jakarta.transaction.Transactional;
@Service
public class EmpService {
	
	@Autowired
	private EmpRepo empRepo;
	
	@Autowired
	private AddrRepo addrRepo;
	
	//@Transactional(rollbackOn=Exception.class)
	public void saveEmp(){
		Emp e= new Emp();
		e.setName("sri");
		e.setSalary(50300.00);
		
		Emp savedEmp=empRepo.save(e);
		System.out.println(savedEmp);
		
		Address addr=new Address();
		
		addr.setCity("ODD");
		addr.setCountry("INDIA");
		addr.setState("Ap");
		
		addr.setEid(savedEmp.getEid());
		addrRepo.save(addr);
	}
	

}
