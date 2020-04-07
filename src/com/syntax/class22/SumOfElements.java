package com.syntax.class22;

public class SumOfElements {


		 public static double sum2d (double[ ][ ] array2d)  {
		    int sum = 0;
		    for (int row=0; row < array2d.length; row++){
		        for (int col=0; col < array2d[row].length; col++){
		            sum = (int) (sum + array2d [row][col]);
		        }
		    }

		    return sum;
		}
		}
class Main extends SumOfElements{
	  public static void main (String[]args) {
	  int[][] a = { 
	                 { 1, 2, 3 }, 
	                 { 4, 5, 6 }, 
	                 { 7, 8, 9 } 
	                                   };
	                                   
	  int sum = 0;
      for(int i = 0; i < a.length; i++)
      {
          for(int j = 0; j < a[0].length; j++)
          {
              sum += a[i][j];
          }
      }
      System.out.println("sum = " + sum);
  }
}  
	     