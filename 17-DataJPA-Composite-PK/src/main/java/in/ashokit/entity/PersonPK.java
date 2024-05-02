package in.ashokit.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class PersonPK {
	
	private Integer personid;
	private String passportNum;
	public Integer getPersonid() {
		return personid;
	}
	public void setPersonid(Integer personid) {
		this.personid = personid;
	}
	public String getPassportNum() {
		return passportNum;
	}
	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}
	@Override
	public String toString() {
		return "PersonPK [personid=" + personid + ", passportNum=" + passportNum + ", getPersonid()=" + getPersonid()
				+ ", getPassportNum()=" + getPassportNum() + "]";
	}
	
	

}
