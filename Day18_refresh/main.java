package Day18_refresh;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<student> student = new ArrayList<student>();
		
		boolean bol = true;
		while(bol) {
			System.out.println("===============================\r\n"
					+ "     MiniRoster Main Menu\r\n"
					+ "===============================\r\n"
					+ "");
			System.out.print("1. Add Student  \r\n"
					+ "2. List All Students  \r\n"
					+ "3. Sort Students by Name   \r\n"
					+ "4. Filter Students by Name Prefix   \r\n"
					+ "5. Delete Student by ID  \r\n"
					+ "6. Exit  \r\n"
					+ "Choice : ");
			try {int choice = Integer.parseInt(scan.nextLine());
			System.out.println("");

			switch(choice) {
			
			case 1: 
				System.out.println("1.) Add Student");
				System.out.println("");
				
				student.add(new student("","",""));
				break;
				
			case 2:
				System.out.println("2.) List All Students");
				System.out.println("");

				for(int i = 0; i < student.size(); i++) {
					student s1 = student.get(i);
					s1.record();
				}
				
				break;
				
			case 3:
				System.out.println("3.) Sort Students by Name");
				System.out.println("");
				
				student.sort((a,b) -> a.getName().compareTo(b.getName()));
				for(int i = 0; i < student.size(); i++) {
					student s1 = student.get(i);
					s1.record();
				} 
				break;
				
			case 4 :
				System.out.println("4.) Filter Students by Name Prefix ");
				System.out.println("");
				System.out.println("Prefix Name : ");
				String pre = scan.nextLine();
				
			
				student.forEach(s -> {
					boolean found = false;
					if(s.getName() != null && s.getName().startsWith(pre)) {
							s.record();
							found = true;
					} if(!found) {
						System.out.print("No prefix " + pre +" was found" );
					}
				});
				break;
				
			case 5:
				System.out.println("5. Delete Student by ID ");
				System.out.println("");
				
				System.out.println("Delete using ID : ");
				String del = scan.nextLine();
				
				student.removeIf(s -> s.getId().equals(del));
				System.out.println(del + " DELETED");
				break;
			
			case 6:
				System.out.println("6.  Exit   ");
				System.out.println("Exiting...");
				bol = false;
				
				break;
			}
			} 
				catch (ValidationException  e) {
				    System.out.println("❌ Validation Error: " + e.getMessage());
				} catch (NumberFormatException e) {
				    System.out.println("❌ Please enter a valid number!");
				}
			}
		}

	}


