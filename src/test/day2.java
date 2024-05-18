package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	@Parameters({"URL", "APIKey/Username"})
	@Test(groups = { "Smoke" })
	public void ploan(String urlname, String Key) {
		System.out.println("good");
		System.out.println(urlname);
		System.out.println(Key);
		Assert.assertTrue(false);
	}

	@BeforeTest
	public void prerequiste() {
		// Cleanup data, delete records in db
		System.out.println("I will execute Before Test");
	}

}
