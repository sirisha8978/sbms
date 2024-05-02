package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Customer;
import in.ashokit.repo.CustomerRepo;
import in.ashokit.utils.EmailUtils;


@Service
public class CustomerServiceImpl implements CustomerService {
	
    @Autowired
	private CustomerRepo customerRepo;
	
	//@Autowired
	//private EmailUtils emailUtils;
    
    @Override
	public boolean saveCustomer(Customer customer) {

		Customer savedCustomer=customerRepo.save(customer);
		
		if(savedCustomer.getcid()!=null) {
			String subject="YOUR Account created-ASHOKIT";
			String body="congratulations ,welcome to board...";
			//emailUtils.sendEmail(customer.getEmail(),subject,body);
		}
		return true;
	}
  @Override
	public Customer getCustomer(String email, String pwd) {
		
		return customerRepo.findByEmailAndPwd(email,pwd);
	}
}





