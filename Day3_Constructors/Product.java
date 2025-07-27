package Day3_Constructors;
import Day1_Methods.print;

import java.util.Scanner;
public class Product {
	
		Scanner scan = new Scanner(System.in);
	
		String name;
		double price;
		int prodnumber;
	
		
	Product(String name, double price, int prodnumber) {
		
		for(int i = 0; i<=0;i++) {
		
		this.name = name;
		this.price = price;
		this.prodnumber = prodnumber;
		
		print.p("Enter Product Name : ");
		name = scan.nextLine();
		
		print.p("Enter Product Price : ");
		price = scan.nextDouble();
		
		print.p("Enter Product # : ");
		prodnumber = scan.nextInt();
		
		print.pl("----- "+name + " Created-----");
		
		print.pl("Product : " + name);
		print.pl("Price : " + price);
		print.pl("Product # : " + prodnumber);
		print.p("");
		print.p("");
		scan.nextLine();
		print.p("Do you want to try again ? Y/N : ");
		String choice = scan.nextLine();
		
		if(choice.equalsIgnoreCase("Y")) i--;
		else {
			i+=2; 
			print.p("Thank you for your service, Terminating.....");
		}
		}
		}
		

	}
	
	

