package atmException;
/*
 * This class contains exception if user give wrong choice*/

public class WrongChoiceException  extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WrongChoiceException(String s) {
		super(s);
	}

}
