package com.util;

interface addable {
	// abstact Method
	//String say(String msg);
	void say(String msg);
}

public class LambdaUsingFunctional {
	
	public static void main(String[] args) {
		
		
		
		addable s=(msg)->{
			//return "Hello, " + msg;
			System.out.print("Hello, " + msg);
		};
		
		//System.out.print(s.say("Lambda"));
		s.say("Lambda");
		
	}

}
