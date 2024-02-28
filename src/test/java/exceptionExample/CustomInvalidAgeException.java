package exceptionExample;

public class CustomInvalidAgeException extends Exception {
	
	public CustomInvalidAgeException() {
		
	}
	
	public CustomInvalidAgeException(String error) {
		super(error);
	}

}


