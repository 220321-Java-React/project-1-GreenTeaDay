package com.revature.models;

public class ErsReimbursmentStatus {
	
	private int ers_reimbursment_statusid;
	private String reimbursment_status;
	private int reimb_status_id_fk;
	@Override
	public String toString() {
		return "ErsReimbursmentStatus [ers_reimbursment_statusid=" + ers_reimbursment_statusid
				+ ", reimbursment_status=" + reimbursment_status + ", reimb_status_id_fk=" + reimb_status_id_fk
				+ ", getErs_reimbursment_statusid()=" + getErs_reimbursment_statusid() + ", getReimbursment_status()="
				+ getReimbursment_status() + ", getReimb_status_id_fk()=" + getReimb_status_id_fk() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getErs_reimbursment_statusid() {
		return ers_reimbursment_statusid;
	}
	public void setErs_reimbursment_statusid(int ers_reimbursment_statusid) {
		this.ers_reimbursment_statusid = ers_reimbursment_statusid;
	}
	public String getReimbursment_status() {
		return reimbursment_status;
	}
	public void setReimbursment_status(String reimbursment_status) {
		this.reimbursment_status = reimbursment_status;
	}
	public int getReimb_status_id_fk() {
		return reimb_status_id_fk;
	}
	public void setReimb_status_id_fk(int reimb_status_id_fk) {
		this.reimb_status_id_fk = reimb_status_id_fk;
	}
}

