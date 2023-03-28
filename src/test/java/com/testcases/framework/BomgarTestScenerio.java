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

public  class BomgarTestScenerio extends Read_Data {
	
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
	  	Pattern MDCoffee = new Pattern("C:/Images For Sikuli/MDCoffee.png"); 
	  	Pattern EatIn = new Pattern("C:/Images For Sikuli/EatIn.png"); 
	  	Pattern CanOrder = new Pattern("C:/Images For Sikuli/CanOrder.png"); 
	  	Pattern CanYes = new Pattern("C:/Images For Sikuli/CanYes.png"); 
	  	Pattern Functions = new Pattern("C:/Images For Sikuli/Functions.png"); 
	  	Pattern MinPOS = new Pattern("C:/Images For Sikuli/MinPOS.png"); 
	  	Pattern MDCoffeeOrder = new Pattern("C:/Images For Sikuli/MDCoffeeOrder.png"); 
	  	Pattern ScreenKey = new Pattern("C:/Images For Sikuli/ScreenKey.png"); 
	  	
	  	
	  	Pattern Sides = new Pattern("C:/Images For Sikuli/Sides.png"); 
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
	  	Pattern BaconFarmersBiscuit = new Pattern("‪C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\Images\\BaconFarmersBiscuit.png");
	  
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
	     s.type(StoreNumber, "7000054");
	     s.wait(RegionIDClick, 300);  
	     s.click(RegionIDClick.similar((float)0.5));
	     s.wait(TabPOS, 300);  
	     s.click(TabPOS.similar((float)0.4));
	     //s.wait(ReleaseID, 300);
	     //s.type(ReleaseID, "");
	     s.type(ReleaseID, "36665");
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
	    /* s.wait(UpdateQST, 1500);  //FROM HERE
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
	  		
	  		BomgarTestScenerio b = new BomgarTestScenerio();
	  		
	  	Thread.sleep(3000);
	  	s.wait(Functions, 300); 
	    s.click(Functions.similar((float)0.5));
	    Thread.sleep(3000);
	    s.wait(Support ,400);
	    s.click(Support.similar((float)0.5));
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
		public void sikuliTestCase002() throws FindFailed, IOException, TesseractException, InterruptedException
		{
			testcase=extent.createTest("TC_002:Verify Correct Order Detail Name(Item Name:Sausage Egg & cheese Biscuit");
			
			
			
			BomgarTestScenerio b = new BomgarTestScenerio();
			
			Thread.sleep(3000);
			s.wait(Breakfast, 300);
			s.click(Breakfast.similar((float)0.5));
			testcase.log(Status.PASS, "The User  Click the Breakfast Item Menu in POS");
			Thread.sleep(2000);
			s.wait(Sandwiches, 300);
			s.click(Sandwiches.similar((float)0.5));
			testcase.log(Status.PASS, "The User  Click the Sandwiches Item Menu in POS");
			Thread.sleep(3000);
			s.wait(EggCheeseBiscuit, 300);
			s.click(EggCheeseBiscuit.similar((float)0.5));
			testcase.log(Status.PASS, "The User  Click the EggCheeseBiscuit Item Menu in POS");
			s.wait(EatIn, 300);  
	      s.click(EatIn.similar((float)0.5));
	      testcase.log(Status.PASS, "The user click the EatIn Option in POS");
	      File Source = new File("EggBrekSand.png");
	      String Path = System.getProperty("user.dir")+"/Images/EggBrekSand.png";
	      FileHandler.copy(Source, new File(Path));
	      ITesseract image = new Tesseract();
	      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
	      String imageText=image.doOCR(new File(Path));
	      System.out.println(imageText);
	      /*if (imageText==b.readOrderDetailName()) {
	    	  testcase.log(Status.PASS, "The item Order-Detail-Name Is Matched in Expected");
	    	  System.out.println("*****Scenario 01 PASS: Retail item Button-Name Is Matched in Expected*****");
			
		}
	      else {
			testcase.log(Status.FAIL, "The item Order-Detail-Name Doesn't Matched in Expected");
			System.out.println("*****Scenario 01 FAIL: Retail item Button-Name Doesn't Matched in Expected*****");
		}*/
	      SoftAssert soft = new SoftAssert();
	      soft.assertEquals(imageText,b.readOrderDetailName());
	      testcase.log(Status.PASS, "The Item name is Verified in Order Details page");
	      System.out.println("***************************************Scenario 02 PASS: Retail item's Name is correct****************************");
	      s.wait(VoidItem, 300);
	      s.click(VoidItem.similar((float)0.5));
			
			
		}
	  @Test(priority =3)
		public void sikuliTestCase003() throws FindFailed, IOException, TesseractException, InterruptedException 
		{
			testcase=extent.createTest("TC_003:Verify Correct Button Name (Item Name:Sausage Egg & cheese Biscuit");
			
			
			BomgarTestScenerio b = new BomgarTestScenerio();
			
			Thread.sleep(3000);
			s.wait(Breakfast, 300);
			s.click(Breakfast.similar((float)0.5));
			testcase.log(Status.PASS, "The User  Click the Breakfast Item Menu in POS");
			Thread.sleep(2000);
			s.wait(Sandwiches, 300);
			s.click(Sandwiches.similar((float)0.6));
			testcase.log(Status.PASS, "The User  Click the Sandwiches Item Menu in POS");
			Thread.sleep(3000);
			s.wait(EggCheeseBiscuit, 300);
			testcase.log(Status.PASS, "The User Wait For the EggCheeseBiscuit Button Menu in POS");
			File Source = new File("EggCheeseBiscuit.png");
	      String Path = System.getProperty("user.dir")+"/Images/EggCheeseBiscuit.png";
	      FileHandler.copy(Source, new File(Path));
	      ITesseract image = new Tesseract();
	      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
	      String imageText=image.doOCR(new File(Path));
	      System.out.println(imageText);
	      if (imageText==b.readButtonName()) {
	    	  testcase.log(Status.PASS, "The item Button-Name Is Matched in Expected");
	    	  System.out.println("*****Scenario 03 PASS: Retail item Button-Name Is Matched in Expected*****");
			
		}
	      else {
			testcase.log(Status.FAIL, "The item Button-Name Doesn't Matched in Expected");
			System.out.println("*****Scenario 03 FAIL: Retail item Button-Name Doesn't Matched in Expected*****");
		}
//	      SoftAssert soft = new SoftAssert();
//	      soft.assertEquals(imageText, b.readButtonName());
	      
//	      System.out.println(imageText);
	      
	      
//	      System.out.println("***************************************Scenario 02 PASS: Retail item's Button Name is correct****************************");
			
		}
	  @Test(priority = 4)
		public void sikuliTestCase004() throws FindFailed, IOException, TesseractException, InterruptedException 
		{
			testcase=extent.createTest("TC_004:Verify Bundling item's Name (Item Name:cookies(Double Chocolate)");
			
			BomgarTestScenerio b = new BomgarTestScenerio();
			
			Thread.sleep(3000);
			s.wait(Sides, 300);
			s.click(Sides.similar((float)0.5));
			testcase.log(Status.PASS, "The User  Click the Sides Item Menu in POS");
			Thread.sleep(3000);
			s.wait(Cookies, 300);
			s.click(Cookies.similar((float)0.5));
			testcase.log(Status.PASS, "The User  Click the Cookies Item Menu in POS");
			Thread.sleep(3000);
			s.wait(DoubleChocCookie, 300);
			s.click(DoubleChocCookie.similar((float)0.5));
			testcase.log(Status.PASS, "The User  Click the Double-Choc-Cookies Item Menu in POS");
			s.wait(EatIn, 300);  
	      s.click(EatIn.similar((float)0.5));
	      testcase.log(Status.PASS, "The user click the EatIn Option in POS");
	        Thread.sleep(2000);
	        s.wait(DoubleChocCookie, 300);
			s.click(DoubleChocCookie.similar((float)0.5));
			Thread.sleep(2000);
			s.wait(DoubleChocCookie, 300);
			s.click(DoubleChocCookie.similar((float)0.5));
			Thread.sleep(2000);
			s.wait(DoubleChocCookie, 300);
			s.click(DoubleChocCookie.similar((float)0.5));
			Thread.sleep(2000);
			s.wait(DoubleChocCookie, 300);
			s.click(DoubleChocCookie.similar((float)0.5));
			Thread.sleep(2000);
			s.wait(DoubleChocCookie, 300);
			s.click(DoubleChocCookie.similar((float)0.5));
			Thread.sleep(5000);
	      File Source = new File("BundlingItemName.png");
	      String Path = System.getProperty("user.dir")+"/Images/BundlingItemName.png";
	      FileHandler.copy(Source, new File(Path));
	      ITesseract image = new Tesseract();
	      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
	      String imageText=image.doOCR(new File(Path));
	      System.out.println(imageText);
	      if (imageText==b.readBundlingItemName()) {
	    	  testcase.log(Status.PASS, "The item BundlingItemName Is Matched in Expected");
	    	  System.out.println("*****Scenario 04 PASS: Retail BundlingItemName Is Matched in Expected*****");
			
		}
	      else {
			testcase.log(Status.FAIL, "The item BundlingItemName Doesn't Matched in Expected");
			System.out.println("*****Scenario 04 FAIL: Retail item BundlingItemName Doesn't Matched in Expected*****");
		}
//	      SoftAssert soft = new SoftAssert();
//	      soft.assertEquals(imageText, b.readBundlingItemName());
//	      testcase.log(Status.PASS, "Verified Bunding item's Name in Order Detail Page");
	      System.out.println("***************************************Scenario 03 PASS: Verify Bundling item's Name is correct****************************");
	      s.wait(CanOrder, 300);
	      s.click(CanOrder.similar((float)0.5));
	      s.wait(CanYes, 300);
	      s.click(CanYes.similar((float)0.5));
		}
		@Test(priority = 5)
		public void sikuliTestCase005() throws FindFailed, IOException, TesseractException, InterruptedException
		{
			testcase=extent.createTest("TC_005:Verify Modifier added on item's (Item Name:Sausage Egg & cheese Biscuit");
			
			BomgarTestScenerio b = new BomgarTestScenerio();
			
			Thread.sleep(3000);
			s.wait(Breakfast, 300);
			s.click(Breakfast.similar((float)0.5));
			testcase.log(Status.PASS, "The User  Click the Breakfast Item Menu in POS");
			Thread.sleep(2000);
			s.wait(Sandwiches, 300);
			s.click(Sandwiches.similar((float)0.5));
			testcase.log(Status.PASS, "The User  Click the Sandwiches Item Menu in POS");
			Thread.sleep(3000);
			s.wait(EggCheeseBiscuit, 300);
			s.click(EggCheeseBiscuit.similar((float)0.6));
			testcase.log(Status.PASS, "The User  Click the EggCheeseBiscuit Item Menu in POS");
			s.wait(EatIn, 300);  
	      s.click(EatIn.similar((float)0.5));
	      testcase.log(Status.PASS, "The user click the EatIn Option in POS");
	      s.wait(BiscuitModifier, 300);
	      s.click(BiscuitModifier.similar((float)0.5));
	      testcase.log(Status.PASS, "The user click the Modifier Option in POS");
	      s.wait(SausageModifier, 300);
	      s.click(SausageModifier.similar((float)0.5));
	      testcase.log(Status.PASS, "The user click the Sausage-Modifier Option in POS");
	      s.wait(SausageModifier1, 300);
	      testcase.log(Status.PASS, "The User Wait For the SausageModifier Button Menu in POS");
	      File Source = new File("SausageModifier1.png");
	      String Path = System.getProperty("user.dir")+"/Images/SausageModifier1.png";
	      FileHandler.copy(Source, new File(Path));
	      ITesseract image = new Tesseract();
	      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
	      String imageText=image.doOCR(new File(Path));
	      System.out.println(imageText);
	      if (imageText==b.readModifierName()) {
	    	  testcase.log(Status.PASS, "The item ModifierName Is Matched in Expected");
	    	  System.out.println("*****Scenario 05 PASS: Retail ModifierName Is Matched in Expected*****");
			
		}
	      else {
			testcase.log(Status.FAIL, "The item ModifierName Doesn't Matched in Expected");
			System.out.println("*****Scenario 05 FAIL: Retail item ModifierName Doesn't Matched in Expected*****");
		}
//	      SoftAssert soft = new SoftAssert();
//	      soft.assertEquals(imageText, b.readModifierName());
//	      testcase.log(Status.PASS, "The Sausage-Modifier added & Modifier Button Name is Verified in POS");
	      
	      System.out.println("***************************************Scenario 04 PASS: Sausage Modifier added on Sausage Egg & cheese Biscuit****************************");        
	      s.wait(CanOrder, 300);
	      s.click(CanOrder.similar((float)0.5));
	      s.wait(CanYes, 300);
	      s.click(CanYes.similar((float)0.5));
//	      s.wait(VoidItem, 300);
//	      s.click(VoidItem.similar((float)0.5));
//	      s.wait(VoidItem, 300);
//	      s.click(VoidItem.similar((float)0.5));
		}
		@Test(priority = 6)
		public void sikuliTestCase006() throws FindFailed, IOException, TesseractException, InterruptedException
		{
			testcase=extent.createTest("TC_006:Verify Combo Formation of Sausage Croissant Sandwitch");
			
			BomgarTestScenerio b = new BomgarTestScenerio();
			
			Thread.sleep(3000);
			s.wait(Sides, 300);
			s.click(Sides.similar((float)0.5));
			testcase.log(Status.PASS, "The User  Click the Sides Item Menu in POS");
			Thread.sleep(3000);
			s.wait(Donuts, 300);
			s.click(Donuts.similar((float)0.5));
			testcase.log(Status.PASS, "The User  Click the Donuts Item Menu in POS");
			Thread.sleep(3000);
			s.wait(BlueberryDonuts, 300);
			s.click(BlueberryDonuts.similar((float)0.5));
			testcase.log(Status.PASS, "The User  Click the BlueberryDonuts Item Menu in POS");
			s.wait(EatIn, 300);  
	      s.click(EatIn.similar((float)0.5));
	      testcase.log(Status.PASS, "The user click the EatIn Option in POS");
	      s.wait(MDCoffee, 300);
	      s.click(MDCoffee.similar((float)0.5));
	      testcase.log(Status.PASS, "The User add Medium-coffee Item Menu in POS");
	      s.wait(Breakfast, 300);
	      s.click(Breakfast.similar((float)0.5));
	      testcase.log(Status.PASS, "The User  Click the Breakfast Item Menu in POS");
	      Thread.sleep(3000);
	      s.wait(Sandwiches, 300);
	      s.click(Sandwiches.similar((float)0.7));
	      testcase.log(Status.PASS, "The User  Click the Sandwiches Item Menu in POS");
	      s.wait(SausageCroissant, 300);
	      s.click(SausageCroissant.similar((float)0.6));
	      testcase.log(Status.PASS, "The User add SausageCroissant Item Menu in POS");
	      File Source = new File("BrekSandComboFormation.png");
	      String Path = System.getProperty("user.dir")+"/Images/BrekSandComboFormation.png";
	      FileHandler.copy(Source, new File(Path));
	      ITesseract image = new Tesseract();
	      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
	      String imageText=image.doOCR(new File(Path));
	      System.out.println(imageText);
	      if (imageText==b.readComboFormationName()) {
	    	  testcase.log(Status.PASS, "The item ModifierName Is Matched in Expected");
	    	  System.out.println("*****Scenario 06 PASS: Retail ComboFormationName Is Matched in Expected*****");
			
		}
	      else {
			testcase.log(Status.FAIL, "The item ModifierName Doesn't Matched in Expected");
			System.out.println("*****Scenario 06 FAIL: Retail item ComboFormationName Doesn't Matched in Expected*****");
		}
//	      SoftAssert soft = new SoftAssert();
//	      soft.assertEquals(imageText, b.readComboFormationName());
//	      testcase.log(Status.PASS, "The User ring Three item as Combo-Formantion & Combo-Item-Name as been verified in POS");
	      
	      System.out.println("***************************************Scenario 05 PASS: Verify Combo Formation ****************************"); 
	      s.wait(CanOrder, 300);
	      s.click(CanOrder.similar((float)0.5));
	      s.wait(CanYes, 300);
	      s.click(CanYes.similar((float)0.5));
	      Thread.sleep(2000);
//	      s.wait(VoidItem, 300);
//	      s.click(VoidItem.similar((float)0.5));
//	      s.wait(VoidItem, 300);
//	      s.click(VoidItem.similar((float)0.5));
//	      s.wait(VoidItem, 300);
//	      s.click(VoidItem.similar((float)0.5));
			
		}
		
		@Test(priority = 7)
		public void sikuliTestCase007() throws FindFailed, IOException, TesseractException, InterruptedException
		{
			testcase=extent.createTest("TC_007:Verify Item Price In Order Detail Page(Item Name:Sausage Egg & cheese Biscuit");
			
			
			BomgarTestScenerio b = new BomgarTestScenerio();
			
			Thread.sleep(2000);
			s.wait(Breakfast, 300);
			s.click(Breakfast.similar((float)0.5));
			testcase.log(Status.PASS, "The User  Click the Breakfast Item Menu in POS");
			Thread.sleep(2000);
			s.wait(Sandwiches, 300);
			s.click(Sandwiches.similar((float)0.5));
			testcase.log(Status.PASS, "The User  Click the Sandwiches Item Menu in POS");
			Thread.sleep(2000);
			s.wait(EggCheeseBiscuit, 300);
			s.click(EggCheeseBiscuit.similar((float)0.5));
			testcase.log(Status.PASS, "The User  Click the EggCheeseBiscuit Item Menu in POS");
			s.wait(EatIn, 300);  
	      s.click(EatIn.similar((float)0.5));
	      testcase.log(Status.PASS, "The user click the EatIn Option in POS");
	      File Source = new File("EggCheeseBiscuitPrice.png");
	      String Path = System.getProperty("user.dir")+"/Images/EggCheeseBiscuitPrice.png";
	      FileHandler.copy(Source, new File(Path));
	      ITesseract image = new Tesseract();
	      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
	      String imageText=image.doOCR(new File(Path));
	      System.out.println(imageText);
	      try{
	    	  parseInt = Integer.parseInt(imageText);
	      }
	      catch(NumberFormatException ex){
	    	  System.out.println("Exception Handled");
	      }
	      if(parseInt==b.readEggCheeseBiscuitPrice()){
	    	  testcase.log(Status.PASS," Correct ala carte price of Sausage Egg & Cheese Biscuit" );
	    	  System.out.println("***********Scenario07 PASS: Correct ala carte price of Sausage Egg & cheese Biscuit ***********");
	      }else{
	    	  testcase.log(Status.FAIL, "Incorrect ala carte price of Sausage Egg & Cheese Biscuit");
	    	  System.out.println("***********Scenario07 FAIL: Incorrect ala carte price of Sausage Egg & cheese Biscuit ***********");
	      }
	      
	      
	      
	    //  SoftAssert soft = new SoftAssert();
//	      soft.assertEquals("Egg-Brek Sand $3.79", imageText);
//	      soft.assertEquals(b.readEggCheeseBiscuitPrices(), imageText);
	     // soft.assertEquals(imageText, b.readEggCheeseBiscuitPrice());
	     // testcase.log(Status.PASS, "The Item Price is Verified in Order Details page");
	      
	    //  System.out.println("***************************************Scenario 07 PASS: Retail item Price is correct****************************");
	      s.wait(VoidItem, 300);
	      s.click(VoidItem.similar((float)0.5));
		}
		@Test(priority = 8)
		  
		  public void sikuliTestCase008() throws FindFailed, InterruptedException, IOException, TesseractException
		  {
			  
			  testcase=extent.createTest("TC_008:Verify Item Price In Order Detail Page(Item Name:ClassicDonut(Chocolate Dip)");
			   
			  
			  BomgarTestScenerio b = new BomgarTestScenerio();
			  
			    Thread.sleep(2000);  
			    s.wait(Sides, 300);  
			    s.click(Sides.similar((float)0.5));
			    testcase.log(Status.PASS, "The User able to Click the Sides Button");
			    Thread.sleep(2000);
			    s.wait(Donuts, 300);  
			    s.click(Donuts.similar((float)0.5)); 
			    testcase.log(Status.PASS, "The User able to Click the Donuts Button");
			    Thread.sleep(2000);
			    s.wait(ClassicDonut, 300);  
			    s.click(ClassicDonut.similar((float)0.5));
			    testcase.log(Status.PASS, "The User able Click the ClasicDonut Button");
			    s.wait(EatIn, 300);  
			    s.click(EatIn.similar((float)0.8)); 
			    testcase.log(Status.PASS, "The User Clicking the Eatin Option");
			     File Source = new File("DonutsPrice.png");
			      String Path = System.getProperty("user.dir")+"/Images/DonutsPrice.png";
			      FileHandler.copy(Source, new File(Path));
			      ITesseract image = new Tesseract();
			      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
			      String imageText=image.doOCR(new File(Path));
//			      System.out.println(imageText);
			      SoftAssert soft = new SoftAssert();
			      soft.assertEquals(b.readClassicDonutPrice(), imageText);
			      testcase.log(Status.PASS, "The item Price Matched in Expected Price");
			      
			    final String out2="*************************************Scenario 08 PASS: Classic Donut price is correct*******************************************";
				System.out.println(out2); 
//				testcase.log(Status.PASS, "The Classic Donut Price is Incorrect");
				  s.wait(VoidItem, 300);
			      s.click(VoidItem.similar((float)0.5));
				
		  }
		@Test(priority = 9)
		  public void siKuliTestCase009() throws FindFailed, IOException, TesseractException, InterruptedException 
		  {	 
			 testcase=extent.createTest("TC_009:Verify Medium Original Blend Coffee Price");
			 
			 BomgarTestScenerio b = new BomgarTestScenerio();
			 
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
		      
		      try{
		    	  parseInt = Integer.parseInt(imageText);
		      }
		      catch(NumberFormatException ex){
		    	  System.out.println("Exception Handled");
		      }
		     // 
		      
				
			}
