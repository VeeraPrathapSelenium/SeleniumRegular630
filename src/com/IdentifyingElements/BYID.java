package com.IdentifyingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BYID {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		//launch the browser
		driver =new FirefoxDriver();
				
				String baseurl="http://demo.nopcommerce.com/register";
				
				//enter the url
				driver.get(baseurl);
				
				//maximize the browser
				
				driver.manage().window().maximize();
				

				String gender="male";
				
				if(gender.equalsIgnoreCase("male"))
				{
					// enter gender
					driver.findElement(By.id("gender-male")).click();
				}else
				{
					driver.findElement(By.id("gender-female")).click();
				}
				
				//enter firstname
				WebElement firstname=driver.findElement(By.id("FirstName"));
				clickAndSendData(firstname,"My Firstname");
				
				// enter last name
				WebElement lastname=driver.findElement(By.id("LastName"));
				clickAndSendData(lastname,"My Last namename");
				
	}
	
	
	
	public static void clickAndSendData(WebElement element,String data)
	{
		element.click();
		element.clear();
		element.sendKeys(data);
		
	}
	
	
	

}
