package com.syntax.class23;

public class AddAllElements {

	
		  public static int sum2D(int[][] nums) {
				int sum = 0;
				// sum of each individual row
				for (int row = 0; row < nums.length; row++) {

					for (int col = 0; col < nums[row].length; col++) {
						sum = sum + nums[row][col];
					}
				}
				return sum;
			}
		}
class AddAllElementsTest {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(AddAllElements.sum2D(a)); // should print 45
	}
}