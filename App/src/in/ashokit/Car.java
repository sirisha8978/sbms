package in.ashokit;

public class Car extends Engine {
 public void drive() {
	 Engine eng=new Engine();
	 int status =super.start();
	 if(status>0) {
		 System.out.println("journey started");
	 }else {
		 System.out.println("Enginge fault");
	 }
	 
 }

}
