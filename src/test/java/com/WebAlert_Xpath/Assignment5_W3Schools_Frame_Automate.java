package com.WebAlert_Xpath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.Library;

public class Assignment5_W3Schools_Frame_Automate extends Library {
    static Alert objectAlert;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ReadPropertiesFile();
		System.setProperty("webdriver.gecko.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\firefoxdriver-v33\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button[contains(text(),'Try it')]")).click();
		objectAlert =  driver.switchTo().alert();
		objectAlert.sendKeys("Hi w3Schools");
		objectAlert.accept();
	    String text = 	driver.findElement(By.xpath("/html/body/p[@id='demo']")).getText();
		System.out.println("W3Schools Printed text -"+text);
		
	}

}