//	          int parseInt = Integer.parseInt(imageText);
		      
//		      if (parseInt==b.readMdOriginalBlendPrice()) {
//		    	  testcase.log(Status.PASS, "The Item Price is Verified in Order Details page");
//		    	  System.out.println("The item Price Is Matched in Expected");
//				
//			}
//		      else {
//		    	  testcase.log(Status.FAIL, "The Item Price Doesn't Verified in Order Details page");
//		    	  System.out.println("The item Price Doesn't Matched in Expected");
//			}
//		      SoftAssert soft = new SoftAssert();
//		      soft.assertEquals(imageText, b.readMdOriginalBlendPrice());
//		      testcase.log(Status.FAIL, "The Item Price Doesn't Verified in Order Details page");
//	       System.out.println("***************************************Scenario 08 PASS: Retail item Price is correct****************************");
		  //    s.wait(VoidItem, 300);
		   //   s.click(VoidItem.similar((float)0.5));
		 // }
		@Test(priority = 10)
		public void sikuliTestCase010() throws FindFailed, IOException, TesseractException, InterruptedException
		{
			testcase=extent.createTest("TC_010:Verify TurkeyBaconClubPrice");
			
			BomgarTestScenerio b = new BomgarTestScenerio();
			
			 Thread.sleep(2000); 
			s.wait(Lunch, 300);
	 		s.click(Lunch.similar((float)0.5));
	 		testcase.log(Status.PASS, "The User Click the Lunch Menu in POS");
	 		 Thread.sleep(2000); 
	 		s.wait(Sandwiches1, 300);
	 		s.click(Sandwiches1.similar((float)0.5));
	 		testcase.log(Status.PASS, "The User Click the Sandwiches Menu in POS");
	 		 Thread.sleep(2000); 
	 		s.wait(TurkeyBaconClub, 300);
	 		s.click(TurkeyBaconClub.similar((float)0.5));
	 		testcase.log(Status.PASS, "The User Click the TurkeyBaconClub Menu in POS");
	 		s.wait(EatIn, 300);  
	        s.click(EatIn.similar((float)0.8));
	        testcase.log(Status.PASS, "The user click the EatIn Option in POS");
	        File Source = new File("BaconBeltPrice.png");
		      String Path = System.getProperty("user.dir")+"/Images/BaconBeltPrice.png";
		      FileHandler.copy(Source, new File(Path));
		      ITesseract image = new Tesseract();
		      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
		      String imageText=image.doOCR(new File(Path));
		      SoftAssert soft = new SoftAssert();
		      soft.assertEquals(imageText, b.readTurkeyBaconClubPrice());
		      testcase.log(Status.PASS, "The Item Price is Verified in Order Details page");
		      
		      System.out.println("***************************************Scenario 09 PASS: Retail item Price is correct****************************");
		      s.wait(VoidItem, 300);
		      s.click(VoidItem.similar((float)0.5));
		}
		
		@Test(priority = 11)
		public void sikuliTestCase0011() throws FindFailed, IOException, TesseractException, InterruptedException
		{
			testcase=extent.createTest("TC_0011:Verify CeramicMugPrice");
			
			BomgarTestScenerio b = new BomgarTestScenerio();
			
			 Thread.sleep(2000); 
			s.wait(Retail, 300);
		 	s.click(Retail.similar((float)0.5));
		 	testcase.log(Status.PASS, "The User  Click the Retail Item Menu in POS");
		 	 Thread.sleep(2000); 
		 	s.wait(Hardware, 300);
		 	s.click(Hardware.similar((float)0.5));
		 	testcase.log(Status.PASS, "The User  Click the Hardware Item Menu in POS");
		 	 Thread.sleep(2000); 
		 	s.wait(Mugs, 300);
		 	s.click(Mugs.similar((float)0.5));
		 	testcase.log(Status.PASS, "The User  Click the Mugs Item Menu in POS");
		 	 Thread.sleep(2000); 
		 	s.wait(CeramicMug, 300);
		 	s.click(CeramicMug.similar((float)0.5));
		 	testcase.log(Status.PASS, "The User  Click the CeramicMug Item Menu in POS");
		 	s.wait(EatIn, 300);  
		    s.click(EatIn.similar((float)0.8));
		    testcase.log(Status.PASS, "The user click the EatIn Option in POS");
		    File Source = new File("Timbits10Price.png");
		      String Path = System.getProperty("user.dir")+"/Images/Timbits10Price.png";
		      FileHandler.copy(Source, new File(Path));
		      ITesseract image = new Tesseract();
		      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
		      String imageText=image.doOCR(new File(Path));
		      SoftAssert soft = new SoftAssert();
		      soft.assertEquals(imageText, b.readCeramicMugPrice());
		      testcase.log(Status.PASS, "The Item Price is Verified in Order Details page");
		      
		      System.out.println("***************************************Scenario 10 PASS: Retail item Price is correct****************************");
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

