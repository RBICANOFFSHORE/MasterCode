package cognizant.framework.pageobject;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//import excel.Read_Data;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
//Frrom here editingy


public class BeverageItems extends Read_Data{
	
	ExtentReports extent;
	ExtentSparkReporter html;
	ExtentTest testcase;
	
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
  	Pattern SmallSpecialtyTea =new Pattern("C:\\Images For Sikuli\\SmallSpecialtyTea.png");
  	Pattern MediumSpecialtyTea =new Pattern("C:\\Images For Sikuli\\MediumSpecialtyTea.png");
  	
  	Pattern SteepedTea = new Pattern("C:\\Images For Sikuli\\SteepedTea.png");
	Pattern SteepedTeaSmall = new Pattern("C:\\\\Images For Sikuli\\\\SteepedTeaSmall.png");
	Pattern SteepedTeaMedium = new Pattern("C:\\\\Images For Sikuli\\\\SteepedTeaMedium.png");
	Pattern SteepedTeaLarge = new Pattern("C:\\\\Images For Sikuli\\\\SteepedTeaLarge.png");
	Pattern SteepedTeaExtraLarge = new Pattern("C:\\\\Images For Sikuli\\\\SteepedTeaExtraLarge.png");
	Pattern SteepedTeaSmallRefill = new  Pattern("C:\\Images For Sikuli\\SteepedTeaSmallRefill.png");
	Pattern SteepedTeaMediumRefill = new  Pattern("C:\\Images For Sikuli\\SteepedTeaMediumRefill.png");
	Pattern SteepedTeaLargeRefill = new  Pattern("C:\\Images For Sikuli\\SteepedTeaLargeRefill.png");
	Pattern SteepedTeaExtraLargeRefill = new  Pattern("C:\\Images For Sikuli\\SteepedTeaExtraLargeRefill.png");
	Pattern Latte = new  Pattern("C:\\Images For Sikuli\\Latte.png");
	Pattern SmallLatte = new  Pattern("C:\\Images For Sikuli\\SmallLatte.png");
	Pattern SmallRefillLatte =new Pattern("C:\\Images For Sikuli\\SmallRefillLatte.png");
	 
	Pattern MediumLatte =new Pattern("C:\\Images For Sikuli\\MediumLatte.png");
  	Pattern SmallDecaf = new Pattern("C:\\Images For Sikuli\\SmallDecaf.png");
  	Pattern MediumDecaf = new Pattern("C:\\Images For Sikuli\\MediumDecaf.png");
  	Pattern LargeDecaf = new Pattern("C:\\Images For Sikuli\\LargeDecaf.png");
  	Pattern ExtraLargeDecaf = new Pattern("C:\\Images For Sikuli\\ExtraLargeDecaf.png");
  	Pattern SmallDecafRefil = new Pattern("C:\\Images For Sikuli\\SmallDecafRefil.png");
  	Pattern MediumDecafRefil = new Pattern("C:\\Images For Sikuli\\MediumDecafRefil.png");
  	Pattern LargeDecafRefil = new Pattern("C:\\Images For Sikuli\\LargeDecafRefil.png");
  	Pattern LargeLatte = new Pattern("C:\\Images For Sikuli\\LargeLatte.png");
  	//Pattern ExtraLargeDecafRefil = new Pattern("C:\\Images For Sikuli\\ExtraLargeDecafRefil.png");
  	Pattern RefillDecafExtraLarge =new Pattern("C:\\Images For Sikuli\\RefillDecafExtraLarge.png");
  	
  	Pattern IcedBeverages= new Pattern("C:\\Images For Sikuli\\IcedBeverages.png");
 	Pattern IcedCoffee= new Pattern("C:\\Images For Sikuli\\IcedCoffee.png");
 	Pattern OrgIcedCoffee= new Pattern("C:\\Images For Sikuli\\OrgIcedCoffe.png");
  	Pattern MDIcedCoffee= new Pattern("C:\\Images For Sikuli\\MDIcedCoffee.png");
  	//adding new Iced Capp
  	Pattern BeveragesButton=new Pattern("C:\\Images For Sikuli\\BeveragesButton.png");
  	Pattern IcedCappuccino=new Pattern("C:\\Images For Sikuli\\IcedCappuccino.png");
  Pattern IcedCappuccinoLight=new Pattern("C:\\Images For Sikuli\\IcedCappuccinoLight.png");
  Pattern SmallIcedCappuccino=new Pattern("C:\\Images For Sikuli\\SmallIcedCappuccino.png");
  Pattern MediumIcedCappuccino=new Pattern("C:\\Images For Sikuli\\MediumIcedCappuccino.png");
  Pattern LargeIcedCappuccino=new Pattern("C:\\Images For Sikuli\\LargeIcedCappuccino.png");
  Pattern SmallRefilIcedCappuccino=new Pattern("C:\\Images For Sikuli\\SmallRefilIcedCappuccino.png");
  Pattern MediumRefilIcedCappuccino=new Pattern("C:\\Images For Sikuli\\MediumRefilIcedCappuccino.png");
  Pattern LargeRefilIcedCappuccino=new Pattern("C:\\Images For Sikuli\\LargeRefilIcedCappuccino.png");
  Pattern SmallIcedCappuccinoLight=new Pattern("C:\\Images For Sikuli\\SmallIcedCappuccinoLight.png");
  Pattern MediumIcedCappuccinoLight=new Pattern("C:\\Images For Sikuli\\MediumIcedCappuccinoLight.png");
  Pattern LargeIcedCappuccinoLight=new Pattern("C:\\Images For Sikuli\\LargeIcedCappuccinoLight.png");
  Pattern SmallRefilIcedCappuccinoLight=new Pattern("C:\\Images For Sikuli\\SmallRefilIcedCappuccinoLight.png");
  Pattern MediumRefilIcedCappuccinoLight=new Pattern("C:\\Images For Sikuli\\MediumRefilIcedCappuccinoLight.png");
  Pattern LargeRefilIcedCappuccinoLight=new Pattern("C:\\Images For Sikuli\\LargeRefilIcedCappuccinoLight.png");
  Pattern SmallMochaIcedCappuccino=new Pattern("C:\\Images For Sikuli\\SmallMochaIcedCappuccino.png");
  Pattern MediumMochaIcedCappuccino=new Pattern("C:\\Images For Sikuli\\MediumMochaIcedCappuccino.png");
  Pattern LargeMochaIcedCappuccino=new Pattern("C:\\Images For Sikuli\\LargeMochaIcedCappuccino.png");
  Pattern SmallRefilMochaIcedCappuccino=new Pattern("C:\\Images For Sikuli\\SmallRefilMochaIcedCappuccino.png");
  Pattern MediumRefilMochaIcedCappuccino=new Pattern("C:\\Images For Sikuli\\MediumRefilMochaIcedCappuccino.png");
  Pattern LargeRefilMochaIcedCappuccino=new Pattern("C:\\Images For Sikuli\\LargeRefilMochaIcedCappuccino.png");
  Pattern FlavouredIcedCappuccino=new Pattern("C:\\Images For Sikuli\\FlavouredIcedCappuccino.png");
  Pattern  MochaIcedCappuccino=new Pattern("C:\\Images For Sikuli\\MochaIcedCappuccino.png");
  Pattern Americano=new Pattern("C:\\Images For Sikuli\\AmericanoButton.png");
  Pattern SmallAmericano=new Pattern("C:\\Images For Sikuli\\SmallAmericano.png");
  Pattern MediumAmericano=new Pattern("C:\\Images For Sikuli\\MediumAmericano.png");
  Pattern LargeAmericano=new Pattern("C:\\Images For Sikuli\\LargeAmericano.png");
  Pattern RefillSmallAmericano=new Pattern("C:\\Images For Sikuli\\RefillSmallAmericano.png");
  Pattern RefillMediumAmericano=new Pattern("C:\\Images For Sikuli\\RefillMediumAmericano.png");
  Pattern RefillLargeAmericano=new Pattern("C:\\Images For Sikuli\\RefillLargeAmericano.png");
  Pattern RedeyeIcedCapp=new Pattern("C:\\Images For Sikuli\\RedeyeIcedCappuccino.png");
  Pattern SmallRedeyeIcedCapp=new Pattern("C:\\Images For Sikuli\\SmallRedeyeIcedCappuccino.png");
  Pattern MediumRedeyeIcedCapp=new Pattern("C:\\Images For Sikuli\\MediumRedeyeIcedCappuccino.png");
  Pattern LargeRedeyeIcedCapp=new Pattern("C:\\Images For Sikuli\\LargeRedeyeIcedCappuccino.png");
  Pattern SmallRefillRedeyeIcedCapp=new Pattern("C:\\Images For Sikuli\\SmallRefillRedeyeIcedCappuccino.png");
  Pattern MediumRefillRedeyeIcedCapp=new Pattern("C:\\Images For Sikuli\\MediumRefillRedeyeIcedCappuccino.png");
  Pattern LargeRefillRedeyeIcedCapp=new Pattern("C:\\Images For Sikuli\\LargeRefillRedeyeIcedCappuccino.png");
  Pattern TeaLatteButton = new Pattern("C:\\Images For Sikuli\\TeaLatteButton.png");
  Pattern TeaLatteButton2 = new Pattern("C:\\Images For Sikuli\\TeaLatteButton2.png");
  Pattern SMTeaLatte = new Pattern("C:\\Images For Sikuli\\SMTeaLatte.png");
  Pattern MDTeaLatte = new Pattern("C:\\Images For Sikuli\\MDTeaLatte.png");
  Pattern LGTeaLatte = new Pattern("C:\\Images For Sikuli\\LGTeaLatte.png");
  Pattern RSTeaLatte = new Pattern("C:\\Images For Sikuli\\RSTeaLatte.png");
  Pattern RMTeaLatte = new Pattern("C:\\Images For Sikuli\\RMTeaLatte.png");
  Pattern RLTeaLatte = new Pattern("C:\\Images For Sikuli\\RLTeaLatte.png");
 // Pattern LondonFogButton2 = new Pattern("C:\\Images For Sikuli\\LondonFogButton2.png");
  Pattern LondonFogButton=new Pattern("C:\\Images For Sikuli\\LondonFogButton.png");
  Pattern SMLondonFog = new Pattern("C:\\Images For Sikuli\\SMLondonFog.png");
  Pattern MDLondonFog = new Pattern("C:\\Images For Sikuli\\MDLondonFog.png");
  Pattern LGLondonFog = new Pattern("C:\\Images For Sikuli\\LGLondonFog.png");
  Pattern RSLondonFog = new Pattern("C:\\Images For Sikuli\\RSLondonFog.png");
  Pattern RMLondonFog = new Pattern("C:\\Images For Sikuli\\RMLondonFog.png");
  Pattern RLLondonFog = new Pattern("C:\\Images For Sikuli\\RLLondonFog.png");
//up to this 
  	
  	
  	Pattern Beverages1 = new Pattern("C:\\Images For Sikuli\\Beverages1.png");
  	Pattern HotBeverages = new Pattern("C:\\Images For Sikuli\\HotBeverages.png");
  	Pattern SpecialtyTea = new Pattern("C:\\Images For Sikuli\\SpecialtyTea.png");
  	Pattern MDTea = new Pattern("C:\\Images For Sikuli\\MDTea.png");
  	Pattern TeaFlav = new Pattern("C:\\Images For Sikuli\\TeaFlav.png");
  	Pattern AppleCinnamon = new Pattern("C:\\Images For Sikuli\\AppleCinnamon.png");
  	Pattern TeaFlav1 = new Pattern("C:\\Images For Sikuli\\TeaFlav1.png");
  	Pattern Picture2 = new Pattern("C:\\Images For Sikuli\\Picture2.png");
  	Pattern VoidItem = new Pattern("C:\\Images For Sikuli\\VoidItem.png");
  	Pattern FlavIcedLatte = new Pattern("C:\\Images For Sikuli\\FlavIcedLatte.png");
  	Pattern VanillaIcedLatte = new Pattern("C:\\Images For Sikuli\\VanillaIcedLatte.png");
  	Pattern VanillaLatteLarge = new Pattern("C:\\Images For Sikuli\\VanillaLatteLarge.png");
  	
