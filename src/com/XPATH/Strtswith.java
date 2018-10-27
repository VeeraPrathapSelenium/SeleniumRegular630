package com.XPATH;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Strtswith {
	public static WebDriver driver;
	public static void main(String[] args) {
		//launch the browser
				driver =new FirefoxDriver();
						
						String baseurl="http://demo.nopcommerce.com/register";
						
						//enter the url
						driver.get(baseurl);
						
						//maximize the browser
						
						driver.manage().window().maximize();
						
						
						// print the options value starts-with 'J'
						
						List<WebElement> alloptions=driver.findElements( By.xpath("//option[starts-with(text(),'J')]"));
						
						
						for(int i=0;i<=alloptions.size()-1;i++)
						{
							System.out.println(alloptions.get(i).getText());
						}
						
// print only one element by using grouping()
						
						WebElement opt=driver.findElement(By.xpath("(//option[starts-with(text(),'J')])[2]"));
						
						
						System.out.println(opt.getText());
	}

}
