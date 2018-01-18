package studio1;

import cse131.ArgsProcessor;

public class Average {
	
	public static void main(String[] args) {
		
		ArgsProcessor ap = new ArgsProcessor(args);
		// input the student name and corresponding score
		String name = ap.nextString("Please provide the student's name?");
		int part = ap.nextInt("What is student's participation points ?");
		int quiz = ap.nextInt("What is student's quiz score ?");
		int studio = ap.nextInt("What is student's studio score ?");
		int lab = ap.nextInt("What is student's lab score ?");
		int extension = ap.nextInt("What is student's extension score ?");
		int ex1 = ap.nextInt("What is student's exam 1 score ?");
		int ex2 = ap.nextInt("What is student's exam 2 score ?");
		int ex3 = ap.nextInt("What is student's exam 3 score ?");
		
		// calculating weighted grade 
		
		double ave = (double) part*0.1 + quiz*0.02 + studio*0.08 + lab*0.25 + extension*0.25 + ex1*0.1 + ex2*0.1 + ex3*0.1 ;
		int finalGrade = (int) ave;
		
		// find out last digit of the score 
		int endDigit = finalGrade % 10;
		
		// varialble for plus or minus 
		boolean gradeMinu = endDigit < 3;
		boolean gradePlus = endDigit > 6 && endDigit < 10; 
	
		
		// print out calculation result
		System.out.println(name + ":");
		System.out.println("    Total score: " + ave);
		System.out.println("    Grade for this course: " + finalGrade);
		System.out.println("    Final grade has a ... ");
		System.out.println("          Plus: " + gradePlus);
		System.out.println("          Minus: " + gradeMinu);
		
		
		
	}
}



