package in.ashokit.client;

import in.ashokit.bean.Employee;
import in.ashokit.util.JsonUtil;

public class Test {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setName("siri");
		emp.setCity("tpkm");
		emp.setCountry("india");
		String jsonEmployee=JsonUtil.convertJavaToJson(emp);
		System.out.println(jsonEmployee);
	}

}
