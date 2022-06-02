package com.access.testcases;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.access.pageobject.loginpage;
import org.testng.annotations.Listeners;

@Listeners 
public class Login_tc_1 extends BaseClass
{

	@Test
	public void loginpage()
	{
		driver.get(baseURL);
		// User Check Button disabled Till all Mandatory Fields are not filled  
		loginpage lp= new loginpage(driver);
		lp.setUserName(email);
		//loginpage loginPg = PageFactory.initElements(driver, loginpage.class);
		WebElement button = lp.test();
		if(button.isEnabled())
			AssertJUnit.assertTrue(false);
		else
			AssertJUnit.assertTrue(true);

		lp.setPassword(password);
		lp.clickSubmit();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		}
}
