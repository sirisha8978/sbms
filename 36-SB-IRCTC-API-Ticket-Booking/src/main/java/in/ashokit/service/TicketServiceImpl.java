package in.ashokit.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;
import in.ashokit.repo.TicketRepo;


@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepo ticketRepo;

    @Override
    public Ticket bookTicket(Passenger passenger) {
    	Ticket t=new Ticket();
    	BeanUtils.copyProperties(passenger, t);
    	t.setTicketStatus("CONFIRMED");
    	Ticket savedTicket=ticketRepo.save(t);
        return savedTicket ;
    }

    @Override
    public Ticket getTicket(Integer ticketId) {
        return ticketRepo.findById(ticketId).orElseThrow() ;
                         
    }

    @Override
    public List<Ticket> getTickets() {
        return ticketRepo.findAll();
    }
}
