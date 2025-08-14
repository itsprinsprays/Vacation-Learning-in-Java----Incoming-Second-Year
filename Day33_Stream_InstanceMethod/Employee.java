package Day33_Stream_InstanceMethod;

public class Employee {
	
	private final String name;
	private final double salary;
	private final String department;
	
	public Employee(String name, double salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public String getName() { return name; }
	public double getSalary() { return salary; }
	public String getDepartment() { return department; }
	
	public boolean isEarning() {
		return this.salary >= 25000;
	}
	
	public Employee capitalizeName() {
		return new Employee(name.toUpperCase(),salary,department);
	}
	
	public Employee increase() {
		double salaryIncrease = salary;
		if(this.department.equals("IT")) {
			salaryIncrease = (this.salary * 15 / 100) + salary;
		} 
		return new Employee(name, salaryIncrease, department);
	}
	
	@Override
	public String toString() {
		return getName() + " - " + getSalary() + " (" + getDepartment() + ")";
	}


}
