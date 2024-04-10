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



public class Bagels extends Read_Data {

	Pattern  BagelsButton =  new Pattern("C:\\Images For Sikuli\\BagelsButton.png");
	Pattern  Sesame =  new Pattern("C:\\Images For Sikuli\\Sesame.png");
	Pattern  Bgl_Everything =  new Pattern("C:\\Images For Sikuli\\Bgl_Everything.png");
	Pattern  Bgl_CinnamonRaisin =  new Pattern("C:\\Images For Sikuli\\Bgl_CinnamonRaisin.png");
	Pattern  Bgl_Blueberry =  new Pattern("C:\\Images For Sikuli\\Bgl_Blueberry.png");
	Pattern  Bgl_12Grain =  new Pattern("C:\\Images For Sikuli\\Bgl_12Grain.png");
	Pattern  Bgl_Plain =  new Pattern("C:\\Images For Sikuli\\Bgl_Plain.png");
	Pattern VoidItem = new Pattern("C:\\Images For Sikuli\\VoidItem.png");
	Pattern EatIn = new Pattern("C:/Images For Sikuli/EatIn.png");
	Pattern Cheese_Chive_Bgl = new Pattern("C:\\Images For Sikuli\\Cheese_Chive_Bgl.png");
	Pattern Four_Cheese_Bgl =  new Pattern("C:\\Images For Sikuli\\Four_Cheese_Bgl.png");
	Pattern Jalapeno_Asiago_Bgl =  new Pattern("C:\\Images For Sikuli\\Jalapeno_Asiago_Bgl.png");
	Pattern Sundried_Tomato_Bgl =  new Pattern("C:\\Images For Sikuli\\Sundried_Tomato_Bgl.png");
	
	
	
	

	
	Screen s;
	public Bagels(Screen s) {
		// TODO Auto-generated constructor stub
		this.s =s;
	}
	
	@Test(priority = 001)
	public void siKuliTestCase01(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	{ 



		testcase=extent.createTest("TC_001: Verify Bagel Sesame Seed Price. "+"(Region Id: 7000054)");


		Bagels b = new Bagels(s);
		Thread.sleep(2000);
		s.wait(BagelsButton,300);
		s.click(BagelsButton.similar((float)0.5));
		s.wait(Sesame,300);
		s.click(Sesame.similar((float)0.5));
		System.out.println("clicked");

		testcase.log(Status.PASS, " User able to click on Bagel Sesame Seed ");

		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,70,40);
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "BglSesameprice");
		rectangle.setBounds(210,200,275,30);
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "BglSesamepricewithname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		
		System.out.println(imageText);

		System.out.println(b.Bgl_Sesame_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;
		a2 = b.Bgl_Sesame_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			testcase.log(Status.PASS," Correct ala carte price of Bagel Sesame Seed");
			System.out.println("***********Scenario38 PASS: Correct ala carte price of Bagel Sesame Seed.  ***********");


		}
		else {
			testcase.log(Status.FAIL," Incorrect ala carte price of Bagel Sesame Seed."+" Expected Price: "+Bgl_Sesame_price());
           testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario01 FAIL: Incorrect ala carte price of Bagel Sesame Seed.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	}
	
	@Test(priority = 002)
	public void siKuliTestCase02(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	{ 



		testcase=extent.createTest("TC_002: Verify Bagel Everything Price. "+"(Region Id: 7000054)");


		Bagels b = new Bagels(s);
		Thread.sleep(2000);
		s.wait(BagelsButton,300);
		s.click(BagelsButton.similar((float)0.5));
		s.wait(Bgl_Everything,300);
		s.click(Bgl_Everything.similar((float)0.5));
		System.out.println("clicked");

		testcase.log(Status.PASS, " User able to click on Bagel Everything ");

		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,70,40);
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "BglEverythingprice");
		rectangle.setBounds(210,200,275,30);
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "BglEverythingpricewithname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		
		System.out.println(imageText);

