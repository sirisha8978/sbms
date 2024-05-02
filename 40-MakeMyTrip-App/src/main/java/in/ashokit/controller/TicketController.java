package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;
import in.ashokit.service.MakeMyTripService;
import reactor.core.publisher.Mono;

	@RestController
	public class TicketController {

	    @Autowired
	    private MakeMyTripService makeMyTripService;

	    @PostMapping("/bookTicket")
	    public Mono<Ticket> bookTicket(@RequestBody Passenger passenger) {
	        return makeMyTripService.bookTicket(passenger);
	    }

	    @GetMapping("/tickets")
	    public Mono<Ticket[]> getAllTickets() {
	        return makeMyTripService.getAllTickets();
	    }
	}


