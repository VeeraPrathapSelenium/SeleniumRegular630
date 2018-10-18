package com.XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimplexPATH {
	public static WebDriver driver;
	public static void main(String[] args) {
		//launch the browser
		driver =new FirefoxDriver();
				
				String baseurl="http://demo.nopcommerce.com/register";
				
				//enter the url
				driver.get(baseurl);
				
				//maximize the browser
				
				driver.manage().window().maximize();
				
				
				// send data to the firstname
				
				driver.findElement(By.xpath("//label[text()='First name:']/following-sibling::input")).sendKeys("firstNAME");
				
				

	}

}
