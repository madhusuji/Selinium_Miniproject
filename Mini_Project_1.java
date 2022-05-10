package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project_1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().window().maximize();

		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("Madhumithavengat");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Madhu@1912");

		WebElement login = driver.findElement(By.id("login"));
		login.click();

		WebElement Location = driver.findElement(By.id("location"));
		Select s = new Select(Location);
		s.selectByValue("Sydney");

		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotels);
		s1.selectByValue("Hotel Sunshine");

		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s2 = new Select(roomtype);
		s2.selectByValue("Super Deluxe");

		WebElement room = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(room);
		s3.selectByValue("2");

		WebElement adult_room = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adult_room);
		s4.selectByValue("2");

		WebElement child_room = driver.findElement(By.id("child_room"));
		Select s5 = new Select(child_room);
		s5.selectByValue("1");

		WebElement Search = driver.findElement(By.id("Submit"));
		Search.click();

		WebElement Radio = driver.findElement(By.id("radiobutton_0"));
		Radio.click();

		WebElement Continue = driver.findElement(By.id("continue"));
		Continue.click();

		WebElement first_name = driver.findElement(By.id("first_name"));
		first_name.sendKeys("Madhumitha");

		WebElement last_name = driver.findElement(By.id("last_name"));
		last_name.sendKeys("Vengat");

		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("no.19 nehru street cuddalore");

		WebElement Card = driver.findElement(By.id("cc_num"));
		Card.sendKeys("9876543211234567");

		WebElement select_combobox = driver.findElement(By.id("cc_type"));

		Select s6 = new Select(select_combobox);
		s6.selectByValue("VISA");

		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(month);
		s7.selectByVisibleText("February");

		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(year);
		s8.selectByIndex(2);

		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("890");

		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		// Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement Logout = driver.findElement(By.xpath("(//input[@type='button'])[3]"));
		Logout.click();

	}

}
