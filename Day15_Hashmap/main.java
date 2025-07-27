package Day15_HashMap;
import java.util.Scanner;
import java.util.HashMap;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		HashMap<Integer, student> h = new HashMap<>();
		
		System.out.print("Enter Number of Student : ");
		int choice = Integer.parseInt(scan.nextLine());
		System.out.println(" ");

		
		for(int i = 0; i< choice; i++) {
		System.out.println(" ");
		System.out.println("Student #" + (i+1));
		System.out.println(" ");
		System.out.print("Enter LRN: ");
		int reg = Integer.parseInt(scan.nextLine());		

		h.put(reg, new student(null,null,0));
		
		}

		while(true) {
		System.out.println(" ");
		try {	System.out.print("Enter ID : ");
			int id = Integer.parseInt(scan.nextLine());
			
			if (h.containsKey(id)) h.get(id).introduce();
			else  System.out.print("Student Number " + id + " is not existing");
			
	   }catch (NumberFormatException e) {
		 System.out.println("Invalid input! Please enter a valid integer.");
	}
		
		scan.close();

		}
	}

}
