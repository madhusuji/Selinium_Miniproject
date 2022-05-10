package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karan\\eclipse-workspace\\Selenium_Workouts\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement Create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		Create.click();
		Thread.sleep(2000);
		WebElement Firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Firstname.sendKeys("Madhu");

		WebElement Lastname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		Lastname.sendKeys("Vengat");

		WebElement Email = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		Email.sendKeys("M@134");

		Thread.sleep(2000);

		WebElement Day = driver.findElement(By.id("day"));
		Select s = new Select(Day);
		s.selectByValue("19");

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

		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByIndex(11);

		
		
		
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1992");

	}

}
