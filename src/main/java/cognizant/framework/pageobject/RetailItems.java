package cognizant.framework.pageobject;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
/*import com.testcases.framework.BomgarTestCases;
import com.testcases.framework.BomgarTestScenerio;
import com.testcases.framework.Runner;*/

//import excel.Read_Data;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class RetailItems extends Read_Data {
	
	Pattern Retail = new Pattern("C:/Images For Sikuli/Retail.png"); 
  	Pattern TakeHome = new Pattern("C:/Images For Sikuli/TakeHome.png"); 
  	Pattern Consumables = new Pattern("C:/Images For Sikuli/Consumables.png"); 
  	Pattern MapleButter = new Pattern("C:/Images For Sikuli/MapleButter.png"); 
  	Pattern Hardware = new Pattern("C:\\Images For Sikuli\\Hardware.png");
  	Pattern Mugs = new Pattern("C:\\Images For Sikuli\\Mugs.png");
  	Pattern CeramicMug = new Pattern("C:\\Images For Sikuli\\CeramicMug.png");
  	Pattern Retail_Catrering = new Pattern("C:\\Images For Sikuli\\Retail_Catrering.png");
  	Pattern BYO_Lunch_Platter = new Pattern("C:\\Images For Sikuli\\BYO_Lunch_Platter.png");
  	Pattern Cater_Turkey_Bacon_Club = new Pattern("C:\\Images For Sikuli\\Cater_Turkey_Bacon_Club.png");
  	
  	
  	
  	Pattern Sides = new Pattern("C:/Images For Sikuli/Sides.png");
  	Pattern AssortedDonut = new Pattern("C:/Images For Sikuli/AssortedDonut.png");
  	Pattern AssortedPremiumDonut = new Pattern("C:/Images For Sikuli/AssortedPremiumDonut.png");
  	Pattern Donuts = new Pattern("C:/Images For Sikuli/Donuts.png"); 
  	Pattern ClassicDonut = new Pattern("C:/Images For Sikuli/ClassicDonut.png"); 
  	
  	Pattern Muffin = new Pattern("C:\\Images For Sikuli\\Muffin.png");
  	Pattern BlueberryMuffin = new Pattern("C:\\Images For Sikuli\\BlueberryMuffin.png");
  	Pattern BlueberryTimbits = new Pattern("C:\\Images For Sikuli\\BlueberryTimbits.png");
  	Pattern Timbits = new Pattern("C:\\Images For Sikuli\\Timbits.png");
  	Pattern Timbits10 = new Pattern("C:\\Images For Sikuli\\Timbits10.png");
  	
  	Pattern OtherSides = new Pattern("C:\\Images For Sikuli\\OtherSides.png");
  	Pattern Hashbrown = new Pattern("C:\\Images For Sikuli\\Hashbrown.png");
  	Pattern Functions = new Pattern("C:/Images For Sikuli/Functions.png"); 
  	Pattern MinPOS = new Pattern("C:/Images For Sikuli/MinPOS.png"); 
  	Pattern EatIn = new Pattern("C:/Images For Sikuli/EatIn.png"); 
  	Pattern VoidItem = new Pattern("C:\\Images For Sikuli\\VoidItem.png");
  	
  	Pattern  Cater_Crispy_Chicken_Bacon_Ranch_Wrap =  new Pattern("C:\\Images For Sikuli\\Cater_Crispy_Chicken_Bacon_Ranch_Wrap.png");
  	Pattern  Cater_Slow_Cooked_Chicken_Bacon_Ranch_Wrap =  new Pattern("C:\\Images For Sikuli\\Cater_Slow-Cooked_Chicken_Bacon_Ranch_Wrap.png");
  	Pattern  Cater_Egg_and_Cheese_Wrap =  new Pattern("C:\\Images For Sikuli\\Cater_Egg_and_Cheese_Wrap.png");
  	Pattern  BYO_Breakfast_Platter =  new Pattern("C:\\Images For Sikuli\\BYO_Breakfast_Platter.png");
  	Pattern  Cater_Lunch_Wrap_12 =  new Pattern("C:\\Images For Sikuli\\Cater_Lunch_Wrap_12.png");
  	Pattern  Cater_Lunch_Wrap_6 =  new Pattern("C:\\Images For Sikuli\\Cater_Lunch_Wrap_6.png");
  	
