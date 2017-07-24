package com.hrdocument.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.hrproject.pages.EnterTimeTrackPage;
import com.hrproject.pages.LoginPage;

import generics.BaseTest;
import generics.UtilityLib;

public class ValidLoginLogout extends BaseTest
{
	@Test(priority=1)
	public void testValidLoginLogout()
	{
		String un= UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 0);
		System.out.println("un="+un);
		String pw= UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 1);
		System.out.println("pw="+pw);
		String hp= UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 2);
		System.out.println("hp="+hp);
		String title=driver.getTitle();
		System.out.println("myTitle="+title);
		String lp= UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 3);
		System.out.println("lp="+lp);
		
		//Enter valid user name
		LoginPage l= new LoginPage(driver);
		l.setUserName(un);
		
		//enter valid password
		l.setPassword(pw);
		
		//click on login
		l.clickLogin();
		
		
		//verify home page is displayed
		EnterTimeTrackPage e= new EnterTimeTrackPage(driver);
		e.verifyTitle(hp);
		
		//click logout
		WebDriverWait wt=new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		e.clickLogout();
		
		//verify that login page has displayed
		l.verifyTitle(lp);
		
		
	}

}
