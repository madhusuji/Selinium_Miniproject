package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Methods {

	public static void main(String[] args) {

		// property setting - key(driver name), value(driver location)

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karan\\eclipse-workspace\\Selenium_Workouts\\Driver\\chromedriver.exe");

		// browser launching syntax
		// Interface class
		// parent child
		WebDriver driver = new ChromeDriver(); // upcasting

		// get - url launch
		driver.get("https://www.facebook.com/");

		// maximize
		driver.manage().window().maximize();

		// sendkeys
		WebElement emailId = driver.findElement(By.id("email"));
		emailId.sendKeys("madhu@gmail.com");

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("madhu@123");

		// getAtrribute
		String attribute = password.getAttribute("name");
		System.out.println(attribute);
		String attribute1 = password.getAttribute("value");
		System.out.println(attribute1);

		// clear
		emailId.clear();

		// is Displayed
		boolean displayed = emailId.isDisplayed();
		System.out.println("Is Displayed :" + displayed);
		// is Enabled
		boolean enabled = password.isEnabled();
		System.out.println("Is enabled :" + enabled);
		
		//click
		WebElement Login = driver.findElement(By.name("login"));
		boolean selected = Login.isSelected();
		System.out.println("isSelected:"+selected);
		
		
		Login.click();
		

	}

}
