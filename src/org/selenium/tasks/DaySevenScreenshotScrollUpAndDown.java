package org.selenium.tasks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DaySevenScreenshotScrollUpAndDown {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Question 1 (Done)
		
//		driver.get("http://www.greenstechnologys.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		System.out.println("Done");
//		File des = new File("C:\\Users\\SAI\\eclipse-workspace\\SeleniumTasks\\D7Q1GreensHomePage.png");
//		FileUtils.copyFile(src, des);
//		System.out.println("Done");
		
		
		// Question 2 (Done)
		
//		driver.get("http://toolsqa.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement src = driver.findElement(By.xpath("//a[@href='/articles']"));
//		js.executeScript("arguments[0].scrollIntoView(true)", src);
		
		
		// Question 3---------------------------------------------------------------task incomplete----doubt
		                                                           // where is selenium training benefit
//		driver.get("http://toolsqa.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// Question 4  (Done)
		
//		driver.get("http://www.greenstechnologys.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement down = driver.findElement(By.xpath("(//div[@class='trainer-info'])[6]"));
//		js.executeScript("arguments[0].scrollIntoView(true)", down);
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File des = new File("C:\\Users\\SAI\\eclipse-workspace\\SeleniumTasks\\D7Q4GreensPerumbakamAddress.png");
//		FileUtils.copyFile(src, des);
//		System.out.println("Done");
		
		
		// Question 5   (Done)
		
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement down = driver.findElement(By.id("heading2011"));
//		js.executeScript("arguments[0].scrollIntoView(true)", down);
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File des = new File("C:\\Users\\SAI\\eclipse-workspace\\SeleniumTasks\\D7Q5JobOpening.png");
//		FileUtils.copyFile(src, des);
//		System.out.println("Done");
//		WebElement up = driver.findElement(By.id("usdinr"));
//		js.executeScript("arguments[0].scrollIntoView(false)", up);
		
		
		// Question 6   (Done)
		
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement down = driver.findElement(By.className("clp-section"));
//		js.executeScript("arguments[0].scrollIntoView(true)", down);
//		System.out.println("Done");
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File des = new File("C:\\Users\\SAI\\eclipse-workspace\\SeleniumTasks\\D7Q6TopSeleniumTrendsIn20.png");
//		FileUtils.copyFile(src, des);
//		System.out.println("Done");
		
		
		// Question 7  (Done)--------------------------------------------------ElementClickInterceptedException
		                                                                    // so used JS to click
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement down = driver.findElement(By.id("heading20"));
//		js.executeScript("arguments[0].scrollIntoView(true)", down);
//		System.out.println("Done");
//		js.executeScript("arguments[0].click()", down);
//		System.out.println("Done");
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File des = new File("C:\\Users\\SAI\\eclipse-workspace\\SeleniumTasks\\D7Q7InterviewQusetions.png");
//		FileUtils.copyFile(src, des);
//		System.out.println("Done");
		
		
		// Question 8  (Done)--------------------------------------------------ElementClickInterceptedException
		                                                                   // so used JS to click
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement down = driver.findElement(By.id("heading302"));
//		js.executeScript("arguments[0].scrollIntoView(true)", down);
//		System.out.println("Done1");
//		js.executeScript("arguments[0].click()", down);
//		System.out.println("Done2");
//		Thread.sleep(2000);
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File des = new File("C:\\Users\\SAI\\eclipse-workspace\\SeleniumTasks\\D7Q8Corejava.png");
//		FileUtils.copyFile(src, des);
//		System.out.println("Done3");
		
		// Question 9   (Done)
		
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement search = driver.findElement(By.name("q"));
//		search.sendKeys("iphone");
//		WebElement searchbtn = driver.findElement(By.xpath("//button[@type='submit']"));
//		searchbtn.click();
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File des = new File("C:\\Users\\SAI\\eclipse-workspace\\SeleniumTasks\\D7Q9iphone.png");
//		FileUtils.copyFile(src, des);
//		System.out.println("Done");
		
		
		// Question 10   (Done)
		
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
//		search.sendKeys("motorola");
//		WebElement searchbtn = driver.findElement(By.id("nav-search-submit-button"));
//		searchbtn.click();
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File des = new File("C:\\Users\\SAI\\eclipse-workspace\\SeleniumTasks\\D7Q10Motorola.png");
//		FileUtils.copyFile(src, des);
//		System.out.println("Done");
		
		
		// Question 11  (Done)
		
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
//		Actions a = new Actions(driver);
//		a.moveToElement(fashion).perform();
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File des = new File("C:\\Users\\SAI\\eclipse-workspace\\SeleniumTasks\\D7Q11Fashion.png");
//		FileUtils.copyFile(src, des);
		
		// Question 12  (Done)
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement toys = driver.findElement(By.xpath("//span[text()='Beauty, Toys & More']"));
		Actions a = new Actions(driver);
		a.moveToElement(toys).perform();
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\SAI\\eclipse-workspace\\SeleniumTasks\\D7Q12Toys.png");
		FileUtils.copyFile(src, des);
		
		// Question 13   (Done)
		
//		driver.get("https://www.snapdeal.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement search = driver.findElement(By.id("inputValEnter"));
//		search.sendKeys("HP Laptop");
//		WebElement searchbtn = driver.findElement(By.className("searchTextSpan"));
//		searchbtn.click();
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File des = new File("C:\\Users\\SAI\\eclipse-workspace\\SeleniumTasks\\D7Q11HpLaptop.png");
//		FileUtils.copyFile(src, des);
//		System.out.println("Done");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
