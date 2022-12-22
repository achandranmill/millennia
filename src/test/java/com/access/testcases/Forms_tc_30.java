package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.loginpage;


@Test
public class Forms_tc_30 extends BaseClass

{
	public void Appointments() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		AdmUser ad=new AdmUser(driver);
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		Thread.sleep(5000);
		Clipboard clip=new Clipboard(driver);
		Thread.sleep(5000);
		clip.clkappointmentlink();
		Thread.sleep(5000);
		clip.clkappointmentlink();
		Thread.sleep(5000);
		clip.form2threedotclick();
		Thread.sleep(5000);
		clip.form2formlinkclk();
		Thread.sleep(5000);
		clip.form2makechangesbtn();
		Thread.sleep(5000);
		clip.form2pharmacyname("Sun pharma pharmacy");
		Thread.sleep(5000);
		clip.form2pharmacyaddress("Sant josefh marg, new Delhi");
		Thread.sleep(5000);
		clip.form2primaryinsurancename("Life insurance");
		Thread.sleep(5000);
		clip.from2clicksavebtn();
		Thread.sleep(5000);




	}
}