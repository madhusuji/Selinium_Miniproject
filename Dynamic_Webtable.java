package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Webtable {
	static int indexOfTotal,indexOfRecovered,indexOfActive;

	public static void main(String[] args) {

		

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.worldometers.info/coronavirus/");

		driver.manage().window().maximize();

		// iterate all headers
		List<WebElement> allHeaders = driver.findElements(By.tagName("th"));

		for (int i = 0; i < allHeaders.size(); i++) {

			String text = allHeaders.get(i).getText();
			// System.out.println(text); //prints with mis-allignments

			String headers = text.replaceAll("/n", " "); // giving space for each new line
			// System.out.println(headers);

			if (headers.equalsIgnoreCase("Total Cases")) {

				indexOfTotal = i;

				System.out.println("Index of Total :" + indexOfTotal);

			} else if (headers.equalsIgnoreCase("Total Recovered")) {

				indexOfRecovered = i;

				System.out.println("Index of Recovered :" + indexOfRecovered);

			}
			
			else if (headers.equalsIgnoreCase("Active cases")) {

				indexOfActive = i;

				System.out.println("Index of Active :" + indexOfActive);

			}

		}
//traverse into body
		List<WebElement> allRows = driver.findElements(By.xpath("//table/tbody[1]/tr"));
		for (int i = 0; i < allRows.size(); i++) {
			
			
			
		}
		
		
	}

}
