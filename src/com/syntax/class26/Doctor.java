package com.syntax.class26;

public class Doctor {

	private long licenseID;
	private long phoneNumber;
	private String email;
	
	public void setEmail(String email) {
		
		if(!email.isEmpty()) {//if email is not empty only then initialize variable
			if(email.contains("gmail")) {
				this.email=email;
			}else {//otherwise give warning message
				System.out.println("Email must be of gmail type");
			}
			
		}else {//otherwise give warning message
			System.out.println("Email cannot be empty");
		}
	}
	
	public String getEmail() {
		return email;
	}
}