package objectRepositories;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;


/**
 *This class contains elements of "SchedularScreen" and also contains reusable methods for the elements
 *It also contains some assertions methods
 *@author DivyaPrakashAmar
 */
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
	
	/**
	 *This method is use to verify scheduler message
	 */
	public void verifyScheduleMessage() {
		try {
			assertTrue(scheduleMessage.isDisplayed());
			System.out.println(scheduleMessage.getText()+ " is displayed");
		}catch (Exception e) {
			System.out.println("schedule message is not displayed");
		}
	}

}
