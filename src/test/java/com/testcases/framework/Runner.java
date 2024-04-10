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
import cognizant.framework.pageobject.RetailItems;
import cognizant.framework.pageobject.SideItems1;
import cognizant.framework.pageobject.Bagels;
import cognizant.framework.pageobject.appClose;
import excel.Read_Data;
import net.sourceforge.tess4j.TesseractException;

public class Runner extends Read_Data {

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

		extent = new ExtentReports();
		html = new ExtentSparkReporter("extent.html");
		extent.attachReporter(html);

		LandingPage landingPage = new LandingPage(s);
	//  landingPage.siKuliTestCase001(extent, testcase);

		// ********OBJECTS********
		BreakfastItems breakfastsitem = new BreakfastItems(s);
		BeverageItems bevItem = new BeverageItems(s);
		SideItems1 D = new SideItems1(s);
		Bagels B = new Bagels(s);
		LunchItems L = new LunchItems(s);
		RetailItems R = new RetailItems(s);

		// ********JAN Q1 PRICE UPDATE********

		// ****Pumpkin Spice****
/*
		
		  bevItem.sikuliTestCase063(extent, testcase);
		  bevItem.sikuliTestCase064(extent, testcase);
		  bevItem.sikuliTestCase065(extent, testcase);
		  bevItem.sikuliTestCase066(extent, testcase);
		  bevItem.sikuliTestCase067(extent, testcase);
		  bevItem.sikuliTestCase068(extent, testcase);
		
		  // ****Mocha Iced Capp*****
		 
		  bevItem.sikuliTestCase035(extent, testcase);
		  bevItem.sikuliTestCase036(extent, testcase);
		  bevItem.sikuliTestCase037(extent, testcase);
		  bevItem.sikuliTestCase038(extent, testcase);
		  bevItem.sikuliTestCase039(extent, testcase);
		  bevItem.sikuliTestCase040(extent, testcase);
		 
	    //*****Caramel Iced Capp*****
		
		bevItem.sikuliTestCase071(extent, testcase);
		bevItem.sikuliTestCase072(extent, testcase);
		bevItem.sikuliTestCase073(extent, testcase);
		bevItem.sikuliTestCase074(extent, testcase);
		bevItem.sikuliTestCase075(extent, testcase);
		bevItem.sikuliTestCase076(extent, testcase);
		
		//*****Vanila Iced Capp*****
		
		bevItem.sikuliTestCase077(extent, testcase);
		bevItem.sikuliTestCase078(extent, testcase);
		bevItem.sikuliTestCase079(extent, testcase);
		bevItem.sikuliTestCase080(extent, testcase);
		bevItem.sikuliTestCase081(extent, testcase);
		bevItem.sikuliTestCase082(extent, testcase); 
		
		
	/*	//*****Creamy Chill*****
		//****Chocolate*****
		bevItem.sikuliTestCase083(extent, testcase);
		bevItem.sikuliTestCase084(extent, testcase);
		bevItem.sikuliTestCase085(extent, testcase);
		bevItem.sikuliTestCase086(extent, testcase);
		bevItem.sikuliTestCase087(extent, testcase);
		bevItem.sikuliTestCase088(extent, testcase);
		
		//*****Vanilla*****
		bevItem.sikuliTestCase089(extent, testcase);
		bevItem.sikuliTestCase090(extent, testcase);
		bevItem.sikuliTestCase091(extent, testcase);
		bevItem.sikuliTestCase092(extent, testcase);
		bevItem.sikuliTestCase093(extent, testcase);
		bevItem.sikuliTestCase094(extent, testcase);
		
		//*****Strawberry*****
		 
		bevItem.sikuliTestCase095(extent, testcase);
		bevItem.sikuliTestCase096(extent, testcase);
		bevItem.sikuliTestCase097(extent, testcase);
		bevItem.sikuliTestCase098(extent, testcase);
		bevItem.sikuliTestCase099(extent, testcase);
		bevItem.sikuliTestCase100(extent, testcase);

		//****Frozen Original Lemonade*****
		 bevItem.sikuliTestCase101(extent, testcase);
		 bevItem.sikuliTestCase102(extent, testcase);
		 bevItem.sikuliTestCase103(extent, testcase);
		 bevItem.sikuliTestCase104(extent, testcase);
		 bevItem.sikuliTestCase105(extent, testcase);
		 bevItem.sikuliTestCase106(extent, testcase); 
		 
		 //*****Strawberry Lemonade*****
		 bevItem.sikuliTestCase107(extent, testcase);
		 bevItem.sikuliTestCase108(extent, testcase);
		 bevItem.sikuliTestCase109(extent, testcase);
		 bevItem.sikuliTestCase110(extent, testcase);
		 bevItem.sikuliTestCase111(extent, testcase);
		 bevItem.sikuliTestCase112(extent, testcase);
		 
		 //*****FRUIT SMOOTHIE STRAWBERRY*****
		 bevItem.sikuliTestCase113(extent, testcase);
		 bevItem.sikuliTestCase114(extent, testcase);
		 bevItem.sikuliTestCase115(extent, testcase);
		 bevItem.sikuliTestCase116(extent, testcase);
		 bevItem.sikuliTestCase117(extent, testcase);
		 bevItem.sikuliTestCase118(extent, testcase); 
		 
		 //*****CLASSIC LEMONADE******
		 bevItem.sikuliTestCase119(extent, testcase);
		  bevItem.sikuliTestCase120(extent, testcase);
		   bevItem.sikuliTestCase121(extent, testcase);
		    bevItem.sikuliTestCase122(extent, testcase);
		     bevItem.sikuliTestCase123(extent, testcase);
		      bevItem.sikuliTestCase124(extent, testcase);
		      
		 //*****Baileys Iced Capp*****
		 bevItem.sikuliTestCase125(extent, testcase);
		 bevItem.sikuliTestCase126(extent, testcase);
		 bevItem.sikuliTestCase127(extent, testcase);
		 bevItem.sikuliTestCase128(extent, testcase);
		 bevItem.sikuliTestCase129(extent, testcase);
		 bevItem.sikuliTestCase130(extent, testcase); 
		 
		 
		  
		 
		  
		 

		//*****Lunch Items****
		 
		/* // Sandwitches
		  L.siKuliTestCase0050(extent, testcase);
		  L.siKuliTestCase0051(extent, testcase);
		  
		 // Melts
	    L.siKuliTestCase0052(extent, testcase);
		L.siKuliTestCase0053(extent, testcase);
		L.siKuliTestCase0054(extent, testcase);
		  
		  //Wraps
		  L.siKuliTestCase0045(extent, testcase); 
		  L.siKuliTestCase0046(extent, testcase); 
		  L.siKuliTestCase0047(extent, testcase);
		  L.siKuliTestCase0048(extent, testcase);
		  
		 // R.siKuliTestCase001(extent, testcase);
		
		//*****Donuts*****
		D.siKuliTestCase039(extent, testcase); 
		D.siKuliTestCase040(extent, testcase);// need to fix coordinates
		
		//*****Breakfast*****
		breakfastsitem.siKuliTestCase0053(extent, testcase); 
		breakfastsitem.siKuliTestCase0054(extent, testcase);
		breakfastsitem.siKuliTestCase0055(extent, testcase);
		breakfastsitem.siKuliTestCase0056(extent, testcase);
		breakfastsitem.siKuliTestCase0057(extent, testcase);
		breakfastsitem.siKuliTestCase0058(extent, testcase);
		breakfastsitem.siKuliTestCase0059(extent, testcase);
		breakfastsitem.siKuliTestCase0060(extent, testcase);
		breakfastsitem.siKuliTestCase0061(extent, testcase);
		breakfastsitem.siKuliTestCase0062(extent, testcase);
		
		
		
		//*****Retail Catering*****
		R.siKuliTestCase001(extent, testcase);
		R.siKuliTestCase002(extent, testcase);
		R.siKuliTestCase003(extent, testcase);
		R.siKuliTestCase004(extent, testcase);
		R.siKuliTestCase005(extent, testcase);
		R.siKuliTestCase006(extent, testcase);
		
		//*****Sides****
		D.siKuliTestCase041(extent, testcase);
		D.siKuliTestCase042(extent, testcase);//need to fix*/
		
		
		//*****Lunch Combos****
		/*L.siKuliTestCase0030(extent, testcase);
		L.siKuliTestCase0031(extent, testcase);
		L.siKuliTestCase0032(extent, testcase);
		L.siKuliTestCase0033(extent, testcase);
		L.siKuliTestCase0034(extent, testcase);
		L.siKuliTestCase0035(extent, testcase);
		L.siKuliTestCase0036(extent, testcase);
		L.siKuliTestCase0037(extent, testcase);
		L.siKuliTestCase0038(extent, testcase);
		L.siKuliTestCase0039(extent, testcase);
		L.siKuliTestCase0040(extent, testcase);
		
		//*****Breakfast Combos*****
		breakfastsitem.siKuliTestCase0011(extent, testcase);
		breakfastsitem.siKuliTestCase0016(extent, testcase);*/
		
		
		
