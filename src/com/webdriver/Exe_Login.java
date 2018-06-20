package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exe_Login {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://eassignments.in/ca/");
		
		try
		{
			/*Login obj=new Login(driver);
			obj.E_login();*/
			
			Registration obj1=new Registration(driver);
			obj1.Rgi_tn();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getCause());
		}
		
		
		
	}

}
