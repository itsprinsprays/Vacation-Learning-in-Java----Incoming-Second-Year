package Day24_Consumer;

public class Student {
	private String name,program;
	private int age;
	
	 Student(String name, int age, String program) {
		this.name = name;
		this.age = age;
		this.program = program;
	}
	
	String getName() {
		return name;
	}
	
	String getProgram() {
		return program;
	}
	
	int getAge() {
		return age;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setProgram(String program) {
		this.program = program;
	}
	
	void setAge(int age) {
		this.age = age;
	}

}
