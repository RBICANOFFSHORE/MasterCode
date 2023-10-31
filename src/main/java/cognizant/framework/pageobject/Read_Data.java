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
	
	public static String readOrderDetailName() throws IOException
	{
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(1);
  		Row row = sheetAt.getRow(2);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();
  		if(typeofCell.equals(CellType.STRING))
  		{
  			String stringCellValue = cell.getStringCellValue();
  			System.out.println(stringCellValue);
  		}
		return null;
  		}
	
	public static String readButtonName() throws IOException
	{
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(1);
  		Row row = sheetAt.getRow(1);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();
  		if(typeofCell.equals(CellType.STRING))
  		{
  			String stringCellValue = cell.getStringCellValue();
  			System.out.println(stringCellValue);
  		}
		return null;
  		}
	public static String readComboFormationName() throws IOException
	{
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(1);
  		Row row = sheetAt.getRow(4);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();
  		if(typeofCell.equals(CellType.STRING))
  		{
  			String stringCellValue = cell.getStringCellValue();
  			System.out.println(stringCellValue);
  		}
		return null;
  		}
	public static String readModifierName() throws IOException
	{
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(1);
  		Row row = sheetAt.getRow(3);
  		Cell cell = row.getCell(1);
  		CellType typeofCell = cell.getCellType();
  		if(typeofCell.equals(CellType.STRING))
  		{
  			String stringCellValue = cell.getStringCellValue();
  			System.out.println(stringCellValue);
  		}
		return null;
  		}
	public  String readSMOriginalBlendPrice() throws IOException
  	{
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(3);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(4);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(3);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(4);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(5);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(6);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(7);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(8);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(9);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(10);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(11);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(12);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(13);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(14);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(15);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(16);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(17);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(18);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(19);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(20);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(21);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(22);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(23);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(1);
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
			sb=replaceAll;
		}
  		
  		return sb;
  	}

	public String readBaconBeltBagelPrice() throws IOException
  	{
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(2);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(5);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(6);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(7);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(8);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(9);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(10);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(11);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(12);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(13);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(14);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(15);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(16);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(17);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(24);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(25);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(21);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(22);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(26);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(27);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(28);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(2);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(20);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(4);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(5);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(6);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(7);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(8);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(1);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(9);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(10);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(11);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(12);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(13);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(14);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(15);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(16);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(17);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(18);
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
  		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(19);
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
        File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
        FileInputStream fis = new FileInputStream(f);
        Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(1);
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
	
	public static String readBundlingItemName() throws IOException
    {
        File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
        FileInputStream fis = new FileInputStream(f);
          Workbook wb = new XSSFWorkbook(fis);
          Sheet sheetAt = wb.getSheetAt(1);
          Row row = sheetAt.getRow(5);
          Cell cell = row.getCell(1);
          CellType typeofCell = cell.getCellType();
          if(typeofCell.equals(CellType.STRING))
          {
              String stringCellValue = cell.getStringCellValue();
              System.out.println(stringCellValue);
          }
        return null;
          }
	//Newly added
	public  String  readSmallIcedCappuccinoPrice() throws IOException
	{
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(30);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(31);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(32);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(33);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(34);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(35);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(36);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(37);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(38);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(39);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(40);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(41);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(42);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(43);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(44);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(45);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(46);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(47);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(48);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(49);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(50);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(51);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(52);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(53);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(1);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(2);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(3);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(4);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(5);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(6);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(7);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(8);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(9);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(10);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(48);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(49);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(50);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(51);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(52);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(53);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(54);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(55);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(56);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(57);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(58);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(59);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(60);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(61);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(62);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(63);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(64);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(65);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(66);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(67);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(68);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(69);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(21);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(22);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(23);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(24);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(1);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(2);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(3);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(4);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(5);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(6);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(3);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(2);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(3);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(4);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(5);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(6);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(7);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(8);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(9);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(10);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(11);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(12);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(13);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(14);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(15);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(16);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(17);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(18);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(19);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(20);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(21);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(22);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(2);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(3);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(4);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(5);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(6);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(7);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(8);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(9);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(10);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(11);
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
		File f= new File(".\\TestDataSet\\Dataset_For_Read.xlsx");
  		FileInputStream fis = new FileInputStream(f);
  		Workbook wb = new XSSFWorkbook(fis);
  		Sheet sheetAt = wb.getSheetAt(0);
  		Row row = sheetAt.getRow(12);
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




    

public static void main(String[] args) throws IOException
{
Read_Data rd = new Read_Data();
rd.readOrderDetailName();
rd.readButtonName();
rd.readComboFormationName();
rd.readModifierName();
rd.readIcedCoffeePrice();
rd.readReleaseId();
rd.readBundlingItemName();
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

