package Day16_throws;

public class InvalidEmailException extends Exception{
	
	public InvalidEmailException(String Message) {
		super(Message);
	}
}
