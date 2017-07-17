
package com.hrproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import generics.BasePage;

public class LicencesPage extends BasePage
{

	@FindBy(xpath="//nobr[test()='productEdition:']/../../td[2]/b")
		private WebElement productEdition;
	
	
	
	
	public LicencesPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void veriftProductEdition(String evalue)
	{
		String avalue=  productEdition.getText();
		Assert.assertEquals(avalue, evalue);
	}
	

}
