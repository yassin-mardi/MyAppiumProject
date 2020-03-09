package ONEPAYTEST;


import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class partageSolde {
	
	
	
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
	    preparation test = new preparation();
	    test.settingCapabilitiesRedmi();
	    test.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
	   //test start
	    test.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    MobileElement el1 = (MobileElement) test.driver.findElementByXPath("//android.widget.Button[2]");
	    el1.click();
	    MobileElement login = (MobileElement) test.driver.findElementByXPath("//android.widget.EditText[1]");
	    login.setValue("TESTTEST");
	    MobileElement pass = (MobileElement) test.driver.findElementByXPath("//android.widget.EditText[2]");
	    pass.setValue("123456789");
	    MobileElement cnx = (MobileElement) tesst.driver.findElementByXPath("//android.widget.Button");
	    
	     cnx.click();
	     Thread.sleep(15000);
          new TouchAction(test.driver).press(PointOption.point(560,1600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).moveTo(PointOption.point(560,700)).release().perform();
      
//        test.slide();	  
	     MobileElement partageSolde = (MobileElement) test.driver.findElementByXPath("//android.widget.ImageView[@text='Partage Solde']");
	     partageSolde.click();
	     MobileElement telephone = (MobileElement) test.driver.findElementByXPath("//android.widget.EditText");
	     telephone.setValue("0690660931");
	     MobileElement valider = (MobileElement) test.driver.findElementByXPath("//android.widget.Button[@text='Valider']");
	     valider.click();
	     Thread.sleep(4000);
	     MobileElement montant = (MobileElement) test.driver.findElementByXPath("//android.widget.EditText");
	    String text = montant.getText();
	    int length = text.length();
	    for (int i = 0; i < length-1; i++) {
			montant.clear();
		}
//	    Point pont = montant.getLocation();
//      TouchAction action = new TouchAction(test.driver); 
//      action.longPress(PointOption.point(pont));
//      action.perform();
         
	    MobileElement montant2 = (MobileElement) test.driver.findElementByXPath("//android.widget.EditText");
	    test.driver.hideKeyboard(); 
	     montant2.setValue("0005");
	     MobileElement confirmer = (MobileElement) test.driver.findElementByXPath("//android.widget.Button[@text='Confirmer']");
	     confirmer.click();
	     Thread.sleep(2000);
	     MobileElement fermer = (MobileElement) test.driver.findElementByXPath("//android.widget.Button[@text='Fermer']");
	     fermer.click();

	   
//test end
	}
}
