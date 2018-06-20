package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingRadioButton {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://eassignments.in/ca/#");
		driver.findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/ul/li[3]/a")).click();
		boolean rbt=driver.findElement(By.xpath(".//*[@id='type']")).isSelected();   //user_type
		
		if(rbt)
		{
			driver.findElement(By.xpath(".//*[@id='social-icons-conatainer']/div[1]/div[1]/input[2]")).click();
		 
		}
		else
		{
			System.out.println("Failed---->"+rbt);
			
		}

		driver.close();
	}

}
