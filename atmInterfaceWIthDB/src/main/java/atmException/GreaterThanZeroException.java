package atmException;
/*
 * This class throws exception if user give -ve or 0 input*/
public class GreaterThanZeroException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GreaterThanZeroException(String msg){
		super(msg);
	}
	

}
