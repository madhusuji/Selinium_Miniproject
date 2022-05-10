package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_type {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karan\\eclipse-workspace\\Selenium_Workouts\\Driver\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();

		// simple alert
		WebElement alert1button = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		alert1button.click();
		Thread.sleep(2000);

		Alert Simplealert = driver.switchTo().alert();
		Simplealert.accept();

		// confirm alert

		WebElement alert2button = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		alert2button.click();
		Thread.sleep(2000);
		Alert ConfirmAlert = driver.switchTo().alert();
		ConfirmAlert.accept();
		// ConfirmAlert.dismiss();

		// prompt alert

		WebElement alert3button = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		alert3button.click();
		Thread.sleep(2000);
		Alert PromptAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		PromptAlert.sendKeys("Krithvik");
		String text = PromptAlert.getText();
		System.out.println(text);
		// PromptAlert.accept();
	PromptAlert.dismiss();

	}

}
