package appiumTests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.MobileCapabilityType;


public class AppScannerTest {

	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
	
		try {
			openApp();
			
		}catch(Exception exp){
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
			
			
		}
		// TODO Auto-generated method stub

	}


	public static void openApp() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("udid", "2b81be409805");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.example.c");
		cap.setCapability("appActivity", "com.example.c.MainActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AppiumDriver<MobileElement>(url,cap);
		System.out.println("test application started .....");
		
		
		MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Add Image");
		el1.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")));

		MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
		
	// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
        el2.click();
	MobileElement el3 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
	el3.click();
//    MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]");
//    el4.click();
//		MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Photo taken on 1 Feb 2020 10:38:20");
//		el5.click();
//		MobileElement el6 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
//		el6.click();
//		MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[4]");
//		el7.click();
//		MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]");
//		el8.click();
//		MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("Photo taken on 1 Feb 2020 10:38:20");
//		el9.click();
//		  
//		
//		TouchActions action = new TouchActions(driver);
//		action.down(515, 400);
//		action.move(50, 50);
//		action.release();
//		action.perform();
//
//		TouchActions action2 = new TouchActions(driver);
//		action2.up(529, 1815);
//		action2.move(538, 1576);
//		action2.release();
//		action2.perform();
//
//		  
//	
//		MobileElement el10 = (MobileElement) driver.findElementById("com.example.c:id/crop_image_menu_crop");
//		el10.click();
//
//		  
		  

		
		
	}
}