  	Pattern Promo = new Pattern("C:\\Images For Sikuli\\Promo.png");
  	Pattern ColdBrew = new Pattern("C:\\Images For Sikuli\\ColdBrew.png");
  	Pattern VanillaCreamColdBrew = new Pattern("C:\\Images For Sikuli\\VanillaCreamColdBrew.png");
  	Pattern VanillaCreamColdBrewSmall = new Pattern("C:\\Images For Sikuli\\VanillaCreamColdBrewSmall.png");
  	
	Pattern ColdBeverages = new Pattern("C:\\Images For Sikuli\\ColdBeverages.png");
  	Pattern BottleWater = new Pattern("C:\\Images For Sikuli\\BottleWater.png");
	Pattern SMCoffee =new Pattern("C:/Images For Sikuli/SMCoffee.png");
  	Pattern MDCoffee = new Pattern("C:/Images For Sikuli/MDCoffee.png");
  	Pattern LGCoffee = new Pattern("C:/Images For Sikuli/LGCoffee.png");
  	Pattern EatIn = new Pattern("C:/Images For Sikuli/EatIn.png"); 
  	
  	
    Screen s;
	public BeverageItems(Screen s) {
		// TODO Auto-generated constructor stub
		this.s =s;
	}
	@Test(priority = 4)
	public void siKuliTestCase004(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	  {	 
		 
		testcase=extent.createTest("TC_004:Verify SMOriginalBlendPrice Price");
		BeverageItems b = new BeverageItems(s);
		 
		 Thread.sleep(2000);
		 s.wait(SMCoffee, 600);  
	     s.click(SMCoffee.similar((float)0.5));
	     testcase.log(Status.PASS, "User able to click on SMCoffee");
	     s.wait(EatIn, 300);  
	     s.click(EatIn.similar((float)0.8));
	     Thread.sleep(4000);
		  Rectangle rectangle=new Rectangle();
		  rectangle.setBounds(420,200,60,30);
		  String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SMOriginalBlendPrice");
	      ITesseract image = new Tesseract();
	      image.setDatapath(".\\tessdata");
	      String imageText=image.doOCR(new File(imagePath));
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
	    	  System.out.println("***********Scenario04 PASS: Correct ala carte price of SM Original Blend Price ***********");
	      }else{
	    	  testcase.log(Status.FAIL," Incorrect ala carte price of SM Original Blend Price" );
	    	  System.out.println("***********Scenario04 FAIL: Incorrect ala carte price of SM Original Blend Price ***********");
	    	  
	      }
	      s.wait(VoidItem, 300);
	      s.click(VoidItem.similar((float)0.5));
	  }
	@Test(priority = 5)
	  public void siKuliTestCase005(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	  {	 
		testcase=extent.createTest("TC_005:Verify MDCoffee Price");
		BeverageItems b = new BeverageItems(s);
		 
		 
		 Thread.sleep(2000);
		 s.wait(MDCoffee, 300);  
	     s.click(MDCoffee.similar((float)0.5)); 
	     testcase.log(Status.PASS, "User able to click on MDCoffee");
	     s.wait(EatIn, 300);  
	     s.click(EatIn.similar((float)0.8));
	     
	     Thread.sleep(4000);
		  Rectangle rectangle=new Rectangle();
		  rectangle.setBounds(420,200,60,30);
		  String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MDOriginalBlendPrice");
		//Added by Bishal
		  rectangle.setBounds(210,200,275,30);
          String  imagePath1=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MDOriginalBlendPricewithname");
	      ITesseract image = new Tesseract();
	      image.setDatapath(".\\tessdata");
	      String imageText=image.doOCR(new File(imagePath));
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
	    	  testcase.log(Status.PASS," Correct ala carte price of MD Original Blend Price" );
	    	  System.out.println("***********Scenario05 PASS: Correct ala carte price of Md Original Blend Price ***********");
	      }else{
	    	  testcase.log(Status.FAIL," Incorrect ala carte price of MD Original Blend Price" );
	    	  testcase.addScreenCaptureFromPath(imagePath1);
	    	  System.out.println("***********Scenario05 FAIL: Incorrect ala carte price of Md Original Blend Price ***********");
	    	  
	      }
	      s.wait(VoidItem, 300);
	      s.click(VoidItem.similar((float)0.5));
	  }
	@Test(priority = 6)
	  public void siKuliTestCase006(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	  {	 
		testcase=extent.createTest("TC_006:Verify LGCoffee Price");
		BeverageItems b = new BeverageItems(s);
		 
		 
		 Thread.sleep(2000); 
		 s.wait(LGCoffee, 300);  
	     s.click(LGCoffee.similar((float)0.5)); 
	     testcase.log(Status.PASS, "User able to click on LGCoffee");
	     s.wait(EatIn, 300);  
	     s.click(EatIn.similar((float)0.8));
	     testcase.log(Status.PASS, "User able to click on EatIn");
	     Thread.sleep(4000);
		  Rectangle rectangle=new Rectangle();
		  rectangle.setBounds(420,200,60,30);
		  String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LGOriginalBlendPrice");
	      ITesseract image = new Tesseract();
	      image.setDatapath(".\\tessdata");
	      String imageText=image.doOCR(new File(imagePath));
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
	    	  testcase.log(Status.PASS," Correct ala carte price of LG Original Blend Price" );
	    	  System.out.println("***********Scenario06 PASS: Correct ala carte price of Large Original Blend Price ***********");
	      }else{
	    	  testcase.log(Status.FAIL," InCorrect ala carte price of LG Original Blend Price" );
	    	  System.out.println("***********Scenario06 FAIL: Incorrect ala carte price of Large Original Blend Price ***********");
	    	  
	      }
	      s.wait(VoidItem, 300);
	      s.click(VoidItem.similar((float)0.5));
	  }
	
	@Test(priority = 7)
	  public void siKuliTestCase007(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	  {	 
		testcase=extent.createTest("TC_007:Verify RefillSmallOriginalBlend Price");
		BeverageItems b = new BeverageItems(s);
		 
		 
		 Thread.sleep(2000);
		
		 s.wait(OriginalBlend,300);
		 s.click(OriginalBlend.similar((float)0.5));
		 s.wait(RefillSmallOriginalBlend,300);
		 s.click(RefillSmallOriginalBlend.similar((float)0.5)); 
		 testcase.log(Status.PASS, "User able to click on RefillSmallOriginalBlend");
	     s.wait(EatIn, 300);  
	     s.click(EatIn.similar((float)0.8));
	     testcase.log(Status.PASS, "User able to click on EatIn");
	     Thread.sleep(4000);
		  Rectangle rectangle=new Rectangle();
		  rectangle.setBounds(420,200,60,30);
		  String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RFSMOriginalBlendPrice");
	      ITesseract image = new Tesseract();
	      image.setDatapath(".\\tessdata");
	      String imageText=image.doOCR(new File(imagePath));
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
	    	  System.out.println("***********Scenario07 PASS: Correct ala carte price of Small Refill Original Blend Price ***********");
	      }else{
	    	  testcase.log(Status.FAIL," Incorrect ala carte price of Small Refill Original Blend Price" );
	    	  System.out.println("***********Scenario07 FAIL: Incorrect ala carte price of Small Refill Original Blend Price ***********");
	    	  
	      }
	      s.wait(VoidItem, 300);
	      s.click(VoidItem.similar((float)0.5));
	  }
	@Test(priority = 8)
	  public void siKuliTestCase008(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	  {	 
		testcase=extent.createTest("TC_008:Verify RefillMediumOriginalBlend Price"); 
		BeverageItems b = new BeverageItems(s);
		 
		 
		 Thread.sleep(2000);
		 
		 s.wait(OriginalBlend,300);
		 s.click(OriginalBlend.similar((float)0.5));
		 s.wait(RefillMediumOriginalBlend,300);
		 s.click(RefillMediumOriginalBlend.similar((float)0.5)); 
		 testcase.log(Status.PASS, "User able to click on RefillMediumOriginalBlend");
	     s.wait(EatIn, 300);  
	     s.click(EatIn.similar((float)0.8));
	     testcase.log(Status.PASS, "User able to click on EatIn");
	     Thread.sleep(4000);
		  Rectangle rectangle=new Rectangle();
		  rectangle.setBounds(420,200,60,30);
		  String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RFMDOriginalBlendPrice");
	      ITesseract image = new Tesseract();
	      image.setDatapath(".\\tessdata");
	      String imageText=image.doOCR(new File(imagePath));
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
	    	  System.out.println("***********Scenario08 PASS: Correct ala carte price of Medium Refill Original Blend Price ***********");
	      }else{
	    	  testcase.log(Status.FAIL," Incorrect ala carte price of Medium Refill Original Blend Price" );
	    	  System.out.println("***********Scenario08 FAIL: Incorrect ala carte price of Medium Refill Original Blend Price ***********");
	    	  
	      }
	      s.wait(VoidItem, 300);
	      s.click(VoidItem.similar((float)0.5));
	  }
	
	@Test(priority = 9)
	  public void siKuliTestCase009(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	  {	 
		testcase=extent.createTest("TC_009:Verify RefillLargeOriginalBlend Price");  
		BeverageItems b = new BeverageItems(s);
		 
		 
		 Thread.sleep(2000);
		 
		 s.wait(OriginalBlend,300);
		 s.click(OriginalBlend.similar((float)0.5));
		 s.wait(RefillLargeOriginalBlend,300);
		 s.click(RefillLargeOriginalBlend.similar((float)0.5)); 
		 testcase.log(Status.PASS, "User able to click on RefillLargeOriginalBlend");
	     s.wait(EatIn, 300);  
	     s.click(EatIn.similar((float)0.8));
	     testcase.log(Status.PASS, "User able to click on EatIn");
	     Thread.sleep(4000);
		  Rectangle rectangle=new Rectangle();
		  rectangle.setBounds(420,200,60,30);
		  String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RFLGOriginalBlendPrice");
	      ITesseract image = new Tesseract();
	      image.setDatapath(".\\tessdata");
	      String imageText=image.doOCR(new File(imagePath));
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
	    	  System.out.println("***********Scenario09 PASS: Correct ala carte price of Large Refill Original Blend Price ***********");
	      }else{
	    	  testcase.log(Status.FAIL," Incorrect ala carte price of Large Refill Original Blend Price" );
	    	  System.out.println("***********Scenario09 FAIL: Incorrect ala carte price of Large Refill Original Blend Price ***********");
	    	  
	      }
	      s.wait(VoidItem, 300);
	      s.click(VoidItem.similar((float)0.5));
	  }
	

