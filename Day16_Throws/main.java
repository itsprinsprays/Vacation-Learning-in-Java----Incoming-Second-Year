package Day16_Throws;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		allExceptions.scan();
		allExceptions.display();
		} catch(EmptyFieldException | InvalidEmailException | WeakPasswordException  | WrongPasswordException e) {
			System.out.print(e.getMessage());
		} catch(IllegalArgumentException e1) {
			System.out.print(e1.getMessage());
		}
	}

}
