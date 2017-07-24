
package com.hrproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import generics.BasePage;

public class LicencesPage extends BasePage
{

	@FindBy(xpath="//b[contains(text(), 'actiTIME ')]")
		private WebElement productEdition;
	
	
	
	
	public LicencesPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void veriftProductEdition(String evalue)
	{
		String avalue=  productEdition.getText();
		System.out.println("versoin frm Licence page="+avalue);
		Assert.assertEquals(avalue, evalue);
	}
	

}
