package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_types {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karan\\eclipse-workspace\\Selenium_Workouts\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

		// single frame
		driver.switchTo().frame("singleframe");
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("java");

		// default content - from frame to webpage
		driver.switchTo().defaultContent();

		// multiframe
		WebElement Iframebutton = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		Iframebutton.click();

		// outerframe - using webelement

		WebElement Outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(Outerframe);
	    
        //inner frame
        WebElement Innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	    driver.switchTo().frame(Innerframe);
	    
	    WebElement textbox2 = driver.findElement(By.xpath("//input[@type='text']"));
	    textbox2.sendKeys("Selenium");
	    
	    //parent frame - from inner to outer frame
	    
	    driver.switchTo().parentFrame();
	    driver.switchTo().defaultContent();
	
	}

}
