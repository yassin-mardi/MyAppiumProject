package ONEPAYTEST;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class preparation {
	public static AppiumDriver<MobileElement> driver;
	
	public void settingCapabilitiesRedmi() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("udid", "2b81be409805");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appPackage", "com.one1pay.sispay");
		cap.setCapability("appActivity", "com.example.flutterqrscan.MainActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		this.driver=new AppiumDriver<MobileElement>(url,cap);
		System.out.println("application started .....");


	}
	public  void settingCapabilitiesTPE() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "QCOM-BTD");
		cap.setCapability("udid", "0123456789ABCDEF");
		cap.setCapability("platformVersion", "5.1.1");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appPackage", "com.one1pay.sispay");
		cap.setCapability("appActivity", "com.example.flutterqrscan.MainActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		this.driver=new AppiumDriver<MobileElement>(url,cap);
		System.out.println("application started .....");


	}
	
	public void slide() {
		
	     new TouchAction(this.driver).press(PointOption.point(560,1600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).moveTo(PointOption.point(560,700)).release().perform();

	}

}
