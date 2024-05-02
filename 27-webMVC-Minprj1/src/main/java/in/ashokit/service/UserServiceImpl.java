package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repo.UserRepo;
import in.ashokit.utils.EmailUtil;



@Service
public class UserServiceImpl  implements UserService{
	
	@Autowired
	private UserRepo userRepo;
	
	//@Autowired
	//private EmailUtil emailUtil;

	@Override
	public boolean saveUser(User user) {
		User savedUser=userRepo.save(user);
		
		if(savedUser.getUid()!=null) {
			String subject="YOUR Account created-ASHOKIT";
			String body="congratulations ,welcome to board...";
			//emailUtil.sendEmail(user.getEmail(),subject,body);
		}
		return true;
	}

	@Override
	public User getUser(String email, String pwd) {
		
		return userRepo.findByEmailAndPwd(email,pwd);
	}

	}




