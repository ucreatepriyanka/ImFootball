package ucreate.com.ImFootball.Utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BrowserInstance {
	Logger logger = Logger.getLogger(BrowserInstance.class.getName());
 public static AppiumDriver<MobileElement> driver;
	@BeforeTest		
	public void Setup() throws MalformedURLException{
		DesiredCapabilities caps =new DesiredCapabilities();
		caps.setCapability("platformName","Android");
		caps.setCapability("platformVersion","5.0.2");
		caps.setCapability("deviceName","0123456789ABCDEF");//LGK53521d14829  //2291b4ea7d14 //98862742415158444b //MVPFGYF6KZPRNRLZ
		caps.setCapability("appPackage","com.imfootball");
		caps.setCapability("appActivity","com.imfootball.ui.activities.SplashActivity");				
	   driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);    
       logger.info("Launch I'm Football App");}
	}

