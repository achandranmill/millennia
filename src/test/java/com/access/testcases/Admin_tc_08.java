package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Departments;
import com.access.pageobject.loginpage;

public class Admin_tc_08 extends BaseClass

{
	
	public void Admin() throws Exception
	{


		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

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
		ad.registration();
		Thread.sleep(5000);
		ad.admprofile();
		Thread.sleep(5000);
		ad.admlink();
		Thread.sleep(5000);
		Departments dept=new Departments(driver);
		dept.departmentlink();
		Thread.sleep(5000);
		dept.clipboardlink();
		Thread.sleep(5000);
		//-------Clipboard Patient Field---------------------------------
		dept.AddMore();
		Thread.sleep(2000);
		dept.Middle_Name_Select();
		Thread.sleep(2000);
		dept.Middle_Name_Size_Select();
		Thread.sleep(2000);
		dept.Middle_Name_Field("Middle Name");
		Thread.sleep(2000);
		dept.AddMore();
		Thread.sleep(2000);
		dept.Dob_Select();
		Thread.sleep(2000);
		dept.Dob_Field_Size();
		Thread.sleep(2000);
		dept.Dob_Field_Name("DOB");
		Thread.sleep(2000);
		dept.AddMore();
		Thread.sleep(2000);
		dept.Phone_Name_Select();
		Thread.sleep(2000);
		dept.Phone_Name_Size_Select();
		Thread.sleep(2000);
		dept.Phone_Name_Field("Phone Number");
		Thread.sleep(2000);
		dept.AddMore();
		Thread.sleep(2000);
		dept.Email_Name_Select();
		Thread.sleep(2000);
		dept.Email_Name_Size_Select();
		Thread.sleep(2000);
		dept.Email_Name_Field("Email");
		Thread.sleep(2000);
		dept.AddMore();
		Thread.sleep(2000);
		dept.Additional_Phone_Name_Select();
		Thread.sleep(2000);
		dept.Additional_Phone_Size_Select();
		Thread.sleep(2000);
		dept.Adiditional_Phone_Field("Adiditional Phone");
		Thread.sleep(2000);
		dept.AddMore();
		Thread.sleep(2000);
		dept.Gender_Name_Select();
		Thread.sleep(2000);
		dept.Gender_Name_Size_Select();
		Thread.sleep(2000);
		dept.Gender_Name_Field("Gender");
		Thread.sleep(2000);
		dept.AddMore();
		Thread.sleep(2000);
		dept.SSN_Name_Select();
		Thread.sleep(2000);
		dept.SSN_Name_Size_Select();
		Thread.sleep(2000);
		dept.SSN_Name_Field("SSN");
		Thread.sleep(2000);
		dept.MRN_Name_Select();
		Thread.sleep(2000);
		dept.MRN_Name_Size_Select();
		Thread.sleep(2000);
		dept.AddMore();
		Thread.sleep(2000);
		dept.Additional_Contact_Name_Select();
		Thread.sleep(2000);
		dept.Additional_Contact_Size_Select();
		Thread.sleep(2000);
		dept.Additional_Contact_Field("Additional Contact Number");
		Thread.sleep(2000);
		dept.savebtnclk();
		Thread.sleep(5000);
		boolean Configuration_Message=driver.findElement(By.xpath("//span[contains(text(),'Clipboard configuration saved.')]")).isDisplayed();
		Assert.assertTrue(Configuration_Message);
		Thread.sleep(2000);
		dept.adminprofileclk();
		Thread.sleep(5000);
		dept.returntoaccess();
		Thread.sleep(5000);
		boolean Middle_name=driver.findElement(By.xpath("//*[@id=\"middleInit\"]")).isDisplayed();
		Assert.assertTrue(Middle_name);
		Thread.sleep(1000);
		boolean Dob = driver.findElement(By.xpath("//input[@name=\"dob\"]")).isDisplayed();
		Assert.assertTrue(Dob);
		Thread.sleep(1000);
		boolean Phone=driver.findElement(By.xpath("//*[@id=\"phoneNumber\"]")).isDisplayed();
		Assert.assertTrue(Phone);
		Thread.sleep(1000);
		boolean Email =driver.findElement(By.xpath("//*[@id=\"email\"]")).isDisplayed();
		Assert.assertTrue(Email);
		Thread.sleep(1000);
		boolean Additional_phone=driver.findElement(By.xpath("//*[@id=\"appointmentContactNumber\"]")).isDisplayed();
		Assert.assertTrue(Additional_phone);
		Thread.sleep(1000);
		boolean Gender = driver.findElement(By.xpath("//*[@id=\"gender\"]")).isDisplayed();
		Assert.assertTrue(Gender);
		Thread.sleep(1000);
		boolean SSN=driver.findElement(By.xpath("//*[@id=\"ssn\"]")).isDisplayed();
		Assert.assertTrue(SSN);
		Thread.sleep(1000);
		boolean MRN= driver.findElement(By.xpath("//*[@id=\"mrn\"]")).isDisplayed();
		Assert.assertTrue(MRN);
		Thread.sleep(1000);
		boolean Additional_contact=driver.findElement(By.xpath("//*[@id=\"appointmentContactName\"]")).isDisplayed();
		Assert.assertTrue(Additional_contact);
		
	
			
	



	
		
		
		

}
}