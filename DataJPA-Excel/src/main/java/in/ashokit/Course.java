package in.ashokit;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="COURSE_DTLS")
public class Course {
	
	@Id
	private Integer  cid;
	private String cname;
	private Double price;
	
	
	
	public Integer getCid() {
		
		return cid;
	}
	public String getCname() {
		
		return cname;
	}
	public Double getPrice() {
		
		return price;
	}
	
	

}
