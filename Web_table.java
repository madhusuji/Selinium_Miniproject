package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karan\\eclipse-workspace\\Selenium_Workouts\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");

		driver.manage().window().maximize();
		// all data
		System.out.println("*****All data*****");

		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement all : alldata) {

			String text = all.getText();
			System.out.println(text);

		}
		System.out.println();
		// row data
		System.out.println("*****row data*****");

		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[5]/td"));
		for (WebElement rowdata : row) {
			String text = rowdata.getText();
			System.out.println(text);

		}

		System.out.println();
		// coloumn data
		System.out.println("*****coloumn data*****");
		List<WebElement> coloumn_data = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
		for (WebElement cols : coloumn_data) {

			String text = cols.getText();
			System.out.println(text);

		}

		System.out.println();
		// Particular data
		System.out.println("*****Particular data*****");
		WebElement part = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
		String text = part.getText();
		System.out.println(text);

		System.out.println();
		
		// Headers
		System.out.println("*****Headers*****");
		List<WebElement> headers = driver.findElements(By.tagName("th"));
		for (WebElement head : headers) {

			String text2 = head.getText();

			System.out.println(text2);
		}

	}

}
