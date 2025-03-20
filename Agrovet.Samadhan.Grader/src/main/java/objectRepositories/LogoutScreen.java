package objectRepositories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LogoutScreen {
	
	AndroidDriver driver;
	public LogoutScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Yes']")
	private WebElement yesButton;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='No']")
	private WebElement noButton;
	
	public void clickOnYesButton() {
		try {
			String button=yesButton.getText();
			yesButton.click();
			System.out.println("clicked on "+button+ " Button");
		}catch (Exception e) {
			System.out.println("Not able to click on Yes Button");
		}
	}
	
	public void clickOnNoButton() {
		try {
			String button=noButton.getText();
			noButton.click();
			System.out.println("Clicked on "+button+ " Button");
		}catch (Exception e) {
			System.out.println("Not able to click on No Button");
		}
	}

}
