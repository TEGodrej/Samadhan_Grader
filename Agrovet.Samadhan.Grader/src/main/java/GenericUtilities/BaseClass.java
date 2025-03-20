package GenericUtilities;

import java.io.IOException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
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
	
//	@BeforeSuite
//	public void connectToDB(String url, String username, String password)  {
//		try {
//			connection=DriverManager.getConnection(url, username, password);
//		}
//		catch(SQLException e) {
//			e.printStackTrace();
//		}
//	}
//		@BeforeClass
//		private void PrintingStatement() {
//			System.out.println("before class has been executed");
//
//		}
		@BeforeMethod
		public void startApp() throws IOException {
			// Fetching data from property file
//			String platformname=FileUtility.getDataFromProperty("platformName");
//			String DeviceName=FileUtility.getDataFromProperty("DeviceName");
//			String AutomationName=FileUtility.getDataFromProperty("uiautomator2");
//			String udid=FileUtility.getDataFromProperty("UDID");
//			String appactivty=FileUtility.getDataFromProperty("appActivity");
//			String apppackage=FileUtility.getDataFromProperty("appPackage");
//			String NoReset=FileUtility.getDataFromProperty("noReset");
//			
//			DesiredCapabilities desiredCapability=new DesiredCapabilities();
//			desiredCapability.setCapability("platformName", platformname);
//			desiredCapability.setCapability("deviceName", DeviceName);
//			desiredCapability.setCapability("automationName", AutomationName);
//			desiredCapability.setCapability("UDID", udid);
//			desiredCapability.setCapability("noReset", NoReset);
//			desiredCapability.setCapability("appActivity", appactivty);
//			desiredCapability.setCapability("appPackage", apppackage);
			
			DesiredCapabilities desiredCapability=new DesiredCapabilities();
			desiredCapability.setCapability("platformName", "android");
			desiredCapability.setCapability("deviceName", "Redmi A2");
			desiredCapability.setCapability("automationName", "Uiautomator2");
			desiredCapability.setCapability("UDID", "WKAQCYCQKROVDE4L");
			desiredCapability.setCapability("noReset", true);
			
			
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
		}
		
	}


