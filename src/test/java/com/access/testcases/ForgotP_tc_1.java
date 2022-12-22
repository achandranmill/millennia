package com.access.testcases;
import org.testng.annotations.Test;
import com.access.pageobject.*;

public class ForgotP_tc_1 extends BaseClass
{

	@Test

	public void ForgotPassword() throws Exception
	{

		ForgotPassword obj=new ForgotPassword(driver);
		obj.linkfogotpassword();

		obj.fpemail("ravi@exampale.com");

		Thread.sleep(3000);

	}
}
