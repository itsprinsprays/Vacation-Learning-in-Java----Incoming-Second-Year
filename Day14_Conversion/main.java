package Day14_Conversion;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "100";
		int y = Integer.parseInt(x); //conversion of string to integer
		
		System.out.println("String: "+ x+1);
		System.out.println("Integer : " + (y+1));
		
		System.out.println("");
		
		int xx = 100;
		String yy = String.valueOf(xx); // conversion of integer to string
		
		System.out.println("String : " + yy+1); 
		System.out.println("Integer : " + (xx+1));
		
		System.out.println("");
		
		//type casting
	
		byte b = 127; //widening type casting
		short s = b;
		int i = s;
		
		System.out.println("Byte to Short : " + s);
		System.out.println("Short to Int : " + s+i);
		
		System.out.println("");
		
		double d = 12.54; //narrowing type casting
		float f = (float) d;
		int ii = (int) f;
		
		System.out.println("Double : " + d);
		System.out.println("Float : " + f);
		System.out.println("Integer : " + ii);
		
		System.out.println("");

	}

}
