package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.Customer;
import in.ashokit.service.CustomerServiceImpl;

@Controller
public class CustomerController{
	@Autowired
	private CustomerServiceImpl customerService;
	
	//login page
    @GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("customer",new Customer());
		return "index";
		}
    
  //login button handle
    @PostMapping("/loginCustomer")
    public String handleLogin(Customer customer, Model model) {
    	System.out.println(customer);
        Customer customerObj = customerService.getCustomer(customer.getEmail(), customer.getPwd());
        System.out.println(customerObj);
        if (customerObj == null) {
       
            model.addAttribute("emsg", "Invalid Credentials");
            Customer cust=new Customer();
            model.addAttribute("customer",cust);
            return "index"; // Return to the login page with an error message
        } else {
            model.addAttribute("msg", " welcome to ashokit...");
            model.addAttribute("customer",customerObj);
            return "dashboard"; // Redirect to the dashboard page
        }
    }

	
		@PostMapping("/saveCustomer")
		public String saveCustomer(Customer customer,Model model) {
			System.out.println(customer);
		//	boolean customer = customerService.saveCustomer(customer);
			boolean saved = customerService.saveCustomer(customer);

			Customer cust=new Customer();
			model.addAttribute("customer",cust);
			if(customer != null ) {
				model.addAttribute("msg","successfully saved");
			}else {
				model.addAttribute("msg","Customer saving is Failed");
			}
			return "register";
		}
	//register button handle
		//@PostMapping("/registerForm")
		//public String handleRegister(Customer customer, Model model) {
		//	boolean status=customerService.saveCustomer(customer);
			//if(status) {
			//	model.addAttribute("smsg", "Customer Registered");
			//}else {
			//	model.addAttribute("emsg", "Registration failed");
			//}
			//return "register";
		//}
		
		//register-page-display
		@GetMapping("/register")
		public String register(Model model) {
			Customer customer=new Customer();
			model.addAttribute("customer",customer);
			return "register";
		}
		
		//logout method
		@GetMapping("/logout")
		public String logout(Model model) {
			model.addAttribute("customer",new Customer());
			return "index";
		}
}


	
