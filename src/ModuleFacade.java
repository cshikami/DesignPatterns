import java.util.Scanner;

public class ModuleFacade {

	private IExceptionHandlingAndDebugging exceptionHandlingAndDebugging; //facade pattern

	public ModuleFacade() {
		this.exceptionHandlingAndDebugging = new ExceptionHandlingAndDebugging(); //facade pattern
	}

	public void userInputControlFlow() {

		IExceptionHandlingAndDebugging exceptionHandlingAndDebugging = new ExceptionHandlingAndDebugging();
		IManagingProgramFlowFactory managingProgramFlowFactory = null; //Abstract Factory pattern
		ICalculator calculatorFactory = null; //Abstract Factory pattern



		Scanner scanner = new Scanner(System.in);
		boolean askAgain = true;
		while(askAgain) {

			System.out.println("Pick an option:\n"
					+ "1: ExceptionHandlingAndDebugging\n"
					+ "2: ManagingProgramFlowConditionalLogic\n"
					+ "3: ManagingProgramFlowSwitchStatement\n"
					+ "4: SimpleCalculatorCalc\n"
					+ "or press q to quit."
					);
			String userInput = scanner.nextLine();

			switch(userInput) {

			case "1":
				exceptionHandlingAndDebugging = new ExceptionHandlingAndDebugging();
				exceptionHandlingAndDebugging.welcomeArray();
				break;
			case "2":
				managingProgramFlowFactory = new ConditionalLogicFactory(); //abstract factory pattern
				managingProgramFlowFactory.implementProgramFlowLogic();
				break;
			case "3":
				managingProgramFlowFactory = new SwitchLogicFactory(); //abstract factory pattern
				managingProgramFlowFactory.implementProgramFlowLogic();
				break;
			case "4":
				calculatorFactory = new SimpleCalculatorFactory(); //abstract factory pattern
				calculatorFactory.calculate();
				break;
			case "q":
				askAgain = false;
				System.out.println("You quit the program.");
				break;
			default:
				System.out.println("You chose another option. Please pick one of the listed options.");
				break;
			}
		}
	}
}
