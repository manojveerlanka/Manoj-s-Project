package com.manojss.api1;

public class test {
	
	
	
	
	
	
	
	
	
	
	
	
	class Counter {
	    static int count = 0;

	    Counter() {
	        count++; // Shared across all objects
	    }
	}

	new Counter();
	new Counter();
	System.out.println(Counter.count); // Outputs: 2


}
