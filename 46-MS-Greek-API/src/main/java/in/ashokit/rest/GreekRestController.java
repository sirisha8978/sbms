package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreekRestController {
    
    @Autowired
    private Environment env;

    @GetMapping("/greek")
    public String greekMsg() {
    	
        String port = env.getProperty("server.port");
        String msg = "GOOD MRNG...(" + port + ")";
        return msg;
    }
    
    @GetMapping("/welcome")
    public String welcomeMsg() {
    	
        String port = env.getProperty("server.port");
        String msg = "Welcome to ashokit...(" + port + ")";
        return msg;
    }
}