	@Test(priority = 10)
	  public void siKuliTestCase010(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	  {	 
		testcase=extent.createTest("TC_010:Verify SmallDarkRoast Price");  
		BeverageItems b = new BeverageItems(s);
		 
		 
		 
		 Thread.sleep(2000);
		 
		 s.wait(DarkRoast,300);
		 s.click(DarkRoast.similar((float)0.5));
		 s.wait(SmallDarkRoast,300);
		 s.click(SmallDarkRoast.similar((float)0.5)); 
		 testcase.log(Status.PASS, "User able to click on SmallDarkRoast");
	     s.wait(EatIn, 300);  
	     s.click(EatIn.similar((float)0.8));
	     testcase.log(Status.PASS, "User able to click on EatIn");
	     Thread.sleep(4000);
		  Rectangle rectangle=new Rectangle();
		  rectangle.setBounds(420,200,60,30);
		  String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SMDarkRoastPrice");
	      ITesseract image = new Tesseract();
	      image.setDatapath(".\\tessdata");
	      String imageText=image.doOCR(new File(imagePath));
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
	    	  System.out.println("***********Scenario010 PASS: Correct ala carte price of Small Dark Roast Coffee Price ***********");
	      }else{
	    	  testcase.log(Status.FAIL," Incorrect ala carte price of Small Dark Roast Coffee Price" );
	    	  System.out.println("***********Scenario010 FAIL: Incorrect ala carte price of Small Dark Roast Coffee Price ***********");
	    	  
	      }
	      s.wait(VoidItem, 300);
	      s.click(VoidItem.similar((float)0.5));
	  }
	@Test(priority = 11)
	  public void siKuliTestCase011(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	  {	 
		testcase=extent.createTest("TC_011:Verify MediumDarkRoast Price");   
		BeverageItems b = new BeverageItems(s);
		 
		 
		 
		 Thread.sleep(2000);
		 
		 s.wait(DarkRoast,300);
		 s.click(DarkRoast.similar((float)0.5));
		 s.wait(MediumDarkRoast,300);
		 s.click(MediumDarkRoast.similar((float)0.5)); 
		 testcase.log(Status.PASS, "User able to click on MediumDarkRoast");
	     s.wait(EatIn, 300);  
	     s.click(EatIn.similar((float)0.8));
	     testcase.log(Status.PASS, "User able to click on EatIn");
	     Thread.sleep(4000);
		  Rectangle rectangle=new Rectangle();
		  rectangle.setBounds(420,200,60,30);
		  String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MDDarkRoastPrice");
	      ITesseract image = new Tesseract();
	      image.setDatapath(".\\tessdata");
	      String imageText=image.doOCR(new File(imagePath));
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
	    	  System.out.println("***********Scenario011 PASS: Correct ala carte price of Medium Dark Roast Coffee Price ***********");
	      }else{
	    	  testcase.log(Status.FAIL," InCorrect ala carte price of Medium Dark Roast Coffee Price" );
	    	  System.out.println("***********Scenario011 FAIL: Incorrect ala carte price of Medium Dark Roast Coffee Price ***********");
	    	  
	      }
	      s.wait(VoidItem, 300);
	      s.click(VoidItem.similar((float)0.5));
	  }
	@Test(priority = 12)
	  public void siKuliTestCase012(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	  {	 
		testcase=extent.createTest("TC_012:Verify LargeDarkRoast Price");   
		BeverageItems b = new BeverageItems(s);
		 
		
		 
		 Thread.sleep(2000);
		 
		 s.wait(DarkRoast,300);
		 s.click(DarkRoast.similar((float)0.5));
		 s.wait(LargeDarkRoast,300);
		 s.click(LargeDarkRoast.similar((float)0.5)); 
		 testcase.log(Status.PASS, "User able to click on LargeDarkRoast");
	     s.wait(EatIn, 300);  
	     s.click(EatIn.similar((float)0.8));
	     testcase.log(Status.PASS, "User able to click on EatIn");
	     Thread.sleep(4000);
		  Rectangle rectangle=new Rectangle();
		  rectangle.setBounds(420,200,60,30);
		  String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LGDarkRoastPrice");
	      ITesseract image = new Tesseract();
	      image.setDatapath(".\\tessdata");
	      String imageText=image.doOCR(new File(imagePath));
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
	    	  System.out.println("***********Scenario12 PASS: Correct ala carte price of Large Dark Roast Coffee Price ***********");
	      }else{
	    	  testcase.log(Status.FAIL," Incorrect ala carte price of Large Dark Roast Coffee Price" );
	    	  System.out.println("***********Scenario12 FAIL: Incorrect ala carte price of Large Dark Roast Coffee Price ***********");
	    	  
	      }
	      s.wait(VoidItem, 300);
	      s.click(VoidItem.similar((float)0.5));
	      
	  }
	
