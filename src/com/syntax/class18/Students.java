package com.syntax.class18;

public class Students {

//Task2

	//Write a java program of  Students that takes students name and 3 subject grades.
	//Inside your class also have a method to Calculate Average Grade. 
	//Test Student class for 5 different students with different marks. 
	//Your program should print an average mark of each students name.
	//NOTE: please use different names for instance and local variables

	String studentName;
	int math, english, science;
	//constructor
	Students(String name, int x, int y, int z) {
		studentName = name;
		math = x;
		english = y;
		science = z;
	}
	//method to calculate average grade
	int averageMark() {
		int average = 0;
		average = (math + english + science) / 3;
		return average;
	}
	public static void main(String[] args) {
		
		//System.out.println("===Student-1===");
		
		Students student1 = new Students("Student-1", 95, 90, 80);
		int st1 = student1.averageMark();
		System.out.println(student1.studentName + " has average mark= " + st1);
		
		//System.out.println("===Student-2===");
		
		Students student2 = new Students("Student-2", 98, 90, 85);
		st1 = student2.averageMark();
		System.out.println(student2.studentName + " has average mark= " + st1);
		
		//System.out.println("===Student-3===");
		
		Students student3 = new Students("Student-3", 75, 60, 80);
		st1 = student3.averageMark();
		System.out.println(student3.studentName + " has average mark= " + st1);
		
		//System.out.println("===Student-4===");
		
		Students student4 = new Students("Student-4", 65, 80, 72);
		st1 = student4.averageMark();
		System.out.println(student4.studentName + " has average mark= " + st1);
		
		//System.out.println("===Student-5===");
		
		Students student5 = new Students("Student-5", 95, 68, 72);
		st1 = student5.averageMark();
		System.out.println(student5.studentName + " has average mark= " + st1);
	}
}
