package com.revature.models;

public class ersReimbursment {

	private int ers_reimbursmentid;
	private int reimb_amount;
	private int reimb_submitted;
	private boolean reimb_resolved;
	private int reimb_description;
	private String reimb_author;
	private int reimb_resolver;
	private int reimb_status_id;
	private String reimb_receipt;
	private int reimb_type_id;
	private int ers_userid_fK;
	private int ers_reimbursment_status_fk;

	
	//boilerplate code below------------------------------------------
	//we need getters and setters to make our private variables visible - ENCAPSULATION
	
	//no args constructor
	
	
	public ersReimbursment() {
		super();
		// TODO Auto-generated constructor stub
	}


	//all args constructor
	public ersReimbursment(int ers_reimbursmentid, int reimb_amount, int reimb_submitted, boolean reimb_resolved,
			int reimb_description, String reimb_author, int reimb_resolver, int reimb_status_id, String reimb_receipt,
			int reimb_type_id, int ers_userid_fK, int ers_reimbursment_status_fk) {
		super();
		this.ers_reimbursmentid = ers_reimbursmentid;
		this.reimb_amount = reimb_amount;
		this.reimb_submitted = reimb_submitted;
		this.reimb_resolved = reimb_resolved;
		this.reimb_description = reimb_description;
		this.reimb_author = reimb_author;
		this.reimb_resolver = reimb_resolver;
		this.reimb_status_id = reimb_status_id;
		this.reimb_receipt = reimb_receipt;
		this.reimb_type_id = reimb_type_id;
		this.ers_userid_fK = ers_userid_fK;
		this.ers_reimbursment_status_fk = ers_reimbursment_status_fk;
	}

	//when dealing with JDBC (Java DataBase Connectivity) applications, we like to make "all-args minus id" constructors
	//these will come in handy when we need to insert more data, because ID is handled on the database side.
	public ersReimbursment(int reimb_amount, int reimb_submitted, boolean reimb_resolved,
			int reimb_description, String reimb_author, int reimb_resolver, int reimb_status_id, String reimb_receipt,
			int reimb_type_id, int ers_userid_fK, int ers_reimbursment_status_fk) {
		super();
		this.reimb_amount = reimb_amount;
		this.reimb_submitted = reimb_submitted;
		this.reimb_resolved = reimb_resolved;
		this.reimb_description = reimb_description;
		this.reimb_author = reimb_author;
		this.reimb_resolver = reimb_resolver;
		this.reimb_status_id = reimb_status_id;
		this.reimb_receipt = reimb_receipt;
		this.reimb_type_id = reimb_type_id;
		this.ers_userid_fK = ers_userid_fK;
		this.ers_reimbursment_status_fk = ers_reimbursment_status_fk;
	}
	
	


	@Override
	public String toString() {
		return "ersReimbursment [ers_reimbursmentid=" + ers_reimbursmentid + ", reimb_amount=" + reimb_amount
				+ ", reimb_submitted=" + reimb_submitted + ", reimb_resolved=" + reimb_resolved + ", reimb_description="
				+ reimb_description + ", reimb_author=" + reimb_author + ", reimb_resolver=" + reimb_resolver
				+ ", reimb_status_id=" + reimb_status_id + ", reimb_receipt=" + reimb_receipt + ", reimb_type_id="
				+ reimb_type_id + ", ers_userid_fK=" + ers_userid_fK + ", ers_reimbursment_status_fk="
				+ ers_reimbursment_status_fk + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}



	
	
}