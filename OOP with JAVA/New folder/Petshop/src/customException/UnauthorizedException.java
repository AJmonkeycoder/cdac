package customException;

public class UnauthorizedException extends Exception{
	public UnauthorizedException(String errmsg) {
		super(errmsg);
	}
}
