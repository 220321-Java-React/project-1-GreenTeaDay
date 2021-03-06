package com.revature.models;

public class ErsUser {

	//variables for the employee class - must match the employees table in the database
	//note the private variables, private coupled with getters and setters (see below) are how we achieve ENCAPSULATION
	private int ersUserid;
	private String ers_username;
	private String ers_password;
	private String user_first_name;
	private String user_last_name;
	private String user_email;
	private int ers_user_roles_fk;
	private int ers_reimbursmentid_fk;
	
	
	public ErsUser(int ersUserid, String ers_username, String ers_password, String user_first_name,
			String user_last_name, String user_email, int ers_user_roles_fk, int ers_reimbursmentid_fk) {
		super();
		this.ersUserid = ersUserid;
		this.ers_username = ers_username;
		this.ers_password = ers_password;
		this.user_first_name = user_first_name;
		this.user_last_name = user_last_name;
		this.user_email = user_email;
		this.ers_user_roles_fk = ers_user_roles_fk;
		this.ers_reimbursmentid_fk = ers_reimbursmentid_fk;
	}
	
	public ErsUser(String ers_username, String ers_password, String user_first_name,
			String user_last_name, String user_email, int ers_user_roles_fk, int ers_reimbursmentid_fk) {
		super();
		this.ers_username = ers_username;
		this.ers_password = ers_password;
		this.user_first_name = user_first_name;
		this.user_last_name = user_last_name;
		this.user_email = user_email;
		this.ers_user_roles_fk = ers_user_roles_fk;
		this.ers_reimbursmentid_fk = ers_reimbursmentid_fk;
	}
	

	public ErsUser(String ers_username, String ers_password) {
		super();
		this.ers_username = ers_username;
		this.ers_password = ers_password;
	}

	public int getErsUserid() {
		return ersUserid;
	}
	public void setErsUserid(int ersUserid) {
		this.ersUserid = ersUserid;
	}
	public String getErs_username() {
		return ers_username;
	}
	public void setErs_username(String ers_username) {
		this.ers_username = ers_username;
	}
	public String getErs_password() {
		return ers_password;
	}
	public void setErs_password(String ers_password) {
		this.ers_password = ers_password;
	}
	public String getUser_first_name() {
		return user_first_name;
	}
	public void setUser_first_name(String user_first_name) {
		this.user_first_name = user_first_name;
	}
	public String getUser_last_name() {
		return user_last_name;
	}
	public void setUser_last_name(String user_last_name) {
		this.user_last_name = user_last_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public int getErs_user_roles_fk() {
		return ers_user_roles_fk;
	}
	public void setErs_user_roles_fk(int ers_user_roles_fk) {
		this.ers_user_roles_fk = ers_user_roles_fk;
	}
	public int getErs_reimbursmentid_fk() {
		return ers_reimbursmentid_fk;
	}
	public void setErs_reimbursmentid_fk(int ers_reimbursmentid_fk) {
		this.ers_reimbursmentid_fk = ers_reimbursmentid_fk;
	}
	@Override
	public String toString() {
		return "ErsUser [ersUserid=" + ersUserid + ", ers_username=" + ers_username + ", ers_password=" + ers_password
				+ ", user_first_name=" + user_first_name + ", user_last_name=" + user_last_name + ", user_email="
				+ user_email + ", ers_user_roles_fk=" + ers_user_roles_fk + ", ers_reimbursmentid_fk="
				+ ers_reimbursmentid_fk + ", getErsUserid()=" + getErsUserid() + ", getErs_username()="
				+ getErs_username() + ", getErs_password()=" + getErs_password() + ", getUser_first_name()="
				+ getUser_first_name() + ", getUser_last_name()=" + getUser_last_name() + ", getUser_email()="
				+ getUser_email() + ", getErs_user_roles_fk()=" + getErs_user_roles_fk()
				+ ", getErs_reimbursmentid_fk()=" + getErs_reimbursmentid_fk() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

// regen'd getters and setters

	//Every Employee in this application will have a role associated with it
	// private Role role; //in other words, every EMPLOYEE has a ROLE

	
	//this class won't have any methods, we just need it to represent (aka MODEL) some data
	
	//boilerplate code below------------------------------
	//boilerplate code is any code that you'll probably write over and over again
	//most classes that we make objects of will have constructors, getters/setters, toString
	//so java makes this easy for us with the source tab 
	
	//remember all of this can be generated with the source tab
	
	//no args constuctor (source -> constructor from superclass)


	