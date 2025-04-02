package GenericUtilities;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import objectRepositories.ApplyForLeaveScreen;
import objectRepositories.AttendanceScreen;
import objectRepositories.EnterGradingDetailsScreen;
import objectRepositories.FilterByScreen;
import objectRepositories.GradingRequestScreen;
import objectRepositories.HamburgerScreen;
import objectRepositories.HistoryScreen;
import objectRepositories.HomeScreen;
import objectRepositories.LoginScreen;
import objectRepositories.LogoutScreen;
import objectRepositories.OtpScreen;
import objectRepositories.ProfileScreen;
import objectRepositories.SchedularScreen;
import objectRepositories.SortByScreen;

/*
 * @author Testing Engineer
 */
public class BaseClass {
	public static AndroidDriver staticdriver;
	AndroidDriver driver;
	public static LoginScreen loginScreen;
	public static OtpScreen otpScreen;
	public static DriverUtility driverUtility;
	public static ExcelUtility excelUtility;
	public static GestureUtility gestureUtility;
	public static ListenerUtility listenerUtility;
	public static FileUtility fileUtility;
	public static HomeScreen homeScreen;
	public static GradingRequestScreen gradingRequestScreen;
	public static HamburgerScreen hamburgerScreen;
	public static ProfileScreen profileScreen;
	public static EnterGradingDetailsScreen  enterGradingDetailsScreen;
	public static AttendanceScreen  attendanceScreen;
	public static ApplyForLeaveScreen applyForLeaveScreen;
	public static HistoryScreen historyScreen;
	public static SortByScreen sortByScreen;
	public static FilterByScreen filterByScreen;
	public static SchedularScreen schedularScreen;
	public static LogoutScreen  logoutScreen;
	public static ScreenShot screenshot;
	public AppiumDriverLocalService service ;
	
		@BeforeMethod
		public void startApp() throws IOException {
/*
 * this is to start the appium server
 */			
			
			
				File file = new File(FileUtility.getDataFromProperty("mainJSPath"));
			    service = new AppiumServiceBuilder().withAppiumJS(file).withIPAddress(FileUtility.getDataFromProperty("ipAddress")).usingPort(Integer.parseInt(FileUtility.getDataFromProperty("portNumber"))).build();
				service.start();
				
/*         
 * Fetching data from property file
 * 
 */			
			String platformName=FileUtility.getDataFromProperty("platformName");
			String DeviceName=FileUtility.getDataFromProperty("DeviceName");
			String automationName=FileUtility.getDataFromProperty("automationName");
			String udid=FileUtility.getDataFromProperty("UDID");
			String appActivty=FileUtility.getDataFromProperty("appActivity");
			String appPackage=FileUtility.getDataFromProperty("appPackage");
			String noReset=FileUtility.getDataFromProperty("noReset");
			
			DesiredCapabilities desiredCapability=new DesiredCapabilities();
			desiredCapability.setCapability("platformName", platformName);
			desiredCapability.setCapability("deviceName", DeviceName);
			desiredCapability.setCapability("automationName", automationName);
			desiredCapability.setCapability("UDID", udid);
			desiredCapability.setCapability("noReset", noReset);
			desiredCapability.setCapability("appActivity", appActivty);
			desiredCapability.setCapability("appPackage", appPackage);
			
//			DesiredCapabilities desiredCapability=new DesiredCapabilities();
//			desiredCapability.setCapability("platformName", "android");
//			desiredCapability.setCapability("deviceName", "Redmi A2");
//			desiredCapability.setCapability("automationName", "Uiautomator2");
//			desiredCapability.setCapability("UDID", "WKAQCYCQKROVDE4L");
//			desiredCapability.setCapability("noReset", true);
			
			
			URL url= URI.create("http://localhost:4723").toURL();
			driver=new AndroidDriver(url, desiredCapability);
			staticdriver=driver;
			
			staticdriver.activateApp("com.gavl.oilpalm.fms");
			
			loginScreen= new LoginScreen(driver);
			otpScreen=new OtpScreen(driver);
			driverUtility=new DriverUtility(driver);
			excelUtility=new ExcelUtility();
			gestureUtility=new GestureUtility(driver);
			listenerUtility=new ListenerUtility();
			fileUtility=new FileUtility();
			homeScreen = new HomeScreen(driver);
			gradingRequestScreen =new GradingRequestScreen(driver);
			hamburgerScreen = new HamburgerScreen(driver);
			profileScreen = new ProfileScreen(driver);
			enterGradingDetailsScreen = new EnterGradingDetailsScreen(driver);
			attendanceScreen = new AttendanceScreen(driver);
			applyForLeaveScreen = new ApplyForLeaveScreen(driver);
			historyScreen = new HistoryScreen(driver);
			sortByScreen = new SortByScreen(driver);
			filterByScreen = new FilterByScreen(driver);
			schedularScreen = new SchedularScreen(driver); 
			logoutScreen = new LogoutScreen(driver);
			screenshot= new ScreenShot();
			
		}
		
		@AfterMethod
		public void closeApp() throws IOException {
			driver.terminateApp("com.gavl.oilpalm.fms");
			service.stop();
		}
		
	}


