package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners(FWListener.class)
public class BaseTest implements IAutoConst 
{
	public WebDriver driver;
	@BeforeSuite
	public void setDriverPath()
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);		
	}
	
	@BeforeMethod
	public void openApp()
	{
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url= UtilityLib.getPropertyValue(CONFIG_PATH, "URL");
		driver.get(url);
	}
	
	
	@AfterMethod
	public void closeApp()
	{
	driver.close();
	driver.quit();
	}
	
	

}
