package com.cg.appointmentapp.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.appointmentapp.bean.patientbean;
import com.cg.appointmentapp.exception.myexception;
import com.cg.appointmentapp.service.service;
import com.cg.appointmentapp.service.serviceimpl;

public class client {
	
	
	static service service = new serviceimpl();
	public static void main(String[] args) throws IOException,InputMismatchException, myexception {
		
		
		int choice =0;
		
		again:
		do{
			
			System.out.println("1.Book Appointment\n2.View Appointment\n3.Exit\n");
			Scanner sc = new Scanner(System.in);
			try{
				choice=sc.nextInt();
			}catch(InputMismatchException e)
			{
				System.out.println("Enter valid choice, numeric values only");
				continue again;
			}
		
			switch(choice){
		
			case 1:bookapp();
				break;
			
			case 2:viewapp();
				break;
			case 3:System.exit(0);
				break;
			default:
				System.out.println("Enter from choices only");
			}
		}while(choice!=9);
		
		}
	
public static void bookapp() throws IOException,InputMismatchException
{
		
		patientbean patient = new patientbean();
		String name,email,mobilenum,gender;
		int choice = 0;
		boolean flag = false,flag1 = false,flag2 = false;
		//Scanner scan = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		do{
			System.out.println("Enter your name:");
			name = reader.readLine();
			flag =service.ifnamevalid(name);
		
		if(flag == true)
		{
			patient.setName(name);
		}
		else
		{
			flag = false;
			System.out.println("Enter valid name");
		}
		}while(flag==false);
		
		do{
		System.out.println("Enter your Email:");
		email = reader.readLine();
		flag1=service.ifemailvalid(email);
		if(flag1 == true)
		{
			patient.setEmail(email);
		}
		else{
			flag1= false;
			System.out.println("Enter valid email");
		}
		}while(flag1 == false);
		do{
		System.out.println("Enter your Mobile number:");
		mobilenum = reader.readLine();
		flag2=service.ifmobilenumvalid(mobilenum);
		if(flag2==true)
		{
			patient.setMobilenum(mobilenum);
		}
		else{
			flag2=false;
			System.out.println("Enter valid mobile");
		}
		}while(flag2==false);
		
		System.out.println("Enter your Gender:");
		gender = reader.readLine();
		patient.setGender(gender);
		

		again:
		do{
			
			System.out.println("1.Heart\n2.Bone\n3.MRI\n");
			Scanner sc = new Scanner(System.in);
			try{
				choice=sc.nextInt();
			}catch(InputMismatchException e)
			{
				System.out.println("Enter valid choice, numeric values only");
				continue again;
			}
		
			switch(choice){
		
			case 1:patient.setCondition("Heart");
				   patient.setAppStatus("Approved");
				   patient.setDoctorName("Abhi");
				break;
			
			case 2:patient.setCondition("Bone");
				   patient.setAppStatus("Approved");	   
				   patient.setDoctorName("Meepo");
				break;
			case 3:patient.setCondition("MRI");
				   patient.setAppStatus("Approved");	   
			       patient.setDoctorName("Invoker");
				break;
			default:
				System.out.println("Enter from choices only");
			}
		}while(choice!=1&&choice!=2&&choice!=3);
		
		int id = service.getAppID(patient);
		patient.setAppID(id);
		System.out.println("Your appointment ID:"+id);
		service.addDetails(patient);
		
		
		}

public static void viewapp() throws myexception{
	
	int id=0;
	boolean flag = false;
	do{
	System.out.println("Enter your appointment ID:");
	Scanner scan = new Scanner(System.in);
	
	id = scan.nextInt();
	
	if(service.existid(id))
	{	
		patientbean p = new patientbean();
		p = service.getMap(id);
		System.out.println("Your name:"+p.getName());
		System.out.println("Approval Status:"+p.getAppStatus());
		System.out.println("Doctor Assigned:"+p.getDoctorName()+"\n Further details will be emailed");
		flag=true;
	}
	else
	{
		//System.out.println("Appointment ID does not exist......Register yourself");
		System.out.println("To exit press 8");
		int num =0;
		Scanner sc = new Scanner(System.in);
		if(num==8)
		{
			System.exit(0);
		}
		flag =false;
	}
	}while(false);
}
}

