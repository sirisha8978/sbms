package in.ashokit.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="add_id")
	private Integer addrId;
	private String city;
	private String state;
	private String country;
	private String type;
	
    @ManyToOne
	@JoinColumn(name="empId")
	private Employee emp;

	public Integer getAddrId() {
		return addrId;
	}

	public void setAddrId(Integer addrId) {
		this.addrId = addrId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	
	

}
