package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));

		Actions ac = new Actions(driver);
		ac.contextClick(mobiles).build().perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement Electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		ac.contextClick(Electronics).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// get windowHandles - used to handle multiple windows

		Set<String> windowHandles = driver.getWindowHandles();

		// iterating all windows using id

		for (String id : windowHandles) {

			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);

		}

		// to view in specific window we are using if condition

		String MyTitle = "Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
		for (String id : windowHandles) {

			if (driver.switchTo().window(id).getTitle().equals(MyTitle)) {

				break;
			}

		}

	}

}
