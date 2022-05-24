package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass {
	@FindBy(id = "firstName")
	private WebElement fname;

	@FindBy(id = "lastName")
	private WebElement lname;

	@FindBy(id = "userEmail")
	private WebElement email;

	@FindBy(xpath = "//label[.='Male']")
	private WebElement mradio;

	@FindBy(xpath = "//label[.='Female']")
	private WebElement fradio;

	@FindBy(xpath = "//label[.='Other']")
	private WebElement oradio;

	@FindBy(id = "userNumber")
	private WebElement mno;

	@FindBy(id = "dateOfBirthInput")
	private WebElement dob;
	
	@FindBy(xpath="//div[.='18']")
	private WebElement date;

	@FindBy(id = "subjectsContainer")
	private WebElement subname;

	@FindBy(xpath = "//label[.='Sports']")
	private WebElement scheck;

	@FindBy(xpath = "//label[.='Reading']")
	private WebElement rcheck;

	@FindBy(xpath = "//label[.='Music']")
	private WebElement mcheck;

	@FindBy(id = "uploadPicture")
	private WebElement pic;

	@FindBy(id = "currentAddress")
	private WebElement cadd;

	@FindBy(id = "state")
	private WebElement state;

	@FindBy(xpath = "(//div[.='Select City'])[2]")
	private WebElement city;
	
	@FindBy(id="submit")
	private WebElement sub;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	private WebElement dd1;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	private WebElement dd2;
	

	// Initialization...
	public Pomclass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public void firstname(String uname) {
		fname.sendKeys(uname);
	}

	public void lastname(String laname) {
		lname.sendKeys(laname);
	}

	public void userMail(String emid) {
		email.sendKeys(emid);
	}

	public void mradio() {
		mradio.click();
	}

	public void fradio() {
		fradio.click();
	}

	public void oradio() {
		oradio.click();
	}

	public void mobile(String mob) {
		mno.sendKeys(mob);
	}

	public void dateofBirth() {
		dob.click();
	}

	public WebElement getdd1()
	{
		return dd1;
	}
		
		public WebElement getdd2()
	{
		return dd2;
	}
	
	public void dateselect()
	{
		date.click();
	}
	 
	public void cbox1()
	{
		scheck.click();
	}
	
	public void cbox2()
	{
		rcheck.click();
	}
	
	public void cbox3()
	{
		mcheck.click();
	}
	
	public void photo(String picture)
	{
		pic.sendKeys(picture);
	}
	
	public void caddress(String address)
	{
		cadd.sendKeys(address);
	}
	
	public void dropdown1()
	{
		state.click();
	}
	
	public void dropdown2()
	{
		city.click();
	}
	
	public void lastbutton()
	{
		sub.click();
	}
	

}
