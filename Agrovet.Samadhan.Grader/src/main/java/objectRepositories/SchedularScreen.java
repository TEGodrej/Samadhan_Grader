package objectRepositories;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SchedularScreen {
	
	AndroidDriver driver;
	public SchedularScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.TextView[@text='No Schedule available']")
	private WebElement  scheduleMessage;
	
	@FindBy(xpath = "//android.view.View[@text='Schedular']")
	private WebElement pageTitle;
	
	public void verifyScheduleMessage() {
		try {
			assertTrue(scheduleMessage.isDisplayed());
			System.out.println(scheduleMessage.getText()+ " is displayed");
		}catch (Exception e) {
			System.out.println("schedule message is not displayed");
		}
	}

}
