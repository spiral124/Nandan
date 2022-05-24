package Generic;

import org.testng.annotations.Test;

import PomScript.Pom1;

public class Test2 extends Baseclass1 {
	@Test
	public void test()
	{
		String phone="oneplus";
		
		Pom1 pm=new Pom1(driver);
		pm.mobile(phone);
		
		pm.sbutton();
		
		
	}
	

}
