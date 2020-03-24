package com.qa.mainPackage;


/**
 * @author SmilingGecko	
 *
 */
// could be implemented for cases on final step

public class ResultsMain {
	
	int physics = 90; int chemistry = 90; int biology = 89;
	float total = 0; float percent = 0;
	
	private int returnResults(int physics, int chemistry, int biology){
		
		
		System.out.println("Physics results: " + physics);
		System.out.println("Chemistry results: "+ chemistry);
		System.out.println("Biology results: "+ biology);
	    int result = physics + chemistry + biology;
		System.out.println("and finally, the total marks rewarded: " + result);

		return (result);
		
	}
	//need checks for if above/equal to 90
	
	public double returnPercentage(int totalScore){
		
		ResultsMain iMadeMess = new ResultsMain();
		int totalCalc = iMadeMess.returnResults(physics, chemistry, biology);
		
		double totalReturn = totalCalc*100/450;
		
		if (physics < 90){
			System.out.println("You failed physics. Can't work at black mesa now ");
		}
		if (chemistry < 90){
			System.out.println("Failed chemistry champ. I know that feel");
		}
		if (biology < 90){
			System.out.println("There's irony in a human being failing the study of biology.");
		}
		
		//set up like so to pass the final part of the task. bit more complex than earlier parts. 

		if (totalReturn >=60 && biology >=90 && chemistry >=90 && physics >=90){
			System.out.println("You pass, go celebrate. Get't pie on me lad. Earnt it. Bang up job. GG");
			System.out.println("You scored: " + totalReturn);
			return totalReturn;
			
		//original code for pass over 60 irregardless of grades was simply
		//if (totalReturn >= 60){
			//System.out.println("You pass, go celebrate. Get't pie on me lad. Earnt it. Bang up job. GG");
			//return totalReturn;
			//}

		}else{
			System.out.println("Walk the plank or be keelhauled, you failed sonny jim");
			System.out.println("You scored: " + totalReturn);
			return totalReturn;
			
		}
	}
	
 
	public static void main(String []args){
		
		ResultsMain thisTask = new ResultsMain();
		
		
		//thisTask.returnResults(90, 90, 90);
		thisTask.returnPercentage(thisTask.returnResults(90, 90, 90));
	
	}

}
