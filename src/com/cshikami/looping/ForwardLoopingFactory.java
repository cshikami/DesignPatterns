package com.cshikami.looping;

import java.util.Scanner;

public class ForwardLoopingFactory implements ILoopingFactory {

	String[] months = {
			"January",
			"February",
			"March",
			"April",
			"May",
			"June",
			"July",
			"August",
			"September",
			"October",
			"November",
			"December"
	};

	public void createLoop() {

		System.out.println("Enter option (1: incrementing loop, 2: for-each loop, 3: while loop, 4: do-while loop):");

		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();

		try {
			switch(userInput) {
			case "1":
				System.out.println("Incrementing loop:");
				for(int i = 0; i < months.length; i++) {
					System.out.println(months[i]);
				}
				break;
			case "2":
				System.out.println("For-Each loop:");
				for(String month : months) {
					System.out.println(month);
				}
				break;
			case "3":
				System.out.println("While loop:");
				int whileLoopCounter = 0;
				while(whileLoopCounter < months.length) {
					System.out.println(months[whileLoopCounter]);
					whileLoopCounter++;
				}
			case "4":
				System.out.println("Do-While loop:");
				int doWhileLoopCounter = 0;
				do {
					System.out.println(months[doWhileLoopCounter]);
					doWhileLoopCounter++;
				} while (doWhileLoopCounter < months.length);
			}

		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
