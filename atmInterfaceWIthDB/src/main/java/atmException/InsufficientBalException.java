package atmException;
/*
 * This class throws exception if balance is less than request*/
public class InsufficientBalException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InsufficientBalException(String msg) {
	super(msg);
}
}
