package Day34_Stream_ConstructorMethod;

public class Employee {
	
	private final String name;
	private String department;
	
	public Employee(String name) {
		this.name = name;
		this.department = "General";
	}
	
	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String toString() {
		return "Name : " + getName() + ", Department : " + this.department;
	}
	
	

}
