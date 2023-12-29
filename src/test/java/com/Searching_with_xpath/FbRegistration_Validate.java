package com.Searching_with_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbRegistration_Validate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\chromedriver-v119\\chromedriver.exe");
	    WebDriver chromedriver = new ChromeDriver();
	    chromedriver.navigate().to("https://www.facebook.com/r.php");
	    chromedriver.manage().window().maximize();	    
	    WebElement FirstName =  chromedriver.findElement(By.xpath("//input[@name=\"firstname\"]"));
	    FirstName.sendKeys("Koripriyan");
	    Thread.sleep(5000);
	    FirstName.clear();
	    Thread.sleep(5000);	    
	    FirstName.sendKeys("Koripriyan C");
	    chromedriver.findElement(By.xpath("//input[@name=\"lastname\"]")).click();    
	    System.out.println(FirstName.getText());
	    chromedriver.quit();
	}

}
