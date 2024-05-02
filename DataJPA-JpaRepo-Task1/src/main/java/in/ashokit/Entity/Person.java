package in.ashokit.Entity;

import java.time.LocalDate;
import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
	@Id
	private Integer pid;
	private String pname;
	private long DOB;
	private String gender;
	private byte[] photo;
    private byte[] resume;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public long getDOB() {
		return DOB;
	}
	public void setDOB(long dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public byte[] getResume() {
		return resume;
	}
	public void setResume(byte[] resume) {
		this.resume = resume;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", DOB=" + DOB + ", gender=" + gender + ", photo="
				+ Arrays.toString(photo) + ", resume=" + Arrays.toString(resume) + "]";
	}

	}