	@Test(priority = 13)
	  public void siKuliTestCase013(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	  {	 
		 
		testcase=extent.createTest("TC_013:Verify SmallRefillDarkRoast Price");    
		BeverageItems b = new BeverageItems(s);
		 
		 
		 Thread.sleep(2000);
		 
		 s.wait(DarkRoast,300);
		 s.click(DarkRoast.similar((float)0.5));
		 s.wait(SmallRefillDarkRoast,300);
		 s.click(SmallRefillDarkRoast.similar((float)0.5)); 
		 testcase.log(Status.PASS, "User able to click on SmallRefillDarkRoast");
	     s.click(EatIn.similar((float)0.8));
	     testcase.log(Status.PASS, "User able to click on EatIn");
	     Thread.sleep(4000);
		  Rectangle rectangle=new Rectangle();
		  rectangle.setBounds(420,200,60,30);
		  String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RFSMDarkRoastPrice");
	      ITesseract image = new Tesseract();
	      image.setDatapath(".\\tessdata");
	      String imageText=image.doOCR(new File(imagePath));
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
	    	  System.out.println("***********Scenario13 PASS: Correct ala carte price of Small Refill Dark Roast Coffee Price ***********");
	      }else{
	    	  testcase.log(Status.FAIL," Incorrect ala carte price of Small Refill Dark Roast Coffee Price" );
	    	  System.out.println("***********Scenario13 FAIL: Incorrect ala carte price of Small Refill Dark Roast Coffee Price ***********");
	    	  
	      }
	      s.wait(VoidItem, 300);
	      s.click(VoidItem.similar((float)0.5));
	  }
	@Test(priority = 14)
	  public void siKuliTestCase014(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	  {	 
		testcase=extent.createTest("TC_014:Verify SmallSpecialtyTea Price");    
		BeverageItems b = new BeverageItems(s);
		 
		 
		 
		 Thread.sleep(2000); 
		 s.wait(SpecialtyTea, 300);  
	     s.click(SpecialtyTea.similar((float)0.5)); 
	     
	     s.wait(SmallSpecialtyTea, 300);  
	     s.click(SmallSpecialtyTea.similar((float)0.5));
	     testcase.log(Status.PASS, "User able to click on SmallSpecialtyTea");
	     s.wait(EatIn, 300);  
	     s.click(EatIn.similar((float)0.8));
	     testcase.log(Status.PASS, "User able to click on EatIn");
	     Thread.sleep(4000);
		  Rectangle rectangle=new Rectangle();
		  rectangle.setBounds(420,200,60,30);
		  String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SMSpecialityPrice");
	      ITesseract image = new Tesseract();
	      image.setDatapath(".\\tessdata");
	      String imageText=image.doOCR(new File(imagePath));
	      System.out.println(imageText);
	      System.out.println(b.readSmallSpecialityTeaPrice());
	      String a1=null;
	      String a2=null;
	      
	      String replaceAll = imageText.replaceAll("\\s","");
	       a1 = replaceAll;
  	   a2 = b.readSmallSpecialityTeaPrice();
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
	    	  testcase.log(Status.PASS," Correct ala carte price of SM Speciality Tea Price" );
	    	  System.out.println("***********Scenario06 PASS: Correct ala carte price of SM Speciality Tea Price ***********");
	      }else{
	    	  testcase.log(Status.FAIL," Incorrect ala carte price of SM Speciality Tea Price" );
	    	  System.out.println("***********Scenario06 FAIL: Incorrect ala carte price of SM Speciality Tea Price ***********");
	    	  
	      }
	      s.wait(VoidItem, 300);
	      s.click(VoidItem.similar((float)0.5));
	  }
	@Test(priority =15)
	  public void siKuliTestCase015(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	  {	 
		testcase=extent.createTest("TC_015:Verify MediumSpecialtyTea Price"); 
		BeverageItems b = new BeverageItems(s);
		 
		 
		 
		 Thread.sleep(2000); 
		 s.wait(SpecialtyTea, 300);  
	     s.click(SpecialtyTea.similar((float)0.5)); 
	     
	     s.wait(MediumSpecialtyTea, 300);  
	     s.click(MediumSpecialtyTea.similar((float)0.5));
	     testcase.log(Status.PASS, "User able to click on MediumSpecialtyTea");
	     s.wait(EatIn, 300);  
	     s.click(EatIn.similar((float)0.8));
	     testcase.log(Status.PASS, "User able to click on EatIn");
	     Thread.sleep(4000);
		  Rectangle rectangle=new Rectangle();
		  rectangle.setBounds(420,200,60,30);
		  String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MDSpecialityPrice");
	      ITesseract image = new Tesseract();
	      image.setDatapath(".\\tessdata");
	      String imageText=image.doOCR(new File(imagePath));
	      System.out.println(imageText);
	      System.out.println(b.readMediumSpecialityTeaPrice());
	      String a1=null;
	      String a2=null;
	      
	      String replaceAll = imageText.replaceAll("\\s","");
	       a1 = replaceAll;
  	   a2 = b.readMediumSpecialityTeaPrice();
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
	    	  testcase.log(Status.PASS," Correct ala carte price of MD Speciality Tea Price" );
	    	  System.out.println("***********Scenario015 PASS: Correct ala carte price of MD Speciality Tea Price ***********");
	      }else{
	    	  testcase.log(Status.FAIL," Incorrect ala carte price of MD Speciality Tea Price" );
	    	  System.out.println("***********Scenario015 FAIL: Incorrect ala carte price of MD Speciality Tea Price ***********");
	    	  
	      }
	      s.wait(VoidItem, 300);
	      s.click(VoidItem.similar((float)0.5));
	  }
	@Test(priority = 16)
	public void sikuliTestCase016(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
	{
		testcase=extent.createTest("TC_016:Verify SteepedTeaSmall Price");
		BeverageItems b = new BeverageItems(s);
		 
		 
		 
		 Thread.sleep(2000);
		 s.wait(SteepedTea, 300);
		 s.click(SteepedTea.similar((float)0.5));
		 
		 s.wait(SteepedTeaSmall, 300);
		 s.click(SteepedTeaSmall.similar((float)0.5));
		 testcase.log(Status.PASS, "User able to click on SteepedTeaSmall");
		 s.wait(EatIn, 300);  
		 s.click(EatIn.similar((float)0.8));
		 testcase.log(Status.PASS, "User able to click on EatIn");
		 Thread.sleep(4000);
		  Rectangle rectangle=new Rectangle();
		  rectangle.setBounds(420,200,60,30);
		  String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SMSteepedTeaPrice");
		 ITesseract image = new Tesseract();
		 image.setDatapath(".\\tessdata");
		 String imageText=image.doOCR(new File(imagePath));
		 System.out.println(imageText);
		 System.out.println(b.readSteepedTeaSmallPrice());
		 String a1=null;
		 String a2=null;
		 
		 String replaceAll = imageText.replaceAll("\\s","");
		 a1 = replaceAll;
		 a2 = b.readSteepedTeaSmallPrice();
		 System.out.println(a1);
		 System.out.println(a2);
		 
		 if(a1.equals(a2)){
			 testcase.log(Status.PASS," Correct ala carte price of SM Steeped Tea Price" );
		 System.out.println("***********Scenario016 PASS: Correct ala carte price of SM Steeped Tea Price ***********");
		}
		 else
		 {
			 testcase.log(Status.FAIL," Incorrect ala carte price of SM Steeped Tea Price" );
		 System.out.println("***********Scenario016 FAIL: Incorrect ala carte price of SM Steeped Tea Price ***********");
		}
		 s.wait(VoidItem, 300);
		 s.click(VoidItem.similar((float)0.5));
	 }
	@Test(priority = 17)
	public void sikuliTestCase017(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
	{
		testcase=extent.createTest("TC_017:Verify SteepedTeaMedium Price"); 
		BeverageItems b = new BeverageItems(s);
		 
		 
		 
		 Thread.sleep(2000);
		 s.wait(SteepedTea, 300);
		 s.click(SteepedTea.similar((float)0.5));
		 
		 s.wait(SteepedTeaMedium, 300);
		 s.click(SteepedTeaMedium.similar((float)0.5));
		 testcase.log(Status.PASS, "User able to click on SteepedTeaMedium");
		 s.wait(EatIn, 300);  
		 s.click(EatIn.similar((float)0.8));
		 testcase.log(Status.PASS, "User able to click on EatIn");
		 Thread.sleep(4000);
		  Rectangle rectangle=new Rectangle();
		  rectangle.setBounds(420,200,60,30);
		  String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MDSteepedTeaPrice");
		 ITesseract image = new Tesseract();
		 image.setDatapath(".\\tessdata");
		 String imageText=image.doOCR(new File(imagePath));
		 System.out.println(imageText);
		 System.out.println(b.readSteepedTeaMediumPrice());
		 String a1=null;
		 String a2=null;
		 
		 String replaceAll = imageText.replaceAll("\\s","");
		 a1 = replaceAll;
		 a2 = b.readSteepedTeaMediumPrice();
		 System.out.println(a1);
		 System.out.println(a2);
		 
		 if(a1.equals(a2)){
			 testcase.log(Status.PASS," Correct ala carte price of MD Steeped Tea Price" );
		 System.out.println("***********Scenario017 PASS: Correct ala carte price of MD Steeped Tea Price ***********");
		}
		 else
		 {
			 testcase.log(Status.FAIL," Incorrect ala carte price of MD Steeped Tea Price" );
		 System.out.println("***********Scenario017 FAIL: Incorrect ala carte price of MD Steeped Tea Price ***********");
		}
		 s.wait(VoidItem, 300);
		 s.click(VoidItem.similar((float)0.5));
	 }
	@Test(priority = 18)
	public void sikuliTestCase018(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
	{
		testcase=extent.createTest("TC_018:Verify SteepedTeaLarge Price"); 
		BeverageItems b = new BeverageItems(s);
		 
		 
		 
		 Thread.sleep(2000);
		 s.wait(SteepedTea, 300);
		 s.click(SteepedTea.similar((float)0.5));
		 
		 s.wait(SteepedTeaLarge, 300);
		 s.click(SteepedTeaLarge.similar((float)0.5));
		 testcase.log(Status.PASS, "User able to click on SteepedTeaLarge");
		 s.wait(EatIn, 300);  
		 s.click(EatIn.similar((float)0.8));
		 testcase.log(Status.PASS, "User able to click on EatIn");
		 Thread.sleep(4000);
		  Rectangle rectangle=new Rectangle();
		  rectangle.setBounds(420,200,60,30);
		  String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LGSteepedTeaPrice");
		 ITesseract image = new Tesseract();
		 image.setDatapath(".\\tessdata");
		 String imageText=image.doOCR(new File(imagePath));
		 System.out.println(imageText);
		 System.out.println(b.readSteepedTeaLargePrice());
		 String a1=null;
		 String a2=null;
		 
		 String replaceAll = imageText.replaceAll("\\s","");
		 a1 = replaceAll;
		 a2 = b.readSteepedTeaLargePrice();
		 System.out.println(a1);
		 System.out.println(a2);
		 
		 if(a1.equals(a2)){
			 testcase.log(Status.PASS," Correct ala carte price of LG Steeped Tea Price" );
		 System.out.println("***********Scenario018 PASS: Correct ala carte price of LG Steeped Tea Price ***********");
		}
		 else
		 {
			 testcase.log(Status.FAIL," Incorrect ala carte price of LG Steeped Tea Price" );
		 System.out.println("***********Scenario018 FAIL: Incorrect ala carte price of LG Steeped Tea Price ***********");
		}
		 s.wait(VoidItem, 300);
		 s.click(VoidItem.similar((float)0.5));
	 }
	
	/*@Test(priority = 11)
	public void sikuliTestCase00011()throws FindFailed, IOException, TesseractException, InterruptedException
	{
		testcase=extent.createTest("TC_0011:Verify TEA STEEPED ORANGE XL Price");
		 
		 RegressionTest14feb b = new RegressionTest14feb();
		 
		 Thread.sleep(2000);
		 s.wait(SteepedTea, 300);
		 s.click(SteepedTea.similar((float)0.5));
		 (Status.PASS, "User able to Click the SteepedTea Button");
		 s.wait(SteepedTeaExtraLarge, 300);
		 s.click(SteepedTeaExtraLarge.similar((float)0.5));
		 (Status.PASS, "User able to Click the LargeSteepedTea Button");
		 s.wait(EatIn, 300);  
		 s.click(EatIn.similar((float)0.8));
		 (Status.PASS, "User able to Click the Eatin Button");
		 File Source = new File("SteepedTeaExtraLargePrice.png");
		 String Path = System.getProperty("user.dir")+"/Images/SteepedTeaExtraLargePrice.png";
		 FileHandler.copy(Source, new File(Path));
		 ITesseract image = new Tesseract();
		 image.setDatapath(".\\tessdata");
		 String imageText=image.doOCR(new File(Path));
		 System.out.println(imageText);
		 System.out.println(b.readSteepedTeaExtraLargePrice());
		 String a1=null;
		 String a2=null;
		 
		 String replaceAll = imageText.replaceAll("\\s","");
		 a1 = replaceAll;
		 a2 = b.readSteepedTeaExtraLargePrice();
		 System.out.println(a1);
		 System.out.println(a2);
		 
		 if(a1.equals(a2)){
		 (Status.PASS," Correct ala carte price of XL Steeped Tea Price" );
		 System.out.println("***********Scenario011 PASS: Correct ala carte price of XL Steeped Tea Price ***********");
		}
		 else
		 {
		(Status.FAIL, "Incorrect ala carte price of XL Steeped Tea Price");
		 System.out.println("***********Scenario011 FAIL: Incorrect ala carte price of XL Steeped Tea Price ***********");
		}
		 s.wait(VoidItem, 300);
		 s.click(VoidItem.similar((float)0.5));
	 }*/


	
@Test(priority = 19)
public void sikuliTestCase019(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_019:Verify SteepedTeaSmallRefill Price"); 
BeverageItems b = new BeverageItems(s);

Thread.sleep(2000);
s.wait(SteepedTea, 300);
s.click(SteepedTea.similar((float)0.5));

s.wait(SteepedTeaSmallRefill, 300);
s.click(SteepedTeaSmallRefill.similar((float)0.5));
testcase.log(Status.PASS, "User able to click on SteepedTeaSmallRefill");
s.wait(EatIn, 300);  
s.click(EatIn.similar((float)0.8));
testcase.log(Status.PASS, "User able to click on EatIn");
Thread.sleep(4000);
Rectangle rectangle=new Rectangle();
rectangle.setBounds(420,200,60,30);
String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RFSMSteepedTeaPrice");
ITesseract image = new Tesseract();
image.setDatapath(".\\tessdata");
String imageText=image.doOCR(new File(imagePath));
System.out.println(imageText);
System.out.println(b.readSteepedTeaSmallRefillPrice());
String a1=null;
String a2=null;

String replaceAll = imageText.replaceAll("\\s","");
a1 = replaceAll;
a2 = b.readSteepedTeaSmallRefillPrice();
System.out.println(a1);
System.out.println(a2);

if(a1.equals(a2)){
	testcase.log(Status.PASS," Correct ala carte price of RF-SM Steeped Tea Price" );
System.out.println("***********Scenario019 PASS: Correct ala carte price of RF-SM Steeped Tea Price ***********");
}
else
{
	testcase.log(Status.FAIL," Incorrect ala carte price of RF-SM Steeped Tea Price" );
System.out.println("***********Scenario019 FAIL: Incorrect ala carte price of RF-SM Steeped Tea Price ***********");
}
s.wait(VoidItem, 300);
s.click(VoidItem.similar((float)0.5));
}

@Test(priority = 20)
public void sikuliTestCase020(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_020:Verify SteepedTeaMediumRefill Price");
	BeverageItems b = new BeverageItems(s);
	 

Thread.sleep(2000);
s.wait(SteepedTea, 300);
s.click(SteepedTea.similar((float)0.5));

s.wait(SteepedTeaMediumRefill, 300);
s.click(SteepedTeaMediumRefill.similar((float)0.5));
testcase.log(Status.PASS, "User able to click on SteepedTeaMediumRefill");
s.wait(EatIn, 300);  
s.click(EatIn.similar((float)0.8));
testcase.log(Status.PASS, "User able to click on EatIn");
Thread.sleep(4000);
Rectangle rectangle=new Rectangle();
rectangle.setBounds(420,200,60,30);
String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RFSMSteepedTeaPrice");
ITesseract image = new Tesseract();
image.setDatapath(".\\tessdata");
String imageText=image.doOCR(new File(imagePath));
System.out.println(imageText);
System.out.println(b.readSteepedTeaMediumRefillPrice());
String a1=null;
String a2=null;

String replaceAll = imageText.replaceAll("\\s","");
a1 = replaceAll;
a2 = b.readSteepedTeaMediumRefillPrice();
System.out.println(a1);
System.out.println(a2);

if(a1.equals(a2)){
	testcase.log(Status.PASS," Correct ala carte price of RF-MD Steeped Tea Price" );
System.out.println("***********Scenario020 PASS: Correct ala carte price of RF-MD Steeped Tea Price ***********");
}
else
{
	testcase.log(Status.FAIL," Incorrect ala carte price of RF-MD Steeped Tea Price" );
System.out.println("***********Scenario020 FAIL: Incorrect ala carte price of RF-MD Steeped Tea Price ***********");
}
s.wait(VoidItem, 300);
s.click(VoidItem.similar((float)0.5));
}

/*@Test(priority = 21)
public void sikuliTestCase021()throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_021:Verify SteepedTeaLargeRefill Price");
Runner b = new Runner();

Thread.sleep(2000);
s.wait(SteepedTea, 300);
s.click(SteepedTea.similar((float)0.5));

s.wait(SteepedTeaLargeRefill, 300);
s.click(SteepedTeaLargeRefill.similar((float)0.5));

s.wait(EatIn, 300);  
s.click(EatIn.similar((float)0.8));

Thread.sleep(4000);
Rectangle rectangle=new Rectangle();
rectangle.setBounds(420,200,60,30);
String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RFLGSteepedTeaPrice");
ITesseract image = new Tesseract();
image.setDatapath(".\\tessdata");
String imageText=image.doOCR(new File(imagePath));
System.out.println(imageText);
System.out.println(b.readSteepedTeaLargeRefillPrice());
String a1=null;
String a2=null;

String replaceAll = imageText.replaceAll("\\s","");
a1 = replaceAll;
a2 = b.readSteepedTeaLargeRefillPrice();
System.out.println(a1);
System.out.println(a2);

if(a1.equals(a2)){

System.out.println("***********Scenario021 PASS: Correct ala carte price of RF-LG Steeped Tea Price ***********");
}
else
{

System.out.println("***********Scenario021 FAIL: Incorrect ala carte price of RF-LG Steeped Tea Price ***********");
}
s.wait(VoidItem, 300);
s.click(VoidItem.similar((float)0.5));
}
/*@Test(priority = 15)
public void sikuliTestCase00015()throws FindFailed, IOException, TesseractException, InterruptedException
{
testcase=extent.createTest("TC_0015:Verify TEA STEEPED ORANGE RF-XL Price");

RegressionTest14feb b = new RegressionTest14feb();

Thread.sleep(2000);
s.wait(SteepedTea, 300);
s.click(SteepedTea.similar((float)0.5));
(Status.PASS, "User able to Click the SteepedTea Button");
s.wait(SteepedTeaExtraLargeRefill, 300);
s.click(SteepedTeaExtraLargeRefill.similar((float)0.5));
(Status.PASS, "User able to Click the SteepedTeaExtraLargeRefill Button");
s.wait(EatIn, 300);  
s.click(EatIn.similar((float)0.8));
(Status.PASS, "User able to Click the Eatin Button");
File Source = new File("SteepedTeaExtraLargeRefillPrice.png");
String Path = System.getProperty("user.dir")+"/Images/SteepedTeaExtraLargeRefillPrice.png";
FileHandler.copy(Source, new File(Path));
ITesseract image = new Tesseract();
image.setDatapath(".\\tessdata");
String imageText=image.doOCR(new File(Path));
System.out.println(imageText);
System.out.println(b.readSteepedTeaExtraLargeRefillPrice());
String a1=null;
String a2=null;

String replaceAll = imageText.replaceAll("\\s","");
a1 = replaceAll;
a2 = b.readSteepedTeaExtraLargeRefillPrice();
System.out.println(a1);
System.out.println(a2);

if(a1.equals(a2)){
(Status.PASS," Correct ala carte price of RF-MD Steeped Tea Price" );
System.out.println("***********Scenario015 PASS: Correct ala carte price of RF-XL Steeped Tea Price ***********");
}
else
{
(Status.FAIL, "Incorrect ala carte price of RF-MD Steeped Tea Price");
System.out.println("***********Scenario015 FAIL: Incorrect ala carte price of RF-XL Steeped Tea Price ***********");
}
s.wait(VoidItem, 300);
s.click(VoidItem.similar((float)0.5));
}*/

@Test(priority = 21)
public void sikuliTestCase021(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_021:Verify SmallLatte Price");
	BeverageItems b = new BeverageItems(s);
	 

Thread.sleep(2000);
s.wait(Latte, 300);
s.click(Latte.similar((float)0.5));

s.wait(SmallLatte, 300);
s.click(SmallLatte.similar((float)0.5));
testcase.log(Status.PASS, "User able to click on SmallLatte");
s.wait(EatIn, 300);  
s.click(EatIn.similar((float)0.8));
testcase.log(Status.PASS, "User able to click on EatIn");
Thread.sleep(4000);
Rectangle rectangle=new Rectangle();
rectangle.setBounds(420,200,60,30);
String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SMLattePrice");
ITesseract image = new Tesseract();
image.setDatapath(".\\tessdata");
String imageText=image.doOCR(new File(imagePath));
System.out.println(imageText);
System.out.println(b.readSmallLattePrice());
String a1=null;
String a2=null;

String replaceAll = imageText.replaceAll("\\s","");
a1 = replaceAll;
a2 = b.readSmallLattePrice();
System.out.println(a1);
System.out.println(a2);

if(a1.equals(a2)){
	testcase.log(Status.PASS," Correct ala carte price of SmallLatte Price" );
System.out.println("***********Scenario021 PASS: Correct ala carte price of SmallLatte Price ***********");
}
else
{
	testcase.log(Status.FAIL," Incorrect ala carte price of SmallLatte Price" );
System.out.println("***********Scenario021 FAIL: Incorrect ala carte price of SmallLatte Price ***********");
}
s.wait(VoidItem, 300);
s.click(VoidItem.similar((float)0.5));
}
/*@Test(priority = 17)
public void sikuliTestCase00017()throws FindFailed, IOException, TesseractException, InterruptedException
{
testcase=extent.createTest("TC_0017:Verify LATTE - NM17 MD Price");

RegressionTest14feb b = new RegressionTest14feb();

Thread.sleep(2000);
s.wait(Latte, 300);
s.click(Latte.similar((float)0.5));

s.wait(MediumLatte, 300);
s.click(MediumLatte.similar((float)0.5));
(Status.PASS, "User able to Click the MediumLatte Button");
s.wait(EatIn, 300);  
s.click(EatIn.similar((float)0.8));
(Status.PASS, "User able to Click the Eatin Button");
File Source = new File("MediumLattePrice.png");
String Path = System.getProperty("user.dir")+"/Images/MediumLattePrice.png";
FileHandler.copy(Source, new File(Path));
ITesseract image = new Tesseract();
image.setDatapath(".\\tessdata");
String imageText=image.doOCR(new File(Path));
System.out.println(imageText);
System.out.println(b.readMediumLattePrice());
String a1=null;
String a2=null;

String replaceAll = imageText.replaceAll("\\s","");
a1 = replaceAll;
a2 = b.readMediumLattePrice();
System.out.println(a1);
System.out.println(a2);

if(a1.equals(a2)){
(Status.PASS," Correct ala carte price of MediumLatte Price" );
System.out.println("***********Scenario017 PASS: Correct ala carte price of MediumLatte Price ***********");
}
else
{
(Status.FAIL, "Incorrect ala carte price of MediumLatte  Price");
System.out.println("***********Scenario017 FAIL: Incorrect ala carte price of MediumLatte Price ***********");
}
s.wait(VoidItem, 300);
s.click(VoidItem.similar((float)0.5));
}*/
@Test(priority = 22)
public void sikuliTestCase022(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_022:Verify LargeLatte Price");
	BeverageItems b = new BeverageItems(s);
	 

Thread.sleep(2000);
s.wait(Latte, 300);
s.click(Latte.similar((float)0.5));

s.wait(LargeLatte, 300);
s.click(LargeLatte.similar((float)0.5));
testcase.log(Status.PASS, "User able to click on LargeLatte");
s.wait(EatIn, 300);  
s.click(EatIn.similar((float)0.8));
testcase.log(Status.PASS, "User able to click on EatIn");
Thread.sleep(4000);
Rectangle rectangle=new Rectangle();
rectangle.setBounds(420,200,60,30);
String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LGLattePrice");
ITesseract image = new Tesseract();
image.setDatapath(".\\tessdata");
String imageText=image.doOCR(new File(imagePath));
System.out.println(imageText);
System.out.println(b.readLargeLattePrice());
String a1=null;
String a2=null;

String replaceAll = imageText.replaceAll("\\s","");
a1 = replaceAll;
a2 = b.readLargeLattePrice();
System.out.println(a1);
System.out.println(a2);

if(a1.equals(a2)){
	testcase.log(Status.PASS," Correct ala carte price of LargeLatte Price" );
System.out.println("***********Scenario022 PASS: Correct ala carte price of LargeLatte Price ***********");
}
else
{
	testcase.log(Status.FAIL," Incorrect ala carte price of LargeLatte Price" );
System.out.println("***********Scenario022 FAIL: Incorrect ala carte price of LargeLatte Price ***********");
}
s.wait(VoidItem, 300);
s.click(VoidItem.similar((float)0.5));
}


@Test(priority = 23)
public void sikuliTestCase023(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{
	
	testcase=extent.createTest("TC_023:Verify Small iced Cappuccino Price");
	BeverageItems b = new BeverageItems(s);
	Thread.sleep(7000);
	
	s.wait(Beverages1,300);
	s.click(Beverages1);
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	s.wait(IcedCappuccino,300);
	s.click(IcedCappuccino);
	s.wait(SmallIcedCappuccino,300);
	s.click(SmallIcedCappuccino);
	testcase.log(Status.PASS, "User able to click on Small Iced Cappuccino");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,60,30);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SmallIcedCappuccinoPrice");
//	 ScreenImage full = s.capture();
//	  String fullimage=full.save(System.getProperty("user.dir")+"/Image/", "fullpic");
	  rectangle.setBounds(210,200,275,30);
	  String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SmallIcedCappuccinoPricewithname");
	 

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.readSmallIcedCappuccinoPrice());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	//replaceAll=imageText.replaceAll("[$,]","");
	a1 = replaceAll;
	a2 = String.valueOf(b.readSmallIcedCappuccinoPrice());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of SmallIcedCappuccino Price" );
	System.out.println("***********Scenario023 PASS: Correct ala carte price of SmallIcedCappuccino Price ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Small Iced Cappuccino . "+"Expected Price: "+b.readSmallIcedCappuccinoPrice());

		testcase.addScreenCaptureFromPath(pricewithname);
		System.out.println("***********Scenario023 FAIL: Incorrect ala carte price of SmallIcedCappuccino Price ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}


@Test(priority = 24)
public void sikuliTestCase024(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{
	testcase=extent.createTest("TC_024: Verify Medium Iced Cappuccino Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	s.wait(Beverages1,300);
	s.click(Beverages1);
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	s.wait(IcedCappuccino,300);
	s.click(IcedCappuccino);
	s.wait(MediumIcedCappuccino,300);
	s.click(MediumIcedCappuccino);
	testcase.log(Status.PASS, "User able to click on Medium Iced Cappuccino");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MediumIcedCappuccinoPrice");
	 rectangle.setBounds(210,200,275,30);
	  String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MediumIcedCappuccinoPricewithname");
	 
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.readMediumIcedCappuccinoPrice());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.readMediumIcedCappuccinoPrice());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Medium Iced Cappuccino " );
	System.out.println("***********Scenario024 PASS: Correct ala carte price of Medium Iced Cappuccino Price ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Medium Iced Cappuccino. "+"Expected Price: "+b.readMediumIcedCappuccinoPrice());
		testcase.addScreenCaptureFromPath(pricewithname);
	
		System.out.println("***********Scenario024 FAIL: Incorrect ala carte price of Medium Iced Cappuccino Price ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}



@Test(priority = 25)
public void sikuliTestCase025(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{
	testcase=extent.createTest("TC_025: Verify Large Iced Cappuccino Price."+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	s.wait(IcedCappuccino,300);
	s.click(IcedCappuccino);
	s.wait(LargeIcedCappuccino,300);
	s.click(LargeIcedCappuccino);
	testcase.log(Status.PASS, "User able to click on Large Iced Cappuccino");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LargeIcedCappuccinoPrice");
	 rectangle.setBounds(210,200,275,30);
	  String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LargeIcedCappuccinoPricewithname");
	 
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.readLargeIcedCappuccinoPrice());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.readLargeIcedCappuccinoPrice());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Large Iced Cappuccino " );
	System.out.println("***********Scenario025 PASS: Correct ala carte price of LargeIcedCappuccino Price ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Large Iced Cappuccino. "+"Expected Price: "+b.readLargeIcedCappuccinoPrice());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario025 FAIL: Incorrect ala carte price of Large Iced Cappuccino Price ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));

}

@Test(priority = 26)
public void sikuliTestCase026(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{
	testcase=extent.createTest("TC_026:Verify SmallRefilIcedCappuccino Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	
	s.wait(Beverages1,300);
	s.click(Beverages1);
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	s.wait(IcedCappuccino,300);
	s.click(IcedCappuccino);
	s.wait(SmallRefilIcedCappuccino,300);
	s.click(SmallRefilIcedCappuccino);
	testcase.log(Status.PASS, "User able to click on SmallRefilIcedCappuccino");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on EatIn");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SmallRefilIcedCappuccinoPrice");
	 rectangle.setBounds(210,200,275,30);
	  String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SmallRefilIcedCappuccinoPricewithname");
	 
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.readSmallRefilIcedCappuccinoPrice());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.readSmallRefilIcedCappuccinoPrice());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of SmallRefilIcedCappuccino Price" );
	System.out.println("***********Scenario026 PASS: Correct ala carte price of SmallRefilIcedCappuccino Price ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of SmallRefilIcedCappuccino Price" );
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario026 FAIL: Incorrect ala carte price of SmallRefilIcedCappuccino Price ***********");
	}
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}

@Test(priority = 27)
public void sikuliTestCase027(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{
	testcase=extent.createTest("TC_027: Verify Medium Refill Iced Cappuccino Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	s.wait(IcedCappuccino,300);
	s.click(IcedCappuccino);
	s.wait(MediumRefilIcedCappuccino,300);
	s.click(MediumRefilIcedCappuccino);
	testcase.log(Status.PASS, "User able to click on Medium Refill Iced Cappuccino");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(415,205,65,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MediumRefilIcedCappuccinoPrice");
	 rectangle.setBounds(210,200,275,30);
	  String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MediumRefilIcedCappuccinoPricewithname");
	 
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.readMediumRefilIcedCappuccinoPrice());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.readMediumRefilIcedCappuccinoPrice());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Medium Refill Iced Cappuccino " );
	System.out.println("***********Scenario027 PASS: Correct ala carte price of MediumRefilIcedCappuccino Price ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Medium Refill Iced Cappuccino. "+"Expected Price: "+b.readMediumRefilIcedCappuccinoPrice());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario027 FAIL: Incorrect ala carte price of MediumRefilIcedCappuccino Price ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}

@Test(priority = 28)
public void sikuliTestCase028(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{
	testcase=extent.createTest("TC_028: Verify Large Refill Iced Cappuccino Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	s.wait(IcedCappuccino,300);
	s.click(IcedCappuccino);
	s.wait(LargeRefilIcedCappuccino,300);
	s.click(LargeRefilIcedCappuccino);
	testcase.log(Status.PASS, "User able to click on Large Refill Iced Cappuccino");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LargeRefilIcedCappuccinoPrice");
	 rectangle.setBounds(210,200,275,30);
	  String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LargeRefilIcedCappuccinoPricewithname");
	 
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.readLargeRefilIcedCappuccinoPrice());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.readLargeRefilIcedCappuccinoPrice());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Large Refill Iced Cappuccino " );
	System.out.println("***********Scenario028 PASS: Correct ala carte price of LargeRefilIcedCappuccino Price ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Large Refill Iced Cappuccino. "+"Expected Price: "+b.readLargeRefilIcedCappuccinoPrice());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario028 FAIL: Incorrect ala carte price of LargeRefilIcedCappuccino Price ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}

@Test(priority = 29)
public void sikuliTestCase029(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{
	testcase=extent.createTest("TC_029:Verify SmallIcedCappuccinoLight Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	s.wait(IcedCappuccinoLight,300);
	s.click(IcedCappuccinoLight);
	s.wait(SmallIcedCappuccinoLight,300);
	s.click(SmallIcedCappuccinoLight);
	testcase.log(Status.PASS, "User able to click on SmallIcedCappuccinoLight");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on EatIn");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SmallIcedCappuccinoLightPrice");
	 rectangle.setBounds(210,200,275,30);
	  String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SmallIcedCappuccinoLightPricewithname");
	 
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.readSmallIcedCappuccinoLightPrice());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.readSmallIcedCappuccinoLightPrice());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of SmallIcedCappuccinoLight Price" );
	System.out.println("***********Scenario029 PASS: Correct ala carte price of SmallIcedCappuccinoLight Price ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of SmallIcedCappuccinoLight Price" );
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario029 FAIL: Incorrect ala carte price of SmallIcedCappuccinoLight Price ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));

}


@Test(priority = 30)
public void sikuliTestCase030(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{
	testcase=extent.createTest("TC_030: Verify Medium Iced Cappuccino Light Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	s.wait(IcedCappuccinoLight,300);
	s.click(IcedCappuccinoLight);
	s.wait(MediumIcedCappuccinoLight,300);
	s.click(MediumIcedCappuccinoLight);
	testcase.log(Status.PASS, "User able to click on Medium Iced Cappuccino Light");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MediumIcedCappuccinoLightPrice");
	 rectangle.setBounds(210,200,275,30);
	  String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MediumIcedCappuccinoLightPricewithname");
	 
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.readMediumIcedCappuccinoLightPrice());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.readMediumIcedCappuccinoLightPrice());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Medium Iced Cappuccino Light " );
	System.out.println("***********Scenario031 PASS: Correct ala carte price ofMediumIcedCappuccinoLight Price ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Medium Iced Cappuccino Light. "+"Expected Price: "+b.readMediumIcedCappuccinoLightPrice());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario031 FAIL: Incorrect ala carte price ofMediumIcedCappuccinoLight Price ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}

@Test(priority = 31)
public void sikuliTestCase031(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{
	testcase=extent.createTest("TC_031: Verify Large Iced Cappuccino Light Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	s.wait(IcedCappuccinoLight,300);
	s.click(IcedCappuccinoLight);
	s.wait(LargeIcedCappuccinoLight,300);
	s.click(LargeIcedCappuccinoLight);
	testcase.log(Status.PASS, "User able to click on Large Iced Cappuccino Light");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LargeIcedCappuccinoLightPrice");
	 rectangle.setBounds(210,200,275,30);
	  String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LargeIcedCappuccinoLightPricewithname");
	 
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel ");
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.readLargeIcedCappuccinoLight());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Large Iced Cappuccino Light " );
	System.out.println("***********Scenario032 PASS: Correct ala carte price ofLargeIcedCappuccinoLight Price ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Large Iced Cappuccino Light. "+"Expected Price: "+b.readLargeIcedCappuccinoLight());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario032 FAIL: Incorrect ala carte price ofLargeIcedCappuccinoLight Price ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}

@Test(priority = 32)
public void sikuliTestCase032(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{
	testcase=extent.createTest("TC_032: Verify Small Refill Iced Cappuccino Light Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	s.wait(IcedCappuccinoLight,300);
	s.click(IcedCappuccinoLight);
	s.wait(SmallRefilIcedCappuccinoLight,300);
	s.click(SmallRefilIcedCappuccinoLight);
	testcase.log(Status.PASS, "User able to click on Small Refill Iced Cappuccino Light");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SmallRefilIcedCappuccinoLightPrice");
	 rectangle.setBounds(210,200,275,30);
	  String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SmallRefilIcedCappuccinoLightPricewithname");
	 
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.readSmallRefilIcedCappuccinoLightPrice());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.readSmallRefilIcedCappuccinoLightPrice());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Small Refil Iced Cappuccino Light " );
	System.out.println("***********Scenario033 PASS: Correct ala carte price ofSmallRefilIcedCappuccinoLightPrice ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of SmallRefilIcedCappuccinoLightPrice" );
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario033 FAIL: Incorrect ala carte price ofSmallRefilIcedCappuccinoLightPrice ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));

}

