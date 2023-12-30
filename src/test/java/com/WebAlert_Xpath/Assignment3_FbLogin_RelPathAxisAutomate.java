package com.WebAlert_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.Library;

public class Assignment3_FbLogin_RelPathAxisAutomate extends Library {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		try
		{
			
		System.setProperty("webdriver.gecko.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\firefoxdriver-v33\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		String FbSrcText1 = driver.findElement(By.xpath("//h2[@class='_8eso']/preceding::div/img")).getAttribute("src");
		System.out.println(FbSrcText1);
		
		
     	 System.setProperty("webdriver.chrome.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\chromedriver-v119\\chromedriver.exe");
	     driver = new ChromeDriver();
		 driver.navigate().to("https://www.facebook.com");
		 driver.manage().window().maximize();
		 driver.manage().window().maximize();
		 String FbSrcText2 = driver.findElement(By.xpath("//h2[@class='_8eso']/preceding::div/img")).getAttribute("src");
		 System.out.println(FbSrcText2);
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
