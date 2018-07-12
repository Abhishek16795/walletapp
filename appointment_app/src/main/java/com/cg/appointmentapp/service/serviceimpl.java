package com.cg.appointmentapp.service;

import java.util.HashMap;

import com.cg.appointmentapp.bean.patientbean;
import com.cg.appointmentapp.dao.dao;
import com.cg.appointmentapp.dao.daoimpl;
import com.cg.appointmentapp.exception.myexception;

public class serviceimpl implements service {

	static String namePattern= "[A-Z]{1}[a-z]{2,}";
	static String mobPattern="[0-9]{10}";
	static String emailPattern="^[\\w-\\+]+(\\.[\\w]+)*@[\\w]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
	dao d1 = new daoimpl();
	
	public boolean ifnamevalid(String name) {
		// TODO Auto-generated method stub
		if(name.matches(namePattern))
			return true;
		else
			return false;
	}
	
	public boolean ifemailvalid(String email) {
		// TODO Auto-generated method stub
		if(email.matches(emailPattern))
			return true;
		else
			return false;
	}
	
	public boolean ifmobilenumvalid(String mobilenum) {
		// TODO Auto-generated method stub
		if(mobilenum.matches(mobPattern))
			return true;
		else
			return false;
	}

	
	
	public int getAppID(patientbean patient) {
		// TODO Auto-generated method stub
		return d1.getAppID(patient);
	}

	public void addDetails(patientbean patient) {
		// TODO Auto-generated method stub
		d1.addDetails(patient);
	}

	public boolean existid(int id) throws myexception {
		// TODO Auto-generated method stub
		
		return d1.existid(id);
	}

	public patientbean getMap(int id) {
		// TODO Auto-generated method stub
		return d1.getMap(id);
	}

	
	
	

	

	

}