@Test(priority = 33)
public void sikuliTestCase033(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{
	testcase=extent.createTest("TC_033: Verify Medium Refill Iced Cappuccino Light Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	
	s.wait(IcedCappuccinoLight,300);
	s.click(IcedCappuccinoLight);
	s.wait(MediumRefilIcedCappuccinoLight,300);
	s.click(MediumRefilIcedCappuccinoLight);
	testcase.log(Status.PASS, "User able to click on Medium Refill Iced Cappuccino Light");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(410,205,70,50);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MediumRefilIcedCappuccinoLightPrice");
	 rectangle.setBounds(210,200,275,30);
	  String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MediumRefilIcedCappuccinoLightPricewithname");
	 
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.readMediumRefilIcedCappuccinoLightPrice());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.readMediumRefilIcedCappuccinoLightPrice());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Medium Refill Iced Cappuccino Light " );
	System.out.println("***********Scenario034 PASS: Correct ala carte price ofMediumRefilIcedCappuccinoLightPrice ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Medium Refill Iced Cappuccino Light. "+"Expected price: "+b.readMediumRefilIcedCappuccinoLightPrice());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario034 FAIL: Incorrect ala carte price ofMediumRefilIcedCappuccinoLightPrice ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));

}

@Test(priority = 34)
public void sikuliTestCase034(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{
	testcase=extent.createTest("TC_034: Verify Large Refill Iced Cappuccino Light Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	s.wait(IcedCappuccinoLight,300);
	s.click(IcedCappuccinoLight);
	s.wait(LargeRefilIcedCappuccinoLight,300);
	s.click(LargeRefilIcedCappuccinoLight);
	testcase.log(Status.PASS, "User able to click on Large Refill Iced Cappuccino Light");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,60,30);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LargeRefilIcedCappuccinoLightPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LargeRefilIcedCappuccinoLightPricewithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.readLargeRefilIcedCappuccinoLight());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.readLargeRefilIcedCappuccinoLight());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Large Refill Iced Cappuccino Light" );
	System.out.println("***********Scenario035 PASS: Correct ala carte price ofLargeRefilIcedCappuccinoLightPrice ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Large Refill Iced Cappuccino Light. "+"Expected Price: "+b.readLargeRefilIcedCappuccinoLight());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario035 FAIL: Incorrect ala carte price ofLargeRefilIcedCappuccinoLightPrice ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}

