package org.selenium.tasks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DayNineDropDown {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Question 1--------------------------------------------------------------------doubt (not under select tag) //task incomplete
		
//		driver.get("http://demoqa.com/automation-practice-form/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement state = driver.findElement(By.id("state"));
//		js.executeScript("arguments[0].scrollIntoView(true)", state);
//		js.executeScript("arguments[0].setAttribute('value','Uttar Pradesh')", state);
		
//		WebElement city = driver.findElement(By.id("city"));
//		Select s2=new Select(city);
//		Thread.sleep(2000);
//		s2.selectByIndex(1);
//		Thread.sleep(2000);
//		s1.selectByIndex(3);
//		Thread.sleep(2000);
//		s2.selectByIndex(1);
		
		
		// Question 3  (Done)
		
//		System.out.println("------------Year dropdown in FB------------");
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement create = driver.findElement(By.xpath("//a[text()='Create new account']"));
//		create.click();
//		WebElement year = driver.findElement(By.id("year"));
//		Select s = new Select(year);
//		List<WebElement> op = s.getOptions();
//		for(int i=0;i<op.size();i++) {
//			WebElement w = op.get(i);
//			System.out.println(w.getAttribute("value"));
//		}

		
		
		// Question 4  (Done)
		
//		System.out.println("------------Month dropdown in FB------------");
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement create = driver.findElement(By.xpath("//a[text()='Create new account']"));
//		create.click();
//		WebElement month = driver.findElement(By.id("month"));
//		Select s = new Select(month);
//		List<WebElement> op = s.getOptions();
//		for(int i=0;i<op.size();i++) {
//			WebElement w = op.get(i);
//			System.out.println(w.getText());
//		}
		
		
		// Question 5-------------------------------------------------------------task incomplete (how to print even dates)
		
//		System.out.println("------------Date dropdown in FB------------");
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement create = driver.findElement(By.xpath("//a[text()='Create new account']"));
//		create.click();
//		WebElement day = driver.findElement(By.id("day"));
//		Select s = new Select(day);
//		List<WebElement> op = s.getOptions();
		
		
		// Question 6  (Done)
		
//		System.out.println("------------country dropdown------------");
//		driver.get("https://demo.guru99.com/test/newtours/register.php");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement country = driver.findElement(By.name("country"));
//		Select s = new Select(country);
//		List<WebElement> op = s.getOptions();
//		for(int i=0;i<op.size();i++) {
//			WebElement w = op.get(i);
//			System.out.println(w.getText());
//		}
		
		
		// Question 7  (Done)
		
		System.out.println("------------country dropdown------------");
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement country = driver.findElement(By.name("country"));
		Select s = new Select(country);
		List<WebElement> op = s.getOptions();
		for(int i=0;i<op.size();i++) {
			WebElement w = op.get(i);
			System.out.println(w.getAttribute("value"));
		}
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
