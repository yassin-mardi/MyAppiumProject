package ONEPAYTEST;

import java.awt.RenderingHints.Key;
 import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.*;
import io.appium.java_client.touch.ActionOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;



public class Tajir {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			openApp();
			
		}catch(Exception exp){
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
			
			
		}
		// TODO Auto-generated method stub

	}

	
	public static void openApp() throws MalformedURLException, InterruptedException {
		//preparation of driver
	    preparation driver = new preparation();
	    driver.settingCapabilitiesRedmi();
		driver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//test start
	    MobileElement el1 = (MobileElement) driver.driver.findElementByXPath("//android.widget.Button[2]");
	    el1.click();
	    MobileElement login = (MobileElement) driver.driver.findElementByXPath("//android.widget.EditText[1]");
	    login.setValue("TESTTEST");
	    MobileElement pass = (MobileElement) driver.driver.findElementByXPath("//android.widget.EditText[2]");
	    pass.setValue("123456789");
	    MobileElement cnx = (MobileElement) driver.driver.findElementByXPath("//android.widget.Button");
	    cnx.click();
	    //app sleep
	    Thread.sleep(5000);
	    //test case continue
        new TouchAction(driver.driver).press(PointOption.point(560,1600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).moveTo(PointOption.point(560,700)).release().perform();
	    System.out.println("slided");
        MobileElement Tajir = (MobileElement) driver.driver.findElementByXPath("//android.widget.ImageView[@text='Tajir']");
        Tajir.click();
     
       //test end
	   
		
	}

 
	
}
