package Day10_Array;
import java.util.*;
public class ArrayClass {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =  new Scanner(System.in);
		System.out.print("Enter Number of Student :");
		int x = scan.nextInt();
		
		Student e[] = new Student[x];
		
		for(int i = 0; i < e.length; i++) {
			String section = null,course = null,year = null;
			String firstname = null,lastname = null;
			System.out.println("Student #" + (i+1));
			e[i] = new Student(firstname,lastname,section,course,year);
			e[i].ask();
		}
		
		for(int y = 0; y < e.length; y++) {
			System.out.println("Student #" + (y+1));
			e[y].studentInfo();
		}
		
		scan.close();

	}

}