//  	Pattern  Retail_Catrering =  new Pattern("C:\\Images For Sikuli\\Retail_Catrering.png");
//  	
//  	Pattern BYO_Lunch_Platter = new Pattern("C:\\Images For Sikuli\\BYO_Lunch_Platter.png");
//  	Pattern Cater_Turkey_Bacon_Club = new Pattern("C:\\Images For Sikuli\\Cater_Turkey_Bacon_Club.png");
  	
    Screen s;
	public RetailItems(Screen s) {
		// TODO Auto-generated constructor stub
		this.s =s;
	}
	
	@Test(priority = 30)
	  public void siKuliTestCase030() throws FindFailed, IOException, TesseractException, InterruptedException 
	  {	 
		 
		 
		RetailItems b = new RetailItems(s);
		 
		    Thread.sleep(3000);
		    s.wait(Retail, 300);  
	        s.click(Retail.similar((float)0.5));
	        
	        Thread.sleep(2000); 
	        s.wait(TakeHome, 300);  
	        s.click(TakeHome.similar((float)0.5)); 
	        
	        Thread.sleep(2000); 
	        s.wait(Consumables, 300);  
	        s.click(Consumables.similar((float)0.5));
	        
	        Thread.sleep(2000); 
	        s.wait(MapleButter, 300);  
	        s.click(MapleButter.similar((float)0.5));
	        
	        s.wait(EatIn, 300);  
	        s.click(EatIn.similar((float)0.8));
	        
	      File Source = new File("MapleButterPrice.png");
	      String Path = System.getProperty("user.dir")+"/Images/MapleButterPrice.png";
	      FileHandler.copy(Source, new File(Path));
	      ITesseract image = new Tesseract();
	      image.setDatapath("C:\\Users\\873780\\workspace\\Tim_Hortons_NextGen.zip_expanded\\Tim_Hortons_NextGen\\tessdata");
	      String imageText=image.doOCR(new File(Path));
	      SoftAssert soft = new SoftAssert();
	      soft.assertEquals(imageText, b.readMapleButterPrice());
	      
	      System.out.println("***************************************Scenario 09 PASS: Retail item Price is correct****************************");
	      s.wait(VoidItem, 300);
	      s.click(VoidItem.similar((float)0.5));
	  }
	
	//code of catering
	@Test(priority = 1)
		public void siKuliTestCase001(ExtentReports extent, ExtentTest testcase)
				throws FindFailed, IOException, TesseractException, InterruptedException {
	 
			RetailItems b = new RetailItems(s);
			testcase = extent.createTest(
					"TC_001:Verify Cater Turkey Bacon Club Price" + "Region Id:" + b.read_Region_Id());
	 
			
			Thread.sleep(3000);
		    s.wait(Retail, 300);  
	        s.click(Retail.similar((float)0.5));
			testcase.log(Status.PASS, "User able to click on Retail");
			Thread.sleep(2000);
			s.wait(Retail_Catrering, 300);
			s.click(Retail_Catrering.similar((float) 0.5));
			testcase.log(Status.PASS, "User able to click on Catering");
			Thread.sleep(2000);
			s.wait(BYO_Lunch_Platter, 300);
			s.click(BYO_Lunch_Platter.similar((float) 0.5));
			testcase.log(Status.PASS, "User able to click on BYO Lunch Platter");
			s.wait(EatIn, 300);
			s.click(EatIn.similar((float) 0.8));
			testcase.log(Status.PASS, "User able to click on Eat In");
			Thread.sleep(2000);
			s.wait(Cater_Turkey_Bacon_Club, 300);
			s.click(Cater_Turkey_Bacon_Club.similar((float) 0.5));
			testcase.log(Status.PASS, "User able to click on Cater-Turkey Bacon Club");

	 
			Thread.sleep(4000);
			Rectangle rectangle = new Rectangle();
			rectangle.setBounds(420, 220, 65, 35);
			String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
					"Cater_Turkey_Bacon_Club_Price_Price");
			
			rectangle.setBounds(210, 222, 275, 30);
	 
			String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
					"Cater_Turkey_Bacon_Club_Price_Withname");
	 
			ITesseract image = new Tesseract();
			image.setDatapath(".\\tessdata");
			String imageText = image.doOCR(new File(imagePath));
			System.out.println(imageText);
			System.out.println(b.read_Cater_Turkey_Bacon_Club_Price());
			String a1 = null;
			String a2 = null;
	 
			String replaceAll = imageText.replaceAll("\\s", "");
			a1 = replaceAll;
			a2 =  b.read_Cater_Turkey_Bacon_Club_Price();
			System.out.println(a1);
			System.out.println(a2);
	 
			if (a1.equals(a2)) {
				testcase.log(Status.PASS, " Correct ala carte price of Cater-Turkey Bacon Club .");
				System.out.println(
						"***********Scenario001 PASS: Correct ala carte price of Cater-Turkey Bacon Club. ***********");
			} else {
				testcase.log(Status.FAIL, " Incorrect ala carte price of Cater-Turkey Bacon Club."
						+ " Expected Price: " + b.read_Cater_Turkey_Bacon_Club_Price());
				testcase.addScreenCaptureFromPath(pricewithname);
				System.out.println(
						"***********Scenario001 FAIL: Incorrect ala carte price of Cater-Turkey Bacon Club . ***********");
	 
			}
			s.wait(VoidItem, 300);
			s.click(VoidItem.similar((float) 0.5));
			s.wait(VoidItem, 300);
			s.click(VoidItem.similar((float) 0.5));
	 
		}
		
		
		@Test(priority = 2)
		public void siKuliTestCase002(ExtentReports extent, ExtentTest testcase)
				throws FindFailed, IOException, TesseractException, InterruptedException {
	 
			RetailItems b = new RetailItems(s);

			testcase=extent.createTest("TC_002: Verify Cater-Crispy Chicken Bacon Ranch Wrap Price. "+"Region Id: "+b.read_Region_Id());

			Thread.sleep(3000);
		    s.wait(Retail, 300);  
	        s.click(Retail.similar((float)0.5));
			testcase.log(Status.PASS, "User able to click on Retail");
			Thread.sleep(2000);
			s.wait(Retail_Catrering, 300);
			s.click(Retail_Catrering.similar((float) 0.5));
			testcase.log(Status.PASS, "User able to click on Catering");
			Thread.sleep(2000);
			s.wait(BYO_Lunch_Platter, 300);
			s.click(BYO_Lunch_Platter.similar((float) 0.5));
			testcase.log(Status.PASS, "User able to click on BYO Lunch Platter");
			s.wait(EatIn, 300);
			s.click(EatIn.similar((float) 0.8));
			testcase.log(Status.PASS, "User able to click on Eat In");
			Thread.sleep(2000);
			s.wait(Cater_Crispy_Chicken_Bacon_Ranch_Wrap, 300);
			s.click(Cater_Crispy_Chicken_Bacon_Ranch_Wrap.similar((float) 0.5));
			
			testcase.log(Status.PASS, "User able to click on Cater-Crispy Chicken Bacon Ranch Wrap");


	 
			Thread.sleep(4000);
			
			Rectangle rectangle = new Rectangle();
			rectangle.setBounds(420, 220, 65, 35);
			String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
					"Cater_Crispy_Chicken_Bacon_Ranch_Wrap_Price");
			
			rectangle.setBounds(210, 222, 275, 30);
	 
			String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
					"Cater_Crispy_Chicken_Bacon_Ranch_Wrap_Price_Withname");
	 
			ITesseract image = new Tesseract();
			image.setDatapath(".\\tessdata");
			String imageText = image.doOCR(new File(imagePath));
			System.out.println(imageText);
			System.out.println(b.read_Cater_Crispy_Chicken_Bacon_Ranch_Wrap_Price());//
			String a1 = null;
			String a2 = null;
	 
			String replaceAll = imageText.replaceAll("\\s", "");
			a1 = replaceAll;
			a2 = b.read_Cater_Crispy_Chicken_Bacon_Ranch_Wrap_Price();//
			System.out.println(a1);
			System.out.println(a2);

			 
			if (a1.equals(a2)) {
				
				 testcase.log(Status.PASS," Correct ala carte price of Cater-Crispy Chicken Bacon Ranch Wrap");

		
				System.out.println("***********Scenario02 PASS: Correct ala carte price of Cater-Crispy Chicken Bacon Ranch Wrap.  ***********");

			} else {
				testcase.log(Status.FAIL," Incorrect ala carte price of Cater-Crispy Chicken Bacon Ranch Wrap."+" Expected Price: "+b.read_Cater_Crispy_Chicken_Bacon_Ranch_Wrap_Price());

				testcase.addScreenCaptureFromPath(pricewithname);
			
				System.out.println("***********Scenario02 FAIL: Incorrect ala carte price of Cater-Crispy Chicken Bacon Ranch Wrap.***********");

	 
			}
			s.wait(VoidItem, 300);
			s.click(VoidItem.similar((float) 0.5));
			s.wait(VoidItem, 300);
			s.click(VoidItem.similar((float) 0.5));
	 
		
		}
		
		
		
		
		
		@Test(priority = 3)
		public void siKuliTestCase003(ExtentReports extent, ExtentTest testcase)
				throws FindFailed, IOException, TesseractException, InterruptedException {
	 
			RetailItems b = new RetailItems(s);

			testcase=extent.createTest("TC_003: Verify Cater-Slow-Cooked Chicken Bacon Ranch Wrap Price."+"Region Id: "+b.read_Region_Id());
	         
			
			Thread.sleep(3000); 
			s.wait(Retail, 300);
			s.click(Retail.similar((float)0.5));
			  testcase.log(Status.PASS, "User able to click on Retail");
			  Thread.sleep(2000);
			  s.wait(Retail_Catrering, 300);
			 s.click(Retail_Catrering.similar((float) 0.5)); 
			 testcase.log(Status.PASS,
			  "User able to click on Catering");
			 Thread.sleep(2000);
			 s.wait(BYO_Lunch_Platter, 300);
			 s.click(BYO_Lunch_Platter.similar((float)0.5));
			 testcase.log(Status.PASS, "User able to click on BYO Lunch Platter");
			  s.wait(EatIn, 300); 
			  s.click(EatIn.similar((float) 0.8));
			  testcase.log(Status.PASS, "User able to click on Eat In");
			  Thread.sleep(2000);
			  s.wait(Cater_Slow_Cooked_Chicken_Bacon_Ranch_Wrap, 300);
			  s.click(Cater_Slow_Cooked_Chicken_Bacon_Ranch_Wrap.similar((float) 0.5));
			  testcase.log(Status.PASS, "User able to click on Cater-Slow Cooked Chicken Bacon Ranch Wrap");
			  Thread.sleep(2000);
			  

				  Rectangle rectangle = new Rectangle();
				  rectangle.setBounds(420, 220, 65, 35);
				 String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "Cater_Slow_Cooked_Chicken_Bacon_Ranch_Wrap_Price");
				 
				 rectangle.setBounds(210, 222, 275, 30);
				 
				 String pricewithname = capture(rectangle).save(System.getProperty("user.dir")+ "/Image/", "Cater_Slow_Cooked_Chicken_Bacon_Ranch_Wrap_Price_Withname");
				  
				 ITesseract image = new Tesseract();
				  image.setDatapath(".\\tessdata"); 
				 String imageText = image.doOCR(new File(imagePath));
				 System.out.println(imageText);
				  System.out.println(read_Cater_Slow_Cooked_Chicken_Bacon_Ranch_Wrap_Price());

				  String a1=null; String a2=null;
				  
				  
				  //Price validation 
			String replaceAll = imageText.replaceAll("\\s",""); a1 =
				  replaceAll;
				  
				  
				  a2 = b.read_Cater_Slow_Cooked_Chicken_Bacon_Ranch_Wrap_Price();
				  
				  System.out.println("Price from picture in POS: "+a1);
				  System.out.println("Price from pricing sheet: "+a2);
				  
				  
				  if(a1.equals(a2)){
				  
				  testcase.log(Status.
				  PASS," Correct ala carte price of Cater-Slow-Cooked Chicken Bacon Ranch Wrap"
				  );
				  
				  System.out.
				  println("***********Scenario03 PASS: Correct ala carte price of Cater-Slow-Cooked Chicken Bacon Ranch Wrap.  ***********"
				  );
				  
				  
				  } else {
				  
				  testcase.log(Status.
				  FAIL," Incorrect ala carte price of Cater-Slow-Cooked Chicken Bacon Ranch Wrap."
				  +" Expected Price: "+b.read_Cater_Slow_Cooked_Chicken_Bacon_Ranch_Wrap_Price(
				  ));
				  
				  testcase.addScreenCaptureFromPath(pricewithname); System.out.
				  println("***********Scenario03 FAIL: Incorrect ala carte price of Cater-Slow-Cooked Chicken Bacon Ranch Wrap.***********"
				  );
				  
				  
				  }
				 s.wait(VoidItem, 300); 
				 s.click(VoidItem.similar((float)0.5));
				  s.wait(VoidItem, 300); 
				  s.click(VoidItem.similar((float) 0.5)); 
			 
		}
		
		
	@Test(priority = 4)
		public void siKuliTestCase004(ExtentReports extent, ExtentTest testcase)
				throws FindFailed, IOException, TesseractException, InterruptedException {
	 
			RetailItems b = new RetailItems(s);
		
			testcase=extent.createTest("TC_004: Verify Cater-Egg & Cheese Wrap Price. "+"Region Id: "+b.read_Region_Id());


			Thread.sleep(3000);
		    s.wait(Retail, 300);  
	        s.click(Retail.similar((float)0.5));
			testcase.log(Status.PASS, "User able to click on Retail");
			Thread.sleep(2000);
			s.wait(Retail_Catrering, 300);
			s.click(Retail_Catrering.similar((float) 0.5));
			testcase.log(Status.PASS, "User able to click on Catering");
			Thread.sleep(2000);
			s.wait(BYO_Breakfast_Platter, 300);
			s.click(BYO_Breakfast_Platter.similar((float) 0.5));
			testcase.log(Status.PASS, "User able to click on BYO Breakfast Platter");
			s.wait(EatIn, 300);
			s.click(EatIn.similar((float) 0.8));
			testcase.log(Status.PASS, "User able to click on Eat In");
			Thread.sleep(2000);
			
			s.wait(Cater_Egg_and_Cheese_Wrap, 300);
			s.click(Cater_Egg_and_Cheese_Wrap.similar((float) 0.5));
			
			testcase.log(Status.PASS, "User able to click on Cater-Egg & Cheese Wrap");

			Thread.sleep(2000);
			Rectangle rectangle=new Rectangle();
			rectangle.setBounds(420, 220, 65, 35);
			
			String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Cater_Egg_and_Cheese_Wrap_Price");
		
			
			ITesseract image = new Tesseract();
			image.setDatapath(".\\tessdata");
			String imageText=image.doOCR(new File(imagePath));
			System.out.println(imageText);

			rectangle.setBounds(210, 222, 275, 30);

			
			String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Cater_Egg_and_Cheese_Wrap_Price_Withname");

			//System.out.println(b.read_Cater_Egg_and_Cheese_Wrap_Price());
			String a1=null;
			String a2=null;


			//Price validation
			String replaceAll = imageText.replaceAll("\\s","");
			a1 = replaceAll;

			
			a2 = b.read_Cater_Egg_and_Cheese_Wrap_Price();
			
			
		      System.out.println("Price from picture in POS: "+a1);
		    System.out.println("Price from pricing sheet: "+a2);


			if(a1.equals(a2)){

				 testcase.log(Status.PASS," Correct ala carte price of Cater-Egg & Cheese Wrap");

				 System.out.println("***********Scenario04 PASS: Correct ala carte price of Cater-Egg & Cheese Wrap.  ***********");


			}
			else {

				testcase.log(Status.FAIL," Incorrect ala carte price of Cater-Egg & Cheese Wrap."+" Expected Price: "+b.read_Cater_Egg_and_Cheese_Wrap_Price());
		
				testcase.addScreenCaptureFromPath(pricewithname);
				System.out.println("***********Scenario04 FAIL: Incorrect ala carte price of Cater-Egg & Cheese Wrap.***********");


			}

		
			s.wait(VoidItem, 300);
			s.click(VoidItem.similar((float)0.5));
			s.wait(VoidItem, 300);
			s.click(VoidItem.similar((float)0.5));
		  }

	@Test(priority = 5)
	public void siKuliTestCase005(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
 
		RetailItems b = new RetailItems(s);
	
		testcase=extent.createTest("TC_005: Verify LUNCH WRAPS PLATTER - 12 PEOPLE Price. "+"Region Id: "+b.read_Region_Id());


		Thread.sleep(3000);
	    s.wait(Retail, 300);  
        s.click(Retail.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Retail");
		Thread.sleep(2000);
		s.wait(Retail_Catrering, 300);
		s.click(Retail_Catrering.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Catering");
		Thread.sleep(2000);
		s.wait(Cater_Lunch_Wrap_12, 300);
		s.click(Cater_Lunch_Wrap_12.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on LUNCH WRAPS PLATTER - 12 PEOPLE");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(2000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,60,30);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Cater_Lunch_Wrap12_Price");
	
		
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);

		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Cater_Lunch_Wrap12_Price_Withname");

		//System.out.println(b.read_Cater_Egg_and_Cheese_Wrap_Price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Cater_Lunch_Wrap12_Price();
		
		
	      System.out.println("Price from picture in POS: "+a1);
	    System.out.println("Price from pricing sheet: "+a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of LUNCH WRAPS PLATTER - 12 PEOPLE");

			 System.out.println("***********Scenario05 PASS: Correct ala carte price of LUNCH WRAPS PLATTER - 12 PEOPLE.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of LUNCH WRAPS PLATTER - 12 PEOPLE."+" Expected Price: "+b.read_Cater_Lunch_Wrap12_Price());
	
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario05 FAIL: Incorrect ala carte price of LUNCH WRAPS PLATTER - 12 PEOPLE.***********");


		}

	
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		
	  }
	
	@Test(priority = 6)
	public void siKuliTestCase006(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
 
		RetailItems b = new RetailItems(s);
	
		testcase=extent.createTest("TC_006: Verify LUNCH WRAPS BUNDLE - 6 PEOPLE Price. "+"Region Id: "+b.read_Region_Id());


		Thread.sleep(3000);
	    s.wait(Retail, 300);  
        s.click(Retail.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Retail");
		Thread.sleep(2000);
		s.wait(Retail_Catrering, 300);
		s.click(Retail_Catrering.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Catering");
		Thread.sleep(2000);
		s.wait(Cater_Lunch_Wrap_6, 300);
		s.click(Cater_Lunch_Wrap_6.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on LUNCH WRAPS BUNDLE - 6 PEOPLE");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(2000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,60,30);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Cater_Lunch_Wrap6_Price");
	
		
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);

		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Cater_Lunch_Wrap6_Price_Withname");

		//System.out.println(b.read_Cater_Egg_and_Cheese_Wrap_Price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Cater_Lunch_Wrap6_Price();
		
		
	      System.out.println("Price from picture in POS: "+a1);
	    System.out.println("Price from pricing sheet: "+a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of LUNCH WRAPS BUNDLE - 6 PEOPLE");

			 System.out.println("***********Scenario06 PASS: Correct ala carte price of LUNCH WRAPS BUNDLE - 6 PEOPLE.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of LUNCH WRAPS BUNDLE - 6 PEOPLE."+" Expected Price: "+b.read_Cater_Lunch_Wrap6_Price());
	
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario06 FAIL: Incorrect ala carte price of LUNCH WRAPS BUNDLE - 6 PEOPLE.***********");


		}

	
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		
	  }

}
