package objectRepositories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;


/**
 *This class contains elements of "HamburgerScreen" and also contains reusable methods for the elements
 *It also contains some assertions methods
 *@author DivyaPrakashAmar
 */
public class HamburgerScreen {
	
	AndroidDriver driver;
	public HamburgerScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.TextView[@text='Divya Prakash Amar']")
	private WebElement userProfile;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='Home']")
	private WebElement homeTab;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='Scheduler']")
	private WebElement schedulerTab;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='Attendance']")
	private WebElement attendanceTab;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='Report']")
	private WebElement reportTab;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]")
	private WebElement darkModeRadioButton;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='Logout']")
	private WebElement logoutTab;
	
	/**
	 *This method is use to click On UserProfile
	 */
	public void clickOnUserProfile() {
		try {
			userProfile.click();
			System.out.println("clicked on user profile");
		}catch (Exception e) {
			System.out.println("Not able to click on user profile");
		}
	}
	/**
	 *This method is use to click On AttendanceTab
	 */
	public void clickOnAttendanceTab() {
		try {
			attendanceTab.click();
			System.out.println("Clicked on Attendance Tab");
		}catch (Exception e) {
			System.out.println("Not able to click on Attendance Tab");
		}
	}
	
	/**
	 *This method is use to click On SchedulerTab
	 */
	public void clickOnSchedulerTab() {
		try {
			schedulerTab.click();
			System.out.println("Clicked on Scheduler Tab");
		}catch (Exception e) {
			System.out.println("Not able to click on SchedulerTab");
		}
	}
	/**
	 *This method is use to click On logoutTab
	 */
	public void clickOnlogoutTab() {
		try {
			String button=logoutTab.getText();
			logoutTab.click();
			System.out.println("Clicked on "+button+" button");
		}catch (Exception e) {
			System.out.println("Not able to click on logout tab");
		}
	}
	

}
