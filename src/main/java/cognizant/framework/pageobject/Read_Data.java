package cognizant.framework.pageobject;

//import excel;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.sikuli.basics.Debug;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public  class Read_Data {
	
	public static ExtentSparkReporter spark;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	
	public static String tbc;
	public int r;
	public String bm1;
	public String so;
	public String mo;
	public String lo;
	public String rso;
	public String rmo;
	public String rlo;
	public String relo;
	public String sd;
	public String md;
	public String ld;
	public String eld;
	public String rsd;
	public String rmd;
	public String rld;
	public String reld;
	public String sdc;
	public String mdc;
	public String ldc;
	public String eldc;
	public String rsdc;
	public String rmdc;
	public String rldc;
	public String reldc;
	public String ad;
	public String ap;
	public String bt;
	public String bm;
	public String sb;
	public String bbb;

	
	public  ScreenImage capture(Rectangle rect) {
		Debug.log(4, "ScreenUnion: capture: (%d,%d) %dx%d", rect.x, rect.y, rect.width, rect.height);
		Screen s = Screen.getPrimaryScreen();
//    Location tl = new Location(rect.getLocation());
//    for (Screen sx : Screen.screens) {
//      if (sx.contains(tl)) {
//        s = sx;
//        break;
//      }
//    }
		ScreenImage si = s.capture(rect);
		return si;
	}
	
	
	
	public static Sheet sheet_No() throws IOException {
		int n=1;
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
 
  		FileInputStream fis = new FileInputStream(f);
 
  		Workbook wb = new XSSFWorkbook(fis);
 
  		Sheet sheetAt = wb.getSheetAt(n);
		return sheetAt;

	}
	
	
	
	
