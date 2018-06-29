package Package;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Webdriverdemo {

	public static void main(String[] args) {

//		System.setProperty("webdriver.gecko.driver","C:\\Users\\ashishsapehia\\Desktop\\Automation\\geckodriver-v0.9.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		DesiredCapabilities dc = new DesiredCapabilities();

		FirefoxProfile firefoxProfile = new FirefoxProfile();
		ProfilesIni profile = new ProfilesIni();
		firefoxProfile = profile.getProfile("default");
		dc.setCapability(FirefoxDriver.PROFILE, firefoxProfile);
		dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		FirefoxDriver driver=new FirefoxDriver(dc);
		
		
		//System.out.println("path of chromeDriver -> " + driverpath);
//		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashishsapehia\\Desktop\\Automation\\chromedriver.exe");
//		  
//
//		  HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
//		  chromePrefs.put("profile.default_content_settings.popups", 0);
//		  //chromePrefs.put("download.default_directory", downloadFilepath);
//		  ChromeOptions options = new ChromeOptions();
//		  options.setExperimentalOption("prefs", chromePrefs);
//		  //////////////////////
//		  options.addArguments("--disable-extensions");
//		  DesiredCapabilities cap = DesiredCapabilities.chrome();
//		  cap.setCapability(ChromeOptions.CAPABILITY, options);
//		  ChromeDriver driver= new ChromeDriver(cap);
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\ashishsapehia\\Desktop\\Automation\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
        //WebDriver driver = new InternetExplorerDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Lauch website
		driver.get("http://www.calculator.net");
		
		// Maximize the browser
		driver.manage().window().maximize();
			
	}

}
