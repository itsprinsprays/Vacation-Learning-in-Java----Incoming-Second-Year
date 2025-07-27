package Day16_Throws;

public class InvalidEmailException extends Exception{
	
	public InvalidEmailException(String Message) {
		super(Message);
	}
}