@Test(priority = 35)
public void sikuliTestCase035(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_035:VerifySmallMochaIcedCappuccinoPrice");
	BeverageItems b = new BeverageItems(s);
	
	s.wait(Beverages1,300);
	s.click(Beverages1);
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	s.wait(FlavouredIcedCappuccino,300);
	s.click(FlavouredIcedCappuccino);
	s.wait(MochaIcedCappuccino,300);
	s.click(MochaIcedCappuccino);
	s.wait(SmallMochaIcedCappuccino,300);
	s.click(SmallMochaIcedCappuccino);
	testcase.log(Status.PASS, "User able to click onSmallMochaIcedCappuccino");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on EatIn");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,60,30);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SmallMochaIcedCappuccinoPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SmallMochaIcedCappuccinoPricewithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.readSmallMochaIcedCappuccino());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.readSmallMochaIcedCappuccino());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price ofSmallMochaIcedCappuccinoPrice" );
	System.out.println("***********Scenario035 PASS: Correct ala carte price ofSmallMochaIcedCappuccino ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price ofSmallMochaIcedCappuccinoPrice" );
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario035 FAIL: Incorrect ala carte price ofSmallMochaIcedCappuccino ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}


@Test(priority = 36)
public void sikuliTestCase036(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{
	testcase=extent.createTest("TC_036:VerifyMediumMochaIcedCappuccinoPrice");
	BeverageItems b = new BeverageItems(s);
	
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	s.wait(FlavouredIcedCappuccino,300);
	s.click(FlavouredIcedCappuccino);
	s.wait(MochaIcedCappuccino,300);
	s.click(MochaIcedCappuccino);
	s.wait(MediumMochaIcedCappuccino,300);
	s.click(MediumMochaIcedCappuccino);
	testcase.log(Status.PASS, "User able to click onMediumMochaIcedCappuccino");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on EatIn");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,60,30);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MediumMochaIcedCappuccinoPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MediumMochaIcedCappuccinoPricewithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.readMediumMochaIcedCappuccino());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.readMediumMochaIcedCappuccino());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price ofMediumMochaIcedCappuccinoPrice" );
	System.out.println("***********Scenario035 PASS: Correct ala carte price ofMediumMochaIcedCappuccino ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price ofMediumMochaIcedCappuccinoPrice" );
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario035 FAIL: Incorrect ala carte price ofMediumMochaIcedCappuccino ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}


@Test(priority = 37)
public void sikuliTestCase037(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{
	testcase=extent.createTest("TC_037:VerifyLargeMochaIcedCappuccinoPrice");
	BeverageItems b = new BeverageItems(s);
	
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	s.wait(FlavouredIcedCappuccino,300);
	s.click(FlavouredIcedCappuccino);
	s.wait(MochaIcedCappuccino,300);
	s.click(MochaIcedCappuccino);
	s.wait(LargeMochaIcedCappuccino,300);
	s.click(LargeMochaIcedCappuccino);
	testcase.log(Status.PASS, "User able to click onLargeMochaIcedCappuccino");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on EatIn");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,60,30);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LargeMochaIcedCappuccinoPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LargeMochaIcedCappuccinoPricewithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.readLargeMochaIcedCappuccino());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.readLargeMochaIcedCappuccino());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price ofLargeMochaIcedCappuccinoPrice" );
	System.out.println("***********Scenario035 PASS: Correct ala carte price ofLargeMochaIcedCappuccino ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price ofLargeMochaIcedCappuccinoPrice" );
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario035 FAIL: Incorrect ala carte price ofLargeMochaIcedCappuccino ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));

}
@Test(priority = 38)
public void sikuliTestCase038(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{
	
	testcase=extent.createTest("TC_038:VerifySmallRefilMochaIcedCappuccinoPrice");
	BeverageItems b = new BeverageItems(s);
	
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	s.wait(FlavouredIcedCappuccino,300);
	s.click(FlavouredIcedCappuccino);
	s.wait(MochaIcedCappuccino,300);
	s.click(MochaIcedCappuccino);
	s.wait(SmallRefilMochaIcedCappuccino,300);
	s.click(SmallRefilMochaIcedCappuccino);
	testcase.log(Status.PASS, "User able to click onSmallRefilMochaIcedCappuccino");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on EatIn");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,60,30);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SmallRefilMochaIcedCappuccinoPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SmallRefilMochaIcedCappuccinoPricewithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.readSmallRefilMochaIcedCappuccino());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.readSmallRefilMochaIcedCappuccino());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price ofSmallRefilMochaIcedCappuccinoPrice" );
	System.out.println("***********Scenario035 PASS: Correct ala carte price ofSmallRefilMochaIcedCappuccino ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price ofSmallRefilMochaIcedCappuccinoPrice" );
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario035 FAIL: Incorrect ala carte price ofSmallRefilMochaIcedCappuccino ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
	
	
}

