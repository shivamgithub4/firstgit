package Page22;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base2.TestBase22;

public class dashboardPage extends TestBase22 {

	public dashboardPage() throws IOException {
		super();
	}
	@FindBy(xpath = "//span[@class='nickname']")
	private WebElement nickname;
	@FindBy(xpath = "//span[@class='user-id']")
	private WebElement usid;
	@FindBy(xpath = "//h4[@class='username']")
	private WebElement usname;
	@FindBy(xpath = "//div[@class='email']")
	private WebElement email;

	public void DashboardPage() {
		PageFactory.initElements(driver, this);

	}

	public String verifyNickname() {
		return nickname.getText();
	}

	public String verifyUsid() {
		return userid.getText();
	}

	public String verifyUsname() {
		return usname.getText();
	}

	public String verifyEmail() {
		return email.getText();
	}
}
