package ONEPAYTEST;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class EffectuerDon {
	
	static AppiumDriver<MobileElement> driver;
	
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
	    MobileElement login = (MobileElement) test.driver.findElementByXPath("//android.widget.EditText[1]");
	    login.setValue("TESTTEST");
	    MobileElement pass = (MobileElement) test.driver.findElementByXPath("//android.widget.EditText[2]");
	    pass.setValue("123456789");
	    MobileElement cnx = (MobileElement) test.driver.findElementByXPath("//android.widget.Button");
	    cnx.click();
	    MobileElement karamati = (MobileElement) test.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.ImageView[7]");
	    karamati.click();
	    MobileElement association = (MobileElement) test.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.ImageView[1]");
	    association.click();
	    MobileElement montant = (MobileElement) test.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	    montant.click();
	    
	    MobileElement quantite = (MobileElement) test.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
	    quantite.setValue("100");
	    MobileElement valid = (MobileElement) test.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText/android.widget.Button");

	    valid.click();
	    //test end
		
	}
}
