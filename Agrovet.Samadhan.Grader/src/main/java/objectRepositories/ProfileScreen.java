package objectRepositories;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ProfileScreen {
	
	AndroidDriver driver;
	public ProfileScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.TextView[@text='Divya Prakash Amar']")
	private WebElement userName;
	
	@FindBy(xpath = "//android.widget.TextView[@text='testing.engineer@godrejagrovet.com']")
	private WebElement userMailId;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
	private WebElement profilePicture;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"button-text\" and @text=\"Gallery\"]")
	private WebElement galleryButton;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"button-text\" and @text=\"Camera\"]")
	private WebElement cameraButton;
	
	@FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[4]")
	private WebElement picture;
	
	public void verifyUserName() {
		try {
			assertTrue(userName.isDisplayed());
		}catch (Exception e) {
			System.out.println("userName is not displayed");
		}
	}
	
	public void clickOnProfilePicture() {
		try {
			String button=profilePicture.getText();
			profilePicture.click();
			System.out.println("clicked on "+ button +" Button");
		}catch (Exception e) {
			System.out.println("Not able to click on profile picture");
		}
	}
	
	public void clickOnGalleryButton() {
		try {
			String button=galleryButton.getText();
			galleryButton.click();
			System.out.println("clicked on "+ button +" Button");
		}catch (Exception e) {
			System.out.println("Not able to click on gallery button");
		}
	}
	
	public void clickOnCameraButton() {
		try {
			String button=cameraButton.getText();
			cameraButton.click();
			System.out.println("clicked on "+ button +" Button");
		}catch (Exception e) {
			System.out.println("click on camera button");
		}
	}
	
	public void clickOnPicture() {
		try {
			picture.click();
			System.out.println("clicked on picture");
		}catch (Exception e) {
			System.out.println("Not able to click on picture");
		}
	}

}
