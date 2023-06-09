package atmException;
/*
 * This class contains all the exceptions which may occur in this project*/

public class WrongChoiceException  extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WrongChoiceException(String s) {
		super(s);
	}

}
