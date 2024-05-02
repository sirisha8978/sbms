package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.Productservice;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
		SpringApplication.run(Application.class, args);
		
		Productservice ps=context.getBean(Productservice.class);
		
		//ps.saveProducts();
		
		//ps.getProducts();
		
		 ps.getProductSpec(null,30000.00,50000.00);
		
	}

}
