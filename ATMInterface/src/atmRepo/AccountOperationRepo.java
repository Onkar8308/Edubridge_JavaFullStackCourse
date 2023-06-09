/**
 * this class contains all the method related to user account*/
package atmRepo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import atmDao.AccountDetails;




public class AccountOperationRepo {
	static List<AccountDetails> accDet = new ArrayList<>();
	
	public void addAccount(AccountDetails details) throws SQLException, ClassNotFoundException {
		
		accDet.add(details);
	}
	
	public boolean isValidLogIn(int userId, String userPass) {
		//List<AccountHolderDetails> existingUser = getAllUser();
		
		for(int i = 0;i<accDet.size();i++) {
			AccountDetails user = accDet.get(i);
			
			if(user.getUserId() == userId && user.getPassword().equals(userPass))
			return true;
		// TODO Auto-generated method stub	
		}
		return false;
	}
	
	public boolean isValidRegisteration(int uniqueId) {

		for(int i = 0;i<accDet.size();i++) {	
			AccountDetails user = accDet.get(i);
			
			if(user.getUserId() == uniqueId )
				return false;
		}
		return true;
	}


	public AccountDetails getAccountDdetails(int userId) {
		// TODO Auto-generated method stub
		for(int i = 0;i<accDet.size();i++) {	
			AccountDetails user = accDet.get(i);
			
			if(user.getUserId() == userId )
				return user;
		}
		return null;
	}
}
