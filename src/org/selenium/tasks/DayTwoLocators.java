package org.selenium.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayTwoLocators {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//Question 1 (Done)
		
//		driver.get("https://www.facebook.com/");
//		WebElement user = driver.findElement(By.id("email"));
//		user.sendKeys("surega");
//		WebElement pw = driver.findElement(By.id("pass"));
//		pw.sendKeys("54321");
		
		
		//Question 2 (Done)
		
//		driver.get("https://www.redbus.in/");
//		WebElement from = driver.findElement(By.id("src"));
//		from.sendKeys("kumbakonam");
//		WebElement to = driver.findElement(By.id("dest"));
//		to.sendKeys("chennai");
		
		
		//Question 3 (Done)
		
//		driver.get("https://www.google.com/");
//		WebElement search = driver.findElement(By.id("APjFqb"));
//		search.sendKeys("GreensTechnology");
		
		
		//Question 4-------------------------------------------------------------ElementNotInteractableException (????)
		
//		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
//		WebElement user = driver.findElement(By.id("HDisplayDefault.Rb14"));
//		user.sendKeys("surega");
//		WebElement arrow = driver.findElement(By.id("user-id-goahead"));
//		arrow.click();
//		WebElement pw = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
//		pw.sendKeys("54321");
		
		
		//Question 5 (Done)
		
//		driver.get("https://netbanking.hdfcbank.com/");
//		WebElement cusid = driver.findElement(By.xpath("//input[@type='text']"));
//		cusid.sendKeys("surega");
		
		
        //Question 6--------------------------------------------------------------NoSuchElementException (????)
		
//		driver.get("https://www.swiggy.com/");
//		WebElement others = driver.findElement(By.className("overlay-enabled"));
//		others.click();
//		WebElement loca = driver.findElement(By.xpath("//input[@type='text']"));
//		loca.sendKeys("mylapore");
		
		
		//Question 7 (Done)
		
		driver.get("https://www.snapdeal.com/login");
		WebElement txtuser = driver.findElement(By.id("userName"));
		txtuser.sendKeys("8789704657");
		
		//Question 8---------------------------------------------------------------ElementClickInterceptedException 
		                                                                         //click didnt work //so use JS
//		driver.get("https://www.instagram.com/");
//		WebElement user = driver.findElement(By.name("username"));
//		user.sendKeys("surega_murugesan");
//		WebElement pw = driver.findElement(By.name("password"));
//		pw.sendKeys("54321");
//		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
//		login.click();
		
		
		//Question 9--------------------------------------------------------------ElementNotInteractableException
		                                                                         //not filling from language
		                                                                         //coz we have to scroll down
//		driver.get("http://demo.automationtesting.in/Register.html");
//		WebElement first = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//		first.sendKeys("surega");
//		WebElement last = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		first.sendKeys("murugesan");
//		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
//		address.sendKeys("CID quaters, Mylapore");
//		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
//		email.sendKeys("sur@gmail.com");
//		WebElement phn = driver.findElement(By.xpath("//input[@type='tel']"));
//		phn.sendKeys("9876543210");
//		WebElement lang = driver.findElement(By.id("msdd"));
//		lang.sendKeys("Tamil");
//		WebElement pw1 = driver.findElement(By.id("firstpassword"));
//		pw1.sendKeys("surpari");
//		WebElement pw2 = driver.findElement(By.id("secondpassword"));
//		pw2.sendKeys("surpari");
		
		
		//Question 10 (Done)
		
//		driver.get("http://adactinhotelapp.com/");
//		WebElement user = driver.findElement(By.id("username"));
//		user.sendKeys("surega");
//		WebElement pw = driver.findElement(By.id("password"));
//		pw.sendKeys("54321");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
