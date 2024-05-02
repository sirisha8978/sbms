package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer aid;
	private String city;
	private String state;
	private  String country;

	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
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
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", state=" + state + ", country=" + country + ", getAid()="
				+ getAid() + ", getCity()=" + getCity() + ", getState()=" + getState() + ", getCountry()="
				+ getCountry() + "]";
	}
	public void setEid(Object eid) {
		// TODO Auto-generated method stub
		
	}

}