		//2nd April Release
	/*	
		//Hot Chocolate
		bevItem.sikuliTestCase131(extent, testcase);
		bevItem.sikuliTestCase132(extent, testcase);
		bevItem.sikuliTestCase133(extent, testcase);
		bevItem.sikuliTestCase134(extent, testcase);
		bevItem.sikuliTestCase135(extent, testcase);
		bevItem.sikuliTestCase136(extent, testcase);
		bevItem.sikuliTestCase137(extent, testcase);
		bevItem.sikuliTestCase138(extent, testcase);
		bevItem.sikuliTestCase139(extent, testcase);
		bevItem.sikuliTestCase140(extent, testcase);
		bevItem.sikuliTestCase141(extent, testcase);
		bevItem.sikuliTestCase142(extent, testcase);
		bevItem.sikuliTestCase143(extent, testcase);
		bevItem.sikuliTestCase144(extent, testcase);
		bevItem.sikuliTestCase145(extent, testcase);
		bevItem.sikuliTestCase146(extent, testcase);
		bevItem.sikuliTestCase147(extent, testcase);
		bevItem.sikuliTestCase148(extent, testcase);
		bevItem.sikuliTestCase149(extent, testcase);
		bevItem.sikuliTestCase150(extent, testcase);
		bevItem.sikuliTestCase151(extent, testcase);
		bevItem.sikuliTestCase152(extent, testcase);
		bevItem.sikuliTestCase153(extent, testcase);
		*/
		
