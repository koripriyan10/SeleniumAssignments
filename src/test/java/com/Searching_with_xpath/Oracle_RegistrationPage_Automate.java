package com.Searching_with_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Oracle_RegistrationPage_Automate {

	public static WebDriver chromedriver;
	public static WebDriver firefoxdriver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		try {
			
			//Automating Oracle registration page in Chrome Browser
			
			System.setProperty("webdriver.chrome.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\chromedriver-v119\\chromedriver.exe");
			chromedriver = new ChromeDriver();
			chromedriver.navigate().to("https://profile.oracle.com/myprofile/account/create-account.jspx");
			chromedriver.manage().window().maximize();
			Thread.sleep(5000);
			chromedriver.findElement(By.xpath("//input[@id='sView1:r1:0:email::content']")).sendKeys("koripriyan@gmail.com");
			chromedriver.findElement(By.xpath("//input[@id='sView1:r1:0:password::content']")).sendKeys("CATkori$56");
			Thread.sleep(3000);
			chromedriver.findElement(By.xpath("//input[@id='sView1:r1:0:retypePassword::content']")).sendKeys("CATkori$56");
			chromedriver.findElement(By.xpath("//select[@id='sView1:r1:0:country::content']")).click();
			WebElement SelectCountry = chromedriver.findElement(By.xpath("//select[@id='sView1:r1:0:country::content']"));
			Select objChromeSelectCountry = new Select(SelectCountry);
			objChromeSelectCountry.selectByVisibleText("China");
			chromedriver.findElement(By.xpath("//select[@id='sView1:r1:0:country::content']")).click();
			Thread.sleep(5000);
			
	
			
			Thread.sleep(5000);

		}

		catch (StaleElementReferenceException e) 
		{
			chromedriver.findElement(By.xpath("//input[@name='sView1:r1:0:localFirstName']")).sendKeys("Koripriyan");
			chromedriver.findElement(By.xpath("//input[@name='sView1:r1:0:lastName']")).sendKeys("Chokkalingam");
			chromedriver.findElement(By.xpath("//input[@name='sView1:r1:0:jobTitle']")).sendKeys("Associate");
			chromedriver.findElement(By.xpath("//input[@name='sView1:r1:0:workPhone']")).sendKeys("9003670280");
			chromedriver.findElement(By.xpath("//input[@name='sView1:r1:0:companyName']")).sendKeys("ABC");
			chromedriver.findElement(By.xpath("//input[@name=\"sView1:r1:0:address1\"]")).sendKeys("No.23 Venice street");
			chromedriver.findElement(By.xpath("//input[@name='sView1:r1:0:city']")).sendKeys("Chennai");
			WebElement selState = chromedriver.findElement(By.xpath("//select[@id=\"sView1:r1:0:state::content\"]"));
			Select ElemStat = new Select(selState);
			ElemStat.selectByVisibleText("Henan");
			chromedriver.findElement(By.xpath("//input[@id='sView1:r1:0:postalCode::content']")).sendKeys("620019");
			
			//Automating oracle registration page dropdowns in Firefox
			System.setProperty("webdriver.gecko.driver","D:\\JavaWorkSpace\\SeleniumAssignments\\src\\test\\resources\\firefoxdriver-v33\\geckodriver.exe");
			firefoxdriver = new FirefoxDriver();
			firefoxdriver.navigate().to("https://profile.oracle.com/myprofile/account/create-account.jspx");
			firefoxdriver.manage().window().maximize();
			Thread.sleep(5000);

			
			firefoxdriver.findElement(By.xpath("//select[@id='sView1:r1:0:country::content']")).click();
			WebElement SelectFirefoxCountry = firefoxdriver.findElement(By.xpath("//select[@id='sView1:r1:0:country::content']"));
			Select objFirefoxSelectCountry = new Select(SelectFirefoxCountry);
			objFirefoxSelectCountry.selectByVisibleText("China");

			Thread.sleep(5000);
			firefoxdriver.findElement(By.xpath("//select[@id='sView1:r1:0:state::content']")).click();
			WebElement selFirefoxState = firefoxdriver.findElement(By.xpath("//select[@id='sView1:r1:0:state::content']"));
			Select ElemFirefoxStat = new Select(selFirefoxState);
			ElemFirefoxStat.selectByVisibleText("Henan");
            
		}

	}

}
