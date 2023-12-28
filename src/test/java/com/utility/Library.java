package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Library {
	public static WebDriver driver;
	public static Properties objProperties;
	public static HashMap<String, String> hmap = new HashMap<String, String>();
	
	public static void ReadPropertiesFile() {
		File objFile = new File(System.getProperty("user.dir") + "//src//test//resources//Config.Properties");
		FileInputStream ObjInputStream;
		try {
			ObjInputStream = new FileInputStream(objFile);
			objProperties = new Properties();
			// objProperties.lo
			objProperties.load(ObjInputStream);
			//System.out.println(objProperties.getProperty("browser"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void LaunchBrowser() {
		String browserFromPropertiesFile = objProperties.getProperty("browser");
		switch (browserFromPropertiesFile) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\firefoxdriver-v33\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\IEDriver-4.14.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
			
		case "chrome":		     
		     System.setProperty("webdriver.chrome.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\chromedriver-v119\\chromedriver.exe");
		     driver = new ChromeDriver();
		      
			// driver = new ChromeDriver();
			ChromeOptions objChromeOptions = new ChromeOptions();
			Map<String, Object> chromePreferences = new HashMap<String, Object>();
			chromePreferences.put("download.default_directory", System.getProperty("user.dir"));
			objChromeOptions.setExperimentalOption("prefs", chromePreferences);
			break;
		}

		driver.manage().window().maximize();
		// Implicit Wait : Global waiting mechanism applicable for all webElements in a
		// web page //All Pages
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public static WebDriver getBrowserCapabilities(String Browser)
	{
		DesiredCapabilities capabilities = null;
		
		if(Browser == null || Browser.equalsIgnoreCase("CHROME"))
		{
			capabilities = DesiredCapabilities.chrome();
			ChromeOptions options = new  ChromeOptions();
			capabilities.merge(options);
		}
		
		if(Browser == null || Browser.equalsIgnoreCase("FIREFOX"))
		{
			capabilities = DesiredCapabilities.firefox();
			FirefoxOptions options = new  FirefoxOptions();
			capabilities.merge(options);
		}
		
		try
		{
			driver = new RemoteWebDriver(new URL("http://localhost:4444"),capabilities);	
		}
		
		catch(MalformedURLException e)
		{
			e.printStackTrace();
		}
		
		return driver;
	}

	public static void PageLoadTimeOut() {
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
}
