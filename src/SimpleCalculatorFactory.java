import java.util.Scanner;

public class SimpleCalculatorFactory implements ICalculator {
	
	public void calculate() {
		System.out.println("You are in the SimpleCalculator calculate method.");
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a numeric value: ");
		String input = scanner.nextLine();

		System.out.print("Enter a numeric value: ");
		String input2 = scanner.nextLine();

		System.out.print("The answer is: ");

		double inputStringToDouble1 = Double.parseDouble(input);
		double inputStringToDouble2 = Double.parseDouble(input2);
		double sum = inputStringToDouble1 + inputStringToDouble2;

		System.out.println(sum);	
	}
}
