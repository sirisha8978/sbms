package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Customer;
@Service
public interface CustomerService {

	public  boolean saveCustomer(Customer customer);
	
	public  Customer getCustomer(String email, String pwd) ;
		
	}
	


