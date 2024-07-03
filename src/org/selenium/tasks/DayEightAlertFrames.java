package org.selenium.tasks;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayEightAlertFrames {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		// Question 1    taught in class
		// Question 2          "
		// Question 3          "
		
		// Question 4   (Done)------------------------------------------------------------ mam doubt (webelement edukkala / frame edukkuthu)
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement a = driver.findElement(By.xpath("//frameset[@rows='*,30']"));
//		driver.switchTo().frame(a);
//		driver.switchTo().frame(0);
		WebElement conti = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		conti.click();	
		Alert a1 = driver.switchTo().alert();
//		a1.accept();
		
		
		// Question 5----------------------------------------------------------------------page not found
		
		
		// Question 6  (Done)
		
//		driver.get("https://retail.onlinesbi.sbi/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement login = driver.findElement(By.xpath("//span[text()='LOGIN']"));
//		login.click();
//		WebElement cont = driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']"));
//		cont.click();
//		WebElement innerlogin = driver.findElement(By.id("Button2"));
//		innerlogin.click();
//		Alert a2 = driver.switchTo().alert();
//		System.out.println(a2.getText());
//		a2.accept();
		
		
		// Question 7---------------------------------------------------------------NoSuchElementException (line 57)
		
//		driver.get("https://netbanking.hdfcbank.com/netbanking/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement user = driver.findElement(By.xpath("//input[@disabled='disabled']"));
//		user.sendKeys("surega");
//		WebElement cont = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
//		cont.click();
//		WebElement pw = driver.findElement(By.id("keyboard"));
//		pw.sendKeys("54321");
		
		
		// Question 8   (Done)
		
//		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
////		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
////		user.sendKeys("surega");
////		WebElement arrow = driver.findElement(By.xpath("(//img[@border='0'])[2]"));
////		arrow.click();
////		WebElement pw = driver.findElement(By.xpath("(//input[@type='password'])[4]"));
////		pw.sendKeys("54321");
//		WebElement login = driver.findElement(By.xpath("(//input[@type='Submit'])[1]"));                // not in task   // my own
//		JavascriptExecutor js =(JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()", login);
//		Alert a = driver.switchTo().alert();
//		a.accept();
		
		
		
		
		
		
	}

}
