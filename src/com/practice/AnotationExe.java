package com.practice;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnotationExe 
{
	
		@Test
		public void tc_002()
	  	{
			System.out.println("Test case tc_002");
			Assert.assertEquals("Adv", "Adv");
			
		}
		@Test
		public void tc_001()
		{
			System.out.println("test case tc_001"); 
			Assert.assertEquals("Adv", "Adva");
	    }
		@BeforeClass
		public void c1()
		{
			System.out.println("Before Class method Execution");
			//login
		}
		@AfterClass
		public void c2()
		{
			System.out.println("After Class method execution");
			//logout
		}
		@BeforeMethod
		public void m1()
		{
			System.out.println("Before Method Execution");
			//verification of testcase mode
			
		}
		@AfterMethod
		public void m2()
		{
			System.out.println("After method Execution");
			
		
		}
		
	}



