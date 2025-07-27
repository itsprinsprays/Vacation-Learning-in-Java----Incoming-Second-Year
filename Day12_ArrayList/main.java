package Day12_Arraylist;

import java.util.ArrayList;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
			
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Prince"); // add value
		names.add("Andrei");
		names.add("Ella");
		names.add("Lance");
		String na = names.get(0); 
		System.out.println(na);  // read value
		names.set(0, "Renz"); // update value
		System.out.println(names.get(0));  
		names.remove(0); // remove value
		System.out.println(names.get(0)); 
		//names.clear();// clear all the value
		
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(0);
		number.add(1);
		number.add(2);
		number.add(3);
		
		number.forEach(n -> System.out.println(n));
		
		int nu = number.get(0);
		System.out.println(nu);
		
		ArrayList<Student> student = new ArrayList<Student>();
		student.add(new Student("Prince","BSIT"));
		
		Student s = student.get(0);
		s.introduce();
		student.set(0, new Student("Jed","Mar")); // update value
		Student s1 = student.get(0);
		s1.introduce();

	}

}
