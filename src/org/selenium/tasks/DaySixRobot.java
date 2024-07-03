package org.selenium.tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DaySixRobot {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Question 1 (Done)
		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement user = driver.findElement(By.id("email"));
//		user.sendKeys("email");
		Actions a = new Actions(driver);
//		a.doubleClick(user).perform();
//		a.contextClick(user).perform();
		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		WebElement pw = driver.findElement(By.id("pass"));
//		a.contextClick(pw).perform();
//		for(int i=0;i<=6;i++) {                                                   // -----------doubt
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//		}
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		// Question 2  (Done)
		
//		driver.get("https://www.google.co.in/webhp");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement google = driver.findElement(By.name("q"));
//		google.sendKeys("VelMurugan");
//		a.doubleClick(google).perform();
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_X);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_X);
		
		
		// Question 3  (Done)-------------------Exception thrown...so used JS
		
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement intques = driver.findElement(By.id("heading20"));
//		js.executeScript("arguments[0].scrollIntoView(true)", intques);
//		js.executeScript("arguments[0].click()", intques);
//		WebElement cts = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
//		a.contextClick(cts).perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		// Question 4-------------------------------------------------------didnt inspect but runs code fully
		
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement frame = driver.findElement(By.id("heading304"));
//		js.executeScript("arguments[0].scrollIntoView(true)", frame);
//		System.out.println("scroll down done");
//		a.contextClick(frame).perform();
//		System.out.println("right click done");
//		for(int i=0;i<15;i++) {
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//		}
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		System.out.println("done");
		
		
		// Question 5                -------------------------------------------doubt
//		
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement model = driver.findElement(By.id("heading201"));
//		model.click();
//		WebElement model4 = driver.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
//		a.contextClick(model4).perform();
//		Thread.sleep(2000);
//		for(int i=0;i<4;i++) {                                       //didnt show while running code
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//		}
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		System.out.println("done");
		
		
		// Question 6               ------------------------------------------------doubt
		
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement rpa = driver.findElement(By.xpath("//a[text()='RPA']"));       //didnt
//		js.executeScript("arguments[0].scrollIntoView(true)", rpa);
//		a.contextClick(rpa).perform();
//		for(int i=0;i<8;i++) {                                       
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//		}
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		System.out.println("done");
		
		
		// Question 7
		
		
		// Question 8----------------------------------------------------------------task incomplete 
		
//		driver.get(" https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement login = driver.findElement(By.xpath("//div[text()='Login']"));
//		js.executeScript("arguments[0].click()", login);
//		WebElement phn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		phn.sendKeys("email");                                                              //OTP
		
		
		// Question 9  (Done)
		
//		driver.get(" https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement login = driver.findElement(By.xpath("//div[text()='Login']"));
//		js.executeScript("arguments[0].click()", login);
//		WebElement phn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		phn.sendKeys("email");
//		a.contextClick(phn).perform();;
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		// Question 10----------------------------------------------------------page is not working
		
//		driver.get("https://www.snapdeal.com/offers/top_trending_deals");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// Question 11---------------------------------------------------------task incomplete
		
		driver.get(" https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement hdphn = driver.findElement(By.xpath("//div[text()='Best Truewireless Headphones']"));
		a.contextClick(hdphn).perform();
		for(int i=0;i<=3;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
