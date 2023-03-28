package com.testcases.framework;

import java.io.IOException;
import java.io.File;

import org.openqa.selenium.io.FileHandler;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class NewTest {
	
	Screen s = new Screen();
	
	ExtentReports extent;
	ExtentHtmlReporter html;
	ExtentTest testcase;
		
	String MDOriginalBlendPrice="1.92";//CORRECT PRICE
	String ClassicDonutPrice="1.60";//INCORRECT PRICE
    String MapleButterPrice="7.99";//CORRECT PRICE
    String IcedCoffeePrice="2.40";//CORRECT PRICE
    String SpecialityTeaPrice="1.92";//CORRECT PRICE
    String VanillaIcedLattePrice="4.84";//CORRECT PRICE
    String VanillaCreamColdBrewPrice="3.14";//CORRECT PRICE
    String BottleWaterPrice="2.25";//CORRECT PRICE
    String BaconFarmersBiscuitPrice="5.64";//CORRECT PRICE
    String BaconFarmersWrapPrice="5.64";//CORRECT PRICE
    String BaconBeltPrice="5.64";//CORRECT PRICE
    String TurkeyBaconClubPrice="7.67";//CORRECT PRICE
    String HamMeltPrice="7.67";//CORRECT PRICE
    String CrispyCilantroWrapPrice="8.80";//CORRECT PRICE
    String  EggCheeseBiscuitPrice="3.87";//CORRECT PRICE
    String ChickenNoodlePrice="4.84";//CORRECT PRICE
    String GrainPreparedBagelPrice="1.88";//CORRECT PRICE
    String CeramicMugPrice="10.16";//CORRECT PRICE
    String Timbits10Price="2.99";//CORRECT PRICE
    String HashbrownPrice="2.09";//CORRECT PRICE
    
    
    Pattern BomgarApp = new Pattern("C:/Images For Sikuli/BomgarDesktop.png");
  	Pattern BomgarLogin = new Pattern("C:/Images For Sikuli/BomgarLogin.png");   
  	Pattern QSTT2Login = new Pattern("C:/Images For Sikuli/QSTT2Login.png");  
  	Pattern ScreenSharing = new Pattern("C:/Images For Sikuli/ScreenSharing.png");  
  	Pattern RollbackLightTaskbar = new Pattern("C:\\Images For Sikuli\\RollbackLightTaskbar.png");  
  	Pattern IQTouchTaskbar = new Pattern("C:\\Images For Sikuli\\IQTouchTaskbar.png");  
  	Pattern RollbackLightDesktop = new Pattern("C:/Images For Sikuli/RollbackLightDesktop.png"); 
  	Pattern RollbackLightDesktop1 = new Pattern("C:/Images For Sikuli/RollbackLightDesktop1.png");  
  	Pattern CloseWindow = new Pattern("C:\\Images For Sikuli\\CloseWindow.png");  
  	Pattern StoreNumber = new Pattern("C:/Images For Sikuli/StoreNumber.png");  
  	Pattern ReleaseID = new Pattern("C:/Images For Sikuli/ReleaseID.png");  
  	Pattern RollbackApply = new Pattern("C:/Images For Sikuli/RollbackApply.png");  
  	Pattern TabPOS = new Pattern("C:/Images For Sikuli/TabPOS.png");  
  	Pattern OkRollbackQST = new Pattern("C:/Images For Sikuli/OkRollbackQST.png");  
  	Pattern CloseTerminal = new Pattern("C:/Images For Sikuli/CloseTerminal.png");  
  	Pattern EndSession = new Pattern("C:/Images For Sikuli/EndSession.png");  
  	//Pattern TasksRunning = new Pattern("C:/Images For Sikuli/TasksRunning.png");  
  	Pattern BomgarTask = new Pattern("C:\\Images For Sikuli\\BomgarTask.png");  
  	Pattern QuitBomgar = new Pattern("C:/Images For Sikuli/QuitBomgar.png");  
  	//Pattern LogoutBomgar = new Pattern("C:/Images For Sikuli/LogoutBomgar.png");  
  	Pattern YesBomgar = new Pattern("C:/Images For Sikuli/YesBomgar.png");
  	Pattern YesRemote = new Pattern("C:\\Images For Sikuli\\YesRemote.png");
  	Pattern File = new Pattern("C:/Images For Sikuli/File.png"); 
  	Pattern UpdateQST = new Pattern("C:/Images For Sikuli/UpdateQST.png"); 
  	Pattern ViewMgrUpdate = new Pattern("C:/Images For Sikuli/ViewMgrUpdate.png"); 
  	Pattern ApplyUpdates = new Pattern("C:/Images For Sikuli/ApplyUpdates.png"); 
  	Pattern OkUpdates = new Pattern("C:/Images For Sikuli/OkUpdates.png"); 
  	Pattern OkPrinter = new Pattern("C:/Images For Sikuli/OkPrinter.png"); 
  	Pattern RegionIDClick = new Pattern("C:/Images For Sikuli/RegionIDClick.png"); 
  	Pattern OkCred = new Pattern("C:/Images For Sikuli/CredQST.png"); 
  	Pattern CredQSTold = new Pattern("C:/Images For Sikuli/CredQSTold.png");
  	Pattern Tim = new Pattern("C:/Images For Sikuli/Tim.png");
  	Pattern VoidItem = new Pattern("C:/Images For Sikuli/VoidItem.png");
  	Pattern MDCoffee = new Pattern("C:/Images For Sikuli/MDCoffee.png"); 
  	Pattern EatIn = new Pattern("C:/Images For Sikuli/EatIn.png"); 
  	Pattern CanOrder = new Pattern("C:/Images For Sikuli/CanOrder.png"); 
  	Pattern CanYes = new Pattern("C:/Images For Sikuli/CanYes.png"); 
  	Pattern Functions = new Pattern("C:/Images For Sikuli/Functions.png"); 
  	Pattern MinPOS = new Pattern("C:/Images For Sikuli/MinPOS.png"); 
  	Pattern MDCoffeeOrder = new Pattern("C:/Images For Sikuli/MDCoffeeOrder.png"); 
  	Pattern ScreenKey = new Pattern("C:/Images For Sikuli/ScreenKey.png"); 
  	Pattern Passwrd = new Pattern("C:/Images For Sikuli/Passwrd.png");
  	
  	Pattern Sides = new Pattern("C:/Images For Sikuli/Sides.png"); 
  	Pattern Donuts = new Pattern("C:/Images For Sikuli/Donuts.png"); 
  	Pattern Cookies = new Pattern("C:/Images For Sikuli/Cookies.png");
  	Pattern CookiesDozen = new Pattern("C:/Images For Sikuli/CookiesDozen.png");
  	Pattern ClassicDonut = new Pattern("C:/Images For Sikuli/ClassicDonut.png"); 
  	Pattern BlueberryDonuts = new Pattern("C:/Images For Sikuli/BlueberryDonuts.png"); 
  	
  	//Pattern Breakfast = new Pattern("C:/Images For Sikuli/Breakfast.png"); 
  	//Pattern Sandwiches = new Pattern("C:/Images For Sikuli/Sandwiches.png"); 
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
  	
  	Pattern FlavIcedLatte = new Pattern("C:\\Images For Sikuli\\FlavIcedLatte.png");
  	Pattern VanillaIcedLatte = new Pattern("C:\\Images For Sikuli\\VanillaIcedLatte.png");
  	Pattern VanillaLatteLarge = new Pattern("C:\\Images For Sikuli\\VanillaLatteLarge.png");
  	
  	Pattern Promo = new Pattern("C:\\Images For Sikuli\\Promo.png");
  	Pattern ColdBrew = new Pattern("C:\\Images For Sikuli\\ColdBrew.png");
  	Pattern VanillaCreamColdBrew = new Pattern("C:\\Images For Sikuli\\VanillaCreamColdBrew.png");
  	Pattern VanillaCreamColdBrewSmall = new Pattern("C:\\Images For Sikuli\\VanillaCreamColdBrewSmall.png");
  	
  	Pattern ColdBeverages = new Pattern("C:\\Images For Sikuli\\ColdBeverages.png");
  	Pattern BottleWater = new Pattern("C:\\Images For Sikuli\\BottleWater.png");
  	
  	Pattern Breakfast = new Pattern("C:\\Images For Sikuli\\Breakfast.png");
  	Pattern FarmerSandwiches = new Pattern("C:\\Images For Sikuli\\FarmerSandwiches.png");
  	Pattern BaconFarmersBiscuit = new Pattern("C:\\Images For Sikuli\\BaconFarmersBiscuit.png");
  	Pattern BiscuitModifier = new Pattern("C:\\Images For Sikuli\\BiscuitModifier.png");
  	Pattern SausageModifier = new Pattern("C:\\Images For Sikuli\\SausageModifier.png");
  	Pattern SausageModifier1 = new Pattern("C:\\Images For Sikuli\\SausageModifier1.png");
  	Pattern SausageCroissant = new Pattern("C:\\Images For Sikuli\\SausageCroissant.png");
  	Pattern CookAsrtDozen  = new Pattern("C:\\Images For Sikuli\\CookAsrtDozen.png");
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
  	
  	Pattern Sandwiches = new Pattern("C:\\Images For Sikuli\\Sandwiches.png");
  	Pattern EggCheeseBiscuit = new Pattern("C:\\Images For Sikuli\\EggCheeseBiscuit.png");
  	Pattern EggBrekSand = new Pattern("C:\\Images For Sikuli\\EggBrekSand.png");
  	
  	Pattern HotBowls = new Pattern("C:\\Images For Sikuli\\HotBowls.png");
  	Pattern ChickenNoodle = new Pattern("C:\\Images For Sikuli\\ChickenNoodle.png");
  	
  	Pattern Bagels = new Pattern("C:\\Images For Sikuli\\Bagels.png");
  	Pattern GrainBagelPrePared  = new Pattern("C:\\Images For Sikuli\\GrainBagelPrePared.png");
  	Pattern Timbits  = new Pattern("C:\\Images For Sikuli\\Timbits.png");
  	Pattern Timbits10  = new Pattern("C:\\Images For Sikuli\\Timbits10.png");
  	Pattern OtherSides  = new Pattern("C:\\Images For Sikuli\\OtherSides.png");
  	Pattern Hashbrown  = new Pattern("C:\\Images For Sikuli\\Hashbrown.png");
  	Pattern PaymentAmount  = new Pattern("C:\\Images For Sikuli\\PaymentAmount.png");
  	Pattern Hardware  = new Pattern("C:\\Images For Sikuli\\Hardware.png");
  	Pattern Mugs  = new Pattern("C:\\Images For Sikuli\\Mugs.png");
  	Pattern CeramicMug  = new Pattern("C:\\Images For Sikuli\\CeramicMug.png");
  	Pattern BrekSandComboFormation = new Pattern("C:\\Images For Sikuli\\BrekSandComboFormation.png");
  	
  	@BeforeSuite
  	public void appLogin() throws FindFailed, InterruptedException
  	{
         
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
  	     s.wait(Tim, 300);
  	     s.click(Tim);
  	     s.wait(CredQSTold, 1200);  
  	     s.click(CredQSTold.similar((float)0.5)); 
  	     //s.wait(CredQST, 300);  
  	     //s.click(CredQST.similar((float)0.6)); 
  	     
  	     //s.type(CredQSTold,"78425");
  	     s.wait(Passwrd, 300);
  	     s.click(Passwrd);
  	     s.type(Passwrd, "78425");
  	     s.wait(OkCred,600);
  	     s.click(OkCred.similar((float)0.6));
  	     Thread.sleep(15000);
  	     s.wait(UpdateQST,30000);  //FROM HERE
  	     s.click(UpdateQST.similar((float)0.9)); 
  	     s.wait(ViewMgrUpdate, 300);  
  	     s.click(ViewMgrUpdate.similar((float)0.6)); 
  	     s.wait(ApplyUpdates, 300);  
  	     s.click(ApplyUpdates.similar((float)0.6)); 
  	     s.wait(OkUpdates, 300);  
  	     s.click(OkUpdates.similar((float)0.6));
  	     s.wait(Passwrd, 300);
	     s.click(Passwrd);
	     s.type(Passwrd, "78425");
	     s.wait(OkCred,600);
  	     s.click(OkCred.similar((float)0.6));
  	     //s.wait(OkPrinter, 300);  
  	     //s.click(OkPrinter.similar((float)0.6)); 
	     //s.wait(CredQSTold, 900);  
	     //s.click(CredQSTold.similar((float)0.9)); 
	     //s.type(CredQSTold,"78425");
	     //s.click(OkCred.similar((float)0.8));  	
  	}
  	
  @Test(priority = 1)
  public void siKuliTestCase001() throws FindFailed 
  {	 
	 testcase=extent.createTest("TC_001:Verify Medium Coffee Price");
	 
//  	 s.doubleClick(BomgarApp.similar((float)0.6));
//     s.wait(BomgarLogin, 300);   
//     s.click(BomgarLogin.similar((float)0.5));
//     s.wait(QSTT2Login, 300); 
//     s.click(QSTT2Login.similar((float)0.6));
//     s.wait(QSTT2Login, 300);           
//     s.doubleClick(QSTT2Login.similar((float)0.6));
//     s.wait(ScreenSharing, 300);   
//     s.doubleClick(ScreenSharing.similar((float)0.6));
     //s.click(RollbackLightDesktop1);
     //s.wait(RollbackLightTaskbar,300);
     //s.rightClick(RollbackLightTaskbar.similar((float)0.5));
     //s.wait(CloseWindow, 300);
     //s.click(CloseWindow.similar((float)0.6));
     //s.rightClick(IQTouchTaskbar.similar((float)0.5));
     //s.wait(CloseWindow, 300);
     //s.click(CloseWindow.similar((float)0.6));	
//     s.wait(RollbackLightDesktop1, 300);
//     s.doubleClick(RollbackLightDesktop1.similar((float)0.6));
//     s.wait(StoreNumber, 300);           
//     s.type(StoreNumber, "");
//     s.type(StoreNumber, "7000054");
//     s.wait(RegionIDClick, 300);  
//     s.click(RegionIDClick.similar((float)0.5));
//     s.wait(TabPOS, 300);  
//     s.click(TabPOS.similar((float)0.4));
     //s.wait(ReleaseID, 300);
     //s.type(ReleaseID, "");
//     s.type(ReleaseID, "36665");
//     s.wait(RollbackApply, 300);
//     s.click(RollbackApply.similar((float)0.6)); 
     //s.wait(OkRollbackQST, 300);  
     //s.click(OkRollbackQST.similar((float)0.6)); 
//     s.wait(OkRollbackQST, 300);  
//     s.click(OkRollbackQST.similar((float)0.6)); 
//     s.wait(CredQSTold, 300);  
//     s.click(CredQSTold.similar((float)0.5)); 
     //s.wait(CredQST, 300);  
     //s.click(CredQST.similar((float)0.6)); 
//     s.type(CredQSTold,"78425");
//     s.click(OkCred.similar((float)0.6));
     /*s.wait(UpdateQST, 350);  //FROM HERE
     s.click(UpdateQST.similar((float)0.9)); 
     s.wait(ViewMgrUpdate, 300);  
     s.click(ViewMgrUpdate.similar((float)0.6)); 
     s.wait(ApplyUpdates, 300);  
     s.click(ApplyUpdates.similar((float)0.6)); 
     s.wait(OkUpdates, 300);  
     s.click(OkUpdates.similar((float)0.6)); 
     //s.wait(OkPrinter, 300);  
     //s.click(OkPrinter.similar((float)0.6)); 
     s.wait(CredQSTold, 900);  
     s.click(CredQSTold.similar((float)0.9)); 
     s.type(CredQSTold,"78425");
     s.click(OkCred.similar((float)0.8));  //TO HERE */
     s.wait(MDCoffee, 300);  
     s.click(MDCoffee.similar((float)0.8)); 
     testcase.log(Status.PASS, "User able to Click the Medium Coffee Button");
     s.wait(EatIn, 300);  
     s.click(EatIn.similar((float)0.8));
     testcase.log(Status.PASS, "User able to Click the Eatin Button");
     s.wait(PayNow, 300); 
     s.click(PayNow.similar((float)0.8)); 
     testcase.log(Status.PASS, "User able to Click the PayNow Button");
     s.wait(NextPay, 300); 
     s.click(NextPay.similar((float)0.8)); 
     testcase.log(Status.PASS, "User able to Click the NextPay Button");
     s.wait(Functions, 300); 
     s.click(Functions.similar((float)0.8)); 
     testcase.log(Status.PASS, "User able to click the Function Button");
     s.wait(OrderHistory, 300); 
     s.click(OrderHistory.similar((float)0.8)); 
     testcase.log(Status.PASS,"User able to Click the OrderHistory Button");
     s.wait(InputBox, 500); 
     s.click(InputBox.similar((float)0.8));
     testcase.log(Status.PASS, "User able to Click the InputBox");
     s.type(InputBox,MDOriginalBlendPrice);
     testcase.log(Status.PASS, "User Type Medium Coffee Price");
     s.wait(OkSearch, 300); 
     s.click(OkSearch.similar((float)0.8));
     testcase.log(Status.PASS, "User able to Click the Ok Button");
     s.wait(GoSearch, 300); 
     s.click(GoSearch.similar((float)0.8));
     testcase.log(Status.PASS, "User able to Click Go Search Button");
     s.wait(SearchResult, 300); 
     s.doubleClick(SearchResult.similar((float)0.8));
     testcase.log(Status.PASS,"User able to Ckeck the Souce Price");
     
     s.doubleClick(SearchResult1);  
     testcase.log(Status.PASS, "User able to Check the Target Price");
 	 final String out1=("*******************Sceanrio 1 PASS: MD Original Blend price is correct************************");
 	 System.out.println(out1); 
 	 
 	s.wait(Exit, 300); 
    s.click(Exit.similar((float)0.8));
    testcase.log(Status.PASS, "User Exit the OrderHistory page");
  }
 	 @Test(priority = 2)
 	 public void sikuliTesetCase002() throws FindFailed, IOException
 	 {
 		testcase=extent.createTest("TC_002:Verify ClassicDonutPrice");
 		 
    s.wait(Sides, 300);  
    s.click(Sides.similar((float)0.9));
    testcase.log(Status.PASS, "The User able to Click the Sides Button");
    s.wait(Donuts, 300);  
    s.click(Donuts.similar((float)0.9)); 
    testcase.log(Status.PASS, "The User able to Click the Donuts Button");
    s.wait(ClassicDonut, 300);  
    s.click(ClassicDonut.similar((float)0.8));
    testcase.log(Status.PASS, "The User able Click the ClasicDonut Button");
    s.wait(EatIn, 300);  
    s.click(EatIn.similar((float)0.8)); 
    testcase.log(Status.PASS, "The User Clicking the Eatin Option");
    s.wait(PayNow, 300); 
    s.click(PayNow.similar((float)0.8));
    testcase.log(Status.PASS, "The User Click the PayNow Option");
    s.wait(NextPay, 300); 
    s.click(NextPay.similar((float)0.8));
    testcase.log(Status.PASS, "The User Click the NextPay Method");
    s.wait(Functions, 300); 
    s.click(Functions.similar((float)0.8));
    testcase.log(Status.PASS, "User Click the Functions Button");
    s.wait(OrderHistory, 300); 
    s.click(OrderHistory.similar((float)0.8));
    testcase.log(Status.PASS, "USer click the Order History Option");
    s.wait(InputBox, 500); 
    s.click(InputBox.similar((float)0.8));
    testcase.log(Status.PASS, "User Click the InputBox");
    s.type(InputBox,ClassicDonutPrice);
    testcase.log(Status.PASS, "User Enter the ClassicDonutPrice");
    s.wait(OkSearch, 300); 
    s.click(OkSearch.similar((float)0.8)); 
    testcase.log(Status.PASS, "User Click the Ok Button");
    s.wait(GoSearch, 300); 
    s.click(GoSearch.similar((float)0.8));
    testcase.log(Status.PASS, "User able to click the Go Search Button");
    s.wait(SearchResult, 300); 
    s.doubleClick(SearchResult.similar((float)0.8));
    testcase.log(Status.FAIL, "User Check the Source Price");
    MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\873780\\OneDrive - Cognizant\\Desktop\\FailScreenshot.png").build();
    
    final String out2="*************************************Scenario 2 FAIL: Classic Donut price is incorrect*******************************************";
	System.out.println(out2); 
	testcase.log(Status.PASS, "The Classic Donut Price is Incorrect");
	
	s.wait(Exit, 300); 
    s.click(Exit.similar((float)0.8));
    testcase.log(Status.PASS, "The user Click the Exit Button");
}
 	 @Test(priority = 3)
    public void sikuliTesetCase003() throws FindFailed
    {	
 		testcase=extent.createTest("TC_003:Verify MapleButterPrice");
 		 
 		s.wait(Retail, 300);  
        s.click(Retail.similar((float)0.9));
        testcase.log(Status.PASS, "The User able to Click the Retail Item Menu");
        s.wait(TakeHome, 300);  
        s.click(TakeHome.similar((float)0.9)); 
        testcase.log(Status.PASS, "User Click the TakeHome option Menu");
        s.wait(Consumables, 300);  
        s.click(Consumables.similar((float)0.8));
        testcase.log(Status.PASS, "User Click the Consumables Option");
        s.wait(MapleButter, 300);  
        s.click(MapleButter.similar((float)0.8));
        testcase.log(Status.PASS, "User Click the MapleButter Menu");
        s.wait(EatIn, 300);  
        s.click(EatIn.similar((float)0.8));
        testcase.log(Status.PASS, "User Click the EatIn Option");
        s.wait(PayNow, 300); 
        s.click(PayNow.similar((float)0.8)); 
        testcase.log(Status.PASS, "User Click the PayNow Option");
        s.wait(NextPay, 300); 
        s.click(NextPay.similar((float)0.8));
        testcase.log(Status.PASS, "User Click the NextPay Method");
        s.wait(Functions, 300); 
        s.click(Functions.similar((float)0.8));
        testcase.log(Status.PASS, "User Click the Functions Menu");
        s.wait(OrderHistory, 300); 
        s.click(OrderHistory.similar((float)0.8));
        testcase.log(Status.PASS, "User Choose the Order History Option Menu");
        s.wait(InputBox, 500); 
        s.click(InputBox.similar((float)0.8)); 
        testcase.log(Status.PASS, "User Click the Input Search Box Option");
        s.type(InputBox,MapleButterPrice);
        testcase.log(Status.PASS, "User Type the MapleButterPrice in the InputBox");
        s.wait(OkSearch, 300); 
        s.click(OkSearch.similar((float)0.8));
        testcase.log(Status.PASS, "User Click the Ok Button");
        s.wait(GoSearch, 300); 
        s.click(GoSearch.similar((float)0.8));
        testcase.log(Status.PASS, "User Click the Go Search Button");
        s.wait(SearchResult, 300); 
        s.doubleClick(SearchResult.similar((float)0.8));
        testcase.log(Status.PASS, "User able to check the Source Price");
        
        s.doubleClick(SearchResult1);
        testcase.log(Status.PASS, "User able to Check the Target Price");
    	System.out.println("***************************************Scenario 3 PASS: Retail item's price is correct****************************"); 
    	testcase.log(Status.PASS, "The MapleButterPrice is Correct");
    	s.wait(Exit, 300); 
        s.click(Exit.similar((float)0.8)); 
        testcase.log(Status.PASS, "User Click the Exit Button");
// 		 
//      s.wait(MinPOS, 300);  
//	    s.click(MinPOS.similar((float)0.8));                 
//	    s.wait(CloseTerminal, 300);  
//	    s.click(CloseTerminal.similar((float)0.6)); 
//	    s.click(EndSession.similar((float)0.6)); 
//	    s.wait(File, 300); 
//	    s.click(File.similar((float)0.5)); 
//	    
//	    s.click(QuitBomgar.similar((float)0.9)); 
//	    s.click(YesBomgar.similar((float)0.9)); 
	  }
 	@Test(priority = 4)
 	 public void sikuliTesetCase004() throws FindFailed
 	 {
 		testcase=extent.createTest("TC_004:Verify IcedCoffeePrice");
 		
 		 s.wait(Beverages1, 300);
		 s.click(Beverages1.similar((float)0.5));
		 testcase.log(Status.PASS, "The User able to Click the Beverages Menu in POS");
		 s.wait(IcedBeverages, 300);
		 s.click(IcedBeverages.similar((float)0.5));
		 testcase.log(Status.PASS, "The User able to Click the IcedBeverages Menu in POS");
		 s.wait(IcedCoffee, 300);
		 s.click(IcedCoffee.similar((float)0.5));
		 testcase.log(Status.PASS, "The User able to click the IcedCoffee Menu in POS");
		 s.wait(OrgIcedCoffee, 300);
		 s.click(OrgIcedCoffee.similar((float)0.5));
		 testcase.log(Status.PASS, "The USer able to Click the Original IcedCoffee Flavour in POS");
		 s.wait(MDIcedCoffee, 300);
		 s.click(MDIcedCoffee.similar((float)0.5));
		 testcase.log(Status.PASS, "The user able to Click the Medium Size Menu in POS");
		 s.wait(EatIn, 300);  
        s.click(EatIn.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the EatIn Option in POS");
        s.wait(PayNow, 300); 
        s.click(PayNow.similar((float)0.8)); 
        testcase.log(Status.PASS, "The user Click the PayNow Option in POS");
        s.wait(NextPay, 300); 
        s.click(NextPay.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the NextPay option in POS");
        s.wait(Functions, 300); 
        s.click(Functions.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Functions Button");
        s.wait(OrderHistory, 300); 
        s.click(OrderHistory.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the OrderHistory Button");
        s.wait(InputBox, 500); 
        s.click(InputBox.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the InputBox Button");
        s.type(InputBox,IcedCoffeePrice);
        testcase.log(Status.PASS, "The User type the IcedCoffee Price in the InputBox");
        s.wait(OkSearch, 300); 
        s.click(OkSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Ok Button");
        s.wait(GoSearch, 300); 
        s.click(GoSearch.similar((float)0.5));
        testcase.log(Status.PASS, "The User Click the Go Search Button");
        s.wait(SearchResult, 300); 
        testcase.log(Status.PASS, "The User wait for the Source & Target Price");
        s.doubleClick(SearchResult.similar((float)0.5));
        
        s.doubleClick(SearchResult1); 
        testcase.log(Status.PASS, "The User Verify the Source & Target Price");
    	 System.out.println("***************************************Scenario 4 PASS: Retail item's price is correct****************************");                	
    	 s.wait(Exit, 300); 
        s.click(Exit.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Exit Button");
 	 }
 	@Test(priority = 5)
 	public void sikuliTestCase005() throws FindFailed
 	{
 		
 		testcase=extent.createTest("TC_005:Verify SpecialityTeaPrice");
 		
 		 s.wait(Beverages1, 300);
		 s.click(Beverages1.similar((float)0.5));
		 testcase.log(Status.PASS, "The User again Click the Beverages Menu in POS");
		 s.wait(HotBeverages, 400);
		 s.click(HotBeverages.similar((float)0.3));
		 testcase.log(Status.PASS, "The User able to Click the HotBeverages Menu in POS");
		 s.wait(SpecialtyTea, 300);
		 s.click(SpecialtyTea.similar((float)0.5));
		 testcase.log(Status.PASS, "The User able to click the SpecialtyTea Menu in POS");
		 s.wait(MDTea, 300);
		 s.click(MDTea.similar((float)0.5));
		 testcase.log(Status.PASS, "The user able to Click the Medium Size Menu in POS");
		 s.wait(EatIn, 300);  
	     s.click(EatIn.similar((float)0.8));
	     testcase.log(Status.PASS, "The user click the EatIn Option in POS");
		 s.wait(TeaFlav, 300);
		 s.click(TeaFlav.similar((float)0.5));
		 testcase.log(Status.PASS, "The user click Tea Flavour Option in POS");
//		 s.wait(TeaFlav1, 300);
//		 s.click(TeaFlav1.similar((float)0.5));
		 s.wait(AppleCinnamon, 300);
		 s.click(AppleCinnamon.similar((float)0.5));
		 testcase.log(Status.PASS, "The User Choose the AppleCinnamon Flavour in POS");
        s.wait(PayNow, 300); 
        s.click(PayNow.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the PayNow Option in POS");
        s.wait(NextPay, 300); 
        s.click(NextPay.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the NextPay option in POS");
        s.wait(Functions, 300); 
        s.click(Functions.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Functions Button");
        s.wait(OrderHistory, 300); 
        s.click(OrderHistory.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the OrderHistory Button");
        s.wait(InputBox, 500); 
        s.click(InputBox.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the InputBox Button");
        s.type(InputBox,SpecialityTeaPrice);
        testcase.log(Status.PASS, "The User type the SpecialityTeaPrice in the InputBox");
        s.wait(OkSearch, 300); 
        s.click(OkSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Ok Button");
        s.wait(GoSearch, 300); 
        s.click(GoSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Go Search Button");
        s.wait(SearchResult, 300); 
        s.doubleClick(SearchResult.similar((float)0.8));
        testcase.log(Status.PASS, "The User wait for the Source & Target Price");
        
        s.doubleClick(SearchResult1); 
        testcase.log(Status.PASS, "The User Verify the Source & Target Price");
    	 System.out.println("***************************************Scenario 5 PASS: Retail item's price is correct****************************");                	
    	 s.wait(Exit, 300); 
        s.click(Exit.similar((float)0.8)); 
        testcase.log(Status.PASS, "The User Click the Exit Button");
         
//        s.wait(MinPOS, 300);  
//	    s.click(MinPOS.similar((float)0.8));                 
// 	    s.wait(CloseTerminal, 300);  
//	    s.click(CloseTerminal.similar((float)0.6)); 
// 	    s.click(EndSession.similar((float)0.6)); 
// 	    s.wait(File, 300); 
// 	    s.click(File.similar((float)0.5)); 
// 	    
//        s.click(QuitBomgar.similar((float)0.9)); 
//	    s.click(YesBomgar.similar((float)0.9)); 
}
 	@Test(priority = 6)
 	
 	public void sikuliTestCase006() throws FindFailed
 	{
 		testcase=extent.createTest("TC_006:Verify VanillaIcedLattePrice");
 		
 		s.wait(Beverages1, 300);
 		s.click(Beverages1.similar((float)0.5));
 		testcase.log(Status.PASS, "The User again Click the Beverages Menu in POS");
 		s.wait(IcedBeverages, 300);
 		s.click(IcedBeverages.similar((float)0.5));
 		testcase.log(Status.PASS, "The User able to Click the HotBeverages Menu in POS");
 		s.wait(FlavIcedLatte, 400);
 		s.click(FlavIcedLatte.similar((float)0.4));
 		testcase.log(Status.PASS, "The User able to click the FlavIcedLatte Menu in POS");
 		s.wait(VanillaIcedLatte, 300);
 		s.click(VanillaIcedLatte.similar((float)0.4));
 		testcase.log(Status.PASS, "The User Choose the AppleCinnamon Flavour in POS");
 		s.wait(VanillaLatteLarge, 400);
 		s.click(VanillaLatteLarge.similar((float)0.4));
 		testcase.log(Status.PASS, "The user able to Click the Large Size Menu in POS");
 		s.wait(EatIn, 300);  
        s.click(EatIn.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the EatIn Option in POS");
        s.wait(PayNow, 300); 
        s.click(PayNow.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the PayNow Option in POS");
        s.wait(NextPay, 300); 
        s.click(NextPay.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the NextPay option in POS");
        s.wait(Functions, 300); 
        s.click(Functions.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Functions Button");
        s.wait(OrderHistory, 300); 
        s.click(OrderHistory.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the OrderHistory Button");
        s.wait(InputBox, 500); 
        s.click(InputBox.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the InputBox Button");
        s.type(InputBox,VanillaIcedLattePrice);
        testcase.log(Status.PASS, "The User type the IcedCoffee Price in the InputBox");
        s.wait(OkSearch, 300); 
        s.click(OkSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Ok Button");
        s.wait(GoSearch, 300); 
        s.click(GoSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Go Search Button");	
        s.wait(SearchResult, 300); 
        s.doubleClick(SearchResult.similar((float)0.8));
        testcase.log(Status.PASS, "The User wait for the Source & Target Price");
        
        s.doubleClick(SearchResult1);
        testcase.log(Status.PASS, "The User Verify the Source & Target Price");
    	 System.out.println("***************************************Scenario 6 PASS: Retail item's price is correct****************************");                	
    	 s.wait(Exit, 300); 
        s.click(Exit.similar((float)0.8)); 		
        testcase.log(Status.PASS, "The User Click the Exit Button");
 	}
 	@Test(priority = 7)
 	public void sikuliTestCase007() throws FindFailed
 	{
 		testcase=extent.createTest("TC_007:Verify VanillaCreamColdBrewPrice");
 		
 		s.wait(Beverages1, 300);
 		s.click(Beverages1.similar((float)0.5));
 		testcase.log(Status.PASS, "The User again Click the Beverages Menu in POS");
 		s.wait(IcedBeverages, 400);
 		s.click(IcedBeverages.similar((float)0.5));
 		testcase.log(Status.PASS, "The User able to Click the IcedBeverages Menu in POS");
 		s.wait(Promo, 300);
 		s.click(Promo);
 		s.wait(ColdBrew, 600);
 		s.click(ColdBrew.similar((float)0.3));
 		testcase.log(Status.PASS, "The User able to click the ColdBrew Menu in POS");
 		s.wait(VanillaCreamColdBrew, 300);
 		s.click(VanillaCreamColdBrew.similar((float)0.5));
 		testcase.log(Status.PASS, "The User Choose the VanillaCreamColdBrew Flavour in POS");
 		s.wait(VanillaCreamColdBrewSmall, 400);
 		s.click(VanillaCreamColdBrewSmall.similar((float)0.4));
 		testcase.log(Status.PASS, "The user able to Click the Small Size Menu in POS");
 		s.wait(EatIn, 300);  
        s.click(EatIn.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the EatIn Option in POS");
        s.wait(PayNow, 300); 
        s.click(PayNow.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the PayNow Option in POS");
        s.wait(NextPay, 300); 
        s.click(NextPay.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the NextPay option in POS");
        s.wait(Functions, 300); 
        s.click(Functions.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Functions Button");
        s.wait(OrderHistory, 300); 
        s.click(OrderHistory.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the OrderHistory Button");
        s.wait(InputBox, 500); 
        s.click(InputBox.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the InputBox Button");
        s.type(InputBox,VanillaCreamColdBrewPrice);
        testcase.log(Status.PASS, "The User type the VanillaCreamColdBrewPrice in the InputBox");
        s.wait(OkSearch, 300); 
        s.click(OkSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Ok Button");
        s.wait(GoSearch, 300); 
        s.click(GoSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Go Search Button");
        s.wait(SearchResult, 300); 
        s.doubleClick(SearchResult.similar((float)0.8));
        testcase.log(Status.PASS, "The User wait for the Source & Target Price");
        
        s.doubleClick(SearchResult1);
        testcase.log(Status.PASS, "The User Verify the Source & Target Price");
    	 System.out.println("***************************************Scenario 7 PASS: Retail item's price is correct****************************");                	
    	 s.wait(Exit, 300); 
        s.click(Exit.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Exit Button");
        
//        s.wait(MinPOS, 300);  
//	    s.click(MinPOS.similar((float)0.8));                 
// 	    s.wait(CloseTerminal, 300);  
//	    s.click(CloseTerminal.similar((float)0.6)); 
// 	    s.click(EndSession.similar((float)0.6)); 
// 	    s.wait(File, 300); 
// 	    s.click(File.similar((float)0.5)); 
// 	    
//        s.click(QuitBomgar.similar((float)0.9)); 
//	    s.click(YesBomgar.similar((float)0.9)); 
// 		
 	}
 	@Test(priority = 8)
 	public void sikuliTestCase008() throws FindFailed
 	{
 		testcase=extent.createTest("TC_008:Verify BottleWaterPrice");
 		
 		s.wait(Beverages1, 300);
 		s.click(Beverages1.similar((float)0.5));
 		testcase.log(Status.PASS, "The User again Click the Beverages Menu in POS");
 		s.wait(ColdBeverages, 300);
 		s.click(ColdBeverages.similar((float)0.5));
 		testcase.log(Status.PASS, "The User able to Click the IcedBeverages Menu in POS");
 		s.wait(BottleWater, 300);
 		s.click(BottleWater.similar((float)0.5));
 		testcase.log(Status.PASS, "The User able to click the BottleWater Menu in POS");
 		s.wait(EatIn, 300);  
        s.click(EatIn.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the EatIn Option in POS");
        s.wait(PayNow, 300); 
        s.click(PayNow.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the PayNow Option in POS");
        s.wait(NextPay, 300); 
        s.click(NextPay.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the NextPay option in POS");
        s.wait(Functions, 300); 
        s.click(Functions.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Functions Button");
        s.wait(OrderHistory, 300); 
        s.click(OrderHistory.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the OrderHistory Button");
        s.wait(InputBox, 500); 
        s.click(InputBox.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the InputBox Button");
        s.type(InputBox,BottleWaterPrice);
        testcase.log(Status.PASS, "The User type the BottleWaterPrice in the InputBox");
        s.wait(OkSearch, 300); 
        s.click(OkSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Ok Button");
        s.wait(GoSearch, 300); 
        s.click(GoSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Go Search Button");
        s.wait(SearchResult, 300); 
        s.doubleClick(SearchResult.similar((float)0.8));
        testcase.log(Status.PASS, "The User wait for the Source & Target Price");
        
        s.doubleClick(SearchResult1);
        testcase.log(Status.PASS, "The User Verify the Source & Target Price");
   	 System.out.println("***************************************Scenario 8 PASS: Retail item's price is correct****************************");                	
   	 s.wait(Exit, 300); 
       s.click(Exit.similar((float)0.8));
       testcase.log(Status.PASS, "The User Click the Exit Button");
 		
 		
 	}
 	@Test(priority = 9)
 	public void sikuliTestCase009() throws FindFailed
 	{
 		testcase=extent.createTest("TC_009:Verify EggCheeseBiscuitPrice");
 		
 		s.wait(Breakfast, 300);
 		s.click(Breakfast.similar((float)0.5));
 		testcase.log(Status.PASS, "The User Click the Breakfast Menu in POS");
 		s.wait(Sandwiches, 300);
 		s.click(Sandwiches.similar((float)0.5));
 		testcase.log(Status.PASS, "The User Click the Sandwiches Menu in POS");
 		s.wait(EggCheeseBiscuit, 300);
 		s.click(EggCheeseBiscuit.similar((float)0.5));
 		testcase.log(Status.PASS, "The User Click the EggCheeseBiscuit Menu in POS");
 		s.wait(EatIn, 300);  
        s.click(EatIn.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the EatIn Option in POS");
        s.wait(PayNow, 300); 
        s.click(PayNow.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the PayNow Option in POS");
        s.wait(NextPay, 300); 
        s.click(NextPay.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the NextPay option in POS");
        s.wait(Functions, 300); 
        s.click(Functions.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Functions Button");
        s.wait(OrderHistory, 300); 
        s.click(OrderHistory.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the OrderHistory Button");
        s.wait(InputBox, 500); 
        s.click(InputBox.similar((float)0.8)); 
        testcase.log(Status.PASS, "The user Click the InputBox Button");
        s.type(InputBox,EggCheeseBiscuitPrice);
        testcase.log(Status.PASS, "The User type the EggCheeseBiscuitPrice in the InputBox");
        s.wait(OkSearch, 300); 
        s.click(OkSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Ok Button");
        s.wait(GoSearch, 300); 
        s.click(GoSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Go Search Button");
        s.wait(SearchResult, 300); 
        s.doubleClick(SearchResult.similar((float)0.8));
        testcase.log(Status.PASS, "The User wait for the Source & Target Price");
        
        s.doubleClick(SearchResult1);
        testcase.log(Status.PASS, "The User Verify the Source & Target Price");
   	 System.out.println("***************************************Scenario 9 PASS: Retail item's price is correct****************************");                	
   	 s.wait(Exit, 300); 
       s.click(Exit.similar((float)0.8)); 
       testcase.log(Status.PASS, "The User Click the Exit Button");
 		
 	}
 	@Test(priority = 10)
 	public void sikuliTestCase0010() throws FindFailed
 	{
 		testcase=extent.createTest("TC_0010:Verify BaconFarmersBiscuitPrice");
 		
 		s.wait(Breakfast, 300);
 		s.click(Breakfast.similar((float)0.5));
 		testcase.log(Status.PASS, "The User again Click the Breakfast Menu in POS");
 		s.wait(FarmerSandwiches, 300);
 		s.click(FarmerSandwiches.similar((float)0.5));
 		testcase.log(Status.PASS, "The User Click the FarmerSandwiches Menu in POS");
 		s.wait(BaconFarmersBiscuit, 300);
 		s.click(BaconFarmersBiscuit.similar((float)0.5));
 		testcase.log(Status.PASS, "The User Click the BaconFarmersBiscuit Menu in POS");
 		s.wait(EatIn, 300);  
        s.click(EatIn.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the EatIn Option in POS");
        s.wait(PayNow, 300); 
        s.click(PayNow.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the PayNow Option in POS");
        s.wait(NextPay, 300); 
        s.click(NextPay.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the NextPay option in POS");
        s.wait(Functions, 300); 
        s.click(Functions.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Functions Button");
        s.wait(OrderHistory, 300); 
        s.click(OrderHistory.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the OrderHistory Button");
        s.wait(InputBox, 500); 
        s.click(InputBox.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the InputBox Button");
        s.type(InputBox,BaconFarmersBiscuitPrice);
        testcase.log(Status.PASS, "The User type the BaconFarmersBiscuitPrice in the InputBox");
        s.wait(OkSearch, 300); 
        s.click(OkSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Ok Button");
        s.wait(GoSearch, 300); 
        s.click(GoSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Go Search Button");
        s.wait(SearchResult, 300); 
        s.doubleClick(SearchResult.similar((float)0.8));
        testcase.log(Status.PASS, "The User wait for the Source & Target Price");
        
        s.doubleClick(SearchResult1);
        testcase.log(Status.PASS, "The User Verify the Source & Target Price");
   	 System.out.println("***************************************Scenario 10 PASS: Retail item's price is correct****************************");                	
   	 s.wait(Exit, 300); 
       s.click(Exit.similar((float)0.8));
       testcase.log(Status.PASS, "The User Click the Exit Button");
 	}
 	@Test(priority = 11)
 	public void sikuliTestCase0011() throws FindFailed 
 	{
 		testcase=extent.createTest("TC_0011:Verify BaconFarmersWrapPrice");
 		
 		s.wait(Breakfast, 300);
 		s.click(Breakfast.similar((float)0.5));
 		testcase.log(Status.PASS, "The User again Click the Breakfast Menu in POS");
 		s.wait(FarmerWraps, 300);
 		s.click(FarmerWraps.similar((float)0.5));
 		testcase.log(Status.PASS, "The User Click the FarmerWraps Menu in POS");
 		s.wait(BaconFarmersWrap, 300);
 		s.click(BaconFarmersWrap.similar((float)0.5));
 		testcase.log(Status.PASS, "The User Click the BaconFarmersWrap Menu in POS");
// 		s.wait(EatIn, 300);  
//        s.click(EatIn.similar((float)0.8)); 
        s.wait(EatIn, 300);  
        s.click(EatIn.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the EatIn Option in POS");
        s.wait(PayNow, 300); 
        s.click(PayNow.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the PayNow Option in POS");
        s.wait(NextPay, 300); 
        s.click(NextPay.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the NextPay option in POS");
        s.wait(Functions, 300); 
        s.click(Functions.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Functions Button");
        s.wait(OrderHistory, 300); 
        s.click(OrderHistory.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the OrderHistory Button");
        s.wait(InputBox, 500); 
        s.click(InputBox.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the InputBox Button");
        s.type(InputBox,BaconFarmersWrapPrice);
        testcase.log(Status.PASS, "The User type the IcedCoffee Price in the InputBox");
        s.wait(OkSearch, 300); 
        s.click(OkSearch.similar((float)0.8)); 
        testcase.log(Status.PASS, "The User Click the Ok Button");
        s.wait(GoSearch, 300); 
        s.click(GoSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Go Search Button");
        s.wait(SearchResult, 300); 
        s.doubleClick(SearchResult.similar((float)0.8));
        testcase.log(Status.PASS, "The User wait for the Source & Target Price");
        
        s.doubleClick(SearchResult1); 
        testcase.log(Status.PASS, "The User Verify the Source & Target Price");
   	 System.out.println("***************************************Scenario 11 PASS: Retail item's price is correct****************************");                	
   	 s.wait(Exit, 300); 
       s.click(Exit.similar((float)0.8));
       testcase.log(Status.PASS, "The User Click the Exit Button");
 	}
 	@Test(priority = 12)
 	public void sikuliTestCase0012() throws FindFailed
 	{
 		testcase=extent.createTest("TC_0012:Verify BaconBeltPrice");
 		
 		s.wait(Breakfast, 300);
 		s.click(Breakfast.similar((float)0.5));
 		testcase.log(Status.PASS, "The User again Click the Breakfast Menu in POS");
 		s.wait(Belts, 300);
 		s.click(Belts.similar((float)0.5));
 		testcase.log(Status.PASS, "The User Click the Belts Menu in POS");
 		s.wait(BaconBelt, 300);
 		s.click(BaconBelt.similar((float)0.5));
 		testcase.log(Status.PASS, "The User Click the BaconBelt Menu in POS");
 		s.wait(EatIn, 300);  
        s.click(EatIn.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the EatIn Option in POS");
        s.wait(ChooseBagel, 300);
        s.click(ChooseBagel.similar((float)0.5));
        testcase.log(Status.PASS, "The user Click the Flavour in Bagel option");
        s.wait(BlueberyBagel, 300);
        s.click(BlueberyBagel.similar((float)0.5));
        testcase.log(Status.PASS, "The user Choose BlueberyBagel in Option");
        s.wait(PayNow, 300); 
        s.click(PayNow.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the PayNow Option in POS");
        s.wait(NextPay, 300); 
        s.click(NextPay.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the NextPay option in POS");
        s.wait(Functions, 300); 
        s.click(Functions.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Functions Button");
        s.wait(OrderHistory, 300); 
        s.click(OrderHistory.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the OrderHistory Button");
        s.wait(InputBox, 500); 
        s.click(InputBox.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the InputBox Button");
        s.type(InputBox,BaconBeltPrice);
        testcase.log(Status.PASS, "The User type the BaconBeltPrice in the InputBox");
        s.wait(OkSearch, 300); 
        s.click(OkSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Ok Button");
        s.wait(GoSearch, 300); 
        s.click(GoSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Go Search Button");
        s.wait(SearchResult, 300); 
        s.doubleClick(SearchResult.similar((float)0.8));
        testcase.log(Status.PASS, "The User wait for the Source & Target Price");
        
        s.doubleClick(SearchResult1); 
        testcase.log(Status.PASS, "The User Verify the Source & Target Price");
   	 System.out.println("***************************************Scenario 12 PASS: Retail item's price is correct****************************");                	
   	 s.wait(Exit, 300); 
       s.click(Exit.similar((float)0.8));
       testcase.log(Status.PASS, "The User Click the Exit Button");
 	}
 	@Test(priority = 13)
 	public void sikuliTestCase0013() throws FindFailed
 	{
 		testcase=extent.createTest("TC_0013:Verify TurkeyBaconClubPrice");
 		
 		s.wait(Lunch, 300);
 		s.click(Lunch.similar((float)0.5));
 		testcase.log(Status.PASS, "The User Click the Lunch Menu in POS");
 		s.wait(Sandwiches1, 300);
 		s.click(Sandwiches1.similar((float)0.5));
 		testcase.log(Status.PASS, "The User Click the Sandwiches Menu in POS");
 		s.wait(TurkeyBaconClub, 300);
 		s.click(TurkeyBaconClub.similar((float)0.5));
 		testcase.log(Status.PASS, "The User Click the TurkeyBaconClub Menu in POS");
 		s.wait(EatIn, 300);  
        s.click(EatIn.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the EatIn Option in POS");
        s.wait(PayNow, 300); 
        s.click(PayNow.similar((float)0.8)); 
        testcase.log(Status.PASS, "The user Click the PayNow Option in POS");
        s.wait(NextPay, 300); 
        s.click(NextPay.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the NextPay option in POS");
        s.wait(Functions, 300); 
        s.click(Functions.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Functions Button");
        s.wait(OrderHistory, 300); 
        s.click(OrderHistory.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the OrderHistory Button");
        s.wait(InputBox, 500); 
        s.click(InputBox.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the InputBox Button");
        s.type(InputBox,TurkeyBaconClubPrice);
        testcase.log(Status.PASS, "The User type the TurkeyBaconClubPrice in the InputBox");
        s.wait(OkSearch, 300); 
        s.click(OkSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Ok Button");
        s.wait(GoSearch, 300); 
        s.click(GoSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Go Search Button");
        s.wait(SearchResult, 300); 
        s.doubleClick(SearchResult.similar((float)0.8));
        testcase.log(Status.PASS, "The User wait for the Source & Target Price");
        
        s.doubleClick(SearchResult1); 
        testcase.log(Status.PASS, "The User Verify the Source & Target Price");
   	 System.out.println("***************************************Scenario 13 PASS: Retail item's price is correct****************************");                	
   	 s.wait(Exit, 300); 
       s.click(Exit.similar((float)0.8));
       testcase.log(Status.PASS, "The User Click the Exit Button");
 	}
 	@Test(priority = 14)
 	public void sikuliTestCase0014() throws FindFailed 
 	{
 		testcase=extent.createTest("TC_0014:Verify HamMeltPrice");
 		
 		s.wait(Lunch, 300);
 		s.click(Lunch.similar((float)0.5));
 		testcase.log(Status.PASS, "The User again Click the Lunch Menu in POS");
 		s.wait(Melt, 300);
 		s.click(Melt.similar((float)0.5));
 		testcase.log(Status.PASS, "The User Click the Melt Menu in POS");
 		s.wait(HamMelt, 600);
 		s.click(HamMelt.similar((float)0.3));
 		testcase.log(Status.PASS, "The User Click the HamMelt Menu in POS");
 		s.wait(EatIn, 300);  
        s.click(EatIn.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the EatIn Option in POS");
        s.wait(PayNow, 300); 
        s.click(PayNow.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the PayNow Option in POS");
        s.wait(NextPay, 300); 
        s.click(NextPay.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the NextPay option in POS");
        s.wait(Functions, 300); 
        s.click(Functions.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Functions Button");
        s.wait(OrderHistory, 300); 
        s.click(OrderHistory.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the OrderHistory Button");
        s.wait(InputBox, 500); 
        s.click(InputBox.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the InputBox Button");
        s.type(InputBox,HamMeltPrice);
        testcase.log(Status.PASS, "The User type the HamMeltPrice in the InputBox");
        s.wait(OkSearch, 300); 
        s.click(OkSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Ok Button");
        s.wait(GoSearch, 300); 
        s.click(GoSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Go Search Button");
        s.wait(SearchResult, 300); 
        s.doubleClick(SearchResult.similar((float)0.8));
        testcase.log(Status.PASS, "The User wait for the Source & Target Price");
        
        s.doubleClick(SearchResult1);
        testcase.log(Status.PASS, "The User Verify the Source & Target Price");
   	 System.out.println("***************************************Scenario 14 PASS: Retail item's price is correct****************************");                	
   	 s.wait(Exit, 300); 
       s.click(Exit.similar((float)0.8)); 
       testcase.log(Status.PASS, "The User Click the Exit Button");
 		
 	}
 	@Test(priority = 15)
 	public void sikuliTestCase0015() throws FindFailed
 	{
 		testcase=extent.createTest("TC_0015:Verify CrispyCilantroWrapPrice");
 		
 		s.wait(Lunch, 300);
 		s.click(Lunch.similar((float)0.5));
 		testcase.log(Status.PASS, "The User again Click the Lunch Menu in POS");
 		s.wait(LoadedWraps, 300);
 		s.click(LoadedWraps.similar((float)0.5));
 		testcase.log(Status.PASS, "The User Click the LoadedWraps Menu in POS");
 		s.wait(CilantroWrap, 300);
 		s.click(CilantroWrap.similar((float)0.5));
 		testcase.log(Status.PASS, "The User Click the CilantroWrap Menu in POS");
 		s.wait(Promo, 300);
 		s.click(Promo);
 		s.wait(CrispyWrap, 600);
 		s.click(CrispyWrap.similar((float)0.3));
 		testcase.log(Status.PASS, "The User Click the CrispyWrap Menu in POS");
 		s.wait(EatIn, 300);  
        s.click(EatIn.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the EatIn Option in POS");
        s.wait(PayNow, 300); 
        s.click(PayNow.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the PayNow Option in POS");
        s.wait(NextPay, 300); 
        s.click(NextPay.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the NextPay option in POS");
        s.wait(Functions, 300); 
        s.click(Functions.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Functions Button");
        s.wait(OrderHistory, 300); 
        s.click(OrderHistory.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the OrderHistory Button");
        s.wait(InputBox, 500); 
        s.click(InputBox.similar((float)0.8)); 
        testcase.log(Status.PASS, "The user Click the InputBox Button");
        s.type(InputBox,CrispyCilantroWrapPrice);
        testcase.log(Status.PASS, "The User type the CrispyCilantroWrapPrice in the InputBox");
        s.wait(OkSearch, 300); 
        s.click(OkSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Ok Button");
        s.wait(GoSearch, 300); 
        s.click(GoSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Go Search Button");
        s.wait(SearchResult, 300); 
        s.doubleClick(SearchResult.similar((float)0.8));
        testcase.log(Status.PASS, "The User wait for the Source & Target Price");
        
        s.doubleClick(SearchResult1); 
        testcase.log(Status.PASS, "The User Verify the Source & Target Price");
   	 System.out.println("***************************************Scenario 15 PASS: Retail item's price is correct****************************");                	
   	 s.wait(Exit, 300); 
       s.click(Exit.similar((float)0.8));
       testcase.log(Status.PASS, "The User Click the Exit Button");
 	}
 	@Test(priority = 16)	
 	public void sikuliTestCase0016() throws FindFailed
 	{
 		testcase=extent.createTest("TC_0015:Verify ChickenNoodlePrice");
 		s.wait(Lunch, 300);
 		s.click(Lunch.similar((float)0.5));
 		testcase.log(Status.PASS, "The User again Click the Lunch Menu in POS");
 		s.wait(HotBowls, 300);
 		s.click(HotBowls.similar((float)0.5));
 		testcase.log(Status.PASS, "The User Click the HotBowls Menu in POS");
 		s.wait(ChickenNoodle, 300);
 		s.click(ChickenNoodle.similar((float)0.5));
 		testcase.log(Status.PASS, "The User Click the ChickenNoodle Menu in POS");
 		s.wait(EatIn, 300);  
        s.click(EatIn.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the EatIn Option in POS");
        s.wait(PayNow, 300); 
        s.click(PayNow.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the PayNow Option in POS");
        s.wait(NextPay, 300); 
        s.click(NextPay.similar((float)0.8));
        testcase.log(Status.PASS, "The user click the NextPay option in POS");
        s.wait(Functions, 300); 
        s.click(Functions.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Functions Button");
        s.wait(OrderHistory, 300); 
        s.click(OrderHistory.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the OrderHistory Button");
        s.wait(InputBox, 500); 
        s.click(InputBox.similar((float)0.8));
        testcase.log(Status.PASS, "The user Click the InputBox Button");
        s.type(InputBox,ChickenNoodlePrice);
        testcase.log(Status.PASS, "The User type the ChickenNoodlePrice in the InputBox");
        s.wait(OkSearch, 300); 
        s.click(OkSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Ok Button");
        s.wait(GoSearch, 300); 
        s.click(GoSearch.similar((float)0.8));
        testcase.log(Status.PASS, "The User Click the Go Search Button");
        s.wait(SearchResult, 300); 
        s.doubleClick(SearchResult.similar((float)0.8));
        s.doubleClick(SearchResult1);
        testcase.log(Status.PASS, "The User wait for the Source & Target Price");
        
        System.out.println("***************************************Scenario 16 PASS: Retail item's price is correct****************************");                	
      	 s.wait(Exit, 300); 
          s.click(Exit.similar((float)0.8));
          testcase.log(Status.PASS, "The User Click the Exit Button");
 		
 	}
 	@Test(priority = 17)
    public void sikuliTestCase0017() throws FindFailed
    {
        testcase=extent.createTest("TC_0017:Verify GrainPreparedBagelPrice");
        
    s.wait(Bagels, 300);
    s.click(Bagels.similar((float)0.5));
    s.wait(GrainBagelPrePared, 300);
    s.click(GrainBagelPrePared.similar((float)0.5));
    s.wait(EatIn, 300);  
   s.click(EatIn.similar((float)0.8));
   s.wait(PayNow, 300);
   s.click(PayNow.similar((float)0.8));
   s.wait(NextPay, 300);
   s.click(NextPay.similar((float)0.8));
   s.wait(Functions, 300);
   s.click(Functions.similar((float)0.5));
   s.wait(OrderHistory, 300);
   s.click(OrderHistory.similar((float)0.5));
   s.wait(PaymentAmount, 500);
   s.wait(InputBox, 500);
   s.click(InputBox.similar((float)0.5));
   s.type(InputBox,GrainPreparedBagelPrice);
   s.wait(OkSearch, 300);
   s.click(OkSearch.similar((float)0.5));
   s.wait(GoSearch, 300);
   s.click(GoSearch.similar((float)0.5));
   s.wait(SearchResult, 300);
   s.doubleClick(SearchResult.similar((float)0.5));
   s.doubleClick(SearchResult1);
   
   System.out.println("***************************************Scenario 17 PASS: Retail item's price is correct****************************");                    
      s.wait(Exit, 300);
     s.click(Exit.similar((float)0.5));
    
    }
    @Test(priority = 18)
    public void sikuliTestcase0018() throws FindFailed
    {
        testcase=extent.createTest("TC_0018:Verify Timbits10Price");
        
    s.wait(Sides, 300);
    s.click(Sides.similar((float)0.5));
    s.wait(Timbits, 300);
    s.click(Timbits.similar((float)0.5));
    s.wait(Timbits10, 300);
    s.click(Timbits10.similar((float)0.5));
    s.wait(EatIn, 300);  
   s.click(EatIn.similar((float)0.8));
   s.wait(PayNow, 300);
   s.click(PayNow.similar((float)0.8));
   s.wait(NextPay, 300);
   s.click(NextPay.similar((float)0.5));
   s.wait(Functions, 300);
   s.click(Functions.similar((float)0.5));
   s.wait(OrderHistory, 300);
   s.click(OrderHistory.similar((float)0.5));
   s.wait(PaymentAmount, 500);
   s.wait(InputBox, 500);
   s.click(InputBox.similar((float)0.5));
   s.type(InputBox,Timbits10Price);
   s.wait(OkSearch, 300);
   s.click(OkSearch.similar((float)0.5));
   s.wait(GoSearch, 300);
   s.click(GoSearch.similar((float)0.5));
   s.wait(SearchResult, 300);
   s.doubleClick(SearchResult.similar((float)0.5));
   s.doubleClick(SearchResult1);
   
   System.out.println("***************************************Scenario 18 PASS: Retail item's price is correct****************************");                    
      s.wait(Exit, 300);
     s.click(Exit.similar((float)0.5));
    }
    @Test(priority = 19)
    public void sikuliTestCase0019() throws FindFailed
    {
        testcase=extent.createTest("TC_0019:Verify HashbrownPrice");
        
        s.wait(Sides, 300);
         s.click(Sides.similar((float)0.5));
         s.wait(OtherSides, 300);
         s.click(OtherSides.similar((float)0.5));
         s.wait(Hashbrown, 300);
         s.click(Hashbrown.similar((float)0.5));
         s.wait(EatIn, 300);  
        s.click(EatIn.similar((float)0.8));
        s.wait(PayNow, 300);
        s.click(PayNow.similar((float)0.8));
        s.wait(NextPay, 300);
        s.click(NextPay.similar((float)0.5));
        s.wait(Functions, 300);
        s.click(Functions.similar((float)0.5));
        s.wait(OrderHistory, 300);
        s.click(OrderHistory.similar((float)0.5));
        s.wait(PaymentAmount, 500);
        s.wait(InputBox, 500);
        s.click(InputBox.similar((float)0.5));
        s.type(InputBox,HashbrownPrice);
        s.wait(OkSearch, 300);
        s.click(OkSearch.similar((float)0.5));
        s.wait(GoSearch, 300);
        s.click(GoSearch.similar((float)0.5));
        s.wait(SearchResult, 300);
        s.doubleClick(SearchResult.similar((float)0.5));
        s.doubleClick(SearchResult1);
        
        System.out.println("***************************************Scenario 19 PASS: Retail item's price is correct****************************");                    
           s.wait(Exit, 300);
          s.click(Exit.similar((float)0.5));
    }
    @Test(priority = 20)
    public void sikuliTestCase0020() throws FindFailed
    {
        testcase=extent.createTest("TC_0020:Verify CeramicMugPrice");
        
        s.wait(Retail, 300);
        s.click(Retail.similar((float)0.5));
        s.wait(Hardware, 300);
        s.click(Hardware.similar((float)0.5));
        s.wait(Mugs, 300);
        s.click(Mugs.similar((float)0.5));
        s.wait(CeramicMug, 300);
        s.click(CeramicMug.similar((float)0.5));
        s.wait(EatIn, 300);  
       s.click(EatIn.similar((float)0.8));
       s.wait(PayNow, 300);
       s.click(PayNow.similar((float)0.8));
       s.wait(NextPay, 300);
       s.click(NextPay.similar((float)0.5));
       s.wait(Functions, 300);
       s.click(Functions.similar((float)0.5));
       s.wait(OrderHistory, 300);
       s.click(OrderHistory.similar((float)0.5));
       s.wait(PaymentAmount, 500);
       s.wait(InputBox, 500);
       s.click(InputBox.similar((float)0.5));
       s.type(InputBox,CeramicMugPrice);
       s.wait(OkSearch, 300);
       s.click(OkSearch.similar((float)0.5));
       s.wait(GoSearch, 300);
       s.click(GoSearch.similar((float)0.5));
       s.wait(SearchResult, 300);
       s.doubleClick(SearchResult.similar((float)0.5));
       s.doubleClick(SearchResult1);
       
       System.out.println("***************************************Scenario 20 PASS: Retail item's price is correct****************************");                    
          s.wait(Exit, 300);
         s.click(Exit.similar((float)0.5));
         }
    @Test(priority = 21)
 	public void sikuliTestCase0021() throws FindFailed, IOException, TesseractException, InterruptedException
 	{
 		testcase=extent.createTest("TC_0021:Verify Correct Order Detail (Item Name:Sausage Egg & cheese Biscuit");
 		
 		s.wait(Breakfast, 300);
 		s.click(Breakfast.similar((float)0.5));
 		testcase.log(Status.PASS, "The User  Click the Breakfast Item Menu in POS");
 		Thread.sleep(2000);
 		s.wait(Sandwiches, 300);
 		s.click(Sandwiches.similar((float)0.5));
 		testcase.log(Status.PASS, "The User  Click the Sandwiches Item Menu in POS");
 		s.wait(EggCheeseBiscuit, 300);
 		s.click(EggCheeseBiscuit.similar((float)0.5));
 		testcase.log(Status.PASS, "The User  Click the EggCheeseBiscuit Item Menu in POS");
 		s.wait(EatIn, 300);  
        s.click(EatIn.similar((float)0.5));
        testcase.log(Status.PASS, "The user click the EatIn Option in POS");
        File Source = new File("EggBrekSand.png");
        String Path = System.getProperty("user.dir")+"/Image/EggBrekSand.png";
        FileHandler.copy(Source, new File(Path));
        ITesseract image = new Tesseract();
        image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
        String imageText=image.doOCR(new File(Path));
        System.out.println(imageText);
        testcase.log(Status.PASS, "The Item name is Verified in Order Details page");
        System.out.println("***************************************Scenario 21 PASS: Retail item's Name is correct****************************");
        s.wait(VoidItem, 300);
        s.click(VoidItem.similar((float)0.5));
 		
 		
 	}
 	@Test(priority = 22)
 	public void sikuliTestCase0022() throws FindFailed, IOException, TesseractException, InterruptedException 
 	{
 		testcase=extent.createTest("TC_0022:Verify Correct Button Name (Item Name:Sausage Egg & cheese Biscuit");
 		
 		Thread.sleep(3000);
 		s.wait(Breakfast, 300);
 		s.click(Breakfast.similar((float)0.5));
 		testcase.log(Status.PASS, "The User  Click the Breakfast Item Menu in POS");
 		Thread.sleep(2000);
 		s.wait(Sandwiches, 300);
 		s.click(Sandwiches.similar((float)0.6));
 		testcase.log(Status.PASS, "The User  Click the Sandwiches Item Menu in POS");
 		Thread.sleep(2000);
 		s.wait(EggCheeseBiscuit, 500);
 		testcase.log(Status.PASS, "The User Wait For the EggCheeseBiscuit Button Menu in POS");
 		File Source = new File("EggCheeseBiscuit.png");
        String Path = System.getProperty("user.dir")+"/Image/EggCheeseBiscuit.png";
        FileHandler.copy(Source, new File(Path));
        ITesseract image = new Tesseract();
        image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
        String imageText=image.doOCR(new File(Path));
        System.out.println(imageText);
        testcase.log(Status.PASS, "The EggCheeseBiscuit Item Button Name is Verified in POS");
        System.out.println("***************************************Scenario 22 PASS: Retail item's Button Name is correct****************************");
 		
 	}
 	@Test(priority = 23)
 	public void sikuliTestCase0023() throws FindFailed, IOException, TesseractException, InterruptedException 
 	{
 		testcase=extent.createTest("TC_0023:Verify Bunding item's Name (Item Name:cookies(DOZEN)");
 		
 		s.wait(Sides, 300);
 		s.click(Sides.similar((float)0.5));
 		testcase.log(Status.PASS, "The User  Click the Sides Item Menu in POS");
 		Thread.sleep(2000);
 		s.wait(Cookies, 300);
 		s.click(Cookies.similar((float)0.5));
 		testcase.log(Status.PASS, "The User  Click the Cookies Item Menu in POS");
 		s.wait(CookiesDozen, 500);
 		s.click(CookiesDozen.similar((float)0.5));
 		testcase.log(Status.PASS, "The User  Click the Cookies-Dozen Item Menu in POS");
 		s.wait(EatIn, 300);  
        s.click(EatIn.similar((float)0.5));
        testcase.log(Status.PASS, "The user click the EatIn Option in POS");
        File Source = new File("CookAsrtDozen.png");
        String Path = System.getProperty("user.dir")+"/Image/CookAsrtDozen.png";
        FileHandler.copy(Source, new File(Path));
        ITesseract image = new Tesseract();
        image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
        String imageText=image.doOCR(new File(Path));
        System.out.println(imageText);
        testcase.log(Status.PASS, "Verified Bunding item's Name in Order Detail Page");
        System.out.println("***************************************Scenario 23 PASS: Retail item's Name is correct****************************");
        s.wait(VoidItem, 300);
        s.click(VoidItem.similar((float)0.5));
 	}
 	@Test(priority = 24)
 	public void sikuliTestCase0024() throws FindFailed, IOException, TesseractException, InterruptedException
 	{
 		testcase=extent.createTest("TC_0024:Verify Modifier added on item's (Item Name:Sausage Egg & cheese Biscuit");
 		Thread.sleep(2000);
 		s.wait(Breakfast, 300);
 		s.click(Breakfast.similar((float)0.5));
 		testcase.log(Status.PASS, "The User  Click the Breakfast Item Menu in POS");
 		Thread.sleep(2000);
 		s.wait(Sandwiches, 500);
 		s.click(Sandwiches.similar((float)0.5));
 		testcase.log(Status.PASS, "The User  Click the Sandwiches Item Menu in POS");
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
        String Path = System.getProperty("user.dir")+"/Image/SausageModifier1.png";
        FileHandler.copy(Source, new File(Path));
        ITesseract image = new Tesseract();
        image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
        String imageText=image.doOCR(new File(Path));
        System.out.println(imageText);
        testcase.log(Status.PASS, "The Sausage-Modifier added & Item Button Name is Verified in POS");
        System.out.println("***************************************Scenario 24 PASS: Sausage Modifier added on Sausage Egg & cheese Biscuit****************************");        
        s.wait(VoidItem, 300);
        s.click(VoidItem.similar((float)0.5));
        s.wait(VoidItem, 300);
        s.click(VoidItem.similar((float)0.5));
 	}
 	@Test(priority = 25)
 	public void sikuliTestCase0025() throws FindFailed, IOException, TesseractException, InterruptedException
 	{
 		testcase=extent.createTest("TC_0025:Verify Combo Formation of Sausage Croissant Sandwitch");
 		Thread.sleep(2000);
 		s.wait(Sides, 300);
 		s.click(Sides.similar((float)0.5));
 		testcase.log(Status.PASS, "The User  Click the Sides Item Menu in POS");
 		s.wait(Donuts, 300);
 		s.click(Donuts.similar((float)0.5));
 		testcase.log(Status.PASS, "The User  Click the Donuts Item Menu in POS");
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
        String Path = System.getProperty("user.dir")+"/Image/BrekSandComboFormation.png";
        FileHandler.copy(Source, new File(Path));
        ITesseract image = new Tesseract();
        image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
        String imageText=image.doOCR(new File(Path));
        System.out.println(imageText);
        testcase.log(Status.PASS, "The User ring Three item as Combo-Formantion & Combo-Item-Name as been verified in POS");
        System.out.println("***************************************Scenario 25 PASS: Combo Formation ****************************"); 
 		
 	}
    
    
 	@AfterSuite
 	public void appClose() throws FindFailed
 	{
       
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
	    s.click(EndSession.similar((float)0.6)); 
	    s.wait(File, 300); 
	    s.click(File.similar((float)0.5)); 
        s.click(QuitBomgar.similar((float)0.9)); 
	    s.click(YesBomgar.similar((float)0.9)); 
	    extent.flush();
		
 		
 	}
}

