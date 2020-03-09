package ONEPAYTEST;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileElement;


public class authentification {
	
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

	public static void openApp() throws MalformedURLException {
	
		//preparation of driver
	    preparation test = new preparation();
	    test.settingCapabilitiesRedmi();
	    test.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    //test start
	    test.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    MobileElement el1 = (MobileElement) test.driver.findElementByXPath("//android.widget.Button[2]");
	    el1.click();
	    MobileElement el2 = (MobileElement) test.driver.findElementByXPath("//android.widget.EditText[1]");
	    
	    MobileElement el3 = (MobileElement) test.driver.findElementByXPath("//android.widget.EditText[2]");
	    
	    MobileElement el4 = (MobileElement) test.driver.findElementByXPath("//android.widget.Button");
	    
         try {
        	el2.setValue("TESTTEST");
        	el3.setValue("123456789");
        	el4.click();
            }catch (Exception e) {
			
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			
		}
        
       
  //test end
		
		
	}
}
