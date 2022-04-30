package TestCases22;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base2.TestBase22;
import Page22.Loginpage22;
import Page22.dashboardPage;

public class DashboardPageCases extends TestBase22 {
	public DashboardPageCases() throws IOException {
		super();
	}
	dashboardPage dash;
	Loginpage22 login;
	@BeforeMethod
public void setup() throws IOException, InterruptedException {
		initialization22();
	    dash= new dashboardPage();
	    login=new Loginpage22();
	    login.loginZerodhaAcc();
}
	@Test
	public void verifyNicknameTest() throws InterruptedException {
		  String value = dash.verifyNickname();
		Thread.sleep(1000);
		Assert.assertEquals(value, "Shivam");
	}
	@Test
	public void verifyUsidTest() {
		String value = dash.verifyUsid();
		Assert.assertEquals(value,"KM7234");
	}
	@Test
	public void verifyUsnameTest() {
		String value = dash.verifyUsname();
		Assert.assertEquals(value, "Shivam Arun Mankar");
		
	}@Test
	public void verifyEmailTest() {
		String value = dash.verifyEmail();
		Assert.assertEquals(value, "shivmankar002@gmail.com");
	}
	@AfterMethod
	public void exit() {
		driver.close();
	}

	
}
