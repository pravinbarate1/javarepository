package com.pravin.hibernate;

import java.io.Serializable;
import java.sql.Timestamp;

public class EmpBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int eid;
	String fName;
	String lName;
	String mail;
	
	Timestamp timeStamp;
	
	public Timestamp getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "EmpBean [eid=" + eid + ", fName=" + fName + ", lName=" + lName + ", mail=" + mail + ", timeStamp="
				+ timeStamp + "]";
	}
	
}
