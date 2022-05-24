package Generic;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_Methods
{
	public static Select dropdown(WebElement ele)
	{
		Select sel=new Select(ele);
		return sel;
	}
	
	public static Actions actions(WebDriver driver)
	{
		Actions act=new Actions(driver);
		return act;
	}
	
	public static Robot keyboard_functions(WebDriver driver) throws AWTException
	{
		Robot rbt=new Robot();
		return rbt;
	}
	
	public static JavascriptExecutor scrollanddisabled(WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		return jse;
	}
	
	public static String get_title(WebDriver driver)
	{
		String title = driver.getTitle();
		return title;
	}
	
	public static String get_url(WebDriver driver)
	{
		 String url = driver.getCurrentUrl();
		 return url;
	}
}
