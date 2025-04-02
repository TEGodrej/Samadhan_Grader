package GenericUtilities;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
 *@author DivyaPrakashAmar
 */
public class ScreenShot extends BaseClass{
	
	/**
	 *This method is use to take screenshot 
	 */
	public static void getScreenShot() {
		TakesScreenshot ss = (TakesScreenshot) staticdriver;
        File source = ss.getScreenshotAs(OutputType.FILE);

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String Screenshot = "ScreenShot_" + timestamp + ".jpg";
        File destination = new File(Screenshot);

        try {
            FileUtils.copyFile(source, destination);
            System.out.println("Screenshot saved to: " + Screenshot);
        } catch (IOException e) {
            System.out.println("Failed to take screenshot: " + e.getMessage());
            e.printStackTrace();
        }
	}
	
	/**
	 *This method is use to compare  screenshots 
	 */
    public static boolean compareImages(String image1Path, String image2Path) {
        try {
            // Load both images
            BufferedImage image1 = ImageIO.read(new File(image1Path));
            BufferedImage image2 = ImageIO.read(new File(image2Path));

            // Check if images have the same size
            if (image1.getWidth() != image2.getWidth() || image1.getHeight() != image2.getHeight()) {
                return false; // Images have different dimensions
            }

            // Compare each pixel in the two images
            for (int x = 0; x < image1.getWidth(); x++) {
                for (int y = 0; y < image1.getHeight(); y++) {
                    if (image1.getRGB(x, y) != image2.getRGB(x, y)) {
                        return false; // Pixel difference found
                    }
                }
            }

            return true; // No differences found
          
        } catch (IOException e) {
            System.out.println("Error comparing images: " + e.getMessage());
            e.printStackTrace();
            return false; // Return false if an error occurs
        }
    }
	
}
