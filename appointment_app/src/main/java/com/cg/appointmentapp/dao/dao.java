package com.cg.appointmentapp.dao;

import java.util.HashMap;

import com.cg.appointmentapp.bean.patientbean;
import com.cg.appointmentapp.exception.myexception;

public interface dao {

	public void addDetails(patientbean patient);
	public int getAppID(patientbean patient);
	public boolean existid(int id) throws myexception;
	public patientbean getMap(int id);
	
}

