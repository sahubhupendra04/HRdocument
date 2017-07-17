package com.hrproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generics.BasePage;

public class LoginPage extends BasePage
{

	@FindBy(id= "username")
	private WebElement unTXB;
	
	@FindBy(name= "pwd")
	private WebElement pwTXB;
	
	@FindBy(xpath= "//div[.='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath = "//span[contains(.,'invalid')]")
	private WebElement errMSG;
	
	@FindBy(xpath = "//nobr[contains(text(),'actiTIME')]")
	private WebElement actiTIMEVersion;
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void setUserName(String un)
	{
		unTXB.sendKeys(un);
	}
	

	public void setPassword(String pw)
	{
		pwTXB.sendKeys(pw);
	}
	

	public void clickLogin()
	{
		loginBTN.click();
	}
	
	public void verifyErrMsgIsSisplay()
	{
		verifyElementIsPresent(errMSG);
	}
	
	public String getVersion()
	{
		return actiTIMEVersion.getText();
		
		
	}
}
