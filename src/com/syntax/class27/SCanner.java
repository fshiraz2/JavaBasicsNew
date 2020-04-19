package com.syntax.class27;

import java.util.Scanner;
import java.util.ArrayList;
class Scanner {
	public static void main(String[] args) {
		ArrayList<Integer> arrlist = new ArrayList<>();

		Scanner input = new Scanner(System.in);
		for (int i=0;i<5;i++){
			arrlist.add(input.nextInt());
		}

		for (int num : arrlist) {
			System.out.print(num + " ");
		}
	}
}
