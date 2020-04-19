package com.syntax.class26;

public class Encap {

	
		private String empName;
		private int empAge;

		
		public void setName(String empName){
		this.empName="John";
		}
		public void setAge(int empAge){
		this.empAge=30;
		}
	    public String getempName(){
			  return empName;
			}
			public int getempAge(){
			  return empAge;
			}
		}
 class EncapTest{
	public static void main (String[]args) {
		Encap pp=new Encap();
		pp.setName("John");
		System.out.println("Employee Name: "+pp.getempName());
		pp.setAge(30);
		System.out.println("Employee Age: "+pp.getempAge());
	}
}