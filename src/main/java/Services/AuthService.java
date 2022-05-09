package Services;
import com.revature.models.ErsUser;

//remember, I'm semi-hardcoding here. You'll need to get this employee data from the DAO & DB
public class AuthService {

	//Typically, you'll want to validate username/password here in the service... 
	//by calling some DAO method that gets employees where username = ? and password = ?
	
	public ErsUser login(String ers_username, String ers_password) {
		
		//we would call the DAO method here, and use its results in the if/else below
		//the DAO method would return whatever gets found in the DB (records with matching username/pass)
		ers_username = "username";
		ers_password = "password";
		//this is hardcoding - telling Java exactly what we want the username/password to be
		if(ers_username.equals("username") && ers_password.equals("password")) {
			
			new ErsUser(0, "Dummy", "pass", "Test", "Tset", "test@test.co", 1, 3);
			
			return new ErsUser(ers_username, ers_password);
		} else {
			return null;
		}
		
	}
	
}