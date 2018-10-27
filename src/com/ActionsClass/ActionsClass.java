package com.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver =new FirefoxDriver();
		
		String baseurl="http://jqueryui.com/droppable/";
		
		//enter the url
		driver.get(baseurl);
		
		//maximize the browser
		
		driver.manage().window().maximize();
		
		
		
		WebElement contibute=driver.findElement(By.xpath("//a[text()='Contribute']"));
		
		//Action CLass
		
		Actions acc=new Actions(driver);
		acc.moveToElement(contibute).build().perform();
		
		//switch over to frame
		
		WebElement frame=driver.findElement(By.xpath("//div[@id='content']//iframe"));
		driver.switchTo().frame(frame);
				
		// identify the source element
		
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		// identify the source element
		
		WebElement dest=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
		acc.dragAndDrop(src, dest).build().perform();
		
		// switch back from the frame
		
		driver.switchTo().defaultContent();
		
		
		
		// identify the view source link and do the right click on it
		WebElement viesource=driver.findElement(By.xpath("//a[contains(text(),'view')]"));
		
		
		acc.contextClick(viesource).build().perform();
		
		
		
				
	}

}
