package com.syntax.class11;

public class MoreExamples2DArray {

	public static void main(String[] args) {
		//lets create 2D array in which we store proffesions 
		
		String[][]professions= {
				{"QA Tester","Developers","Product Owner","Scrum Mater"},
				{"Math Teacher","Science Teacher","ESL Teacher"},
				{"Dentist","Surgeon"}		
		};
       //get elements using advanced for loop
		
		for (String[] occupation:professions) {
			for (String title:occupation) {
				System.out.println(title+" ");
			}
		}
	}

}

