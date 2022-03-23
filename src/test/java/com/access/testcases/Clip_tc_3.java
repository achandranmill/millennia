package com.access.testcases;
import java.io.IOException;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import com.access.pageobject.Clipboard;
import com.access.pageobject.loginpage;
@Test
public class Clip_tc_3 extends BaseClass
{
	public void Clipboard() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		//User Check Successful login on valid email and password
		loginpage lp= new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
	Clipboard addp=new Clipboard(driver);
		Thread.sleep(5000);
		addp.lname("Robin");
		addp.fname("john");
		Thread.sleep(10000);
//		addp.newClearButton();
//		addp.lname("Robin");
//		Thread.sleep(10000);
//		addp.pdetails();
//		addp.UCheckIn();
//		addp.CUCheckIn();
}	
}
	
