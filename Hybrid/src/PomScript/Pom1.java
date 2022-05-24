package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	@FindBy(id="twotabsearchtextbox")
	private WebElement search;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement button;
	
	
public Pom1(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

	public void mobile(String oneplus) {
		search.sendKeys(oneplus);
	}
	
	public void sbutton()
	{
		button.click();
	}


	}


