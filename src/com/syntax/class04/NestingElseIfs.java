package com.syntax.class04;

public class NestingElseIfs {
	public static void main(String[] args) {
		//if student completed the qui,we will check for a score
		// if score will be more than 90--> great job
		//if score will be more than 80-->well done
		//if score will be more than 70--> you could have done better
		//if student did not complete the quiz-->not good
		//please do hw on time 
			
		boolean quizCompleted=true;
		int score=86;
		
		if(quizCompleted) {
			System.out.println("Lets check your score.");
			if(score>90) {
				System.out.println("Great job! You studied a lot.");
			}else if (score>80) {
				System.out.println("Well done!");
			}else if (score>70) {
				System.out.println("You could have done better!");
			}else  {
				System.out.println("You failed.");
			}
			
			}else {
			System.out.println("Please do HW on time.");
		}


		}

	
}
