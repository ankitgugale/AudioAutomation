package Testingframework;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.jetty.html.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.concurrent.TimeUnit;

public class Exceltest {
	
	
	 

	 
		public static void main (String [] args) throws IOException{
			//create an object of Workbook and pass the FileInputStream object into it to create a pipeline between the sheet and eclipse.
			FileInputStream fis = new FileInputStream("D:\\DCMS\\Abc.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			//call the getSheet() method of Workbook and pass the Sheet Name here. 
			//In this case I have given the sheet name as “TestData” 
	                //or if you use the method getSheetAt(), you can pass sheet number starting from 0. Index starts with 0.
		//	XSSFSheet sheet = workbook.getSheet("TestData");
			XSSFSheet sheet = workbook.getSheetAt(0);
			//Now create a row number and a cell where we want to enter a value. 
			//Here im about to write my test data in the cell B2. It reads Column B as 1 and Row 2 as 1. Column and Row values start from 0.
			//The below line of code will search for row number 2 and column number 2 (i.e., B) and will create a space. 
	                //The createCell() method is present inside Row class.
	                Row row = sheet.createRow(1);
			Cell cell = row.createCell(1);
			//Now we need to find out the type of the value we want to enter. 
	                //If it is a string, we need to set the cell type as string 
	                //if it is numeric, we need to set the cell type as number
			cell.setCellType(Cell.CELL_TYPE_STRING);
			cell.setCellValue("SoftwareTestingMaterial.com");
			FileOutputStream fos = new FileOutputStream("D:\\DCMS\\Abc.xlsx");
			workbook.write(fos);
			fos.close();
			System.out.println("END OF WRITING DATA IN EXCEL");
		}
	}
	
	
	   /* public static void main(String args[]) throws Exception
	    {
	      FileInputStream fis = new FileInputStream("D:\\DCMS\\Abc.xlsx");
	        FileOutputStream fos = null;
	        XSSFWorkbook workbook = new XSSFWorkbook(fis);
	        XSSFSheet sheet = workbook.getSheetAt(0);
	        XSSFRow row = null;
	        XSSFCell cell = null;
	        XSSFFont font = workbook.createFont();
	        XSSFCellStyle style = workbook.createCellStyle();
	 
	        row = sheet.getRow(1);
	        if(row == null)
	            row = sheet.createRow(1);
	 
	        cell = row.getCell(4);
	        if(cell == null)
	            cell = row.createCell(4);
	 
	        font.setFontName("Comic Sans MS");
	        font.setFontHeight(14.0);
	        font.setBold(true);
	        font.setColor(HSSFColor.WHITE.index);
	 
	        style.setFont(font);
	        style.setFillForegroundColor(HSSFColor.GREEN.index);
	        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	 
	        cell.setCellStyle(style);
	        cell.setCellValue("PASS");
	 
	        fos = new FileOutputStream("D:\\DCMS\\Abc.xlsx");
	        workbook.write(fos);
	        System.out.println("Sucess");
	        fos.close();
	    }*/
	

