package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Customer;

@RestController
public class CustomerRestController {
	
	
	@GetMapping(value="/customer")
	public ResponseEntity<Customer> getCustomer(){
		
		Customer c=new Customer(1,"vija",55000);
		return new ResponseEntity<>(c,HttpStatus.OK);
		
	}
	
	@PostMapping(
			value="/customer",
			consumes= {"application/xml","appliaction/json"},
			produces="text/plain"
			)
	public ResponseEntity<String> addCustomer(@RequestBody Customer c){
		System.out.println(c);
		return new ResponseEntity<String> ("customer added",HttpStatus.CREATED);
		
	}
	

}
