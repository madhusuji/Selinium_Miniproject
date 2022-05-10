package com.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karan\\eclipse-workspace\\Selenium_Workouts\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().window().maximize();

		WebElement Username = driver.findElement(By.xpath("//input[@type='text']"));
		Username.sendKeys("Madhu");
		
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("M@123");
		
		WebElement Login = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		Login.click();
		
		driver.navigate().to("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("Madhu");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("M@123");
		
		WebElement Login1 = driver.findElement(By.xpath("(//button[@type='submit'])"));
		Login1.click();
	}

}
