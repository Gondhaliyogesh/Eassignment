package com.practice;

import org.junit.After;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc_001 
{
	@Test
	public void Tc_002()
	{
		System.out.println("Test Case 002");
		Assert.assertEquals("Abc", "Abc");
	}
	
	@Test
	public void Tc_003()
	{
		System.out.println("Test Case 003");
		Assert.assertEquals("Abc", "Abc1");
	}
	@BeforeMethod
	public void method1()
	{
		System.out.println("Before Method Execution");
		
	}
	@BeforeClass
	public void class1()
	{
		System.out.println("Before Class Execution");
		
	}
	@AfterMethod
	public void method2()
	{
		System.out.println("After Method Execution");
	}
	@AfterClass
	public void class2()
	{
		System.out.println("After Class Execution");
	}

}
