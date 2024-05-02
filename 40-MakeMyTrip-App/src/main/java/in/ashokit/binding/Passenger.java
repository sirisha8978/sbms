package in.ashokit.binding;

public class Passenger {
	

	    private String name;
	    private int age;
	    private String gender;

	    // Constructors
	    public Passenger() {
	    }

	    public Passenger(String name, int age, String gender) {
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	    }

	    // Getters and setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }

		@Override
		public String toString() {
			return "Passenger [name=" + name + ", age=" + age + ", gender=" + gender + "]";
		}

	  


}
