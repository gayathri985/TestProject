package com.rest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lap-224\\eclipse-workspace\\Se1day\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/guru99home/");

		
		driver.manage().window().maximize();
		driver.switchTo().frame("a077aa5e"); // switching the frame by ID

	List<WebElement> elements = driver.findElements(By.xpath("//img[@src=\"Jmeter720.png\""));
	   
		
		List<WebElement> list = driver.findElements(By.xpath("iframe"));
		int i = list.size();
		System.out.println(i);
		driver.switchTo().frame(1);
	
		

	}

}
