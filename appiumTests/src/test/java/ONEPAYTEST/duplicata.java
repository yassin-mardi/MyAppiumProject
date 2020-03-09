package ONEPAYTEST;


import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileElement;


public class duplicata {
	
	
	
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
	    Thread.sleep(5000);
        test.slide();	  
	     MobileElement duplicata = (MobileElement) test.driver.findElementByXPath("//android.widget.ImageView[@text='Duplicata']");
	    duplicata.click();
	    MobileElement data = (MobileElement) test.driver.findElementByXPath("//android.view.View[@index=2]");
	    data.click();
	    
//test end
	}
}
