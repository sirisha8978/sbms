package in.ashokit.entity;

import java.util.List;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Table(name="employee_details")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer empId;
	private String empName;
	private Double  empsal;
	
	@OneToMany(mappedBy="emp",cascade=CascadeType.ALL)
	
	private List<Address> addrList;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpsal() {
		return empsal;
	}

	public void setEmpsal(Double empsal) {
		this.empsal = empsal;
	}

	public List<Address> getAddrList() {
		return addrList;
	}


	
	}
