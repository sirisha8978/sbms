package in.ashokit.converter;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.binding.Customer;

public class App {
	
	

		public static void main(String[] args) throws Exception {
			App a = new App();
			//a.convertJavaToJson();
			a.convertJsonToJava();
		}
		
		public void convertJsonToJava() throws Exception{
			ObjectMapper mapper = new ObjectMapper();
			Customer c = mapper.readValue(new File("customer.json"), Customer.class);
			System.out.println(c);
		}

		public void convertJavaToJson() throws Exception {
			Customer c = new Customer(101, "sri", 323454);
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(new File("customer.json"), c);
			System.out.println("Serialization completed...");

		}
	}
