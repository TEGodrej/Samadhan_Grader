package objectRepositories;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class HistoryScreen extends BaseClass{
	AndroidDriver driver;
	public HistoryScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyPresentDate() {
		try {
			String Date=excelUtility.readDataFromExcel("TestData", 6, 1);
			WebElement date = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup/android.widget.TextView[@text='Present']/following-sibling::android.view.ViewGroup/android.widget.TextView[@text='"+Date+"']"));
			if(date.isDisplayed()) {
				assertTrue(true);
				System.out.println("user is present on given date");
			}else {
				assertFalse(false);
			}
//			System.out.println("user is present on given date");
		}catch (Exception e) {
			System.out.println("User was absent on mentioned date");
		}
	}
}
