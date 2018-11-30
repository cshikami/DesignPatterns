package com.cshikami.calculator;

import java.util.Scanner;

import com.cshikami.calculator.ICalculator;

public class ComplexCalculatorFactory implements ICalculator {

	@Override
	public void calculate() {
		System.out.println("You are in the ComplexCalculator calculate method.");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a numeric value: ");
		String input = scanner.nextLine();

		System.out.print("Enter a numeric value: ");
		String input2 = scanner.nextLine();
		
		System.out.println("Choose an operation (+ - * /): ");
		String operator = scanner.nextLine();
		
		double result = 0;
		
		try {
			switch(operator) {
			case "+":
				result = addValues(input, input2);
				break;
			case "-":
				result = subtractValues(input, input2);
				break;
			case "*":
				result = multiplyValues(input, input2);
				break;
			case "/":
				result = divideValues(input, input2);
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
	
	static double addValues(String input, String input2) {
		double result = Double.parseDouble(input) + Double.parseDouble(input2);
		return result;
	}
	
	static double subtractValues(String input, String input2) {
		double result = Double.parseDouble(input) - Double.parseDouble(input2);
		return result;
	}
	
	static double multiplyValues(String input, String input2) {
		double result = Double.parseDouble(input) * Double.parseDouble(input2);
		return result;
	}
	
	static double divideValues(String input, String input2) {
		double result = Double.parseDouble(input) / Double.parseDouble(input2);
		return result;
	}
	
}
