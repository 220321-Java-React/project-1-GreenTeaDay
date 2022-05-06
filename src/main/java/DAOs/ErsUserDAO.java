package DAOs;

import com.revature.models.ErsUser;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import com.revature.utils.ConnectionUtil;

public class ErsUserDAO {
    public List<ErsUser> getAllUsers() {
        List<ErsUser> ErsUsers = new LinkedList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection connection = ConnectionUtil.getConnection()) {
            String sql = "select * from ers_users";
            
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
                int id = rs.getInt("ers_userid");
                String firstName = rs.getString("user_first_name");
                String lastName = rs.getString("user_last_name");
               // int managerId = rs.getInt("ManagerID");
                String emailAddress = rs.getString("user_email");
                String password = rs.getString("Password");
             //   String employeeType = rs.getString("EmployeeType");
                int ers_user_roles_fk = rs.getInt("ers_user_roles_fk");
                int ers_reimbursment_fk = rs.getInt("ers_reimbursment_fk");


                ErsUsers.add(new ErsUser(id, firstName,
                		lastName, emailAddress, password,
                		password,ers_user_roles_fk, ers_reimbursment_fk));
                }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return ErsUsers;
    }

    public ErsUser getUserById(int ers_userid) {
    	ErsUser ersUser = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try(Connection connection = ConnectionUtil.getConnection()) {
            String sql = "select * from ers_users where ers_userid=?";
            
            ps = connection.prepareStatement(sql);
            ps.setInt(1, ers_userid);
            rs = ps.executeQuery();
            
            if(rs.next()) {
                int id = rs.getInt("ers_userid");
                String firstName = rs.getString("user_first_name");
                String lastName = rs.getString("user_last_name");
               // int managerId = rs.getInt("ManagerID");
                String emailAddress = rs.getString("user_email");
             //   String employeeType = rs.getString("EmployeeType");
                int ers_user_roles_fk = rs.getInt("ers_user_roles_fk");
                int ers_reimbursment_fk = rs.getInt("ers_reimbursment_fk");

                ersUser = new ErsUser(id, firstName, lastName, emailAddress, ers_user_roles_fk, ers_reimbursment_fk);
            }

        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            if(ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return ersUser;
    }

    public ErsUser getUserByReimId(int ers_reimbursmentid) {
    	ErsUser ersUser = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try(Connection connection = ConnectionUtil.getConnection()) {
            String sql = "select * from ers_users where ers_reimbursment_fk=?";
            
            ps = connection.prepareStatement(sql);
            ps.setInt(1, ers_reimbursmentid);
            rs = ps.executeQuery();
            
            if(rs.next()) {
                int id = rs.getInt("ers_userid");
                String firstName = rs.getString("user_first_name");
                String lastName = rs.getString("user_last_name");
                String employeeType = rs.getString("EmployeeType");
                String emailAddress = rs.getString("user_email");
                //   String employeeType = rs.getString("EmployeeType");
                int ers_user_roles_fk = rs.getInt("ers_user_roles_fk");
                int ers_reimbursment_fk = rs.getInt("ers_reimbursment_fk");

                emailAddress = rs.getString("EmailAddress");
                ersUser = new ErsUser(id, firstName, lastName, emailAddress, employeeType, emailAddress, ers_user_roles_fk, ers_reimbursment_fk);
            }

        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            if(ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return ersUser;
    }
    
    public void updateUserPassword(int ers_userid, String password) {
        CallableStatement cs = null;

        try(Connection connection = ConnectionUtil.getConnection()) {
            String sql = "{call SP_Update_Employee_Password(?, ?)}";
            cs = connection.prepareCall(sql);
            cs.setInt(1, ers_userid);
            cs.setString(2, password);

            cs.execute();
            cs.close();
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            if(cs != null) {
                try {
                    cs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    } 

	public void insertEmployee(ErsUser emp, int roleId) {
		// TODO Auto-generated method stub
		
	}

	public void removeEmployee(int idInput) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<ErsUser> getEmployeesByRole(String roleInput) {
		// TODO Auto-generated method stub
		return null;
	}
}
