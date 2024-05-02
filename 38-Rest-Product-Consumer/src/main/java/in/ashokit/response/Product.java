package in.ashokit.response;

public class Product {
	
	private Integer id;
	private String name;
	public Integer getid() {
		return id;
	}
	public void setid(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	

}
