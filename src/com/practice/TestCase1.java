package com.practice;

import org.openqa.selenium.By;

public class TestCase1 extends Methodsuserdefin{

	public static void main(String[] args)
	{
		TestCase1 object=new TestCase1();
		object.Launchbrowser();
		object.adminlogin("gondhaliyogesh94@gmail.com", "yogeshG1234");
		driver.findElement(By.linkText("Profile")).click();
		String url=driver.getCurrentUrl();
		
		if(url.contains("http://eassignments.in/ca/employers/employer-profile.php"))
		{
			System.out.println("Login pass");
		}
		else
		{
			System.out.println("Login Failed");
		}
	}

}
