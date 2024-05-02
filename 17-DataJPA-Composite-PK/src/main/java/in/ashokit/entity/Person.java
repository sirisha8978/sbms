package in.ashokit.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
	@Id
	private String name;
	private String email;
	private String gender;
	
	@EmbeddedId
	private PersonPK personpk;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", gender=" + gender + ", getName()=" + getName()
				+ ", getEmail()=" + getEmail() + ", getGender()=" + getGender() + "]";
	}
	public void setPersonPK(PersonPK pks) {
		
	}
	
	
	}
	


