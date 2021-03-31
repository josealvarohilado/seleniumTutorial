package com.testproject.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub

	//setting the driver executable
	System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");

	//Initiating your chromedriver
//	WebDriver driver=new FirefoxDriver();
	WebDriver driver=new ChromeDriver();

	//Applied wait time
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//maximize window
	driver.manage().window().maximize();

	//open browser with desried URL
	driver.get("https://www.lazada.com.ph");
	WebElement searchBox = driver.findElement(By.id("q"));
	searchBox.sendKeys("Shimano");
	driver.findElement(By.cssSelector("#topActionHeader > div > div.lzd-logo-bar > div > div.lzd-nav-search > form > div > div.search-box__search--2fC5 > button")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.partialLinkText("M520")).click();
	Thread.sleep(3000);
	//closing the browser
//	driver.close();
	}
}
