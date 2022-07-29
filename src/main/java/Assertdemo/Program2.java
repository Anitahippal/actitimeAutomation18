package Assertdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Program2 {
	
	@Test
	public void test() {
		
		String message= "How day!!  Welcome Anita";
		System.out.println("Line 1 got executed");
		System.out.println("Line 2 got executed");
		System.out.println("Line 3 got executed");
		System.out.println("Line 4 got executed");
		System.out.println("Line 5 got executed");
		
	//	Assert.assertTrue(message.contains("How day!!  Welcome"));    //assert the partial text "How day Welocme
		Assert.assertTrue(message.contains("How day!!  Wecome")); 
		
		
		System.out.println("Line 6 got executed");
		System.out.println("Line 7 got executed");
		System.out.println("Line 8 got executed");
		System.out.println("Line 9 got executed");
		System.out.println("Line 10 got executed");
		
		
	}

}



