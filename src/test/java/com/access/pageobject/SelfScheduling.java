package com.access.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SelfScheduling 

{
	
	WebDriver ldriver;
	
	public SelfScheduling(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver,20), this);
	}
	
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Self Scheduling')]")
	@CacheLookup
	WebElement SelfScheduling;
	
	public void SelfScheduling()
	{
		SelfScheduling.click();
	}
	
	@FindBy(how=How.NAME,using="slotHoldTime")
	@CacheLookup
	WebElement SlotHoldtime;
	
	public void SlotHoldtime(String sht)
	
	{
		SlotHoldtime.click();
		SlotHoldtime.clear();
		SlotHoldtime.sendKeys(sht);
	}
	
	@FindBy(how=How.NAME,using="enableQuestionnaireCheckbox")
	@CacheLookup
	WebElement EnableSelfQuestionnaire;
	
	public void EnableSelfQuestionnaire()
	{
		if(!EnableSelfQuestionnaire.isSelected()) {
			JavascriptExecutor es = (JavascriptExecutor)ldriver;
			es.executeScript("arguments[0].click", EnableSelfQuestionnaire);
			if(!EnableSelfQuestionnaire.isSelected())
			{
				EnableSelfQuestionnaire.click();
			}
		}
	}
	
	
	@FindBy(how=How.ID,using="questionnaireSelector")
	@CacheLookup
	WebElement QuestionnaireSelector;
	
	public void QuestionnaireSelector()
	{
		QuestionnaireSelector.click();
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'RBC Report')]")
	@CacheLookup
	WebElement Questionnaire_RCB;
	
	public void Questionnaire_RCB()
	{
		Questionnaire_RCB.click();
	}
	
	@FindBy(how=How.NAME,using="requireProviderID")
	@CacheLookup
	WebElement RequireProviderID;
	
	public void RequireProviderID()
	{
		RequireProviderID.click();
	}
	
	@FindBy(how=How.NAME,using="setToPending")
	@CacheLookup
	WebElement SetToPending;
	
	public void SetToPending()
	{
		SetToPending.click();
	}
	
	@FindBy(how=How.NAME,using="onlyAllowExistingPatients")
	@CacheLookup
	WebElement OnlyAllowExistingPatients;
	
	public void OnlyAllowExistingPatients()
	{
		OnlyAllowExistingPatients.click();
	}
	
	@FindBy(how=How.NAME,using="genericError")
	@CacheLookup
	WebElement GenericError;
	
	public void GenericError(String g)
	{
		GenericError.click();
		GenericError.clear();
		GenericError.sendKeys(g);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div[1]/admin-organization/div/div[2]/self-scheduling-config/form/div[4]/div[5]/button")
	@CacheLookup
	WebElement Save;
	
	public void Save()
	{
		Save.click();
	}
	
	

}
