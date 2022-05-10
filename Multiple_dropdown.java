package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\karan\\eclipse-workspace\\Selenium_Workouts\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("http://www.leafground.com/pages/Dropdown.html");

	driver.manage().window().maximize();
	WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
	
	//is multiple
	
	Select s = new Select(multiple);
	boolean mul = s.isMultiple();
	System.out.println("is Multiple :" +mul);
	
	s.selectByValue("1");
	s.selectByValue("2");
	s.selectByValue("3");
	s.deselectByVisibleText("Appium");
	

	// get options

	List<WebElement> alloptions = s.getOptions();

	for (WebElement all : alloptions) {

		String text = all.getText();
		System.out.println("all options :" + text);

	}
	// first selected options

	WebElement firstSelectedOption = s.getFirstSelectedOption();
	String text = firstSelectedOption.getText();
	System.out.println("firstSelectedOption :" + text);

	// get all selected options

	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for (WebElement allselect : allSelectedOptions) {

		String text2 = allselect.getText();

		System.out.println("allSelectedOptions :" + text2);
	}
	
	
	s.deselectAll();
	
	
	
	
	
	
}
}
