package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Org_tc_20 extends BaseClass

{
	 public void Organization() throws Exception
		{
			loginpage lp=new loginpage(driver);
			lp.setUserName(email);
			lp.setPassword(password);
			lp.clickSubmit();
			Thread.sleep(3000);
			
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
			og.VoiceEmail();
			Thread.sleep(2000);
			og.VoiceEmailSend();
			Thread.sleep(2000);
			og.RecipientsEmail();
			Thread.sleep(2000);
			og.RecipientsEmailappoint();
			og.VoiceEmailSend();
			Thread.sleep(2000);
			og.RecipientsEmailcc();
			og.RecipientsEmailccpatient();
			og.VoiceEmailSend();
			Thread.sleep(2000);
			og.RecipientsEmailBcc();
			og.RecipientsEmailBccPatient();
			og.VoiceEmailSend();
			Thread.sleep(2000);
			og.RecipientsEmailSubject("ji");
			Thread.sleep(2000);
			og.EmailContent("hi");
			Thread.sleep(2000);
			og.SendHL7OutboundMessage();
			Thread.sleep(2000);
			og.Address("134 city");
			Thread.sleep(2000);
			og.MessageContent("bb");
			Thread.sleep(2000);
			og.MessageDepartment();
			Thread.sleep(2000);
			og.MessageSaveChange();
			
}
}
