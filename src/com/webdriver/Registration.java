package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Registration 
{
	private WebDriver driver;

	@FindBy (xpath=("//a[@href='#']/br"))
	private WebElement E_Registation_link;

	@FindBy(linkText=("Employer Registration"))
	private WebElement E_Registration_btn;

	@FindBy(id=("orgtype"))
	private WebElement E_OrganizationType;

	@FindBy(id=("orgname"))
	private WebElement E_OrganizarionNmae;

	@FindBy(id=("address"))
	private WebElement E_Address;

	@FindBy(id=("contactperson"))
	private WebElement E_ContactPerson;

	@FindBy(id=("cellno"))
	private WebElement E_CellNo;

	@FindBy(id=("employer_email"))
	private WebElement E_Email;

	@FindBy(id=("country"))
	private WebElement E_Country;

	@FindBy(name=("state"))
	private WebElement E_State;

	@FindBy(id=("changecity"))
	private WebElement E_City;

	@FindBy(id=("employerinfo"))
	private WebElement E_Info;

	@FindBy(id=("password"))
	private WebElement E_Password;

	@FindBy(id=("passwordConfirm"))
	private WebElement E_Repassword;
	
	@FindBy(xpath=(".//*[@id='save_employer']"))
	private WebElement E_Register;


	public Registration(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public void Rgi_tn() throws Exception		
	{
		Actions act=new Actions(driver);
		act.moveToElement( E_Registation_link).build().perform();

		E_Registration_btn.click();

		Select sel=new Select(E_OrganizationType);
		sel.selectByVisibleText("CA");

		E_OrganizarionNmae.sendKeys("Binary Bridge India Technologis");

		E_Address.sendKeys("FC Road Pune ");

		E_ContactPerson.sendKeys("Rupesh Patil");

		E_CellNo.sendKeys("7507159361");

		E_Email.sendKeys("Rbzy07@bbt.com");

		Select sel2=new Select(E_Country);
		sel2.selectByVisibleText("India");
		Thread.sleep(4000);

		Select sel3=new Select(E_State);
		sel3.selectByIndex(22);
		Thread.sleep(3000);

		Select sel4=new Select(E_City);
		sel4.selectByValue("2764");
		Thread.sleep(3000);

		E_Info.sendKeys("Hello I am Rupesh");

		E_Password.sendKeys("Rbc12345");
		E_Repassword.sendKeys("Rbc12345");
		
		Thread.sleep(3000);
		Actions act1=new Actions(driver);
		act1.moveToElement(E_Register).doubleClick(E_Register).build().perform();
		E_Register.click();
		
		
		
		driver.navigate().forward();
		
		
		//Alert al=driver.switchTo().alert();
		//al.accept();
		
		String str=driver.getCurrentUrl();
		System.out.println(str);
		
		if(str.equalsIgnoreCase("http://eassignments.in/ca/abc.php"))
		{
			System.out.println("Pass");
			System.out.println(str);
			
		}
		else
		{
			System.out.println("Failed");
			System.out.println(str);
		}


		Thread.sleep(3000);
		//driver.close();

	}
}	
