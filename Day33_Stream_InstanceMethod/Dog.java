package Day33_Stream_InstanceMethod;

public class Dog {
	
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean isOlderThan(int age) {
		return this.age > age;
	}
	
	public String capitalizeName() {
		return this.name.toUpperCase();
	}
	
	public void printingName(String sentence) {
		 System.out.println(sentence);
	}

}
