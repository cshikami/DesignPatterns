import java.util.Scanner;

public class SwitchLogicFactory implements IManagingProgramFlowFactory {

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void implementProgramFlowLogic() {
		// TODO Auto-generated method stub
System.out.println("You are in the ManagingProgramFlow switchStatement method.");
		
		System.out.println("Enter a number (1: January, 2: February, 3: March)");
		String input = sc.nextLine();
		int monthNumber = Integer.parseInt(input);
		
		switch(monthNumber) {
		case 1:
			System.out.println("The month is January.");
			break;
		case 2:
			System.out.println("The month is February.");
			break;
		case 3:
			System.out.println("The month is March.");
			break;
		default:
			System.out.println("You chose another month.");
		}
	}

}
