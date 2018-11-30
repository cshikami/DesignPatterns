package com.cshikami.looping;
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
		
		for(int i = 0; i < months.length; i++) {
			System.out.println(months[i]);
		}
		
	}
}
