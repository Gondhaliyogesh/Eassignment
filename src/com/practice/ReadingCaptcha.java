package com.practice;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadingCaptcha {

	public static void main(String[] args) throws Exception
	{
		WebDriver obj=new FirefoxDriver();
		obj.manage().window().maximize();
		obj.get("https://www.irctc.co.in/");
		
		
		obj.findElement(By.className("twoyears-close-btn")).click();
	
		
		FileInputStream fis=new FileInputStream("F:\\BinaryBridge\\Selenium\\Webdriver\\Eassignment\\config.properties\\");
		Properties p=new Properties();
		p.load(fis);
		obj.findElement(By.id("usernameId")).sendKeys(p.getProperty("user"));
		obj.findElement(By.name("j_password")).sendKeys(p.getProperty("Pass"));
		
		Dimension d=new Dimension(1200,1200);//for minimize the window
		obj.manage().window().setSize(d);
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Captcha");
		String captcha=scan.nextLine();
		
		obj.findElement(By.id("nlpAnswer")).sendKeys(captcha);
		obj.findElement(By.id("loginbutton")).click();
		String url=obj.getCurrentUrl();
		System.out.println(url);
		
		if(url.contains("https://www.irctc.co.in/eticketing/home"))
		{
			System.out.println("Login Successfull -Passed");
		}
		else
		{
			System.out.println("Login Unsuccessfull -failed");
		}
		
		
		obj.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(5000);

		obj.close();
	}

}
