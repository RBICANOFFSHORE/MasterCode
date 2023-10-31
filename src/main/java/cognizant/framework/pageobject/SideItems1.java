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
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class SideItems1 extends Read_Data {

	Pattern Sides = new Pattern("C:/Images For Sikuli/Sides.png");
	Pattern VoidItem = new Pattern("C:\\Images For Sikuli\\VoidItem.png");
	Pattern EatIn = new Pattern("C:/Images For Sikuli/EatIn.png");
	Pattern NextButton = new Pattern("C:\\Images For Sikuli\\NextButton.png");
	Pattern DONUT_CLASSIC_HONEY_CRUELLER= new Pattern("C:\\Images For Sikuli\\DONUT_CLASSIC_HONEY_CRUELLER.png");
	Pattern  Donut_classic_old_fashioned_plain =  new Pattern("C:\\Images For Sikuli\\Donut_classic_old_fashioned_plain.png");
	Pattern  Donut_classic_sour_cream_glazed =  new Pattern("C:\\Images For Sikuli\\Donut_classic_sour_cream_glazed.png");
	Pattern  Donut_classic_chocolate_glazed =  new Pattern("C:\\Images For Sikuli\\Donut_classic_chocolate_glazed.png");
	Pattern  Donut_classic_honey_dip =  new Pattern("C:\\Images For Sikuli\\Donut_classic_honey_dip.png");
	Pattern  Donut_specialty_boston_cream =  new Pattern("C:\\Images For Sikuli\\Donut_specialty_boston_cream.png");
	Pattern  Donut_specialty_apple_fritter =  new Pattern("C:\\Images For Sikuli\\Donut_specialty_apple_fritter.png");
	Pattern  Donut_specialty_chocolate_dip =  new Pattern("C:\\Images For Sikuli\\Donut_specialty_chocolate_dip.png");
	Pattern  Donut_specialty_double_chocolate =  new Pattern("C:\\Images For Sikuli\\Donut_specialty_double_chocolate.png");
	Pattern  Donut_specialty_vanilla_dip =  new Pattern("C:\\Images For Sikuli\\Donut_specialty_vanilla_dip.png");
	
	
	
	Screen s;
	public SideItems1(Screen s) {
		// TODO Auto-generated constructor stub
		this.s =s;
	}
	
	@Test(priority = 29)
	public void siKuliTestCase029(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	{ 
		

		testcase=extent.createTest("TC_0029:Verify Donut classic honey crueller Price. "+"(Region Id: 7000054)" );
		//clickin on 
		SideItems1 b = new SideItems1(s);
        Thread.sleep(2000);
        s.wait(Sides,300);
		s.click(Sides.similar((float)0.5));
		s.wait(NextButton,300);
		s.click(NextButton.similar((float)0.5));
		
		s.wait(DONUT_CLASSIC_HONEY_CRUELLER,300);
		s.click(DONUT_CLASSIC_HONEY_CRUELLER.similar((float)0.5));
		
		
		
		testcase.log(Status.PASS, "User able to click on Donut classic honey crueller");
		
		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		
		
		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(410,205,70,50);
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "DonutclassichoneycruellerPrice");
		rectangle.setBounds(210,200,275,30);
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "DonutclassichoneycruellerPricewithname");
		
		Tesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
	    String imageText=image.doOCR(new File(imagePath));
	    System.out.println("From Image "+imageText);
	    System.out.println("From Excel "+b.read_Dnt_honey_crueller_Price());
	    String a1=null;
	    String a2=null;
	    
	    
	    //Price validation
	     String replaceAll = imageText.replaceAll("\\s","");
	     a1 = replaceAll;
	     a2 = b.read_Dnt_honey_crueller_Price();
	     System.out.println("from pic "+a1);
		 System.out.println("from excel "+a2);
       
	     if(a1.equals(a2)){
	    	 testcase.log(Status.PASS," Correct ala carte price of Donut classic honey crueller . ");
	    	 System.out.println("***********Scenario29 PASS: Correct ala carte price of Donut classic honey crueller.  ***********");
	     }else{
	    	 testcase.log(Status.FAIL," Incorrect ala carte price of Donut classic honey crueller ."+" Expected Price: "+b.read_Dnt_honey_crueller_Price() );
	    	 testcase.addScreenCaptureFromPath(pricewithname);
	    	 System.out.println("***********Scenario29 FAIL: Incorrect ala carte price of Donut classic honey crueller.***********");

	     }
	     s.wait(VoidItem, 300);
	     s.click(VoidItem.similar((float)0.5));
	    

	}
	
	
	@Test(priority = 30)
	public void siKuliTestCase030(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	{ 
		
		testcase=extent.createTest("TC_0030: Verify Donut classic old fashioned plain Price. "+"(Region Id: 7000054)");


		SideItems1 b = new SideItems1(s);
        Thread.sleep(2000);
        s.wait(Sides,300);
		s.click(Sides.similar((float)0.5));
		s.wait(NextButton,300);
		s.click(NextButton.similar((float)0.5));
		
		s.wait(Donut_classic_old_fashioned_plain,300);
		s.click(Donut_classic_old_fashioned_plain.similar((float)0.5));
		
		testcase.log(Status.PASS, "User able to click on Donut classic old fashioned plain");
		
		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
     testcase.log(Status.PASS, "User able to click on Eat In");
		
		
		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,70,40);
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Donut_classic_old_fashioned_plain_price");
		rectangle.setBounds(210,200,275,30);
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Donut_classic_old_fashioned_plain_price_withname");
		
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
	    String imageText=image.doOCR(new File(imagePath));
	    System.out.println(imageText);
	    System.out.println(b.read_dnt_old_fashioned_plain_price());
	    String a1=null;
	    String a2=null;
	    
	    
	    //Price validation
	     String replaceAll = imageText.replaceAll("\\s","");
	     a1 = replaceAll;
	     a2 = b.read_dnt_old_fashioned_plain_price();
	     System.out.println(a1);
	     System.out.println(a2);
	     
       
	     if(a1.equals(a2)){
		testcase.log(Status.PASS," Correct ala carte price of Donut classic old fashioned plain"); 
		 System.out.println("***********Scenario30 PASS: Correct ala carte price of Donut classic old fashioned plain.  ***********");
	     }
	     else {
		 
		 testcase.log(Status.FAIL," Incorrect ala carte price of Donut classic old fashioned plain."+" Expected Price: "+b.read_dnt_old_fashioned_plain_price());
		 testcase.addScreenCaptureFromPath(pricewithname);
		 System.out.println("***********Scenario30 FAIL: Incorrect ala carte price of Donut classic old fashioned plain.***********");

	     }
		 
		 s.wait(VoidItem, 300);
	     s.click(VoidItem.similar((float)0.5));
	}



	@Test(priority = 31)
	public void siKuliTestCase031(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	{ 
		

		testcase=extent.createTest("TC_0031: Verify Donut classic sour cream glazed Price. "+"(Region Id: 7000054)");


		SideItems1 b = new SideItems1(s);
		Thread.sleep(2000);
		s.wait(Sides,300);
		s.click(Sides.similar((float)0.5));
		s.wait(NextButton,300);
		s.click(NextButton.similar((float)0.5));

		s.wait(NextButton,300);
		s.click(NextButton.similar((float)0.5));

		s.wait(Donut_classic_sour_cream_glazed,300);
		s.click(Donut_classic_sour_cream_glazed.similar((float)0.5));


		testcase.log(Status.PASS, "User able to click on Donut classic sour cream glazed");


		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,70,40);
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Donut_classic_sour_cream_glazed_price");
		rectangle.setBounds(210,200,275,30);
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Donut_classic_sour_cream_glazed_price_withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);
        System.out.println(b.read_dnt__sour_cream_glazed_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;
		
		a2 = b.read_dnt__sour_cream_glazed_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			testcase.log(Status.PASS," Correct ala carte price of Donut classic sour cream glazed");
			System.out.println("***********Scenario31 PASS: Correct ala carte price of Donut classic sour cream glazed.  ***********");
		}
		else 
		{

			testcase.log(Status.FAIL," Incorrect ala carte price of Donut classic sour cream glazed."+" Expected Price: "+b.read_dnt__sour_cream_glazed_price());
            testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario31 FAIL: Incorrect ala carte price of Donut classic sour cream glazed.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
    }




	@Test(priority = 32)
	public void siKuliTestCase032(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	{ 

		testcase=extent.createTest("TC_0032: Verify Donut classic chocolate glazed Price. "+"(Region Id: 7000054)");


		SideItems1 b = new SideItems1(s);
		Thread.sleep(2000);
		s.wait(Sides,300);
		s.click(Sides.similar((float)0.5));
		



		s.wait(Donut_classic_chocolate_glazed,300);
		s.click(Donut_classic_chocolate_glazed.similar((float)0.5));

		testcase.log(Status.PASS, "User able to click on Donut classic chocolate glazed");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,70,40);
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Donut_classic_chocolate_glazed_price");
		rectangle.setBounds(210,200,275,30);
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Donut_classic_chocolate_glazed_price_withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_dnt_chocolate_glazed_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;


		a2 = b.read_dnt_chocolate_glazed_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			testcase.log(Status.PASS," Correct ala carte price of Donut classic chocolate glazed");
			System.out.println("***********Scenario32 PASS: Correct ala carte price of Donut classic chocolate glazed.  ***********");
		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Donut classic chocolate glazed."+" Expected Price: "+read_dnt_chocolate_glazed_price());
            testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario32 FAIL: Incorrect ala carte price of Donut classic chocolate glazed.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
}



	@Test(priority = 33)
	public void siKuliTestCase033(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	{ 

		testcase=extent.createTest("TC_0033: Verify Donut classic honey dip Price. "+"(Region Id: 7000054)");


		SideItems1 b = new SideItems1(s);
		Thread.sleep(2000);
		s.wait(Sides,300);
		s.click(Sides.similar((float)0.5));
		s.wait(NextButton,300);
		s.click(NextButton.similar((float)0.5));



		s.wait(Donut_classic_honey_dip,300);
		s.click(Donut_classic_honey_dip.similar((float)0.5));

		testcase.log(Status.PASS, "User able to click on Donut classic honey dip");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,70,40);
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Donut_classic_honey_dip_price");
		rectangle.setBounds(210,200,275,30);
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Donut_classic_honey_dip_price_withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_dnt_honey_dip_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;


		a2 = b.read_dnt_honey_dip_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			testcase.log(Status.PASS," Correct ala carte price of Donut classic honey dip");
			System.out.println("***********Scenario33 PASS: Correct ala carte price of Donut classic honey dip.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Donut classic honey dip."+" Expected Price: "+read_dnt_honey_dip_price());


			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario33 FAIL: Incorrect ala carte price of Donut classic honey dip.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
      }







	

	@Test(priority = 34)
	public void siKuliTestCase034(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	{ 



		testcase=extent.createTest("TC_0034: Verify Donut specialty boston cream Price. "+"(Region Id: 7000054)");


		SideItems1 b = new SideItems1(s);
		Thread.sleep(2000);
		s.wait(Sides,300);
		s.click(Sides.similar((float)0.5));
		


		s.wait(Donut_specialty_boston_cream,300);
		s.click(Donut_specialty_boston_cream.similar((float)0.5));

		testcase.log(Status.PASS, "User able to click on Donut specialty boston cream");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,70,40);
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Donut_specialty_boston_cream_price");
		rectangle.setBounds(210,200,275,30);
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Donut_specialty_boston_cream_price_withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_dnt_boston_cream_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		
		a2 = b.read_dnt_boston_cream_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			testcase.log(Status.PASS," Correct ala carte price of Donut specialty boston cream");
			System.out.println("***********Scenario34 PASS: Correct ala carte price of Donut specialty boston cream.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Donut specialty boston cream."+" Expected Price: "+read_dnt_boston_cream_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario34 FAIL: Incorrect ala carte price of Donut specialty boston cream.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
      }



	@Test(priority = 35)
	public void siKuliTestCase035(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	{ 

		testcase=extent.createTest("TC_0035: Verify Donut specialty apple fritter Price. "+"(Region Id: 7000054)");


		SideItems1 b = new SideItems1(s);
		Thread.sleep(2000);
		s.wait(Sides,300);
		s.click(Sides.similar((float)0.5));
		



		s.wait(Donut_specialty_apple_fritter,300);
		s.click(Donut_specialty_apple_fritter.similar((float)0.5));

		testcase.log(Status.PASS, "User able to click on Donut specialty apple fritter");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,70,40);
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Donut_specialty_apple_fritter_price");
		rectangle.setBounds(210,200,275,30);
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Donut_specialty_apple_fritter_price_withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_dnt_apple_fritter_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;


		a2 = b.read_dnt_apple_fritter_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			testcase.log(Status.PASS," Correct ala carte price of Donut specialty apple fritter");
			System.out.println("***********Scenario35 PASS: Correct ala carte price of Donut specialty apple fritter.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Donut specialty apple fritter."+" Expected Price: "+read_dnt_apple_fritter_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario35 FAIL: Incorrect ala carte price of Donut specialty apple fritter.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	}


	@Test(priority = 36)
	public void siKuliTestCase036(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	{ 
		

		testcase=extent.createTest("TC_0036: Verify Donut specialty chocolate dip Price. "+"(Region Id: 7000054)");


		SideItems1 b = new SideItems1(s);
		Thread.sleep(2000);
		s.wait(Sides,300);
		s.click(Sides.similar((float)0.5));
		



		s.wait(Donut_specialty_chocolate_dip,300);
		s.click(Donut_specialty_chocolate_dip.similar((float)0.5));

		testcase.log(Status.PASS, "User able to click on Donut specialty chocolate dip");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,70,40);
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Donut_specialty_chocolate_dip_price"
				+ "");
		rectangle.setBounds(210,200,275,30);
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Donut_specialty_chocolate_dip_price_withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_dnt_chocolate_dip_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;


		a2 = b.read_dnt_chocolate_dip_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			testcase.log(Status.PASS," Correct ala carte price of Donut specialty chocolate dip");
			System.out.println("***********Scenario36 PASS: Correct ala carte price of Donut specialty chocolate dip.  ***********");


		}
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Donut specialty chocolate dip."+" Expected Price: "+read_dnt_chocolate_dip_price());


			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario36 FAIL: Incorrect ala carte price of Donut specialty chocolate dip.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
}


	@Test(priority = 37)
	public void siKuliTestCase037(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	{ 


		testcase=extent.createTest("TC_0037: Verify Donut specialty double chocolate Price. "+"(Region Id: 7000054)");


		SideItems1 b = new SideItems1(s);
		Thread.sleep(2000);
		s.wait(Sides,300);
		s.click(Sides.similar((float)0.5));
		



		s.wait(Donut_specialty_double_chocolate,300);
		s.click(Donut_specialty_double_chocolate.similar((float)0.5));

		testcase.log(Status.PASS, "User able to click on Donut specialty double chocolate");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,70,40);
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Donut_specialty_double_chocolate_price");
		rectangle.setBounds(210,200,275,30);
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Donut_specialty_double_chocolate_price_withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_dnt_double_chocolate_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;

		a2 = b.read_dnt_double_chocolate_price();

		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			testcase.log(Status.PASS," Correct ala carte price of Donut specialty double chocolate");
			System.out.println("***********Scenario37 PASS: Correct ala carte price of Donut specialty double chocolate.  ***********");
         }
		else {

			testcase.log(Status.FAIL," Incorrect ala carte price of Donut specialty double chocolate."+" Expected Price: "+read_dnt_double_chocolate_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario37 FAIL: Incorrect ala carte price of Donut specialty double chocolate.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
}
	@Test(priority = 38)
	public void siKuliTestCase038(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException 
	{ 



		testcase=extent.createTest("TC_0038: Verify Donut specialty vanilla dip Price. "+"(Region Id: 7000054)");


		SideItems1 b = new SideItems1(s);
		Thread.sleep(2000);
		s.wait(Sides,300);
		s.click(Sides.similar((float)0.5));
		s.wait(NextButton,300);
		s.click(NextButton.similar((float)0.5));
		s.wait(NextButton,300);
		s.click(NextButton.similar((float)0.5));
		s.wait(NextButton,300);
		s.click(NextButton.similar((float)0.5));



		s.wait(Donut_specialty_vanilla_dip,300);
		s.click(Donut_specialty_vanilla_dip.similar((float)0.5));
		System.out.println("clicked");

		testcase.log(Status.PASS, "User able to click on Donut specialty vanilla dip");



		s.wait(EatIn, 300);  
		s.click(EatIn.similar((float)0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");


		Thread.sleep(4000);
		Rectangle rectangle=new Rectangle();
		rectangle.setBounds(420,200,70,40);
		String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Donut_specialty_vanilla_dip_price");
		rectangle.setBounds(210,200,275,30);
		String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Donut_specialty_vanilla_dip_price_withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText=image.doOCR(new File(imagePath));
		
		System.out.println(imageText);

		System.out.println(b.read_dnt_vanilla_dip_price());
		String a1=null;
		String a2=null;


		//Price validation
		String replaceAll = imageText.replaceAll("\\s","");
		a1 = replaceAll;


		a2 = b.read_dnt_vanilla_dip_price();
		System.out.println(a1);
		System.out.println(a2);


		if(a1.equals(a2)){

			testcase.log(Status.PASS," Correct ala carte price of Donut specialty vanilla dip");
			System.out.println("***********Scenario38 PASS: Correct ala carte price of Donut specialty vanilla dip.  ***********");


		}
		else {
			testcase.log(Status.FAIL," Incorrect ala carte price of Donut specialty vanilla dip."+" Expected Price: "+read_dnt_vanilla_dip_price());
           testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario38 FAIL: Incorrect ala carte price of Donut specialty vanilla dip.***********");


		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float)0.5));
	}

}
