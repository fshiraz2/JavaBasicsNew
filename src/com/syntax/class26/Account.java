package com.syntax.class26;

public class Account {

	class Main {
		  public static void main(String[] args) {
		    
		    //creating instance of Account class  
		    Account acc=new Account();  
		    //setting values through setter methods  
		    acc.setAcc_no(7560504000l);  
		    acc.setName("Sumair");  
		    acc.setEmail("sumair@syntax.com");  
		    acc.setAmount(50000);  
		    //getting values through getter methods  
		    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  

		    
		  }
		}
	class Account { 
		//private data members  
		private long acc_no;  
		private String name,email;  
		private double amount;  
		//public getter and setter methods  
		public long getAcc_no() {  
		    return acc_no;  
		}  
		public void setAcc_no(long acc_no) {  
		    this.acc_no = acc_no;  
		}  
		public String getName() {  
		    return name;  
		}  
		public void setName(String name) {  
		    this.name = name;  
		}  
		public String getEmail() {  
		    return email;  
		}  
		public void setEmail(String email) {  
		    this.email = email;  
		}  
		public double getAmount() {  
		    return amount;  
		}  
		public void setAmount(double amount) {  
		    this.amount = amount;  
		}  
		  
		}  
