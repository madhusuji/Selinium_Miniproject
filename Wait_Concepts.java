package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Concepts {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karan\\eclipse-workspace\\Selenium_Workouts\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		//implicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement emailId = driver.findElement(By.id("email"));
		emailId.sendKeys("madhu@gmail.com");

		WebElement password = driver.findElement(By.name("pass"));
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(password));
		
		
		password.sendKeys("madhu@123");
		
		
	}

}
