package generics;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class FWListener implements ITestListener, IAutoConst
{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String name= UtilityLib.now();
		String path= PHOTO_PATH+name+".png"; 
		//IAutoConst.PHOTO_PATH+name+".png"; --> we implements IAutoConst class so no need to write IAutoConst.
		//in java multiple inheritance is possible but with the help of Implements 
		UtilityLib.getScreenShot(path);
		Reporter.log("Photos is taken"+ path, true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
