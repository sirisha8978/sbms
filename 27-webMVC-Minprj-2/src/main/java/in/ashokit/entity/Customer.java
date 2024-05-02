package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_dtls")
public class Customer {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer cid;
  
  private String name;
  
  private String email;
  
  private Long phno;
  
  private String pwd;
  
  public Integer getcid() {
	return cid;
}

  public void setcId(Integer cid) {
	this.cid = cid;
}
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

  public Long getPhno() {
	return phno;
}
  public void setPhno(Long phno) {
	this.phno = phno;
}
   public String getPwd() {
	return pwd;
}

  public void setPwd(String pwd) {
	this.pwd = pwd;
}
}

