package in.ashokit.service;

import java.util.List;


import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;



public interface TicketService {
	
	//operation-1
  public  Ticket bookTicket(Passenger passenger);	
  
   //operation-2
  public  Ticket getTicket(Integer tid);

   
   //operation-3
 public  List<Ticket> getTickets();


   

}
