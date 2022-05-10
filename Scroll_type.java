package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_type {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karan\\eclipse-workspace\\Selenium_Workouts\\Driver\\chromedriver.exe");
        
		//large interface
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement mexico = driver.findElement(By.xpath("//a[text()='Mexico']"));
		
		//small interface 
		JavascriptExecutor js = (JavascriptExecutor) driver; //narrowing type casting
		//scroll using webelement
		js.executeScript("arguments[0].scrollIntoView()", mexico);
		 Thread.sleep(2000);
		
		//scroll up
		js.executeScript("window.scrollBy(0,-4000);");
		Thread.sleep(2000);
		//scroll down
		js.executeScript("window.scrollBy(0,3000);");
		
	}

}
