package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGSample
{
	@Test
	public void sample()
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	String str=driver.getTitle();
	System.out.println(str);
	Assert.assertEquals(str, "Facebook – log in or sign up");
	}

}
