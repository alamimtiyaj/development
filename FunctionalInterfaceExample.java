package com.util;

@FunctionalInterface // If I will enable this annotation so it will check if more then one interface
						// is available it throw error
interface sayable {
	// abstact Method
	void say(String msg);

	// default method
	default String HelloWorld() {
		return "Hello World";
	}

	public static String CustomMessage(String msg) {
		return msg;
	}

	// void weekdays(String day); // Another Interface
}

public class FunctionalInterfaceExample implements sayable {
    public void say(String msg){  
        System.out.println(msg);  
    }  
	public void weekdays(String day) {
		System.out.println(day);
	}

	public static void main(String[] args) {  
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample(); 
        
        fie.say("Hello there");//calling abstract method  
        
        fie.weekdays("Monday");
        
        System.out.println(fie.HelloWorld());  //calling default
        System.out.println(sayable.CustomMessage("Hi Static Method"));
        
    	
        
    }

}