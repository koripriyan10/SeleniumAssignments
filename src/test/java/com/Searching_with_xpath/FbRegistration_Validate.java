package com.Searching_with_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbRegistration_Validate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\chromedriver-v119\\chromedriver.exe");
	    WebDriver chromedriver = new ChromeDriver();
	    chromedriver.navigate().to("https://www.facebook.com");
	    chromedriver.manage().window().maximize();	    
	    chromedriver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
	}

}
