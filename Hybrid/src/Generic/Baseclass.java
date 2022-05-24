package Generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass implements Framework_Constants {
	public static WebDriver driver;
	public WebDriverWait wait;

	@BeforeMethod
	public void openapp() {
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver = new FirefoxDriver();
		driver.get(URL);
		wait = new WebDriverWait(driver, 10);
	}

	@AfterMethod
	public void closeapp(ITestResult res) throws IOException 
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Generic_Screenshot.getPhoto(driver);
		}
		driver.close();

	}

}
