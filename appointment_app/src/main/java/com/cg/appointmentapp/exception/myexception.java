package com.cg.appointmentapp.exception;

public class myexception extends Exception {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		String message;
		
		public myexception(String msg) 
		{
			message=msg;
		}
		
		@Override
		public String getMessage()
		{
			return message;
		}

	}


