package com.practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fbexe {

	public static void main(String[] args) throws Exception
	
	{
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		try {
		Employer_Login obj=new Employer_Login(driver);
		obj.Login_Employer(null, null);
		}
		catch (Exception e)
		{
			System.out.println(e.getCause());
		}

	}

}
