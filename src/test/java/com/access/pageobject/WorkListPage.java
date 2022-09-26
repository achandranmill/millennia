package com.access.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class WorkListPage 
{
	
	   WebDriver   ldriver;
	public WorkListPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 20), this);
	}
	
	 @FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[1]/li[3]/a")
      @CacheLookup
	 WebElement Worklisttab;
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[1]/div/button[1]")
	 @CacheLookup
	 WebElement Searchworklist;
	 
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/div[1]/div/div/search-modal/div[2]/div[1]/div[2]/input")
	 @CacheLookup
	 WebElement worklistLN;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/div[1]/div/div/search-modal/div[2]/div[1]/div[3]/input")
	 @CacheLookup
	 WebElement worklistFstN;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/div[1]/div/div/search-modal/div[2]/div[2]/table/tbody/tr")
	 @CacheLookup
	 WebElement worklistselectName;
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[2]/table/tbody/tr[2]/td[11]/div/button")
	 @CacheLookup
	 WebElement WorklistSendto;
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[2]/table/tbody/tr[1]/td[8]/div/button")
	 @CacheLookup
	 WebElement WorklistSendto2;
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[2]/table/tbody/tr[2]/td[11]/div/ul/li[2]/a")
	 @CacheLookup
	 WebElement worklistDischarge;
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[2]/table/tbody/tr[1]/td[14]/div/ul/li[2]/a")
	 @CacheLookup
	 WebElement worklistDischarge2;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/main/div[1]/worklist/div/div[1]/div/button[2]")
	 @CacheLookup
	 WebElement worklistviewDischarge;
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[1]/div/div[1]/div/button")
	 @CacheLookup
	 WebElement ConfigureList;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/main/div[1]/worklist/div/div[1]/div/div[1]/div/ul/li[1]/a")
	 @CacheLookup
	 WebElement EditDepartment;
	 
	 @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/location-filter/div[2]/div/div[1]/div[5]/label/input")
	 @CacheLookup
	 WebElement Registration;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/div[1]/div/div/location-filter/div[3]/button")
	 @CacheLookup
	 WebElement BtnClose;
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[1]/div/div[1]/div/ul/li[2]/a")
	 @CacheLookup
	 WebElement EditSeeing;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/div[1]/div/div/seeing-filter/div[2]/div[3]/label/input")
	 @CacheLookup
	 WebElement Provider;
	 
	 
	 @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/seeing-filter/div[3]/button")
	 @CacheLookup
	 WebElement BtnClose2;
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[1]/div/div[2]/div/button")
	 @CacheLookup
	 WebElement SortBy;
	 
	 @FindBy(how=How.XPATH,using="//a[contains(text(),'Name')]")
	 @CacheLookup
	 WebElement OneName;
	 
	 @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/location-filter/div[2]/div/div[1]/div[6]/label/input")
	 @CacheLookup
	 WebElement Waiting;
	 
	 @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/location-filter/div[2]/div/div[1]/div[6]/label/input")
	 @CacheLookup
	 WebElement Waiting2;
	 
	 @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/location-filter/div[3]/button")
	 @CacheLookup
	 WebElement btnclose3;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/div[1]/div/div/location-filter/div[2]/div/div[1]/div[1]/label/input")
	 @CacheLookup
	 WebElement SelectAll;
	 
	 @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/location-filter/div[2]/div/div[1]/div[2]/label/input")
	 @CacheLookup
	 WebElement Checkin;
	 
	 @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/location-filter/div[2]/div/div[1]/div[3]/label/input")
	 @CacheLookup
	 WebElement ConnectCheckin;
	 
	 @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/location-filter/div[2]/div/div[1]/div[4]/label/input")
	 @CacheLookup
	 WebElement New;
	
	 @FindBy(how=How.ID,using="send-back-to-button")
	 @CacheLookup
	 WebElement SendtoBack;
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[3]/table/tbody/tr/td[8]/div/ul/li[3]/a")
	 @CacheLookup
	 WebElement SendBackNew;
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[3]/table/tbody/tr/td[8]/div/ul/li[2]/a")
	 @CacheLookup
	 WebElement SendBackWaiting;
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[3]/table/tbody/tr/td[7]/div/ul/li[1]/a")
	 @CacheLookup
	 WebElement SendBackRegt;
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[1]/div/button[1]")
	 @CacheLookup
	 WebElement ReturnActivePatient;
	 
	 @FindBy(how=How.XPATH,using="/html/body/main/div[1]/worklist/div/div[1]/div/div[1]/div/ul/li[3]/a")
	 @CacheLookup
	 WebElement EditListColumns;
	 
	 @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/ul/li[2]/a")
	 @CacheLookup
	 WebElement Appointment;
	 
	 @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[2]/div/table/tbody/tr[24]/td[2]/input")
	 @CacheLookup
	 WebElement FormsComleted;
	 
	 @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[3]/button[3]")
	 @CacheLookup
	 WebElement SaveChanges;
	 
	 @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[1]/div[1]/div/div/label[2]/input")
	 @CacheLookup
	 WebElement Threshold;
	 
	 @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[1]/div[2]/table/tbody/tr[20]/td[2]/input")
	 @CacheLookup
	 WebElement ThresholdStarttime;
	 
	 @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[1]/div[2]/table/tbody/tr[23]/td[2]/input")
	 @CacheLookup
	 WebElement ThresholdWaittime;
	 
	 @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-list/div[2]/patient-lists/section/div/div/div[1]/div[2]/table/tbody/tr[22]/td[2]/input")
	 @CacheLookup
	 WebElement ThresholdStatus;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/div[1]/div/div/patient-list/div[3]/button[3]")
	 @CacheLookup
	 WebElement ThredsholdSave;
	 
	 
	 
	 
	 public void ThredsholdSave()
	 {
		 ThredsholdSave.click();
	 }
	 
	 
	 public void ThresholdStatus()
	 {
		 ThresholdStatus.click();
	 }
	 
	 public void ThresholdWaittime()
	 {
		 ThresholdWaittime.click();
	 }
	 
	 
	 public void ThresholdStarttime()
	 {
		 
		 ThresholdStarttime.click();
	 }
	 public void  Threshold()
	 {
     
		 Threshold.click();
	 }
	 
	 public void SaveChanges()
	 {
		 SaveChanges.click();
	 }
	 
	 public void FormsComleted()
	 {
		 FormsComleted.click();
	 }
	 
	 public void Appointment()
	 {
		 Appointment.click();
	 }
	 
	 public void EditListColumns()
	 {
		 EditListColumns.click();
	 }
	 
	 public void ReturnActivePatient()
	 {
		 ReturnActivePatient.click();
	 }
	 
	 
	 public void SendtoBack()
	 {
		 SendtoBack.click();
		
	 }
	 
	 public void SendBackWaiting()
	 {
		 SendBackWaiting.click();
	 }
	 public void  SendBackNew()
	 {
		 SendBackNew.click();
	 }
	 
	 public void WorklistSendto()
		 {
		 WorklistSendto.click();
		 }
	 public void WorklistSendto2()
	 {
		 WorklistSendto2.click();
	 }
	 
	 
	 public void Checkin()
	 {
		 Checkin.click();
	 }
	 public void ConnectCheckin()
	 {
		 ConnectCheckin.click();
	 }
	 public void New()
	 {
		 New.click();
	 }
	 public void SelectAll()
	 {
		 SelectAll.click();
	 }
	 
	 public void Waiting2()
	 {
		 Waiting2.click();
		 btnclose3.click();
	 }
	 
	 
	 public void Waiting()
	 {
		 Waiting.click();
		
	 }
	 public void BtnClose()
	 {
		 BtnClose.click();
	 }
	 
	 
	 
	 public void SortBy() throws Exception
	 {
		 SortBy.click();
		 Thread.sleep(10000);
		 OneName.click();
	 }
	 
	 
	 public void worklist()
	 {
		
		Worklisttab.click();
		
	 }
	 
		public void Discharge() throws Exception
		{
			
			WorklistSendto.click();
			Thread.sleep(3000);
			worklistDischarge.click();
	
	}
		public void Discharge2() throws Exception
		{
			try{WorklistSendto2.click();
			Thread.sleep(3000);
			worklistDischarge2.click();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		public void DischargeViwe()
		{
			worklistviewDischarge.click();
		}
		public void Configure()
		{
			ConfigureList.click();
		
		}
		
		public void Department()
		{
			EditDepartment.click();
			
		}
		
		public void Regi()
		{
			Registration.click();
			
		}
		public void Provider()
		{
			EditSeeing.click();
			Provider.click();
			BtnClose2.click();
			
		}
		public void Searchworklist()
		{
			Searchworklist.click();
		}
		public void worklistN(String l,String f)
		{
			worklistLN.sendKeys(l);
			worklistFstN.sendKeys(f);
		}
}
