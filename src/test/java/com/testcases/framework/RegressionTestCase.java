package com.testcases.framework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.sikuli.basics.Settings;
import excel.Read_Data;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class RegressionTestCase extends Read_Data {
Screen s = new Screen();
	
	ExtentReports extent;
	ExtentHtmlReporter html;
	ExtentTest testcase;
	
	 Pattern p = new Pattern("C:/Images For Sikuli/InputBox.png");
	    
	    public int i;
	    public int parseInt;
	    public int number;
	    
	    Pattern BomgarApp = new Pattern("C:/Images For Sikuli/BomgarDesktop.png");
	  	Pattern BomgarLogin = new Pattern("C:/Images For Sikuli/BomgarLogin.png");   
	  	Pattern QSTT2Login = new Pattern("C:/Images For Sikuli/QSTT2Login.png");  
	  	Pattern ScreenSharing = new Pattern("C:/Images For Sikuli/ScreenSharing.png");  
	  	Pattern RollbackLightTaskbar = new Pattern("C:/Images For Sikuli/RollbackLightTaskbar.png");  
	  	Pattern IQTouchTaskbar = new Pattern("C:/Images For Sikuli/IQTouchTaskbar.png");  
	  	Pattern RollbackLightDesktop = new Pattern("C:/Images For Sikuli/RollbackLightDesktop.png"); 
	  	Pattern RollbackLightDesktop1 = new Pattern("C:/Images For Sikuli/RollbackLightDesktop1.png");  
	  	Pattern CloseWindow = new Pattern("C:/Images For Sikuli/CloseWindow.png");  
	  	Pattern StoreNumber = new Pattern("C:/Images For Sikuli/StoreNumber.png");  
	  	Pattern ReleaseID = new Pattern("C:/Images For Sikuli/ReleaseID.png");  
	  	Pattern RollbackApply = new Pattern("C:/Images For Sikuli/RollbackApply.png");  
	  	Pattern TabPOS = new Pattern("C:/Images For Sikuli/TabPOS.png");  
	  	Pattern OkRollbackQST = new Pattern("C:/Images For Sikuli/OkRollbackQST.png");  
	  	Pattern CloseTerminal = new Pattern("C:/Images For Sikuli/CloseTerminal.png");  
	  	Pattern EndSession = new Pattern("C:/Images For Sikuli/EndSession.png");  
	  	//Pattern TasksRunning = new Pattern("C:/Images For Sikuli/TasksRunning.png");  
	  	//Pattern BomgarTask = new Pattern("C:/Images For Sikuli/BomgarTask.png");  
	  	Pattern QuitBomgar = new Pattern("C:/Images For Sikuli/QuitBomgar.png");  
	  	//Pattern LogoutBomgar = new Pattern("C:/Images For Sikuli/LogoutBomgar.png");  
	  	Pattern YesBomgar = new Pattern("C:/Images For Sikuli/YesBomgar.png");  
	  	Pattern File = new Pattern("C:/Images For Sikuli/File.png"); 
	  	Pattern UpdateQST = new Pattern("C:\\Images For Sikuli\\UpdateQST.png"); 
	  	Pattern ViewMgrUpdate = new Pattern("C:/Images For Sikuli/ViewMgrUpdate.png"); 
	  	Pattern ApplyUpdates = new Pattern("C:/Images For Sikuli/ApplyUpdates.png"); 
	  	Pattern OkUpdates = new Pattern("C:/Images For Sikuli/OkUpdates.png"); 
	  	Pattern OkPrinter = new Pattern("C:/Images For Sikuli/OkPrinter.png"); 
	  	Pattern RegionIDClick = new Pattern("C:/Images For Sikuli/RegionIDClick.png"); 
	  	Pattern OkCred = new Pattern("C:/Images For Sikuli/CredQST.png"); 
	  	Pattern CredQSTold = new Pattern("C:/Images For Sikuli/CredQSTold.png"); 
	  	Pattern SMCoffee =new Pattern("C:/Images For Sikuli/SMCoffee.png");
	  	Pattern MDCoffee = new Pattern("C:/Images For Sikuli/MDCoffee.png");
	  	Pattern LGCoffee = new Pattern("C:/Images For Sikuli/LGCoffee.png");
	  	Pattern EatIn = new Pattern("C:/Images For Sikuli/EatIn.png"); 
	  	Pattern CanOrder = new Pattern("C:/Images For Sikuli/CanOrder.png"); 
	  	Pattern CanYes = new Pattern("C:/Images For Sikuli/CanYes.png"); 
	  	Pattern Functions = new Pattern("C:/Images For Sikuli/Functions.png"); 
	  	Pattern MinPOS = new Pattern("C:/Images For Sikuli/MinPOS.png"); 
	  	Pattern MDCoffeeOrder = new Pattern("C:/Images For Sikuli/MDCoffeeOrder.png"); 
	  	Pattern ScreenKey = new Pattern("C:/Images For Sikuli/ScreenKey.png"); 
	  	
	  	
	  	Pattern Sides = new Pattern("C:/Images For Sikuli/Sides.png");
	  	Pattern AssortedDonut = new Pattern("C:/Images For Sikuli/AssortedDonut.png");
	  	Pattern AssortedPremiumDonut = new Pattern("C:/Images For Sikuli/AssortedPremiumDonut.png");
	  	Pattern Donuts = new Pattern("C:/Images For Sikuli/Donuts.png"); 
	  	Pattern ClassicDonut = new Pattern("C:/Images For Sikuli/ClassicDonut.png"); 
	  	Pattern Breakfast = new Pattern("C:/Images For Sikuli/Breakfast.png"); 
	  	Pattern Sandwiches = new Pattern("C:/Images For Sikuli/Sandwiches.png"); 
	  	Pattern SausageBiscuit = new Pattern("C:/Images For Sikuli/SausageBiscuit.png"); 
	  	Pattern Retail = new Pattern("C:/Images For Sikuli/Retail.png"); 
	  	Pattern TakeHome = new Pattern("C:/Images For Sikuli/TakeHome.png"); 
	  	Pattern Consumables = new Pattern("C:/Images For Sikuli/Consumables.png"); 
	  	Pattern MapleButter = new Pattern("C:/Images For Sikuli/MapleButter.png"); 
	  	Pattern PriceCompare = new Pattern("C:/Images For Sikuli/PriceCompare.png"); 
	  	Pattern PayNow = new Pattern("C:/Images For Sikuli/PayNow.png"); 
	  	Pattern NextPay = new Pattern("C:/Images For Sikuli/NextPay.png"); 
	  	Pattern OrderHistory = new Pattern("C:/Images For Sikuli/OrderHistory.png"); 
	  	Pattern InputBox = new Pattern("C:/Images For Sikuli/InputBox.png");
	  	String filename = p.getFilename();
	  	Pattern InputBox1 = new Pattern("C:\\Images For Sikuli\\InputBox1.png");
	  	Pattern OkSearch = new Pattern("C:/Images For Sikuli/OkSearch.png"); 
	  	Pattern GoSearch = new Pattern("C:/Images For Sikuli/GoSearch.png"); 
	  	Pattern SearchResult = new Pattern("C:/Images For Sikuli/SearchResult.png");   
	  	Pattern SearchResult1 = new Pattern("C:/Images For Sikuli/SearchResult1.png");   
	  	Pattern Exit = new Pattern("C:/Images For Sikuli/Exit.png");
	 	
	  	Pattern Beverages= new Pattern("C:\\Images For Sikuli\\Beverages.png");
	  	Pattern OriginalBlend = new Pattern("C:\\Images For Sikuli\\OriginalBlend.png");
	  	Pattern RefillSmallOriginalBlend= new Pattern("C:\\Images For Sikuli\\RefillSmallOriginalBlend.png");
	  	Pattern RefillMediumOriginalBlend=new Pattern("C:\\Images For Sikuli\\RefillMediumOriginalBlend.png");
	  	Pattern RefillLargeOriginalBlend=new Pattern("C:\\Images For Sikuli\\RefillLargeOriginalBlend.png");
	  	Pattern RefillExtraLargeOriginalBlend=new Pattern("C:\\Images For Sikuli\\RefillExtraLargeOriginalBlend.png");
	  	Pattern DarkRoast=new Pattern("C:\\Images For Sikuli\\DarkRoast.png");
	  	Pattern SmallDarkRoast=new Pattern("C:\\Images For Sikuli\\SmallDarkRoast.png");
	  	Pattern MediumDarkRoast=new Pattern("C:\\Images For Sikuli\\MediumDarkRoast.png");
	  	Pattern LargeDarkRoast=new Pattern("C:\\Images For Sikuli\\LargeDarkRoast.png");
	  	Pattern ExtraLargeDarkRoast=new Pattern("C:\\Images For Sikuli\\ExtraLargeDarkRoast.png");
	  	Pattern SmallRefillDarkRoast=new Pattern("C:\\Images For Sikuli\\SmallRefillDarkRoast.png");
	  	Pattern MediumRefillDarkRoast=new Pattern("C:\\Images For Sikuli\\MediumRefillDarkRoast.png");
	  	Pattern LargeRefillDarkRoast=new Pattern("C:\\Images For Sikuli\\LargeRefillDarkRoast.png");
	  	Pattern ExtraLargeRefillDarkRoast=new Pattern("C:\\Images For Sikuli\\ExtraLargeRefillDarkRoast.png");
	  	Pattern Decaf = new Pattern("C:\\Images For Sikuli\\Decaf.png");
	  	Pattern SmallDecaf = new Pattern("C:\\Images For Sikuli\\SmallDecaf.png");
	  	Pattern MediumDecaf = new Pattern("C:\\Images For Sikuli\\MediumDecaf.png");
	  	Pattern LargeDecaf = new Pattern("C:\\Images For Sikuli\\LargeDecaf.png");
	  	Pattern ExtraLargeDecaf = new Pattern("C:\\Images For Sikuli\\ExtraLargeDecaf.png");
	  	Pattern SmallDecafRefil = new Pattern("C:\\Images For Sikuli\\SmallDecafRefil.png");
	  	Pattern MediumDecafRefil = new Pattern("C:\\Images For Sikuli\\MediumDecafRefil.png");
	  	Pattern LargeDecafRefil = new Pattern("C:\\Images For Sikuli\\LargeDecafRefil.png");
	  	//Pattern ExtraLargeDecafRefil = new Pattern("C:\\Images For Sikuli\\ExtraLargeDecafRefil.png");
	  	Pattern RefillDecafExtraLarge =new Pattern("C:\\Images For Sikuli\\RefillDecafExtraLarge.png");
	  	
	  	Pattern IcedBeverages= new Pattern("C:\\Images For Sikuli\\IcedBeverages.png");
	 	Pattern IcedCoffee= new Pattern("C:\\Images For Sikuli\\IcedCoffee.png");
	 	Pattern OrgIcedCoffee= new Pattern("C:\\Images For Sikuli\\OrgIcedCoffe.png");
	  	Pattern MDIcedCoffee= new Pattern("C:\\Images For Sikuli\\MDIcedCoffee.png");
	  	
	  	Pattern Beverages1 = new Pattern("C:\\Images For Sikuli\\Beverages1.png");
	  	Pattern HotBeverages = new Pattern("C:\\Images For Sikuli\\HotBeverages.png");
	  	Pattern SpecialtyTea = new Pattern("C:\\Images For Sikuli\\SpecialtyTea.png");
	  	Pattern MDTea = new Pattern("C:\\Images For Sikuli\\MDTea.png");
	  	Pattern TeaFlav = new Pattern("C:\\Images For Sikuli\\TeaFlav.png");
	  	Pattern AppleCinnamon = new Pattern("C:\\Images For Sikuli\\AppleCinnamon.png");
	  	Pattern TeaFlav1 = new Pattern("C:\\Images For Sikuli\\TeaFlav1.png");
	  	Pattern Picture2 = new Pattern("C:\\Images For Sikuli\\Picture2.png");
	  	
	  	Pattern PaymentAmount = new Pattern("C:\\Images For Sikuli\\PaymentAmount.png");
	  	Pattern BomgarTask = new Pattern("C:\\Images For Sikuli\\BomgarTask.png");
	  	Pattern YesRemote = new Pattern("C:\\Images For Sikuli\\YesRemote.png");
	  	Pattern Password = new Pattern("C:\\Images For Sikuli\\Password.png");
	  	
	  	Pattern EggCheeseBiscuit = new Pattern("C:\\Images For Sikuli\\EggCheeseBiscuit.png");
	  	Pattern VoidItem = new Pattern("C:\\Images For Sikuli\\VoidItem.png");
	  	
	  	Pattern Cookies = new Pattern("C:\\Images For Sikuli\\Cookies.png");
	  	Pattern ChocolateCookies=new Pattern("C:\\Images For Sikuli\\ChocolateCookies.png");
	  	Pattern CookiesDozen = new Pattern("C:\\Images For Sikuli\\CookiesDozen.png");
	  	Pattern CookAsrtDozen = new Pattern("C:\\Images For Sikuli\\CookAsrtDozen.png");
	  	
	  	Pattern BiscuitModifier = new Pattern("C:\\Images For Sikuli\\BiscuitModifier.png");
	  	Pattern SausageModifier = new Pattern("C:\\Images For Sikuli\\SausageModifier.png");
	  	Pattern SausageModifier1 = new Pattern("C:\\Images For Sikuli\\SausageModifier1.png");
	  	
	  	Pattern BlueberryDonuts = new Pattern("C:\\Images For Sikuli\\BlueberryDonuts.png");
	  	Pattern SausageCroissant = new Pattern("C:\\Images For Sikuli\\SausageCroissant.png");
	  	
	  	Pattern FlavIcedLatte = new Pattern("C:\\Images For Sikuli\\FlavIcedLatte.png");
	  	Pattern VanillaIcedLatte = new Pattern("C:\\Images For Sikuli\\VanillaIcedLatte.png");
	  	Pattern VanillaLatteLarge = new Pattern("C:\\Images For Sikuli\\VanillaLatteLarge.png");
	  	
	  	Pattern Promo = new Pattern("C:\\Images For Sikuli\\Promo.png");
	  	Pattern ColdBrew = new Pattern("C:\\Images For Sikuli\\ColdBrew.png");
	  	Pattern VanillaCreamColdBrew = new Pattern("C:\\Images For Sikuli\\VanillaCreamColdBrew.png");
	  	Pattern VanillaCreamColdBrewSmall = new Pattern("C:\\Images For Sikuli\\VanillaCreamColdBrewSmall.png");
	  	
		Pattern ColdBeverages = new Pattern("C:\\Images For Sikuli\\ColdBeverages.png");
	  	Pattern BottleWater = new Pattern("C:\\Images For Sikuli\\BottleWater.png");
	  	
	  	
	  	Pattern FarmerSandwiches = new Pattern("C:\\Images For Sikuli\\FarmerSandwiches.png");
	  //	Pattern BaconFarmersBiscuit = new Pattern("‪C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\Images\\BaconFarmersBiscuit.png");
	  
	  	Pattern FarmerWraps = new Pattern("C:\\Images For Sikuli\\FarmerWraps.png");
	  	Pattern BaconFarmersWrap = new Pattern("C:\\Images For Sikuli\\BaconFarmersWrap.png");
	  	
	  	Pattern Belts = new Pattern("C:\\Images For Sikuli\\Belts.png");
	  	Pattern BaconBelt = new Pattern("C:\\Images For Sikuli\\BaconBelt.png");
	  	Pattern ChooseBagel = new Pattern("C:\\Images For Sikuli\\ChooseBagel.png");
	  	Pattern BlueberyBagel = new Pattern("C:\\Images For Sikuli\\BlueberyBagel.png");
	  	
	  	Pattern Lunch = new Pattern("C:\\Images For Sikuli\\Lunch.png");
	  	Pattern Sandwiches1 = new Pattern("C:\\Images For Sikuli\\Sandwiches1.png");
	  	Pattern TurkeyBaconClub = new Pattern("C:\\Images For Sikuli\\TurkeyBaconClub.png");
	  	
	  	Pattern Melt = new Pattern("C:\\Images For Sikuli\\Melt.png");
	  	Pattern HamMelt = new Pattern("C:\\Images For Sikuli\\HamMelt.png");
	  	
	  	Pattern LoadedWraps = new Pattern("C:\\Images For Sikuli\\LoadedWraps.png");
	  	Pattern CilantroWrap = new Pattern("C:\\Images For Sikuli\\CilantroWrap.png");
	  	Pattern CrispyWrap = new Pattern("C:\\Images For Sikuli\\CrispyWrap.png");
	  	
	  	
	  	Pattern HotBowls = new Pattern("C:\\Images For Sikuli\\HotBowls.png");
	  	Pattern ChickenNoodle = new Pattern("C:\\Images For Sikuli\\ChickenNoodle.png");
	  	
	  	Pattern Bagels = new Pattern("C:\\Images For Sikuli\\Bagels.png");
	  	Pattern GrainBagelPrePared = new Pattern("C:\\Images For Sikuli\\GrainBagelPrePared.png");
	  	
	  	
	  	Pattern Muffin = new Pattern("C:\\Images For Sikuli\\Muffin.png");
	  	Pattern BlueberryMuffin = new Pattern("C:\\Images For Sikuli\\BlueberryMuffin.png");
	  	Pattern BlueberryTimbits = new Pattern("C:\\Images For Sikuli\\BlueberryTimbits.png");
	  	Pattern Timbits = new Pattern("C:\\Images For Sikuli\\Timbits.png");
	  	Pattern Timbits10 = new Pattern("C:\\Images For Sikuli\\Timbits10.png");
	  	
	  	Pattern OtherSides = new Pattern("C:\\Images For Sikuli\\OtherSides.png");
	  	Pattern Hashbrown = new Pattern("C:\\Images For Sikuli\\Hashbrown.png");
	  	
	  	Pattern Hardware = new Pattern("C:\\Images For Sikuli\\Hardware.png");
	  	Pattern Mugs = new Pattern("C:\\Images For Sikuli\\Mugs.png");
	  	Pattern CeramicMug = new Pattern("C:\\Images For Sikuli\\CeramicMug.png");
	  	
	  	Pattern DoubleChocCookie = new Pattern("C:\\Images For Sikuli\\DoubleChocCookie.png");
	  	Pattern Support = new Pattern("C:\\Images For Sikuli\\Support.png");
	  	
	  	
	  	@BeforeSuite
	    public void appLogin() throws FindFailed, InterruptedException, IOException {
		  
	    extent=new ExtentReports();
	    html= new ExtentHtmlReporter("extent.html");
	    extent.attachReporter(html);
	     
	     s.doubleClick(BomgarApp.similar((float)0.6));
	     s.wait(BomgarLogin, 300);   
	     s.click(BomgarLogin.similar((float)0.5));
	     s.wait(QSTT2Login, 300); 
	     s.click(QSTT2Login.similar((float)0.6));
	     s.wait(QSTT2Login, 300);           
	     s.doubleClick(QSTT2Login.similar((float)0.6));
	     s.wait(ScreenSharing, 300);   
	     s.doubleClick(ScreenSharing.similar((float)0.6));
	     //s.click(RollbackLightDesktop1);
	     //s.wait(RollbackLightTaskbar,300);
	     //s.rightClick(RollbackLightTaskbar.similar((float)0.5));
	     //s.wait(CloseWindow, 300);
	     //s.click(CloseWindow.similar((float)0.6));
	     //s.rightClick(IQTouchTaskbar.similar((float)0.5));
	     //s.wait(CloseWindow, 300);
	     //66565s.click(CloseWindow.similar((float)0.6));	
	     s.wait(RollbackLightDesktop1, 300);
	     s.doubleClick(RollbackLightDesktop1.similar((float)0.6));
	     s.wait(StoreNumber, 300);           
	     s.type(StoreNumber, "");
	     s.type(StoreNumber, "7000056");
	     s.wait(RegionIDClick, 300);  
	     s.click(RegionIDClick.similar((float)0.5));
	     s.wait(TabPOS, 300);  
	     s.click(TabPOS.similar((float)0.4));
	     //s.wait(ReleaseID, 300);
	     //s.type(ReleaseID, "");
	     s.type(ReleaseID, "36764");
	     s.wait(RollbackApply, 300);
	     s.click(RollbackApply.similar((float)0.6)); 
	     //s.wait(OkRollbackQST, 300);  
	     //s.click(OkRollbackQST.similar((float)0.6)); 
	     s.wait(OkRollbackQST, 300);  
	     s.click(OkRollbackQST.similar((float)0.6));
	     Thread.sleep(3000);
	     s.wait(Password, 500);
  	     s.type(Password,"78425");
  	     s.wait(OkCred,500);
  	     s.click(OkCred.similar((float)0.6));
//	     s.wait(CredQSTold, 300);  
//	     s.click(CredQSTold.similar((float)0.5)); 
	     //s.wait(CredQST, 300);  
	     //s.click(CredQST.similar((float)0.6)); 
//	     s.type(CredQSTold,"78425");
//	     s.click(OkCred.similar((float)0.6));
  	     Thread.sleep(9000);
	     s.wait(UpdateQST, 1500);  //FROM HERE
	     s.click(UpdateQST.similar((float)0.9)); 
	     s.wait(ViewMgrUpdate, 300);  
	     s.click(ViewMgrUpdate.similar((float)0.6)); 
	     s.wait(ApplyUpdates, 300);  
	     s.click(ApplyUpdates.similar((float)0.6));
	     Thread.sleep(4000);
	     s.wait(OkUpdates, 300);  
	     s.click(OkUpdates.similar((float)0.6));
	     Thread.sleep(4000);
  	     s.wait(Password, 600);
  	     s.type(Password,"78425");
  	     s.wait(OkCred,500);
  	     s.click(OkCred.similar((float)0.6));
	     //s.wait(OkPrinter, 300);  
	     //s.click(OkPrinter.similar((float)0.6)); 
	     /*s.wait(CredQSTold, 900);  
	     s.click(CredQSTold.similar((float)0.9)); 
	     s.type(CredQSTold,"78425");
	     s.click(OkCred.similar((float)0.8));  //TO HERE */
	  	}
	  	@Test(priority = 1)
	  	public void sikuliTestCase001() throws InterruptedException, FindFailed, IOException, TesseractException
	  	{
	  		
	  		testcase=extent.createTest("TC_0001:Verify Correct Release ID");
	  		
	  		RegressionTestCase b = new RegressionTestCase();
	  		
	  	Thread.sleep(3000);
	  	s.wait(Functions, 300); 
	    s.click(Functions.similar((float)0.5));
	    testcase.log(Status.PASS, "User able to click Function button");
	    Thread.sleep(3000);
	    s.wait(Support ,400);
	    s.click(Support.similar((float)0.5));
	    testcase.log(Status.PASS, "User able to click Support button");
	    File Source = new File("ReleasePin.png");
	      String Path = System.getProperty("user.dir")+"/Images/ReleasePin.png";
	      FileHandler.copy(Source, new File(Path));
	      ITesseract image = new Tesseract();
	      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
	      String imageText=image.doOCR(new File(Path));
	      imageText=imageText.replaceAll("\\s", "");
	      System.out.println(imageText);
	      Integer a1=0;
	      Integer a2=0;
	      try{
	    	  parseInt = Integer.parseInt(imageText);
	    	   a1 = parseInt;
	    	   a2 = b.readReleaseId();
	    	   	    	   
	    	} 
	      catch(NumberFormatException ex)
	      { 
	    	  System.out.println(parseInt);
	    	  System.out.println("Exception Handled"); 
	    	}
	      System.out.println(a1);
	      System.out.println(a2);
	      	  
	    	 			if (a1.equals(a2)) {
	    		  testcase.log(Status.PASS, "The Release ID is being matched as expected");
	    		  System.out.println("**************Scenario 001 PASS: Release ID is being matched as expected*************");
	    	  }
	    	  else {
	    		  testcase.log(Status.FAIL, "The Release ID doesn't matched as expected");
   		  System.out.println("***********Scenario 001 FAIL: Release ID doesn't matched as expected***********");
   		  
		}
			
		
	    
	  }
	  	@Test(priority = 2)
		  public void siKuliTestCase002() throws FindFailed, IOException, TesseractException, InterruptedException 
		  {	 
			 testcase=extent.createTest("TC_002:Verify Small Original Blend Coffee Price");
			 
			 RegressionTestCase b = new RegressionTestCase();
			 
			 Thread.sleep(2000); 
			 s.wait(SMCoffee, 300);  
		     s.click(SMCoffee.similar((float)0.5)); 
		     testcase.log(Status.PASS, "User able to Click the Small Original Blend Coffee Button");
		     s.wait(EatIn, 300);  
		     s.click(EatIn.similar((float)0.8));
		     testcase.log(Status.PASS, "User able to Click the Eatin Button");
		      File Source = new File("SMCoffeePrice.png");
		      String Path = System.getProperty("user.dir")+"/Images/SMCoffeePrice.png";
		      FileHandler.copy(Source, new File(Path));
		      ITesseract image = new Tesseract();
		      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
		      String imageText=image.doOCR(new File(Path));
		      System.out.println(imageText);
		      String a1=null;
		      String a2=null;
		      
		      String replaceAll = imageText.replaceAll("\\s","");
		       a1 = replaceAll;
	    	   a2 = b.readSMOriginalBlendPrice();
	    	   System.out.println(a1);
	    	   System.out.println(a2);
		      /*try{
		    	  parseInt = Integer.parseInt(imageText);
		      }
		      catch(NumberFormatException ex){
		    	  System.out.println("Exception Handled");
		      }*/
		      if(a1.equals(a2)){
		    	  testcase.log(Status.PASS," Correct ala carte price of SM Original Blend Price" );
		    	  System.out.println("***********Scenario02 PASS: Correct ala carte price of SM Original Blend Price ***********");
		      }else{
		    	  testcase.log(Status.FAIL, "Incorrect ala carte price of SM Original Blend Price");
		    	  System.out.println("***********Scenario02 FAIL: Incorrect ala carte price of SM Original Blend Price ***********");
		    	  
		      }
		      s.wait(VoidItem, 300);
		      s.click(VoidItem.similar((float)0.5));
		  }
	  	
	  	@Test(priority = 3)
		  public void siKuliTestCase003() throws FindFailed, IOException, TesseractException, InterruptedException 
		  {	 
			 testcase=extent.createTest("TC_003:Verify Medium Original Blend Coffee Price");
			 
			 RegressionTestCase b = new RegressionTestCase();
			 
			 Thread.sleep(2000); 
			 s.wait(MDCoffee, 300);  
		     s.click(MDCoffee.similar((float)0.5)); 
		     testcase.log(Status.PASS, "User able to Click the Medium Original Blend Coffee Button");
		     s.wait(EatIn, 300);  
		     s.click(EatIn.similar((float)0.8));
		     testcase.log(Status.PASS, "User able to Click the Eatin Button");
		      File Source = new File("MDOriginalBlendPrice.png");
		      String Path = System.getProperty("user.dir")+"/Images/MDOriginalBlendPrice.png";
		      FileHandler.copy(Source, new File(Path));
		      ITesseract image = new Tesseract();
		      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
		      String imageText=image.doOCR(new File(Path));
		      System.out.println(imageText);
		      System.out.println(b.readMdOriginalBlendPrice());
		      String a1=null;
		      String a2=null;
		      
		      String replaceAll = imageText.replaceAll("\\s","");
		       a1 = replaceAll;
	    	   a2 = b.readMdOriginalBlendPrice();
	    	   System.out.println(a1);
	    	   System.out.println(a2);
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		    	   a1 = parseInt;
		    	   a2 = b.readMdOriginalBlendPrice();
		    	   	    	   
		    	} 
		      catch(NumberFormatException ex)
		      { 
		    	  System.out.println(parseInt);
		    	  System.out.println("Exception Handled"); 
		    	}
		      System.out.println(a1);
		      System.out.println(a2);
		      
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		      }
		      catch(NumberFormatException ex){
		    	  System.out.println("Exception Handled");
		      }*/
		      
		      if(a1.equals(a2)){
		    	  testcase.log(Status.PASS," Correct ala carte price of Md Original Blend Price" );
		    	  System.out.println("***********Scenario03 PASS: Correct ala carte price of Md Original Blend Price ***********");
		      }else{
		    	  testcase.log(Status.FAIL, "Incorrect ala carte price of Md Original Blend Price");
		    	  System.out.println("***********Scenario03 FAIL: Incorrect ala carte price of Md Original Blend Price ***********");
		    	  
		      }
		      s.wait(VoidItem, 300);
		      s.click(VoidItem.similar((float)0.5));
		  }
	  	@Test(priority = 4)
		  public void siKuliTestCase004() throws FindFailed, IOException, TesseractException, InterruptedException 
		  {	 
			 testcase=extent.createTest("TC_004:Verify Large Original Blend Coffee Price");
			 
			 RegressionTestCase b = new RegressionTestCase();
			 
			 Thread.sleep(2000); 
			 s.wait(LGCoffee, 300);  
		     s.click(LGCoffee.similar((float)0.5)); 
		     testcase.log(Status.PASS, "User able to Click the Large Original Blend Coffee Button");
		     s.wait(EatIn, 300);  
		     s.click(EatIn.similar((float)0.8));
		     testcase.log(Status.PASS, "User able to Click the Eatin Button");
		      File Source = new File("LGCoffeePrice.png");
		      String Path = System.getProperty("user.dir")+"/Images/LGCoffeePrice.png";
		      FileHandler.copy(Source, new File(Path));
		      ITesseract image = new Tesseract();
		      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
		      String imageText=image.doOCR(new File(Path));
		      System.out.println(imageText);
		      System.out.println(b.readLGOriginalBlendPrice());
		      String a1=null;
		      String a2=null;
		      
		      String replaceAll = imageText.replaceAll("\\s","");
		       a1 = replaceAll;
	    	   a2 = b.readLGOriginalBlendPrice();
	    	   System.out.println(a1);
	    	   System.out.println(a2);
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		    	   a1 = parseInt;
		    	   a2 = b.readMdOriginalBlendPrice();
		    	   	    	   
		    	} 
		      catch(NumberFormatException ex)
		      { 
		    	  System.out.println(parseInt);
		    	  System.out.println("Exception Handled"); 
		    	}
		      System.out.println(a1);
		      System.out.println(a2);
		      
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		      }
		      catch(NumberFormatException ex){
		    	  System.out.println("Exception Handled");
		      }*/
		      
		      if(a1.equals(a2)){
		    	  testcase.log(Status.PASS," Correct ala carte price of Large Original Blend Price" );
		    	  System.out.println("***********Scenario04 PASS: Correct ala carte price of Large Original Blend Price ***********");
		      }else{
		    	  testcase.log(Status.FAIL, "Incorrect ala carte price of Large Original Blend Price");
		    	  System.out.println("***********Scenario04 FAIL: Incorrect ala carte price of Large Original Blend Price ***********");
		    	  
		      }
		      s.wait(VoidItem, 300);
		      s.click(VoidItem.similar((float)0.5));
		  }
	  	
	  	@Test(priority = 5)
		  public void siKuliTestCase005() throws FindFailed, IOException, TesseractException, InterruptedException 
		  {	 
			 testcase=extent.createTest("TC_005:Verify Small Refill Original Blend Coffee Price");
			 
			 RegressionTestCase b = new RegressionTestCase();
			 
			 Thread.sleep(2000);
			
			 s.wait(OriginalBlend,300);
			 s.click(OriginalBlend.similar((float)0.5));
			 s.wait(RefillSmallOriginalBlend,300);
			 s.click(RefillSmallOriginalBlend.similar((float)0.5)); 
		     testcase.log(Status.PASS, "User able to Click the Small Refill Original Blend Coffee Button");
		     s.wait(EatIn, 300);  
		     s.click(EatIn.similar((float)0.8));
		     testcase.log(Status.PASS, "User able to Click the Eatin Button");
		      File Source = new File("RefillSmallCoffeePrice.png");
		      String Path = System.getProperty("user.dir")+"/Images/RefillSmallCoffeePrice.png";
		      FileHandler.copy(Source, new File(Path));
		      ITesseract image = new Tesseract();
		      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
		      String imageText=image.doOCR(new File(Path));
		      System.out.println(imageText);
		      System.out.println(b.readRefillSmallCoffeePrice());
		      String a1=null;
		      String a2=null;
		      
		      String replaceAll = imageText.replaceAll("\\s","");
		       a1 = replaceAll;
	    	   a2 = b.readRefillSmallCoffeePrice();
	    	   System.out.println(a1);
	    	   System.out.println(a2);
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		    	   a1 = parseInt;
		    	   a2 = b.readMdOriginalBlendPrice();
		    	   	    	   
		    	} 
		      catch(NumberFormatException ex)
		      { 
		    	  System.out.println(parseInt);
		    	  System.out.println("Exception Handled"); 
		    	}
		      System.out.println(a1);
		      System.out.println(a2);
		      
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		      }
		      catch(NumberFormatException ex){
		    	  System.out.println("Exception Handled");
		      }*/
		      
		      if(a1.equals(a2)){
		    	  testcase.log(Status.PASS," Correct ala carte price of Small Refill Original Blend Price" );
		    	  System.out.println("***********Scenario05 PASS: Correct ala carte price of Small Refill Original Blend Price ***********");
		      }else{
		    	  testcase.log(Status.FAIL, "Incorrect ala carte price of Small Refill Original Blend Price");
		    	  System.out.println("***********Scenario05 FAIL: Incorrect ala carte price of Small Refill Original Blend Price ***********");
		    	  
		      }
		      s.wait(VoidItem, 300);
		      s.click(VoidItem.similar((float)0.5));
		  }
	  	@Test(priority = 6)
		  public void siKuliTestCase006() throws FindFailed, IOException, TesseractException, InterruptedException 
		  {	 
			 testcase=extent.createTest("TC_006:Verify Medium Refill Original Blend Coffee Price");
			 
			 RegressionTestCase b = new RegressionTestCase();
			 
			 Thread.sleep(2000);
			 
			 s.wait(OriginalBlend,300);
			 s.click(OriginalBlend.similar((float)0.5));
			 s.wait(RefillMediumOriginalBlend,300);
			 s.click(RefillMediumOriginalBlend.similar((float)0.5)); 
		     testcase.log(Status.PASS, "User able to Click the Medium Refill Original Blend Coffee Button");
		     s.wait(EatIn, 300);  
		     s.click(EatIn.similar((float)0.8));
		     testcase.log(Status.PASS, "User able to Click the Eatin Button");
		      File Source = new File("RefillMediumCoffeePrice.png");
		      String Path = System.getProperty("user.dir")+"/Images/RefillMediumCoffeePrice.png";
		      FileHandler.copy(Source, new File(Path));
		      ITesseract image = new Tesseract();
		      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
		      String imageText=image.doOCR(new File(Path));
		      System.out.println(imageText);
		      System.out.println(b.readRefillMediumCoffeePrice());
		      String a1=null;
		      String a2=null;
		      
		      String replaceAll = imageText.replaceAll("\\s","");
		       a1 = replaceAll;
	    	   a2 = b.readRefillMediumCoffeePrice();
	    	   System.out.println(a1);
	    	   System.out.println(a2);
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		    	   a1 = parseInt;
		    	   a2 = b.readMdOriginalBlendPrice();
		    	   	    	   
		    	} 
		      catch(NumberFormatException ex)
		      { 
		    	  System.out.println(parseInt);
		    	  System.out.println("Exception Handled"); 
		    	}
		      System.out.println(a1);
		      System.out.println(a2);
		      
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		      }
		      catch(NumberFormatException ex){
		    	  System.out.println("Exception Handled");
		      }*/
		      
		      if(a1.equals(a2)){
		    	  testcase.log(Status.PASS," Correct ala carte price of Medium Refill Original Blend Price" );
		    	  System.out.println("***********Scenario06 PASS: Correct ala carte price of Medium Refill Original Blend Price ***********");
		      }else{
		    	  testcase.log(Status.FAIL, "Incorrect ala carte price of Medium Refill Original Blend Price");
		    	  System.out.println("***********Scenario06 FAIL: Incorrect ala carte price of Medium Refill Original Blend Price ***********");
		    	  
		      }
		      s.wait(VoidItem, 300);
		      s.click(VoidItem.similar((float)0.5));
		  }
	  	
	  	@Test(priority = 7)
		  public void siKuliTestCase007() throws FindFailed, IOException, TesseractException, InterruptedException 
		  {	 
			 testcase=extent.createTest("TC_007:Verify Large Refill Original Blend Coffee Price");
			 
			 RegressionTestCase b = new RegressionTestCase();
			 
			 Thread.sleep(2000);
			 
			 s.wait(OriginalBlend,300);
			 s.click(OriginalBlend.similar((float)0.5));
			 s.wait(RefillLargeOriginalBlend,300);
			 s.click(RefillLargeOriginalBlend.similar((float)0.5)); 
		     testcase.log(Status.PASS, "User able to Click the Large Refill Original Blend Coffee Button");
		     s.wait(EatIn, 300);  
		     s.click(EatIn.similar((float)0.8));
		     testcase.log(Status.PASS, "User able to Click the Eatin Button");
		      File Source = new File("RefillLargeCoffeePrice.png");
		      String Path = System.getProperty("user.dir")+"/Images/RefillLargeCoffeePrice.png";
		      FileHandler.copy(Source, new File(Path));
		      ITesseract image = new Tesseract();
		      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
		      String imageText=image.doOCR(new File(Path));
		      System.out.println(imageText);
		      System.out.println(b.readRefillLargeCoffeePrice());
		      String a1=null;
		      String a2=null;
		      
		      String replaceAll = imageText.replaceAll("\\s","");
		       a1 = replaceAll;
	    	   a2 = b.readRefillLargeCoffeePrice();
	    	   System.out.println(a1);
	    	   System.out.println(a2);
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		    	   a1 = parseInt;
		    	   a2 = b.readMdOriginalBlendPrice();
		    	   	    	   
		    	} 
		      catch(NumberFormatException ex)
		      { 
		    	  System.out.println(parseInt);
		    	  System.out.println("Exception Handled"); 
		    	}
		      System.out.println(a1);
		      System.out.println(a2);
		      
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		      }
		      catch(NumberFormatException ex){
		    	  System.out.println("Exception Handled");
		      }*/
		      
		      if(a1.equals(a2)){
		    	  testcase.log(Status.PASS," Correct ala carte price of Large Refill Original Blend Price" );
		    	  System.out.println("***********Scenario07 PASS: Correct ala carte price of Large Refill Original Blend Price ***********");
		      }else{
		    	  testcase.log(Status.FAIL, "Incorrect ala carte price of Large Refill Original Blend Price");
		    	  System.out.println("***********Scenario07 FAIL: Incorrect ala carte price of Large Refill Original Blend Price ***********");
		    	  
		      }
		      s.wait(VoidItem, 300);
		      s.click(VoidItem.similar((float)0.5));
		  }
	  	

	  	@Test(priority = 8)
		  public void siKuliTestCase008() throws FindFailed, IOException, TesseractException, InterruptedException 
		  {	 
			 testcase=extent.createTest("TC_008:Verify Small Dark Roast Coffee Price");
			 
			 RegressionTestCase b = new RegressionTestCase();
			 
			 Thread.sleep(2000);
			 
			 s.wait(DarkRoast,300);
			 s.click(DarkRoast.similar((float)0.5));
			 s.wait(SmallDarkRoast,300);
			 s.click(SmallDarkRoast.similar((float)0.5)); 
		     testcase.log(Status.PASS, "User able to Click the Small Dark Roast Coffee Button");
		     s.wait(EatIn, 300);  
		     s.click(EatIn.similar((float)0.8));
		     testcase.log(Status.PASS, "User able to Click the Eatin Button");
		      File Source = new File("SmallDarkRoastPrice.png");
		      String Path = System.getProperty("user.dir")+"/Images/SmallDarkRoastPrice.png";
		      FileHandler.copy(Source, new File(Path));
		      ITesseract image = new Tesseract();
		      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
		      String imageText=image.doOCR(new File(Path));
		      System.out.println(imageText);
		      System.out.println(b.readSmallDarkRoastPrice());
		      String a1=null;
		      String a2=null;
		      
		      String replaceAll = imageText.replaceAll("\\s","");
		       a1 = replaceAll;
	    	   a2 = b.readSmallDarkRoastPrice();
	    	   System.out.println(a1);
	    	   System.out.println(a2);
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		    	   a1 = parseInt;
		    	   a2 = b.readMdOriginalBlendPrice();
		    	   	    	   
		    	} 
		      catch(NumberFormatException ex)
		      { 
		    	  System.out.println(parseInt);
		    	  System.out.println("Exception Handled"); 
		    	}
		      System.out.println(a1);
		      System.out.println(a2);
		      
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		      }
		      catch(NumberFormatException ex){
		    	  System.out.println("Exception Handled");
		      }*/
		      
		      if(a1.equals(a2)){
		    	  testcase.log(Status.PASS," Correct ala carte price of Small Dark Roast Coffee Price" );
		    	  System.out.println("***********Scenario08 PASS: Correct ala carte price of Small Dark Roast Coffee Price ***********");
		      }else{
		    	  testcase.log(Status.FAIL, "Incorrect ala carte price of Small Dark Roast Coffee Price");
		    	  System.out.println("***********Scenario08 FAIL: Incorrect ala carte price of Small Dark Roast Coffee Price ***********");
		    	  
		      }
		      s.wait(VoidItem, 300);
		      s.click(VoidItem.similar((float)0.5));
		  }
	  	@Test(priority = 9)
		  public void siKuliTestCase09() throws FindFailed, IOException, TesseractException, InterruptedException 
		  {	 
			 testcase=extent.createTest("TC_009:Verify Medium Dark Roast Coffee Price");
			 
			 RegressionTestCase b = new RegressionTestCase();
			 
			 Thread.sleep(2000);
			 
			 s.wait(DarkRoast,300);
			 s.click(DarkRoast.similar((float)0.5));
			 s.wait(MediumDarkRoast,300);
			 s.click(MediumDarkRoast.similar((float)0.5)); 
		     testcase.log(Status.PASS, "User able to Click the Medium Dark Roast Coffee Button");
		     s.wait(EatIn, 300);  
		     s.click(EatIn.similar((float)0.8));
		     testcase.log(Status.PASS, "User able to Click the Eatin Button");
		      File Source = new File("MediumDarkRoastPrice.png");
		      String Path = System.getProperty("user.dir")+"/Images/MediumDarkRoastPrice.png";
		      FileHandler.copy(Source, new File(Path));
		      ITesseract image = new Tesseract();
		      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
		      String imageText=image.doOCR(new File(Path));
		      System.out.println(imageText);
		      System.out.println(b.readMediumDarkRoastPrice());
		      String a1=null;
		      String a2=null;
		      
		      String replaceAll = imageText.replaceAll("\\s","");
		       a1 = replaceAll;
	    	   a2 = b.readMediumDarkRoastPrice();
	    	   System.out.println(a1);
	    	   System.out.println(a2);
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		    	   a1 = parseInt;
		    	   a2 = b.readMdOriginalBlendPrice();
		    	   	    	   
		    	} 
		      catch(NumberFormatException ex)
		      { 
		    	  System.out.println(parseInt);
		    	  System.out.println("Exception Handled"); 
		    	}
		      System.out.println(a1);
		      System.out.println(a2);
		      
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		      }
		      catch(NumberFormatException ex){
		    	  System.out.println("Exception Handled");
		      }*/
		      
		      if(a1.equals(a2)){
		    	  testcase.log(Status.PASS," Correct ala carte price of Medium Dark Roast Coffee Price" );
		    	  System.out.println("***********Scenario09 PASS: Correct ala carte price of Medium Dark Roast Coffee Price ***********");
		      }else{
		    	  testcase.log(Status.FAIL, "Incorrect ala carte price of Medium Dark Roast Coffee Price");
		    	  System.out.println("***********Scenario09 FAIL: Incorrect ala carte price of Medium Dark Roast Coffee Price ***********");
		    	  
		      }
		      s.wait(VoidItem, 300);
		      s.click(VoidItem.similar((float)0.5));
		  }
	  	@Test(priority = 10)
		  public void siKuliTestCase010() throws FindFailed, IOException, TesseractException, InterruptedException 
		  {	 
			 testcase=extent.createTest("TC_010:Verify Large Dark Roast Coffee Price");
			 
			 RegressionTestCase b = new RegressionTestCase();
			 
			 Thread.sleep(2000);
			 
			 s.wait(DarkRoast,300);
			 s.click(DarkRoast.similar((float)0.5));
			 s.wait(LargeDarkRoast,300);
			 s.click(LargeDarkRoast.similar((float)0.5)); 
		     testcase.log(Status.PASS, "User able to Click the Large Dark Roast Coffee Button");
		     s.wait(EatIn, 300);  
		     s.click(EatIn.similar((float)0.8));
		     testcase.log(Status.PASS, "User able to Click the Eatin Button");
		      File Source = new File("LargeDarkRoastPrice.png");
		      String Path = System.getProperty("user.dir")+"/Images/LargeDarkRoastPrice.png";
		      FileHandler.copy(Source, new File(Path));
		      ITesseract image = new Tesseract();
		      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
		      String imageText=image.doOCR(new File(Path));
		      System.out.println(imageText);
		      System.out.println(b.readLargeDarkRoastPrice());
		      String a1=null;
		      String a2=null;
		      
		      String replaceAll = imageText.replaceAll("\\s","");
		       a1 = replaceAll;
	    	   a2 = b.readLargeDarkRoastPrice();
	    	   System.out.println(a1);
	    	   System.out.println(a2);
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		    	   a1 = parseInt;
		    	   a2 = b.readMdOriginalBlendPrice();
		    	   	    	   
		    	} 
		      catch(NumberFormatException ex)
		      { 
		    	  System.out.println(parseInt);
		    	  System.out.println("Exception Handled"); 
		    	}
		      System.out.println(a1);
		      System.out.println(a2);
		      
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		      }
		      catch(NumberFormatException ex){
		    	  System.out.println("Exception Handled");
		      }*/
		      
		      if(a1.equals(a2)){
		    	  testcase.log(Status.PASS," Correct ala carte price of Large Dark Roast Coffee Price" );
		    	  System.out.println("***********Scenario10 PASS: Correct ala carte price of Large Dark Roast Coffee Price ***********");
		      }else{
		    	  testcase.log(Status.FAIL, "Incorrect ala carte price of Large Dark Roast Coffee Price");
		    	  System.out.println("***********Scenario10 FAIL: Incorrect ala carte price of Large Dark Roast Coffee Price ***********");
		    	  
		      }
		      s.wait(VoidItem, 300);
		      s.click(VoidItem.similar((float)0.5));
		      
		  }
	  	
	  	@Test(priority = 11)
		  public void siKuliTestCase011() throws FindFailed, IOException, TesseractException, InterruptedException 
		  {	 
			 testcase=extent.createTest("TC_011:Verify Small Refill Dark Roast Coffee Price");
			 
			 RegressionTestCase b = new RegressionTestCase();
			 
			 Thread.sleep(2000);
			 
			 s.wait(DarkRoast,300);
			 s.click(DarkRoast.similar((float)0.5));
			 s.wait(SmallRefillDarkRoast,300);
			 s.click(SmallRefillDarkRoast.similar((float)0.5)); 
		     testcase.log(Status.PASS, "User able to Click the Small Refill Dark Roast Coffee Button");
		     s.wait(EatIn, 300);  
		     s.click(EatIn.similar((float)0.8));
		     testcase.log(Status.PASS, "User able to Click the Eatin Button");
		      File Source = new File("SmallRefillDarkRoastPrice.png");
		      String Path = System.getProperty("user.dir")+"/Images/SmallRefillDarkRoastPrice.png";
		      FileHandler.copy(Source, new File(Path));
		      ITesseract image = new Tesseract();
		      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
		      String imageText=image.doOCR(new File(Path));
		      System.out.println(imageText);
		      System.out.println(b.readSmallRefillDarkRoastPrice());
		      String a1=null;
		      String a2=null;
		      
		      String replaceAll = imageText.replaceAll("\\s","");
		       a1 = replaceAll;
	    	   a2 = b.readSmallRefillDarkRoastPrice();
	    	   System.out.println(a1);
	    	   System.out.println(a2);
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		    	   a1 = parseInt;
		    	   a2 = b.readMdOriginalBlendPrice();
		    	   	    	   
		    	} 
		      catch(NumberFormatException ex)
		      { 
		    	  System.out.println(parseInt);
		    	  System.out.println("Exception Handled"); 
		    	}
		      System.out.println(a1);
		      System.out.println(a2);
		      
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		      }
		      catch(NumberFormatException ex){
		    	  System.out.println("Exception Handled");
		      }*/
		      
		      if(a1.equals(a2)){
		    	  testcase.log(Status.PASS," Correct ala carte price of Small Refill Dark Roast Coffee Price" );
		    	  System.out.println("***********Scenario11 PASS: Correct ala carte price of Small Refill Dark Roast Coffee Price ***********");
		      }else{
		    	  testcase.log(Status.FAIL, "Incorrect ala carte price of Small Refill Dark Roast Coffee Price");
		    	  System.out.println("***********Scenario11 FAIL: Incorrect ala carte price of Small Refill Dark Roast Coffee Price ***********");
		    	  
		      }
		      s.wait(VoidItem, 300);
		      s.click(VoidItem.similar((float)0.5));
		  }
	  	@Test(priority = 12)
		  public void siKuliTestCase012() throws FindFailed, IOException, TesseractException, InterruptedException 
		  {	 
			 testcase=extent.createTest("TC_012:Verify Medium Refill Dark Roast Coffee Price");
			 
			 RegressionTestCase b = new RegressionTestCase();
			 
			 Thread.sleep(2000);
			 
			 s.wait(DarkRoast,300);
			 s.click(DarkRoast.similar((float)0.5));
			 s.wait(MediumRefillDarkRoast,300);
			 s.click(MediumRefillDarkRoast.similar((float)0.5)); 
		     testcase.log(Status.PASS, "User able to Click the Medium Refill Dark Roast Coffee Button");
		     s.wait(EatIn, 300);  
		     s.click(EatIn.similar((float)0.8));
		     testcase.log(Status.PASS, "User able to Click the Eatin Button");
		      File Source = new File("MediumRefillDarkRoastPrice.png");
		      String Path = System.getProperty("user.dir")+"/Images/MediumRefillDarkRoastPrice.png";
		      FileHandler.copy(Source, new File(Path));
		      ITesseract image = new Tesseract();
		      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
		      String imageText=image.doOCR(new File(Path));
		      System.out.println(imageText);
		      System.out.println(b.readMediumRefillDarkRoastPrice());
		      String a1=null;
		      String a2=null;
		      
		      String replaceAll = imageText.replaceAll("\\s","");
		       a1 = replaceAll;
	    	   a2 = b.readMediumRefillDarkRoastPrice();
	    	   System.out.println(a1);
	    	   System.out.println(a2);
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		    	   a1 = parseInt;
		    	   a2 = b.readMdOriginalBlendPrice();
		    	   	    	   
		    	} 
		      catch(NumberFormatException ex)
		      { 
		    	  System.out.println(parseInt);
		    	  System.out.println("Exception Handled"); 
		    	}
		      System.out.println(a1);
		      System.out.println(a2);
		      
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		      }
		      catch(NumberFormatException ex){
		    	  System.out.println("Exception Handled");
		      }*/
		      
		      if(a1.equals(a2)){
		    	  testcase.log(Status.PASS," Correct ala carte price of Medium Refill Dark Roast Coffee Price" );
		    	  System.out.println("***********Scenario12 PASS: Correct ala carte price of Medium Refill Dark Roast Coffee Price ***********");
		      }else{
		    	  testcase.log(Status.FAIL, "Incorrect ala carte price of Medium Refill Dark Roast Coffee Price");
		    	  System.out.println("***********Scenario12 FAIL: Incorrect ala carte price of Medium Refill Dark Roast Coffee Price ***********");
		    	  
		      }
		      s.wait(VoidItem, 300);
		      s.click(VoidItem.similar((float)0.5));
		  }
	  	@Test(priority = 13)
		  public void siKuliTestCase013() throws FindFailed, IOException, TesseractException, InterruptedException 
		  {	 
			 testcase=extent.createTest("TC_013:Verify Large Refill Dark Roast Coffee Price");
			 
			 RegressionTestCase b = new RegressionTestCase();
			 
			 Thread.sleep(2000);
			 
			 s.wait(DarkRoast,300);
			 s.click(DarkRoast.similar((float)0.5));
			 s.wait(LargeRefillDarkRoast,300);
			 s.click(LargeRefillDarkRoast.similar((float)0.5)); 
		     testcase.log(Status.PASS, "User able to Click the Large Refill Dark Roast Coffee Button");
		     s.wait(EatIn, 300);  
		     s.click(EatIn.similar((float)0.8));
		     testcase.log(Status.PASS, "User able to Click the Eatin Button");
		      File Source = new File("LargeRefillDarkRoastPrice.png");
		      String Path = System.getProperty("user.dir")+"/Images/LargeRefillDarkRoastPrice.png";
		      FileHandler.copy(Source, new File(Path));
		      ITesseract image = new Tesseract();
		      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
		      String imageText=image.doOCR(new File(Path));
		      System.out.println(imageText);
		      System.out.println(b.readLargeRefillDarkRoastPrice());
		      String a1=null;
		      String a2=null;
		      
		      String replaceAll = imageText.replaceAll("\\s","");
		       a1 = replaceAll;
	    	   a2 = b.readLargeRefillDarkRoastPrice();
	    	   System.out.println(a1);
	    	   System.out.println(a2);
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		    	   a1 = parseInt;
		    	   a2 = b.readMdOriginalBlendPrice();
		    	   	    	   
		    	} 
		      catch(NumberFormatException ex)
		      { 
		    	  System.out.println(parseInt);
		    	  System.out.println("Exception Handled"); 
		    	}
		      System.out.println(a1);
		      System.out.println(a2);
		      
		     /* try{
		    	  parseInt = Integer.parseInt(imageText);
		      }
		      catch(NumberFormatException ex){
		    	  System.out.println("Exception Handled");
		      }*/
		      
		      if(a1.equals(a2)){
		    	  testcase.log(Status.PASS," Correct ala carte price of Large Refill Dark Roast Coffee Price" );
		    	  System.out.println("***********Scenario13 PASS: Correct ala carte price of Large Refill Dark Roast Coffee Price ***********");
		      }else{
		    	  testcase.log(Status.FAIL, "Incorrect ala carte price of Large Refill Dark Roast Coffee Price");
		    	  System.out.println("***********Scenario13 FAIL: Incorrect ala carte price of Large Refill Dark Roast Coffee Price ***********");
		    	  
		      }
		      s.wait(VoidItem, 300);
		      s.click(VoidItem.similar((float)0.5));
		  }
	  	
	  	@Test(priority = 14)
        public void siKuliTestCase014() throws FindFailed, IOException, TesseractException, InterruptedException 
        {     
           testcase=extent.createTest("TC_014:Verify Small Decaf Price");

           RegressionTestCase b = new RegressionTestCase();

           Thread.sleep(2000);
           
           s.wait(Decaf,300);
           s.click(Decaf.similar((float)0.5));
           s.wait(SmallDecaf,300);
           s.click(SmallDecaf.similar((float)0.5)); 
           testcase.log(Status.PASS, "User able to Click the Small Decaf Button");
           s.wait(EatIn, 300);  
           s.click(EatIn.similar((float)0.8));
           testcase.log(Status.PASS, "User able to Click the Eatin Button");
            File Source = new File("SmallDecafPrice.png");
            String Path = System.getProperty("user.dir")+"/Images/SmallDecafPrice.png";
            FileHandler.copy(Source, new File(Path));
            ITesseract image = new Tesseract();
            image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
            String imageText=image.doOCR(new File(Path));
            System.out.println(imageText);
            System.out.println(b.readSmallDecafPrice());
            String a1=null;
            String a2=null;

            String replaceAll = imageText.replaceAll("\\s","");
             a1 = replaceAll;
             a2 = b.readSmallDecafPrice();
             System.out.println(a1);
             System.out.println(a2);
           /* try{
                parseInt = Integer.parseInt(imageText);
                 a1 = parseInt;
                 a2 = b.readMdOriginalBlendPrice();

              } 
            catch(NumberFormatException ex)
            { 
                System.out.println(parseInt);
                System.out.println("Exception Handled"); 
              }
            System.out.println(a1);
            System.out.println(a2);

           /* try{
                parseInt = Integer.parseInt(imageText);
            }
            catch(NumberFormatException ex){
                System.out.println("Exception Handled");
            }*/

            if(a1.equals(a2)){
                testcase.log(Status.PASS," Correct ala carte price of Small Decaf Price" );
                System.out.println("***********Scenario14 PASS: Correct ala carte price of small Decaf Price ***********");
            }else{
                testcase.log(Status.FAIL, "Incorrect ala carte price of Small Decaf Price");
                System.out.println("***********Scenario14 FAIL: Incorrect ala carte price of Small Decaf Price ***********");
                
            }
            s.wait(VoidItem, 300);
            s.click(VoidItem.similar((float)0.5));
        }
		@Test(priority = 15)
        public void siKuliTestCase015() throws FindFailed, IOException, TesseractException, InterruptedException 
        {     
           testcase=extent.createTest("TC_015:Verify Medium Decaf Price");

           RegressionTestCase b = new RegressionTestCase();

           Thread.sleep(2000);
           
           s.wait(Decaf,300);
           s.click(Decaf.similar((float)0.5));
           s.wait(MediumDecaf,300);
           s.click(MediumDecaf.similar((float)0.5)); 
           testcase.log(Status.PASS, "User able to Click the Medium Decaf Button");
           s.wait(EatIn, 300);  
           s.click(EatIn.similar((float)0.8));
           testcase.log(Status.PASS, "User able to Click the Eatin Button");
            File Source = new File("MediumDecafPrice.png");
            String Path = System.getProperty("user.dir")+"/Images/MediumDecafPrice.png";
            FileHandler.copy(Source, new File(Path));
            ITesseract image = new Tesseract();
            image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
            String imageText=image.doOCR(new File(Path));
            System.out.println(imageText);
            System.out.println(b.readMediumDecafPrice());
            String a1=null;
            String a2=null;

            String replaceAll = imageText.replaceAll("\\s","");
             a1 = replaceAll;
             a2 = b.readMediumDecafPrice();
             System.out.println(a1);
             System.out.println(a2);
           /* try{
                parseInt = Integer.parseInt(imageText);
                 a1 = parseInt;
                 a2 = b.readMdOriginalBlendPrice();

              } 
            catch(NumberFormatException ex)
            { 
                System.out.println(parseInt);
                System.out.println("Exception Handled"); 
              }
            System.out.println(a1);
            System.out.println(a2);

           /* try{
                parseInt = Integer.parseInt(imageText);
            }
            catch(NumberFormatException ex){
                System.out.println("Exception Handled");
            }*/

            if(a1.equals(a2)){
                testcase.log(Status.PASS," Correct ala carte price of Medium Decaf Price" );
                System.out.println("***********Scenario15 PASS: Correct ala carte price of Medium Decaf Price ***********");
            }else{
                testcase.log(Status.FAIL, "Incorrect ala carte price of Medium Decaf Price");
                System.out.println("***********Scenario15 FAIL: Incorrect ala carte price of Medium Decaf Price ***********");
                
            }
            s.wait(VoidItem, 300);
            s.click(VoidItem.similar((float)0.5));
        }
		@Test(priority = 16)
        public void siKuliTestCase016() throws FindFailed, IOException, TesseractException, InterruptedException 
        {     
           testcase=extent.createTest("TC_016:Verify Large Decaf Price");

           RegressionTestCase b = new RegressionTestCase();

           Thread.sleep(2000);
          
           s.wait(Decaf,300);
           s.click(Decaf.similar((float)0.5));
           s.wait(LargeDecaf,300);
           s.click(LargeDecaf.similar((float)0.5)); 
           testcase.log(Status.PASS, "User able to Click the Large Decaf Button");
           s.wait(EatIn, 300);  
           s.click(EatIn.similar((float)0.8));
           testcase.log(Status.PASS, "User able to Click the Eatin Button");
            File Source = new File("LargeDecafPrice.png");
            String Path = System.getProperty("user.dir")+"/Images/LargeDecafPrice.png";
            FileHandler.copy(Source, new File(Path));
            ITesseract image = new Tesseract();
            image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
            String imageText=image.doOCR(new File(Path));
            System.out.println(imageText);
            System.out.println(b.readLargeDecafPrice());
            String a1=null;
            String a2=null;

            String replaceAll = imageText.replaceAll("\\s","");
             a1 = replaceAll;
             a2 = b.readLargeDecafPrice();
             System.out.println(a1);
             System.out.println(a2);
           /* try{
                parseInt = Integer.parseInt(imageText);
                 a1 = parseInt;
                 a2 = b.readMdOriginalBlendPrice();

              } 
            catch(NumberFormatException ex)
            { 
                System.out.println(parseInt);
                System.out.println("Exception Handled"); 
              }
            System.out.println(a1);
            System.out.println(a2);

           /* try{
                parseInt = Integer.parseInt(imageText);
            }
            catch(NumberFormatException ex){
                System.out.println("Exception Handled");
            }*/

            if(a1.equals(a2)){
                testcase.log(Status.PASS," Correct ala carte price of Large Decaf Price" );
                System.out.println("***********Scenario16 PASS: Correct ala carte price of Large Decaf Price ***********");
            }else{
                testcase.log(Status.FAIL, "Incorrect ala carte price of Large Decaf Price");
                System.out.println("***********Scenario16 FAIL: Incorrect ala carte price of Large Decaf Price ***********");
                
            }
            s.wait(VoidItem, 300);
            s.click(VoidItem.similar((float)0.5));
        }
		
		@Test(priority = 17)
        public void siKuliTestCase017() throws FindFailed, IOException, TesseractException, InterruptedException 
        {     
           testcase=extent.createTest("TC_017:Verify Small Decaf-Refil Price");

           RegressionTestCase b = new RegressionTestCase();

           Thread.sleep(2000);
           
           s.wait(Decaf,300);
           s.click(Decaf.similar((float)0.5));
           s.wait(SmallDecafRefil,300);
           s.click(SmallDecafRefil.similar((float)0.5)); 
           testcase.log(Status.PASS, "User able to Click the Small Decaf-refil Button");
           s.wait(EatIn, 300);  
           s.click(EatIn.similar((float)0.8));
           testcase.log(Status.PASS, "User able to Click the Eatin Button");
            File Source = new File("SmallDecafRefilPrice.png");
            String Path = System.getProperty("user.dir")+"/Images/SmallDecafRefilPrice.png";
            FileHandler.copy(Source, new File(Path));
            ITesseract image = new Tesseract();
            image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
            String imageText=image.doOCR(new File(Path));
            System.out.println(imageText);
            System.out.println(b.readSmallRefillDecafPrice());
            String a1=null;
            String a2=null;

            String replaceAll = imageText.replaceAll("\\s","");
             a1 = replaceAll;
             a2 = b.readSmallRefillDecafPrice();
             System.out.println(a1);
             System.out.println(a2);
           /* try{
                parseInt = Integer.parseInt(imageText);
                 a1 = parseInt;
                 a2 = b.readMdOriginalBlendPrice();

              } 
            catch(NumberFormatException ex)
            { 
                System.out.println(parseInt);
                System.out.println("Exception Handled"); 
              }
            System.out.println(a1);
            System.out.println(a2);

           /* try{
                parseInt = Integer.parseInt(imageText);
            }
            catch(NumberFormatException ex){
                System.out.println("Exception Handled");
            }*/

            if(a1.equals(a2)){
                testcase.log(Status.PASS," Correct ala carte price of Small Decaf-Refil Price" );
                System.out.println("***********Scenario17 PASS: Correct ala carte price of Small Decaf-Refil Price ***********");
            }else{
                testcase.log(Status.FAIL, "Incorrect ala carte price of Small Decaf-Refil Price");
                System.out.println("***********Scenario17 FAIL: Incorrect ala carte price of Small Decaf-Refil Price ***********");
                
            }
            s.wait(VoidItem, 300);
            s.click(VoidItem.similar((float)0.5));
        }
		@Test(priority = 18)
        public void siKuliTestCase018() throws FindFailed, IOException, TesseractException, InterruptedException 
        {     
           testcase=extent.createTest("TC_018:Verify MediumDecafRefil Price");

           RegressionTestCase b = new RegressionTestCase();

           Thread.sleep(2000);
           
           s.wait(Decaf,300);
           s.click(Decaf.similar((float)0.5));
           s.wait(MediumDecafRefil,300);
           s.click(MediumDecafRefil.similar((float)0.5)); 
           testcase.log(Status.PASS, "User able to Click the MediumDecafRefil Button");
           s.wait(EatIn, 300);  
           s.click(EatIn.similar((float)0.8));
           testcase.log(Status.PASS, "User able to Click the Eatin Button");
            File Source = new File("MediumDecafRefilPrice.png");
            String Path = System.getProperty("user.dir")+"/Images/MediumDecafRefilPrice.png";
            FileHandler.copy(Source, new File(Path));
            ITesseract image = new Tesseract();
            image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
            String imageText=image.doOCR(new File(Path));
            System.out.println(imageText);
            System.out.println(b.readMediumRefillDecafPrice());
            String a1=null;
            String a2=null;

            String replaceAll = imageText.replaceAll("\\s","");
             a1 = replaceAll;
             a2 = b.readMediumRefillDecafPrice();
             System.out.println(a1);
             System.out.println(a2);
           /* try{
                parseInt = Integer.parseInt(imageText);
                 a1 = parseInt;
                 a2 = b.readMdOriginalBlendPrice();

              } 
            catch(NumberFormatException ex)
            { 
                System.out.println(parseInt);
                System.out.println("Exception Handled"); 
              }
            System.out.println(a1);
            System.out.println(a2);

           /* try{
                parseInt = Integer.parseInt(imageText);
            }
            catch(NumberFormatException ex){
                System.out.println("Exception Handled");
            }*/

            if(a1.equals(a2)){
                testcase.log(Status.PASS," Correct ala carte price of MediumDecafRefil Price" );
                System.out.println("***********Scenario18 PASS: Correct ala carte price of MediumDecafRefil Price ***********");
            }else{
                testcase.log(Status.FAIL, "Incorrect ala carte price of MediumDecafRefil Price");
                System.out.println("***********Scenario18 FAIL: Incorrect ala carte price of MediumDecafRefil Price ***********");
               
            }
            s.wait(VoidItem, 300);
            s.click(VoidItem.similar((float)0.5));
        }
		@Test(priority = 19)
        public void siKuliTestCase019() throws FindFailed, IOException, TesseractException, InterruptedException 
        {     
           testcase=extent.createTest("TC_019:Verify LargeDecafRefil Price");

           RegressionTestCase b = new RegressionTestCase();

           Thread.sleep(2000);
           
           s.wait(Decaf,300);
           s.click(Decaf.similar((float)0.5));
           s.wait(LargeDecafRefil,300);
           s.click(LargeDecafRefil.similar((float)0.5)); 
           testcase.log(Status.PASS, "User able to Click the LargeDecafRefil Button");
           s.wait(EatIn, 300);  
           s.click(EatIn.similar((float)0.8));
           testcase.log(Status.PASS, "User able to Click the Eatin Button");
            File Source = new File("LargeDecafRefilPrice.png");
            String Path = System.getProperty("user.dir")+"/Images/LargeDecafRefilPrice.png";
            FileHandler.copy(Source, new File(Path));
            ITesseract image = new Tesseract();
            image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
            String imageText=image.doOCR(new File(Path));
            System.out.println(imageText);
            System.out.println(b.readLargeRefillDecafPrice());
            String a1=null;
            String a2=null;

            String replaceAll = imageText.replaceAll("\\s","");
             a1 = replaceAll;
             a2 = b.readLargeRefillDecafPrice();
             System.out.println(a1);
             System.out.println(a2);
           /* try{
                parseInt = Integer.parseInt(imageText);
                 a1 = parseInt;
                 a2 = b.readMdOriginalBlendPrice();

              } 
            catch(NumberFormatException ex)
            { 
                System.out.println(parseInt);
                System.out.println("Exception Handled"); 
              }
            System.out.println(a1);
            System.out.println(a2);

           /* try{
                parseInt = Integer.parseInt(imageText);
            }
            catch(NumberFormatException ex){
                System.out.println("Exception Handled");
            }*/

            if(a1.equals(a2)){
                testcase.log(Status.PASS," Correct ala carte price of LargeDecafRefil Price" );
                System.out.println("***********Scenario19 PASS: Correct ala carte price of LargeDecafRefil Price ***********");
            }else{
                testcase.log(Status.FAIL, "Incorrect ala carte price of LargeDecafRefil Price");
                System.out.println("***********Scenario19 FAIL: Incorrect ala carte price of LargeDecafRefil Price ***********");
                
            }
            s.wait(VoidItem, 300);
            s.click(VoidItem.similar((float)0.5));
        }
		@Test(priority = 20)
        public void siKuliTestCase020() throws FindFailed, IOException, TesseractException, InterruptedException 
        {     
           testcase=extent.createTest("TC_020:Verify Assorted Donut Price");

           RegressionTestCase b = new RegressionTestCase();

           Thread.sleep(2000);
           
           s.wait(Sides,300);
           s.click(Sides.similar((float)0.5));
           s.wait(AssortedDonut,300);
           s.click(AssortedDonut.similar((float)0.5)); 
           testcase.log(Status.PASS, "User able to Click the AssortedDonut Button");
           s.wait(EatIn, 300);  
           s.click(EatIn.similar((float)0.8));
           testcase.log(Status.PASS, "User able to Click the Eatin Button");
            File Source = new File("AssortedDonutPrice.png");
            String Path = System.getProperty("user.dir")+"/Images/AssortedDonutPrice.png";
            FileHandler.copy(Source, new File(Path));
            ITesseract image = new Tesseract();
            image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
            String imageText=image.doOCR(new File(Path));
            System.out.println(imageText);
            System.out.println(b.readAssortedDonutPrice());
            String a1=null;
            String a2=null;

            String replaceAll = imageText.replaceAll("\\s","");
             a1 = replaceAll;
             a2 = b.readAssortedDonutPrice();
             System.out.println(a1);
             System.out.println(a2);
           /* try{
                parseInt = Integer.parseInt(imageText);
                 a1 = parseInt;
                 a2 = b.readMdOriginalBlendPrice();

              } 
            catch(NumberFormatException ex)
            { 
                System.out.println(parseInt);
                System.out.println("Exception Handled"); 
              }
            System.out.println(a1);
            System.out.println(a2);

           /* try{
                parseInt = Integer.parseInt(imageText);
            }
            catch(NumberFormatException ex){
                System.out.println("Exception Handled");
            }*/

            if(a1.equals(a2)){
                testcase.log(Status.PASS," Correct ala carte price of Assorted Donut Price" );
                System.out.println("***********Scenario20 PASS: Correct ala carte price of Assorted Donut Price ***********");
            }else{
                testcase.log(Status.FAIL, "Incorrect ala carte price of LargeDecafRefil Price");
                System.out.println("***********Scenario20 FAIL: Incorrect ala carte price of LargeDecafRefil Price ***********");
                
            }
            s.wait(VoidItem, 300);
            s.click(VoidItem.similar((float)0.5));
        }
		@Test(priority = 21)
        public void siKuliTestCase021() throws FindFailed, IOException, TesseractException, InterruptedException 
        {     
           testcase=extent.createTest("TC_021:Verify Assorted Premium Donut Price");

           RegressionTestCase b = new RegressionTestCase();

           Thread.sleep(2000);
           
           s.wait(Sides,300);
           s.click(Sides.similar((float)0.5));
           s.wait(AssortedPremiumDonut,300);
           s.click(AssortedPremiumDonut.similar((float)0.5)); 
           testcase.log(Status.PASS, "User able to Click the AssortedPremiumDonut Button");
           s.wait(EatIn, 300);  
           s.click(EatIn.similar((float)0.8));
           testcase.log(Status.PASS, "User able to Click the Eatin Button");
            File Source = new File("AssortedDonutPrice.png");
            String Path = System.getProperty("user.dir")+"/Images/AssortedPremiumDonutPrice.png";
            FileHandler.copy(Source, new File(Path));
            ITesseract image = new Tesseract();
            image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
            String imageText=image.doOCR(new File(Path));
            System.out.println(imageText);
            System.out.println(b.readAssortedPremiumPrice());
            String a1=null;
            String a2=null;

            String replaceAll = imageText.replaceAll("\\s","");
             a1 = replaceAll;
             a2 = b.readAssortedPremiumPrice();
             System.out.println(a1);
             System.out.println(a2);
           /* try{
                parseInt = Integer.parseInt(imageText);
                 a1 = parseInt;
                 a2 = b.readMdOriginalBlendPrice();

              } 
            catch(NumberFormatException ex)
            { 
                System.out.println(parseInt);
                System.out.println("Exception Handled"); 
              }
            System.out.println(a1);
            System.out.println(a2);

           /* try{
                parseInt = Integer.parseInt(imageText);
            }
            catch(NumberFormatException ex){
                System.out.println("Exception Handled");
            }*/

            if(a1.equals(a2)){
                testcase.log(Status.PASS," Correct ala carte price of Assorted Premium Donut Price" );
                System.out.println("***********Scenario21 PASS: Correct ala carte price of Assorted Premium Donut Price ***********");
            }else{
                testcase.log(Status.FAIL, "Incorrect ala carte price of Assorted Premium Donut Price");
                System.out.println("***********Scenario21 FAIL: Incorrect ala carte price of Assorted Premium Donut Price ***********");
                
            }
            s.wait(VoidItem, 300);
            s.click(VoidItem.similar((float)0.5));
        }
		@Test(priority = 22)
        public void siKuliTestCase022() throws FindFailed, IOException, TesseractException, InterruptedException 
        {     
           testcase=extent.createTest("TC_022:Verify BlueberryTimbit Price");

           RegressionTestCase b = new RegressionTestCase();

           Thread.sleep(2000);
           
           s.wait(Sides,300);
           s.click(Sides.similar((float)0.5));
           s.wait(Timbits,300);
           s.click(Timbits.similar((float)0.5)); 
           s.wait(BlueberryTimbits,300);
           s.click(BlueberryTimbits.similar((float)0.5)); 
           testcase.log(Status.PASS, "User able to Click the Timbit Button");
           s.wait(EatIn, 300);  
           s.click(EatIn.similar((float)0.8));
           testcase.log(Status.PASS, "User able to Click the Eatin Button");
            File Source = new File("BlueberryTimbitsPrice.png");
            String Path = System.getProperty("user.dir")+"/Images/BlueberryTimbitsPrice.png";
            FileHandler.copy(Source, new File(Path));
            ITesseract image = new Tesseract();
            image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
            String imageText=image.doOCR(new File(Path));
            System.out.println(imageText);
            System.out.println(b.readBlueberryTimbitPrice());
            String a1=null;
            String a2=null;

            String replaceAll = imageText.replaceAll("\\s","");
             a1 = replaceAll;
             a2 = b.readBlueberryTimbitPrice();
             System.out.println(a1);
             System.out.println(a2);
           /* try{
                parseInt = Integer.parseInt(imageText);
                 a1 = parseInt;
                 a2 = b.readMdOriginalBlendPrice();

              } 
            catch(NumberFormatException ex)
            { 
                System.out.println(parseInt);
                System.out.println("Exception Handled"); 
              }
            System.out.println(a1);
            System.out.println(a2);

           /* try{
                parseInt = Integer.parseInt(imageText);
            }
            catch(NumberFormatException ex){
                System.out.println("Exception Handled");
            }*/

            if(a1.equals(a2)){
                testcase.log(Status.PASS," Correct ala carte price of Blueberry Timbit Price" );
                System.out.println("***********Scenario22 PASS: Correct ala carte price of BlueberryTimbit Price ***********");
            }else{
                testcase.log(Status.FAIL, "Incorrect ala carte price of Blueberry Timbit Price");
                System.out.println("***********Scenario22 FAIL: Incorrect ala carte price of Blueberry Timbit Price ***********");
                
            }
            s.wait(VoidItem, 300);
            s.click(VoidItem.similar((float)0.5));
        }
		@Test(priority = 23)
        public void siKuliTestCase023() throws FindFailed, IOException, TesseractException, InterruptedException 
        {     
           testcase=extent.createTest("TC_023:Verify BlueberryMuffin Price");

           RegressionTestCase b = new RegressionTestCase();

           Thread.sleep(2000);
           
           s.wait(Sides,300);
           s.click(Sides.similar((float)0.5));
           s.wait(Muffin,300);
           s.click(Muffin.similar((float)0.5)); 
           s.wait(BlueberryMuffin,300);
           s.click(BlueberryMuffin.similar((float)0.5)); 
           testcase.log(Status.PASS, "User able to Click the BlueberryMuffin Button");
           s.wait(EatIn, 300);  
           s.click(EatIn.similar((float)0.8));
           testcase.log(Status.PASS, "User able to Click the Eatin Button");
            File Source = new File("BlueberryMuffinPrice.png");
            String Path = System.getProperty("user.dir")+"/Images/BlueberryMuffinPrice.png";
            FileHandler.copy(Source, new File(Path));
            ITesseract image = new Tesseract();
            image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
            String imageText=image.doOCR(new File(Path));
            System.out.println(imageText);
            System.out.println(b.readBlueberryMuffinPrice());
            String a1=null;
            String a2=null;

            String replaceAll = imageText.replaceAll("\\s","");
             a1 = replaceAll;
             a2 = b.readBlueberryMuffinPrice();
             System.out.println(a1);
             System.out.println(a2);
           /* try{
                parseInt = Integer.parseInt(imageText);
                 a1 = parseInt;
                 a2 = b.readMdOriginalBlendPrice();

              } 
            catch(NumberFormatException ex)
            { 
                System.out.println(parseInt);
                System.out.println("Exception Handled"); 
              }
            System.out.println(a1);
            System.out.println(a2);

           /* try{
                parseInt = Integer.parseInt(imageText);
            }
            catch(NumberFormatException ex){
                System.out.println("Exception Handled");
            }*/

            if(a1.equals(a2)){
                testcase.log(Status.PASS," Correct ala carte price of Blueberry Muffin Price" );
                System.out.println("***********Scenario23 PASS: Correct ala carte price of Blueberry Muffin Price ***********");
            }else{
                testcase.log(Status.FAIL, "Incorrect ala carte price of Blueberry Muffin Price");
                System.out.println("***********Scenario23 FAIL: Incorrect ala carte price of Blueberry Muffin Price ***********");
                
            }
            s.wait(VoidItem, 300);
            s.click(VoidItem.similar((float)0.5));
        }
		@Test(priority = 24)
        public void siKuliTestCase024() throws FindFailed, IOException, TesseractException, InterruptedException 
        {     
           testcase=extent.createTest("TC_024:Verify ChocolateCookies Price");

           RegressionTestCase b = new RegressionTestCase();

           Thread.sleep(2000);
           
           s.wait(Sides,300);
           s.click(Sides.similar((float)0.5));
           s.wait(Cookies,300);
           s.click(Cookies.similar((float)0.5)); 
           s.wait(ChocolateCookies,300);
           s.click(ChocolateCookies.similar((float)0.5)); 
           testcase.log(Status.PASS, "User able to Click the Chocolate Cookies Button");
           s.wait(EatIn, 300);  
           s.click(EatIn.similar((float)0.8));
           testcase.log(Status.PASS, "User able to Click the Eatin Button");
            File Source = new File("ChocolateCookiesPrice.png");
            String Path = System.getProperty("user.dir")+"/Images/ChocolateCookiesPrice.png";
            FileHandler.copy(Source, new File(Path));
            ITesseract image = new Tesseract();
            image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
            String imageText=image.doOCR(new File(Path));
            System.out.println(imageText);
            System.out.println(b.readChocolateCookiesPrice());
            String a1=null;
            String a2=null;

            String replaceAll = imageText.replaceAll("\\s","");
             a1 = replaceAll;
             a2 = b.readChocolateCookiesPrice();
             System.out.println(a1);
             System.out.println(a2);
           /* try{
                parseInt = Integer.parseInt(imageText);
                 a1 = parseInt;
                 a2 = b.readMdOriginalBlendPrice();

              } 
            catch(NumberFormatException ex)
            { 
                System.out.println(parseInt);
                System.out.println("Exception Handled"); 
              }
            System.out.println(a1);
            System.out.println(a2);

           /* try{
                parseInt = Integer.parseInt(imageText);
            }
            catch(NumberFormatException ex){
                System.out.println("Exception Handled");
            }*/

            if(a1.equals(a2)){
                testcase.log(Status.PASS," Correct ala carte price of ChocolateCookies Price" );
                System.out.println("***********Scenario23 PASS: Correct ala carte price of ChocolateCookies Price ***********");
            }else{
                testcase.log(Status.FAIL, "Incorrect ala carte price of ChocolateCookies Price");
                System.out.println("***********Scenario23 FAIL: Incorrect ala carte price of ChocolateCookiesPrice ***********");
                
            }
            s.wait(VoidItem, 300);
            s.click(VoidItem.similar((float)0.5));
        }
		
		
	  	
	  	
	  	
	  	
		      
	  	@AfterSuite
		  public void appClose() throws FindFailed, InterruptedException
		  {
			    
			    Thread.sleep(3000);
			    s.wait(Functions, 300); 
			    s.click(Functions.similar((float)0.5));
			    s.wait(MinPOS, 300);  
			    s.click(MinPOS.similar((float)0.8));
			    s.wait(IQTouchTaskbar, 300);
			    s.rightClick(IQTouchTaskbar.similar((float)0.5));
			    s.wait(CloseWindow, 300);
			    s.click(CloseWindow.similar((float)0.5));
			    s.wait(RollbackLightTaskbar, 300);
			    s.rightClick(RollbackLightTaskbar.similar((float)0.5));
			    s.wait(CloseWindow, 300);
			    s.click(CloseWindow.similar((float)0.5));
			    s.wait(BomgarTask, 300);
			    s.rightClick(BomgarTask.similar((float)0.5));
			    s.wait(CloseWindow, 300);
			    s.click(CloseWindow.similar((float)0.5));
			    s.wait(YesRemote, 300);
			    s.click(YesRemote.similar((float)0.5));
			    s.wait(CloseTerminal, 300);  
			    s.click(CloseTerminal.similar((float)0.6));
			    s.wait(EndSession, 300);
			    s.click(EndSession.similar((float)0.8)); 
			    s.wait(File, 300); 
			    s.click(File.similar((float)0.5)); 
		        s.click(QuitBomgar.similar((float)0.9)); 
			    s.click(YesBomgar.similar((float)0.9)); 
			    extent.flush();
				 
				 
				 
		  }

}
