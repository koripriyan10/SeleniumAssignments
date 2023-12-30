package com.WebAlert_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.Library;

public class Assignment2_FbLogin_RelPath_BrowserAutomate extends Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			System.setProperty("webdriver.gecko.driver",
			"D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\firefoxdriver-v33\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.navigate().to("https://www.facebook.com");
			driver.manage().window().maximize();
			WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
			WebElement Pass = driver.findElement(By.xpath("//input[@name='pass']"));
			Email.sendKeys("koripriyan07@gmail.com");
			Pass.sendKeys("123");
			Thread.sleep(2000);
			Email.clear();
			Pass.clear();

			System.setProperty("webdriver.chrome.driver",
					"D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\chromedriver-v119\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("https://www.facebook.com");
			driver.manage().window().maximize();
			WebElement Email2 = driver.findElement(By.xpath("//input[@name='email']"));
			WebElement Pass2 = driver.findElement(By.xpath("//input[@name='pass']"));
			Email2.sendKeys("koripriyan07@gmail.com");
			Pass2.sendKeys("123");
			Thread.sleep(2000);
			Email2.clear();
			Pass2.clear();

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
