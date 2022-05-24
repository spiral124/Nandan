package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass1 implements Frame_constant{
	public WebDriver driver;
	WebDriverWait wait;
	@BeforeMethod
	public void openapp() {
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.get(URL);
		wait=new WebDriverWait(driver,10);
		}

	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}



}