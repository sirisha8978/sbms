package in.ashokit.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="ORDR_DTLS")
@Data
public class OrderDetailsEntity {
	
	@Id
	@Column(name="ORDER_ID")
	private String orderId;
	
	@Column(name="ORDER_BY")
	private String orderBy;
	
	@Column(name="ORDER_PLACED_DT")
	private Date orderPlaceDate;
	

}
