package com.access.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.access.pageobject.AdmUser;
import com.access.pageobject.Clipboard;
import com.access.pageobject.Document;
import com.access.pageobject.Get_In_Line;
import com.access.pageobject.Provider;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;

@Test
public class Document_tc_3  extends BaseClass

{

	public void Document() throws Exception
	{
		driver.get("https://connect-stage-a.jellyfishhealth.com:443/inline?d=Imenso.sandbox-staging");
		//----------------GET-IN-LINE (CONNECT PORTAL)--------------------------------
		Get_In_Line of = new Get_In_Line(driver);
		of.Sing_in();
		Thread.sleep(1000);
		of.Sign_Email("albert@gmail.com");
		Thread.sleep(1000);
		of.Sign_Password("A@lbert123");
		Thread.sleep(1000);
		of.Sign_Submit();
		Thread.sleep(15000);
		of.My_Documents();
		Thread.sleep(10000);
		Document d  =  new Document(driver);
		List<WebElement>Buttons = driver.findElements(By.xpath("//span[@class=\"material-icons icon\"]"));
		System.out.println("Total button" + Buttons.size());
		boolean buttons_count = false;
		for(WebElement ele:Buttons)
		{
			String value = ele.getText();
			System.out.println(value);
			if(value.contentEquals("print , edit"))
			{
				buttons_count = true;
				break;

			}
		}
		d.Button_print_edit();




	}

}
