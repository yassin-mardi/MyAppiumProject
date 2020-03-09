package ONEPAYTEST;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class deconnexion {

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
	    MobileElement cnx = (MobileElement) test.driver.findElementByXPath("//android.widget.Button");
	    
	     cnx.click();
	     Thread.sleep(10000);
//        test.slide();	
          new TouchAction(test.driver).press(PointOption.point(560,1600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).moveTo(PointOption.point(560,700)).release().perform();
      
  
	     MobileElement Decnx = (MobileElement) test.driver.findElementByXPath("//android.widget.ImageView[@text='Déconnexion']");
	     Decnx.click();
	    MobileElement oui = (MobileElement) test.driver.findElementByXPath("//android.widget.Button[2]");
	    oui.click();
//      test end
	}
}
