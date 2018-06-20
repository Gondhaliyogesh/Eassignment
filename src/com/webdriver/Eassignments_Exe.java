package com.webdriver;

import java.io.FileInputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.practice1.Employer_Login;

import jxl.Sheet;
import jxl.Workbook;

public class Eassignments_Exe 
{

	WebDriver driver;
	Employer_Login  Obj;

	@BeforeTest
	public void LaunchBrowser()
	{	
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://eassignments.in/ca/");
	}

	@Test(dataProvider="testdata")
	public void Employer_Log(String uname,String passwd) throws Exception
	{
		Obj =new Employer_Login(driver);

		Obj.Login_Employer(uname, passwd);

		String str="http://eassignments.in/ca/employers/employer-dashboard.php";
		Assert.assertEquals("http://eassignments.in/ca/employers/employer-dashboard.php", str);
		Thread.sleep(3000);
	}

	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}

	@DataProvider(name="testdata")
	public String[][] getExcel() throws Exception 
	{

		FileInputStream fis=new FileInputStream("F:\\BinaryBridge\\Selenium\\Webdriver\\Eassignment\\file\\data2.xls");
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet sh = wb.getSheet(0);
		int rows = sh.getRows();
		int cols = sh.getColumns();

		String [][]data=new String[rows][cols];


		//System.out.print("Rows:-"+rows+"cols:-"+cols);
		//System.out.print(sh.getCell(1,2).getContents());

		for (int i=0; i<rows;i++)
		{
			for(int j=0; j<cols;j++)
			{
				data[i][j]=sh.getCell(j,i).getContents();
				System.out.println(data[i][j]);

			}
		}
		return data;

	}
}

