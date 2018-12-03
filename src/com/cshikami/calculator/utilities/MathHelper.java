package com.cshikami.calculator.utilities;

public class MathHelper {
	
	public static double addValues(String input, String input2) {
		double result = Double.parseDouble(input) + Double.parseDouble(input2);
		return result;
	}
	
	public static double subtractValues(String input, String input2) {
		double result = Double.parseDouble(input) - Double.parseDouble(input2);
		return result;
	}
	
	public static double multiplyValues(String input, String input2) {
		double result = Double.parseDouble(input) * Double.parseDouble(input2);
		return result;
	}
	
	public static double divideValues(String input, String input2) {
		double result = Double.parseDouble(input) / Double.parseDouble(input2);
		return result;
	}
}
