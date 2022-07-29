package Assertdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class program1 {
	
	@Test
	public void test() {
	
		//asserts equals is to compare between two values actual and expected
		System.out.println("Line 1 got executed");
		System.out.println("Line 2 got executed");
		System.out.println("Line 3 got executed");
		System.out.println("Line 4 got executed");
		System.out.println("Line 5 got executed");
		
		String actual = "selenium automation";
		String exepected = "selenium automation";      // If both the strings are not same and not equal then the line before assertion will print 
		//String exepected = "Selenium automation";     // but the lines after assertion will not print
		Assert.assertEquals(actual, exepected);
		
		System.out.println("Line 6 got executed");
		System.out.println("Line 7 got executed");
		System.out.println("Line 8 got executed");
		System.out.println("Line 9 got executed");
		System.out.println("Line 10 got executed");
		
		
	}

}
