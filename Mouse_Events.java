package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Events {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karan\\eclipse-workspace\\Selenium_Workouts\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/buttons");
		driver.manage().window().maximize();

		// click
		WebElement Clickbutton = driver.findElement(By.xpath("//button[text()='Click Me']"));

		Actions ac = new Actions(driver);
		ac.click(Clickbutton).build().perform();

		// Rightclick - context click
		WebElement Rightclickbutton = driver.findElement(By.id("rightClickBtn"));
		ac.contextClick(Rightclickbutton).build().perform();

		// double click
		WebElement Doubleclickbtn = driver.findElement(By.id("doubleClickBtn"));
		ac.doubleClick(Doubleclickbtn).build().perform();

		driver.navigate().to("https://www.amazon.in/");

		// moveToElement
		WebElement move = driver.findElement(By.xpath("//img[@alt='Electricity bill']"));
		ac.moveToElement(move).build().perform();
		ac.click(move).build().perform();

		// drag and drop
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(drag, drop).build().perform();

	}

}
