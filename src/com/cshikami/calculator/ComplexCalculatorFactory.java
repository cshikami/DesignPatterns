package com.cshikami.calculator;

import java.util.Scanner;

import com.cshikami.calculator.ICalculator;
import com.cshikami.calculator.utilities.MathHelper;

public class ComplexCalculatorFactory implements ICalculator {

	@Override
	public void calculate() {
		System.out.println("You are in the ComplexCalculator calculate method.");

		//one way of getting user input
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("Enter a numeric value: ");
//		String input = scanner.nextLine();
//
//		System.out.print("Enter a numeric value: ");
//		String input2 = scanner.nextLine();
//		
//		System.out.println("Choose an operation (+ - * /): ");
//		String operator = scanner.nextLine();
		
		InputHelper helper = new InputHelper();
		
		String input = helper.getInput("Enter a numeric value: ");
		String input2 = helper.getInput("Enter a numeric value: ");
		String operator = helper.getInput("Choose an operation (+ - * /): ");
		
		double result = 0;
		
		try {
			switch(operator) {
			case "+":
				result = MathHelper.addValues(input, input2);
				break;
			case "-":
				result = MathHelper.subtractValues(input, input2);
				break;
			case "*":
				result = MathHelper.multiplyValues(input, input2);
				break;
			case "/":
				result = MathHelper.divideValues(input, input2);
				break;
			default:
				System.out.println("Not an operator.");
				return;
			}
			
			System.out.println("The answer is: " + result);
			
		} catch(NumberFormatException e) {
			System.out.println("Number format exception: " + e.getMessage());
		}
	}
	
	class InputHelper { //nested class
		
		private String getInput(String prompt) { //another way of getting user input
			System.out.println(prompt);
			Scanner sc = new Scanner(System.in);
			return sc.nextLine();
			
		}
		
	}
	
	
	
}
