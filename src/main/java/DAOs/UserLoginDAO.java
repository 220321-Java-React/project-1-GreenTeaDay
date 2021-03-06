package DAOs;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.models.ErsUser;
import com.revature.utils.ConnectionUtil;

public class UserLoginDAO {

	public ErsUser login(String username, String password) {
		
			String User = null;
			String Pass = null;
		
		try (Connection conn = ConnectionUtil.getConnection()) {

			String sql = "select * from ers_users where ers_username = ? and ers_password = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql); 
		
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			rs.next();
			User = rs.getString(1);
			Pass = rs.getString(2);
			rs.next();
			
			if(username.equals(User) && password.equals(Pass)) {
			// return true; not a boolean it's an object
		} else {
			System.out.print("User not found");
		//	return false;
			 }
		}  catch (SQLException e) {
			// System.out.println("User not found.");
			e.printStackTrace();
		
	}
		System.out.println("User not found");
		// return false;
		return null;
		
	}
};
	