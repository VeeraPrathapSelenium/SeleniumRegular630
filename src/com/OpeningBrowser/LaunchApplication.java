package com.OpeningBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchApplication {

	
	
	
	public static void main(String[] args) {
		
		//launch the browser
		WebDriver driver =new FirefoxDriver();
		
		String baseurl="http://demo.nopcommerce.com/register";
		
		//enter the url
		driver.get(baseurl);
		
		//maximize the browser
		
		driver.manage().window().maximize();
		
		
		//get the current url of the page
		
		String crnturl=driver.getCurrentUrl();
		
		
		//compare the current url with base url
		
		if(baseurl.equals(crnturl))
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
		
		// verify the title of the page
		
		String title_page=driver.getTitle();
		System.out.println("The title of the page is "+title_page);
		
		//close the browser
		
		driver.close();

	}

}