	/*	//*****Mango Starfruit*****
		bevItem.sikuliTestCase219(extent, testcase);
		bevItem.sikuliTestCase220(extent, testcase);
		bevItem.sikuliTestCase221(extent, testcase);
		bevItem.sikuliTestCase222(extent, testcase);
		bevItem.sikuliTestCase223(extent, testcase);
		bevItem.sikuliTestCase224(extent, testcase);
		
		//*****Wild Berry Hibiscus*****
		bevItem.sikuliTestCase225(extent, testcase);
		bevItem.sikuliTestCase226(extent, testcase);
		bevItem.sikuliTestCase227(extent, testcase);
		bevItem.sikuliTestCase228(extent, testcase);
		bevItem.sikuliTestCase229(extent, testcase);
		bevItem.sikuliTestCase230(extent, testcase);
		
		//****Specialty Tea****
		bevItem.sikuliTestCase231(extent, testcase);
		bevItem.sikuliTestCase232(extent, testcase);
		bevItem.sikuliTestCase233(extent, testcase);
		bevItem.sikuliTestCase234(extent, testcase);
		bevItem.sikuliTestCase235(extent, testcase);
		bevItem.sikuliTestCase236(extent, testcase);
		bevItem.sikuliTestCase237(extent, testcase);
		bevItem.sikuliTestCase238(extent, testcase);
		bevItem.sikuliTestCase239(extent, testcase);
		
		//****Steeped Tea****
		bevItem.sikuliTestCase240(extent, testcase);
		bevItem.sikuliTestCase241(extent, testcase);
		bevItem.sikuliTestCase242(extent, testcase);
		bevItem.sikuliTestCase243(extent, testcase);
		bevItem.sikuliTestCase244(extent, testcase);
		bevItem.sikuliTestCase245(extent, testcase);
		bevItem.sikuliTestCase246(extent, testcase);
		bevItem.sikuliTestCase247(extent, testcase);
		bevItem.sikuliTestCase248(extent, testcase);
		*/
		
		//****Tea Latte****
		bevItem.sikuliTestCase051(extent, testcase);
		bevItem.sikuliTestCase052(extent, testcase);
		bevItem.sikuliTestCase053(extent, testcase);
		bevItem.sikuliTestCase054(extent, testcase);
		bevItem.sikuliTestCase055(extent, testcase);
		bevItem.sikuliTestCase056(extent, testcase);
		
		//****London Fog****
		bevItem.sikuliTestCase057(extent, testcase);
		bevItem.sikuliTestCase058(extent, testcase);
		bevItem.sikuliTestCase059(extent, testcase);
		bevItem.sikuliTestCase060(extent, testcase);
		bevItem.sikuliTestCase061(extent, testcase);
		bevItem.sikuliTestCase062(extent, testcase);
		
		//*****Apple Cinnamon Latte*****
		 bevItem.sikuliTestCase209(extent, testcase);
		 bevItem.sikuliTestCase210(extent, testcase);
		 bevItem.sikuliTestCase211(extent, testcase);
		 bevItem.sikuliTestCase212(extent, testcase);
		 bevItem.sikuliTestCase213(extent, testcase);
		 bevItem.sikuliTestCase214(extent, testcase); 
		
	/*	//*****Juice*****
		 bevItem.sikuliTestCase249(extent, testcase);
		 bevItem.sikuliTestCase250(extent, testcase);
		 
		*/
	/*	//****Bagels****
		B.siKuliTestCase07(extent, testcase);
		B.siKuliTestCase08(extent, testcase);
		B.siKuliTestCase09(extent, testcase);
		B.siKuliTestCase010(extent, testcase);
		
		//****Retail Item****
		
	/*	R.siKuliTestCase007(extent, testcase);
		R.siKuliTestCase008(extent, testcase);
		R.siKuliTestCase009(extent, testcase);
		R.siKuliTestCase010(extent, testcase);
		R.siKuliTestCase011(extent, testcase);
		R.siKuliTestCase0012(extent, testcase);
		R.siKuliTestCase0013(extent, testcase);
		R.siKuliTestCase0014(extent, testcase);
		R.siKuliTestCase0015(extent, testcase);
		R.siKuliTestCase0016(extent, testcase);
		R.siKuliTestCase0017(extent, testcase);
		R.siKuliTestCase018(extent, testcase);*/
		
		
		
		
		
		
		
		
		
		 

		appClose apc = new appClose(s);
		apc.appClose(extent, testcase);

	}

	@AfterMethod(alwaysRun = true)
	public void getScreenshot(String testCaseName, Screen s, ExtentReports extent, ExtentTest testcase)
			throws IOException {
		System.out.println("onTestFailure");
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save("extent.html");

	}
}
