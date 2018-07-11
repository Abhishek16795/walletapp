package com.cg.appointmentapp.bean;

/**
 * Hello world!
 *
 */
public class patientbean 
{
	public String name;
	public String mobilenum;
	public String email;
	public String gender;
	public int age;
	public String condition;
	public int appID;
	public String doctorName;
	public String appStatus;
	
	
	
	public String getAppStatus() {
		return appStatus;
	}
	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public int getAppID() {
		return appID;
	}
	public void setAppID(int appID) {
		this.appID = appID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobilenum() {
		return mobilenum;
	}
	public void setMobilenum(String mobilenum2) {
		this.mobilenum = mobilenum2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	@Override
	public String toString() {
		return "patientbean [name=" + name + ", mobilenum=" + mobilenum + ", email=" + email + ", gender=" + gender
				+ ", age=" + age + ", condition=" + condition + ", appID=" + appID + ", doctorName=" + doctorName
				+ ", appStatus=" + appStatus + "]";
	}
	
	

	
}
