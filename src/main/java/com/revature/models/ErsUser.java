package com.revature.models;

public class ErsUser {

	//variables for the employee class - must match the employees table in the database
	//note the private variables, private coupled with getters and setters (see below) are how we achieve ENCAPSULATION
	private int ersUserid;
	private String ersUsername;
	private String ersPassword;
	private String userFirstName;
	private String userLastName;
	private int ersUserRolesFk;
	private int ersReimbursmentFk;
	//Every Employee in this application will have a role associated with it
	// private Role role; //in other words, every EMPLOYEE has a ROLE

	
	//this class won't have any methods, we just need it to represent (aka MODEL) some data
	
	//boilerplate code below------------------------------
	//boilerplate code is any code that you'll probably write over and over again
	//most classes that we make objects of will have constructors, getters/setters, toString
	//so java makes this easy for us with the source tab 
	
	//remember all of this can be generated with the source tab
	
	//no args constuctor (source -> constructor from superclass)
	public ErsUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	//all args constructor (source -> constructor from fields)
	public ErsUser(int ersUserid, String ersUsername, String ersPassword, String userFirstName, String userLastName, String userEmail, int ersUserRolesFk, int ersReimbursmentFk) {
		super();
		this.ersUserid = ersUserid;
		this.setErsUsername(ersUsername);
		this.setErsPassword(ersPassword);
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.setErsUserRolesFk(ersUserRolesFk);
		this.ersReimbursmentFk = ersReimbursmentFk;
	}

	//We need an "all args minus id" constructor because the id is handled on the database side
	//when inserting data into a database, we should give objects with no id since the database gives each record an id
	public ErsUser(String ersUsername, String ersPassword, String userFirstName, String userLastName, String userEmail, int ersUserRolesFk, int ersReimbursmentFk) {
		super();
		this.setErsUsername(ersUsername);
		this.setErsPassword(ersPassword);
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.setErsUserRolesFk(ersUserRolesFk);
		this.ersReimbursmentFk = ersReimbursmentFk;
	}
	
	public ErsUser(int id, String firstName, String lastName, String emailAddress, int ers_reimbursment_fk,
			int ers_reimbursment_fk2) {
		// TODO Auto-generated constructor stub
	}

	public ErsUser(String fName, String lName, Object object) {
		// TODO Auto-generated constructor stub
	}

	//the toString() method lets us actually print out our objects, since it would print a memory address otherwise
	//(source -> generate toString)
	@Override
	public String toString() {
		return "Ers User [ersUserid=" + ersUserid + ", User First Name=" + userFirstName + ", User Last Name=" + userLastName
				+ ", Reimbursment=" + ersReimbursmentFk + "]";
	}


	//getters and setters allow you to access and change your private variables... ENCAPSULATION
	//(source -> generate getters and setters, make sure to check all the boxes)
	public int ersUserid() {
		return ersUserid;
	}

	public void setErsUserid(int ersUserid) {
		this.ersUserid = ersUserid;
	}

	public String getUserFirstName() {
		return userFirstName;
	}
	
	public String setUserFirstName() {
		return userFirstName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void getUserEmail(String userEmail) {
	}

	public void setUserEmail(String userEmail) {
	}

	public String getErsPassword() {
		return ersPassword;
	}

	public void setErsPassword(String ersPassword) {
		this.ersPassword = ersPassword;
	}

	public String getErsUsername() {
		return ersUsername;
	}

	public void setErsUsername(String ersUsername) {
		this.ersUsername = ersUsername;
	}

	public int getErsUserRolesFk() {
		return ersUserRolesFk;
	}

	public void setErsUserRolesFk(int ersUserRolesFk) {
		this.ersUserRolesFk = ersUserRolesFk;
	}

	public int getErsUserid() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}