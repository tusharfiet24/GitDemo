package test;

import org.testng.annotations.Test;

public class day4 {
	@Test
	public void WebloginHomeLoan() {
		// selenium
		System.out.println("webloginhome");
	}

	@Test(groups = { "Smoke" })
	public void MobileLoginHomeLoan() {
		// Appium
		System.out.println("mobileloginhome");
	}

	@Test
	public void LoginAPIHomeLoan() {
		// rest API automation
		System.out.println("apiloginhome");
	}
}
