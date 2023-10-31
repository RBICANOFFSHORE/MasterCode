package com.testcases.framework;

import java.awt.Rectangle;
import java.io.File;

import java.io.IOException;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import cognizant.framework.pageobject.BeverageItems;
import cognizant.framework.pageobject.BreakfastItems;
import cognizant.framework.pageobject.ExtentReporterNG;
import cognizant.framework.pageobject.LandingPage;
import cognizant.framework.pageobject.LunchItems;


import cognizant.framework.pageobject.SideItems1;
import cognizant.framework.pageobject.Bagels;
import cognizant.framework.pageobject.appClose;
import excel.Read_Data;
import net.sourceforge.tess4j.TesseractException;

public class Runner extends Read_Data  {
	
	
Screen s = new Screen();

ExtentReports extent;
ExtentSparkReporter html;
ExtentTest testcase;


public int i;
public int parseInt;
public int number;
public WebDriver wd;

  @Test
  public void appLogin() throws FindFailed, IOException, TesseractException, InterruptedException {
	  
	  
	  extent=new ExtentReports();
	    html= new ExtentSparkReporter("extent.html");
	    extent.attachReporter(html);
		
		
	LandingPage landingPage =new LandingPage(s);
	//landingPage.siKuliTestCase001(extent, testcase);
	
	//********OBJECTS********
	BreakfastItems breakfastsitem = new BreakfastItems(s);
	BeverageItems bevItem =new BeverageItems(s);
	SideItems1 D = new SideItems1(s);
	Bagels B = new Bagels(s);
	LunchItems L=new LunchItems(s);
	
	
	//****All Breakfast Items****
	
	//breakfastsitem.siKuliTestCase004(extent, testcase);
	//breakfastsitem.siKuliTestCase005(extent, testcase);
	//breakfastsitem.siKuliTestCase006(extent, testcase);
	//breakfastsitem.siKuliTestCase007(extent, testcase);
	/*breakfastsitem.siKuliTestCase002(extent, testcase);
	breakfastsitem.siKuliTestCase003(extent, testcase);*/
	
	//*****All Beverages*****
	
	/*bevItem.siKuliTestCase004(extent, testcase);
	bevItem.siKuliTestCase005(extent, testcase);
	bevItem.siKuliTestCase006(extent, testcase);
	bevItem.siKuliTestCase007(extent, testcase);
	bevItem.siKuliTestCase008(extent, testcase);
	bevItem.siKuliTestCase009(extent, testcase);
	bevItem.siKuliTestCase010(extent, testcase);
	bevItem.siKuliTestCase011(extent, testcase);
	bevItem.siKuliTestCase012(extent, testcase);
	bevItem.siKuliTestCase013(extent, testcase);
	bevItem.siKuliTestCase014(extent, testcase);
	bevItem.siKuliTestCase015(extent, testcase);
	bevItem.sikuliTestCase016(extent, testcase);
	bevItem.sikuliTestCase017(extent, testcase);
	bevItem.sikuliTestCase018(extent, testcase);
	bevItem.sikuliTestCase019(extent, testcase);
	bevItem.sikuliTestCase020(extent, testcase);
	bevItem.sikuliTestCase021(extent, testcase);
	bevItem.sikuliTestCase022(extent, testcase);
	
	bevItem.sikuliTestCase023(extent, testcase);
    bevItem.sikuliTestCase024(extent, testcase);
	bevItem.sikuliTestCase025(extent, testcase);
	bevItem.sikuliTestCase026(extent, testcase);
	bevItem.sikuliTestCase027(extent, testcase);
	bevItem.sikuliTestCase028(extent, testcase);
	bevItem.sikuliTestCase029(extent, testcase);
	bevItem.sikuliTestCase030(extent, testcase);
	bevItem.sikuliTestCase031(extent, testcase);
	bevItem.sikuliTestCase032(extent, testcase);
	bevItem.sikuliTestCase033(extent, testcase);
	bevItem.sikuliTestCase034(extent, testcase);
	bevItem.sikuliTestCase035(extent, testcase);
	bevItem.sikuliTestCase036(extent, testcase);
	bevItem.sikuliTestCase037(extent, testcase);
	bevItem.sikuliTestCase038(extent, testcase);
	bevItem.sikuliTestCase039(extent, testcase);
	bevItem.sikuliTestCase040(extent, testcase);
	bevItem.sikuliTestCase041(extent, testcase);
	bevItem.sikuliTestCase042(extent, testcase);
	bevItem.sikuliTestCase043(extent, testcase);
	bevItem.sikuliTestCase044(extent, testcase);
	bevItem.sikuliTestCase045(extent, testcase);
	bevItem.sikuliTestCase046(extent, testcase);
	bevItem.sikuliTestCase047(extent, testcase);
	bevItem.sikuliTestCase048(extent, testcase);
	bevItem.sikuliTestCase049(extent, testcase);
	bevItem.sikuliTestCase050(extent, testcase);
	bevItem.sikuliTestCase051(extent, testcase);
	bevItem.sikuliTestCase052(extent, testcase);
	bevItem.sikuliTestCase053(extent, testcase);
	bevItem.sikuliTestCase054(extent, testcase);
	bevItem.sikuliTestCase055(extent, testcase);
	bevItem.sikuliTestCase056(extent, testcase);
	bevItem.sikuliTestCase057(extent, testcase);
	bevItem.sikuliTestCase058(extent, testcase);
	bevItem.sikuliTestCase059(extent, testcase);
	bevItem.sikuliTestCase060(extent, testcase);
	bevItem.sikuliTestCase061(extent, testcase);
	bevItem.sikuliTestCase062(extent, testcase);*/
	
	
	
	/*LunchItems lunch =new LunchItems(s);
	lunch.sikuliTestCase029(extent,testcase);*/
	
	//*****All Side Items*****
	
	/*D.siKuliTestCase029(extent, testcase);
	D.siKuliTestCase030(extent, testcase);
	D.siKuliTestCase031(extent, testcase);
	D.siKuliTestCase032(extent, testcase);
	D.siKuliTestCase033(extent, testcase);
	D.siKuliTestCase034(extent, testcase);
	D.siKuliTestCase035(extent, testcase);
	D.siKuliTestCase036(extent, testcase);
	D.siKuliTestCase037(extent, testcase);
	D.siKuliTestCase038(extent, testcase);*/
	
	
	
	//*********** OCT 3RD RELEASE ***********
	
	//*********** Beverages(30) ************
	
//	//****Iced Cappuccino****
///*	bevItem.sikuliTestCase024(extent, testcase);
//	/*bevItem.sikuliTestCase025(extent, testcase);
//	bevItem.sikuliTestCase027(extent, testcase);
//	bevItem.sikuliTestCase028(extent, testcase);*/
//	
//	//****Iced Cappuccino Light****
////	bevItem.sikuliTestCase030(extent, testcase);
//	/*bevItem.sikuliTestCase031(extent, testcase);
//	bevItem.sikuliTestCase033(extent, testcase);
//	bevItem.sikuliTestCase034(extent, testcase);
//	
//	//****Americano****
//	bevItem.sikuliTestCase041(extent, testcase);
//	bevItem.sikuliTestCase042(extent, testcase);
//	bevItem.sikuliTestCase043(extent, testcase);
//	bevItem.sikuliTestCase044(extent, testcase);
//	bevItem.sikuliTestCase045(extent, testcase);
//	bevItem.sikuliTestCase046(extent, testcase);
//	
//	//****Redeye Original Iced capp****
//	bevItem.sikuliTestCase047(extent, testcase);
//	bevItem.sikuliTestCase048(extent, testcase);
//	bevItem.sikuliTestCase049(extent, testcase);
//	bevItem.sikuliTestCase050(extent, testcase);
//	
//	//****Tea Latte****
//	bevItem.sikuliTestCase051(extent, testcase);
//	bevItem.sikuliTestCase052(extent, testcase);
//	bevItem.sikuliTestCase053(extent, testcase);
//	bevItem.sikuliTestCase054(extent, testcase);
//	bevItem.sikuliTestCase055(extent, testcase);
//	bevItem.sikuliTestCase056(extent, testcase);
//	
//	//****London Fog****
//	bevItem.sikuliTestCase057(extent, testcase);
//	bevItem.sikuliTestCase058(extent, testcase);
//	bevItem.sikuliTestCase059(extent, testcase);
//	bevItem.sikuliTestCase060(extent, testcase);
//	bevItem.sikuliTestCase061(extent, testcase);
//	bevItem.sikuliTestCase062(extent, testcase);*/
//
//	//*********** Sides(10) ************
//	
//	//****Donuts****
//	D.siKuliTestCase029(extent, testcase);
//	/*D.siKuliTestCase030(extent, testcase);
//	D.siKuliTestCase031(extent, testcase);
//	D.siKuliTestCase032(extent, testcase);
//	D.siKuliTestCase033(extent, testcase);
//	D.siKuliTestCase034(extent, testcase);
//	D.siKuliTestCase035(extent, testcase);
//	D.siKuliTestCase036(extent, testcase);
//	D.siKuliTestCase037(extent, testcase);
//	D.siKuliTestCase038(extent, testcase);*/
//	
//	
//	//*********** BAGELS(6) ************
//	
//	B.siKuliTestCase01(extent, testcase);
//	/*B.siKuliTestCase02(extent, testcase);
//	B.siKuliTestCase03(extent, testcase);
//	B.siKuliTestCase04(extent, testcase);
//	B.siKuliTestCase05(extent, testcase);
//	B.siKuliTestCase06(extent, testcase);
//	
//	//*********** BREAKFAST(4) ************
//	
//	//****Breakfast Delivery Bundles****
//	breakfastsitem.siKuliTestCase004(extent, testcase);*/
//	breakfastsitem.siKuliTestCase005(extent, testcase);
//	//breakfastsitem.siKuliTestCase006(extent, testcase);
//	//breakfastsitem.siKuliTestCase007(extent, testcase); 
	
	//Breakfast Combos
//	
   // breakfastsitem.siKuliTestCase008(extent, testcase);
//	breakfastsitem.siKuliTestCase009(extent, testcase);
//	breakfastsitem.siKuliTestCase0010(extent, testcase);
	//breakfastsitem.siKuliTestCase0011(extent, testcase);
//	breakfastsitem.siKuliTestCase0012(extent, testcase);
//	breakfastsitem.siKuliTestCase0013(extent, testcase);
//	breakfastsitem.siKuliTestCase0014(extent, testcase);
//	breakfastsitem.siKuliTestCase0015(extent, testcase);
//	breakfastsitem.siKuliTestCase0016(extent, testcase);
//	breakfastsitem.siKuliTestCase0017(extent, testcase);
//	breakfastsitem.siKuliTestCase0018(extent, testcase);
//	breakfastsitem.siKuliTestCase0019(extent, testcase);
//	breakfastsitem.siKuliTestCase0020(extent, testcase);
//	breakfastsitem.siKuliTestCase0021(extent, testcase);
//	breakfastsitem.siKuliTestCase0022(extent, testcase);
//	breakfastsitem.siKuliTestCase0023(extent, testcase);
//	breakfastsitem.siKuliTestCase0024(extent, testcase);
//	breakfastsitem.siKuliTestCase0025(extent, testcase);
	//breakfastsitem.siKuliTestCase0026(extent, testcase);
//	breakfastsitem.siKuliTestCase0027(extent, testcase);
	//breakfastsitem.siKuliTestCase0028(extent, testcase);
	
//	Lunch Combos
	
//	L.siKuliTestCase0030(extent, testcase);
//	L.siKuliTestCase0031(extent, testcase);
//	L.siKuliTestCase0032(extent, testcase);
//	L.siKuliTestCase0033(extent, testcase);
//	L.siKuliTestCase0034(extent, testcase);
//	L.siKuliTestCase0035(extent, testcase);
//	L.siKuliTestCase0036(extent, testcase);
//	L.siKuliTestCase0037(extent, testcase);
//	L.siKuliTestCase0038(extent, testcase);
//	L.siKuliTestCase0039(extent, testcase);
	L.siKuliTestCase0040(extent, testcase);
	
	
	appClose apc =new appClose(s);
	apc.appClose(extent,testcase);

  }

  @AfterMethod(alwaysRun=true)
  public void getScreenshot(String testCaseName,Screen s,ExtentReports extent, ExtentTest testcase) throws IOException
  {
	 System.out.println("onTestFailure");
	  Rectangle rectangle=new Rectangle();
	  rectangle.setBounds(420,200,60,30);
	  String imagePath  = capture(rectangle).save("extent.html");
	
  }
}




