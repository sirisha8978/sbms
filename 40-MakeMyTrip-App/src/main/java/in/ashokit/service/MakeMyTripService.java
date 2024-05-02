package in.ashokit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;
import reactor.core.publisher.Mono;

@Service
public class MakeMyTripService {
	 
	private  final String Book_TICKET_URL="http://localhost:8082/ticket";
	
	private  final String GET_TICKET_URL="http://localhost:8082/tickets";

	public Mono<Ticket> bookTicket(Passenger p){
		
		WebClient webClient=WebClient.create();
		
	return	webClient.post()
		          .uri("Book_TICKET_URL")
		          .body(BodyInserters.fromValue(p))
		          .retrieve()
				  .bodyToMono(Ticket.class);                   
				              
	}
	
	
	public Mono<Ticket[]>  getAllTickets(){
		
		WebClient webClient=WebClient.create();
		
		return webClient.get()
                  .uri("Book_TICKET_URL")
                  .retrieve()
		          .bodyToMono(Ticket[].class);                   
		             
		
	}

}
