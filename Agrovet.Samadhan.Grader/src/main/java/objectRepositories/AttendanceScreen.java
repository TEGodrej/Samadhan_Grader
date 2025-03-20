package objectRepositories;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class AttendanceScreen {
	
	AndroidDriver driver;
	
	public AttendanceScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"6, PRESENT DAYS, 0, LEAVE DAYS, 7, ABSENT DAYS\"]")
	private WebElement presentAbsentDaysTab;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Apply Leave']")
	private WebElement applyLeaveTab;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Clock-Out']")
	private WebElement clockOutTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='TADIKALAPUDI']")
	private WebElement CcArea;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Attendance for 2025-March']")
	private WebElement attendanceMonth;
	
	public void clickOnApplyLeaveTab() {
		try {
			String tab=applyLeaveTab.getText();
			applyLeaveTab.click();
			System.out.println("Clicked on "+tab+" tab");
		}catch (Exception e) {
			System.out.println("Not able to click on apply leave Tab");
		}
	}
	
	public void clickOnPresentAbsentDaysTab() {
		try {
			String tab=presentAbsentDaysTab.getText();
			presentAbsentDaysTab.click();
			System.out.println("Clicked on "+tab+" tab");
		}catch (Exception e) {
			System.out.println("Not able to click on presentDay Tab");
		}
	}
	
	public void verifyUi() {
		try {
			if(CcArea.isDisplayed() && attendanceMonth.isDisplayed()) {
				assertTrue(true);
				System.out.println("Element is present on screen");
			}else {
				assertTrue(false);
				System.out.println("Element is not visible");
			}
		}catch (Exception e) {
			System.out.println("Elements are not displayed");
		}
	}
	
	public void getpresentAbsentDaysTabText() {
		try {
			System.out.println("method invoked");
			String numberOfPresentDays = presentAbsentDaysTab.getText();
			System.out.println(numberOfPresentDays);
		}catch (Exception e) {
			System.out.println("Not able to fecth text");
		}
	}
}
