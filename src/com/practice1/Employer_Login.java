package com.practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import jxl.Sheet;
import jxl.Workbook;

public class Employer_Login 
{
	WebDriver driver;




	@FindBy(xpath="html/body/div[1]/header/div[1]/div/div/ul/li[3]/a")
	WebElement L_lnk;

	@FindBy(xpath=".//*[@id='social-icons-conatainer']/div[1]/div[1]/input[2]")
	WebElement R_btn;

	@FindBy(id="user_mail")
	WebElement usern;

	@FindBy(id="login-pass")
	WebElement Passwd;

	@FindBy(xpath="//button[@class='btn btn-success modal-login-btn submit']")
	WebElement Login_btn;

	@FindBy(xpath=("html/body/div[1]/header/div[1]/div/div/ul/li[3]/a"))
	WebElement Logout_btn;

	@FindBy(xpath=(".//*[@id='showsuccess']/div/div/div[2]/center/a"))
	WebElement Again_Login_btn;


	public Employer_Login(WebDriver driver)
	{  
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void Login_Employer(String uname,String passwd) throws Exception 
	{	
		L_lnk.click();
		R_btn.click();

		usern.sendKeys(uname);
		Passwd.sendKeys(passwd);

		Login_btn.click(); 

		Thread.sleep(3000);

		Actions act=new Actions(driver);
		act.moveToElement(Logout_btn).click().build().perform();
		Thread.sleep(3000);

		Actions ac=new Actions(driver);
		ac.moveToElement(Again_Login_btn).click().build().perform();


	}


}

