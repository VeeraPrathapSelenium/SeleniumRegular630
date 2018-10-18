package com.HandlingDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectlsit {
	public static WebDriver driver;
	public static void main(String[] args) {
		//launch the browser
				driver =new FirefoxDriver();
						
						String baseurl="http://demo.nopcommerce.com/register";
						
						//enter the url
						driver.get(baseurl);
						
						//maximize the browser
						
						driver.manage().window().maximize();
						
						
						
						// use select class to handle dropdown
						
						WebElement element=driver.findElement(By.name("DateOfBirthDay"));
						
						Select dateofbirth=new Select(element);
						
						dateofbirth.selectByVisibleText("17");
						dateofbirth.selectByValue("15");
						
						dateofbirth.selectByIndex(3);
						
						List alloptions=dateofbirth.getOptions();
						
						
						for(int i=0;i<=alloptions.size();i++)
						{
							System.out.println(alloptions.get(i));
						}
						
						
	}

}
