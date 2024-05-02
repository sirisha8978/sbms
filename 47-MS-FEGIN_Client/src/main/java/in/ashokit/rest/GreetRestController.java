package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.client.WelcomeApiFeginClient;

@RestController
public class GreetRestController {
	
	@Autowired
	private WelcomeApiFeginClient welcomeClient;
	
	
	@GetMapping("/greet")
	public String greetMsg() {
		String welcomeResponse=welcomeClient.invokeWelcomeApi();
		String greetResponse="Good Mrng..!";
		return welcomeResponse + greetResponse ;
	}

}
