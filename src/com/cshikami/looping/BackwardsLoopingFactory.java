package com.cshikami.looping;

public class BackwardsLoopingFactory implements ILoopingFactory{

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
	
	@Override
	public void createLoop() {
		for(int i = months.length - 1; i >= 0; i--) {
			System.out.println(months[i]);
		}
	}

}
