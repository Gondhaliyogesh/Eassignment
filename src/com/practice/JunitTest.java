/**
 * 
 */
package com.practice;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Yogiii
 *
 */
public class JunitTest
{
	@Test
	public void jtest()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getCurrentUrl());
		
	}
	
	
}
