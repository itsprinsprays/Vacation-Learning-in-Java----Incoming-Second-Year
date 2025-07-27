package Day6_Inheritance;
import Day1_Methods.print;
public class Animal {
	
	private String name,types;
	
	
	Animal(String name, String types) {
		this.name = name;
		this.types = types;
	}
	
	
	
	void setname(String name) {
		this.name = name;
	}
	
	String getname() {
		return name;
	}
	
	String gettypes() {
		return types;
	}
	
	
	
	void status() {
		print.pl("Name  : " + name);
		print.pl("Types : " + types);
		
	}

}
