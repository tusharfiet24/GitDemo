package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void cleanup() {
		// delete the cookies, read the report, close the connections
		System.out.println("I will execute After Test");
	}
	
	@Test
	public void Demo() {
		System.out.println("hello");
		Assert.assertTrue(true);
	}
	
	@AfterSuite
	public void Afsuite() {
		// 
		System.out.println("I will execute After Suite");
	}
	
	@Test
	public void SecondTest() {
		System.out.println("bye");
		Assert.assertFalse(false);
	}
}