//	public static String readOrderDetailName() throws IOException
//	{
//		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
//		FileInputStream fis = new FileInputStream(f);
//  		Workbook wb = new XSSFWorkbook(fis);*/
//  		Sheet a = wb.geta(1);
//  		Row row = a.getRow(2);
//  		Cell cell = row.getCell(1);
//  		CellType typeofCell = cell.getCellType();
//  		if(typeofCell.equals(CellType.STRING))
//  		{
//  			String stringCellValue = cell.getStringCellValue();
//  			System.out.println(stringCellValue);
//  		}
//		return null;
//  		}
//	
//	public static String readButtonName() throws IOException
//	{
//		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
//		FileInputStream fis = new FileInputStream(f);
//  		Workbook wb = new XSSFWorkbook(fis);*/
//  		Sheet a = wb.geta(1);
//  		Row row = a.getRow(1);
//  		Cell cell = row.getCell(1);
//  		CellType typeofCell = cell.getCellType();
//  		if(typeofCell.equals(CellType.STRING))
//  		{
//  			String stringCellValue = cell.getStringCellValue();
//  			System.out.println(stringCellValue);
//  		}
//		return null;
//  		}
//	public static String readComboFormationName() throws IOException
//	{
//		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
//		FileInputStream fis = new FileInputStream(f);
//  		Workbook wb = new XSSFWorkbook(fis);*/
//  		Sheet a = wb.geta(1);
//  		Row row = a.getRow(4);
//  		Cell cell = row.getCell(1);
//  		CellType typeofCell = cell.getCellType();
//  		if(typeofCell.equals(CellType.STRING))
//  		{
//  			String stringCellValue = cell.getStringCellValue();
//  			System.out.println(stringCellValue);
//  		}
//		return null;
//  		}
//	public static String readModifierName() throws IOException
//	{
//		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
//		FileInputStream fis = new FileInputStream(f);
//  		Workbook wb = new XSSFWorkbook(fis);*/
//  		Sheet a = wb.geta(1);
//  		Row row = a.getRow(3);
//  		Cell cell = row.getCell(1);
//  		CellType typeofCell = cell.getCellType();
//  		if(typeofCell.equals(CellType.STRING))
//  		{
//  			String stringCellValue = cell.getStringCellValue();
//  			System.out.println(stringCellValue);
//  		}
//		return null;
//  		}
	public  String readSMOriginalBlendPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(3);
  		Cell cell = row.getCell(7);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			so=replaceAll;
		}
  		
  		return so;
  	}
	public String readMdOriginalBlendPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(4);
  		Cell cell = row.getCell(7);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			mo=replaceAll;
		}
  		
  		return mo;
  	}
	public  String readLGOriginalBlendPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(3);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			lo=replaceAll;
		}
  		
  		return lo;
  	}
	
	
	
	public String readRefillSmallCoffeePrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(4);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			rso=replaceAll;
		}
  		
  		return rso;
  	}
	public String readRefillMediumCoffeePrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(5);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			rmo=replaceAll;
		}
  		
  		return rmo;
  	}
	public String readRefillLargeCoffeePrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(6);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			rlo=replaceAll;
		}
  		
  		return rlo;
  	}
	
	public String readRefillExtraLargeCoffeePrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(7);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			relo=replaceAll;
		}
  		
  		return relo;
  	}
	public String readSmallDarkRoastPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(8);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			sd=replaceAll;
		}
  		
  		return sd;
  	}
	public String readMediumDarkRoastPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(9);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			md=replaceAll;
		}
  		
  		return md;
  	}
	public String readLargeDarkRoastPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(10);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			ld=replaceAll;
		}
  		
  		return ld;
  	}
	public String readExtraLargeDarkRoastPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(11);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			eld=replaceAll;
		}
  		
  		return eld;
  	}
	public String readSmallRefillDarkRoastPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(12);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			rsd=replaceAll;
		}
  		
  		return rsd;
  	}
	public String readMediumRefillDarkRoastPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(13);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			rmd=replaceAll;
		}
  		
  		return rmd;
  	}
	public String readLargeRefillDarkRoastPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(14);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			rld=replaceAll;
		}
  		
  		return rld;
  	}
	public String readExtraLargeRefillDarkRoastPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(15);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			reld=replaceAll;
		}
  		
  		return reld;
  	}
	public String readSmallDecafPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(16);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			sdc=replaceAll;
		}
  		
  		return sdc;
  	}
	public String readMediumDecafPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(17);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			mdc=replaceAll;
		}
  		
  		return mdc;
  		
  	}
	
	public String readLargeDecafPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(18);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			ldc=replaceAll;
		}
  		
  		return ldc;
  		
  	}
	
	public String readExtraLargeDecafPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(19);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			eldc=replaceAll;
		}
  		
  		return eldc;
  		
  	}
	public String readSmallRefillDecafPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(20);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			rsdc=replaceAll;
		}
  		
  		return rsdc;
  	}
	public String readMediumRefillDecafPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(21);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			rmdc=replaceAll;
		}
  		
  		return rmdc;
  	}
	public String readLargeRefillDecafPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(22);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			rldc=replaceAll;
		}
  		
  		return rldc;
  	}
	public String readExtraLargeRefillDecafPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(23);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			reldc=replaceAll;
		}
  		
  		return reldc;
  	}

	public String readSausageBiscuitPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(7);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			sb=replaceAll;
		}
  		
  		return sb;
  	}

	public String readBaconBeltBagelPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(2);
  		Cell cell = row.getCell(7);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			bbb=replaceAll;
		}
  		
  		return bbb;
  	}
	public String readSmallSpecialityTeaPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(5);
  		Cell cell = row.getCell(7);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			bbb=replaceAll;
		}
  		
  		return bbb;
  	}
	public String readMediumSpecialityTeaPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(6);
  		Cell cell = row.getCell(7);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			bbb=replaceAll;
		}
  		
  		return bbb;
  	}
	public String readSteepedTeaSmallPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(7);
  		Cell cell = row.getCell(7);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			bbb=replaceAll;
		}
  		
  		return bbb;
  	}
	public String readSteepedTeaMediumPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(8);
  		Cell cell = row.getCell(7);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			bbb=replaceAll;
		}
  		
  		return bbb;
  	}
	public String readSteepedTeaLargePrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(9);
  		Cell cell = row.getCell(7);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			bbb=replaceAll;
		}
  		
  		return bbb;
  	}
	
	public String readSteepedTeaExtraLargePrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(10);
  		Cell cell = row.getCell(7);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			bbb=replaceAll;
		}
  		
  		return bbb;
  	}
	public String readSteepedTeaSmallRefillPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(11);
  		Cell cell = row.getCell(7);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			bbb=replaceAll;
		}
  		
  		return bbb;
  	}
	public String readSteepedTeaMediumRefillPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(12);
  		Cell cell = row.getCell(7);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			bbb=replaceAll;
		}
  		
  		return bbb;
  	}
	public String readSteepedTeaLargeRefillPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(13);
  		Cell cell = row.getCell(7);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			bbb=replaceAll;
		}
  		
  		return bbb;
  	}
	
	public String readSteepedTeaExtraLargeRefillPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(14);
  		Cell cell = row.getCell(7);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			bbb=replaceAll;
		}
  		
  		return bbb;
  	}
	public String readSmallLattePrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(15);
  		Cell cell = row.getCell(7);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			bbb=replaceAll;
		}
  		
  		return bbb;
  	}
	public String readMediumLattePrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(16);
  		Cell cell = row.getCell(7);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			bbb=replaceAll;
		}
  		
  		return bbb;
  	}
	public String readLargeLattePrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(17);
  		Cell cell = row.getCell(7);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			bbb=replaceAll;
		}
  		
  		return bbb;
  	}
	public String readAssortedDonutPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(24);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			ad=replaceAll;
		}
  		
  		return ad;
  	}
	public String readAssortedPremiumPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(25);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			ap=replaceAll;
		}
  		
  		return ap;
  	}
	public String readAssortedHalfDozenPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(21);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			ap=replaceAll;
		}
  		
  		return ap;
  	}
	public String readAssortedDozenPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(22);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			ap=replaceAll;
		}
  		
  		return ap;
  	}
	public String readBlueberryTimbitPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(26);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			bt=replaceAll;
		}
  		
  		return bt;
  	}
	public String readBlueberryMuffinPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(27);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			bm1=replaceAll;
		}
  		
  		return bm1;
  	}
	public String readChocolateCookiesPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(28);
  		Cell cell = row.getCell(4);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			bm1=replaceAll;
		}
  		
  		return bm1;
  	}
	
	
	
	public static int readClassicDonutPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(2);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		return 0;
  	}
	public static int readMapleButterPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(20);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		return 0;
  	}
	public static int readIcedCoffeePrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(4);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		return 0;
  	}
	public static int readSpecialityTeaPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(5);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		return 0;
  	}
	public static int readVanillaIcedLattePrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(6);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		return 0;
  	}
	public static int readVanillaCreamColdBrewPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(7);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		return 0;
  	}
	public static int readBottleWaterPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(8);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		return 0;
  	}
	public static int readEggCheeseBiscuitPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(1);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		return 0;
  	}
	public static int readBaconFarmersBiscuitPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(9);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		return 0;
  	}
	public static int readBaconFarmersWrapPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(10);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		return 0;
  	}
	public static int readBaconBeltPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(11);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		return 0;
  	}
	public static String readTurkeyBaconClubPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(12);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		return tbc;
  	}
	public static int readHamMeltPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(13);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		return 0;
  	}
	public static int readCrispyCilantroWrapPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(14);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		return 0;
  	}
	public static int readChickenNoodlePrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(15);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		return 0;
  	}
	public static int readGrainPreparedBagelPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(16);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		return 0;
  	}
	public static int readTimbits10Price() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(17);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		return 0;
  	}
	public static int readHashbrownPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(18);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		return 0;
  	}
	public static int readCeramicMugPrice() throws IOException
  	{
  		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(19);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			double numericCellValue = cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  		}
  		return 0;
  	}
	public String readReleaseId() throws IOException
    {
        /*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
        FileInputStream fis = new FileInputStream(f);
        Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(1);
  		Cell cell = row.getCell(2);
  		CellType typeofCell = cell.getCellType();  
  		if(typeofCell.equals(CellType.NUMERIC))
  		{
  			int numericCellValue = (int) cell.getNumericCellValue();
  			System.out.println(numericCellValue);
  			r=numericCellValue;
  		}
  		else if (typeofCell.equals(CellType.STRING)) 
  		{
			String stringCellValue = cell.getStringCellValue();
			String replaceAll = stringCellValue.replaceAll("\\s", "");
			System.out.println(replaceAll);
			bm1=replaceAll;
		}
  		
        return bm1;
         
    }
	
//	public static String readBundlingItemName() throws IOException
//    {
//        /*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
//        FileInputStream fis = new FileInputStream(f);
//          Workbook wb = new XSSFWorkbook(fis);*/
//          Sheet a = wb.geta(1);
//          Row row = a.getRow(5);
//          Cell cell = row.getCell(1);
//          CellType typeofCell = cell.getCellType();
//          if(typeofCell.equals(CellType.STRING))
//          {
//              String stringCellValue = cell.getStringCellValue();
//              System.out.println(stringCellValue);
//          }
//        return null;
//          }
	//Newly added
	public  String  readSmallIcedCappuccinoPrice() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(30);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	public  String  readMediumIcedCappuccinoPrice() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(31);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	public  String  readLargeIcedCappuccinoPrice() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(32);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	public  String  readSmallRefilIcedCappuccinoPrice() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(33);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	public  String  readMediumRefilIcedCappuccinoPrice() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(34);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	public  String  readLargeRefilIcedCappuccinoPrice() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(35);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	public  String  readSmallIcedCappuccinoLightPrice() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(36);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	public  String readMediumIcedCappuccinoLightPrice() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(37);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	
	public  String readLargeIcedCappuccinoLight() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);*/
		Sheet a=sheet_No();
		Row row = a.getRow(38);
		Cell cell = row.getCell(10);
		CellType typeofCell = cell.getCellType(); 
		String numericCellValue="";
		if(typeofCell.equals(CellType.STRING))
		{
			numericCellValue = cell.getStringCellValue();
			//System.out.println(numericCellValue);
		}
		return numericCellValue;


	}
	public  String  readSmallRefilIcedCappuccinoLightPrice() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(39);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	public  String  readMediumRefilIcedCappuccinoLightPrice() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(40);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	
	
	public  String  readLargeRefilIcedCappuccinoLight() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(41);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	
	
	public  String readSmallMochaIcedCappuccino() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(42);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	
	
	
	public  String readMediumMochaIcedCappuccino()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(43);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	public  String readLargeMochaIcedCappuccino()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(44);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	public  String readSmallRefilMochaIcedCappuccino()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(45);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	public  String  readMediumRefilMochaIcedCappuccino()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(46);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	public  String readLargeRefilMochaIcedCappuccino()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(47);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	public  String readSmallVaniliaIcedCappuccino()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(48);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	public  String readMediumVaniliaIcedCappuccino()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(49);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	public  String readLargeVaniliaIcedCappuccino()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(50);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	public  String readSmallRefilVaniliaIcedCappuccino()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(51);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	public  String readMediumRefilVaniliaIcedCappuccino()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(52);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	public  String readLargeRefilVaniliaIcedCappuccino()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(53);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}


	
	public  String read_Dnt_honey_crueller_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(1);
  		Cell cell = row.getCell(15);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	
	public  String read_dnt_old_fashioned_plain_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(2);
  		Cell cell = row.getCell(15);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          

	}
	
	
	
	public  String read_dnt__sour_cream_glazed_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(3);
  		Cell cell = row.getCell(15);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          
	}

	public  String read_dnt_chocolate_glazed_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(4);
  		Cell cell = row.getCell(15);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          
	}
	public  String read_dnt_honey_dip_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(5);
  		Cell cell = row.getCell(15);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          
	}
	public  String read_dnt_boston_cream_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(6);
  		Cell cell = row.getCell(15);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          
	}
	
	public  String read_dnt_apple_fritter_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(7);
  		Cell cell = row.getCell(15);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          
	}
	public  String 	read_dnt_chocolate_dip_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(8);
  		Cell cell = row.getCell(15);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          
	}
	public  String 	read_dnt_double_chocolate_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(9);
  		Cell cell = row.getCell(15);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	          
	}
	public  String 	read_dnt_vanilla_dip_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(10);
  		Cell cell = row.getCell(15);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
  		
  		public String read_Sea_Salt_Wedges_price() throws IOException 

  		{ 

  		Sheet a=sheet_No(); 

  		  		Row row = a.getRow(13); 

  		  		Cell cell = row.getCell(15); 

  		  		CellType typeofCell = cell.getCellType();  

  		  		String numericCellValue=""; 

  		  		if(typeofCell.equals(CellType.STRING)) 

  		  		{ 

  		  		  numericCellValue = cell.getStringCellValue(); 

  		  			//System.out.println(numericCellValue); 

  		  		} 

  		  		return numericCellValue; 

  		} 
  		
  		public String read_Plain_Croissant_price() throws IOException 

  		{ 

  		Sheet a=sheet_No(); 

  		  		Row row = a.getRow(14); 

  		  		Cell cell = row.getCell(15); 

  		  		CellType typeofCell = cell.getCellType();  

  		  		String numericCellValue=""; 

  		  		if(typeofCell.equals(CellType.STRING)) 

  		  		{ 

  		  		  numericCellValue = cell.getStringCellValue(); 

  		  			//System.out.println(numericCellValue); 

  		  		} 

  		  		return numericCellValue; 

  		} 
  		
	public  String 	SM_Americano_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(48);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	public  String 	MD_Americano_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(49);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	public  String 	LG_Americano_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(50);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	public  String 	RS_Americano_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(51);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	public  String 	RM_Americano_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(52);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	public  String 	RL_Americano_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(53);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	public  String 	MD_Redeye_Iced_Capp_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(54);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	public  String 	LG_Redeye_Iced_Capp_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(55);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	public  String 	RM_Redeye_Iced_Capp_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(56);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	public  String 	RL_Redeye_Iced_Capp_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(57);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	public  String 	SM_Tea_Latte_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(58);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	public  String 	MD_Tea_Latte_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(59);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	public  String 	LG_Tea_Latte_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(60);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	public  String 	RS_Tea_Latte_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(61);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	public  String 	RM_Tea_Latte_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(62);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	public  String 	RL_Tea_Latte_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(63);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
    
	public  String 	SM_London_Fog_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(64);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	
	public  String 	MD_London_Fog_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(65);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	
	public  String 	LG_London_Fog_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(66);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	
	public  String 	RS_London_Fog_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(67);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	
	public  String 	RM_London_Fog_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(68);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	
	public  String 	RL_London_Fog_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(69);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	public  String 	Cls_Delv_Bndl_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(21);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	
	public  String 	Frm_Delv_Bndl_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(22);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	
	public  String 	Cls_Delv_Bndl_F2_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(23);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}

	public  String 	Frm_Delv_Bndl_F2_price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(24);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
  		
	}
	public  String 	Bgl_Sesame_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(1);
  		Cell cell = row.getCell(18);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	public  String 	Bgl_Everything_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(2);
  		Cell cell = row.getCell(18);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	public  String 	Bgl_CINNAMON_RAISIN_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(3);
  		Cell cell = row.getCell(18);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	public  String 	Bgl_Bluberry_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(4);
  		Cell cell = row.getCell(18);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public  String 	Bgl_12Grain_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(5);
  		Cell cell = row.getCell(18);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public  String 	Bgl_Plain_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(6);
  		Cell cell = row.getCell(18);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}

	public String read_Region_Id()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(3);
  		Cell cell = row.getCell(2);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Bacon_English_Muffin_Combo_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(2);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}



	public String  read_Bacon_Biscuit_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(3);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	public String  read_Bacon_Bagel_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(4);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String  read_Bacon_Classic_Wrap_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(5);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Bacon_Farmers_Wrap_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(6);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	
	public String read_Sausage_English_Muffin_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(7);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Sausage_Biscuit_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(8);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Sausage_Bagel_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(9);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Sausage_Classic_Wrap_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(10);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Sausage_Farmers_Wrap_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(11);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}

	public String read_Egg_Cheese_English_Muffin_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(12);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Egg_Cheese_Biscuit_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(13);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Egg_Cheese_Bagel_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(14);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}

	public String read_Sausage_Bacon_English_Muffin_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(15);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Sausage_Bacon_Biscuit_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(16);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Sausage_Bacon_Bagel_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(17);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Sausage_Bacon_Classic_Wrap_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(18);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Bacon_Croissant_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(19);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}

	public String read_Bacon_Belt_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(20);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}

	public String read_Sausage_Croissant_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(21);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}

	public String read_Sausage_Belt_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(22);
  		Cell cell = row.getCell(22);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Turkey_Bacon_Club_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(2);
  		Cell cell = row.getCell(24);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Grilled_Cheese_Melt_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(3);
  		Cell cell = row.getCell(24);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Slow_Cooked_Chicken_Wrap_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(4);
  		Cell cell = row.getCell(24);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Crispy_Chicken_Wrap_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(5);
  		Cell cell = row.getCell(24);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_ThreePC_Chicken_Strips_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(6);
  		Cell cell = row.getCell(24);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Ham_and_Cheddar_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(7);
  		Cell cell = row.getCell(24);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Bacon_Grilled_Cheese_Melt_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(8);
  		Cell cell = row.getCell(24);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}

	public String read_BLT_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(9);
  		Cell cell = row.getCell(24);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}

	public String read_Turkey_Melt_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(10);
  		Cell cell = row.getCell(24);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Slow_Cooked_Chkn_Bacon_Ranch_Wrap_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(11);
  		Cell cell = row.getCell(24);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Crispy_Chk_Bacon_Ranch_Wrap_Combo_price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(12);
  		Cell cell = row.getCell(24);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	
	public String  read_Bacon_English_Muffin_Sandwich_Price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(2);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	

	
	public String read_Sausage_English_Muffin_Sandwich_Price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(3);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	public String read_Egg_and_Cheese_English_Muffin_Sandwich_Price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(4);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	public String read_Sausage_and_Bacon_English_Muffin_Sandwich_Price() throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(5);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	public String read_Bacon_Biscuit_Sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(6);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	//*******Noodles & Chilis*******
	
	public String read_RGChickenNoodleSoup_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(2);
  		Cell cell = row.getCell(31);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_LGChickenNoodleSoup_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(3);
  		Cell cell = row.getCell(31);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_RGChili_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(4);
  		Cell cell = row.getCell(31);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_LGChili_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(5);
  		Cell cell = row.getCell(31);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_SMBeans_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(6);
  		Cell cell = row.getCell(31);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_RGBeans_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(7);
  		Cell cell = row.getCell(31);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Egg_and_Cheese_Biscuit_Sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(8);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Sausage_Bacon_Biscuit_Sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(9);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Bacon_Bagel_Sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(10);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Sausage_Bagel_Sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(11);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Egg_Cheese_Bagel_Sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(12);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Sausage_Bacon_Bagel_Sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(13);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Bacon_Croissant_Sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(14);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Sausage_Croissant_Sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(15);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Egg_Cheese_Croissant_Sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(16);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Sausage_Bacon_Croissant_Sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(17);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Bacon_Everything_Croissant_Sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(18);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}

	public String read_Sausage_Everything_Croissant_Sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(19);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Egg_Cheese_Everything_Croissant_Sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(20);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Simply_Sausage_English_Muffin_Sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(21);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Simply_Sausage_Biscuit_Sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(22);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}

	public String read_Steak_English_Muffin_Sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(23);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}

	public String read_Steak_Biscuit_Sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(24);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Smoky_Honey_Bacon_Biscuit_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(25);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Smoky_Honey_Bacon_English_Muffin_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(26);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Simply_SmokyHoney_Bacon_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(27);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}

	public String read_Simply_Bacon_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(27);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Simply_Steak_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(28);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Simply_Sausage_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(29);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Egg_Breakfast_sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(30);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Bacon_Breakfast_sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(31);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Sausage_Breakfast_sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(32);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Steak_Breakfast_sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(33);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_SmokyHoney_Bacon_Breakfast_sandwich_Price()throws IOException
	{
		/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);*/
  		Sheet a=sheet_No();
  		Row row = a.getRow(34);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	//******Lunch Wraps******
	
	public String read_Slow_Cooked_Chicken_Wrap_Price()throws IOException
	{
		 Sheet a=sheet_No();
  		Row row = a.getRow(2);
  		Cell cell = row.getCell(34);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Crispy_Chicken_Wrap_Price()throws IOException
	{
		 Sheet a=sheet_No();
		Row row = a.getRow(3);
  		Cell cell = row.getCell(34);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Slow_Cooked_Chkn_Bacon_Ranch_Wrap_Price()throws IOException
	{
		 Sheet a=sheet_No();
		Row row = a.getRow(4);
  		Cell cell = row.getCell(34);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Crispy_Chk_Bacon_Ranch_Wrap_Price()throws IOException
	{
		 Sheet a=sheet_No();
  		Row row = a.getRow(5);
  		Cell cell = row.getCell(34);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Spicy_Chickn_Bacon_Ranch_Wrap_Price()throws IOException
	{
		 Sheet a=sheet_No();
  		Row row = a.getRow(6);
  		Cell cell = row.getCell(34);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	//********BreakFast Alc********
	
	public String read_Turkey_Bacon_Club_Price()throws IOException
	{
		 Sheet a=sheet_No();
  		Row row = a.getRow(1);
  		Cell cell = row.getCell(37);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Roast_Beef_Cheddar_Price()throws IOException
	{
		 Sheet a=sheet_No();
  		Row row = a.getRow(2);
  		Cell cell = row.getCell(37);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Bacon_Grilled_Cheese_Melt_Price()throws IOException
	{
		 Sheet a=sheet_No();
  		Row row = a.getRow(3);
  		Cell cell = row.getCell(37);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Turkey_Melt_Price()throws IOException
	{
		 Sheet a=sheet_No();
  		Row row = a.getRow(4);
  		Cell cell = row.getCell(37);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Ham_Melt_Price()throws IOException
	{
		 Sheet a=sheet_No();
  		Row row = a.getRow(5);
  		Cell cell = row.getCell(37);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_small_Pumpkin_Spice_Iced_Capp_Price() throws IOException 

	{ 

		 Sheet a=sheet_No(); 

	  		Row row = a.getRow(70); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	 

	public String read_medium_Pumpkin_Spice_Iced_Capp_Price() throws IOException 

	{ 

		 Sheet a=sheet_No();

	  		Row row = a.getRow(71); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	 

	public String read_large_Pumpkin_Spice_Iced_Capp_Price() throws IOException 

	{ 

		 Sheet a=sheet_No(); 

	  		Row row = a.getRow(72); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	 

	public String read_Refil_Small_Pumpkin_Spice_Iced_Capp_Price() throws IOException 

	{ 

		 Sheet a=sheet_No();

	  		Row row = a.getRow(73); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	 

	 

	public String read_Refil_Medium_Pumpkin_Spice_Iced_Capp_Price() throws IOException 

	{ 

		 Sheet a=sheet_No();
	
	  		Row row = a.getRow(74); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	 

	public String read_Refil_Large_Pumpkin_Spice_Iced_Capp_Price() throws IOException 

	{ 

	/*/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx"); 

	  		FileInputStream fis = new FileInputStream(f); 

	  		Workbook wb = new XSSFWorkbook(fis);*/ 

	  		
	        
	        Sheet a=sheet_No();

	  		Row row = a.getRow(75); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_Small_Redeye_Iced_Capp() throws IOException 

	{ 

	/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx"); 

	  		FileInputStream fis = new FileInputStream(f); 

	  		Workbook wb = new XSSFWorkbook(fis);*/ 

	  		Sheet a=sheet_No(); 

	  		Row row = a.getRow(76); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	 

	public String read_Refil_Small_Redeye_Iced_Capp() throws IOException 

	{ 

	/*File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx"); 

	  		FileInputStream fis = new FileInputStream(f); 

	  		Workbook wb = new XSSFWorkbook(fis);*/ 

	  		
		    //sheet_No();

	  		Sheet a=sheet_No();
			Row row = a.getRow(77);

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 
	
	
	//edited from here .
	
	public String read_Small_Caramel_Iced_Capp_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(78);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 

	public String read_Medium_Caramel_Iced_Capp_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(79);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 
	public String read_Large_Caramel_Iced_Capp_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(80);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 
	 
    
	public String read_Rifil_Small_Caramel_Iced_Capp_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(81);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 
	 
	public String read_Rifil_Medium_Caramel_Iced_Capp_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(82);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 

	public String read_Rifil_Large_Caramel_Iced_Capp_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(83);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 
	
	
	public String read_Small_Vanila_Iced_Capp_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(84);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 
	
	public String read_Medium_Vanila_Iced_Capp_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(85);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 
	
	public String read_Large_Vanila_Iced_Capp_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(86);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 

	public String read_Refil_Small_Vanila_Iced_Capp_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(87);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 
	
	public String read_Refil_Medium_Vanila_Iced_Capp_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(88);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 
	
	public String read_Refil_Large_Vanila_Iced_Capp_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(89);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 


	public String read_Small_Chocolate_Creamy_Chill_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(90);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 

	public String read_Medium_Chocolate_Creamy_Chill_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(91);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 

	public String read_Large_Chocolate_Creamy_Chill_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(92);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 

	public String read_Refil_Small_Chocolate_Creamy_Chill_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(93);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 

	public String read_Refil_Medium_Chocolate_Creamy_Chill_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(94);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 
	
	public String read_Refil_Large_Chocolate_Creamy_Chill_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(95);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 

	public String read_Small_Vanilla_Creamy_Chill_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(96);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 
	
	public String read_Medium_Vanilla_Creamy_Chill_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(97);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 

	public String read_Large_Vanilla_Creamy_Chill_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(98);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 

	public String read_Refil_Small_Vanilla_Creamy_Chill_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(99);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 

	public String read_Refil_Medium_Vanilla_Creamy_Chill_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(100);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 

	public String  read_Refil_Large_Vanilla_Creamy_Chill_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(101);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 


	public String  read_Small_Strawberry_Creamy_Chill_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(102);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 


	public String  read_Medium_Strawberry_Creamy_Chill_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(103);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 


	public String  read_Large_Strawberry_Creamy_Chill_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(104);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 


	public String  read_Refil_Small_Strawberry_Creamy_Chill_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(105);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 


	public String  read_Refil_Medium_Strawberry_Creamy_Chill_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(106);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 


	public String  read_Refil_Large_Strawberry_Creamy_Chill_Price() throws IOException 

	{ 

	  		Sheet a=sheet_No();
			Row row = a.getRow(107);
			Cell cell = row.getCell(10);
			CellType typeofCell = cell.getCellType();  
			String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 
	  			numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 
	  		  } 

	  		return numericCellValue; 
	  		} 
	
	public String read_Small_Orginal_Lemonade_Price()throws IOException
	{
//		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
//  		FileInputStream fis = new FileInputStream(f);
//  		Workbook wb = new XSSFWorkbook(fis);
//  		Sheet sheetAt = wb.getSheetAt(0);
		Sheet a=sheet_No();
  		Row row = a.getRow(108);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Medium_Original_Lemonade_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(109);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Large_Original_Lemonade_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(110);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	
	public String read_Refill_Small_Original_Lemonade_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(111);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Refill_Medium_Original_Lemonade_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(112);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Refil_Large_Original_Lemonade_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(113);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Small_Strawberry_Lemonade_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(114);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Medium_Strawberry_Lemonade_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(115);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	public String read_Large_Strawberry_Lemonade_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(116);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Refill_Small_Strawberry_Lemonade_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(117);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	public String read_Refill_Medium_Strawberry_Lemonade_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(118);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Refill_Large_Strawberry_Lemonade_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(119);
  		Cell cell = row.getCell(10);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Small_Fruit_Smoothie_Strawberry_Price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(120); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	public String read_Medium_Fruit_Smoothie_Strawberry_Price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(121); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	public String read_Large_Fruit_Smoothie_Strawberry_Price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(122); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	public String read_Refil_Small_Fruit_Smoothie_Strawberry_Price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(123); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	public String read_Refil_Medium_Fruit_Smoothie_Strawberry_Price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(124); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	public String read_Refil_Large_Fruit_Smoothie_Strawberry_Price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(125); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	public String read_Small_Classic_Lemonade_Price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(126); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	public String read_Medium_Classic_Lemonade_Price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(127); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	public String read_Large_Classic_Lemonade_Price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(128); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	public String read_Refil_Small_Classic_Lemonade_Price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(129); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	public String read_Refil_Medium_Classic_Lemonade_Price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(130); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	public String read_Refil_Large_Classic_Lemonade_Price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(131); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_Omelette_Bites_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(36);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	public String read_Brk_Wrap_Bacon_Grilled_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(37);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	public String read_Brk_Wrap_Bacon_Grilled_No_Egg_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(38);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Brk_Wrap_Egg_Grilled_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(39);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	public String read_Brk_Wrap_Sausage_Grilled_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(40);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	public String read_Brk_Wrap_Sausage_Grilled_No_Egg_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(41);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	public String read_Retro_Half_Dozen_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(11);
  		Cell cell = row.getCell(15);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}	
	public String read_Retro_Dozen_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(12);
  		Cell cell = row.getCell(15);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Small_Baileys_Iced_Capp_Price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(132); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	 

	public String read_Medium_Baileys_Iced_Capp_Price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(133); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	 

	public String read_Large_Baileys_Iced_Capp_Price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(134); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	 

	public String read_Refil_Small_Baileys_Iced_Capp_Price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(135); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	 

	public String read_Refil_Medium_Baileys_Iced_Capp_Price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(136); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 

	 

	public String read_Refil_Large_Baileys_Iced_Capp_Price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(137); 

	  		Cell cell = row.getCell(10); 

	  		CellType typeofCell = cell.getCellType();  

	  		String numericCellValue=""; 

	  		if(typeofCell.equals(CellType.STRING)) 

	  		{ 

	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue); 

	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_Cater_Turkey_Bacon_Club_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(1);
  		Cell cell = row.getCell(41);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			System.out.println("value"+numericCellValue);
  		}
  		return numericCellValue;
	}
	
	
	
	public String read_Cater_Crispy_Chicken_Bacon_Ranch_Wrap_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(2);
  		Cell cell = row.getCell(41);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	
	
	
	public String read_Cater_Slow_Cooked_Chicken_Bacon_Ranch_Wrap_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(3);
  		Cell cell = row.getCell(41);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println("value"+numericCellValue);
  		}
  		return numericCellValue;
	}
	
	
	
	
	public String read_Cater_Egg_and_Cheese_Wrap_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(4);
  		Cell cell = row.getCell(41);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Cater_Lunch_Wrap12_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(5);
  		Cell cell = row.getCell(41);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}

	public String read_Cater_Lunch_Wrap6_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(6);
  		Cell cell = row.getCell(41);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}

	
	public String read_Smokey_Hny_Bcn_Brk_Sandwich_Biscuit_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(25);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Smokey_Hny_Bcn_Brk_Sandwich_Muffin_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(26);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Smokey_Hny_Bcn_Frm_Brk_Sandwich_Muffin_Price()throws IOException
	{

		Sheet a=sheet_No();
  		Row row = a.getRow(43);
  		Cell cell = row.getCell(28);
  		CellType typeofCell = cell.getCellType(); 
  		String numericCellValue="";
  		if(typeofCell.equals(CellType.STRING))
  		{
  		  numericCellValue = cell.getStringCellValue();
  			//System.out.println(numericCellValue);
  		}
  		return numericCellValue;
	}
	
	public String read_Craveables_Bundle_price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(42); 
	  		Cell cell = row.getCell(28); 
	  		CellType typeofCell = cell.getCellType();  
	  		String numericCellValue=""; 
	  		if(typeofCell.equals(CellType.STRING)) 
	  		{ 
	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue);
	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_SMHotChocolate_price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(138); 
	  		Cell cell = row.getCell(10); 
	  		CellType typeofCell = cell.getCellType();  
	  		String numericCellValue=""; 
	  		if(typeofCell.equals(CellType.STRING)) 
	  		{ 
	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue);
	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_MDHotChocolate_price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(139); 
	  		Cell cell = row.getCell(10); 
	  		CellType typeofCell = cell.getCellType();  
	  		String numericCellValue=""; 
	  		if(typeofCell.equals(CellType.STRING)) 
	  		{ 
	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue);
	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_LGHotChocolate_price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(140); 
	  		Cell cell = row.getCell(10); 
	  		CellType typeofCell = cell.getCellType();  
	  		String numericCellValue=""; 
	  		if(typeofCell.equals(CellType.STRING)) 
	  		{ 
	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue);
	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_XLHotChocolate_price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(141); 
	  		Cell cell = row.getCell(10); 
	  		CellType typeofCell = cell.getCellType();  
	  		String numericCellValue=""; 
	  		if(typeofCell.equals(CellType.STRING)) 
	  		{ 
	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue);
	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_RSHotChocolate_price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(142); 
	  		Cell cell = row.getCell(10); 
	  		CellType typeofCell = cell.getCellType();  
	  		String numericCellValue=""; 
	  		if(typeofCell.equals(CellType.STRING)) 
	  		{ 
	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue);
	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_RMHotChocolate_price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(143); 
	  		Cell cell = row.getCell(10); 
	  		CellType typeofCell = cell.getCellType();  
	  		String numericCellValue=""; 
	  		if(typeofCell.equals(CellType.STRING)) 
	  		{ 
	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue);
	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_RLHotChocolate_price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(144); 
	  		Cell cell = row.getCell(10); 
	  		CellType typeofCell = cell.getCellType();  
	  		String numericCellValue=""; 
	  		if(typeofCell.equals(CellType.STRING)) 
	  		{ 
	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue);
	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_RXLHotChocolate_price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(145); 
	  		Cell cell = row.getCell(10); 
	  		CellType typeofCell = cell.getCellType();  
	  		String numericCellValue=""; 
	  		if(typeofCell.equals(CellType.STRING)) 
	  		{ 
	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue);
	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_SSHotChocolate_price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(146); 
	  		Cell cell = row.getCell(10); 
	  		CellType typeofCell = cell.getCellType();  
	  		String numericCellValue=""; 
	  		if(typeofCell.equals(CellType.STRING)) 
	  		{ 
	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue);
	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_BRHotChocolate_price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(147); 
	  		Cell cell = row.getCell(10); 
	  		CellType typeofCell = cell.getCellType();  
	  		String numericCellValue=""; 
	  		if(typeofCell.equals(CellType.STRING)) 
	  		{ 
	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue);
	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_T12HotChocolate_price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(148); 
	  		Cell cell = row.getCell(10); 
	  		CellType typeofCell = cell.getCellType();  
	  		String numericCellValue=""; 
	  		if(typeofCell.equals(CellType.STRING)) 
	  		{ 
	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue);
	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_SM_White_HotChocolate_price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(149); 
	  		Cell cell = row.getCell(10); 
	  		CellType typeofCell = cell.getCellType();  
	  		String numericCellValue=""; 
	  		if(typeofCell.equals(CellType.STRING)) 
	  		{ 
	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue);
	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_MD_White_HotChocolate_price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(150); 
	  		Cell cell = row.getCell(10); 
	  		CellType typeofCell = cell.getCellType();  
	  		String numericCellValue=""; 
	  		if(typeofCell.equals(CellType.STRING)) 
	  		{ 
	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue);
	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_LG_White_HotChocolate_price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(151); 
	  		Cell cell = row.getCell(10); 
	  		CellType typeofCell = cell.getCellType();  
	  		String numericCellValue=""; 
	  		if(typeofCell.equals(CellType.STRING)) 
	  		{ 
	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue);
	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_XL_White_HotChocolate_price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(152); 
	  		Cell cell = row.getCell(10); 
	  		CellType typeofCell = cell.getCellType();  
	  		String numericCellValue=""; 
	  		if(typeofCell.equals(CellType.STRING)) 
	  		{ 
	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue);
	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_RS_White_HotChocolate_price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(153); 
	  		Cell cell = row.getCell(10); 
	  		CellType typeofCell = cell.getCellType();  
	  		String numericCellValue=""; 
	  		if(typeofCell.equals(CellType.STRING)) 
	  		{ 
	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue);
	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_RM_White_HotChocolate_price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(154); 
	  		Cell cell = row.getCell(10); 
	  		CellType typeofCell = cell.getCellType();  
	  		String numericCellValue=""; 
	  		if(typeofCell.equals(CellType.STRING)) 
	  		{ 
	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue);
	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_RL_White_HotChocolate_price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(155); 
	  		Cell cell = row.getCell(10); 
	  		CellType typeofCell = cell.getCellType();  
	  		String numericCellValue=""; 
	  		if(typeofCell.equals(CellType.STRING)) 
	  		{ 
	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue);
	  		} 

	  		return numericCellValue; 

	} 
	
	public String read_RXL_White_HotChocolate_price() throws IOException 

	{ 

	Sheet a=sheet_No(); 

	  		Row row = a.getRow(156); 
	  		Cell cell = row.getCell(10); 
	  		CellType typeofCell = cell.getCellType();  
	  		String numericCellValue=""; 
	  		if(typeofCell.equals(CellType.STRING)) 
	  		{ 
	  		  numericCellValue = cell.getStringCellValue(); 

	  			//System.out.println(numericCellValue);
	  		} 

	  		return numericCellValue; 

	} 


	




public static void main(String[] args) throws IOException
{
Read_Data rd = new Read_Data();
//rd.readOrderDetailName();
//rd.readButtonName();
//rd.readComboFormationName();
//rd.readModifierName();
rd.readIcedCoffeePrice();
rd.readReleaseId();
//rd.readBundlingItemName();
rd.readEggCheeseBiscuitPrice();
rd.readSMOriginalBlendPrice();
rd.readMdOriginalBlendPrice();
rd.readLGOriginalBlendPrice();
rd.readRefillSmallCoffeePrice();
rd.readRefillMediumCoffeePrice();
rd.readRefillLargeCoffeePrice();
rd.readRefillExtraLargeCoffeePrice();
rd.readSmallDarkRoastPrice();
rd.readMediumDarkRoastPrice();
rd.readLargeDarkRoastPrice();
rd.readExtraLargeDarkRoastPrice();
rd.readSmallRefillDarkRoastPrice();
rd.readMediumRefillDarkRoastPrice();
rd.readLargeRefillDarkRoastPrice();
rd.readExtraLargeRefillDarkRoastPrice();
rd.readSmallDecafPrice();
rd.readMediumDecafPrice();
rd.readLargeDecafPrice();
rd.readExtraLargeDecafPrice();
rd.readSmallRefillDecafPrice();
rd.readMediumRefillDecafPrice();
rd.readLargeRefillDecafPrice();
rd.readExtraLargeRefillDecafPrice();
rd.readAssortedDonutPrice();
rd.readAssortedPremiumPrice();
rd.readBlueberryMuffinPrice();
rd.readBlueberryTimbitPrice();
rd.readChocolateCookiesPrice();
rd.readSausageBiscuitPrice();
rd.readBaconBeltBagelPrice();
rd.readSmallSpecialityTeaPrice();
rd.readMediumSpecialityTeaPrice();
rd.readSteepedTeaExtraLargePrice();
rd.readSteepedTeaExtraLargeRefillPrice();
rd.readSteepedTeaLargePrice();
rd.readSteepedTeaLargeRefillPrice();
rd.readSteepedTeaMediumPrice();
rd.readSteepedTeaMediumRefillPrice();
rd.readSteepedTeaSmallPrice();
rd.readSteepedTeaSmallRefillPrice();
rd.readSmallLattePrice();
rd.readAssortedHalfDozenPrice();
rd.readAssortedDozenPrice();
Rectangle rectangle=new Rectangle();
rectangle.setBounds(10,10,10,10);
rd.capture(rectangle);
rd.readTurkeyBaconClubPrice();
}}

