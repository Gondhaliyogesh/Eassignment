package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFB {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		FBLogin obj=new FBLogin(driver);
		obj.Abc();

	}

}
