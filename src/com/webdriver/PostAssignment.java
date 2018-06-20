package com.webdriver;

import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class PostAssignment {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://eassignments.in/ca/employers/post-requirement.php");
		
		driver.findElement(By.xpath(".//*[@id='requirementInsert']/div[3]/div/div/div/label")).click();
		
		driver.findElement(By.id("job_location")).sendKeys("Nagpur");
		
		
		WebElement assign=driver.findElement(By.id("atitle"));
		Select sel=new Select(assign);
		sel.selectByIndex(6); 
		
		
		driver.findElement(By.id("job_details")).sendKeys("This is Assignment details page");
		
		driver.findElement(By.id("experienced")).click();
		
		WebElement req=driver.findElement(By.id("experience_box"));
		Select sel2=new Select(req);
		sel2.selectByValue("two");
		
		//calender
		WebElement sdd=driver.findElement(By.id("datepicker"));
		Actions act=new Actions(driver);
		act.moveToElement(sdd).doubleClick().build().perform();
		
		Thread.sleep(2000);
		//Month
		WebElement sdd1=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select sel3=new Select(sdd1);
		sel3.selectByValue("6");
		Thread.sleep(2000);
		
		//Year
		WebElement sdd2=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select sel4=new Select(sdd2);
		sel4.selectByValue("2019");
		Thread.sleep(2000);
				
		//day
		WebElement sdd3=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr[5]/td[2]/a"));
		act.moveToElement(sdd3).click().build().perform();
		
		
		
		WebElement edd1=driver.findElement(By.id("datepicker2"));
		Actions act1=new Actions(driver);
		act1.moveToElement(edd1).doubleClick().build().perform();
		
		
		WebElement edd2=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select sel5=new Select(edd2);
		sel5.selectByValue("7");
		
		WebElement edd3=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select sel6=new Select(edd3);
		sel6.selectByValue("2020");
		
		WebElement edd4=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr[5]/td[5]/a"));
		act1.moveToElement(edd4).click().build().perform();
		
		
		driver.findElement(By.id("requirement")).click();
		Thread.sleep(3000);
		
		
		
		
		
		WebElement ele=driver.findElement(By.xpath("html/body/div[1]/header/div[2]/div/nav/ul/li[3]/a"));
		
		Actions act6 = new Actions(driver);
		act6.moveToElement(ele).perform();
		Thread.sleep(2000);
		
		
		List<WebElement> links= driver.findElements(By.xpath("html/body/div[1]/header/div[2]/div/nav/ul/li[3]/ul/li/a"));
		int total_count=links.size();
		for(int i=0;i<total_count;i++)
		{
			WebElement element=links.get(i);
			String text=element.getAttribute("innerHTML");
			
			
			if(text.equalsIgnoreCase("View Requirement")) 
			{
				element.click();
				break;
			}
			
			Thread.sleep(2000);
		
		
		
		
	}

}}
