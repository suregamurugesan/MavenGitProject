package org.selenium.tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayTwelveJavascript {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Question 1--------------------------------------------------------------doubt
		
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement down = driver.findElement(By.xpath("(//font[@size='-1'])[15]"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		System.out.println("Scroll down Done");
//		Object es = js.executeScript("arguments[0].getAttribute('value')", down);
//		String st = es.toString();
//		System.out.println(st);                                                        // null pointer exception
		String st2 = down.getText();
		System.out.println(st2);
		
		
		// Question 2  (Done)
		
//		driver.get("http://toolsqa.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    WebElement down = driver.findElement(By.className("profile-type"));
//		js.executeScript("arguments[0].scrollIntoView(true)", down);
//		System.out.println("Scroll down Done");
//		WebElement up = driver.findElement(By.xpath("//a[text()='Latest Articles']"));
//		js.executeScript("arguments[0].scrollIntoView(false)", up);
//		System.out.println("Scroll up Done");
		
		
		// Question 3  (Done)
		
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement down = driver.findElement(By.id("heading304"));
//		js.executeScript("arguments[0].scrollIntoView(true)", down);
//		System.out.println("Scroll up Done");
		
		
		// Question 4  (Done)
		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement user = driver.findElement(By.id("email"));                         
//		js.executeScript("arguments[0].setAttribute('value','surega')", user);
//		WebElement pw = driver.findElement(By.id("pass"));
//		js.executeScript("arguments[1].setAttribute('value','54321')", user, pw);
//		WebElement loginbtn = driver.findElement(By.name("login"));
//		js.executeScript("arguments[0].click()", loginbtn);
		
		
		// Question 5  (Done)
		
//		driver.get("http://adactinhotelapp.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement user = driver.findElement(By.id("username"));
//		js.executeScript("arguments[0].setAttribute('value','surega')", user);
//		Thread.sleep(2000);
//		WebElement pw = driver.findElement(By.id("password"));
//		js.executeScript("arguments[1].setAttribute('value','54321')", user,pw);
//		WebElement loginbtn = driver.findElement(By.id("login"));
//		js.executeScript("arguments[0].click()", loginbtn);
		
		
		// Question 6  (Done)
		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement user = driver.findElement(By.id("email"));
//		js.executeScript("arguments[0].setAttribute('value','surega@gmail.com')", user);
//		WebElement pw = driver.findElement(By.id("pass"));
//		js.executeScript("arguments[1].setAttribute('value','54321')", user, pw);
//		Object es1 = js.executeScript("return arguments[0].getAttribute('value')", user);
//		System.out.println("user name is "+es1);
//		Object es2 = js.executeScript("return arguments[1].getAttribute('value')", user,pw);
//		System.out.println("password is "+es2);
//		WebElement loginbtn = driver.findElement(By.name("login"));
//		js.executeScript("arguments[0].click()", loginbtn);
		
		
		
		
		
		
	}

}
