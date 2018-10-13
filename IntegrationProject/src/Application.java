public class Application {

	public static void main(String[] args) {
		// Stephen Aranda
		// Hello everyone, this is going to be a project that puts together
		// the things I have learned in COP 2006
		System.out.println("Hello everyone, welcome to my awesome project");
		
		// There are a total of 8 Java built-in data types, which are
		// boolean, byte, short, int, long, float, double, and char
		// The four main types of variables are boolean, int, double, and string
		
		boolean firstValue = true ;
		
		// Boolean data types are able to hold true/false values and have a length of 1 bit
		
		byte secondValue = 15;
		// Byte data types hold values that are 8 bits long and have a minimum and maximum value of -128 and 128 respectively
		
		short thirdValue = 1588;
		// Short data types hold values that are 16 bits long and have a minimum and maximum value of -32,768 and 32,768 respectively
		
		int birthYear = 1998;
		// Int data types hold values that are 32 bits long and have a minimum and maximum value of -2^31 and 2^31 respectively
		
		long fifthValue = 568771116;
		// Long data types hold values that are 64 bits long and have a minimum and maximum value of -2^63 and 2^63 respectively
		
		float sixthValue = 3.5F;
		// Float data types hold values that are also 32 bits long, it is not used in java
		
		double gradePoint = 3.51;
		// Double data types hold values that are 64 bits long, common in java and used for decimals
		
		char eightValue = 'S';
		// Char data types are a single 16 bit Unicode character
		
		String statementOne = "My name is Stephen Aranda and I was born in the summer of " + birthYear + "." + " I currently attend FGCU and have a GPA of " + gradePoint + "." + " Everything I have stated thus far is " + firstValue + ".";
		System.out.println(statementOne);
		
		//Variables are very important to java, they are a location in memory and are used to help code become flexible and manipulate values
		// Scope refers to the section of code where a variable can be accessed
		
		final double PI = 3.141592 ;
		// Final is used to make whatever value it is assigned unchangeable or immutable
	
		System.out.println(PI);
	}

}
;