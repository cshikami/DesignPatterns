package com.cshikami;

import java.util.Scanner;

import com.cshikami.name.Name;

public class Main {
	
	public static void main(String[] args) {
		
		Name name = new Name();
		
		System.out.print("Enter your name: ");
		
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		name.getName(userInput);
		
		ModuleFacade moduleFacade = new ModuleFacade();
		moduleFacade.userInputControlFlow();
	}
}