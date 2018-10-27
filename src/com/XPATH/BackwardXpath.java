package com.XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackwardXpath {
	public static WebDriver driver;
	public static void main(String[] args) {
		//launch the browser
		driver =new FirefoxDriver();
				
				String baseurl="http://demo.nopcommerce.com/register";
				
				//enter the url
				driver.get(baseurl);
				
				//maximize the browser
				
				driver.manage().window().maximize();
				
				// print the label name "Last Name"
				
				WebElement lastname=driver.findElement(By.xpath("//input[@id='LastName']/preceding-sibling::label"));
				
				System.out.println(lastname.getText());
				
				
				// print date of birth label
				
				WebElement dob=driver.findElement(By.xpath("//option[text()='9']/ancestor::div[1]/preceding-sibling::label"));
				
				
				System.out.println(dob.getText());
				

	}

}
