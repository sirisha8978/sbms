package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	public UserService() {
		System.out.println("UserService::Constructor");
	}

}
