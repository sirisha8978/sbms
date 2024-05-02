package in.ashokit.service;

import org.springframework.stereotype.Service;


import in.ashokit.entity.User;

@Service
public interface UserService {
	public boolean saveUser(User user);
	public   User getUser(String email,String pwd);
	
	 
	


}
