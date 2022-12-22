package com.access.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.Get_In_Line;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Clip_tc_6 extends BaseClass

{
	
       //--------------------Link Connect Account (Child)-----------------
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
		Thread.sleep(5000);
		AdmUser ad=new AdmUser(driver);
		try
		{
		ad.userlocation();
		Thread.sleep(5000);
		ad.okbutton();
		System.out.println("USER LOCATION IS PRESENT");
		}
		catch(Exception e) 
		{
			System.out.println("USER LOCATION IS Not PRESENT");
			
		}
		//-----------------REGISTRATION PAGE ------------------------------
		RegtPage r=new RegtPage(driver);
		r.clickRegistrationPage();
		Thread.sleep(3000);
        //---------------------CLIP BOARD PAGE-------------------------
		Clipboard addp=new Clipboard(driver);
		addp.LinkclickBoard();
		Thread.sleep(5000);
		//User Enter lastName
		addp.lname("RUNEE");
		//User Enter FirstName
		addp.fname("jony");
		//User Enter MiddleName
		addp.mname("Thomson");
		//User Enter Birthdate
		addp.DOB("01031993");
		//User Enter PhoneNumber
		addp.pnumber("7777777777");
		Thread.sleep(2000);
		//User Enter Email
		addp.textemail("user_test@mailinator.com");
		addp.Clip_AppointTime("0945");
		addp.Clip_Seeing();
		Thread.sleep(1000);
		addp.Clip_Thoms();
		Thread.sleep(2000);
		addp.Clip_Appointment_Type();
		Thread.sleep(2000);
		addp.Clip_Appointment_option();
		Thread.sleep(2000);
        addp.Clip_Comment("Nill");
		addp.sendSmsMessages();
		addp.sendEmailMessages();
		addp.Clip_LinkConnectAccount();
		addp.Clip_Linkpatient();
		Thread.sleep(2000);
		addp.Clip_LinkChildoption();
		Thread.sleep(1000);
		addp.Clip_Addpatient();
		Thread.sleep(1000);
		addp.Clip_Checkin();
		Thread.sleep(1000);
		addp.Alert_ok();
		Thread.sleep(10000);
	  //-----------Verify new appointment appears on "My Events" for Cohort not Self when logging into Connect portal -----------------------
		driver.get("https://connect-stage-a.jellyfishhealth.com:443/inline?d=Imenso.sandbox-staging");
	  //------------------GET-IN-LINE-----(CONNECT PORTAL)----------------------------------	
		Get_In_Line of = new Get_In_Line(driver);
		of.Sing_in();
		Thread.sleep(1000);
		of.Sign_Email("user_test@mailinator.com");
		Thread.sleep(1000);
		of.Sign_Password("Random@123456789");
		Thread.sleep(1000);
		of.Sign_Submit(); 
		Thread.sleep(15000);
	  //----------------------MY EVENT PAGE-----------------------------------
		of.My_Events();
		Thread.sleep(10000);
		WebElement Link_Connect_Self = driver.findElement(By.xpath("//h2[contains(text(),'RUNEE, jony')]"));
		String Expected = "RUNEE, jony";
		Assert.assertEquals(Link_Connect_Self.getText(), Expected);
		System.out.println(" RUNEE patient's Appointment is Displayed on Connect portal - Assert PASSED");
		Thread.sleep(1000);
		
	}
	}


