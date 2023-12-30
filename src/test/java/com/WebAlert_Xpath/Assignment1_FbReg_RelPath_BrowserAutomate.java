package com.WebAlert_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.utility.Library;

public class Assignment1_FbReg_RelPath_BrowserAutomate extends Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			System.setProperty("webdriver.gecko.driver",
			"D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\firefoxdriver-v33\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.navigate().to("https://www.facebook.com/r.php");
			driver.manage().window().maximize();
			WebElement Firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
			WebElement Lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
			WebElement MobileNumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
			WebElement Password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));			
			WebElement BirthdayDropdown = driver.findElement(By.xpath("//select[@name='birthday_day']"));
			WebElement BirthMonthDropdown = driver.findElement(By.xpath("//select[@name='birthday_month']"));
			WebElement BirthYearDropdown = driver.findElement(By.xpath("//select[@name='birthday_year']"));
			Firstname.sendKeys("Koripriyan");
			Lastname.sendKeys("Chokkalingam");
			MobileNumber.sendKeys("8778338216");
			Password.sendKeys("123");
			BirthdayDropdown.click();
			Select DaySelect = new Select(BirthdayDropdown);
			DaySelect.selectByValue("5");
			BirthMonthDropdown.click();
			Select MonthSelect = new Select(BirthMonthDropdown);
			MonthSelect.selectByVisibleText("Apr");
			BirthYearDropdown.click();
			Select YearSelect = new Select(BirthYearDropdown);
			YearSelect.selectByVisibleText("1993");			
			Thread.sleep(5000);
		    driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();				
			
            
			

			System.setProperty("webdriver.chrome.driver",
					"D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\chromedriver-v119\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("https://www.facebook.com/r.php");
			driver.manage().window().maximize();
			WebElement Firstname2 = driver.findElement(By.xpath("//input[@name='firstname']"));
			WebElement Lastname2 = driver.findElement(By.xpath("//input[@name='lastname']"));
			WebElement MobileNumber2 = driver.findElement(By.xpath("//input[@name='reg_email__']"));
			WebElement Password2 = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));			
			WebElement BirthdayDropdown2 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
			WebElement BirthMonthDropdown2 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
			WebElement BirthYearDropdown2 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
			Firstname2.sendKeys("Koripriyan");
			Lastname2.sendKeys("Chokkalingam");
			MobileNumber2.sendKeys("8778338216");
			Password2.sendKeys("123");
			BirthdayDropdown2.click();
			Select DaySelect2 = new Select(BirthdayDropdown2);
			DaySelect2.selectByValue("5");
			BirthMonthDropdown2.click();
			Select MonthSelect2 = new Select(BirthMonthDropdown2);
			MonthSelect2.selectByVisibleText("Apr");
			BirthYearDropdown2.click();
			Select YearSelect2 = new Select(BirthYearDropdown2);
			YearSelect2.selectByVisibleText("1993");			
			Thread.sleep(5000);
		    driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();	

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
