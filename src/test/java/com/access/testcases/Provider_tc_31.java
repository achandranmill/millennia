package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@Test
public class Provider_tc_31 extends BaseClass

{

	public void Provider() throws Exception
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
		pd.Provider();
		Thread.sleep(3000);
		pd.EditProvider();
		Thread.sleep(3000);
		pd.EditfirstName("Robert");
		Thread.sleep(2000);
		pd.EditmiddleName("Kel");
		Thread.sleep(2000);
		pd.EditlastName("Del");
		Thread.sleep(2000);
		pd.Editcredentials("cd");
		Thread.sleep(2000);
		pd.EditemailAddress("robert@gmail.com");
		Thread.sleep(2000);
		pd.EditSendMessage();
		Thread.sleep(2000);
		pd.EditphoneNumber("9999999999");
		Thread.sleep(2000);
		pd.EditgenderDropdown();
		Thread.sleep(2000);
		pd.EditMale();
		//Thread.sleep(2000);
		//pd.EditUnpublished();
		Thread.sleep(2000);
		pd.EditproviderId("Test1");
		Thread.sleep(2000);
		pd.EditproviderNPI("123456789");
		Thread.sleep(2000);
		pd.EditDepartment();
		Thread.sleep(2000);
		pd.EditCheckAll();
		Thread.sleep(2000);
		pd.EditDisplayName("Robert");
		Thread.sleep(2000);
		pd.EditChangePassword();
		Thread.sleep(2000);
		pd.EditpasswordInput("S@u1i2l3");
		Thread.sleep(2000);
		pd.EditConfirmPassword("S@u1i2l3");
		Thread.sleep(2000);
		pd.EditDone();
		pd.EditSave();


	}
}