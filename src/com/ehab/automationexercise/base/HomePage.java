package com.ehab.automationexercise.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class HomePage {
WebDriver driver ;

@Test
public void testHomePage()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationexercise.com/");
	String url = driver.getCurrentUrl();
	System.out.println("Current URL: " + url);
	driver.getTitle();
	System.out.println("Page Title: " + driver.getTitle());
	//Open new tab
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://mvnrepository.com/");
}
}
