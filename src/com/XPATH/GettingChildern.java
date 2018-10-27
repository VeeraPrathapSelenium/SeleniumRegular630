package com.XPATH;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GettingChildern {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch the browser
				driver =new FirefoxDriver();
						
						String baseurl="http://demo.nopcommerce.com/register";
						
						//enter the url
						driver.get(baseurl);
						
						//maximize the browser
						
						driver.manage().window().maximize();
						
						
						// get all the childerns
						
						List<WebElement> alloptions=driver.findElements(By.xpath("//select[@name='DateOfBirthDay']/child::option"));
						
						System.out.println(alloptions.size());
						
						for(int i=0;i<=alloptions.size()-1;i++)
						{
							System.out.println(alloptions.get(i).getText());
							
							System.out.println("===================================");
							
							System.out.println(alloptions.get(i).getAttribute("value"));
						}
						
						
						
						
						
		
		
		

	}

}
