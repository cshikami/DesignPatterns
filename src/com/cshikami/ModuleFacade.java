package com.cshikami;

import java.util.Scanner;

import com.cshikami.calculator.ICalculator;
import com.cshikami.calculator.SimpleCalculatorFactory;
import com.cshikami.exceptionHandling.ExceptionHandlingAndDebugging;
import com.cshikami.exceptionHandling.IExceptionHandlingAndDebugging;
import com.cshikami.looping.BackwardsLoopingFactory;
import com.cshikami.looping.ForwardLoopingFactory;
import com.cshikami.looping.ILoopingFactory;
import com.cshikami.programflow.ConditionalLogicFactory;
import com.cshikami.programflow.IManagingProgramFlowFactory;
import com.cshikami.programflow.SwitchLogicFactory;

public class ModuleFacade {

	private IExceptionHandlingAndDebugging exceptionHandlingAndDebugging; //facade pattern

	public ModuleFacade() {
		this.exceptionHandlingAndDebugging = new ExceptionHandlingAndDebugging(); //facade pattern
	}

	public void userInputControlFlow() {

		IExceptionHandlingAndDebugging exceptionHandlingAndDebugging = new ExceptionHandlingAndDebugging();
		IManagingProgramFlowFactory managingProgramFlowFactory = null; //Abstract Factory pattern
		ICalculator calculatorFactory = null; //Abstract Factory pattern
		ILoopingFactory loopingFactory = null; //Abstract Factory pattern

		Scanner scanner = new Scanner(System.in);
		boolean askAgain = true;
		while(askAgain) {

			System.out.println("Pick an option:\n"
					+ "1: ExceptionHandlingAndDebugging\n"
					+ "2: ManagingProgramFlowConditionalLogic\n"
					+ "3: ManagingProgramFlowSwitchStatement\n"
					+ "4: SimpleCalculatorCalc\n"
					+ "5: ForwardLooping\n"
					+ "6: BackwardsLooping\n"
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
			case "5":
				loopingFactory = new ForwardLoopingFactory();
				loopingFactory.createLoop();
				break;
			case "6":
				loopingFactory = new BackwardsLoopingFactory();
				loopingFactory.createLoop();
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