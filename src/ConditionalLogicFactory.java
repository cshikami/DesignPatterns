import java.util.Scanner;

public class ConditionalLogicFactory implements IManagingProgramFlowFactory {

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void implementProgramFlowLogic() {
		
		System.out.println("You are in the ManagingProgramFlow conditionalLogic method.");
		
		System.out.println("Enter a month(1-12):");
		
		String userInput = sc.nextLine();
		int monthNumber = Integer.parseInt(userInput);
		
		if(monthNumber >= 1 && monthNumber <= 3) {
			System.out.println("You're in Quarter 1.");
		} else if(monthNumber >= 4 && monthNumber <= 6) {
			System.out.println("You're in Quarter 2.");
		} else if(monthNumber >= 7 && monthNumber <= 9) {
			System.out.println("You're in Quarter 3.");
		} else if(monthNumber >= 10 && monthNumber <= 12) {
			System.out.println("You're in Quarter 4.");
		}
		else {
			System.out.println("That's an unknown month.");
		}

	}

}
