package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTest {
	public static WebDriver driver;
	public static int browser;
	public static String Browsername;

	public static void main(String[] args) 
	{
		for(browser=1;browser<=3;browser++) 
		{
			if(browser==1)
			{
				driver=new FirefoxDriver();
				Browsername="Mozila Firefox Browser";
			}
			else if(browser==2)
			{
				System.setProperty("webdriver.chrome.driver", "F:\\BinaryBridge\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe\\");
				driver=new ChromeDriver();
				Browsername="Chrome Browser";
				
			}
			else if(browser==3)
			{
				System.setProperty("webdriver.ie.driver", "C:\\Users\\Yogiii\\Downloads\\IEDriverServer_x64_3.12.0\\IEDriverServer.exe\\");
				driver=new InternetExplorerDriver();
				Browsername="IE Browser";
			}
			driver.get("https://www.google.com");
			String Pagetitle=driver.getTitle();
			if(Pagetitle.equals("Google"))
			{
				System.out.println(Browsername + "--Google application launched--passed");
			}
			else 
			{
				System.out.println(Browsername + "--Google application launched--failed");
			} 
			driver.close();
		}

	}

}
