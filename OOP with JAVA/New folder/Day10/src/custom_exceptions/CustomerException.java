package custom_exceptions;

public class CustomerException extends Exception {
	public CustomerException(String errMesg) {
		super(errMesg);
	}
}
