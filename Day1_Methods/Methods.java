package Day1;

public class Methods {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num[] = {1,2,3,4,5,21};
		int result = summation(num);
		System.out.print("Result : " + result);
		
	}

	static int summation(int numbers[]) {

	
		int sum = 0;
		for(int num1 = 0; num1 < numbers.length; num1++) {
			sum = sum + numbers[num1];
			 	
	        if (num1 + 1 < numbers.length) {
	            System.out.println(sum + " + " + numbers[num1 + 1] + " = " + (sum + numbers[num1 + 1]));
	        }
	    }
			
		return sum;

	}
}
