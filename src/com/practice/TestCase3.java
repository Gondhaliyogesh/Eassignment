package com.practice;

import org.openqa.selenium.By;

public class TestCase3 extends Methodsuserdefin {

	public static void main(String[] args) 
	{
		TestCase3 obj3=new TestCase3();
		
		obj3.Launchbrowser();
		obj3.adminlogin("Yogesh", "Gondhali");
		
		String errormsg=driver.findElement(By.className("loginerror")).getText();
		
		if(errormsg.contains("Username Or Password Is Incorrect"))
		{
			System.out.println("Emloyer Login---Failed");
		}
		else
		{
			System.out.println("Employer login Pass");
		}

	}

}
