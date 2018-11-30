package com.cshikami.programflow;
//import java.util.Scanner;
//
//public class ManagingProgramFlowFactory implements IManagingProgramFlowFactory {
//	
//	Scanner sc = new Scanner(System.in);
//	
//	public void conditionalLogic() {
//		
//		System.out.println("You are in the ManagingProgramFlow conditionalLogic method.");
//		
//		System.out.println("Enter a month(1-12):");
//		
//		String userInput = sc.nextLine();
//		int monthNumber = Integer.parseInt(userInput);
//		
//		if(monthNumber >= 1 && monthNumber <= 3) {
//			System.out.println("You're in Quarter 1.");
//		} else if(monthNumber >= 4 && monthNumber <= 6) {
//			System.out.println("You're in Quarter 2.");
//		} else if(monthNumber >= 7 && monthNumber <= 9) {
//			System.out.println("You're in Quarter 3.");
//		} else if(monthNumber >= 10 && monthNumber <= 12) {
//			System.out.println("You're in Quarter 4.");
//		}
//		else {
//			System.out.println("That's an unknown month.");
//		}
//	}
//	
//	public void switchStatement() {
//		
//		System.out.println("You are in the ManagingProgramFlow switchStatement method.");
//		
//		System.out.println("Enter a number (1: January, 2: February, 3: March)");
//		String input = sc.nextLine();
//		int monthNumber = Integer.parseInt(input);
//		
//		switch(monthNumber) {
//		case 1:
//			System.out.println("The month is January.");
//			break;
//		case 2:
//			System.out.println("The month is February.");
//			break;
//		case 3:
//			System.out.println("The month is March.");
//			break;
//		default:
//			System.out.println("You chose another month.");
//		}
//		
//	}
//
//}
