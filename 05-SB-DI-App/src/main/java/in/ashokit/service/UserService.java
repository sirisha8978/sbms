package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.UserDao;

@Service
public class UserService {
	
    private UserDao userDao;
	/*public UserService() {
		System.out.println("UserService::default-constructor");
	}
	
	@Autowired                                //(optional)
	public UserService(UserDao userDao) {
		System.out.println("UserService::parameter-Constructor");
		this.userDao=userDao;
	}*/
	
	public void getName(int id) {
		
		String findName=userDao.findName(id);
		System.out.println("Name::"+findName);
	}

}
