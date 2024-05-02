package in.ashokit.binding;

import java.time.LocalDate;

public class Ticket {
	
	private Integer Ticketno;
	private String  name;
	private String To;
	private String From;
	
	private LocalDate  journey;

	public Integer getTicketno() {
		return Ticketno;
	}

	public void setTicketno(Integer ticketno) {
		Ticketno = ticketno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTo() {
		return To;
	}

	public void setTo(String to) {
		To = to;
	}

	public String getFrom() {
		return From;
	}

	public void setFrom(String from) {
		From = from;
	}

	public LocalDate getJourney() {
		return journey;
	}

	public void setJourney(LocalDate journey) {
		this.journey = journey;
	}
	
	

}
