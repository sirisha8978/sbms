package in.ashokit.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Customer;

@RestController
public class CustomerRestController {
	
	@PostMapping("/customer")
	public ResponseEntity<String> DeleteCustomer(Customer c){
		Customer cust =new Customer(1,"mani","mani47@gmail.com");
		return new ResponseEntity(cust,HttpStatus.OK);
	}
	

	@PostMapping("/customer/{cid}")
	public ResponseEntity<String> UpdateCustomer( Customer c){
		Customer cust=new Customer(1,"maha","maha123@gmail.com");
		return new ResponseEntity(cust,HttpStatus.OK);
	}
	
	@PostMapping("/customer")
	public ResponseEntity<String> CreateCustomer (Customer c){
		Customer cust=new Customer(1,"vini","vini123@gmail.com");
		return new ResponseEntity(cust,HttpStatus.CREATED);
		
	}
	
	@GetMapping(value="/customers" ,produces="application/json")
	public ResponseEntity<List<Customer>>getCustomers(){
		   Customer c1= new Customer(1,"sri","sri12@gmail.com");
		   Customer c2= new Customer(2,"siri","siri12@gmail.com");
		   Customer c3= new Customer(3,"mahi","mahii12@gmail.com");
		   List<Customer> list=Arrays.asList(c1,c2,c3);
		return new ResponseEntity<>(list,HttpStatus.OK);
	}

   @GetMapping(value="/customer")
   public ResponseEntity<Customer> getCustomer(){
	   Customer c= new Customer(1,"sri","sri12@gmail.com");
	   return new ResponseEntity<>(c,HttpStatus.OK);
   }
}
