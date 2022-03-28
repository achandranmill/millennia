package com.access.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Worklist 

{
	   WebDriver   ldriver;
	public   Worklist(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	 @FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[1]/li[3]/a")
   @CacheLookup
	 WebElement Worklisttab;
	 
	 @FindBy(how=How.PARTIAL_LINK_TEXT,using="Work")
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
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/main/div[1]/worklist/div/div[2]/table/tbody/tr[2]/td[13]/div")
	 @CacheLookup
	 WebElement WorklistSendto;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/main/div[1]/worklist/div/div[2]/table/tbody/tr[2]/td[13]/div/ul/li[3]")
	 @CacheLookup
	 WebElement worklistDischarge;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"worklist\"]/main/div[1]/worklist/div/div[1]/div/button[2]")
	 @CacheLookup
	 WebElement worklistviewDischarge;
	 
	 
	 
	 public void worklist()
	 {
		
		Worklisttab.click();
		
	 }
	 
		public void Discharge()
		{
			
			WorklistSendto.click();
			worklistDischarge.click();
	
	}
		
		public void DischargeViwe()
		{
			worklistviewDischarge.click();
		}
}

	
	

