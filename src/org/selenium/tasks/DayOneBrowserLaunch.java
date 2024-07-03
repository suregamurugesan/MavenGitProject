package org.selenium.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOneBrowserLaunch {
	public static void main(String[] args) {
		
        //Question 1---------------Firefox Browser
		//Question 3---------------IE Browser
		
		
		//Question 2 (Done)
		
		WebDriver driver= new ChromeDriver();
		
//		driver.get("http://www.greenstechnologys.com/");
		
//		driver.get("https://www.facebook.com/");
		
//		driver.get("https://www.amazon.in");
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
	}

}
