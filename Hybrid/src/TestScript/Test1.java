package TestScript;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Baseclass;
import Generic.Generic_Excel;
import Generic.Utility_Methods;
import PomScript.Pomclass;

public class Test1 extends Baseclass{
	@Test
	public void test() throws EncryptedDocumentException, IOException, AWTException, InterruptedException  
	{
		String username=Generic_Excel.getData("Sheet1", 0, 0);
		String lastname=Generic_Excel.getData("Sheet1", 1, 0);
		String userMail=Generic_Excel.getData("Sheet1", 2, 0);
		String mobileno=Generic_Excel.getData("Sheet1", 3, 0);
		
		Pomclass pm=new Pomclass(driver);
		pm.firstname(username);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("firstName"))));
		
		pm.lastname(lastname);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("lastName"))));
		
		pm.userMail(userMail);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userEmail"))));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//label[.='Male']"))));
		pm.mradio();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//label[.='Female']"))));
		pm.fradio();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//label[.='Other']"))));
		pm.oradio();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userNumber"))));
		pm.mobile(mobileno);
		
		Utility_Methods.scrollanddisabled(driver).executeScript("window.scrollBy(0,700)");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("dateofBirthInput"))));
		pm.dateofBirth();
	
		Utility_Methods.dropdown(pm.getdd1()).selectByVisibleText("May");
		
		Utility_Methods.dropdown(pm.getdd2()).selectByVisibleText("1995");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[.='18']"))));
		pm.dateselect();
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("subjectContainer")))).click();
		Thread.sleep(2000);
		
		Utility_Methods.keyboard_functions(driver).keyPress(KeyEvent.VK_E);
		Thread.sleep(2000);
		
		Utility_Methods.keyboard_functions(driver).keyPress(KeyEvent.VK_ENTER);	   
		
		pm.cbox1();
		pm.cbox2();
		pm.cbox3();
		 
		pm.photo(mobileno);
		pm.caddress("Rajajinagar");
		Utility_Methods.scrollanddisabled(driver).executeScript("window.scrollBy(0,100)");
		pm.dropdown1();
		Utility_Methods.keyboard_functions(driver).keyPress(KeyEvent.VK_ENTER);
		pm.dropdown2();
		Utility_Methods.keyboard_functions(driver).keyPress(KeyEvent.VK_ENTER);
/*
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("google_ads_iframe_/21849154601,22343295815/Ad.plus"));
		driver.findElement(By.id("cb")).click();
		*/
		
		pm.lastbutton();
		Thread.sleep(2000);
		WebElement ltext=driver.findElement(By.xpath("//div[contains(.,'Thanks')])[5]"));
		String text=ltext.getText();
		Assert.assertEquals(text,"Thanks for submitting the");
		System.out.println("Framework ends");
		
	}

}
