package Services;
import com.revature.models.ErsUser;

import DAOs.UserLoginDAO;

//remember, I'm semi-hardcoding here. You'll need to get this employee data from the DAO & DB
public class AuthService {

	//Typically, you'll want to validate username/password here in the service... 
	//by calling some DAO method that gets employees where username = ? and password = ?
	UserLoginDAO uDAO = new UserLoginDAO(); 
	
	public ErsUser login(String username, String password) {
		return new ErsUser(password, password);
	}
};

