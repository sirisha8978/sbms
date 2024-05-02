package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.dao.UserDao;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt=
		SpringApplication.run(Application.class, args);
		//System.out.println(ctxt.getClass().getName());         //annotation
		//System.out.println(ctxt.getBeanDefinitionCount());     //59
		UserDao dao=ctxt.getBean(UserDao.class);
		String findName=dao.findName(100);
		System.out.println(findName);
	}
	}


