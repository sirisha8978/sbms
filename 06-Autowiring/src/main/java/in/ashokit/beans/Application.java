package in.ashokit.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt=
		SpringApplication.run(Application.class, args);
		//Robot robot1 =ctxt.getBean(Robot.class);
		//Robot robot2 =ctxt.getBean(Robot.class);
		
		
	}

}
