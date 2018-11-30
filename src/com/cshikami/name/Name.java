package com.cshikami.name;

public class Name implements IName {
	
	public Name() {
	}

	@Override
	public void getName(String name) {
		System.out.println("Welcome, " + name + ".");
		underline(name);
	}
	
	static void underline(String name) {
		//underline greeting functionality
				System.out.print("*********");
				for(int i = 0; i < name.length(); i++) {
					System.out.print("*");
				}
				System.out.print("*\n");
	}
}
