package atmException;
/*
 * This class throws exception if user is already exist*/

public class ExistingUserException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExistingUserException(String msg) {
		super(msg);
	}

}
