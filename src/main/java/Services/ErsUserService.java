package Services;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.ErsUser;

import DAOs.ErsUserDAO;

//The service layer contains additional business logic needed to process requests/responses
//It probably won't be doing much here, but it comes into play more with things like login
public class ErsUserService {

	//We need an EmployeeDAO Class so that we can call our getEmployees() method.
	ErsUserDAO eDAO = new ErsUserDAO();
	
	//this method gets all employees from the DAO (we will call this method from the Handler in the controller layer).
	//this method will be pretty simple, since we don't really need to process any data - just send it around
	public ArrayList<ErsUser> getEmployees(){
		
		//get the List of employees from the DAO
		ArrayList<ErsUser> ErsUsers = eDAO.getEmployees();

		//return that List of employees
		return ErsUsers;
		
	}
	
}; 
