package com.access.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Payer 
{
   WebDriver ldriver;
   
   public Payer(WebDriver rdriver)
   {
	   ldriver = rdriver;
	   PageFactory.initElements(new AjaxElementLocatorFactory(rdriver,20), this);
   }
	
   @FindBy(how=How.XPATH,using="//a[contains(text(),'Payers')]")
   @CacheLookup
   WebElement payers;
   
   public void payers()
   {
	   payers.click();
   }
   
   @FindBy(how=How.ID,using="payer-name-input")
   @CacheLookup
   WebElement payersName;
   
   public void payersName(String pn)
   {
	   payersName.click();
	   payersName.sendKeys(pn);
   }
   
   @FindBy(how=How.ID,using="payer-id-input")
   @CacheLookup
   WebElement payersid;
   
   public void payersid(String pi)
   {
	   payersid.click();
	   payersid.sendKeys(pi);
   }
   
   @FindBy(how=How.ID,using="payer-network-off")
   @CacheLookup
   WebElement payersOff;
   
   public void payersOff()
   {
	   payersOff.click();
   }
   
   @FindBy(how=How.ID,using="payer-network-in")
   @CacheLookup
   WebElement payersIn;
   
   public void payersIn()
   {
	   payersIn.click();
   }
   
   @FindBy(how=How.ID,using="payer-network-out")
   @CacheLookup
   WebElement payersOut;
   
   public void payersOut()
   {
	   payersOut.click();
   }
   
   @FindBy(how=How.ID,using="dropdownMenu1")
   @CacheLookup
   WebElement DaysToRun;
   
   public void DaysToRun()
   {
	   DaysToRun.click();
   }
   
   @FindBy(how=How.XPATH,using="//li[@class=\"ng-scope\"]//a[contains(text(),'Every Time')]")
   @CacheLookup
   WebElement DaysToRunEverytime;
   
   public void DaysToRunEverytime()
   {
	   DaysToRunEverytime.click();
   }
   
   @FindBy(how=How.XPATH,using="//li[@class=\"ng-scope\"]//a[contains(text(),'1st of the Month')]")
   @CacheLookup
   WebElement DaysToRun1stofthemonth;
   
   public void DaysToRun1stofthemonth()
   {
	   DaysToRun1stofthemonth.click();
   }
   
   @FindBy(how=How.XPATH,using="//li[@class=\"ng-scope\"]//a[contains(text(),'5 Number of Days')]")
   @CacheLookup
   WebElement DaysToRun10numberofDays;
   
   public void DaysToRun10numberofDays()
   {
	   DaysToRun10numberofDays.click();
   }
   
   @FindBy(how=How.XPATH,using="//li[@class=\"ng-scope\"]//a[contains(text(),'Ineligible Payer')]")
   @CacheLookup
   WebElement DaysToRunIneligiblePayer;
   
   public void DaysToRunIneligiblePayer()
   {
	   DaysToRunIneligiblePayer.click();
   }
   
   @FindBy(how=How.XPATH,using="//li[@class=\"ng-scope\"]//a[contains(text(),'Show All')]")
   @CacheLookup
   WebElement DaysToRunShowAll;
   
   public void DaysToRunShowAll()
   {
	   DaysToRunShowAll.click();
   }
   
   @FindBy(how=How.XPATH,using="//span[@class=\"col-xs-2 vertical-center\"]//button[contains(text(),'Clear')]")
   @CacheLookup
   WebElement payersClearbtn;
   
   public void payersClearbtn()
   {
	   payersClearbtn.click();
   }
   
   @FindBy(how=How.XPATH,using="/html/body/main/div[1]/payers/div/div[2]/div/table/thead/tr/th[1]/input")
   @CacheLookup
   WebElement NameCheckbox;
   
   public void NameCheckbox()
   {
	   NameCheckbox.click();
   }
   
   @FindBy(how=How.XPATH,using="/html/body/main/div[1]/payers/div/div[2]/div/table/tbody/tr[1]/td[1]/input")
   @CacheLookup
   WebElement Checkbox1;
   
   public void Checkbox1()
   {
	   Checkbox1.click();
   }
   
   @FindBy(how=How.XPATH,using="/html/body/main/div[1]/payers/div/div[2]/div/table/tbody/tr[1]/td[4]/input")
   @CacheLookup
   WebElement InNetworkIdCheckbox;
   
   public void InNetworkIdCheckbox()
   {
	   InNetworkIdCheckbox.click();
   }
   
   @FindBy(how=How.XPATH,using="/html/body/main/div[1]/payers/div/div[2]/div/table/tbody/tr[1]/td[5]/div/button")
   @CacheLookup
   WebElement DropDownDaystorun;
   
   public void DropDownDaystorun()
   {
	   DropDownDaystorun.click();
   }
   
   @FindBy(how=How.XPATH,using="/html/body/main/div[1]/payers/div/div[2]/div/table/tbody/tr[1]/td[5]/div/ul/li[1]/a")
   @CacheLookup
   WebElement DropDownDaystorunEverytime;
   
   public void DropDownDaystorunEverytime()
   {
	   DropDownDaystorunEverytime.click();
   }
   
   @FindBy(how=How.XPATH,using="/html/body/main/div[1]/payers/div/div[2]/div/table/tbody/tr[1]/td[1]/input")
   @CacheLookup
   WebElement ATestPayer01;
   
   public void ATestPayer01()
   {
	   ATestPayer01.click();
   }
   
   @FindBy(how=How.XPATH,using="/html/body/main/div[1]/payers/div/div[2]/div/table/tbody/tr[2]/td[1]/input")
   @CacheLookup
   WebElement TRASHALLTRANSACTIONSWILLBEDISCARDED;
   
   public void TRASHALLTRANSACTIONSWILLBEDISCARDED()
   {
	   TRASHALLTRANSACTIONSWILLBEDISCARDED.click();
   }
   
   @FindBy(how=How.XPATH,using="//button[contains(text(),'Make Changes to Selected')]")
   @CacheLookup
   WebElement MakeChangestoSelected;
   
   public void MakeChangestoSelected()
   {
	   MakeChangestoSelected.click();
   }
   
   @FindBy(how=How.XPATH,using="//*[@id=\"dropdownMenu1\"]")
   @CacheLookup
   WebElement MakeChangestoSelectedDAYSTORUN;
   
   public void MakeChangestoSelectedDAYSTORUN()
   {
	   MakeChangestoSelectedDAYSTORUN.click();
   }
   
   @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/change-selected-payers-modal/div[2]/form/div/div[1]/div/ul/li[2]/a")
   @CacheLookup
   WebElement MakeChangestoSelectedEveryTime;
   
   public void MakeChangestoSelectedEveryTime()
   {
	   MakeChangestoSelectedEveryTime.click();
   }
   
   @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/change-selected-payers-modal/div[2]/form/div/div[2]/div/button")
   @CacheLookup
   WebElement   MakeChangestoSelectedINNETWORK;
   
   public void MakeChangestoSelectedINNETWORK()
   {
	   MakeChangestoSelectedINNETWORK.click();
   }
   
   @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/change-selected-payers-modal/div[2]/form/div/div[2]/div/ul/li[2]/a")
   @CacheLookup
   WebElement MakeChangestoSelectedINNETWORKYes;
   
   public void MakeChangestoSelectedINNETWORKYes()
   {
	   MakeChangestoSelectedINNETWORKYes.click();
   }
   
   @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/change-selected-payers-modal/div[2]/form/div/div[2]/div/ul/li[3]/a")
   @CacheLookup
   WebElement MakeChangestoSelectedINNETWORKNo;
   
   public void MakeChangestoSelectedINNETWORKNo()
   {
	   MakeChangestoSelectedINNETWORKNo.click();
   }
   
   @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/change-selected-payers-modal/div[4]/button[2]")
   @CacheLookup
   WebElement MakeChangestoSelectedSAVE;
   
   public void MakeChangestoSelectedSAVE()
   {
	   MakeChangestoSelectedSAVE.click();
   }
   
   @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/change-selected-payers-modal/div[4]/button[1]")
   @CacheLookup
   WebElement MakeChangestoSelectedCANCEL;
   
   public void MakeChangestoSelectedCANCEL()
   {
	   MakeChangestoSelectedCANCEL.click();
   }
   
   @FindBy(how=How.XPATH,using="//button[contains(text(),'Add New Payer')]")
   @CacheLookup
   WebElement AddNewPayer;
   
   public void AddNewPayer()
   {
	   AddNewPayer.click();
   }
   
   @FindBy(how=How.XPATH,using="//*[@id=\"payerName\"]")
   @CacheLookup
   WebElement AddNewPayername;
   
   public void AddNewPayername(String apn)
   {
	   AddNewPayername.click();
	   AddNewPayername.sendKeys(apn);
   }
   
   @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/add-payer-modal/div[2]/form/div[2]/input")
   @CacheLookup
   WebElement AddNewPayerID;
   
   public void AddNewPayerID(String n)
   {
	   AddNewPayerID.click();
	   AddNewPayerID.sendKeys(n);
   }
   
   @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/add-payer-modal/div[2]/form/div[3]/div/button")
   @CacheLookup
   WebElement AddNewPayerDaysToRun;
   
   public void AddNewPayerDaysToRun()
   {
	   AddNewPayerDaysToRun.click();
   }
   
   @FindBy(how=How.XPATH,using="//*[@id=\"payer-days-to-run\"]/ul/li[1]/a")
   @CacheLookup
   WebElement AddNewPayerEveryTime;
   
   public void AddNewPayerEveryTime()
   {
	   AddNewPayerEveryTime.click();
   }
   
   @FindBy(how=How.XPATH,using="//*[@id=\"payer-days-to-run\"]/ul/li[3]/a")
   @CacheLookup
   WebElement AddNewPayerDaysToRun1ofthemonth;
   
   public void AddNewPayerDaysToRun1ofthemonth()
   {
	   AddNewPayerDaysToRun1ofthemonth.click();
   }
   
   @FindBy(how=How.XPATH,using="//button[contains(text(),'Add Payer')]")
   @CacheLookup
   WebElement AddPayerbtn;
   
   public void AddPayerbtn()
   {
	   AddPayerbtn.click();
   }
   
   @FindBy(how=How.XPATH,using="//*[@id=\"payers\"]/div[1]/div/div/add-payer-modal/div[3]/button[1]")
   @CacheLookup
   WebElement AddnewPayercancel;
   
   public void AddnewPayercancel()
   {
	   AddnewPayercancel.click();
   }
   
   @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/add-payer-modal/div[2]/form/div[4]/input")
   @CacheLookup
   WebElement AddpayerINnetwork;
   
   public void AddpayerINnetwork()
   {
	   AddpayerINnetwork.click();
   }
   
   @FindBy(how=How.XPATH,using="//button[contains(text(),'Bucket Settings')]")
   @CacheLookup
   WebElement BucketSettings;
   
   public void BucketSettings()
   {
	   BucketSettings.click();
   }
   
   @FindBy(how=How.XPATH,using="//*[@id=\"days\"]")
   @CacheLookup
   WebElement BucketSettingsChangeCustom;
   
   public void BucketSettingsChangeCustom(String bs)
   {
	   BucketSettingsChangeCustom.clear();
	   BucketSettingsChangeCustom.click();
	   BucketSettingsChangeCustom.sendKeys(bs);
   }
   
   @FindBy(how=How.XPATH,using="//*[@id=\"payers\"]/div[1]/div/div/edit-custom-bucket-settings-modal/div[3]/button[2]")
   @CacheLookup
   WebElement BucketSettingsSaveChange;
   
   public void BucketSettingsSaveChange()
   {
	   BucketSettingsSaveChange.click();
   }
   
   @FindBy(how=How.XPATH,using="//*[@id=\"payers\"]/div[1]/div/div/edit-custom-bucket-settings-modal/div[3]/button[1]")
   @CacheLookup
   WebElement BucketSettingsCANCEL;
   
   public void BucketSettingsCANCEL()
   {
	   BucketSettingsCANCEL.click();
   }
   
   
   
}
