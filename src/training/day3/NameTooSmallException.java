package training.day3;

public class NameTooSmallException extends Exception {

	private String message;
	
	public NameTooSmallException()
	{
		this.message = "Small name exception";
		
	}
	
	public NameTooSmallException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		
		return this.message + ".........";
	}

	@Override
	public String toString() {
	
		return super.toString();
	}
}
