package com.practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class ReadExcelTestNg
{
	public  WebDriver driver;
	@Test(dataProvider="testdata")
	public void Login(String uname,String passwd)
	{
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(passwd);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Assert.assertEquals("https://www.facebook.com", driver.getCurrentUrl());
		driver.close();
	}


	@DataProvider(name="testdata")
	public String[][] getExcel() throws Exception 
	{

		FileInputStream fis=new FileInputStream("F:\\BinaryBridge\\Selenium\\Webdriver\\Eassignment\\file\\data1.xls");
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
		}return data;
	}}