		System.out.println(b.Bgl_Everything_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;
		a2 = b.Bgl_Everything_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			testcase.log(Status.PASS," Correct ala carte price of Bagel Everything ");
			System.out.println("***********Scenario02 PASS: Correct ala carte price of Bagel Everything.  ***********");


		}
		else {
			testcase.log(Status.FAIL," Incorrect ala carte price of Bagel Everything."+" Expected Price: "+Bgl_Everything_price());
           testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario02 FAIL: Incorrect ala carte price of Bagel Everything.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	}
	
	@Test(priority = 003)
	public void siKuliTestCase03(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	{ 



		testcase=extent.createTest("TC_003: Verify Bagel Cinnamon Raisin Price. "+"(Region Id: 7000054)");


		Bagels b = new Bagels(s);
		Thread.sleep(2000);
		s.wait(BagelsButton,300);
		s.click(BagelsButton.similar((float)0.5));
		s.wait(Bgl_CinnamonRaisin,300);
		s.click(Bgl_CinnamonRaisin.similar((float)0.5));
		System.out.println("clicked");

		testcase.log(Status.PASS, " User able to click on Bagel Cinnamon Raisin ");

		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,70,40);
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "BgCinnamonRaisinprice");
		rectangle.setBounds(210,200,275,30);
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "BglCinnamonRaisinpricewithname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		
		System.out.println(imageText);

		System.out.println(b.Bgl_CINNAMON_RAISIN_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;
		a2 = b.Bgl_CINNAMON_RAISIN_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			testcase.log(Status.PASS," Correct ala carte price of Bagel Cinnamon Raisin ");
			System.out.println("***********Scenario03 PASS: Correct ala carte price of Bagel Cinnamon Raisin.  ***********");


		}
		else {
			testcase.log(Status.FAIL," Incorrect ala carte price of Bagel Cinnamon Raisin."+" Expected Price: "+Bgl_CINNAMON_RAISIN_price());
           testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario03 FAIL: Incorrect ala carte price of Bagel Cinnamon Raisin.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	}
	
	@Test(priority = 004)
	public void siKuliTestCase04(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	{ 



		testcase=extent.createTest("TC_004: Verify Bagel Bluberry Price. "+"(Region Id: 7000054)");


		Bagels b = new Bagels(s);
		Thread.sleep(2000);
		s.wait(BagelsButton,300);
		s.click(BagelsButton.similar((float)0.5));
		s.wait(Bgl_Blueberry,300);
		s.click(Bgl_Blueberry.similar((float)0.5));
		System.out.println("clicked");

		testcase.log(Status.PASS, " User able to click on Bagel Blueberry ");

		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,70,40);
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "BglBlueberryprice");
		rectangle.setBounds(210,200,275,30);
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "BglBlueberrypricewithname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		
		System.out.println(imageText);

		System.out.println(b.Bgl_Bluberry_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;
		a2 = b.Bgl_Bluberry_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			testcase.log(Status.PASS," Correct ala carte price of Bagel Blueberry ");
			System.out.println("***********Scenario04 PASS: Correct ala carte price of Bagel Blueberry.  ***********");


		}
		else {
			testcase.log(Status.FAIL," Incorrect ala carte price of Bagel Blueberry."+" Expected Price: "+Bgl_Bluberry_price());
           testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario04 FAIL: Incorrect ala carte price of Bagel Blueberry.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	}
	
