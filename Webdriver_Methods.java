package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {

	public static void main(String[] args) throws InterruptedException {

		// property setting - key(driver name), value(driver location)

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karan\\eclipse-workspace\\Selenium_Workouts\\Driver\\chromedriver.exe");

		// browser launching syntax
		// Interface class
		// parent child
		WebDriver driver = new ChromeDriver(); // upcasting

		// ChromeDriver driver1 = new ChromeDriver(); // to access only chrome through remote server

		// get - url launch
		driver.get("https://www.flipkart.com/");

		// maximize
		driver.manage().window().maximize();

		// Navigation methods - to
		driver.navigate().to("https://www.amazon.in/");

		// back
		driver.navigate().back(); // back to flipkart

		// getTitle
		String title = driver.getTitle();
		System.out.println("Title :" + title); // flipkart title

		// getcurrentUrl
		String currentUrl = driver.getCurrentUrl(); // flipkart url
		System.out.println("currentUrl :" + currentUrl);

		// forward
		driver.navigate().forward(); // amazon

		Thread.sleep(2000); // waiting time in ms

		// refresh
		driver.navigate().refresh();
		// close
		driver.close();

	}

}
