package training.day3;

public class amountTooLessException extends Exception {

	private String message;
	
	public amountTooLessException()
	{
		this.message = "Amount too less to perform the transactoin";
	}
	
	public amountTooLessException(String message)
	{
		this.message = message;
	}
}
