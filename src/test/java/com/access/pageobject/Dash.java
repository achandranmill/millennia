package com.access.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Dash {
	WebDriver ldriver;

	public Dash(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="//a[contains(text(),'Dash')]")
	@CacheLookup
	WebElement Dash;
	
	@FindBy(how = How.XPATH, using ="//body/main[1]/div[1]/dash1[1]/dash-item[1]/section[1]/div[1]/section[1]/article[2]/button[1]")
	@CacheLookup
	WebElement btncheckin;

	@FindBy(how = How.XPATH, using ="//body/main[1]/div[1]/dash1[1]/dash-item[2]/section[1]/div[1]/section[1]/article[2]/button[1]")
	@CacheLookup
	WebElement btnRegistration;
	

	@FindBy(how = How.XPATH, using ="//body/main[1]/div[1]/dash1[1]/dash-item[3]/section[1]/div[1]/section[1]/article[2]/button[1]")
	@CacheLookup
	WebElement btnDischarge;

	@FindBy(how = How.XPATH, using ="//body/main[1]/div[1]/dash1[1]/dash-item[4]/section[1]/div[1]/section[1]/article[2]/button[1]")
	@CacheLookup
	WebElement btnConnectCheckIn;

	@FindBy(how = How.XPATH, using ="//body/main[1]/div[1]/dash1[1]/dash-item[5]/section[1]/div[1]/section[1]/article[2]/button[1]")
	@CacheLookup
	WebElement btnHolding;

	@FindBy(how = How.XPATH, using ="//body/main[1]/div[1]/dash1[1]/dash-item[6]/section[1]/div[1]/section[1]/article[2]/button[1]")
	@CacheLookup
	WebElement btnWaiting;
	
	@FindBy(how = How.XPATH, using ="//body/main[1]/div[1]/dash1[1]/dash-item[7]/section[1]/div[1]/section[1]/article[2]/button[1]")
	@CacheLookup
	WebElement btnNew;
	
	
	@FindBy(how = How.XPATH, using ="//span[contains(text(),'×')]")
	@CacheLookup
	WebElement btncancel;
	
	public void DashClick()
	{
		Dash.click();	
	}
	public void checkin()
	{
		btncheckin.click();
		btncancel.click();
	}
	public void Registration()
	{
		btnRegistration.click();
		btncancel.click();
	}
	public void Discharge()
	{
		btnDischarge.click();
		btncancel.click();
	}
	public void ConnectCheckIn()
	{
		btnConnectCheckIn.click();
		btncancel.click();
	}
	public void Holding()
	{
		btnHolding.click();
		btncancel.click();
	}
	public void Waiting()
	{
		btnWaiting.click();
		btncancel.click();
	}
	public void New()
	{
		btnNew.click();
		btncancel.click();
	}
	public void cancel()
	{
		btncancel.click();
	}

	
	}







