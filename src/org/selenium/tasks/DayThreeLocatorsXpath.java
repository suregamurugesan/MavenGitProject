package org.selenium.tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayThreeLocatorsXpath {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		
		// Question 1  (Done)
		
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
//		search.sendKeys("iphone");
//		WebElement clickSearch = driver.findElement(By.xpath("//input[@value='Go']"));
//		clickSearch.click();
		
		
		// Question 2  (Done)
		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
//		user.sendKeys("surega");
//		WebElement pw = driver.findElement(By.xpath("//input[@type='password']"));
//		pw.sendKeys("54321");
//		WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
//		login.click();
		
		
		// Question 3--------textbox, radio button, checkbox                   // task incomplete
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement first = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		first.sendKeys("sur");
		WebElement last = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		last.sendKeys("mur");
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("mylapore");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("sur@gmail.com");
		WebElement phn = driver.findElement(By.xpath("//input[@type='tel']"));
		phn.sendKeys("9876543210");
		
		
		
		
		// Question 4--------page not found
		
		
		// Question 5  (Done)
		
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement intQues = driver.findElement(By.id("heading20"));
//		intQues.click();
//		WebElement cts = driver.findElement(By.xpath("(//a[@target='_blank'])[102]"));
//		cts.click();
		
		// Question 6-------------------------------------------------------ElementNotInteractableException (use JS)
		
//		driver.get("https://www.redbus.in/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement act = driver.findElement(By.className("name_rb_secondary_item"));
//		act.click();
//		WebElement signup = driver.findElement(By.className("header_dropdown_item_name"));
//		signup.click();
//		WebElement phn = driver.findElement(By.className("mobileInputContainer clearfix contact-box"));
//		phn.sendKeys("9876543210");
		
		
		// Question 7-------------------------------------------------------NoSuchElementException (use JS)
		
//		driver.get("https://www.redbus.in/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement from = driver.findElement(By.id("from_station"));
//		from.sendKeys("Kumbakonam");
//		WebElement to = driver.findElement(By.id("to_station"));
//		to.sendKeys("Chennai egmore");
//		WebElement search = driver.findElement(By.id("trainFormButton"));
//		search.click();
		
		
		// Question 8  (Done)
		
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement res = driver.findElement(By.id("heading201"));
//		res.click();
//		WebElement res1 = driver.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[1]"));
//		res1.click();
		
		
		// Question 9-------------------------------------------------------ElementNotInteractableException (use JS)
		                                                         //OTP????
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement login = driver.findElement(By.className("uiU-ZX"));
//		login.click();
//		WebElement phn = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
//		phn.sendKeys("8610334636");
		
		
		// Question 10  (Done)
		
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
//		search.sendKeys("lucent book");
//		WebElement searchbtn = driver.findElement(By.xpath("//input[@type='submit']"));
//		searchbtn.click();
		
		
		// Question 11-------------------------------------------// task incomplete (dropdown)
		
//		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement first = driver.findElement(By.id("firstName"));
//		first.sendKeys("sur");
//		WebElement last = driver.findElement(By.id("lastName"));
//		last.sendKeys("mur");
//		WebElement next = driver.findElement(By.id("collectNameNext"));
//		next.click();
		
		
		// Question 12-----------------------------------------------NoSuchElementException
		                                                           //not filling from phn
//		driver.get("https://www.snapdeal.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement signin = driver.findElement(By.className("accountInner"));
//		signin.click();
//		WebElement login = driver.findElement(By.className("newUserRegister"));
//		login.click();
//		WebElement phn = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']"));
//		phn.sendKeys("9876543210");
//		WebElement cont = driver.findElement(By.className("btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30"));
//		cont.click();
		
		
		// Question 13----------------------------------------------InvalidSelectorException
		
//		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement phn = driver.findElement(By.className("form-control mobileNumberInput"));
//		phn.sendKeys("9876543210");
//		WebElement conti = driver.findElement(By.className("submitBottomOption"));
//		conti.click();
		
		
		// Question 14----------------------------------------------NoSuchElementException
		                                                         //not filling from phn
//		driver.get("https://www.swiggy.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement signup = driver.findElement(By.className("_2CgXb"));
//		signup.click();
//		WebElement phn = driver.findElement(By.xpath("//input[@type='tel']"));	
//		phn.sendKeys("9876543210");
//		WebElement login = driver.findElement(By.className("a-ayg"));
//		login.click();
		
		
		
	}

}
