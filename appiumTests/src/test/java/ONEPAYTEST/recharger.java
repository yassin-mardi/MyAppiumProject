package ONEPAYTEST;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileElement;
import ONEPAYTEST.preparation;


public class recharger  {
	
	
	
	
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

	public static void openApp() throws MalformedURLException ,InterruptedException {
		//preparation of driver
	    preparation test = new preparation();
	    test.settingCapabilitiesRedmi();
	    test.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
    	//test start
		Thread.sleep(3000);
	    MobileElement el1 = (MobileElement) test.driver.findElementByXPath("//android.widget.Button[2]");
	    el1.click();
	    MobileElement login = (MobileElement) test.driver.findElementByXPath("//android.widget.EditText[1]");
	    login.setValue("TESTTEST");
	    MobileElement pass = (MobileElement) test.driver.findElementByXPath("//android.widget.EditText[2]");
	    pass.setValue("123456789");
	    MobileElement cnx = (MobileElement) test.driver.findElementByXPath("//android.widget.Button");
	    cnx.click();
	    MobileElement ta3bi2a = (MobileElement) test.driver.findElementByXPath("//android.widget.ImageView[@text='Ta3bi2a']");
	    ta3bi2a.click();
	    MobileElement operateur = (MobileElement) test.driver.findElementByXPath("//android.widget.ImageView[@text='Inwi']");
	    operateur.click();
	    MobileElement montant = (MobileElement) test.driver.findElementByXPath("//android.view.View[3]");
	    montant.click();

	    //test end
	}
}
