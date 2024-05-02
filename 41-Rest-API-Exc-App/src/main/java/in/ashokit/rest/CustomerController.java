package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Customer;
import in.ashokit.exception.CustomerNotFoundException;


@RestController
public class CustomerController {
	
	
	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("id")Integer id) throws Exception{
		if(id==1) {
		Customer c=new Customer();
		c.setId(1);
		c.setName("maha");
		c.setSalary(50000.00);
		return new ResponseEntity<>(c,HttpStatus.OK);
		
	}else {
		throw new CustomerNotFoundException("Invaild id");
	}
	}

}
