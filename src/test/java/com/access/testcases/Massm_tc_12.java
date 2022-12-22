package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.Clipboard;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Massm_tc_12 extends BaseClass

{
	
	public void MassMessaging() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//AdmUser ad=new AdmUser(driver);
		//ad.userlocation();
		//Thread.sleep(5000);
		//ad.okbutton();
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(10000);
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("dudhe");
		//User Enter FirstName
		addp.fname("rakesh");
		//User Enter MiddleName
		addp.mname("kumar");
		//User Enter Birthdate
		addp.DOB("01091999");
		//User Enter PhoneNumber
		addp.pnumber("7777777777");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("rakesh@gmail.com");
		addp.Clip_AppointTime("0945");
		addp.Clip_Location();
		Thread.sleep(2000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		Thread.sleep(10000);
		addp.Clip_Seeing();
		Thread.sleep(1000);
		addp.Clip_Thoms();
		Thread.sleep(3000);
		//addp.Clip_Flag();
      //  addp.Clip_Flag_Option();
		addp.Clip_Comment("Nill");
		//addp.Clip_Reason("only checkup");
		//addp.Clip_Copay("10000");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.Clip_Addpatient();
		addp.Clip_Checkin();
		addp.Alert_ok();
		Thread.sleep(10000);
		Appointments ab = new Appointments(driver);
		ab.linkAppointment();
		Thread.sleep(10000);
		ab.Configurelist();
		Thread.sleep(10000);
		ab.EditStatusFilter();
		Thread.sleep(10000);
		ab.Status_SelectAll();
		Thread.sleep(5000);
		ab.StatusSave();
		Thread.sleep(10000);
		ab.ThreeDot();
		Thread.sleep(10000);
		ab.ThreeDotCancel();
		Thread.sleep(10000);
		WebElement cancel = driver.findElement(By.xpath("//span[contains(text(),'CANCELLED')]"));
		Assert.assertEquals(true, cancel.isDisplayed());
		System.out.println("Cancel Status is Displayed- Asser Passed");

}
}