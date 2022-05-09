package DAOs;

import com.revature.models.ErsUser;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import com.revature.utils.ConnectionUtil;

public class ErsUserDAO implements EmployeeDAOInterface {
    @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public ArrayList<ErsUser> getEmployees() {
       
    	ArrayList<ErsUser> ErsUsers = new ArrayList<ErsUser>();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection connection = ConnectionUtil.getConnection()) {
            String sql = "SELECT * FROM ers_users";
            
			Statement s = connection.createStatement();
			rs = s.executeQuery(sql);

            while(rs.next()) {
               // int id = rs.getInt("ers_userid");
                String firstName = rs.getString("ers_username");
                String ers_username = rs.getString("ers_password");
               // int managerId = rs.getInt("ManagerID");
                String ers_password = rs.getString("user_first_name");
             //   String employeeType = rs.getString("EmployeeType");            
                String user_last_name = rs.getString("user_last_name");
                String user_email = rs.getString("user_email");
                int ers_user_roles_fk = rs.getInt("ers_user_roles_fk");
                int ers_reimbursment_fk = rs.getInt("ers_reimbursmentid_fk");


                ErsUsers.add(new ErsUser(firstName, ers_username,
                		ers_password, user_last_name,
                		user_email, ers_user_roles_fk,ers_reimbursment_fk));
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

    @Override
	public String toString() {
		return "ErsUserDAO [getEmployees()=" + getEmployees() + ", getAllUsers()=" + getAllUsers() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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

                ersUser = new ErsUser(id, firstName, lastName, emailAddress, emailAddress, emailAddress, ers_user_roles_fk, ers_reimbursment_fk);
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

	@Override
	public ArrayList<ErsUser> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ErsUser getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertErsUser(ErsUser employee, int role_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeErsUser(int id) {
		// TODO Auto-generated method stub
		
	}
}