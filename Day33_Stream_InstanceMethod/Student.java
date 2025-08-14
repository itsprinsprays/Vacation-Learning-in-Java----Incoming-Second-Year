package Day33_Stream_InstanceMethod;

public class Student {
	
	private String name;
	private int grade;
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public boolean isPassed() {
		return this.grade >= 75;
	}
	
	public Student capitalizeName() {
		return new Student(name.toUpperCase(), grade);
		
	}
	@Override
	public String toString() {
	    return name + " (" + grade + ")";
	}
}
