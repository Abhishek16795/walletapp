package com.cg.appointmentapp.dao;

import com.cg.appointmentapp.bean.patientbean;
import com.cg.appointmentapp.exception.myexception;

public interface dao {

	public void addDetails(patientbean patient);
	public int getAppID(patientbean patient);
	public boolean existid(int id,patientbean patient) throws myexception;
	
}

