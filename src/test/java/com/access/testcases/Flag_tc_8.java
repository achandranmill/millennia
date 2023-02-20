package com.access.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.Departments;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Flag_tc_8 extends BaseClass

{

	public void Organization() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(10000);
		AdmUser ad=new AdmUser(driver);
		try
		{
			ad.userlocation();
			Thread.sleep(5000);
			ad.okbutton();
			System.out.println("User location is present");
		}
		catch(Exception e) 
		{
			System.out.println("User location is not present");

		}
		//-----------------REGISTRATION PAGE ------------------------------
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		Provider pd = new Provider(driver);
		//	pd.LocationPopup("Florida");
		Thread.sleep(3000);
		pd.UserAdmin();
		Thread.sleep(3000);
		pd.Admin();
		Thread.sleep(3000);
		Departments dept=new Departments(driver);
		dept.departmentlink();
		Thread.sleep(5000);
		dept.Dep_Flag();
		Thread.sleep(20000);
		dept.Dep_Flag_File();
		Thread.sleep(5000);
		dept.Dep_File_Crop();
		Thread.sleep(5000);
		dept.Dep_File_lable("Diocese of Ely");
		Thread.sleep(2000);
		dept.Dep_File_persistent();
		Thread.sleep(2000);
		dept.Dep_File_Add();
		Thread.sleep(5000);
		boolean Dep_Flag = driver.findElement(By.xpath("//div[@class=\"enabled-container\"]//h3[contains(text(),'Assigned Flags')]//following::div//h3[contains(text(),'Diocese of Ely')]")).isDisplayed();
		Assert.assertTrue(Dep_Flag);
		Thread.sleep(2000);
		WebElement Disabled_Flag = driver.findElement(By.xpath("//div[@class=\"enabled-container\"]//h3[contains(text(),'Assigned Flags')]//following::div//h3[contains(text(),'Diocese of Ely')]"));
		Disabled_Flag.click();
		Thread.sleep(5000);
		boolean Dep_Flag1 = driver.findElement(By.xpath("//div[@class=\"disabled-container\"]//h3[contains(text(),'Unassigned Flags')]//following::div[@class=\"well\"]//h3[contains(text(),'Diocese of Ely')]")).isDisplayed();
		Assert.assertTrue(Dep_Flag1);
		dept.Dep_Flag_Adminuser();
		Thread.sleep(10000);
		dept.Dep_Flag_ReturnAccess();
		Thread.sleep(3000);
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("Perez");
		//User Enter FirstName
		addp.fname("Cole");
		//User Enter MiddleName
		addp.mname("Ell");
		//User Enter Birthdate
		addp.DOB("01031999");
		//User Enter PhoneNumber
		addp.pnumber("8888888888");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("john@gmail.com");
		Thread.sleep(2000);
		addp.Clip_AppointTime("0930");
		addp.Clip_Location();
		Thread.sleep(2000);
		addp.Clip_Location_option();
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		Thread.sleep(2000);
		addp.Clip_Flag();
		Thread.sleep(10000);
		try
		{
		boolean tiger = driver.findElement(By.xpath(" //span[contains(text(),'Diocese of Ely')]")).isDisplayed();
		Assert.assertFalse(tiger);
		}
		catch(Exception e)
		{
			System.out.println("Flag is disables--Testcase Passed");
		}
		



	}
}