	@Test(priority = 005)
	public void siKuliTestCase05(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	{ 



		testcase=extent.createTest("TC_005: Verify Bagel Twelve Grain Price. "+"(Region Id: 7000054)");


		Bagels b = new Bagels(s);
		Thread.sleep(2000);
		s.wait(BagelsButton,300);
		s.click(BagelsButton.similar((float)0.5));
		s.wait(Bgl_12Grain,300);
		s.click(Bgl_12Grain.similar((float)0.5));
		System.out.println("clicked");

		testcase.log(Status.PASS, " User able to click on Bagel Twelve Grain ");

		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,70,40);
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Bgl12Grainprice");
		rectangle.setBounds(210,200,275,30);
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Bgl12Grainpricewithname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		
		System.out.println(imageText);

		System.out.println(b.Bgl_12Grain_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;
		a2 = b.Bgl_12Grain_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			testcase.log(Status.PASS," Correct ala carte price of Bagel Twelve Grain ");
			System.out.println("***********Scenario05 PASS: Correct ala carte price of Bagel Twelve Grain.  ***********");


		}
		else {
			testcase.log(Status.FAIL," Incorrect ala carte price of Bagel Twelve Grain."+" Expected Price: "+Bgl_12Grain_price());
           testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario05 FAIL: Incorrect ala carte price of Bagel Twelve Grain.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	}
	
	@Test(priority = 006)
	public void siKuliTestCase06(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	{ 



		testcase=extent.createTest("TC_006: Verify Bagel Plain Price. "+"(Region Id: 7000054)");


		Bagels b = new Bagels(s);
		Thread.sleep(2000);
		s.wait(BagelsButton,300);
		s.click(BagelsButton.similar((float)0.5));
		s.wait(Bgl_Plain,300);
		s.click(Bgl_Plain.similar((float)0.5));
		System.out.println("clicked");

		testcase.log(Status.PASS, " User able to click on Bagel Plain ");

		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,70,40);
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "BglPlainprice");
		rectangle.setBounds(210,200,275,30);
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "BglPlainwithname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		
		System.out.println(imageText);

		System.out.println(b.Bgl_Plain_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;
		a2 = b.Bgl_Plain_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			testcase.log(Status.PASS," Correct ala carte price of Bagel Plain ");
			System.out.println("***********Scenario06 PASS: Correct ala carte price of Bagel Plain.  ***********");


		}
		else {
			testcase.log(Status.FAIL," Incorrect ala carte price of Bagel Plain."+" Expected Price: "+Bgl_Plain_price());
           testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario06 FAIL: Incorrect ala carte price of Bagel Plain.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	}

	@Test(priority = 007)
	public void siKuliTestCase07(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	{ 


		Bagels b = new Bagels(s);

		testcase=extent.createTest("TC_007: Verify Bagel Cheese Chive Price." + "Region Id: "+ b.read_Region_Id());
		
		Thread.sleep(2000);
		s.wait(BagelsButton,300);
		s.click(BagelsButton.similar((float)0.5));
		s.wait(Cheese_Chive_Bgl,300);
		s.click(Cheese_Chive_Bgl.similar((float)0.5));
		System.out.println("clicked");

		testcase.log(Status.PASS, " User able to click on Bagel Cheese Chive ");

		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,70,40);
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "BglCheese_Chiveprice");
		rectangle.setBounds(210,200,275,30);
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "BglCheese_Chivewithname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		
		System.out.println(imageText);

		System.out.println(b.Cheese_Chive_Bgl_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;
		a2 = b.Cheese_Chive_Bgl_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			testcase.log(Status.PASS," Correct ala carte price of Bagel Cheese Chive ");
			System.out.println("***********Scenario07 PASS: Correct ala carte price of Bagel Cheese Chive.  ***********");


		}
		else {
			testcase.log(Status.FAIL," Incorrect ala carte price of Bagel Cheese Chive."+" Expected Price: "+Cheese_Chive_Bgl_price());
           testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario07 FAIL: Incorrect ala carte price of Bagel Cheese Chive.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	}

	@Test(priority = 8)
	public void siKuliTestCase08(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	{ 


		Bagels b = new Bagels(s);

		testcase=extent.createTest("TC_008: Verify Bagel Four Cheese Price." + "Region Id: "+ b.read_Region_Id());
		
		Thread.sleep(2000);
		s.wait(BagelsButton,300);
		s.click(BagelsButton.similar((float)0.5));
		s.wait(Four_Cheese_Bgl,300);
		s.click(Four_Cheese_Bgl.similar((float)0.5));
		System.out.println("clicked");

		testcase.log(Status.PASS, " User able to click on Bagel Four Cheese ");

		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,70,40);
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "BglCheese_Chiveprice");
		rectangle.setBounds(210,200,275,30);
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "BglCheese_Chivewithname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		
		System.out.println(imageText);

		System.out.println(b.Four_Cheese_Bgl_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;
		a2 = b.Four_Cheese_Bgl_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			testcase.log(Status.PASS," Correct ala carte price of Bagel Four Cheese ");
			System.out.println("***********Scenario08 PASS: Correct ala carte price of Bagel Four Cheese.  ***********");


		}
		else {
			testcase.log(Status.FAIL," Incorrect ala carte price of Bagel Four Cheese."+" Expected Price: "+Four_Cheese_Bgl_price());
           testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario08 FAIL: Incorrect ala carte price of Bagel Four Cheese.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	}
	
	@Test(priority = 9)
	public void siKuliTestCase09(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	{ 


		Bagels b = new Bagels(s);

		testcase=extent.createTest("TC_009: Verify Bagel Sundried Tomato Price." + "Region Id: "+ b.read_Region_Id());
		
		Thread.sleep(2000);
		s.wait(BagelsButton,300);
		s.click(BagelsButton.similar((float)0.5));
		s.wait(Sundried_Tomato_Bgl,300);
		s.click(Sundried_Tomato_Bgl.similar((float)0.5));
		System.out.println("clicked");

		testcase.log(Status.PASS, " User able to click on Sundried Tomato ");

		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,70,40);
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Bgl_Sundried_Tomato_price");
		rectangle.setBounds(210,200,275,30);
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Bgl_Sundried_Tomato_Price_withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		
		System.out.println(imageText);

		System.out.println(b.Sundried_Tomato_Bgl_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;
		a2 = b.Sundried_Tomato_Bgl_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			testcase.log(Status.PASS," Correct ala carte price of Bagel Sundried Tomato ");
			System.out.println("***********Scenario09 PASS: Correct ala carte price of Bagel Sundried Tomato.  ***********");


		}
		else {
			testcase.log(Status.FAIL," Incorrect ala carte price of Bagel Sundried Tomato."+" Expected Price: "+Sundried_Tomato_Bgl_price());
           testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario09 FAIL: Incorrect ala carte price of Bagel Sundried Tomato.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	}
	
	@Test(priority = 10)
	public void siKuliTestCase010(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	{ 


		Bagels b = new Bagels(s);

		testcase=extent.createTest("TC_0010: Verify Bagel JALAPENO ASIAGO MOZZ Price." + "Region Id: "+ b.read_Region_Id());
		
		Thread.sleep(2000);
		s.wait(BagelsButton,300);
		s.click(BagelsButton.similar((float)0.5));
		s.wait(Jalapeno_Asiago_Bgl,300);
		s.click(Jalapeno_Asiago_Bgl.similar((float)0.5));
		System.out.println("clicked");

		testcase.log(Status.PASS, " User able to click on JALAPENO ASIAGO MOZZ ");

		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,70,40);
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "JALAPENO_ASIAGO_MOZZ_price");
		rectangle.setBounds(210,200,275,30);
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "JALAPENO ASIAGO_MOZZ_Price_withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		
		System.out.println(imageText);

		System.out.println(b.Jalapeno_Asiago_Bgl_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;
		a2 = b.Jalapeno_Asiago_Bgl_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			testcase.log(Status.PASS," Correct ala carte price of Bagel JALAPENO ASIAGO MOZZ ");
			System.out.println("***********Scenario010 PASS: Correct ala carte price of Bagel JALAPENO ASIAGO MOZZ.  ***********");


		}
		else {
			testcase.log(Status.FAIL," Incorrect ala carte price of Bagel JALAPENO ASIAGO MOZZ."+" Expected Price: "+Jalapeno_Asiago_Bgl_price());
           testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario010 FAIL: Incorrect ala carte price of Bagel JALAPENO ASIAGO MOZZ.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	}
	

}
