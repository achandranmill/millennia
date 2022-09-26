package com.access.testcases;

import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Organization;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Org_tc_16  extends BaseClass

{
	
	//To verify that admin able to click on Utilities tab and Select Utilities Functionalities 
	
	 public void Organization() throws Exception
		{
			loginpage lp=new loginpage(driver);
			lp.setUserName(email);
			lp.setPassword(password);
			lp.clickSubmit();
			Thread.sleep(3000);
			AdmUser ad=new AdmUser(driver);
			ad.userlocation();
			Thread.sleep(5000);
			ad.okbutton();
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
		    og.Utilities();
		    Thread.sleep(2000);
		    og.Staging();
		    Thread.sleep(2000);
		    og.Staging2();
		    Thread.sleep(2000);
		    og.SaveRedirect();
		    Thread.sleep(2000);
		    og.Department();
		    Thread.sleep(5000);
		    og.ClearDepartment();
		    Thread.sleep(2000);
		    og.ClearQueues();
		    Thread.sleep(2000);
		    og.SelectDepartment();
		    Thread.sleep(2000);
		    og.SelectDepartment1();
		    Thread.sleep(2000);
		    og.SyncTimeZone();
		    Thread.sleep(5000);
		     
	         

}
}
