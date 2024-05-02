package in.ashokit.service;

import java.net.URI;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import org.springframework.jmx.access.MBeanInfoRetrievalException;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class ProductService {
	
	
	
	public Mono<String> getProductNew(){
		
		String apiUrl="https://api.restful-api.dev/objects/1";
		WebClient webClient= WebClient.create();
		Mono<String> bodyToMono = webClient.get()
				                     .uri(apiUrl)
				                     .retrieve()
                                       .bodyToMono(String.class);
		return bodyToMono;
		
	}
	
	public Mono<String> getProduct() {
		String apiUrl="https://api.restful-api.dev/objects/1";
		
		WebClient webClient= WebClient.create();
		
	Mono<String> bodyToMono = webClient.get()
	                                  .uri(apiUrl)
	                                  .retrieve()
	                                  .bodyToMono(String.class);
	                                  
	               return bodyToMono;                   
		                   
	}

}
