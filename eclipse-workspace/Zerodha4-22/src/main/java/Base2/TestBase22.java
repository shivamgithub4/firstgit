package Base2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase22 {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase22() throws IOException {
		prop = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\shiva\\eclipse-workspace\\Zerodha4-22\\config\\config.Properties");
		prop.load(file);

	}

	public static void initialization22() {

		System.setProperty("WebDriver.Chrome.driver", "Chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
