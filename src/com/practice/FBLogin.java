package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FBLogin 
{

	private  WebElement uname;	
	private  WebElement passwd;
	private  WebElement  btn;


	public  FBLogin(WebDriver driver)
	{
		uname=driver.findElement(By.id("email"));
		passwd=driver.findElement(By.id("pass"));
		btn=driver.findElement(By.xpath("//input[@value='Log In']"));

	}

	public void Abc()
	{
		uname.sendKeys("abc");
		passwd.sendKeys("abc");
		btn.click();
	}


}

