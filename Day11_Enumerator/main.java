package Day11_Enumerator;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		

		
		AILevel al = AILevel.EASY;
		
		if(al == AILevel.EASY) {
			System.out.print("Mode : " + AILevel.EASY);
		} else if (al == AILevel.MEDIUM) {
			System.out.print("Mode : " + AILevel.MEDIUM);
		} else if (al == AILevel.HARD) {
			System.out.print("Mode : " + AILevel.HARD);
		}
		
		switch(al) {
		
		case EASY:
			System.out.print("Mode : " + AILevel.EASY);
			break;
		case MEDIUM:
			System.out.print("Mode : " + AILevel.MEDIUM);
			break;
		case HARD:
			System.out.print("Mode : " + AILevel.HARD);
			break;
		}
		


	}

}
	