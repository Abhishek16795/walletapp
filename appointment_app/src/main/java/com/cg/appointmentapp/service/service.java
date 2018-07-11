package com.cg.appointmentapp.service;

import com.cg.appointmentapp.bean.patientbean;
import com.cg.appointmentapp.exception.myexception;

public interface service {
	public boolean ifnamevalid(String name);
	public boolean ifemailvalid(String email);
	public boolean ifmobilenumvalid(String mobilenum);
	public void addDetails(patientbean patient);
	public int getAppID(patientbean patient);
	public boolean existid(int id,patientbean patient) throws myexception;
	
}
