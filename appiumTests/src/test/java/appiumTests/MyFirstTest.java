package appiumTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class MyFirstTest {
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
		cap.setCapability("appPackage", "com.guru99app");
		cap.setCapability("appActivity", "com.guru99app.MainActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AppiumDriver<MobileElement>(url,cap);
		System.out.println("application started .....");
		
		
		MobileElement textField = driver.findElement(By.id("com.guru99app:id/edtText"));
		MobileElement button = driver.findElement(By.id("com.guru99app:id/btnShow"));
		MobileElement result = driver.findElement(By.id("com.guru99app:id/txtView"));
		
		textField.setValue("valeur de test");
		button.click();
		System.out.println(result.getText());
		
	}
}
