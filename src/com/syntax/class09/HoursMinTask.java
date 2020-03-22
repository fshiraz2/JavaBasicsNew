package com.syntax.class09;

public class HoursMinTask {

	public static void main(String[] args) {
		
		for (int hour=0;hour<=23;hour++) {
			
			for (int min=0;min<60;min++){
			if(min<10) {
			System.out.println(hour+":0"+ min);
			
	
				}else {
					System.out.println(hour+":"+min);
				}
			}
		}
	}
}

	


