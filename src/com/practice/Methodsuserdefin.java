

package com.practice;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methodsuserdefin
	{
	
	public static WebDriver driver; 
	
	public void Launchbrowser()
	{
		
		driver=new FirefoxDriver();
		driver.get("http://eassignments.in/ca");
		
		driver.manage().window().maximize();
		
	}
	public void adminLogin() 
	{
		
		driver.findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='social-icons-conatainer']/div[1]/div[1]/input[2]")).click();
		driver.findElement(By.id("user_mail")).sendKeys("gondhaliyogesh94@gmail.com");
		driver.findElement(By.id("login-pass")).sendKeys("yogeshG1234");
		driver.findElement(By.xpath("//button[@class='btn btn-success modal-login-btn submit']")).click();
	
	}
	
	public void adminlogin(String username,String Password)
	{
		driver.findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='social-icons-conatainer']/div[1]/div[1]/input[2]")).click();
		driver.findElement(By.id("user_mail")).sendKeys(username);
		driver.findElement(By.id("login-pass")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@class='btn btn-success modal-login-btn submit']")).click();
	}

	public void closeBrowser()
	{
		driver.close();
		System.out.println("Close Browser");
	}

	}
