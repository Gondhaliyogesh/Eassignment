package com.practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiwindowhandle 
 {

	public static void main(String[] args)
	
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.onlinesbi.com/");
		
		/*String pwh=driver.getWindowHandle();
		String cwh=null;
		
		driver.findElement(By.linkText("How Do I")).click();
		
		for (String wh:driver.getWindowHandles()) 
		{
			if(wh!=pwh)
			{
				cwh=wh;
			}
		}
		driver.switchTo().window(cwh);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(pwh);
		System.out.println(driver.getTitle());*/
		
		//OR
		
		
		driver.findElement(By.linkText("How Do I")).click();
		
		String str=driver.getWindowHandle();
		
		Set <String> str1=driver.getWindowHandles();
		int Webpage_count=str1.size();
		System.out.println(Webpage_count); //Display the no. of webpages count
		
		
		for(String s1:str1)
		{
			if(!s1.equals(str))
			{
				driver.switchTo().window(s1);
				System.out.println(driver.getTitle());
			}
			
			driver.switchTo().window(str);
			System.out.println(driver.getTitle());
		}
		
		
		
		

	
		
		

}
	}
