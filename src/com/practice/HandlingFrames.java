package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver obj=new FirefoxDriver();
		obj.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
		obj.switchTo().frame(2);//Top window to frame using index
		
		obj.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[1]/td[1]")).click();
		
		obj.switchTo().defaultContent();//Frame to Top Window
		
		obj.switchTo().frame("packageFrame");//Top Window to Frame using Name
	
		
		

	}

}
