package com.practice;

import org.openqa.selenium.By;

public class TestCases extends Methodsuserdefin{

	public static void main(String[] args) 
	{
		TestCases obj4=new TestCases();
		
		//TestCase 1
		obj4.Launchbrowser();
		obj4.adminlogin("gondhaliyogesh94@gmail.com", "yogeshG1234");
		
		driver.findElement(By.linkText("Applied Candidate")).click();
		String url=driver.getCurrentUrl();
		
		if(url.contains("http://eassignments.in/ca/employers/employer-profile.php"))
		{
			System.out.println("Login pass");
		}
		else
		{
			System.out.println("Login Failed");
		}
		obj4.closeBrowser();
		
		//TestCase 2
		
		obj4.Launchbrowser();
		obj4.adminLogin();
		String url1=driver.getCurrentUrl();
		
		if(url.contains("http://eassignments.in/ca/employers/employer-dashboard.php"))
		{
			System.out.println("Employer Login Successfull");
		}
		else
		{
			System.out.println("Employer Login Unsuccessfull");
		}
		obj4.closeBrowser();
		
	//TestCase 3
		obj4.Launchbrowser();
		obj4.adminlogin("Yogesh", "Gondhali");
		String errormsg=driver.findElement(By.className("loginerror")).getText();

		if(errormsg.contains("Username Or Password Is Incorrect"))
		{
			System.out.println("Emloyer Login---Failed");
		}
		else
		{
			System.out.println("Employer login Pass");
		}
		obj4.closeBrowser();

	}
	

}
