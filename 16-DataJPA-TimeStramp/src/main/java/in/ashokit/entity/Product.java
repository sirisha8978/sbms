package in.ashokit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pid;
	private String name;
	private Double price;
	
	@Column(updatable=false)
	@CreationTimestamp
	private LocalDate createDate;
	
	@Column(insertable=false)
	@CreationTimestamp
	private LocalDate updateDate;
	
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public LocalDate getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + "]";
	}

		
	}


