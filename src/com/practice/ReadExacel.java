package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExacel 
{		
	public static void main(String[] args) throws Exception
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
			
		}
		
	}
}
	
		
	
	