@Test(priority = 39)
public void sikuliTestCase039(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{
	testcase=extent.createTest("TC_039:VerifyMediumRefilMochaIcedCappuccinoPrice");
	BeverageItems b = new BeverageItems(s);
	
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	s.wait(FlavouredIcedCappuccino,300);
	s.click(FlavouredIcedCappuccino);
	s.wait(MochaIcedCappuccino,300);
	s.click(MochaIcedCappuccino);
	s.wait(MediumRefilMochaIcedCappuccino,300);
	s.click(MediumRefilMochaIcedCappuccino);
	testcase.log(Status.PASS, "User able to click onMediumRefilMochaIcedCappuccino");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on EatIn");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,60,30);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MediumRefilMochaIcedCappuccinoPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MediumRefilMochaIcedCappuccinoPricewithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.readMediumRefilMochaIcedCappuccino());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.readMediumRefilMochaIcedCappuccino());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price ofMediumRefilMochaIcedCappuccinoPrice" );
	System.out.println("***********Scenario035 PASS: Correct ala carte price ofMediumRefilMochaIcedCappuccino ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price ofMediumRefilMochaIcedCappuccinoPrice" );
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario035 FAIL: Incorrect ala carte price ofMediumRefilMochaIcedCappuccino ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}
@Test(priority = 40)
public void sikuliTestCase040(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{
testcase=extent.createTest("TC_040:VerifyLargeRefilMochaIcedCappuccinoPrice. "+"(Region Id: 7000054)");
BeverageItems b = new BeverageItems(s);

s.wait(IcedBeverages,300);
s.click(IcedBeverages);
s.wait(FlavouredIcedCappuccino,300);
s.click(FlavouredIcedCappuccino);
s.wait(MochaIcedCappuccino,300);
s.click(MochaIcedCappuccino);
s.wait(LargeRefilMochaIcedCappuccino,300);
s.click(LargeRefilMochaIcedCappuccino);
testcase.log(Status.PASS, "User able to click onLargeRefilMochaIcedCappuccino");
s.wait(EatIn, 300);  
s.click(EatIn.similar((float)0.8));
testcase.log(Status.PASS, "User able to click on EatIn");
Thread.sleep(7000);
Rectangle rectangle=new Rectangle();
rectangle.setBounds(420,200,60,30);
String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LargeRefilMochaIcedCappuccinoPrice");
rectangle.setBounds(210,200,275,30);
String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LargeRefilMochaIcedCappuccinoPricewithname");

 
System.out.println("price screen shot clicked");
ITesseract image = new Tesseract();
image.setDatapath("C:\\\\RBI Auto 15_08_23\\\\Tim_Hortons_NextGen\\\\Tim_Hortons_NextGen\\\\tessdata");
String imageText=image.doOCR(new File(imagePath));
System.out.println("frompic "+imageText);
System.out.println("fromexcel "+b.readLargeRefilMochaIcedCappuccino());

String a1=null;
String a2=null;
 
String replaceAll = imageText.replaceAll("\\s","");

a1 = replaceAll;
a2 = String.valueOf(b.readLargeRefilMochaIcedCappuccino());
System.out.println("from pic "+a1);
System.out.println("from excel "+a2);
 
int value=a1.compareTo(a2);
System.out.println(value);
if(a1.equals(a2)) {
System.out.println("same");
}
if(a1.equals(a2)){
testcase.log(Status.PASS," Correct ala carte price ofLargeRefilMochaIcedCappuccinoPrice" );
System.out.println("***********Scenario035 PASS: Correct ala carte price ofLargeRefilMochaIcedCappuccino ***********");
}
else
{
testcase.log(Status.FAIL," Incorrect ala carte price ofLargeRefilMochaIcedCappuccinoPrice" );
testcase.addScreenCaptureFromPath(pricewithname);
System.out.println("***********Scenario035 FAIL: Incorrect ala carte price ofLargeRefilMochaIcedCappuccino ***********");
}


s.wait(VoidItem, 300);
s.click(VoidItem.similar((float)0.5));
   
}

@Test(priority = 41)
 public void sikuliTestCase041(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_041:Verify Small Americano Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	s.wait(Beverages1,300);
	s.click(Beverages1);
	Thread.sleep(2000);
	s.wait(Americano,300);
	s.click(Americano);
	s.wait(SmallAmericano,300);
	s.click(SmallAmericano);
	testcase.log(Status.PASS, "User able to click on Small Americano");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SmallAmericanoPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SmallAmericanoPricewithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.SM_Americano_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.SM_Americano_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Small Americano " );
	System.out.println("***********Scenario035 PASS: Correct ala carte price of Small Americano ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Small Americano. "+"Expected Price: "+SM_Americano_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario041 FAIL: Incorrect ala carte price of Small Americano ***********");
	}
	
	
	s.wait(VoidItem, 100);
	s.click(VoidItem.similar((float)0.5));
}
@Test(priority = 42)
public void sikuliTestCase042(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_042:Verify Medium Americano Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	Thread.sleep(2000);
	s.wait(Americano,300);
	s.click(Americano);
	s.wait(MediumAmericano,300);
	s.click(MediumAmericano);
	testcase.log(Status.PASS, "User able to click on Medium Americano");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(410,205,70,50);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MediumAmericanoPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MediumAmericanoPricewithname");
	 
	  
    

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.MD_Americano_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.MD_Americano_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Medium Americano " );
	System.out.println("***********Scenario042 PASS: Correct ala carte price of Medium Americano ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Medium Americano. "+"Expected Price: "+MD_Americano_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario042 FAIL: Incorrect ala carte price of Medium Americano ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
	
}

@Test(priority = 43)
public void sikuliTestCase043(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_043:Verify Large Americano Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	s.wait(Americano,300);
	s.click(Americano);
	s.wait(LargeAmericano,300);
	s.click(LargeAmericano);
	testcase.log(Status.PASS, "User able to click on Large Americano");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LargeAmericanoPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LargeAmericanoPricewithname");
	 
	  
    

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.LG_Americano_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.LG_Americano_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Large Americano " );
	System.out.println("***********Scenario043 PASS: Correct ala carte price of Large Americano ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Large Americano. "+"Expected Price: "+LG_Americano_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario043 FAIL: Incorrect ala carte price of Large Americano ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
	
}

@Test(priority = 44)
public void sikuliTestCase044(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_044:Verify Refill Small Americano Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	s.wait(Americano,300);
	s.click(Americano);
	s.wait(RefillSmallAmericano,300);
	s.click(RefillSmallAmericano);
	testcase.log(Status.PASS, "User able to click on Refill Small Americano");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RefillSmallAmericanoPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RefillSmallAmericanoPricewithname");
	 
	  
    

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.RS_Americano_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.RS_Americano_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Refill Small Americano " );
	System.out.println("***********Scenario043 PASS: Correct ala carte price of Refill Small Americano ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Refill Small Americano. "+"Expected Price: "+RS_Americano_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario043 FAIL: Incorrect ala carte price of Refill Small Americano ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
	
}

@Test(priority = 45)
public void sikuliTestCase045(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_045:Verify Refill Medium Americano Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	s.wait(Americano,300);
	s.click(Americano);
	s.wait(RefillMediumAmericano,300);
	s.click(RefillMediumAmericano);
	testcase.log(Status.PASS, "User able to click on Refill Medium Americano");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(410,205,70,50);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RefillMediumAmericanoPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RefillMediumAmericanoPricewithname");
	 
	  
    

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.RM_Americano_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.RM_Americano_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Refill Medium Americano " );
	System.out.println("***********Scenario043 PASS: Correct ala carte price of Refill Medium Americano ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Refill Medium Americano. "+"Expected Price: "+RM_Americano_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario043 FAIL: Incorrect ala carte price of Refill Medium Americano ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
	
}

@Test(priority = 46)
public void sikuliTestCase046(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_046:Verify Refill Large Americano Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	s.wait(Americano,300);
	s.click(Americano);
	s.wait(RefillLargeAmericano,300);
	s.click(RefillLargeAmericano);
	testcase.log(Status.PASS, "User able to click on Refill Large Americano");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RefillLargeAmericanoPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RefillLargeAmericanoPricewithname");
	 
	  
    

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.RL_Americano_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.RL_Americano_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Refill Large Americano " );
	System.out.println("***********Scenario043 PASS: Correct ala carte price of Refill Large Americano ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Refill Large Americano. "+"Expected Price: "+RL_Americano_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario043 FAIL: Incorrect ala carte price of Refill Large Americano ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
	
}

@Test(priority = 47)
public void sikuliTestCase047(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_047:Verify Medium Redeye Iced Cappuccino Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	s.wait(Beverages1,300);
	s.click(Beverages1);
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	s.wait(FlavouredIcedCappuccino,300);
	s.click(FlavouredIcedCappuccino);
	s.wait(RedeyeIcedCapp,300);
	s.click(RedeyeIcedCapp);
	s.wait(MediumRedeyeIcedCapp,300);
	s.click(MediumRedeyeIcedCapp);
	testcase.log(Status.PASS, "User able to click on Medium Redeye Iced Cappuccino");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MediumRedeyeIcedCappuccinoPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MediumRedeyeIcedCappuccinoPricewithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.MD_Redeye_Iced_Capp_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.MD_Redeye_Iced_Capp_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Medium Redeye Iced Cappuccino " );
	System.out.println("***********Scenario047 PASS: Correct ala carte price of Medium Redeye Iced Cappuccino ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Medium Redeye Iced Cappuccino. "+"Expected Price: "+MD_Redeye_Iced_Capp_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario047 FAIL: Incorrect ala carte price of Medium Redeye Iced Cappuccino ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}

@Test(priority = 48)
public void sikuliTestCase048(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_048:Verify Large Redeye Iced Cappuccino Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	//s.wait(Beverages1,300);
	//s.click(Beverages1);
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	s.wait(FlavouredIcedCappuccino,300);
	s.click(FlavouredIcedCappuccino);
	s.wait(RedeyeIcedCapp,300);
	s.click(RedeyeIcedCapp);
	s.wait(LargeRedeyeIcedCapp,300);
	s.click(LargeRedeyeIcedCapp);
	testcase.log(Status.PASS, "User able to click on Large Redeye Iced Cappuccino");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LargeRedeyeIcedCappuccinoPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LargeRedeyeIcedCappuccinoPricewithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.LG_Redeye_Iced_Capp_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.LG_Redeye_Iced_Capp_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Large Redeye Iced Cappuccino " );
	System.out.println("***********Scenario048 PASS: Correct ala carte price of Large Redeye Iced Cappuccino ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Large Redeye Iced Cappuccino. "+"Expected Price: "+LG_Redeye_Iced_Capp_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario048 FAIL: Incorrect ala carte price of Large Redeye Iced Cappuccino ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}

@Test(priority = 49)
public void sikuliTestCase049(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_049:Verify Refill Medium Redeye Iced Cappuccino Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	//s.wait(Beverages1,300);
	//s.click(Beverages1);
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	s.wait(FlavouredIcedCappuccino,300);
	s.click(FlavouredIcedCappuccino);
	s.wait(RedeyeIcedCapp,300);
	s.click(RedeyeIcedCapp);
	s.wait(MediumRefillRedeyeIcedCapp,300);
	s.click(MediumRefillRedeyeIcedCapp);
	testcase.log(Status.PASS, "User able to click on Refill Medium Redeye Iced Cappuccino");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,35);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MediumRefillRedeyeIcedCappuccinoPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MediumRefillRedeyeIcedCappuccinoPricewithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.RM_Redeye_Iced_Capp_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.RM_Redeye_Iced_Capp_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Refill Medium Redeye Iced Cappuccino " );
	System.out.println("***********Scenario049 PASS: Correct ala carte price of Refill Medium Redeye Iced Cappuccino ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Refill Medium Redeye Iced Cappuccino. "+"Expected Price: "+RM_Redeye_Iced_Capp_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario049 FAIL: Incorrect ala carte price of Refill Medium Redeye Iced Cappuccino ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}
@Test(priority = 50)
public void sikuliTestCase050(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_50:Verify Refill Large Redeye Iced Cappuccino Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	//s.wait(Beverages1,300);
	//s.click(Beverages1);
	s.wait(IcedBeverages,300);
	s.click(IcedBeverages);
	s.wait(FlavouredIcedCappuccino,300);
	s.click(FlavouredIcedCappuccino);
	s.wait(RedeyeIcedCapp,300);
	s.click(RedeyeIcedCapp);
	s.wait(LargeRefillRedeyeIcedCapp,300);
	s.click(LargeRefillRedeyeIcedCapp);
	testcase.log(Status.PASS, "User able to click on Refill Large Redeye Iced Cappuccino");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RefillLargeRedeyeIcedCappuccinoPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RefillLargeRedeyeIcedCappuccinoPricewithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.RL_Redeye_Iced_Capp_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.RL_Redeye_Iced_Capp_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Refill Large Redeye Iced Cappuccino " );
	System.out.println("***********Scenario050 PASS: Correct ala carte price of Refill Large Redeye Iced Cappuccino ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Refill Large Redeye Iced Cappuccino. "+"Expected Price: "+RL_Redeye_Iced_Capp_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario050 FAIL: Incorrect ala carte price of Refill Large Redeye Iced Cappuccino ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}

@Test(priority = 51)
public void sikuliTestCase051(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_51:Verify Small Tea Latte Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	s.wait(Beverages1,300);
	s.click(Beverages1);
	s.wait(TeaLatteButton,500);
	s.click(TeaLatteButton);
	s.wait(TeaLatteButton2,500);
	s.click(TeaLatteButton2);
	s.wait(SMTeaLatte,300);
	s.click(SMTeaLatte);
	testcase.log(Status.PASS, "User able to click on Small Tea Latte");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SMTeaLattePrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SMTeaLattewithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.SM_Tea_Latte_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.SM_Tea_Latte_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Small Tea Latte " );
	System.out.println("***********Scenario05 PASS: Correct ala carte price of Small Tea Latte ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Small Tea Latte. "+"Expected Price: "+SM_Tea_Latte_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario051 FAIL: Incorrect ala carte price of Small Tea Latte ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}

@Test(priority = 52)
public void sikuliTestCase052(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_52:Verify Medium Tea Latte Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	//s.wait(Beverages1,300);
	//s.click(Beverages1);
	s.wait(TeaLatteButton,500);
	s.click(TeaLatteButton);
	s.wait(TeaLatteButton2,500);
	s.click(TeaLatteButton2);
	s.wait(MDTeaLatte,300);
	s.click(MDTeaLatte);
	testcase.log(Status.PASS, "User able to click on Medium Tea Latte");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(410,205,70,50);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MDTeaLattePrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MDTeaLattewithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.MD_Tea_Latte_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.MD_Tea_Latte_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Medium Tea Latte " );
	System.out.println("***********Scenario052 PASS: Correct ala carte price of Medium Tea Latte ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Medium Tea Latte. "+"Expected Price: "+MD_Tea_Latte_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario052 FAIL: Incorrect ala carte price of Medium Tea Latte ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}

@Test(priority = 53)
public void sikuliTestCase053(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_53:Verify Large Tea Latte Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	//s.wait(Beverages1,300);
	//s.click(Beverages1);
	s.wait(TeaLatteButton,500);
	s.click(TeaLatteButton);
	s.wait(TeaLatteButton2,500);
	s.click(TeaLatteButton2);
	s.wait(LGTeaLatte,300);
	s.click(LGTeaLatte);
	testcase.log(Status.PASS, "User able to click on Large Tea Latte");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LGTeaLattePrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LGTeaLattewithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.LG_Tea_Latte_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.LG_Tea_Latte_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Large Tea Latte " );
	System.out.println("***********Scenario053 PASS: Correct ala carte price of Large Tea Latte ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Large Tea Latte. "+"Expected Price: "+LG_Tea_Latte_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario053 FAIL: Incorrect ala carte price of Large Tea Latte ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}

@Test(priority = 54)
public void sikuliTestCase054(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_54:Verify Reffil Small Tea Latte Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	//s.wait(Beverages1,300);
	//s.click(Beverages1);
	s.wait(TeaLatteButton,500);
	s.click(TeaLatteButton);
	s.wait(TeaLatteButton2,500);
	s.click(TeaLatteButton2);
	s.wait(RSTeaLatte,300);
	s.click(RSTeaLatte);
	testcase.log(Status.PASS, "User able to click on Reffil Small Tea Latte");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(410,205,70,50);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RSTeaLattePrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RSTeaLattewithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.RS_Tea_Latte_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.RS_Tea_Latte_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Reffil Small Tea Latte " );
	System.out.println("***********Scenario054 PASS: Correct ala carte price of Reffil Small Tea Latte ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Reffil Small Tea Latte. "+"Expected Price: "+RS_Tea_Latte_price());
		testcase.addScreenCaptureFromPath(pricewithname);
		testcase.addScreenCaptureFromPath(imagePath);
	System.out.println("***********Scenario054 FAIL: Incorrect ala carte price of Reffil Small Tea Latte ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}

@Test(priority = 55)
public void sikuliTestCase055(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_55:Verify Reffil Medium Tea Latte Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	//s.wait(Beverages1,300);
	//s.click(Beverages1);
	s.wait(TeaLatteButton,500);
	s.click(TeaLatteButton);
	s.wait(TeaLatteButton2,500);
	s.click(TeaLatteButton2);
	s.wait(RMTeaLatte,300);
	s.click(RMTeaLatte);
	testcase.log(Status.PASS, "User able to click on Reffil Medium Tea Latte");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RMTeaLattePrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RMTeaLattewithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.RM_Tea_Latte_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.RM_Tea_Latte_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Reffil Medium Tea Latte " );
	System.out.println("***********Scenario055 PASS: Correct ala carte price of Reffil Small Tea Latte ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Refill Medium Tea Latte. "+"Expected Price: "+RM_Tea_Latte_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario055 FAIL: Incorrect ala carte price of Reffil Medium Tea Latte ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}

@Test(priority = 56)
public void sikuliTestCase056(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_56:Verify Reffil Large Tea Latte Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	//s.wait(Beverages1,300);
	//s.click(Beverages1);
	s.wait(TeaLatteButton,500);
	s.click(TeaLatteButton);
	s.wait(TeaLatteButton2,500);
	s.click(TeaLatteButton2);
	s.wait(RLTeaLatte,300);
	s.click(RLTeaLatte);
	testcase.log(Status.PASS, "User able to click on Reffil Large Tea Latte");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RLTeaLattePrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RLTeaLattewithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.RL_Tea_Latte_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.RL_Tea_Latte_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Reffil Large Tea Latte " );
	System.out.println("***********Scenario056 PASS: Correct ala carte price of Reffil Large Tea Latte ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Refill Large Tea Latte. "+"Expected Price: "+RM_Tea_Latte_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario056 FAIL: Incorrect ala carte price of Reffil Large Tea Latte ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}


@Test(priority = 57)
public void sikuliTestCase057(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_57:Verify Small London Fog Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	//s.wait(Beverages1,3000);
	//s.click(Beverages1);
	s.wait(TeaLatteButton,500);
	s.click(TeaLatteButton);
	s.wait(LondonFogButton, 500);
	s.click(LondonFogButton);
	s.wait(SMLondonFog,300);
	s.click(SMLondonFog);
	testcase.log(Status.PASS, "User able to click on Small London Fog ");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SMLondonFogPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "SMLondonFogwithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.SM_London_Fog_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.SM_London_Fog_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Small London Fog " );
	System.out.println("***********Scenario057 PASS: Correct ala carte price of Small London Fog ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Small London Fog. "+"Expected Price: "+SM_London_Fog_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario057 FAIL: Incorrect ala carte price of Small London Fog ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}

@Test(priority = 58)
public void sikuliTestCase058(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_58:Verify Medium London Fog Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	//s.wait(Beverages1,3000);
	//s.click(Beverages1);
	s.wait(TeaLatteButton,500);
	s.click(TeaLatteButton);
	s.wait(LondonFogButton, 500);
	s.click(LondonFogButton);
	s.wait(MDLondonFog,300);
	s.click(MDLondonFog);
	testcase.log(Status.PASS, "User able to click on Medium London Fog ");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(410,205,70,50);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MDLondonFogPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "MDLondonFogwithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.MD_London_Fog_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.MD_London_Fog_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Medium London Fog " );
	System.out.println("***********Scenario058 PASS: Correct ala carte price of Medium London Fog ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Medium London Fog. "+"Expected Price: "+MD_London_Fog_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario058 FAIL: Incorrect ala carte price of Medium London Fog ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}

@Test(priority = 59)
public void sikuliTestCase059(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_59:Verify Large London Fog Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	//s.wait(Beverages1,3000);
	//s.click(Beverages1);
	s.wait(TeaLatteButton,500);
	s.click(TeaLatteButton);
	s.wait(LondonFogButton, 500);
	s.click(LondonFogButton);
	s.wait(LGLondonFog,300);
	s.click(LGLondonFog);
	testcase.log(Status.PASS, "User able to click on Large London Fog ");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LGLondonFogPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LGLondonFogwithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.LG_London_Fog_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.LG_London_Fog_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Large London Fog " );
	System.out.println("***********Scenario059 PASS: Correct ala carte price of Large London Fog ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of  Large London Fog. "+"Expected Price: "+LG_London_Fog_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario059 FAIL: Incorrect ala carte price of Large London Fog ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}

@Test(priority = 60)
public void sikuliTestCase060(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_60:Verify Refill Small London Fog Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	//s.wait(Beverages1,3000);
	//s.click(Beverages1);
	s.wait(TeaLatteButton,500);
	s.click(TeaLatteButton);
	s.wait(LondonFogButton, 500);
	s.click(LondonFogButton);
	s.wait(RSLondonFog,300);
	s.click(RSLondonFog);
	testcase.log(Status.PASS, "User able to click on Refill Small London Fog ");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(410,205,70,50);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RSLondonFogPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RSLondonFogwithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.RS_London_Fog_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.RS_London_Fog_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Refilll Small London Fog " );
	System.out.println("***********Scenario060PASS: Correct ala carte price of Refill Small London Fog ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Refilll Small London Fog. "+"Expected Price: "+RS_London_Fog_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario060 FAIL: Incorrect ala carte price of Refill Small London Fog ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}

@Test(priority = 61)
public void sikuliTestCase061(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_61:Verify Refill Medium London Fog Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	//s.wait(Beverages1,3000);
	//s.click(Beverages1);
	s.wait(TeaLatteButton,500);
	s.click(TeaLatteButton);
	s.wait(LondonFogButton, 500);
	s.click(LondonFogButton);
	s.wait(RMLondonFog,300);
	s.click(RMLondonFog);
	testcase.log(Status.PASS, "User able to click on Refill Medium London Fog ");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RMLondonFogPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RMLondonFogwithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.RM_London_Fog_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.RM_London_Fog_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Refill Medium London Fog " );
	System.out.println("***********Scenario061 PASS: Correct ala carte price of Refill Medium London Fog ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Refill Medium London Fog. "+"Expected Price: "+RM_London_Fog_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario061 FAIL: Incorrect ala carte price of Refill Medium London Fog ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}
@Test(priority = 61)
public void sikuliTestCase062(ExtentReports extent, ExtentTest testcase)throws FindFailed, IOException, TesseractException, InterruptedException
{

	testcase=extent.createTest("TC_62:Verify Refill Large London Fog Price. "+"(Region Id: 7000054)");
	BeverageItems b = new BeverageItems(s);
	
	//s.wait(Beverages1,3000);
	//s.click(Beverages1);
	s.wait(TeaLatteButton,500);
	s.click(TeaLatteButton);
	s.wait(LondonFogButton, 500);
	s.click(LondonFogButton);
	s.wait(RLLondonFog,300);
	s.click(RLLondonFog);
	testcase.log(Status.PASS, "User able to click on Refill Large London Fog ");
	s.wait(EatIn, 300);  
	s.click(EatIn.similar((float)0.8));
	testcase.log(Status.PASS, "User able to click on Eat In");
	Thread.sleep(7000);
	Rectangle rectangle=new Rectangle();
	rectangle.setBounds(420,200,70,40);
	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RLLondonFogPrice");
	 rectangle.setBounds(210,200,275,30);
	 String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RLLondonFogwithname");
	 
	  
     

	System.out.println("price screen shot clicked");
	ITesseract image = new Tesseract();
	image.setDatapath(".\\tessdata");
	String imageText=image.doOCR(new File(imagePath));
	System.out.println("frompic "+imageText);
	System.out.println("fromexcel "+b.RL_London_Fog_price());
	
	String a1=null;
	String a2=null;

	String replaceAll = imageText.replaceAll("\\s","");
	
	a1 = replaceAll;
	a2 = String.valueOf(b.RL_London_Fog_price());
	System.out.println("from pic "+a1);
	System.out.println("from excel "+a2);

	int value=a1.compareTo(a2);
	System.out.println(value);
	if(a1.equals(a2)) {
		System.out.println("same");
	}
	if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Refill Large London Fog " );
	System.out.println("***********Scenario062 PASS: Correct ala carte price of Refill Large London Fog ***********");
	}
	else
	{
		testcase.log(Status.FAIL," Incorrect ala carte price of Refill Large London Fog. "+"Expected Price: "+RL_London_Fog_price());
		testcase.addScreenCaptureFromPath(pricewithname);
	System.out.println("***********Scenario062 FAIL: Incorrect ala carte price of Refill Large London Fog ***********");
	}
	
	
	s.wait(VoidItem, 300);
	s.click(VoidItem.similar((float)0.5));
}
}




