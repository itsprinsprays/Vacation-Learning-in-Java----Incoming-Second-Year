package Day33_Stream_InstanceMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
	
	public static void main(String[] args ) {
		
	     List<Dog> dogs = new ArrayList<Dog>(Arrays.asList(
	             new Dog("Buddy", 3),
	             new Dog("Max", 1),
	             new Dog("Bella", 4),
	             new Dog("Charlie", 2)
	         ));
	     
	     
	     List<String> newDogs = dogs.stream()
	    		 				.filter(dog -> dog.isOlderThan(2))
	    		 				.map(Dog::capitalizeName)
	    		 				.collect(Collectors.toList());
	     newDogs.forEach(System.out::println);
	     
	     System.out.println();
	     
	     List<Student> students = new ArrayList<>(Arrays.asList(
	    		 	new Student("Prince",99),
	    		 	new Student("Renz", 96),
	    		 	new Student("Ryhlle", 74),
	    		 	new Student("Andrei", 72)
	    		 ));
	     
	     List<Student> newStudent = students.stream()
	    		 						.filter(Student::isPassed)
	    		 						.map(Student::capitalizeName)
	    		 						.collect(Collectors.toList());
	     
	     newStudent.forEach(System.out::println);
	     
	     System.out.println();

	     
	     List<Product> products = new ArrayList<>(Arrays.asList(
	                new Product("laptop", 55000, "Electronics"),
	                new Product("phone", 30000, "Electronics"),
	                new Product("table", 4500, "Furniture"),
	                new Product("sofa", 20000, "Furniture"),
	                new Product("shoes", 2500, "Clothing"),
	                new Product("jacket", 3500, "Clothing")
	        ));
	     
	     List<Product> newProduct = products.stream()
	    		 						.filter(Product::isPriced)
	    		 						.map(Product::capitalizeName)
	    		 						.map(product -> product.applyDiscount(10))
	    		 						.collect(Collectors.toList());
	     
	     newProduct.forEach(System.out::println);
	     
	     System.out.println();

	     List<Employee> employees = Arrays.asList(
	    		    new Employee("Prince", 28000, "IT"),
	    		    new Employee("Renz", 32000, "Finance"),
	    		    new Employee("Andrei", 22000, "IT"),
	    		    new Employee("McKen", 26000, "HR"),
	    		    new Employee("Ryhlle", 40000, "IT")
	    		);
	     
	     List<Employee> newEmployees = employees.stream()
	    		 						.filter(Employee::isEarning)
	    		 						.map(Employee::increase)
	    		 						.map(Employee::capitalizeName)
	    		 						.collect(Collectors.toList());
	     
	     newEmployees.forEach(System.out::println);
	}


}
