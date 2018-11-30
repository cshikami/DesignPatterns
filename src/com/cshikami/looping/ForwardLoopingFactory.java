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

		System.out.println("Enter option (1: incrementing loop, 2: for-each loop):");

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
			}

		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
