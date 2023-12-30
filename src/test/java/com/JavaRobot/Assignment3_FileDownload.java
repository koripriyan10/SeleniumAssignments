package com.JavaRobot;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.Library;

public class Assignment3_FileDownload extends Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","D:\\JavaWorkSpace\\Selenium_LiveCourse_2204101110\\src\\test\\resources\\firefoxdriver-v33\\geckodriver.exe");
		FirefoxOptions objFireFoxOptions = new FirefoxOptions();
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.dir", "C:\\Users\\Dell\\Downloads");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/x-gzip");
		objFireFoxOptions.setProfile(profile);
		
		driver = new FirefoxDriver(objFireFoxOptions);
		driver.get("https://launchpad.net/sikuli");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@title='SikuliX IDE for all systems']")).click();
		

		
	}

}
