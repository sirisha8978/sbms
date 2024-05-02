package in.ashokit.binding;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Book_Tickets")
public class Ticket {
	
    @Id
    @GeneratedValue
    private Integer ticketId;
    private String source;
    private String destination;
    private String trainNum;
    private String ticketStatus;
    private String name;
    private LocalDate Doj;
    private String gender;
    private LocalDate  Dob;
    
    
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return Dob;
	}
	public void setDob(LocalDate dob) {
		Dob = dob;
	}
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
		}
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDoj() {
		return Doj;
	}
	public void setDoj(LocalDate doj) {
		this.Doj = doj;
	}
	


    
}
