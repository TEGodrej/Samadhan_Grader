package GenericUtilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 *@author DivyaPrakashAmar
 */
public class ListenerUtility implements ITestListener {
	
	/**
	 *This method is use to caputer screen shot when method fails
	 *@param ITestResult result
	 */
	@Override
	public void onTestFailure(ITestResult result) {
		String failed = result.getMethod().getMethodName();
		TakesScreenshot ss=(TakesScreenshot)BaseClass.staticdriver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		File dst=new File("failed"+failed+".jpg");
		try {
		   FileUtils.copyFile(source, dst);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *This method is use to caputer screen shot when method skips
	 *@param ITestResult result
	 */
	
	@Override
	public void onTestSkipped(ITestResult result) {
		String failed = result.getMethod().getMethodName();
		TakesScreenshot ss=(TakesScreenshot)BaseClass.staticdriver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		File dst=new File("Skipped"+failed+".jpg");
		try {
		   FileUtils.copyFile(source, dst);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
