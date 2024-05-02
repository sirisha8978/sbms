package in.ashokit.binding;

public class Customer {
	private Integer id;
	private String name;
	private int phno;
	
	public Customer(int id, String name, int phno){
		
	}
	
	public Customer(Integer id, String name,int phno) {
		super();
		this.id = id;
		this.name = name;
		this.phno = phno;
	}
	public Customer(int id, String name, long phno) {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phno=" + phno + "]";
	}
	
	

}
