package in.ashokit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="WELCOME_API")
public interface WelcomeApiFeginClient {

	
	@GetMapping("/welcome")
	public String invokeWelcomeApi() ;
		
	
	
	
	
		
		
}