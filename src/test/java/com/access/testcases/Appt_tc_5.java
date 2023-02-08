package com.access.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Appt_tc_5 extends BaseClass	

{

	//--------------------Forms on Demand------------------------
	public void Appointments() throws Exception
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
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
		//-------------------APPOINTMENT PAGE------------------------------
		Appointments ap=new Appointments(driver);
		ap.linkAppointment();
		Thread.sleep(20000);
		//----------------Click Configure List------------------------------
		ap.Configurelist();
		Thread.sleep(2000);
		ap.EditListColumns();
		Thread.sleep(2000);
		WebElement Appoint_Type = driver.findElement(By.cssSelector("#patient-lists-component > div > div > div.tab-pane.ng-scope.active > div > table > tbody > tr:nth-child(20) > td:nth-child(2) > input"));
		if(!Appoint_Type.isSelected())
		{
			Appoint_Type.click();
		}
		else
		{
			
		}
		Thread.sleep(5000);
		ap.ColumnsSaveChange();
		Thread.sleep(5000);
		ap.Configurelist();
		Thread.sleep(2000);
		WebElement Edit_Status = driver.findElement(By.cssSelector("#appointments > div.row.header-buttons > div:nth-child(1) > div > div.form-group.dropdown.open > ul > li:nth-child(3) > a"));
		Edit_Status.click();
		Thread.sleep(2000);
		WebElement SelectAll = driver.findElement(By.xpath("//*[@id=\"appointments\"]/div[1]/div/div/status-filter/div[2]/div/div[1]/label/input"));
		if(!SelectAll.isSelected())
		{
			SelectAll.click();
		}
		else
		{

		}
		Thread.sleep(2000);
		ap.StatusSave();
		Thread.sleep(5000);
		//------------------DATE RANGE------------------------------------
		ap.AppointDATE();
		ap.AppointDATE1("2022-03-01");
		Thread.sleep(3000);
		ap.AppointDATE2("2022-04-04");
		Thread.sleep(3000);
		ap.AppointDATEAPPLY();
		Thread.sleep(10000);
		ap.Patient_Displayed();
		//-----------------THREE DOT------------------------------------
		ap.ThreeDot();
		Thread.sleep(3000);
		//------------------FORMS AND DEMAND---------------------------
		ap.FormsandDemand();
		Thread.sleep(2000);
		ap.Appointment();
		Thread.sleep(2000);
		ap.Appoint2();
		Thread.sleep(2000);
		ap.SMSDEMANDS();
		Thread.sleep(2000);
		ap.EmailDEMANDS();
		Thread.sleep(1000);
		ap.SENDDEMANDS();
		Thread.sleep(5000);
		ap.Patient_Displayed();

	}
}