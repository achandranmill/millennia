package com.access.pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class Organization 

{
	WebDriver ldriver;

	public Organization (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver,20), this);
	}


	@FindBy(how=How.XPATH,using="//a[contains(text(),'Organization')]")
	@CacheLookup
	WebElement Organization;

	public void  Organization()
	{
		Organization.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Details')]")
	@CacheLookup
	WebElement Details;

	public void Details()
	{
		Details.click();
	}

	@FindBy(how=How.ID,using="name")
	@CacheLookup
	WebElement DetailsName;

	public void DetailsName(String n)
	{
		DetailsName.click();
		DetailsName.clear();
		DetailsName.sendKeys(n);
	}

	@FindBy(how=How.ID,using="shortName")
	@CacheLookup
	WebElement DetailsshortName;

	public void DetailsshortName(String sn)
	{
		DetailsshortName.click();
		DetailsshortName.clear();
		DetailsshortName.sendKeys(sn);
	}

	@FindBy(how=How.ID,using="phoneNumber")
	@CacheLookup
	WebElement DetailsphoneNumber;

	public void DetailsphoneNumber(String p)
	{
		DetailsphoneNumber.click();
		DetailsphoneNumber.clear();
		DetailsphoneNumber.sendKeys(p);
	}

	@FindBy(how=How.ID,using="streetLine1")
	@CacheLookup
	WebElement DetailsstreetLine1;

	public void DetailsstreetLine1(String s)
	{
		DetailsstreetLine1.click();
		DetailsstreetLine1.clear();
		DetailsstreetLine1.sendKeys(s);
	}

	@FindBy(how=How.ID,using="streetLine2")
	@CacheLookup
	WebElement DetailsstreetLine2;

	public void DetailsstreetLine2(String s2)
	{
		DetailsstreetLine2.click();
		DetailsstreetLine2.clear();
		DetailsstreetLine2.sendKeys(s2);
	}


	@FindBy(how=How.ID,using="city")
	@CacheLookup
	WebElement Detailscity;

	public void Detailscity(String c)
	{
		Detailscity.click();
		Detailscity.clear();
		Detailscity.sendKeys(c);
	}

	@FindBy(how=How.ID,using="state")
	@CacheLookup
	WebElement Detailsstate;

	public void Detailsstate(String s)
	{
		Detailsstate.click();
		Detailsstate.clear();
		Detailsstate.sendKeys(s);
	}

	@FindBy(how=How.ID,using="zipcode")
	@CacheLookup
	WebElement Detailszipcode;

	public void Detailszipcode(String z)
	{
		Detailszipcode.click();
		Detailszipcode.clear();
		Detailszipcode.sendKeys(z);
	}

	@FindBy(how=How.ID,using="saveButton")
	@CacheLookup
	WebElement DetailssaveButton;

	public void DetailssaveButton()
	{
		DetailssaveButton.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Structure')]")
	@CacheLookup
	WebElement Structure;

	public void Structure()
	{
		Structure.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Attributes')]")
	@CacheLookup
	WebElement Attributes;

	public void Attributes()
	{
		Attributes.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"chartContainer\"]/organization-attributes/h4/button")
	@CacheLookup
	WebElement AttributesAddAttribute;

	public void AttributesAddAttribute()
	{
		AttributesAddAttribute.click();
	}


	@FindBy(how=How.XPATH,using="//*[@id=\"organization\"]/div[1]/div/div/attributes-modal/div[2]/form/div[1]/textarea")
	@CacheLookup
	WebElement AttributeName;

	public void AttributeName(String A)
	{
		AttributeName.click();
		AttributeName.sendKeys(A);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/attributes-modal/div[2]/form/div[2]/textarea")
	@CacheLookup
	WebElement AttributeValue;

	public void AttributeValue(String av)
	{
		AttributeValue.click();
		AttributeValue.sendKeys(av);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/attributes-modal/div[3]/button[2]")
	@CacheLookup
	WebElement AttributeSaveButton;

	public void AttributeSaveButton()
	{
		AttributeSaveButton.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/attributes-modal/div[3]/button[3]")
	@CacheLookup
	WebElement AttributeCancelButton;

	public void AttributeCancelButton()
	{
		AttributeCancelButton.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/attributes-modal/div[3]/button[1]")
	@CacheLookup
	WebElement RemoveAttribute;

	public void RemoveAttribute()
	{
		RemoveAttribute.click();
	}

	@FindBy(how=How.ID,using="editButton")
	@CacheLookup
	WebElement AttributeeditButton;


	public void AttributeeditButton()
	{
		AttributeeditButton.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/attributes-modal/div[2]/form/div[1]/textarea")
	@CacheLookup
	WebElement EditAttributeName;


	public void EditAttributeName()
	{
		EditAttributeName.click();
	}
	public void EditAttributeName(String a)
	{
		EditAttributeName.click();
		EditAttributeName.clear();
		EditAttributeName.sendKeys(a);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/attributes-modal/div[2]/form/div[2]/textarea")
	@CacheLookup
	WebElement EditAttributeValue;

	public void EditAttributeValue(String a)
	{
		EditAttributeValue.click();
		EditAttributeValue.clear();
		EditAttributeValue.sendKeys(a);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/attributes-modal/div[3]/button[2]")
	@CacheLookup
	WebElement EditSaveButton;

	public void EditSaveButton()
	{
		EditSaveButton.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/attributes-modal/div[3]/button[3]")
	@CacheLookup
	WebElement EditCancelButton;

	public void EditCancelButton()
	{
		EditCancelButton.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/attributes-modal/div[3]/button[1]")
	@CacheLookup
	WebElement EditRemoveAttribute;

	public void EditRemoveAttribute()
	{
		EditRemoveAttribute.click();
	}

	@FindBy(how=How.XPATH,using="//ga[contains(text(),'Rephrase')]")
	@CacheLookup
	WebElement EditRephrase;

	public void EditRephrase()
	{
		EditRephrase.click();
	}

	@FindBy(how=How.XPATH,using="//gdiv[contains(text(),'Edit in Ginger')]")
	@CacheLookup
	WebElement EditinGinger;

	public void EditinGinger()
	{
		EditinGinger.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Security')]")
	@CacheLookup
	WebElement Security;

	public void Security()
	{
		Security.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-security/ng-form/div[1]/div/label/input")
	@CacheLookup
	WebElement RequiresVerifiedEmailAccount;

	public void RequiresVerifiedEmailAccount()
	{
		RequiresVerifiedEmailAccount.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-security/ng-form/div[2]/div/div[1]/div[2]/i")
	@CacheLookup
	WebElement PasswordLength;

	public void PasswordLength13()
	{
		Actions length = new Actions(ldriver);
		length.clickAndHold(PasswordLength).moveByOffset(-20, 100).release(PasswordLength).build().perform();

	}

	public void PasswordLength15()
	{
		Actions Length = new Actions(ldriver);
		Length.clickAndHold(PasswordLength).moveByOffset(40, 100).release(PasswordLength).build().perform();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-security/ng-form/div[3]/div/div[1]/div[2]/i")
	@CacheLookup
	WebElement PasswordExpiresDays;

	public void PasswordExpiresDays66()
	{
		Actions days = new Actions(ldriver);
		days.clickAndHold(PasswordExpiresDays).moveByOffset(-40, 100).release(PasswordExpiresDays).build().perform();
	}

	public void PasswordExpiresDays76()
	{
		Actions days = new Actions(ldriver);
		days.clickAndHold(PasswordExpiresDays).moveByOffset(40, 100).release(PasswordExpiresDays).build().perform();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-security/ng-form/div[4]/div[1]/label/input")
	@CacheLookup
	WebElement OneLowercaseLatter;

	public void OneLowercaseLatter()
	{
		OneLowercaseLatter.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-security/ng-form/div[4]/div[2]/label/input")
	@CacheLookup
	WebElement OneUppercaseLatter;

	public void OneUppercaseLatter()
	{
		OneUppercaseLatter.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-security/ng-form/div[4]/div[3]/label/input")
	@CacheLookup
	WebElement OneNumericCharactor;

	public void OneNumericCharactor()
	{
		OneNumericCharactor.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-security/ng-form/div[4]/div[4]/label/input")
	@CacheLookup
	WebElement OneSpecialCharactor;

	public void OneSpecialCharactor()
	{
		OneSpecialCharactor.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-security/ng-form/div[5]/div[1]/label/input")
	@CacheLookup
	WebElement EnableTrustedAuthentication;

	public void EnableTrustedAuthentication()
	{
		EnableTrustedAuthentication.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-security/ng-form/div[5]/div[2]/label/input")
	@CacheLookup
	WebElement CreateNewAccounts;

	public void CreateNewAccounts()
	{
		CreateNewAccounts.click();
	}

	@FindBy(how=How.ID,using="encryptionType")
	@CacheLookup
	WebElement encryptionType;

	public void encryptionType(String a)
	{
		encryptionType.click();
		encryptionType.sendKeys(a);
	}

	@FindBy(how=How.ID,using="encryptionKey")
	@CacheLookup
	WebElement encryptionKey;

	public void encryptionKey(String a)
	{
		encryptionKey.click();
		encryptionKey.sendKeys(a);
	}

	@FindBy(how=How.ID,using="saveButton")
	@CacheLookup
	WebElement SecuritysaveButton;

	public void SecuritysaveButton()
	{
		SecuritysaveButton.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Users')]")
	@CacheLookup
	WebElement User;

	public void User()
	{
		User.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/users/section/div[2]/div/table/tbody/tr[1]/td[5]/button")
	@CacheLookup
	WebElement EditUser;

	public void EditUser()
	{
		EditUser.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Privacy')]")
	@CacheLookup
	WebElement Privacy;

	public void Privacy() 
	{
		Privacy.click();

	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-privacy/ng-form/div/button")
	@CacheLookup
	WebElement Selectpatientdisplayformat;

	public void Selectpatientdisplayformat()
	{
		Selectpatientdisplayformat.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'3 Last, 1 First : i.e. ROB, J')]")
	@CacheLookup 
	WebElement format1;

	public void format1()
	{
		format1.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Code : i.e. 1234')]")
	@CacheLookup
	WebElement format2;

	public void format2()
	{
		format2.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-privacy/button")
	@CacheLookup
	WebElement privacysave;

	public void privacysave()
	{
		privacysave.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Flags')]")
	@CacheLookup
	WebElement Flags;

	public void Flags()
	{
		Flags.click();
	}

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Choose a file')]")
	@CacheLookup
	WebElement Choosefile;

	public void Choosefile() throws AWTException
	{
		Choosefile.click();
		Robot rb=new Robot();
		rb.delay(2000);
		//copy to clipboard
		StringSelection ss= new StringSelection("/ImageFolder/deependra.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		//paste operation in clipboard

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		//press enter key

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);



	}



	@FindBy(how=How.XPATH,using="//button[contains(text(),'Crop Image')]")
	@CacheLookup
	WebElement Cropimage;

	public void Cropimage()
	{
		Cropimage.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-flags/jfh-add-flag/form/div/div/div[2]/input")
	@CacheLookup
	WebElement FlagLabel;

	public void FlagLabel(String f)
	{
		FlagLabel.sendKeys(f);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-flags/jfh-add-flag/form/div/div/div[3]/div/label/input")
	@CacheLookup
	WebElement Persistent;

	public void Persistent()

	{
		Persistent.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-flags/jfh-add-flag/form/div/div/div[4]/button")
	@CacheLookup
	WebElement AddNewFlag;

	public void AddNewFlag()
	{
		AddNewFlag.click();
	}


	@FindBy(how=How.XPATH,using="//span[contains(text(),'New flag saved successfully')]")
	@CacheLookup
	WebElement Successfully_message;

	public  boolean Successfully_message()
	{
		{

            String s=Successfully_message.getText();
			System.out.println(s);
			if(s.equals("New flag saved successfully"))
			{
				System.out.println("Test case passed");

			}
			else
			{
				System.out.println("Test case fail");
			}
			return false;

		}
	}



      @FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-flags/div[1]/jfh-flag-card/form/div/div/div[3]/div[1]/button")
      @CacheLookup
      WebElement Flag_Edit;
      
      public void Flag_Edit()
      {
    	  Flag_Edit.click();
      }

       @FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-flags/div[1]/jfh-flag-card/form/div/div/div[4]/div[1]/button")
       @CacheLookup
       WebElement Flag_Remove_persist_save;
       
       public void Flag_Remove_persist_save()
       {
    	   Flag_Remove_persist_save.click();
       }
       
       
       @FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-flags/div[2]/jfh-flag-card/form/div/div/div[3]/div[2]/button")
       @CacheLookup
       WebElement Flag_Delete;
       
       
       public void Flag_Delete()
       {
    	   Flag_Delete.click();
       }
       
       @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/confirm-modal/div[3]/div/button[1]")
       @CacheLookup
       WebElement Flag_yes;
       
       public void Flag_yes()
       {
    	   Flag_yes.click();
    	   
       }
       
       
    @FindBy(how=How.XPATH,using="//a[contains(text(),'Utilities')]")
	@CacheLookup
	WebElement Utilities;

	public void Utilities()
	{
		Utilities.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-utilities/div[1]/div[2]/div/button")
	@CacheLookup
	WebElement Staging;

	public void Staging()
	{
		Staging.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-utilities/div[1]/div[2]/div/ul/li[1]/a")
	@CacheLookup
	WebElement Staging2;

	public void Staging2()
	{
		Staging2.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-utilities/div[1]/div[2]/button")
	@CacheLookup
	WebElement SaveRedirect;

	public void SaveRedirect()
	{
		SaveRedirect.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-utilities/div[2]/div[2]/div/button")
	@CacheLookup
	WebElement Department;

	public void Department()
	{
		Department.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-utilities/div[2]/div[2]/div/ul/li[2]/a")
	@CacheLookup
	WebElement ClearDepartment;

	public void ClearDepartment()
	{
		ClearDepartment.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-utilities/div[2]/div[2]/button")
	@CacheLookup
	WebElement ClearQueues;

	public void ClearQueues()
	{
		ClearQueues.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-utilities/div[3]/div[2]/div/button")
	@CacheLookup
	WebElement SelectDepartment;

	public void SelectDepartment()
	{
		SelectDepartment.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-utilities/div[3]/div[2]/div/ul/li[2]/a")
	@CacheLookup
	WebElement SelectDepartment1;

	public void SelectDepartment1()
	{
		SelectDepartment1.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/organization-utilities/div[3]/div[2]/button")
	@CacheLookup
	WebElement SyncTimeZone;

	public void SyncTimeZone()
	{
		SyncTimeZone.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Messages')]")
	@CacheLookup
	WebElement Messages;

	public void Messages()
	{
		Messages.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[1]/div/div[1]/div/div[1]/div/input")
	@CacheLookup
	WebElement Org_message_Search;


	public void Org_message_Search(String s)
	{
		Org_message_Search.sendKeys(s);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[1]/div/div[1]/div/div[1]/div/input")
	@CacheLookup
	WebElement TextSearch;

	public void TextSearch(String s)
	{
		TextSearch.click();
		TextSearch.sendKeys(s);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[1]/div/div[1]/div/div[1]/div/span/button")
	@CacheLookup
	WebElement MessageSearch;

	public void MessageSearch()
	{
		MessageSearch.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[1]/div/div[2]/table/tbody/tr[1]/td[6]/button[1]")
	@CacheLookup
	WebElement MessageEdit;

	public void MessageEdit()
	{
		MessageEdit.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[1]/div/div[1]/div/div[2]/button")
	@CacheLookup
	WebElement MessageAddnew;

	public void MessageAddnew()
	{
		MessageAddnew.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/message-builder-modal/div[2]/div[1]/div[1]/label/input")
	@CacheLookup
	WebElement CreateCustomMessage;

	public void CreateCustomMessage()
	{
		CreateCustomMessage.click();
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Continue')]")
	@CacheLookup
	WebElement MessageContinue;

	public void MessageContinue()
	{
		MessageContinue.click();
	}


	@FindBy(how=How.NAME,using="title")
	@CacheLookup
	WebElement MessageTitle;

	public void MessageTitle(String t)
	{
		MessageTitle.click();
		MessageTitle.sendKeys(t);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[2]/div[1]/div/select")
	@CacheLookup
	WebElement MessageCategory;

	public void MessageCategory()
	{
		Select Message = new Select(MessageCategory);
		Message.selectByIndex(1);
	}
	
	

	@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[1]/div/div[3]/div/div/div/button")
	@CacheLookup
	WebElement MessageLimits;

	public void MessageLimits()
	{
		MessageLimits.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[1]/div/div[3]/div/div/div/ul/li[1]/a")
	@CacheLookup
	WebElement CheckAll;

	public void CheckAll()
	{
		CheckAll.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[1]/div/div[3]/div/div/div/ul/li[2]/a")
	@CacheLookup
	WebElement UncheckAll;

	public void UncheckAll()
	{
		UncheckAll.click();
	}

	@FindBy(how=How.NAME,using="category")
	@CacheLookup
	WebElement MessageTrigger;

	public void MessageTrigger()
	{
		Select Message = new Select(MessageTrigger);
		Message.selectByIndex(2);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[2]/div[2]/div/select")
	@CacheLookup
	WebElement MessageTrigger_Cancel;

	public void MessageTrigger_Cancel()
	{
		Select Message = new Select(MessageTrigger_Cancel);
		Message.selectByVisibleText("CANCELLED");
	}
	
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/header/input")
	@CacheLookup
	WebElement TextMessage;

	public void TextMessage()
	{
	if(!TextMessage.isSelected()) {
		JavascriptExecutor g = (JavascriptExecutor)ldriver;
		g.executeScript("arguments[0].click", TextMessage);
		if(!TextMessage.isSelected()) {
			TextMessage.click();
		}
		else {
			TextMessage.click();
		}
	}
		
	}		
	
   @FindBy(how=How.XPATH,using="//a[contains(text(),'Remove Message')]")
   @CacheLookup
   WebElement RemoveMessage;
   
   public void RemoveMessage()
   {
	   RemoveMessage.click();
   }
	

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[1]/select")
	@CacheLookup
	WebElement SendFrom;

	public void SendFrom()
	{
		Select Send = new Select(SendFrom);
		Send.selectByIndex(1);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[2]/recipients/div/div[1]/input")
	@CacheLookup
	WebElement Recipients;

	public void Recipients()
	{
		Recipients.click();
	}

	@FindBy(how=How.XPATH,using="//h4[contains(text(),'PATIENT')]")
	@CacheLookup
	WebElement RecipientsPATIENT;

	public void RecipientsPATIENT()
	{
		RecipientsPATIENT.click();
	}

	@FindBy(how=How.NAME,using="smsMessageMessage")
	@CacheLookup
	WebElement TextMessageContent;

	public void TextMessageContent(String t)
	{
		TextMessageContent.click();
		TextMessageContent.sendKeys(t);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[3]/message-response/div/div/div/div[1]/div/div/a")
	@CacheLookup
	WebElement Responses;

	public void Responses()
	{
		Responses.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[1]/div/input")
	@CacheLookup
	WebElement ResponsesText;

	public void ResponsesText(String RT)
	{
		ResponsesText.click();
		ResponsesText.sendKeys(RT);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[2]/div/select")
	@CacheLookup
	WebElement ResponsesSelect;

	public void ResponsesSelect()
	{
		Select Responses=new Select(ResponsesSelect);
		Responses.selectByIndex(3);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/header/input")
	@CacheLookup
	WebElement VoiceMessage;

	public void VoiceMessage()
	{
		VoiceMessage.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[1]/select")
	@CacheLookup
	WebElement  VoiceSendFrom;

	public void VoiceSendFrom()
	{
		Select VoiceMessage=new Select(VoiceSendFrom);
		VoiceMessage.selectByIndex(1);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[2]/recipients/div/div[1]/input")
	@CacheLookup
	WebElement   VoiceRecipients;


	public void VoiceRecipients()
	{
		VoiceRecipients.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[2]/recipients/div/ul/li/div[4]/span/div")
	@CacheLookup
	WebElement VoiceRecipientsAppointment;

	public void VoiceRecipientsAppointment()
	{
		VoiceRecipientsAppointment.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/div[1]/div/div/div[1]/div/textarea")
	@CacheLookup
	WebElement VoiceMessageContent;

	public void VoiceMessageContent(String v)
	{
		VoiceMessageContent.click();
		VoiceMessageContent.sendKeys(v);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/message-response/div/div/div/div/div/div/a")
	@CacheLookup
	WebElement VoiceResponse;

	public void VoiceResponse()
	{
		VoiceResponse.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[3]/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[1]/div/input")
	@CacheLookup
	WebElement VoiceResponseText;

	public void VoiceResponseText(String vrt)
	{
		VoiceResponseText.click();
		VoiceResponseText.sendKeys(vrt);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/message-response/div/div/div/div[2]/div/div[1]/div[2]/div/select")
	@CacheLookup
	WebElement VoiceResponseselect;

	public void VoiceResponseselect()
	{
		Select voice =new Select(VoiceResponseselect);
		voice.selectByIndex(2);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/message-response/div/div/div/div[2]/div/div[2]/div/div/input")
	@CacheLookup
	WebElement VoiceResponseTextup;

	public void VoiceResponseTextup(String v)
	{
		VoiceResponseTextup.click();
		VoiceResponseTextup.sendKeys(v);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[3]/div/div/div[3]/div[2]/div/div/div[2]/div/textarea")
	@CacheLookup
	WebElement VoiceMailContent;

	public void VoiceMailContent(String m)
	{
		VoiceMailContent.click();
		VoiceMailContent.sendKeys(m);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/header/input")
	@CacheLookup
	WebElement VoiceEmail;

	public void VoiceEmail()
	{
		VoiceEmail.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[1]/select")
	@CacheLookup
	WebElement VoiceEmailSend;

	public void VoiceEmailSend()
	{
		Select email = new Select(VoiceEmailSend);
		email.selectByIndex(0);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[2]/recipients[1]/div/div[1]/input")
	@CacheLookup
	WebElement RecipientsEmail;

	public void RecipientsEmail()
	{
		RecipientsEmail.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[2]/recipients[1]/div/ul/li/div[4]/span/div")
	@CacheLookup
	WebElement RecipientsEmailappoint;

	public void RecipientsEmailappoint()
	{
		RecipientsEmailappoint.click();
	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[2]/recipients[2]/div/div[1]/input")
	@CacheLookup
	WebElement RecipientsEmailcc;

	public void RecipientsEmailcc()
	{
		RecipientsEmailcc.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[2]/recipients[2]/div/ul/li/div[3]/span/div/h4")
	@CacheLookup
	WebElement RecipientsEmailccpatient;

	public void RecipientsEmailccpatient()
	{
		RecipientsEmailccpatient.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[2]/recipients[3]/div/div[1]/input")
	@CacheLookup
	WebElement RecipientsEmailBcc;

	public void RecipientsEmailBcc()
	{
		RecipientsEmailBcc.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[2]/recipients[3]/div/ul/li/div[3]/span/div/h4")
	@CacheLookup
	WebElement RecipientsEmailBccPatient;

	public void RecipientsEmailBccPatient()
	{
		RecipientsEmailBccPatient.click();

	}


	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[4]/div/div/div[3]/div/input")
	@CacheLookup
	WebElement RecipientsEmailSubject;

	public void RecipientsEmailSubject(String s)
	{
		RecipientsEmailSubject.click();
		RecipientsEmailSubject.sendKeys(s);
	}

	@FindBy(how=How.ID,using="emailMessageMessage")
	@CacheLookup
	WebElement EmailContent;

	public void EmailContent(String ec)
	{
		EmailContent.click();
		EmailContent.sendKeys(ec);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[5]/header/input")
	@CacheLookup
	WebElement  SendHL7OutboundMessage;

	public void SendHL7OutboundMessage()
	{
		SendHL7OutboundMessage.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[5]/div/div/div[1]/recipients/div/div[1]/input")
	@CacheLookup
	WebElement Address;

	public void Address(String n)
	{
		Address.click();
		Address.sendKeys(n);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[5]/div/div/div[2]/div/div/div/div/div/textarea")
	@CacheLookup
	WebElement MessageContent;

	public void MessageContent(String mc)
	{
		MessageContent.click();
		MessageContent.sendKeys(mc);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[6]/header/input")
	@CacheLookup
	WebElement MessageDepartment;

	public void MessageDepartment()
	{
		MessageDepartment.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[7]/div/div/div/div/button[2]")
	@CacheLookup
	WebElement MessageSaveChange;

	public void MessageSaveChange()
	{
		MessageSaveChange.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/message-builder-modal/div[2]/div[1]/div[2]/label/input")
	@CacheLookup
	WebElement ChoosefromCoreMessages;

	public void ChoosefromCoreMessages()
	{
		ChoosefromCoreMessages.click();
	}

	@FindBy(how=How.XPATH,using= "/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[1]/div/div/a")
	@CacheLookup
	WebElement BacktoorganizationMessages;

	public void BacktoorganizationMessages()
	{
		BacktoorganizationMessages.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"message-builder-editor\"]/form/div[7]/div/div/div/div/button[1]")
	@CacheLookup
	WebElement MessageCancel;

	public void MessageCancel()
	{
		MessageCancel.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[1]/div/div[2]/table/tbody/tr[1]/td[6]/button[2]/span")
	@CacheLookup
	WebElement MessageDelete;

	public void MessageDelete()
	{
		MessageDelete.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Appointment Types')]")
	@CacheLookup
	WebElement AppointmentTypes;

	public void AppointmentTypes()
	{
		AppointmentTypes.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"chartContainer\"]/appointment-types/section/div[1]/div[2]/button")
	@CacheLookup
	WebElement AddAppointment;

	public void AddAppointment()
	{
		AddAppointment.click();
	}

	@FindBy(how=How.NAME,using="title")
	@CacheLookup
	WebElement Appointtitle;

	public void Appointtitle(String t)
	{
		Appointtitle.click();
		Appointtitle.sendKeys(t);
	}

	@FindBy(how=How.NAME,using="apptDuration")
	@CacheLookup
	WebElement apptDuration;

	public void apptDuration(String ad)
	{
		apptDuration.click();
		apptDuration.sendKeys(ad);
	}

	@FindBy(how=How.ID,using="external-service-id")
	@CacheLookup
	WebElement externalServiceId;

	public void externalServiceId(String e)
	{
		externalServiceId.click();
		externalServiceId.sendKeys(e);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"chartContainer\"]/appointment-types/appointment-type-editor/section/form/div[3]/div/div/textarea")
	@CacheLookup
	WebElement Description;

	public void Description(String d)
	{
		Description.click();
		Description.sendKeys(d);
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Add Form')]")
	@CacheLookup
	WebElement AppointAddForm;

	public void AppointAddForm()
	{
		AppointAddForm.click();
	}

	@FindBy(how=How.NAME,using="templateId")
	@CacheLookup
	WebElement templateId;

	public void templateId()
	{
		Select Appt = new Select(templateId);
		Appt.selectByIndex(3);
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Create')]")
	@CacheLookup
	WebElement ApptCreate;

	public void ApptCreate()
	{
		ApptCreate.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/appointment-types/appointment-type-editor/section/form/div[6]/div/div/button[2]")
	@CacheLookup
	WebElement AppointSave;

	public void AppointSave()
	{
		AppointSave.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/appointment-types/appointment-type-editor/section/div/div/a")
	@CacheLookup
	WebElement BacktoAppointmentTypes;

	public void BacktoAppointmentTypes()
	{
		BacktoAppointmentTypes.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"chartContainer\"]/appointment-types/appointment-type-editor/section/form/div[6]/div/div/button[1]")
	@CacheLookup
	WebElement AppointmentCancel;

	public void AppointmentCancel()
	{
		AppointmentCancel.click();
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Edit Patient Intake Configuration')]")
	@CacheLookup
	WebElement PatientIntake;

	public void PatientIntake()
	{
		PatientIntake.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-intake-modal/patient-intake-config/section/div[2]/div/div[1]/div/div[4]/table/tbody/tr/td[1]/input")
	@CacheLookup
	WebElement InsuranceVerificationName;

	public void InsuranceVerificationName(String iv)
	{
		InsuranceVerificationName.click();
		InsuranceVerificationName.sendKeys(iv);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-intake-modal/patient-intake-config/section/div[2]/div/div[1]/div/div[4]/table/tbody/tr/td[2]/input")
	@CacheLookup
	WebElement InsuranceVerificationValue;

	public void InsuranceVerificationValue(String ivv)
	{
		InsuranceVerificationValue.click();
		InsuranceVerificationValue.sendKeys(ivv);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/patient-intake-config/section/div[2]/div[2]/div[2]/div/div[3]/div/label/input")
	@CacheLookup
	WebElement InsuranceVerificationEnable;

	public void InsuranceVerificationEnable()
	{
		InsuranceVerificationEnable.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-intake-modal/patient-intake-config/section/div[2]/div/div[2]/div/div[4]/table/tbody/tr/td[1]/input")
	@CacheLookup
	WebElement IdentityVerificationName;

	public void IdentityVerificationName(String ivn)
	{
		IdentityVerificationName.click();
		IdentityVerificationName.sendKeys(ivn);
	}


	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-intake-modal/patient-intake-config/section/div[2]/div/div[2]/div/div[4]/table/tbody/tr/td[2]/input")
	@CacheLookup
	WebElement IdentityVerificationValue;

	public void IdentityVerificationValue(String ivv)
	{
		IdentityVerificationValue.click();
		IdentityVerificationValue.sendKeys(ivv);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-intake-modal/patient-intake-config/section/div[2]/div/div[2]/div/div[3]/div/label/input")
	@CacheLookup
	WebElement IdentityVerificationEnable;

	public void IdentityVerificationEnable()
	{
		IdentityVerificationEnable.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-intake-modal/patient-intake-config/section/div[3]/div/button[2]")
	@CacheLookup
	WebElement PatientIntakeSave;

	public void PatientIntakeSave()
	{
		PatientIntakeSave.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/patient-intake-modal/patient-intake-config/section/div[3]/div/button[1]")
	@CacheLookup
	WebElement PatientIntakeCancel;

	public void PatientIntakeCancel()
	{
		PatientIntakeCancel.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/appointment-types/section/div[2]/div/table/tbody/tr[1]/td[4]/button")
	@CacheLookup
	WebElement EditAppointment;

	public void EditAppointment()
	{
		EditAppointment.click();
	}

	@FindBy(how=How.NAME,using="title")
	@CacheLookup
	WebElement EditTitle;

	public void EditTitle(String t)
	{
		EditTitle.click();
		EditTitle.clear();
		EditTitle.sendKeys(t);
	}

	@FindBy(how=How.NAME,using="apptDuration")
	@CacheLookup
	WebElement EditapptDuration;

	public void EditapptDuration(String a)
	{
		EditapptDuration.click();
		EditapptDuration.clear();
		EditapptDuration.sendKeys(a);
	}

	@FindBy(how=How.NAME,using="externalServiceId")
	@CacheLookup
	WebElement EditexternalServiceId;

	public void EditexternalServiceId(String d)
	{
		EditexternalServiceId.click();
		EditexternalServiceId.clear();
		EditexternalServiceId.sendKeys(d);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/appointment-types/appointment-type-editor/section/form/div[3]/div/div/textarea")
	@CacheLookup
	WebElement EditDescription;

	public void EditDescription(String d)
	{
		EditDescription.click();
		EditDescription.clear();
		EditDescription.sendKeys(d);
	}

	@FindBy(how=How.NAME,using="formRequired")
	@CacheLookup
	WebElement EditformRequired;

	public void EditformRequired()
	{
		EditformRequired.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"chartContainer\"]/appointment-types/appointment-type-editor/section/form/div[6]/div/div/button[2]")
	@CacheLookup
	WebElement EditApptSave;

	public void EditApptSave()
	{
		EditApptSave.click();
	}
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Documents')]")
	@CacheLookup
	WebElement Documents;

	public void Documents()
	{
		Documents.click();
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Add New Form')]")
	@CacheLookup
	WebElement DocumentsAddNewForm;

	public void DocumentsAddNewForm()
	{
		DocumentsAddNewForm.click();
	}

	@FindBy(how=How.NAME,using="title")
	@CacheLookup
	WebElement Documentstitle;

	public void Documentstitle(String t)
	{
		Documentstitle.click();
		Documentstitle.sendKeys(t);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/add-form-modal/div[2]/div/form/div[2]/div/button")
	@CacheLookup
	WebElement  DocumentSelectTemplate;

	public void DocumentSelectTemplate()
	{
		DocumentSelectTemplate.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/add-form-modal/div[2]/div/form/div[2]/div/ul/li[4]/a")
	@CacheLookup
	WebElement DocumentSelectTemplate1;

	public void DocumentSelectTemplate1()
	{
		DocumentSelectTemplate1.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/add-form-modal/div[3]/button[2]")
	@CacheLookup
	WebElement DocumentSelectTemplate1Continue;

	public void DocumentSelectTemplate1Continue()
	{
		DocumentSelectTemplate1Continue.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/documents/div/div[1]/document-list/document-editor/section/form/div[4]/span/div/label/input")
	@CacheLookup
	WebElement DocumentProvider;

	public void DocumentProvider()
	{
		DocumentProvider.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/documents/div/div[1]/document-list/document-editor/section/form/div[6]/form-field-list/div/uib-accordion/div/div/a")
	@CacheLookup
	WebElement DocumentAddFiled;

	public void DocumentAddFiled()
	{
		DocumentAddFiled.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/documents/div/div[1]/document-list/document-editor/section/form/div[1]/input")
	@CacheLookup
	WebElement DocumentfieldTitle;

	public void DocumentfieldTitle(String ft)
	{
		DocumentfieldTitle.click();
		DocumentfieldTitle.clear();
		DocumentfieldTitle.sendKeys(ft);
	}

	@FindBy(how=How.ID,using="fieldMasterKey")
	@CacheLookup
	WebElement DocumentfieldMasterKey;

	public void DocumentfieldMasterKey(String m)
	{
		DocumentfieldMasterKey.click();
		DocumentfieldMasterKey.sendKeys(m);
	}

	@FindBy(how=How.ID,using="fieldType")
	@CacheLookup
	WebElement DocumentfieldType;

	public void DocumentfieldType()
	{
		DocumentfieldType.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Date of Birth')]")
	@CacheLookup
	WebElement DocumentfieldTypeDob;

	public void DocumentfieldTypeDob()
	{
		DocumentfieldTypeDob.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Signature')]")
	@CacheLookup
	WebElement DocumentfieldTypeSignature;

	public void DocumentfieldTypeSignature()
	{
		DocumentfieldTypeSignature.click();
	}

	@FindBy(how=How.ID,using="taTextElement8314353641563397")
	@CacheLookup
	WebElement DocumentfieldTypeSignature1;

	public void DocumentfieldTypeSignature1(String s)
	{
		DocumentfieldTypeSignature1.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'List Input Field')]")
	@CacheLookup
	WebElement ListInputField;

	public void ListInputField()
	{
		ListInputField.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Image Uploader')]")
	@CacheLookup
	WebElement ImageUploader;

	public void ImageUploader()
	{
		ImageUploader.click();
	}



	@FindBy(how=How.XPATH,using="//a[contains(text(),'Select - Dropdown')]")
	@CacheLookup
	WebElement SelectDropdown;

	public void SelectDropdown()
	{
		SelectDropdown.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Last 4 Social')]")
	@CacheLookup
	WebElement Last4Social;

	public void Last4Social()
	{
		Last4Social.click();
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Form On Demand Filters')]")
	@CacheLookup
	WebElement FormOnDemandFilters;

	public void FormOnDemandFilters()
	{
		FormOnDemandFilters.click();
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Select Self Pay Form')]")
	@CacheLookup
	WebElement SelectSelfPayForm;

	public void SelectSelfPayForm()
	{
		SelectSelfPayForm.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/select-self-pay-form-modal/div[2]/div/form/div/div/button")
	@CacheLookup
	WebElement SelectSelfPayForm1;

	public void SelectSelfPayForm1()
	{
		SelectSelfPayForm1.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'MRI Safety Questionnaire')]")
	@CacheLookup
	WebElement MRISafetyQuestionnaire;

	public void MRISafetyQuestionnaire()
	{
		MRISafetyQuestionnaire.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'RBC Report')]")
	@CacheLookup
	WebElement RBCReport;

	public void RBCReport()
	{
		RBCReport.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/select-self-pay-form-modal/div[3]/button[2]")
	@CacheLookup
	WebElement SelectSelfPayFormSave;

	public void SelectSelfPayFormSave()
	{
		SelectSelfPayFormSave.click();
	}

	@FindBy(how=How.ID,using="fieldInstructions")
	@CacheLookup
	WebElement DocumentfieldInstructions;

	public void DocumentfieldInstructions(String f)
	{
		DocumentfieldInstructions.click();
		DocumentfieldInstructions.sendKeys(f);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/documents/div/div[1]/document-list/document-editor/section/form/div[6]/form-field-list/div/uib-accordion/div/div[1]/div[2]/div[2]/div/form-field/article/form/div[4]/div/label/input")
	@CacheLookup
	WebElement Thifieldrequired;

	public void Thifieldrequired()
	{
		Thifieldrequired.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/documents/div/div[1]/document-list/document-editor/section/div[2]/div/button[3]")
	@CacheLookup
	WebElement DocumentFiledSave;

	public void DocumentFiledSave()
	{
		DocumentFiledSave.click();
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Form On Demand Filters')]")
	@CacheLookup
	WebElement DocumentFormDemand;

	public void DocumentFormDemand()
	{
		DocumentFormDemand.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/forms-on-demand-filter/div[2]/div[1]/input")
	@CacheLookup
	WebElement DocumentFilterSearch;

	public void DocumentFilterSearch(String f)
	{
		DocumentFilterSearch.click();
		DocumentFilterSearch.sendKeys(f);
	}

	@FindBy(how=How.XPATH,using="//span[contains(text(),'Select All')]")
	@CacheLookup
	WebElement DocumentSelectAll;

	public void DocumentSelectAll()
	{
		DocumentSelectAll.click();
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Close')]")
	@CacheLookup
	WebElement DocumentClose;

	public void DocumentClose()
	{
		DocumentClose.click();
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Select Self Pay Form')]")
	@CacheLookup
	WebElement DocumentSelectSelfPayForm;

	public void DocumentSelectSelfPayForm()
	{
		DocumentSelectSelfPayForm.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/select-self-pay-form-modal/div[2]/div/form/div/div/button")
	@CacheLookup
	WebElement DocumentSelectSelfPayForm1;

	public void DocumentSelectSelfPayForm1()
	{
		DocumentSelectSelfPayForm1.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"organization\"]/div[1]/div/div/select-self-pay-form-modal/div[2]/div/form/div/div/ul/li[5]/a")
	@CacheLookup
	WebElement DocumentSelectSelfPayForm2;

	public void DocumentSelectSelfPayForm2()
	{
		DocumentSelectSelfPayForm2.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/select-self-pay-form-modal/div[3]/button[2]")
	@CacheLookup
	WebElement DocumentSelfPayFormSave;

	public void DocumentSelfPayFormSave()
	{
		DocumentSelfPayFormSave.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Surveys')]")
	@CacheLookup
	WebElement Surveys;

	public void Surveys()
	{
		Surveys.click();
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Add Survey')]")
	@CacheLookup
	WebElement AddSurvey;

	public void AddSurvey()
	{
		AddSurvey.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"title\"]")
	@CacheLookup
	WebElement Surveystitle;

	public void Surveystitle(String s)
	{
		Surveystitle.click();
		Surveystitle.sendKeys(s);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"chartContainer\"]/documents/div/div[2]/survey-list/survey-editor/section/form/div[2]/div[2]/div/button")
	@CacheLookup
	WebElement SurveysDepartment;

	public void SurveysDepartment()
	{
		SurveysDepartment.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"chartContainer\"]/documents/div/div[2]/survey-list/survey-editor/section/form/div[2]/div[2]/div/ul/li[1]/a")
	@CacheLookup
	WebElement SurveysDepartmentCheckAll;

	public void SurveysDepartmentCheckAll()
	{
		SurveysDepartmentCheckAll.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"chartContainer\"]/documents/div/div[2]/survey-list/survey-editor/section/div/button[2]")
	@CacheLookup
	WebElement SurveysSave;

	public void SurveysSave()
	{
		SurveysSave.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/documents/div/div[2]/survey-list/div/section/ul/li/button/i")
	@CacheLookup
	WebElement SurveysEdit;

	public void SurveysEdit()
	{
		SurveysEdit.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"chartContainer\"]/documents/div/div[2]/survey-list/survey-editor/section/div/button[1]")
	@CacheLookup
	WebElement SurveysCancel;

	public void SurveysCancel()
	{
		SurveysCancel.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/documents/div/div[2]/survey-list/survey-editor/section/form/div[1]/div/a")
	@CacheLookup
	WebElement  BacktoSurveys;

	public void BacktoSurveys()
	{
		BacktoSurveys.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Specialties')]")
	@CacheLookup
	WebElement Specialties;

	public void Specialties()
	{
		Specialties.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"chartContainer\"]/specialties/h2/button")
	@CacheLookup
	WebElement AddSpecialties;

	public void AddSpecialties()
	{
		AddSpecialties.click();
	}

	@FindBy(how=How.NAME,using="specialty-name")
	@CacheLookup
	WebElement specialtyname;

	public void specialtyname(String sn)
	{
		specialtyname.click();
		specialtyname.sendKeys(sn);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/specialties-modal/div/div[4]/button[2]")
	@CacheLookup
	WebElement SaveSpecialty;

	public void SaveSpecialty()
	{
		SaveSpecialty.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"organization\"]/div[1]/div/div/specialties-modal/div/div[3]/form/div[2]/div[2]/button")
	@CacheLookup
	WebElement Addsubspecialty;

	public void Addsubspecialty()
	{
		Addsubspecialty.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"organization\"]/div[1]/div/div/specialties-modal/div/div[3]/form/div[2]/div[2]/button")
	@CacheLookup
	WebElement subSpecialtyName;

	public void subSpecialtyName(String ss)
	{
		subSpecialtyName.click();
		subSpecialtyName.sendKeys(ss);
	}

	@FindBy(how=How.ID,using="removebtn-0")
	@CacheLookup
	WebElement Specialtyremovebtn;

	public void Specialtyremovebtn()
	{
		Specialtyremovebtn.click();
	}

	@FindBy(how=How.ID,using="editSpecButton")
	@CacheLookup
	WebElement editSpecButton;

	public void editSpecButton()
	{
		editSpecButton.click();
	}

	@FindBy(how=How.ID,using="removeParent-")
	@CacheLookup
	WebElement DeleteSpecialties;

	public void DeleteSpecialties()
	{
		DeleteSpecialties.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"organization\"]/div[1]/div/div/confirm-modal/div[3]/div/button[1]")
	@CacheLookup
	WebElement DeleteSpecialtiesbtn;

	public void DeleteSpecialtiesbtn()
	{
		DeleteSpecialtiesbtn.click();
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Patient Intake')]")
	@CacheLookup
	WebElement PatientIntaketab;

	public void PatientIntaketab()
	{
		PatientIntaketab.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/patient-intake-config/section/div[2]/div[2]/div[2]/div/div[4]/table/tbody/tr/td[1]/input")
	@CacheLookup
	WebElement PatientIntaketabInsurancename;

	public void PatientIntaketabInsurancename(String in)
	{
		PatientIntaketabInsurancename.click();
		PatientIntaketabInsurancename.sendKeys(in);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/patient-intake-config/section/div[2]/div[2]/div[2]/div/div[4]/table/tbody/tr/td[2]/input")
	@CacheLookup
	WebElement PatientIntaketabInsurancevalue;

	public void PatientIntaketabInsurancevalue(String v)
	{
		PatientIntaketabInsurancevalue.click();
		PatientIntaketabInsurancevalue.sendKeys(v);
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/patient-intake-config/section/div[2]/div[1]/div[4]/table/tbody/tr/td[3]/button")
	@CacheLookup
	WebElement AddPatientIntaketab;

	public void AddPatientIntaketab()
	{
		AddPatientIntaketab.click();
	}

	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/patient-intake-config/section/div[2]/div[2]/div[2]/div/div[4]/table/tbody/tr[1]/td[3]/button")
	@CacheLookup
	WebElement RemovePatientIntaketab;

	public void RemovePatientIntaketab()

	{
		RemovePatientIntaketab.click();
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"chartContainer\"]/patient-intake-config/section/div[2]/div/div[3]/div/div[4]/table/tbody/tr/td[1]/input")
	@CacheLookup
	WebElement PatientIntakePaymentname;

	public void PatientIntakePaymentname(String p)
	{
		PatientIntakePaymentname.click();
		PatientIntakePaymentname.sendKeys(p);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"chartContainer\"]/patient-intake-config/section/div[2]/div/div[3]/div/div[4]/table/tbody/tr/td[2]/input")
	@CacheLookup
	WebElement PatientIntakePaymentvalue;

	public void PatientIntakePaymentvalue(String v)
	{
		PatientIntakePaymentvalue.click();
		PatientIntakePaymentvalue.sendKeys(v);
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"saveButton\"]")
	@CacheLookup
	WebElement PatientIntakePaymentSave;

	public void PatientIntakePaymentSave()
	{
		PatientIntakePaymentSave.click();
	}



	 //  ----------------------
    @FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[1]/a[9]")
    @CacheLookup
    WebElement newappointmenttype;
    
    public void newappointmenttype()
    {
   	 newappointmenttype.click();
    }
    
    @FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/appointment-types/section/div[2]/div/table/tbody/tr[2]/td[4]/button")
    @CacheLookup
    WebElement editvisitbtn;
    
    public void editvisitbtn()
    {
   	 editvisitbtn.click();
    }
    
    @FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/appointment-types/appointment-type-editor/section/form/div[4]/div/div[2]/div[1]/form-item/div/div[3]/i")
    @CacheLookup
    WebElement removeforms;
    
    public void removeforms()
    {
   	 removeforms.click();
    }
    
    @FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/appointment-types/appointment-type-editor/section/form/div[6]/div/div/button[2]")
    @CacheLookup
    WebElement formsave;
    
    public void formsave()
    {
   	 formsave.click();
    }
    
    @FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[2]/li/a")
    @CacheLookup
    WebElement orgadminprofile;
    
    public void orgadminprofile()
    {
   	 orgadminprofile.click();
    }
    
    @FindBy(how=How.XPATH,using="/html/body/navbar/header/div/div/div[2]/ul[2]/li/ul/section[3]/li/a")
    @CacheLookup
    WebElement orgreturntoaccess;
    
    public void orgreturntoaccess()
    {
   	 orgreturntoaccess.click();
    }
    //-------
    
    @FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/appointment-types/appointment-type-editor/section/form/div[4]/div/div[2]/div[2]/form-item/div/div[3]/i")
    @CacheLookup
    WebElement removeforms1;
    
    public void removeforms1()
    {
   	 removeforms1.click();
    }
    
    @FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/appointment-types/appointment-type-editor/section/form/div[4]/div/div[1]/button")
    @CacheLookup
    WebElement addforms;
    
    public void addforms()
    {
   	 addforms.click();
    }
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/add-form/div[2]/div/form/div/select")
    @CacheLookup
    WebElement addformsclick;
    
    public void addformsclick()
    {
   	 Select drpdown = new Select(addformsclick);
		drpdown.selectByIndex(1);
    }
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/add-form/div[3]/button[2]")
    @CacheLookup
    WebElement createforms;
    
    public void createforms()
    {
   	 createforms.click();
    }
   //----
    @FindBy(how=How.XPATH,using="//a[contains(text(),'Documents') and @id=\"orgDetails\"]")
    @CacheLookup
    WebElement orgdocument;
    
    public void orgdocument()
    {
   	 orgdocument.click();
    }
   
    @FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/documents/div/div[1]/document-list/div/ul/li[1]/button/i")
    @CacheLookup
    WebElement editorgdocument;
    
    public void editorgdocument()
    {
   	 editorgdocument.click();
    }
   
    @FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/documents/div/div[1]/document-list/document-editor/section/form/div[1]/input")
    @CacheLookup
    WebElement cleartitle;
    
    public void cleartitle()
    {
   	 cleartitle.clear();
    }
   
    @FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/documents/div/div[1]/document-list/document-editor/section/div[2]/div/button[3]")
    @CacheLookup
    WebElement orgsave;
    
    public void orgsave()
    {
   	 orgsave.click();
    }
   
    @FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/documents/div/div[1]/document-list/div/header/div/button[1]")
    @CacheLookup
    WebElement addnewform;
    
    public void addnewform()
    {
   	 addnewform.click();
    }
   
    
    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/add-form-modal/div[3]/button[2]")
    @CacheLookup
    WebElement continueclick;
    
    public void continueclick()
    {
   	 continueclick.click();
    }
    
//----------------------------------02-11-2022---------------------------------------------------------------------------------------------------------------------------------

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[2]/div[2]/div/select")
@CacheLookup
WebElement MessageTrigger_INSTRUCTOR_CHANGE;

public void MessageTrigger_INSTRUCTOR_CHANGE()
{
	Select dc = new Select(MessageTrigger_INSTRUCTOR_CHANGE);
	dc.selectByVisibleText("INSTRUCTOR_CHANGE");
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[2]/div[1]/div/select")
@CacheLookup
WebElement MessageCategory_SCHEDULE;

public void MessageCategory_SCHEDULE()
{
	Select dc = new Select(MessageCategory_SCHEDULE);
	dc.selectByVisibleText("SCHEDULE");
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[2]/recipients/div/div[1]/input")
@CacheLookup
WebElement Message_Recipients;

public void Message_Recipients()
{
	Message_Recipients.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[2]/div/div/div/div[2]/recipients/div/ul/li/div[4]/span")
@CacheLookup
WebElement Message_Recipients_Appointment;

public void Message_Recipients_Appointment()
{
	Message_Recipients_Appointment.click();
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[1]/div/div/input")
@CacheLookup
WebElement MessageEdit_Title;

public void MessageEdit_Title(String a)
{
	MessageEdit_Title.clear();
	MessageEdit_Title.sendKeys(a);
	
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[2]/div[1]/div/select")
@CacheLookup
WebElement MessageEdit_Category;

public void MessageEdit_Category()
{
	Select ab = new Select(MessageEdit_Category);
	ab.selectByVisibleText("APPOINTMENT");
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[2]/div[2]/div/select")
@CacheLookup
WebElement MessageEdit_Trriger;

public void MessageEdit_Trriger()
{
	Select ad  = new Select(MessageEdit_Trriger);
	ad.selectByVisibleText("CREATION");
}


@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[3]/div/div/div/button")
@CacheLookup
WebElement MessageEdit_Limits;

public void MessageEdit_Limits()
{
	MessageEdit_Limits.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[1]/div/div[3]/div/div/div/ul/li[1]/a")
@CacheLookup
WebElement MessageEdit_CheckAll;

public void MessageEdit_CheckAll()
{
	MessageEdit_CheckAll.click();
}

@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/message-builder/section[2]/message-builder-editor/section/form/div[7]/div/div/div/div/button[2]")
@CacheLookup
WebElement MessageEdit_Save;

public void MessageEdit_Save()
{
	MessageEdit_Save.click();
}














}
