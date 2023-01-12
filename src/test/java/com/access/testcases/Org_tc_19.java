package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Org_tc_19 extends BaseClass

{
	public void Organization() throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setUserName(email);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
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
		Thread.sleep(3000);
		pd.UserAdmin();
		Thread.sleep(3000);
		pd.Admin();
		Thread.sleep(3000);
		Organization og = new Organization(driver);
		og.Organization();
		Thread.sleep(3000);
		og.Messages();
		Thread.sleep(2000);
		og.MessageAddnew();
		Thread.sleep(2000);
		og.CreateCustomMessage();
		Thread.sleep(2000);
		og.MessageContinue();
		Thread.sleep(2000);
		og.VoiceMessage();
		Thread.sleep(2000);
		og.VoiceRecipients();
		Thread.sleep(2000);
		og.VoiceRecipientsAppointment();
		Thread.sleep(2000);
		og.VoiceSendFrom();
		Thread.sleep(2000);
		og.VoiceMessageContent("Hello");
		Thread.sleep(2000);
		og.VoiceResponse();
		Thread.sleep(2000);
		og.VoiceResponseText("Hi");
		Thread.sleep(2000);
		og.VoiceResponseselect();
		Thread.sleep(2000);
		og.VoiceResponseTextup("How are you");
		Thread.sleep(2000);
		og.VoiceMailContent("How are you");
		Thread.sleep(2000);
		og.MessageSaveChange();



	}
}