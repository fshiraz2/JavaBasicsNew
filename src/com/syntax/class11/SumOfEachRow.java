package com.syntax.class11;

public class SumOfEachRow {

	

		
			public static void main(String[] args)
			{
				int[][] a = {
					{1,1,2}, //sum = 4
					{3,1,2}, //sum = 6
					{3,5,3}, //sum = 11
					{0,1,2}  //sum = 3
				};
		  int i,j,sum = 0; 
			  
			   
			    for (i = 0; i <a.length; ++i) { 
			        for (j = 0; j <a[i].length; ++j) { 
			  
			            
			            sum = sum+ a[i][j]; 
			        } 
			          
			    
			        System.out.println(sum); 
			        sum=0;
				}
			
		
		}

	}


