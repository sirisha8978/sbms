package in.ashokit.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value=CustomerNotFoundException.class)
	public ResponseEntity<ExInfo> handlePNFE(CustomerNotFoundException pe){
		
		ExInfo exInfo=new ExInfo();
		exInfo.setExCode("SBI0002");
		exInfo.setExMsg(pe.getMessage());
		exInfo.setExDate(LocalDate.now());
		return new ResponseEntity<>(exInfo,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<ExInfo> handleException(Exception e){
		
		ExInfo exInfo=new ExInfo();
		exInfo.setExCode("SBI0002");
		exInfo.setExMsg(e.getMessage());
		exInfo.setExDate(LocalDate.now());
		return new ResponseEntity<>(exInfo,HttpStatus.INTERNAL_SERVER_ERROR);
		
		
	
		
	}
	

}
