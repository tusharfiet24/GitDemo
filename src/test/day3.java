package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	// testNG will decide method/test execution order Alphabetically based on
	// method/test name.

	@BeforeClass
	public void Befoclas() {
		// selenium
		System.out.println("Before class  will be executing before any method in day3 class");
	}

	@Parameters({"URL"})
	@Test
	public void Weblogin(String urlname) {
		// selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
	}

	@Test(groups = { "Smoke" })
	public void MobileSignincarLoan() {
		// Appium
		System.out.println("mobileSignincar");
	}

	@AfterClass
	public void Aftrclas() {
		// selenium
		System.out.println("After class will be executing after all methods in day3 class");
	}

	@BeforeSuite
	public void Bfsuite() {
		//
		System.out.println("I will execute Before Suite");
	}

	@Test(dataProvider = "getData", enabled=true, timeOut=4000)
	public void MobileSignoutcarLoan(String username, String password) throws InterruptedException {
		// Appium
		Thread.sleep(3900);
		System.out.println("mobileSignoutcar");
		System.out.println(username);
		System.out.println(password);
	}

	@Test(dependsOnMethods = { "Weblogin" })
	public void APIcarLoan() {
		// rest API automation
		System.out.println("apilogincar");
	}

	@BeforeMethod
	public void beforeevery() {
		// selenium
		System.out.println("I will execute Before every test method in a class");
	}

	@AfterMethod
	public void Afterevery() {
		// delete cache, clear cookies
		System.out.println("I will execute After every test method in a class");
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st Combination - username password - good Credit history
		//2nd username password - no credit history
		//3rd Fraudelent credit history
		Object[][] data = new Object[3][2];
		data[0][0] = "firstsetusername";
		data[0][1] = "password";
		
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;
	}

}
