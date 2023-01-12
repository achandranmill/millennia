package com.access.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.access.pageobject.AdmUser;
import com.access.pageobject.Appointments;
import com.access.pageobject.RegtPage;
import com.access.pageobject.loginpage;



@Test
public class Appt_tc_4 extends BaseClass



{

	//-------------------------Configure List-------------------------------
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
		Thread.sleep(10000);
		ap.AppointDATE();
		ap.AppointDATE1("2022-03-01");
		ap.AppointDATE2("2022-04-06");
		ap.AppointDATEAPPLY();
		Thread.sleep(10000);

		//----------------Click Configure List------------------------------
		ap.Configurelist();
		Thread.sleep(5000);
		ap.Configure_Displayed();
		ap.EditDepartFillter();
		WebElement SelectAll1 = driver.findElement(By.xpath("//*[@id=\"appointments\"]/div[1]/div/div/department-filter/div[2]/div/div[1]/label/input"));
		if(!SelectAll1.isSelected())
		{
			SelectAll1.click();
		}
		else
		{

		}
		//------------------Click Edit Dept. Filters > Remove dept > Close----------------
		WebElement Remove_Depart = driver.findElement(By.xpath("//*[@id=\"30ddf032-541b-4add-8a0a-1ca090d5260c\"]"));
		Remove_Depart.click();
		Thread.sleep(3000);
		ap.Departmentsavechange();
		Thread.sleep(5000);
		ap.Patient_Displayed();
		Thread.sleep(5000);
		//----------------Click Configure this LIst > Remove Provider > Close----------------------
		ap.Configurelist();
		ap.EditSeeingFillter();
		WebElement SellectAll_Provider = driver.findElement(By.xpath("//*[@id=\"appointments\"]/div[1]/div/div/seeing-filter/div[2]/div[1]/label/input"));
		if(!SellectAll_Provider.isSelected())
		{
			SellectAll_Provider.click();
		}
		else
		{

		}
		WebElement Remove_Provider = driver.findElement(By.xpath("//*[@id=\"appointments\"]/div[1]/div/div/seeing-filter/div[2]/div[21]/label/input"));
		Remove_Provider.click();
		Thread.sleep(3000);
		ap.CloseBtnSeeing();
		Thread.sleep(5000);
		ap.Patient_Displayed();
		Thread.sleep(5000);
		//----------------------Click Configure this List > Edit list columns> Remove DOB > Close------
		ap.Configurelist();
		ap.EditListColumns();
		Thread.sleep(3000);
		WebElement Remove_Dob = driver.findElement(By.xpath("//*[@id=\"patient-lists-component\"]/div/div/div[2]/div/table/tbody/tr[5]/td[2]/input"));
		if(Remove_Dob.isSelected())
		{
			Remove_Dob.click();
		}
		else
		{

		}
		ap.ColumnsSaveChange();
		Thread.sleep(10000);
		ap.Patient_Displayed();
		Thread.sleep(3000);
		//--------Click Configure this List > Edit list columns> rearrange column order (Name, DOB, Appt Time) > Close-------------
		ap.Configurelist();
		ap.EditListColumns();
		ap.ApptDragDrop();
		Thread.sleep(3000);
		ap.ApptDragDrop1();
		Thread.sleep(3000);
		ap.ApptDragDrop2();
		Thread.sleep(5000);
		WebElement Save_Columns = driver.findElement(By.cssSelector("#appointments > div.modal.ng-scope.ng-isolate-scope.lists-modal-dialog.in > div > div > patient-list > div.modal-footer > button.btn.btn-primary"));
		Save_Columns.click();
		Thread.sleep(10000);
		List<WebElement>Display = driver.findElements(By.xpath("//table[contains(@class,'table table-striped table-shadow')]"));
		System.out.println(Display.size());
		for(WebElement ele:Display)
		{
			String value = ele.getText();
			System.out.println(value);
		}
		//----------------Repeat steps above and ADD back all selections----------------------------------
		ap.Configurelist();
		Thread.sleep(5000);
		ap.EditDepartFillter();
		WebElement SelectAll2 = driver.findElement(By.xpath("//*[@id=\"appointments\"]/div[1]/div/div/department-filter/div[2]/div/div[1]/label/input"));

		if(!SelectAll2.isSelected())
		{
			SelectAll2.click();
		}
		else
		{

		}
		Thread.sleep(3000);
		WebElement Depart_Save = driver.findElement(By.cssSelector("#appointments > div.modal.ng-scope.ng-isolate-scope.in > div > div > department-filter > div.modal-footer > button.btn.btn-primary"));
		Depart_Save.click();
		Thread.sleep(5000);
		ap.Patient_Displayed();
		ap.Configurelist();
		ap.EditSeeingFillter();
		WebElement SellectAll_Provider1 = driver.findElement(By.xpath("//*[@id=\"appointments\"]/div[1]/div/div/seeing-filter/div[2]/div[1]/label/input"));

		if(!SellectAll_Provider1.isSelected())
		{
			SellectAll_Provider1.click();
		}
		else
		{

		}
		Thread.sleep(3000);
	     WebElement Close_Seeing = driver.findElement(By.cssSelector("#appointments > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > seeing-filter > div.modal-footer > button"));
	     Close_Seeing.click();
		Thread.sleep(5000);
		ap.Patient_Displayed();
		Thread.sleep(5000);
		ap.Configurelist();
		ap.EditListColumns();
		Thread.sleep(3000);
		WebElement Remove_Dob1 = driver.findElement(By.xpath("//*[@id=\"patient-lists-component\"]/div/div/div[2]/div/table/tbody/tr[5]/td[2]/input"));

		if(!Remove_Dob1.isSelected())
		{
			Remove_Dob1.click();
		}
		else
		{

		}
		WebElement Save_Columns1 = driver.findElement(By.cssSelector("#appointments > div.modal.ng-scope.ng-isolate-scope.lists-modal-dialog.in > div > div > patient-list > div.modal-footer > button.btn.btn-primary"));
		Save_Columns1.click();
		Thread.sleep(10000);
		ap.Patient_Displayed();





	}
}