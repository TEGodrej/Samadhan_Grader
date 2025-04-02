package GenericUtilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 *@author DivyaPrakashAmar
 */

public class ExtentReportsListner implements ITestListener  {

	ExtentReports extentreports;
	ExtentTest extentTest;
	
	/**
	 *This method is use to capture method name when execution starts
	 *@param ITestResult result
	 */
	
	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		 extentTest = extentreports.createTest(methodName);
		
	}
	
	/**
	 *This method is use to capture method name after execution successed 
	 *@param ITestResult result
	 */

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		extentTest.log(Status.PASS,methodName+"========Completed");
	}
	
	/**
	 *This method is use to capture method name when execution fails
	 *@param ITestResult result
	 */

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
         Date d = new Date();
		
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String date = sim.format(d);
		 String path="C:\\Users\\testing.engineer\\git\\Grader\\Agrovet.Samadhan.Grader\\AdvanceReport" + methodName + date + ".png";
		TakesScreenshot ts = (TakesScreenshot) BaseClass.staticdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(path);
		try {
			FileUtils.copyFile(src, dst);
			String p = dst.getAbsolutePath();
			extentTest.addScreenCaptureFromBase64String(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
		extentTest.log(Status.FAIL,methodName+"========Failed");
		extentTest.log(Status.FAIL, result.getThrowable());

	}

	/**
	 *This method is use to capture method name when execution skipped
	 *@param ITestResult result
	 */

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		extentTest.log(Status.SKIP,methodName+"========Skipped");
	}
	
	/**
	 *This method is use to capture method name when execution starts
	 *@param ITestContext context
	 */

	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\testing.engineer\\git\\Grader\\Agrovet.Samadhan.Grader\\AdvanceReport");
		spark.config().setDocumentTitle("Samadhan test suite result");
		spark.config().setReportName("Samadhan_Grader Report");
		spark.config().setTheme(Theme.DARK);
		
	   extentreports= new ExtentReports();
//		add environment and create test
		extentreports.attachReporter(spark);
		extentreports.setSystemInfo("OS", "android");
		extentreports.setSystemInfo("device", "Redmi A2");
		

	}
	/**
	 *This method is use to capture method name when execution finishes and it flushes the old report
	 *@param ITestContext context
	 */

	@Override
	public void onFinish(ITestContext context) {
		extentreports.flush();
	}

	
	
}
