package ageApp;

import java.lang.reflect.Field;

public class Test {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		Class<?> clz=Class.forName("ageApp.User");
		
		Object obj=clz.newInstance();
		
		User u =(User)obj;
		
		Field ageField=clz.getDeclaredField("age");
	ageField.setAccessible(true);
	ageField.set(obj, 40);
	int  age= u.getAge();
	System.out.println("UserAge::"+age);
	
		
	}

}
