package org.selenium.tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DayTenWindowsHandling {
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		
		// Question 1
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone X",Keys.ENTER);
		System.out.println("search Done");
		WebElement firstPhn = driver.findElement(By.xpath("//div[@data-cy='title-recipe']"));
		System.out.println("first phn locating Done");
		Actions a = new Actions(driver);
		a.contextClick(firstPhn).perform();
		System.out.println("right click Done");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		System.out.println("Done");
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		System.out.println("Done");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Done");
		
		
		// Question 2
		
//		driver.get("https://www.amazon.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement search = driver.findElement(By.className("overlap"));
//		search.sendKeys("iphone 7",Keys.ENTER);
//		System.out.println("iphone 7 Done");
//		WebElement firstPhn = driver.findElement(By.id("6917529693012357581"));
//		firstPhn.click();
//		System.out.println("first phone click Done");
//		String parentId1 = driver.getWindowHandle();
//		System.out.println("Parent Id is "+parentId1);
//		Set<String> allIds1 = driver.getWindowHandles();                    
//		System.out.println("Overall Ids are "+allIds1);
//		List<String> li = new LinkedList<>();
//		li.addAll(allIds1);                            
//		driver.switchTo().window(li.get(1));
//		System.out.println("window switch Done");
//		driver.findElement(By.)
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
