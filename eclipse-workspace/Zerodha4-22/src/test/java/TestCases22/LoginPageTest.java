package TestCases22;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base2.TestBase22;
import Page22.Loginpage22;

public class LoginPageTest extends TestBase22 {
	public LoginPageTest() throws IOException {
		super();
	}

	Loginpage22 Login;

	@BeforeMethod
	public void setup22() throws IOException {
		initialization22();
		Login = new Loginpage22();
	}

	@Test
	public void validateLoginPageTitleTest() {

		String expzerodhaTitle = "Kite - Zerodha's fast and elegant flagship trading platform";

		String actzerodhaTitle = Login.validateLoginPageTitle();
		Reporter.log("Title=" + actzerodhaTitle);
	}

	@Test
	public void validatekiteLogoTest() {
		boolean value = Login.validatekiteLogo();
		Assert.assertEquals(value, true);
		Reporter.log("kite logo is =" + value);
	}

	@Test
	public void validatezerodhaLogoTest() {
		Boolean value = Login.validatezerodhaLogo();
		Assert.assertEquals(value, true);
	}

	@Test
	public void loginZerodhaAccTest() throws InterruptedException {
		Login.loginZerodhaAcc();
	}

	@AfterMethod
	public void Exit22() {
		driver.close();
	}
}