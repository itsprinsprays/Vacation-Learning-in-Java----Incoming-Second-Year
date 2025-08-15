package Day34_Stream_ConstructorMethod;

public class Student {
	
	private final String name;
	private  int score;
	
	public Student(String name) {
		this.name = name;
		this.score = (int)(Math.random() * (100 - 50 + 1) + 50);
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	@Override
	public String toString() {
		return "Name : " + getName() + ", Score : " + score;
	}

}
