package com.cg.appointmentapp.dao;

import java.util.HashMap;

import com.cg.appointmentapp.bean.patientbean;
import com.cg.appointmentapp.exception.myexception;

public class daoimpl implements dao {

	HashMap<Integer,patientbean> h1 = new HashMap<Integer, patientbean>();
	
	
	public int getAppID(patientbean patient) {
		// TODO Auto-generated method stub
		int id;
		int min = 1000;
		int max = 9999;

		id = (int) (Math.random()*((max-min)+1)+min); 
		return id;
	}

	public void addDetails(patientbean patient) {
		// TODO Auto-generated method stub
		h1.put(patient.getAppID(), patient);
		
	}

	public boolean existid(int id,patientbean patient) throws myexception {
		// TODO Auto-generated method stub
		
		if(h1.containsKey(id))
		return true;
		else
		return false;
	}
}