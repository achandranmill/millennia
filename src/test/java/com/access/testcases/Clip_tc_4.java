package com.access.testcases;
import java.io.IOException;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import com.access.pageobject.Clipboard;
import com.access.pageobject.loginpage;
@Test
public class Clip_tc_4 extends BaseClass
{
	public void Clipboard() throws InterruptedException, IOException
	{	
		//Clipboard addp = PageFactory.initElements(driver, Clipboard.class);
		
		driver.get(baseURL);
		//User Check Successful login on valid email and password
		loginpage lp= new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);{
			Clipboard addp=new Clipboard(driver);
			Thread.sleep(5000);
			addp.lname("Robin");
			addp.fname("john");
			Thread.sleep(5000);
			addp.pdetails();
		addp.UCheckIn();
		addp.CUCheckIn();
		}}
}