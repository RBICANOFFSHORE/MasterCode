package com.testcases.framework;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.driver.guice.IDriver;
import com.reuseablecomponents.framework.ReUseComp;
import com.reuseablecomponents.framework.ReUseableMethods;
import com.setup.framework.TestCaseName;
import com.testcases.framework.baseTestCase.BaseTestCase;


//import com.util.framework.AutoTestData;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.ITestContext;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.util.function.Consumer;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
//import static org.openqa.selenium.support.locators.RelativeLocator.*;
@TestCaseName(name = "Scenario For Launching Bomgar")
//@Listeners(com.setup.framework.Customlisteners.class)

public class SikuliTestCase
{
    //WebDriver wd;  
    //ReUseableMethods md;
    @Test(retryAnalyzer = com.util.framework.ReTry.class)
    public static void siKuliTestCase001()
    {
    	
        Screen s = new Screen();
        String MDOriginalBlendPrice="1.92";//CORRECT PRICE
        String ClassicDonutPrice="1.60";//INCORRECT PRICE
        String MapleButterPrice="7.99";//CORRECT PRICE
        try
        {
        	/*s.find("C:/Images For Sikuli/Bomgar.jpg");
        	s.click();
        	Pattern windows = new Pattern("C:/Images For Sikuli/" + "Windows.png");
        	Pattern run = new Pattern("C:/Images For Sikuli/" + "Run.png");
        	Pattern okie = new Pattern("C:/Images For Sikuli/" + "Okie.png");
        	s.rightClick(windows);
        	s.click(run.similar((float)0.6));
        	s.wait((double)2);
        	s.type("chrome");
        	s.click(okie.similar((float)0.6));*/
        	
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
        	Pattern UpdateQST = new Pattern("C:/Images For Sikuli/UpdateQST.png"); 
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
        	Pattern OkSearch = new Pattern("C:/Images For Sikuli/OkSearch.png"); 
        	Pattern GoSearch = new Pattern("C:/Images For Sikuli/GoSearch.png"); 
        	Pattern SearchResult = new Pattern("C:/Images For Sikuli/SearchResult.png");   
        	Pattern SearchResult1 = new Pattern("C:/Images For Sikuli/SearchResult1.png");   
        	Pattern Exit = new Pattern("C:/Images For Sikuli/Exit.png");        	
        	
        	
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
            s.wait(CredQSTold, 300);  
            s.click(CredQSTold.similar((float)0.5)); 
            //s.wait(CredQST, 300);  
            //s.click(CredQST.similar((float)0.6)); 
            s.type(CredQSTold,"78425");
            s.click(OkCred.similar((float)0.6));
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
            s.wait(EatIn, 300);  
            s.click(EatIn.similar((float)0.8)); 
            s.wait(PayNow, 300); 
            s.click(PayNow.similar((float)0.8)); 
            s.wait(NextPay, 300); 
            s.click(NextPay.similar((float)0.8)); 
            s.wait(Functions, 300); 
            s.click(Functions.similar((float)0.8)); 
            s.wait(OrderHistory, 300); 
            s.click(OrderHistory.similar((float)0.8)); 
            s.wait(InputBox, 300); 
            s.click(InputBox.similar((float)0.8)); 
            s.type(InputBox,MDOriginalBlendPrice);
            s.wait(OkSearch, 300); 
            s.click(OkSearch.similar((float)0.8)); 
            s.wait(GoSearch, 300); 
            s.click(GoSearch.similar((float)0.8));
            s.wait(SearchResult, 300); 
            s.doubleClick(SearchResult.similar((float)0.8));
            try
            {
            	s.doubleClick(SearchResult1);  
            	final String out1=("*******************Sceanrio 1 PASS: MD Original Blend price is correct************************");
            	System.out.println(out1);            	
            }
            finally
            {          	
            s.wait(Exit, 300); 
            s.click(Exit.similar((float)0.8)); 
            s.wait(Sides, 300);  
            s.click(Sides.similar((float)0.9)); 
            s.wait(Donuts, 300);  
            s.click(Donuts.similar((float)0.9)); 
            s.wait(ClassicDonut, 300);  
            s.click(ClassicDonut.similar((float)0.8)); 
            s.wait(EatIn, 300);  
            s.click(EatIn.similar((float)0.8)); 
            s.wait(PayNow, 300); 
            s.click(PayNow.similar((float)0.8)); 
            s.wait(NextPay, 300); 
            s.click(NextPay.similar((float)0.8)); 
            s.wait(Functions, 300); 
            s.click(Functions.similar((float)0.8)); 
            s.wait(OrderHistory, 300); 
            s.click(OrderHistory.similar((float)0.8)); 
            s.wait(InputBox, 300); 
            s.click(InputBox.similar((float)0.8)); 
            s.type(InputBox,ClassicDonutPrice);
            s.wait(OkSearch, 300); 
            s.click(OkSearch.similar((float)0.8)); 
            s.wait(GoSearch, 300); 
            s.click(GoSearch.similar((float)0.8));
            s.wait(SearchResult, 300); 
            s.doubleClick(SearchResult.similar((float)0.8));
            try
            {
            	s.doubleClick(SearchResult1);  
            	System.out.println("*******************************Scenario 2 PASS: Classic Donut price is correct*****************************");
            	s.wait(Exit, 300); 
                s.click(Exit.similar((float)0.8));   
                s.wait(Retail, 300);  
                s.click(Retail.similar((float)0.9)); 
                s.wait(TakeHome, 300);  
                s.click(TakeHome.similar((float)0.9)); 
                s.wait(Consumables, 300);  
                s.click(Consumables.similar((float)0.8)); 
                s.wait(MapleButter, 300);  
                s.click(MapleButter.similar((float)0.8));   
                s.wait(EatIn, 300);  
                s.click(EatIn.similar((float)0.8)); 
                s.wait(PayNow, 300); 
                s.click(PayNow.similar((float)0.8)); 
                s.wait(NextPay, 300); 
                s.click(NextPay.similar((float)0.8)); 
                s.wait(Functions, 300); 
                s.click(Functions.similar((float)0.8)); 
                s.wait(OrderHistory, 300); 
                s.click(OrderHistory.similar((float)0.8)); 
                s.wait(InputBox, 300); 
                s.click(InputBox.similar((float)0.8)); 
                s.type(InputBox,MapleButterPrice);
                s.wait(OkSearch, 300); 
                s.click(OkSearch.similar((float)0.8)); 
                s.wait(GoSearch, 300); 
                s.click(GoSearch.similar((float)0.8));
                s.wait(SearchResult, 300); 
                s.doubleClick(SearchResult.similar((float)0.8));
                try
                {
                	s.doubleClick(SearchResult1);  
                	System.out.println("***************************************Scenario 3 PASS: Retail item's price is correct****************************");                	
                	s.wait(Exit, 300); 
                    s.click(Exit.similar((float)0.8)); 
                    s.wait(MinPOS, 300);  
                    s.click(MinPOS.similar((float)0.8));                 
                    s.wait(CloseTerminal, 300);  
                    s.click(CloseTerminal.similar((float)0.6)); 
                    s.click(EndSession.similar((float)0.6)); 
                    s.wait(File, 300); 
                    s.click(File.similar((float)0.5)); 
                    //s.rightClick(BomgarTask.similar((float)0.6)); 
                    s.click(QuitBomgar.similar((float)0.9)); 
                    s.click(YesBomgar.similar((float)0.9)); 
                }
                finally
                {
                	//System.out.println("********************************Scenario 3 FAIL: Retail item's price is incorrect*********************************");
                    s.wait(Exit, 300); 
                    s.click(Exit.similar((float)0.8));            
            	    s.wait(MinPOS, 300);  
            	    s.click(MinPOS.similar((float)0.8)); 
            	    s.wait(CloseTerminal, 300);  
            	    s.click(CloseTerminal.similar((float)0.6)); 
            	    s.click(EndSession.similar((float)0.6)); 
            	    s.wait(File, 300); 
            	    s.click(File.similar((float)0.5)); 
            	    //s.rightClick(BomgarTask.similar((float)0.6)); 
            	    s.click(QuitBomgar.similar((float)0.9)); 
            	    s.click(YesBomgar.similar((float)0.9));        	
                }
            }
            finally
            {
            	final String out2="*************************************Scenario 2 FAIL: Classic Donut price is incorrect*******************************************";
            	System.out.println(out2);           	
            	   s.wait(Exit, 300); 
                   s.click(Exit.similar((float)0.8));                    
            /*
            s.wait(Breakfast, 300);  
            s.click(Breakfast.similar((float)0.8)); 
            s.wait(Sandwiches, 300);  
            s.click(Sandwiches.similar((float)0.8)); 
            s.wait(SausageBiscuit, 300);  
            s.click(SausageBiscuit.similar((float)0.8));*/           
            s.wait(Retail, 300);  
            s.click(Retail.similar((float)0.9)); 
            s.wait(TakeHome, 300);  
            s.click(TakeHome.similar((float)0.9)); 
            s.wait(Consumables, 300);  
            s.click(Consumables.similar((float)0.8)); 
            s.wait(MapleButter, 300);  
            s.click(MapleButter.similar((float)0.8)); 
            s.wait(EatIn, 300);  
            s.click(EatIn.similar((float)0.8)); 
            s.wait(PayNow, 300); 
            s.click(PayNow.similar((float)0.8)); 
            s.wait(NextPay, 300); 
            s.click(NextPay.similar((float)0.8)); 
            s.wait(Functions, 300); 
            s.click(Functions.similar((float)0.8)); 
            s.wait(OrderHistory, 300); 
            s.click(OrderHistory.similar((float)0.8)); 
            s.wait(InputBox, 300); 
            s.click(InputBox.similar((float)0.8)); 
            s.type(InputBox,MapleButterPrice);
            s.wait(OkSearch, 300); 
            s.click(OkSearch.similar((float)0.8)); 
            s.wait(GoSearch, 300); 
            s.click(GoSearch.similar((float)0.8));
            s.wait(SearchResult, 300); 
            s.doubleClick(SearchResult.similar((float)0.8));
            try
            {
            	s.doubleClick(SearchResult1);  
            	final String out3="*************************Scenario 3 PASS: Retail item's price is correct*******************************";
            	System.out.println(out3);
            	File file1=new File("out.txt");
            	FileWriter fw=new FileWriter(file1);
            	PrintWriter pw=new PrintWriter(fw);
            	pw.println("PASS: MD Original Blend price is correct");
            	pw.println("FAIL: Classic Donut price is incorrect");
            	pw.println("PASS: Retail item's price is correct");
            	pw.close();
            	s.wait(Exit, 300); 
                s.click(Exit.similar((float)0.8)); 
                s.wait(MinPOS, 300);  
                s.click(MinPOS.similar((float)0.8));                 
                s.wait(CloseTerminal, 300);  
                s.click(CloseTerminal.similar((float)0.6)); 
                s.click(EndSession.similar((float)0.6)); 
                s.wait(File, 300); 
                s.click(File.similar((float)0.5)); 
                //s.rightClick(BomgarTask.similar((float)0.6)); 
                s.click(QuitBomgar.similar((float)0.9)); 
                s.click(YesBomgar.similar((float)0.9)); 
                
            }
            finally
            {
                s.wait(Exit, 300); 
                s.click(Exit.similar((float)0.8));            
        	    s.wait(MinPOS, 300);  
        	    s.click(MinPOS.similar((float)0.8)); 
        	    s.wait(CloseTerminal, 300);  
        	    s.click(CloseTerminal.similar((float)0.6)); 
        	    s.click(EndSession.similar((float)0.6)); 
        	    s.wait(File, 300); 
        	    s.click(File.similar((float)0.5)); 
        	    //s.rightClick(BomgarTask.similar((float)0.6)); 
        	    s.click(QuitBomgar.similar((float)0.9)); 
        	    s.click(YesBomgar.similar((float)0.9));   
        	    
            }
            }
           
        }
        }
        catch (Exception ex){

        }

    }

}
