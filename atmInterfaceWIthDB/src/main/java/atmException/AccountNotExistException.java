package atmException;

public class AccountNotExistException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccountNotExistException(String msg){
		super(msg);
	}

}
