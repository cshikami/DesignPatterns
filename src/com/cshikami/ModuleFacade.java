package com.cshikami;

import java.util.Scanner;

import com.cshikami.calculator.ComplexCalculatorFactory;
import com.cshikami.calculator.ICalculator;
import com.cshikami.calculator.SimpleCalculatorFactory;
import com.cshikami.dataCollections.IDataCollectionsFactory;
import com.cshikami.dataCollections.SimpleArraysFactory;
import com.cshikami.exceptionHandling.ExceptionHandlingAndDebugging;
import com.cshikami.exceptionHandling.IExceptionHandlingAndDebugging;
import com.cshikami.looping.BackwardsLoopingFactory;
import com.cshikami.looping.ForwardLoopingFactory;
import com.cshikami.looping.ILoopingFactory;
import com.cshikami.overloadingMethodWithDifferentSignatures.AddValues;
import com.cshikami.programFlow.ConditionalLogicFactory;
import com.cshikami.programFlow.IManagingProgramFlowFactory;
import com.cshikami.programFlow.SwitchLogicFactory;

public class ModuleFacade {

	private IExceptionHandlingAndDebugging exceptionHandlingAndDebugging; //facade pattern
	private AddValues addValues;

	public ModuleFacade() {
		this.exceptionHandlingAndDebugging = new ExceptionHandlingAndDebugging(); //facade pattern
		this.addValues = new AddValues();
	}

	public void userInputControlFlow() {

		IExceptionHandlingAndDebugging exceptionHandlingAndDebugging = new ExceptionHandlingAndDebugging();
		IManagingProgramFlowFactory managingProgramFlowFactory = null; //Abstract Factory pattern
		ICalculator calculatorFactory = null; //Abstract Factory pattern
		ILoopingFactory loopingFactory = null; //Abstract Factory pattern
		AddValues addValues = new AddValues();
		IDataCollectionsFactory dataCollectionsFactory = null; //Abstract Factory pattern

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
					+ "7: AddValues\n"
					+ "8: ComplexCalculator\n"
					+ "9: UsingSimpleArrays\n"
					+ "10: Using Two-Dimensional Arrays\n"
					+ "11: Using Other Data Collections\n"
					+ "q: Quit"
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
			case "7":
				addValues = new AddValues();
				addValues.getValues();
				break;
			case "8":
				calculatorFactory = new ComplexCalculatorFactory();
				calculatorFactory.calculate();
				break;
			case "9":
				dataCollectionsFactory = new SimpleArraysFactory();
				dataCollectionsFactory.showDataCollection();
				break;
			case "10":
				dataCollectionsFactory = new TwoDimensionalArraysFactory();
				dataCollectionsFactory.showDataCollection();
				break;
			case "11":
				dataCollectionsFactory = new OtherDataCollections();
				dataCollectionsFactory.showDataCollection();
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
