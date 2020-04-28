package com.syntax.class30;
import java.util.*;
public class ReplPractice {
//	Create Employee class that will be fully encapsulated and
//	will have:
//variables as FullName, ssn and salary
//constructor to initialize instance variables
//getters to have an access to instance variables
//Create a set collection that will store # objects of Employee type
//	and using Iterator print the value of each variable
//

		
		private String fullName;
		private long ssn;
		private double salary;

		public ReplPractice(String fullName, long ssn, double salary) {
			this.fullName=fullName;
			this.ssn = ssn;
			this.salary = salary;
		}
		
		public String getName() {
			return fullName;
		}

		public double getSalary() {
			return salary;
		}
		
		public long getSsn(){
		  return ssn;
		}
	}

	
	
	
	class ReplPracticeTest {
	  public static void main(String[] args) {
			
			Set<ReplPractice> company=new HashSet<>();
			company.add(new ReplPractice("John Doe", 123456789, 80000));
			company.add(new ReplPractice("Jane Smith", 987654321, 90000));
			company.add(new ReplPractice("Jackie Chan", 00000000, 1000000));
			
			Iterator<ReplPractice> it=company.iterator();
			while(it.hasNext()) {
				ReplPractice emp=it.next();
				System.out.println(emp.getName());
				System.out.println(emp.getSsn());
				System.out.println(emp.getSalary());
			}
		}
	}

