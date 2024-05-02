package in.ashokit.exception;



public class CustomerNotFoundException extends RuntimeException{

	
	public CustomerNotFoundException() {
		
	}
	
	public CustomerNotFoundException(String Msg) {
		super(Msg);
	}
}
