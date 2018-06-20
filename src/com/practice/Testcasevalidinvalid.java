package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcasevalidinvalid {
	
	
	static int i;
	static String username,password,iteration;

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		for(i=1;i<=2;i++)
		{
			if(i==1)
			{
				username="gondhaliyogesh94@gmail.com";
				password="yogeshG1234";
				iteration="Iteration 1:";
			}
			else if(i==2)
			{
				username="gondhaliyogesh9@gmail.com";
				password="yogeshG12345";
				iteration="Iteration 2:";
			}
			
		}
		
		
		driver.get("http://eassignments.in/ca");
		
		driver.findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='social-icons-conatainer']/div[1]/div[1]/input[2]")).click();
		driver.findElement(By.id("user_mail")).sendKeys("gondhaliyogesh94@gmail.com");
		driver.findElement(By.id("login-pass")).sendKeys("yogeshG1234");
		driver.findElement(By.xpath("//button[@class='btn btn-success modal-login-btn submit']")).click();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.contains("http://eassignments.in/ca/employers/employer-dashboard.php"))
		{
			System.out.println(iteration +("Input Data:") + username + "," + password + "Employer Login Successful -Passed");
			driver.findElement(By.linkText("Logout"));
			Thread.sleep(2000);
		}
		else if(!url.contains("http://eassignments.in/ca/employers/employer-dashboard.php"));
		{
			String ErrorMessage =driver.findElement(By.className("loginerror")).getText();
			if(ErrorMessage.contains("Username Or Password Is Incorrect"))
			{
				System.out.println(iteration +("Input Data:") + username + "," + password + "Handling Invalid inputs -Passed");
			}
			else
			{
				System.out.println(iteration + "-Failed");
			}
		}
		
		driver.close();

}}


