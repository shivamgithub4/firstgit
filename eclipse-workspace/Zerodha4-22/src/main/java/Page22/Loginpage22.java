package Page22;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base2.TestBase22;

public class Loginpage22 extends TestBase22 {
	@FindBy(xpath = "//*[@id=\"userid\"]")
	private WebElement UserIdTextbox;
	@FindBy(xpath = "//*[@id=\"password\"]")
	private WebElement PasswordTextbox;
	@FindBy(xpath = "//*[@id=\"container\"]/div/div/div/form/div[4]/button")
	private WebElement Loginbtn;
	@FindBy(xpath = "//*[@id=\"container\"]/header/a/img")
	private WebElement kiteTitle;
	@FindBy(xpath = "//*[@id=\"outer-base\"]/div[2]/p[1]/a")
	private WebElement zerodhaTitle;
	@FindBy(xpath = "//*[@id=\"pin\"]")
	private WebElement pinTextBox;
	@FindBy(xpath = "//*[@id=\"container\"]/div/div/div/form/div[3]/button")
	private WebElement contbtn;

	public Loginpage22() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validatekiteLogo() {
		return kiteTitle.isDisplayed();

	}

	public Boolean validatezerodhaLogo() {
		return zerodhaTitle.isDisplayed();
	}

	public void loginZerodhaAcc() throws InterruptedException {
		UserIdTextbox.sendKeys(prop.getProperty("userid"));
		Thread.sleep(2000);
		PasswordTextbox.sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		Loginbtn.click();
		Thread.sleep(2000);
		pinTextBox.sendKeys(prop.getProperty("pin"));
		Thread.sleep(2000);
		contbtn.click();

	}

}
