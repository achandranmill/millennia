package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;


@Test
public class Provider_tc_31 extends BaseClass

{
	
	//To verify that Edit Details of Details page works properly
	
	public void Provider() throws Exception
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
		pd.Provider();
		Thread.sleep(3000);
		pd.EditProvider();
		Thread.sleep(3000);
		
		pd.EditfirstName("robert");
		Thread.sleep(2000);
		pd.EditmiddleName("kel");
		Thread.sleep(2000);
		pd.EditlastName("del");
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
		pd.EditproviderId("ed");
		Thread.sleep(2000);
		pd.EditproviderNPI("tdf");
		Thread.sleep(2000);
		pd.EditDepartment();
		Thread.sleep(2000);
		pd.EditCheckAll();
		Thread.sleep(2000);
		pd.EditDisplayName("robert");
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