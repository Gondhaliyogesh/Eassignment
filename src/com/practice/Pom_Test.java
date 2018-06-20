package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pom_Test 
	{	private WebDriver driver;
	
		@FindBy (xpath=("//a[@href='#']/br"))
		 private WebElement rgt_btn;
		@FindBy(linkText=("Employer Registration"))
		private WebElement l;
		@FindBy(id=("orgtype"))
		private WebElement orgn;
		
		
		public  Pom_Test(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		public void Pom_ex()		{
			
			Actions act=new Actions(driver);
			act.moveToElement(rgt_btn).build().perform();
			
			l.click();
			
			Select sel=new Select(orgn);
			sel.selectByVisibleText("CA");
			
			
			
			
		}
		}
