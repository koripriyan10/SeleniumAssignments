package com.WebAlert_Xpath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.Library;

public class Assignment4_Jquery_AlertAutomate extends Library {
	static Alert objectAlert;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		System.setProperty("webdriver.gecko.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\firefoxdriver-v33\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.com");
		driver.navigate().to("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");		
	    driver.findElement(By.xpath("//button[contains(text(),'Click here to show confirm alert')]")).click();
	    objectAlert = driver.switchTo().alert();
	    objectAlert.accept();
	    Thread.sleep(3000);
	    String AlertText =  objectAlert.getText();
	    System.out.println("AlertText:"+AlertText);
	    objectAlert.accept();
	    Thread.sleep(3000);
	    driver.quit();
	}

}
