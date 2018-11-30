import java.util.Scanner;

public class ExceptionHandlingAndDebugging implements IExceptionHandlingAndDebugging {
	
	public void welcomeArray() {
		
		System.out.println("You are in the ExceptionHandlingAndDebugging welcomeArray method.");
		
		System.out.println("Enter a String greater than 10 characters.");
		
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		
		char[] chars = userInput.toCharArray();
		System.out.println(chars.length);
		
		try {
			if (chars.length < 10) {
				throw (new Exception("String less than 10 characters."));
			}
			
			char lastChar = chars[chars.length - 1];
			System.out.println(lastChar);
			
			String sub = userInput.substring(10);
			System.out.println("Substring past 10th char: " + sub);
			
		} catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("Array index problem!");
		} catch(StringIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("String index problem!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
