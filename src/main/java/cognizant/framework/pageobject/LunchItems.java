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
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//import excel.Read_Data;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class LunchItems extends Read_Data {
	
	ExtentReports extent;
	ExtentSparkReporter html;
	ExtentTest testcase;
	
	Pattern Lunch = new Pattern("C:\\Images For Sikuli\\Lunch.png");
  	Pattern Sandwiches1 = new Pattern("C:\\Images For Sikuli\\Sandwiches1.png");
  	Pattern TurkeyBaconClub = new Pattern("C:\\Images For Sikuli\\TurkeyBaconClub.png");
  	
  	Pattern Melt = new Pattern("C:\\Images For Sikuli\\Melt.png");
  	Pattern HamMelt = new Pattern("C:\\Images For Sikuli\\HamMelt.png");
  	
  	Pattern LoadedWraps = new Pattern("C:\\Images For Sikuli\\LoadedWraps.png");
  	Pattern CilantroWrap = new Pattern("C:\\Images For Sikuli\\CilantroWrap.png");
  	Pattern CrispyWrap = new Pattern("C:\\Images For Sikuli\\CrispyWrap.png");
  	Pattern FarmerSandwiches = new Pattern("C:\\Images For Sikuli\\FarmerSandwiches.png");
  	Pattern Belts = new Pattern("C:\\Images For Sikuli\\Belts.png");
  	Pattern BaconBelt = new Pattern("C:\\Images For Sikuli\\BaconBelt.png");
  	Pattern PlainBagel = new Pattern("C:\\Images For Sikuli\\PlainBagel.png");
  	Pattern ChooseBagel = new Pattern("C:\\Images For Sikuli\\ChooseBagel.png");
  	Pattern BlueberyBagel = new Pattern("C:\\Images For Sikuli\\BlueberyBagel.png");
  	Pattern HotBowls = new Pattern("C:\\Images For Sikuli\\HotBowls.png");
  	Pattern ChickenNoodle = new Pattern("C:\\Images For Sikuli\\ChickenNoodle.png");
  	Pattern BiscuitModifier = new Pattern("C:\\Images For Sikuli\\BiscuitModifier.png");
  	Pattern SausageModifier = new Pattern("C:\\Images For Sikuli\\SausageModifier.png");
  	Pattern SausageModifier1 = new Pattern("C:\\Images For Sikuli\\SausageModifier1.png");
  	
  	Pattern Bagels = new Pattern("C:\\Images For Sikuli\\Bagels.png");
  	Pattern GrainBagelPrePared = new Pattern("C:\\Images For Sikuli\\GrainBagelPrePared.png");
  	//Lunch Combo
	Pattern  Turkey_Bacon_Club_Combo =  new Pattern("C:\\Images For Sikuli\\Turkey_Bacon_Club_Combo.png");
  	Pattern  Grilled_Cheese_Melt_Combo =  new Pattern("C:\\Images For Sikuli\\Grilled_Cheese_Melt_Combo.png");
  	Pattern  Slow_Cooked_Chicken_Wrap_Combo =  new Pattern("C:\\Images For Sikuli\\Slow_Cooked_Chicken_Wrap_Combo.png");
  	Pattern  Crispy_Chicken_Wrap_Combo =  new Pattern("C:\\Images For Sikuli\\Crispy_Chicken_Wrap_Combo.png");
  	Pattern  ThreePC_Chicken_Strips_Combo =  new Pattern("C:\\Images For Sikuli\\3PC_Chicken_Strips_Combo.png");
  	Pattern  Ham_and_Cheddar_Combo =  new Pattern("C:\\Images For Sikuli\\Ham_and_Cheddar_Combo.png");
  	Pattern  Bacon_Grilled_Cheese_Melt_Combo =  new Pattern("C:\\Images For Sikuli\\Bacon_Grilled_Cheese_Melt_Combo.png");
  	Pattern  BLT_Combo =  new Pattern("C:\\Images For Sikuli\\BLT_Combo.png");
  	Pattern  Turkey_Melt_Combo =  new Pattern("C:\\Images For Sikuli\\Turkey_Melt_Combo.png");
  	Pattern  Slow_Cooked_Chkn_Bacon_Ranch_Wrap_Combo =  new Pattern("C:\\Images For Sikuli\\Slow_Cooked_Chkn_Bacon_Ranch_Wrap_Combo.png");
  	Pattern  Crispy_Chk_Bacon_Ranch_Wrap_Combo =  new Pattern("C:\\Images For Sikuli\\Crispy_Chk_Bacon_Ranch_Wrap_Combo.png");
  	Pattern  HotBowls1 = new Pattern("C:\\Images For Sikuli\\HotBowls1.png");
  	Pattern  ChickenNoodleSoup = new Pattern("C:\\Images For Sikuli\\ChickenNoodleSoup.png");
  	Pattern  LargeButton = new Pattern("C:\\Images For Sikuli\\LargeButton.png");
  	Pattern  Chilli = new Pattern("C:\\Images For Sikuli\\Chilli.png");
  	
  	
  
  	Pattern Breakfast = new Pattern("C:/Images For Sikuli/Breakfast.png"); 
  	Pattern Sandwiches = new Pattern("C:/Images For Sikuli/Sandwiches.png"); 
  	Pattern SausageBiscuit = new Pattern("C:/Images For Sikuli/SausageBiscuit.png"); 
  	Pattern Functions = new Pattern("C:/Images For Sikuli/Functions.png"); 
  	Pattern MinPOS = new Pattern("C:/Images For Sikuli/MinPOS.png"); 
  	Pattern EatIn = new Pattern("C:/Images For Sikuli/EatIn.png"); 
  	Pattern VoidItem = new Pattern("C:\\Images For Sikuli\\VoidItem.png");
  	
  //	******Lunch Wraps*******
  	Pattern Slow_Cooked_Chicken_Wrap = new Pattern("C:\\Images For Sikuli\\Slow_Cooked_Chicken_Wrap.png");
  	Pattern Crispy_Chicken_Wrap = new Pattern("C:\\Images For Sikuli\\Crispy_Chicken_Wrap.png");
  	Pattern Slow_Cooked_Chkn_Bacon_Ranch_Wrap = new Pattern("C:\\Images For Sikuli\\Slow_Cooked_Chkn_Bacon_Ranch_Wrap.png");
  	Pattern Crispy_Chk_Bacon_Ranch_Wrap = new Pattern("C:\\Images For Sikuli\\Crispy_Chk_Bacon_Ranch_Wrap.png");
  	Pattern Spicy_Chickn_Bacon_Ranch_Wrap = new Pattern("C:\\Images For Sikuli\\Spicy_Chickn_Bacon_Ranch_Wrap.png");
  	Pattern Lunch_Wrap_Button = new Pattern("C:\\Images For Sikuli\\Lunch_Wrap_Button.png");
  	
  // ********Lunch ALC Sandwiches********
  	Pattern Turkey_Bacon_Club = new Pattern("C:\\Images For Sikuli\\Turkey_Bacon_Club.png");
  	Pattern Roast_Beef_Cheddar = new Pattern("C:\\Images For Sikuli\\Roast_Beef_Cheddar.png");
  	Pattern Bacon_Grilled_Cheese_Melt = new Pattern("C:\\Images For Sikuli\\Bacon_Grilled_Cheese_Melt.png");
  	Pattern Lunch_Sandwiche_Button = new Pattern("C:\\Images For Sikuli\\Lunch_Sandwiche_Button.png");
  	Pattern Turkey_Melt = new Pattern("C:\\Images For Sikuli\\Turkey_Melt.png");
  	Pattern Ham_Melt = new Pattern("C:\\Images For Sikuli\\Ham_Melt.png");
  	
  	
  	
  	
  	
  	
  	
  	
    Screen s;
	private String readTurkeyBaconClubPrice;
	public LunchItems(Screen s) {
		// TODO Auto-generated constructor stub
		this.s =s;
		
	}
	
	@Test(priority = 29)
	public void sikuliTestCase029(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException
	{
		
		
		testcase=extent.createTest("TC_029:Verify BaconBeltPrice");
	    
		LunchItems b = new LunchItems(s);
		
		 Thread.sleep(2000); 
		s.wait(Lunch, 300);
 		s.click(Lunch.similar((float)0.5));
 		
 		 Thread.sleep(2000); 
 		s.wait(Sandwiches1, 300);
 		s.click(Sandwiches1.similar((float)0.5));
 		
 		 Thread.sleep(2000); 
 		s.wait(TurkeyBaconClub, 300);
 		s.click(TurkeyBaconClub.similar((float)0.5));
 		testcase.log(Status.PASS, "User able to click on TurkeyBaconClub");
 		s.wait(EatIn, 300);  
        s.click(EatIn.similar((float)0.8));
        testcase.log(Status.PASS, "User able to click on EatIn");
        Rectangle rectangle=new Rectangle();
		  rectangle.setBounds(420,200,60,30);
		  String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "TurkeyBaconClub");
		  ITesseract image = new Tesseract();
	      image.setDatapath(".\\tessdata");
	      String imageText=image.doOCR(new File(imagePath));
	      System.out.println(imageText);
	      System.out.println(b.readSausageBiscuitPrice());
	      String a1=null;
	      String a2=null;
	      
	       String replaceAll = imageText.replaceAll("\\s","");
	       a1 = replaceAll;
  	   a2 = b.readTurkeyBaconClubPrice;
  	   System.out.println(a1);
  	   System.out.println(a2);
	     
	      
	      if(a1.equals(a2)){
	    	  testcase.log(Status.PASS," Correct ala carte price of TurkeyBaconClubPrice" );
	    	  System.out.println("***********Scenario02 PASS: Correct ala carte price of TurkeyBaconClubPrice ***********");
	      }else{
	    	  testcase.log(Status.FAIL," Incorrect ala carte price of TurkeyBaconClubPrice" );
	    	  System.out.println("***********Scenario02 FAIL: Incorrect ala carte price of TurkeyBaconClubPrice ***********");
	      }
	    	  
	     // soft.assertEquals(imageText, b.readTurkeyBaconClubPrice());
	      
	      s.wait(VoidItem, 300);
	      s.click(VoidItem.similar((float)0.5));
	      
	
	}
	@Test(priority = 30)
    public void siKuliTestCase0030(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_030: Verify Turkey Bacon Club Combo Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);


		
		s.wait(Turkey_Bacon_Club_Combo,300);
		s.click(Turkey_Bacon_Club_Combo.similar((float)0.5));

		testcase.log(Status.PASS, "User able to click on Turkey bacon club combo");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,60,30);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Turkey_bacon_club_combo_Price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Turkey_bacon_club_combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_Turkey_Bacon_Club_Combo_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Turkey_Bacon_Club_Combo_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Turkey bacon club combo");

			 System.out.println("***********Scenario030 PASS: Correct ala carte price of Turkey bacon club combo.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Turkey bacon club combo."+" Expected Price: "+b.read_Turkey_Bacon_Club_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario030 FAIL: Incorrect ala carte price of Turkey bacon club combo.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	  }
  	  
	@Test(priority = 31)
    public void siKuliTestCase0031(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_031: Verify Grilled Cheese Melt Combo Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);


		
		s.wait(Grilled_Cheese_Melt_Combo,300);
		s.click(Grilled_Cheese_Melt_Combo.similar((float)0.5));

		testcase.log(Status.PASS, "User able to click on Grilled Cheese Melt Combo");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,60,30);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Grilled_Cheese_Melt_Combo_Price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Grilled_Cheese_Melt_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_Grilled_Cheese_Melt_Combo_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Grilled_Cheese_Melt_Combo_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Grilled Cheese Melt Combo");

			 System.out.println("***********Scenario031 PASS: Correct ala carte price of Grilled Cheese Melt Combo.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Grilled Cheese Melt Combo."+" Expected Price: "+b.read_Grilled_Cheese_Melt_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario031 FAIL: Incorrect ala carte price of Grilled Cheese Melt Combo.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	  }
  	  
	@Test(priority = 32)
    public void siKuliTestCase0032(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_032: Verify Slow Cooked Chicken Wrap Combo Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);


		
		s.wait(Slow_Cooked_Chicken_Wrap_Combo,300);
		s.click(Slow_Cooked_Chicken_Wrap_Combo.similar((float)0.5));

		testcase.log(Status.PASS, "User able to click on Slow Cooked Chicken Wrap Combo");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,60,30);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Slow_Cooked_Chicken_Wrap_Combo_combo_Price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Slow_Cooked_Chicken_Wrap_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_Slow_Cooked_Chicken_Wrap_Combo_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Slow_Cooked_Chicken_Wrap_Combo_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Slow Cooked Chicken Wrap Combo");

			 System.out.println("***********Scenario032 PASS: Correct ala carte price of Grilled Cheese Melt Combo.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Grilled Cheese Melt Combo."+" Expected Price: "+b.read_Slow_Cooked_Chicken_Wrap_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario032 FAIL: Incorrect ala carte price of Grilled Cheese Melt Combo.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	  }
  	  
	@Test(priority = 33)
    public void siKuliTestCase0033(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_033: Verify Crispy Chicken Wrap Combo Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);


		
		s.wait(Crispy_Chicken_Wrap_Combo,300);
		s.click(Crispy_Chicken_Wrap_Combo.similar((float)0.5));

		testcase.log(Status.PASS, "User able to click on Crispy Chicken Wrap Combo");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,60,30);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Crispy_Chicken_Wrap_Combo_Price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Crispy_Chicken_Wrap_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_Crispy_Chicken_Wrap_Combo_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Crispy_Chicken_Wrap_Combo_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Crispy Chicken Wrap Combo");

			 System.out.println("***********Scenario033 PASS: Correct ala carte price of Crispy Chicken Wrap Combo.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Crispy Chicken Wrap Combo."+" Expected Price: "+b.read_Crispy_Chicken_Wrap_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario033 FAIL: Incorrect ala carte price of Crispy Chicken Wrap Combo.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	  }
	
	@Test(priority = 34)
    public void siKuliTestCase0034(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_034: Verify 3pc chicken strips combo Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);


		
		s.wait(ThreePC_Chicken_Strips_Combo,300);
		s.click(ThreePC_Chicken_Strips_Combo.similar((float)0.5));

		testcase.log(Status.PASS, "User able to click on 3pc chicken strips combo");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,60,30);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "ThreePC_Chicken_Strips_Combo_Price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "ThreePC_Chicken_Strips_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_ThreePC_Chicken_Strips_Combo_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_ThreePC_Chicken_Strips_Combo_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of 3pc chicken strips combo");

			 System.out.println("***********Scenario034 PASS: Correct ala carte price of 3pc chicken strips combo.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of 3pc chicken strips combo."+" Expected Price: "+b.read_ThreePC_Chicken_Strips_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario034 FAIL: Incorrect ala carte price of 3pc chicken strips combo.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	  }
	
	@Test(priority = 35)
    public void siKuliTestCase0035(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_035: Verify Ham and Cheddar Combo Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);


		
		s.wait(Ham_and_Cheddar_Combo,300);
		s.click(Ham_and_Cheddar_Combo.similar((float)0.5));

		testcase.log(Status.PASS, "User able to click on Ham and Cheddar Combo");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,60,30);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Ham_and_Cheddar_Combo_Price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Ham_and_Cheddar_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_Ham_and_Cheddar_Combo_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Ham_and_Cheddar_Combo_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Ham and Cheddar Combo");

			 System.out.println("***********Scenario035 PASS: Correct ala carte price of Ham and Cheddar Combo.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Ham and Cheddar Combo."+" Expected Price: "+b.read_Ham_and_Cheddar_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario035 FAIL: Incorrect ala carte price of Ham and Cheddar Combo.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	  }
	
	@Test(priority = 36)
    public void siKuliTestCase0036(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_036: Verify Bacon Grilled Cheese Melt Combo Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);


		
		s.wait(Bacon_Grilled_Cheese_Melt_Combo,300);
		s.click(Bacon_Grilled_Cheese_Melt_Combo.similar((float)0.5));

		testcase.log(Status.PASS, "User able to click on Bacon Grilled Cheese Melt Combo");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,60,30);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Bacon_Grilled_Cheese_Melt_Combo_Price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Bacon_Grilled_Cheese_Melt_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_Bacon_Grilled_Cheese_Melt_Combo_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Bacon_Grilled_Cheese_Melt_Combo_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Bacon Grilled Cheese Melt Combo");

			 System.out.println("***********Scenario036 PASS: Correct ala carte price of Bacon grilled cheese melt combo.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Bacon Grilled Cheese Melt Combo."+" Expected Price: "+b.read_Bacon_Grilled_Cheese_Melt_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario036 FAIL: Incorrect ala carte price of Bacon grilled cheese melt combo.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	  }
	
	@Test(priority = 37)
    public void siKuliTestCase0037(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_037: Verify BLT Combo Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);


		
		s.wait(BLT_Combo,300);
		s.click(BLT_Combo.similar((float)0.5));

		testcase.log(Status.PASS, "User able to click on BLT Combo");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,60,30);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "BLT_Combo_price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "BLT_Combo_price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_BLT_Combo_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_BLT_Combo_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of BLT Combo");

			 System.out.println("***********Scenario037 PASS: Correct ala carte price of Blt combo.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of BLT Combo."+" Expected Price: "+b.read_BLT_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario037 FAIL: Incorrect ala carte price of Blt combo.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	  }

	@Test(priority = 38)
    public void siKuliTestCase0038(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_038: Verify Turkey Melt Combo Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);


		
		s.wait(Turkey_Melt_Combo,300);
		s.click(Turkey_Melt_Combo.similar((float)0.5));

		testcase.log(Status.PASS, "User able to click on Turkey Melt Combo");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,60,30);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Turkey_Melt_Combo_price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Turkey_Melt_Combo_price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_Turkey_Melt_Combo_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Turkey_Melt_Combo_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Turkey Melt Combo");

			 System.out.println("***********Scenario038 PASS: Correct ala carte price of Turkey melt combo.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Turkey melt combo."+" Expected Price: "+b.read_Turkey_Melt_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario038 FAIL: Incorrect ala carte price of Turkey Melt Combo.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	  }

	@Test(priority = 39)
    public void siKuliTestCase0039(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_039: Verify Slow Cooked Chicken Bacon Ranch Wrap Combo Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);


		
		s.wait(Slow_Cooked_Chkn_Bacon_Ranch_Wrap_Combo,300);
		s.click(Slow_Cooked_Chkn_Bacon_Ranch_Wrap_Combo.similar((float)0.5));

		testcase.log(Status.PASS, "User able to click on Slow Cooked Chicken Bacon Ranch Wrap combo");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,60,30);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Slow_Cooked_Chkn_Bacon_Ranch_Wrap_Combo_price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Slow_Cooked_Chkn_Bacon_Ranch_Wrap_Combo_price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_Slow_Cooked_Chkn_Bacon_Ranch_Wrap_Combo_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Slow_Cooked_Chkn_Bacon_Ranch_Wrap_Combo_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Slow Cooked Chicken Bacon Ranch Wrap Combo");

			 System.out.println("***********Scenario039 PASS: Correct ala carte price of Slow Cooked Chicken Bacon Ranch Wrap combo.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Slow Cooked Chicken Bacon Ranch Wrap Combo."+" Expected Price: "+b.read_Slow_Cooked_Chkn_Bacon_Ranch_Wrap_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario039 FAIL: Incorrect ala carte price of Slow Cooked Chicken Bacon Ranch Wrap combo.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	  }

	@Test(priority = 40)
    public void siKuliTestCase0040(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_040: Verify Crispy Chicken Bacon Ranch Wrap combo Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);


		
		s.wait(Crispy_Chk_Bacon_Ranch_Wrap_Combo,300);
		s.click(Crispy_Chk_Bacon_Ranch_Wrap_Combo.similar((float)0.5));

		testcase.log(Status.PASS, "User able to click on Crispy Chicken Bacon Ranch Wrap combo");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,60,30);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Crispy_Chk_Bacon_Ranch_Wrap_Combo__price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Crispy_Chk_Bacon_Ranch_Wrap_Combo_price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_Crispy_Chk_Bacon_Ranch_Wrap_Combo_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Crispy_Chk_Bacon_Ranch_Wrap_Combo_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Crispy Chicken Bacon Ranch Wrap combo");

			 System.out.println("***********Scenario040 PASS: Correct ala carte price of Crispy Chicken Bacon Ranch Wrap combo.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Crispy Chicken Bacon Ranch Wrap combo."+" Expected Price: "+b.read_Crispy_Chk_Bacon_Ranch_Wrap_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario040 FAIL: Incorrect ala carte price of Crispy Chicken Bacon Ranch Wrap combo.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	  }
	
	@Test(priority = 41)
    public void siKuliTestCase0041(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_041: Verify Regular Chicken Noodle Soup Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);

        s.wait(HotBowls1,300);
        s.click(HotBowls1.similar((float)0.5));
        testcase.log(Status.PASS, "User able to click on Hot Bowls");
		
		s.wait(ChickenNoodleSoup,300);
		s.click(ChickenNoodleSoup.similar((float)0.5));

		testcase.log(Status.PASS, "User is able to click on Regular Chicken Noodle Soup");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User is able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,65,35);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "ChickenNoodleSoup__price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "ChickenNoodleSoup_price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_RGChickenNoodleSoup_Price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_RGChickenNoodleSoup_Price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Regular Chicken Noodle Soup");

			 System.out.println("***********Scenario041 PASS: Correct ala carte price of Regular Chicken Noodle Soup.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Regular Chicken Noodle Soup."+" Expected Price: "+b.read_RGChickenNoodleSoup_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario040 FAIL: Incorrect ala carte price of Regular Chicken Noodle Soup.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	  }

	@Test(priority = 42)
    public void siKuliTestCase0042(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_042: Verify Large Chicken Noodle Soup Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);

        s.wait(HotBowls1,300);
        s.click(HotBowls1.similar((float)0.5));
        testcase.log(Status.PASS, "User able to click on Hot Bowls");
		
        s.wait(LargeButton,300);
        s.click(LargeButton.similar((float)0.5));
        
		s.wait(ChickenNoodleSoup,300);
		s.click(ChickenNoodleSoup.similar((float)0.5));

		testcase.log(Status.PASS, "User is able to click on Large Chicken Noodle Soup");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User is able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,65,35);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LGChickenNoodleSoup__price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LGChickenNoodleSoup_price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_LGChickenNoodleSoup_Price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_LGChickenNoodleSoup_Price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Large Chicken Noodle Soup");

			 System.out.println("***********Scenario042 PASS: Correct ala carte price of Large Chicken Noodle Soup.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Large Chicken Noodle Soup."+" Expected Price: "+b.read_LGChickenNoodleSoup_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario042 FAIL: Incorrect ala carte price of Large Chicken Noodle Soup.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	  }

	@Test(priority = 43)
    public void siKuliTestCase0043(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_043: Verify Regular Chili Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);

        s.wait(HotBowls1,300);
        s.click(HotBowls1.similar((float)0.5));
        testcase.log(Status.PASS, "User able to click on Hot Bowls");
        
		s.wait(Chilli,300);
		s.click(Chilli.similar((float)0.5));

		testcase.log(Status.PASS, "User is able to click on Regular Chili");


		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User is able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,65,35);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RGChili__price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "RGChili__price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_RGChili_Price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_RGChili_Price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Regular Chili");

			 System.out.println("***********Scenario043 PASS: Correct ala carte price of Regular Chili.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Regular Chili."+" Expected Price: "+b.read_RGChili_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario043 FAIL: Incorrect ala carte price of Regular Chili.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	  }

	@Test(priority = 44)
    public void siKuliTestCase0044(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_044: Verify Large Chili Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);

        s.wait(HotBowls1,300);
        s.click(HotBowls1.similar((float)0.5));
        testcase.log(Status.PASS, "User able to click on Hot Bowls");
		
        s.wait(LargeButton,300);
        s.click(LargeButton.similar((float)0.5));
        
		s.wait(Chilli,300);
		s.click(Chilli.similar((float)0.5));

		testcase.log(Status.PASS, "User is able to click on Large Chili");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User is able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,65,35);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LGChili__price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "LGChili__price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_LGChili_Price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_LGChili_Price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Large Chili");

			 System.out.println("***********Scenario044 PASS: Correct ala carte price of Large Chili.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Large Chili."+" Expected Price: "+b.read_LGChili_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario044 FAIL: Incorrect ala carte price of Large Chili.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	  }

	@Test(priority = 45)
    public void siKuliTestCase0045(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_045: Verify Slow Cooked Chicken Wrap Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);

        s.wait(Lunch_Wrap_Button,300);
        s.click(Lunch_Wrap_Button.similar((float)0.5));
        testcase.log(Status.PASS, "User able to click on Lunch Wrap");
        Thread.sleep(2000);
        
		s.wait(Slow_Cooked_Chicken_Wrap,300);
		s.click(Slow_Cooked_Chicken_Wrap.similar((float)0.5));

		testcase.log(Status.PASS, "User is able to click on Slow Cooked Chicken Wrap");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User is able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,65,35);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Slow_Cooked_Chicken_Wrap__price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Slow_Cooked_Chicken_Wrap__price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_Slow_Cooked_Chicken_Wrap_Price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Slow_Cooked_Chicken_Wrap_Price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Slow Cooked Chicken Wrap");

			 System.out.println("***********Scenario045 PASS: Correct ala carte price of Slow Cooked Chicken Wrap.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Slow Cooked Chicken Wrap."+" Expected Price: "+b.read_Slow_Cooked_Chicken_Wrap_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario045 FAIL: Incorrect ala carte price of Slow Cooked Chicken Wrap.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		
	  }
	
	@Test(priority = 46)
    public void siKuliTestCase0046(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_046: Verify Crispy Chicken Wrap Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);

        s.wait(Lunch_Wrap_Button,300);
        s.click(Lunch_Wrap_Button.similar((float)0.5));
        testcase.log(Status.PASS, "User able to click on Lunch Wrap");
        Thread.sleep(2000);
        
		s.wait(Crispy_Chicken_Wrap,300);
		s.click(Crispy_Chicken_Wrap.similar((float)0.5));

		testcase.log(Status.PASS, "User is able to click on Crispy Chicken Wrap");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User is able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,65,35);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Crispy_Chicken_Wrap__price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Crispy_Chicken_Wrap__price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_Crispy_Chicken_Wrap_Price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Crispy_Chicken_Wrap_Price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Crispy Chicken Wrap");

			 System.out.println("***********Scenario046 PASS: Correct ala carte price of Crispy Chicken Wrap.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Crispy Chicken Wrap."+" Expected Price: "+b.read_Crispy_Chicken_Wrap_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario046 FAIL: Incorrect ala carte price of Crispy Chicken Wrap.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		
	  }

	@Test(priority = 47)
    public void siKuliTestCase0047(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_047: Verify Slow Cooked Chicken Bacon Ranch Wrap Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);

        s.wait(Lunch_Wrap_Button,300);
        s.click(Lunch_Wrap_Button.similar((float)0.5));
        testcase.log(Status.PASS, "User able to click on Lunch Wrap");
        Thread.sleep(2000);
        
		s.wait(Slow_Cooked_Chkn_Bacon_Ranch_Wrap,300);
		s.click(Slow_Cooked_Chkn_Bacon_Ranch_Wrap.similar((float)0.5));

		testcase.log(Status.PASS, "User is able to click on Slow Cooked Chicken Bacon Ranch Wrap");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User is able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,65,35);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Slow_Cooked_Chicken_Bacon_Ranch_Wrap__price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Slow_Cooked_Chicken_Bacon_Ranch_Wrap__price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_Slow_Cooked_Chkn_Bacon_Ranch_Wrap_Price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Slow_Cooked_Chkn_Bacon_Ranch_Wrap_Price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Slow Cooked Chicken Bacon Ranch Wrap");

			 System.out.println("***********Scenario047 PASS: Correct ala carte price of Slow Cooked Chicken Bacon Ranch Wrap.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Slow Cooked Chicken Bacon Ranch Wrap."+" Expected Price: "+b.read_Slow_Cooked_Chkn_Bacon_Ranch_Wrap_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario047 FAIL: Incorrect ala carte price of Slow Cooked Chicken Bacon Ranch Wrap.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		
	  }
	
	@Test(priority = 48)
    public void siKuliTestCase0048(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_048: Verify Crispy Chicken Bacon Ranch Wrap Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);

        s.wait(Lunch_Wrap_Button,300);
        s.click(Lunch_Wrap_Button.similar((float)0.5));
        testcase.log(Status.PASS, "User able to click on Lunch Wrap");
        Thread.sleep(2000);
        
		s.wait(Crispy_Chk_Bacon_Ranch_Wrap,300);
		s.click(Crispy_Chk_Bacon_Ranch_Wrap.similar((float)0.5));

		testcase.log(Status.PASS, "User is able to click on Crispy Chicken Bacon Ranch Wrap");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User is able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,65,35);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Crispy_Chicken_Bacon_Ranch_Wrap__price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Crispy_Chicken_Bacon_Ranch_Wrap__price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_Crispy_Chk_Bacon_Ranch_Wrap_Price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Crispy_Chk_Bacon_Ranch_Wrap_Price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Crispy Chicken Bacon Ranch Wrap");

			 System.out.println("***********Scenario048 PASS: Correct ala carte price of Crispy Chicken Bacon Ranch Wrap.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Crispy Chicken Bacon Ranch Wrap."+" Expected Price: "+b.read_Crispy_Chk_Bacon_Ranch_Wrap_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario048 FAIL: Incorrect ala carte price of Crispy Chicken Bacon Ranch Wrap.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		
	  }
	
	@Test(priority = 49)
    public void siKuliTestCase0049(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_049: Verify Spicy Chicken Bacon Ranch Wrap Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);

        s.wait(Lunch_Wrap_Button,300);
        s.click(Lunch_Wrap_Button.similar((float)0.5));
        testcase.log(Status.PASS, "User able to click on Lunch Wrap");
        Thread.sleep(2000);
        
		s.wait(Spicy_Chickn_Bacon_Ranch_Wrap,300);
		s.click(Spicy_Chickn_Bacon_Ranch_Wrap.similar((float)0.5));

		testcase.log(Status.PASS, "User is able to click on Spicy Chicken Bacon Ranch Wrap");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User is able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,65,35);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Spicy_Chicken_Bacon_Ranch_Wrap__price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Spicy_Chicken_Bacon_Ranch_Wrap__price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_Spicy_Chickn_Bacon_Ranch_Wrap_Price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Spicy_Chickn_Bacon_Ranch_Wrap_Price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Spicy Chicken Bacon Ranch Wrap");

			 System.out.println("***********Scenario049 PASS: Correct ala carte price of Spicy Chicken Bacon Ranch Wrap.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Spicy Chicken Bacon Ranch Wrap."+" Expected Price: "+b.read_Spicy_Chickn_Bacon_Ranch_Wrap_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario049 FAIL: Incorrect ala carte price of Spicy Chicken Bacon Ranch Wrap.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		
	  }
	
	@Test(priority = 50)
    public void siKuliTestCase0050(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_050: Verify Turkey Bacon Club Sandwich Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);
		
		

        s.wait(Lunch_Sandwiche_Button,300);
        s.click(Lunch_Sandwiche_Button.similar((float)0.5));
        testcase.log(Status.PASS, "User able to click on Lunch Sandwiches");
        Thread.sleep(2000);
        
		s.wait(Turkey_Bacon_Club,300);
		s.click(Turkey_Bacon_Club.similar((float)0.5));

		testcase.log(Status.PASS, "User is able to click on Turkey Bacon Club Sandwich");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User is able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,65,35);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Turkey_Bacon_Club__price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Turkey_Bacon_Club_price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_Turkey_Bacon_Club_Price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Turkey_Bacon_Club_Price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Turkey Bacon Club Sandwich");

			 System.out.println("***********Scenario050 PASS: Correct ala carte price of Turkey Bacon Club Sandwich.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Turkey Bacon Club Sandwich."+" Expected Price: "+b.read_Turkey_Bacon_Club_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario050 FAIL: Incorrect ala carte price of Turkey Bacon Club Sandwich.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		
	  }
	
	@Test(priority = 51)
    public void siKuliTestCase0051(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_051: Verify Roast Beef & Cheddar Sandwich Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);
		
		

        s.wait(Lunch_Sandwiche_Button,300);
        s.click(Lunch_Sandwiche_Button.similar((float)0.5));
        testcase.log(Status.PASS, "User able to click on Lunch Sandwiches");
        Thread.sleep(2000);
        
		s.wait(Roast_Beef_Cheddar,300);
		s.click(Roast_Beef_Cheddar.similar((float)0.5));

		testcase.log(Status.PASS, "User is able to click on Roast Beef & Cheddar Sandwich");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User is able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(425, 200, 60, 35);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Roast_Beef_Cheddar_price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Roast_Beef_Cheddar_price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_Roast_Beef_Cheddar_Price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Roast_Beef_Cheddar_Price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Roast Beef & Cheddar Sandwich");

			 System.out.println("***********Scenario051 PASS: Correct ala carte price of Roast Beef & Cheddar Sandwich.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Roast Beef & Cheddar Sandwich."+" Expected Price: "+b.read_Roast_Beef_Cheddar_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario051 FAIL: Incorrect ala carte price of Roast Beef & Cheddar Sandwich.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		
	  }
	
	@Test(priority = 52)
    public void siKuliTestCase0052(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_052: Verify Bacon Grilled Cheese Melt Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);
		
		

        s.wait(Melt,300);
        s.click(Melt.similar((float)0.5));
        testcase.log(Status.PASS, "User able to click on Lunch Melts");
        Thread.sleep(2000);
        
		s.wait(Bacon_Grilled_Cheese_Melt,300);
		s.click(Bacon_Grilled_Cheese_Melt.similar((float)0.5));

		testcase.log(Status.PASS, "User is able to click on Bacon Grilled Cheese Melt");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User is able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(425,200,65,35);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Bacon_Grilled_Cheese_Melt_price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Bacon_Grilled_Cheese_Melt_price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_Bacon_Grilled_Cheese_Melt_Price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Bacon_Grilled_Cheese_Melt_Price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Roast Beef & Cheddar Sandwich");

			 System.out.println("***********Scenario052 PASS: Correct ala carte price of Bacon Grilled Cheese Melt.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Bacon Grilled Cheese Melt."+" Expected Price: "+b.read_Bacon_Grilled_Cheese_Melt_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			//testcase.addScreenCaptureFromPath(imagePath);
			System.out.println("***********Scenario052 FAIL: Incorrect ala carte price of Bacon Grilled Cheese Melt.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		
	  }
	
	@Test(priority = 53)
    public void siKuliTestCase0053(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_053: Verify Turkey Melt Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);
		
		

        s.wait(Melt,300);
        s.click(Melt.similar((float)0.5));
        testcase.log(Status.PASS, "User able to click on Lunch Melts");
        Thread.sleep(2000);
        
		s.wait(Turkey_Melt,300);
		s.click(Turkey_Melt.similar((float)0.5));

		testcase.log(Status.PASS, "User is able to click on Turkey Melt");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User is able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(425,200,65,35);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Turkey_Melt_price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Turkey_Melt_price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_Turkey_Melt_Price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Turkey_Melt_Price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Turkey Melt");

			 System.out.println("***********Scenario053 PASS: Correct ala carte price of Turkey Melt.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Turkey Melt."+" Expected Price: "+b.read_Turkey_Melt_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			//testcase.addScreenCaptureFromPath(imagePath);
			System.out.println("***********Scenario053 FAIL: Incorrect ala carte price of Turkey Melt.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		
	  }
	
	@Test(priority = 54)
    public void siKuliTestCase0054(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
    {	 
  
    	
    	LunchItems b = new LunchItems(s);
    	testcase=extent.createTest("TC_054: Verify Ham Melt Price. "+"Region Id: "+b.read_Region_Id());



		Thread.sleep(2000);
		s.wait(Lunch,300);
		s.click(Lunch.similar((float)0.5));
		testcase.log(Status.PASS, "User able to click on Lunch");
		Thread.sleep(2000);
		
		

        s.wait(Melt,300);
        s.click(Melt.similar((float)0.5));
        testcase.log(Status.PASS, "User able to click on Lunch Melts");
        Thread.sleep(2000);
        
		s.wait(Ham_Melt,300);
		s.click(Ham_Melt.similar((float)0.5));

		testcase.log(Status.PASS, "User is able to click on Ham Melt");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User is able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(425,200,65,35);
		
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Ham_Melt_price");
		rectangle.setBounds(210,200,275,30);

		
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Ham_Melt_price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
		
		System.out.println(b.read_Ham_Melt_Price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_Ham_Melt_Price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			 testcase.log(Status.PASS," Correct ala carte price of Ham Melt");

			 System.out.println("***********Scenario054 PASS: Correct ala carte price of Ham Melt.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Ham Melt."+" Expected Price: "+b.read_Ham_Melt_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			//testcase.addScreenCaptureFromPath(imagePath);
			System.out.println("***********Scenario054 FAIL: Incorrect ala carte price of Ham Melt.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		
	  }

	
    }

