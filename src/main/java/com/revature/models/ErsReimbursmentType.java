package com.revature.models;

public class ErsReimbursmentType {
	private int ers_reimbursment_typeid;
	private String reimbursment_type;
	
	@Override
	public String toString() {
		return "ErsReimbursmentType [ers_reimbursment_typeid=" + ers_reimbursment_typeid + ", reimbursment_type="
				+ reimbursment_type + ", getErs_reimbursment_typeid()=" + getErs_reimbursment_typeid()
				+ ", getReimbursment_type()=" + getReimbursment_type() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getErs_reimbursment_typeid() {
		return ers_reimbursment_typeid;
	}
	public void setErs_reimbursment_typeid(int ers_reimbursment_typeid) {
		this.ers_reimbursment_typeid = ers_reimbursment_typeid;
	}
	public String getReimbursment_type() {
		return reimbursment_type;
	}
	public void setReimbursment_type(String reimbursment_type) {
		this.reimbursment_type = reimbursment_type;
	}	
}
