package com.syntax.class10;

public class MonthsAndSeasons {

	public static void main(String[] args) {
		
	String [][]month= {
						{"Janruary","February","December"},
						{"March", "April","May"},
						{"June","July","August"},
						{"September","October","November"}
	};
	//print August
	System.out.println(month[2][2]);
	//print February 
	System.out.println(month[0][1]);
	
	int rows=month.length;//how many arrays
	int firstArray= month [0].length;
	System.out.println(firstArray);
		
	//to print them all
	for (int i=0;i<month.length;i++) {//iterates over rows
		for (int j=0;j<month[i].length;j++) {//iterates over columns
			System.out.println(month[i][j]+" ");
		}
		System.out.println();
	}
	}

	}


