package com.WindowsAndTabsAndChildBrowser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindows {
	public static WebDriver driver;
	public static void main(String[] args) {
driver =new FirefoxDriver();
		
		String baseurl="https://www.naukri.com/";
		
		//enter the url
		driver.get(baseurl);
		
		//maximize the browser
		
		driver.manage().window().maximize();
		
		
		
		//Handle child browsers
		
		//only parent
		String parentid=driver.getWindowHandle();
		
		System.out.println(parentid);
		
		//get the id of all the opened browser
		
		Set allwindows=driver.getWindowHandles();
		
		
		Iterator itr=allwindows.iterator();
		
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			String currntwindow=itr.next().toString();
			if(! parentid.equals(currntwindow))
			{
				driver.switchTo().window(currntwindow);
				driver.close();
			}
			
			
			
		}
		
		

	}

}
