package Day6;

import Day1.print;

public class Bird extends Animal{
	
		String color;
		
		Bird(String name, String types, String color) {
			super("SA",types);
			this.color = color;
		}
		
		void status() {
			super.status();
			print.pl("Color : " + color);	
			
		}
}
