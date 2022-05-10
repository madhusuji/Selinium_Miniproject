package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_type {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karan\\eclipse-workspace\\Selenium_Workouts\\Driver\\chromedriver.exe");
        
		//large interface
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		 
	    //Takescreenshot - small interface
		TakesScreenshot ts = (TakesScreenshot) driver; //narrowing type casting
		
		//getScreenshot - used to take screenshot
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//location
		File dest = new File("C:\\Users\\karan\\eclipse-workspace\\Selenium_Workouts\\Screenshots//amazon.png");
		
        //copy the file in particular location
		FileUtils.copyFile(src, dest);
	}

}
