package com.practice;

public class TestCase2 extends Methodsuserdefin{

	public static void main(String[] args)
	{
		TestCase2 obj2 =new TestCase2();
		obj2.Launchbrowser();
		obj2.adminLogin();
		String url=driver.getCurrentUrl();
		
		if(url.contains("http://eassignments.in/ca/employers/employer-dashboard.php"))
		{
			System.out.println("Employer Login Successfull");
		}
		else
		{
			System.out.println("Employer Login Unsuccessfull");
		}
		}
				
			
		

	}

