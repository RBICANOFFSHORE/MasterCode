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

public class BreakfastItems extends Read_Data {

	ExtentReports extent;
	ExtentSparkReporter html;
	ExtentTest testcase;

	Pattern Lunch = new Pattern("C:\\Images For Sikuli\\Lunch.png");
	Pattern Sandwiches1 = new Pattern("C:\\Images For Sikuli\\Sandwiches1.png");
	Pattern TurkeyBaconClub = new Pattern("C:\\Images For Sikuli\\TurkeyBaconClub.png");
	Pattern BrkSandwich = new Pattern("C:\\Images For Sikuli\\BrkSandwich.png");
	

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
	Pattern SausageCroissant = new Pattern("C:\\Images For Sikuli\\SausageCroissant.png");
	Pattern BiscuitModifier = new Pattern("C:\\Images For Sikuli\\BiscuitModifier.png");
	Pattern SausageModifier = new Pattern("C:\\Images For Sikuli\\SausageModifier.png");
	Pattern SausageModifier1 = new Pattern("C:\\Images For Sikuli\\SausageModifier1.png");

	Pattern Bagels = new Pattern("C:\\Images For Sikuli\\Bagels.png");
	Pattern GrainBagelPrePared = new Pattern("C:\\Images For Sikuli\\GrainBagelPrePared.png");

	Pattern Breakfast = new Pattern("C:/Images For Sikuli/Breakfast.png");
	Pattern Sandwiches = new Pattern("C:/Images For Sikuli/Sandwiches.png");
	// Pattern SausageBiscuit = new Pattern("C:/Images For
	// Sikuli/SausageBiscuit.png");
	Pattern Functions = new Pattern("C:/Images For Sikuli/Functions.png");
	Pattern MinPOS = new Pattern("C:/Images For Sikuli/MinPOS.png");
	Pattern EatIn = new Pattern("C:/Images For Sikuli/EatIn.png");
	Pattern VoidItem = new Pattern("C:\\Images For Sikuli\\VoidItem.png");
	Pattern OtherBrkFastButton = new Pattern("C:\\Images For Sikuli\\OtherBrkFastButton.png");
	Pattern DeliveryBundles = new Pattern("C:\\Images For Sikuli\\DeliveryBundles.png");
	Pattern ClassicBrkFstBundles = new Pattern("C:\\Images For Sikuli\\ClassicBrkFstBundles.png");
	Pattern FarmerBrkFstBundle = new Pattern("C:\\Images For Sikuli\\FarmerBrkFstBundle.png");
	Pattern ClassicBrkFstBundlesFor2 = new Pattern("C:\\Images For Sikuli\\ClassicBrkFstBundlesFor2.png");
	Pattern FarmerBrkFstBundleFor2 = new Pattern("C:\\Images For Sikuli\\FarmerBrkFstBundleFor2.png");
	Pattern Bacon_English_Muffin_Combo = new Pattern("C:\\Images For Sikuli\\Bacon_English_Muffin_Combo.png");
	Pattern Bacon_Biscuit_Combo = new Pattern("C:\\Images For Sikuli\\Bacon_Biscuit_Combo.png");
	Pattern Bacon_Bagel_Combo = new Pattern("C:\\Images For Sikuli\\Bacon_Bagel_Combo.png");
	Pattern Bacon_Classic_Wrap_Combo = new Pattern("C:\\Images For Sikuli\\Bacon_Classic_Wrap_Combo.png");
	Pattern Bacon_Farmers_Wrap_Combo = new Pattern("C:\\Images For Sikuli\\Bacon_Farmers_Wrap_Combo.png");
	Pattern Sausage_English_Muffin_Combo = new Pattern("C:\\Images For Sikuli\\Sausage_English_Muffin_Combo.png");
	Pattern Sausage_Biscuit_Combo = new Pattern("C:\\Images For Sikuli\\Sausage_Biscuit_Combo.png");
	Pattern Sausage_Bagel_Combo = new Pattern("C:\\Images For Sikuli\\Sausage_Bagel_Combo.png");
	Pattern Sausage_Classic_Wrap_Combo = new Pattern("C:\\Images For Sikuli\\Sausage_Classic_Wrap_Combo.png");
	Pattern Sausage_Farmers_Wrap_Combo = new Pattern("C:\\Images For Sikuli\\Sausage_Farmers_Wrap_Combo.png");
	Pattern Egg_and_Cheese_English_Muffin_Combo = new Pattern(
			"C:\\Images For Sikuli\\Egg _and_Cheese_English_Muffin_Combo.png");
	Pattern Egg_and_Cheese_Biscuit_Combo = new Pattern("C:\\Images For Sikuli\\Egg _and_Cheese_Biscuit_Combo.png");
	Pattern Egg_and_Cheese_Bagel_Combo = new Pattern("C:\\Images For Sikuli\\Egg_and_Cheese_Bagel_Combo.png");

	Pattern Sausage_and_Bacon_English_Muffin_Combo = new Pattern(
			"C:\\Images For Sikuli\\Sausage_and_Bacon_English_Muffin_Combo.png");
	Pattern Sausage_and_Bacon_Biscuit_Combo = new Pattern("C:\\Images For Sikuli\\Sausage_and_Bacon_Biscuit_Combo.png");
	Pattern Sausage_and_Bacon_Bagel_Combo = new Pattern("C:\\Images For Sikuli\\Sausage_and_Bacon_Bagel_Combo.png");
	Pattern Sausage_and_Bacon_Classic_Wrap_Combo = new Pattern(
			"C:\\Images For Sikuli\\Sausage_&_Bacon_Classic_Wrap_Combo.png");

	Pattern Bacon_Croissant_Combo = new Pattern("C:\\Images For Sikuli\\Bacon_Croissant_Combo.png");
	Pattern Bacon_Belt_Combo = new Pattern("C:\\Images For Sikuli\\Bacon_Belt_Combo.png");
	Pattern Sausage_Croissant_Combo = new Pattern("C:\\Images For Sikuli\\Sausage_Croissant_Combo.png");
	Pattern Sausage_Belt_Combo = new Pattern("C:\\Images For Sikuli\\Sausage_Belt_Combo.png");
	// ********Breakfast ALC*******

	Pattern SausageBiscuit = new Pattern("C:/Images For Sikuli/SausageBiscuit.png");
	Pattern Bacon_English_Muffin_Sandwich = new Pattern("C:\\Images For Sikuli\\Bacon_English_Muffin_Sandwich.png");
	Pattern Sausage_English_Muffin_Sandwich = new Pattern("C:\\Images For Sikuli\\Sausage_English_Muffin_Sandwich.png");
	Pattern Egg_and_Cheese_English_Muffin_Sandwich = new Pattern(
			"C:\\Images For Sikuli\\Egg_and_Cheese_English_Muffin_Sandwich.png");
	Pattern Sausage_and_Bacon_English_Muffin_Sandwich = new Pattern(
			"C:\\Images For Sikuli\\Sausage_and_Bacon_English_Muffin_Sandwich.png");
	Pattern Bacon_Biscuit_Sandwich = new Pattern("C:\\Images For Sikuli\\Bacon_Biscuit_Sandwich.png");
	Pattern Egg_and_Cheese_Biscuit_Sandwich = new Pattern("C:\\Images For Sikuli\\Egg_and_Cheese_Biscuit_Sandwich.png");
	Pattern Sausage_and_Bacon_Biscuit_Sandwich = new Pattern(
			"C:\\Images For Sikuli\\Sausage_and_Bacon_Biscuit_Sandwich.png");
	Pattern Bacon_Bagel_Sandwich = new Pattern("C:\\Images For Sikuli\\Bacon_Bagel_Sandwich.png");
	Pattern Sausage_Bagel_Sandwich = new Pattern("C:\\Images For Sikuli\\Sausage_Bagel_Sandwich.png");
	Pattern Egg_and_Cheese_Bagel_Sandwich = new Pattern("C:\\Images For Sikuli\\Egg_and_Cheese_Bagel_Sandwich.png");
	Pattern Sausage_and_Bacon_Bagel_Sandwich = new Pattern(
			"C:\\Images For Sikuli\\Sausage_and_Bacon_Bagel_Sandwich.png");
	Pattern Bacon_Croissant_Sandwich = new Pattern("C:\\Images For Sikuli\\Bacon_Croissant_Sandwich.png");
	Pattern Sausage_Croissant_Sandwich = new Pattern("C:\\Images For Sikuli\\Sausage_Croissant_Sandwich.png");
	Pattern Egg_and_Cheese_Croissant_Sandwich = new Pattern(
			"C:\\Images For Sikuli\\Egg_and_Cheese_Croissant_Sandwich.png");
	Pattern Sausage_and_Bacon_Croissant_Sandwich = new Pattern(
			"C:\\Images For Sikuli\\Sausage_and_Bacon_Croissant_Sandwich.png");
	Pattern Bacon_Everything_Croissant_Sandwich = new Pattern(
			"C:\\Images For Sikuli\\Bacon_Everything_Croissant_Sandwich.png");
	Pattern Sausage_Everything_Croissant_Sandwich = new Pattern(
			"C:\\Images For Sikuli\\Sausage_Everything_Croissant_Sandwich.png");
	Pattern SMBeans = new Pattern(
			"C:\\Images For Sikuli\\SMBeansh.png");
	Pattern RGBeans = new Pattern(
			"C:\\Images For Sikuli\\RGBeansh.png");
	Pattern Egg_and_Cheese_Everything_Croissant_Sandwich = new Pattern(
			"C:\\Images For Sikuli\\Egg_and_Cheese_Everything_Croissant_Sandwich.png");
	Pattern Simply_Sausage_English_Muffin_Sandwich = new Pattern(
			"C:\\Images For Sikuli\\Simply_Sausage_English_Muffin_Sandwich.png");
	Pattern Simply_Sausage_Biscuit_Sandwich = new Pattern(
			"C:\\Images For Sikuli\\Simply_Sausage_Biscuit_Sandwich.png");
	Pattern Steak_English_Muffin_Sandwich = new Pattern(
			"C:\\Images For Sikuli\\Steak_English_Muffin_Sandwich.png");
	Pattern Steak_Biscuit_Sandwich = new Pattern(
			"C:\\Images For Sikuli\\Steak_Biscuit_Sandwich.png");
	Pattern Smoky_Honey_Bacon_Biscuit = new Pattern(
			"C:\\Images For Sikuli\\Smoky_Honey_Bacon_Biscuit.png");
	Pattern Smoky_Honey_Bacon_English_Muffin = new Pattern(
			"C:\\Images For Sikuli\\Smoky_Honey_Bacon_English_Muffin.png");
	Pattern MoreBrkFastButton = new Pattern(
			"C:\\Images For Sikuli\\MoreBrkFastButton.png");
	//Breakfast wrpas
	Pattern  OMELETTE_BITES =  new Pattern("C:\\Images For Sikuli\\OMELETTE_BITES.png");
	Pattern  BRK_WRAP_BACON_GRILLED =  new Pattern("C:\\Images For Sikuli\\BRK_WRAP_BACON_GRILLED.png");
	Pattern  BRK_WRAP_BACON_GRILLED_NO_EGG =  new Pattern("C:\\Images For Sikuli\\BRK_WRAP_BACON_GRILLED_NO_EGG.png");
	Pattern  BRK_WRAP_EGG_GRILLED =  new Pattern("C:\\Images For Sikuli\\BRK_WRAP_EGG_GRILLED.png");
	Pattern  BRK_WRAP_SAUSAGE_GRILLED =  new Pattern("C:\\Images For Sikuli\\BRK_WRAP_SAUSAGE_GRILLED.png");
	Pattern  BRK_WRAP_SAUSAGE_GRILLED_NO_EGG =  new Pattern("C:\\Images For Sikuli\\BRK_WRAP_SAUSAGE_GRILLED_NO_EGG.png");
	Pattern OtherBrkFastWrapButton = new Pattern("C:\\Images For Sikuli\\OtherBrkFastWrapButton.png");
	Pattern Wraps = new Pattern("C:\\Images For Sikuli\\Wraps.png");
	Pattern Other_Brk_Sand_Button = new Pattern("C:\\Images For Sikuli\\OtherBrkSandButton.png");
	Pattern SmokyHoney_Bacon_Breakfast_sandwich = new Pattern("C:\\Images For Sikuli\\SmokyHoney_Bacon_Breakfast_sandwich.png");
	Pattern Craveables_Bundle= new Pattern("C:\\Images For Sikuli\\Craveables_Bundle.png"); 
	Pattern Farmers_Sandwiches= new Pattern("C:\\Images For Sikuli\\Brk_Farmers_Sandwiches.png");
	Pattern Smky_Hny_Bcn_Frm_Sand= new Pattern("C:\\Images For Sikuli\\Smky_Hny_Bcn_Frm_Sand.png");
	
	
	
	
	
	
	Screen s;

	public BreakfastItems(Screen s) {
		// TODO Auto-generated constructor stub
		this.s = s;
	}

	@Test(priority = 2)
	public void siKuliTestCase002(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_002:Verify HBS SAUSAGE HOMESTYLE BISCUIT CLASSIC: ORIGINAL Price");
		BreakfastItems b = new BreakfastItems(s);

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		s.wait(Sandwiches, 300);
		s.click(Sandwiches.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sandwiches");
		s.wait(SausageBiscuit, 300);
		s.click(SausageBiscuit.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on SausageBiscuit");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "SausageBiscuit");
		// String Path = "C:\\Users\\873780\\workspace\\SausageBiscuit.png";

		// File Source = new File(s);

		// FileHandler.copy(Source, new File(Path));
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readSausageBiscuitPrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readSausageBiscuitPrice();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Sausage Biscuit Price");
			System.out.println(
					"***********Scenario02 PASS: Correct ala carte price of Sausage Biscuit Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage Biscuit Price");
			System.out.println(
					"***********Scenario02 FAIL: Incorrect ala carte price of Sausage Biscuit Price ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 3)
	public void siKuliTestCase003(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_003:Verify Bacon Belt Price");
		BreakfastItems b = new BreakfastItems(s);

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		s.wait(Belts, 300);
		s.click(Belts.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Belts");
		s.wait(BaconBelt, 300);
		s.click(BaconBelt.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on BaconBelt");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		s.wait(PlainBagel, 300);
		s.click(PlainBagel.similar((float) 0.8));
		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "BeltBagelPrice");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readBaconBeltBagelPrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readBaconBeltBagelPrice();
		System.out.println(a1);
		System.out.println(a2);
		/*
		 * try{ parseInt = Integer.parseInt(imageText); a1 = parseInt; a2 =
		 * b.readMdOriginalBlendPrice();
		 * 
		 * } catch(NumberFormatException ex) { System.out.println(parseInt);
		 * System.out.println("Exception Handled"); } System.out.println(a1);
		 * System.out.println(a2);
		 * 
		 * /* try{ parseInt = Integer.parseInt(imageText); } catch(NumberFormatException
		 * ex){ System.out.println("Exception Handled"); }
		 */

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Belt Bacon Plain Bagel Price");
			System.out.println(
					"***********Scenario03 PASS: Correct ala carte price of Belt Bacon Plain Bagel  Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Belt Bacon Plain Bagel Price");
			System.out.println(
					"***********Scenario03 FAIL: Incorrect ala carte price of Belt Bacon Plain Bagel  Price ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 4)
	public void siKuliTestCase004(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent
				.createTest("TC_004:Verify Classic Breakfast Delivery Bundle Price. " + "(Region Id: 7000054)");
		BreakfastItems b = new BreakfastItems(s);

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		s.wait(OtherBrkFastButton, 300);
		s.click(OtherBrkFastButton.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Other Breakfast");
		s.wait(DeliveryBundles, 300);
		s.click(DeliveryBundles.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Delivery Bundles");
		s.wait(ClassicBrkFstBundles, 300);
		s.click(ClassicBrkFstBundles.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Classic Breakfast Delivery Bundle");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(410, 205, 70, 50);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"ClassicDeliveryBndlPrice");
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"ClassicDeliveryBndlPricewithname");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.Cls_Delv_Bndl_price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.Cls_Delv_Bndl_price();
		System.out.println(a1);
		System.out.println(a2);
		/*
		 * try{ parseInt = Integer.parseInt(imageText); a1 = parseInt; a2 =
		 * b.readMdOriginalBlendPrice();
		 * 
		 * } catch(NumberFormatException ex) { System.out.println(parseInt);
		 * System.out.println("Exception Handled"); } System.out.println(a1);
		 * System.out.println(a2);
		 * 
		 * /* try{ parseInt = Integer.parseInt(imageText); } catch(NumberFormatException
		 * ex){ System.out.println("Exception Handled"); }
		 */

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Classic Breakfast Delivery Bundle ");
			System.out.println(
					"***********Scenario04 PASS: Correct ala carte price of Classic Breakfast Delivery Bundle  Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Classic Breakfast Delivery Bundle. "
					+ "Expected price: " + b.Cls_Delv_Bndl_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario04 FAIL: Incorrect ala carte price of Classic Breakfast Delivery Bundle Price ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 5)
	public void siKuliTestCase005(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent
				.createTest("TC_005:Verify Farmer's Breakfast Delivery Bundle Price. " + "(Region Id: 7000054)");
		BreakfastItems b = new BreakfastItems(s);

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);
		s.wait(OtherBrkFastButton, 300);
		s.click(OtherBrkFastButton.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Other Breakfast");
		s.wait(DeliveryBundles, 300);
		s.click(DeliveryBundles.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Delivery Bundles");
		s.wait(FarmerBrkFstBundle, 300);
		s.click(FarmerBrkFstBundle.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Farmer's Breakfast Delivery Bundle");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(410, 205, 70, 50);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"FARMER'SDeliveryBndlPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"FARMER'SDeliveryBndlPricewithname");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.Frm_Delv_Bndl_price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.Frm_Delv_Bndl_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Farmer's Breakfast Delivery Bundle ");
			System.out.println(
					"***********Scenario05 PASS: Correct ala carte price of Farmer's Breakfast Delivery Bundle  Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Farmer's Breakfast Delivery Bundle. "
					+ "Expected Price: " + b.Frm_Delv_Bndl_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario05 FAIL: Incorrect ala carte price of Farmer's Breakfast Delivery Bundle Price ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 6)
	public void siKuliTestCase006(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent
				.createTest("TC_006:Verify Classic Breakfast Delivery Bundle For 2 Price. " + "(Region Id: 7000054)");
		BreakfastItems b = new BreakfastItems(s);

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);
		s.wait(OtherBrkFastButton, 300);
		s.click(OtherBrkFastButton.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Other Breakfast");
		s.wait(DeliveryBundles, 300);
		s.click(DeliveryBundles.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Delivery Bundles");
		s.wait(ClassicBrkFstBundlesFor2, 300);
		s.click(ClassicBrkFstBundlesFor2.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Classic Breakfast Delivery Bundle For 2");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"ClassicDeliveryBndl2Price");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"ClassicDeliveryBndl2Pricewithname");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.Cls_Delv_Bndl_F2_price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.Cls_Delv_Bndl_F2_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Classic Breakfast Delivery Bundle ");
			System.out.println(
					"***********Scenario06 PASS: Correct ala carte price of Classic Breakfast Delivery Bundle  Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Classic Breakfast Delivery Bundle. "
					+ "Expected Price: " + b.Cls_Delv_Bndl_F2_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			testcase.addScreenCaptureFromPath(imagePath);
			System.out.println(
					"***********Scenario06 FAIL: Incorrect ala carte price of Classic Breakfast Delivery Bundle Price ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 7)
	public void siKuliTestCase007(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent
				.createTest("TC_007:Verify Farmer's Breakfast Delivery Bundle For 2 Price. " + "(Region Id: 7000054)");
		BreakfastItems b = new BreakfastItems(s);

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);
		s.wait(OtherBrkFastButton, 300);
		s.click(OtherBrkFastButton.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Other Breakfast");
		s.wait(DeliveryBundles, 300);
		s.click(DeliveryBundles.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Delivery Bundles");
		s.wait(FarmerBrkFstBundleFor2, 300);
		s.click(FarmerBrkFstBundleFor2.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Farmer's Breakfast Delivery Bundle For 2");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(410, 205, 70, 50);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"FARMER'SDeliveryBndl2Price");
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"FARMER'SDeliveryBndl2Pricewithname");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.Frm_Delv_Bndl_F2_price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.Frm_Delv_Bndl_F2_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Farmer's Breakfast Delivery Bundle For 2 ");
			System.out.println(
					"***********Scenario07 PASS: Correct ala carte price of Farmer's Breakfast Delivery Bundle For 2  Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Farmer's Breakfast Delivery Bundle For 2. "
					+ "Expected Price: " + b.Frm_Delv_Bndl_F2_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario07 FAIL: Incorrect ala carte price of Farmer's Breakfast Delivery Bundle For 2 Price ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 8)
	public void siKuliTestCase008(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent
				.createTest("TC_008: Verify Bacon English Muffin Combo Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		System.out.println("Region Id" + b.read_Region_Id());
		Thread.sleep(2000);

		s.wait(Bacon_English_Muffin_Combo, 300);
		s.click(Bacon_English_Muffin_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, "User able to click on Bacon English Muffin Combo");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_English_Muffin_Combo_price");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_English_Muffin_Combo_price_withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Bacon_English_Muffin_Combo_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Bacon_English_Muffin_Combo_Price();
		System.out.println("From picture" + a1);
		System.out.println("From Excel" + a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Bacon English Muffin Combo");
			System.out.println(
					"***********Scenario08 PASS: Correct ala carte price of Bacon English Muffin Combo.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Bacon English Muffin Combo." + " Expected Price: "
					+ read_Bacon_English_Muffin_Combo_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			testcase.addScreenCaptureFromPath(imagePath);
			System.out.println(
					"***********Scenario08 FAIL: Incorrect ala carte price of Bacon English Muffin Combo.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 9)
	public void siKuliTestCase009(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent
				.createTest("TC_009: Verify Bacon Biscuit Combo  Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Bacon_Biscuit_Combo, 300);
		s.click(Bacon_Biscuit_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, "User able to click on Bacon Biscuit Combo ");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_Biscuit_Combo_price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_Biscuit_Combo_price_withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Bacon_Biscuit_Combo_price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Bacon_Biscuit_Combo_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Bacon Biscuit Combo ");
			System.out.println(
					"***********Scenario09 PASS: Correct ala carte price of Bacon Biscuit Combo .  ***********");

		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Bacon Biscuit Combo ." + " Expected Price: "
					+ b.read_Bacon_Biscuit_Combo_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario09 FAIL: Incorrect ala carte price of Bacon Biscuit Combo .***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 10)
	public void siKuliTestCase0010(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent.createTest("TC_0010: Verify Bacon Bagel Combo Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Bacon_Bagel_Combo, 300);
		s.click(Bacon_Bagel_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, "User able to click on Bacon Bagel Combo");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_Bagel_Combo_price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_Bagel_Combo_price_withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Bacon_Bagel_Combo_price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Bacon_Bagel_Combo_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Bacon Bagel Combo");
			System.out
					.println("***********Scenario010 PASS: Correct ala carte price of Bacon Bagel Combo.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Bacon Bagel Combo." + " Expected Price: "
					+ b.read_Bacon_Bagel_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out
					.println("***********Scenario010 FAIL: Incorrect ala carte price of Bacon Bagel Combo.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 11)
	public void siKuliTestCase0011(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent
				.createTest("TC_0011: Verify Bacon Classic Wrap Combo Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Bacon_Classic_Wrap_Combo, 300);
		s.click(Bacon_Classic_Wrap_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, "User able to click on Bacon Classic Wrap Combo");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 205, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_Classic_Wrap_Combo_price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_Classic_Wrap_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Bacon_Classic_Wrap_Combo_price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		// function change 2.5
		a2 = b.read_Bacon_Classic_Wrap_Combo_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Bacon Classic Wrap Combo");

			System.out.println(
					"***********Scenario011 PASS: Correct ala carte price of Bacon Classic Wrap Combo.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Bacon Classic Wrap Combo." + " Expected Price: "
					+ b.read_Bacon_Classic_Wrap_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario011 FAIL: Incorrect ala carte price of Bacon Farmers Wrap Combo.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 12)
	public void siKuliTestCase0012(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent
				.createTest("TC_0012: Verify Bacon Farmers Wrap Combo Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		// item change2.5 (C cloumn)
		s.wait(Bacon_Farmers_Wrap_Combo, 300);
		s.click(Bacon_Farmers_Wrap_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, "User able to click on Bacon Farmers Wrap Combo");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_Farmers_Wrap_Combo_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_Farmers_Wrap_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Bacon_Farmers_Wrap_Combo_price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Bacon_Farmers_Wrap_Combo_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Bacon Farmers Wrap Combo");

			System.out.println(
					"***********Scenario012 PASS: Correct ala carte price of Bacon Farmers Wrap Combo.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Bacon Farmers Wrap Combo." + " Expected Price: "
					+ b.read_Bacon_Farmers_Wrap_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario012 FAIL: Incorrect ala carte price of Bacon Farmers Wrap Combo.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 13)
	public void siKuliTestCase0013(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent.createTest(
				"TC_0013: Verify Sausage English Muffin Combo Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Sausage_English_Muffin_Combo, 300);
		s.click(Sausage_English_Muffin_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, "User able to click on Sausage English Muffin Combo");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_English_Muffin_Combo_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_English_Muffin_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Sausage_English_Muffin_Combo_price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Sausage_English_Muffin_Combo_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Sausage English Muffin Combo");

			System.out.println(
					"***********Scenario013 PASS: Correct ala carte price of Sausage English Muffin Combo.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage English Muffin Combo."
					+ " Expected Price: " + b.read_Sausage_English_Muffin_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario013 FAIL: Incorrect ala carte price of Sausage English Muffin Combo.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 14)
	public void siKuliTestCase0014(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent
				.createTest("TC_0014: Verify Sausage Biscuit Combo Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Sausage_Biscuit_Combo, 300);
		s.click(Sausage_Biscuit_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, "User able to click on Sausage Biscuit Combo");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_Biscuit_Combo_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_Biscuit_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Sausage_Biscuit_Combo_price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Sausage_Biscuit_Combo_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Sausage Biscuit Combo");

			System.out.println(
					"***********Scenario014 PASS: Correct ala carte price of Sausage Biscuit Combo.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage Biscuit Combo." + " Expected Price: "
					+ b.read_Sausage_Biscuit_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario014 FAIL: Incorrect ala carte price of Sausage Biscuit Combo.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 15)
	public void siKuliTestCase0015(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent
				.createTest("TC_0014: Verify Sausage Bagel Combo Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Sausage_Bagel_Combo, 300);
		s.click(Sausage_Bagel_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, "User able to click on Sausage Bagel Combo");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_Bagel_Combo_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_Bagel_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Sausage_Bagel_Combo_price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Sausage_Bagel_Combo_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Sausage Bagel Combo");

			System.out.println(
					"***********Scenario015 PASS: Correct ala carte price of Sausage Bagel Combo.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage Bagel Combo." + " Expected Price: "
					+ b.read_Sausage_Bagel_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario015 FAIL: Incorrect ala carte price of Sausage Bagel Combo.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 16)
	public void siKuliTestCase0016(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent
				.createTest("TC_0016: Verify Sausage Classic Wrap Combo Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Sausage_Classic_Wrap_Combo, 300);
		s.click(Sausage_Classic_Wrap_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, "User able to click on Sausage Classic Wrap Combo");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 205, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_Classic_Wrap_Combo_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_Classic_Wrap_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Sausage_Classic_Wrap_Combo_price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Sausage_Classic_Wrap_Combo_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Sausage Classic Wrap Combo");

			System.out.println(
					"***********Scenario016 PASS: Correct ala carte price of Sausage Classic Wrap Combo.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage Classic Wrap Combo." + " Expected Price: "
					+ b.read_Sausage_Classic_Wrap_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario016 FAIL: Incorrect ala carte price of Sausage Classic Wrap Combo.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 17)
	public void siKuliTestCase0017(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent
				.createTest("TC_0017: Verify Sausage Farmers Wrap Combo Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Sausage_Farmers_Wrap_Combo, 300);
		s.click(Sausage_Farmers_Wrap_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, "User able to click on Sausage Farmers Wrap Combo");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_Farners_Wrap_Combo_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_Farmers_Wrap_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Sausage_Farmers_Wrap_Combo_price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Sausage_Farmers_Wrap_Combo_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Sausage Farmers Wrap Combo");

			System.out.println(
					"***********Scenario017 PASS: Correct ala carte price of Sausage Farmers Wrap Combo.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage Farmers Wrap Combo." + " Expected Price: "
					+ b.read_Sausage_Farmers_Wrap_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario017 FAIL: Incorrect ala carte price of Sausage Farmers Wrap Combo.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 18)
	public void siKuliTestCase0018(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent.createTest(
				"TC_0018: Verify Egg & Cheese English Muffin Combo Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Egg_and_Cheese_English_Muffin_Combo, 300);
		s.click(Egg_and_Cheese_English_Muffin_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, "User able to click on Egg & Cheese English Muffin Combo");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Egg_and_Cheese_English_Muffin_Combo_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Egg_and_Cheese_English_Muffin_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Egg_Cheese_English_Muffin_Combo_price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Egg_Cheese_English_Muffin_Combo_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Egg & Cheese English Muffin Combo");

			System.out.println(
					"***********Scenario018 PASS: Correct ala carte price of Egg & Cheese English Muffin Combo.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Egg & Cheese English Muffin Combo."
					+ " Expected Price: " + b.read_Egg_Cheese_English_Muffin_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario018 FAIL: Incorrect ala carte price of Egg & Cheese English Muffin Combo.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 19)
	public void siKuliTestCase0019(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent
				.createTest("TC_0019: Verify Egg & Cheese Biscuit Combo Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Egg_and_Cheese_Biscuit_Combo, 300);
		s.click(Egg_and_Cheese_Biscuit_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, "User able to click on Egg & Cheese Biscuit Combo");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Egg_and_Cheese_Biscuit_Combo_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Egg_and_Cheese_Biscuit_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Egg_Cheese_Biscuit_Combo_price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Egg_Cheese_Biscuit_Combo_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Egg & Cheese Biscuit Combo");

			System.out.println(
					"***********Scenario019 PASS: Correct ala carte price of Egg & Cheese Biscuit Combo.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Egg & Cheese Biscuit Combo." + " Expected Price: "
					+ b.read_Egg_Cheese_Biscuit_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario019 FAIL: Incorrect ala carte price of Egg & Cheese Biscuit Combo.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 20)
	public void siKuliTestCase0020(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent
				.createTest("TC_0020: Verify Egg & Cheese Bagel Combo Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Egg_and_Cheese_Bagel_Combo, 300);
		s.click(Egg_and_Cheese_Bagel_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, "User able to click on Egg & Cheese Bagel Combo");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Egg_and_Cheese_Bagel_Combo_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Egg_and_Cheese_Bagel_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Egg_Cheese_Bagel_Combo_price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Egg_Cheese_Bagel_Combo_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Egg & Cheese Bagel Combo");

			System.out.println(
					"***********Scenario020 PASS: Correct ala carte price of Egg & Cheese Bagel Combo.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Egg & Cheese Bagel Combo." + " Expected Price: "
					+ b.read_Egg_Cheese_Bagel_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario020 FAIL: Incorrect ala carte price of Egg & Cheese Bagel Combo.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 21)
	public void siKuliTestCase0021(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent.createTest(
				"TC_0021: Verify Sausage & Bacon English Muffin Combo Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Sausage_and_Bacon_English_Muffin_Combo, 300);
		s.click(Sausage_and_Bacon_English_Muffin_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, "User able to click on Sausage & Bacon English Muffin Combo");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_and_Bacon_English_Muffin_Combo_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_and_Bacon_English_Muffin_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Sausage_Bacon_English_Muffin_Combo_price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Sausage_Bacon_English_Muffin_Combo_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Sausage & Bacon English Muffin Combo");

			System.out.println(
					"***********Scenario021 PASS: Correct ala carte price of Sausage & Bacon English Muffin Combo.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage & Bacon English Muffin Combo."
					+ " Expected Price: " + b.read_Sausage_Bacon_English_Muffin_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario021 FAIL: Incorrect ala carte price of Sausage & Bacon English Muffin Combo.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 22)
	public void siKuliTestCase0022(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent.createTest(
				"TC_0022: Verify Sausage & Bacon Biscuit Combo Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Sausage_and_Bacon_Biscuit_Combo, 300);
		s.click(Sausage_and_Bacon_Biscuit_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, "User able to click on Sausage & Bacon Biscuit Combo	");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_and_Bacon_Biscuit_Combo_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_and_Bacon_Biscuit_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Sausage_Bacon_Biscuit_Combo_price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Sausage_Bacon_Biscuit_Combo_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Sausage & Bacon Biscuit Combo");

			System.out.println(
					"***********Scenario022 PASS: Correct ala carte price of Sausage & Bacon Biscuit Combo.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage & Bacon Biscuit Combo."
					+ " Expected Price: " + b.read_Sausage_Bacon_Biscuit_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario022 FAIL: Incorrect ala carte price of Sausage & Bacon Biscuit Combo.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 23)
	public void siKuliTestCase0023(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent
				.createTest("TC_0023: Verify Sausage & Bacon Bagel Combo Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Sausage_and_Bacon_Bagel_Combo, 300);
		s.click(Sausage_and_Bacon_Bagel_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, "User able to click on Sausage & Bacon Bagel Combo	");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_and_Bacon_Bagel_Combo_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_and_Bacon_Bagel_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Sausage_Bacon_Bagel_Combo_price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Sausage_Bacon_Bagel_Combo_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Sausage & Bacon Bagel Combo");

			System.out.println(
					"***********Scenario023 PASS: Correct ala carte price of Sausage & Bacon Bagel Combo.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage & Bacon Bagel Combo." + " Expected Price: "
					+ b.read_Sausage_Bacon_Bagel_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario023 FAIL: Incorrect ala carte price of Sausage & Bacon Bagel Combo.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 24)
	public void siKuliTestCase0024(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent.createTest(
				"TC_0024: Verify Sausage & Bacon Classic Wrap Combo Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Sausage_and_Bacon_Classic_Wrap_Combo, 300);
		s.click(Sausage_and_Bacon_Classic_Wrap_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, " User able to click on Sausage & Bacon Classic Wrap Combo ");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_Bacon_Classic_Wrap_Combo_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_Bacon_Classic_Wrap_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Sausage_Bacon_Classic_Wrap_Combo_price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Sausage_Bacon_Classic_Wrap_Combo_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Sausage & Bacon Classic Wrap Combo");

			System.out.println(
					"***********Scenario024 PASS: Correct ala carte price of Sausage & Bacon Classic Wrap Combo.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage & Bacon Classic Wrap Combo."
					+ " Expected Price: " + b.read_Sausage_Bacon_Classic_Wrap_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario024 FAIL: Incorrect ala carte price of Sausage & Bacon Classic Wrap Combo.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 25)
	public void siKuliTestCase0025(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent
				.createTest("TC_0025: Verify Bacon Croissant Combo Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Bacon_Croissant_Combo, 300);
		s.click(Bacon_Croissant_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, " User able to click on Bacon Croissant Combo ");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_Croissant_Combo_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_Croissant_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Bacon_Croissant_Combo_price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Bacon_Croissant_Combo_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Bacon Croissant Combo");

			System.out.println(
					"***********Scenario025 PASS: Correct ala carte price of Bacon Croissant Combo.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Bacon Croissant Combo." + " Expected Price: "
					+ b.read_Bacon_Croissant_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario025 FAIL: Incorrect ala carte price of Bacon Croissant Combo.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 26)
	public void siKuliTestCase0026(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent.createTest("TC_0026: Verify Bacon Belt Combo Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Bacon_Belt_Combo, 300);
		s.click(Bacon_Belt_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, " User able to click on Bacon Belt Combo ");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_Belt_Combo_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_Belt_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Bacon_Belt_Combo_price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Bacon_Belt_Combo_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Bacon Belt Combo");

			System.out
					.println("***********Scenario026 PASS: Correct ala carte price of Bacon Belt Combo.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Bacon Belt Combo." + " Expected Price: "
					+ b.read_Bacon_Belt_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out
					.println("***********Scenario026 FAIL: Incorrect ala carte price of Bacon Belt Combo.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 27)
	public void siKuliTestCase0027(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent
				.createTest("TC_0027: Verify Sausage Croissant Combo Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Sausage_Croissant_Combo, 300);
		s.click(Sausage_Croissant_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, " User able to click on Sausage Croissant Combo ");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_Croissant_Combo_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_Croissant_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Sausage_Croissant_Combo_price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Sausage_Croissant_Combo_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Sausage Croissant Combo");

			System.out.println(
					"***********Scenario027 PASS: Correct ala carte price of Sausage Croissant Combo.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage Croissant Combo." + " Expected Price: "
					+ b.read_Sausage_Croissant_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario027 FAIL: Incorrect ala carte price of Sausage Croissant Combo.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 28)
	public void siKuliTestCase0028(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent.createTest("TC_0028: Verify Sausage Belt Combo Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Sausage_Belt_Combo, 300);
		s.click(Sausage_Belt_Combo.similar((float) 0.5));

		testcase.log(Status.PASS, " User able to click on Sausage Belt Combo ");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_Belt_Combo_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_Belt_Combo_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Sausage_Belt_Combo_price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Sausage_Belt_Combo_price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Sausage Belt Combo");

			System.out.println(
					"***********Scenario028 PASS: Correct ala carte price of Sausage Belt Combo.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage Belt Combo." + " Expected Price: "
					+ b.read_Sausage_Belt_Combo_price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario028 FAIL: Incorrect ala carte price of Sausage Belt Combo.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

//********Breakfast ALC Items********
	@Test(priority = 29)
	public void siKuliTestCase0029(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent.createTest(
				"TC_0029: Verify Bacon English Muffin Sandwich Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Sandwiches1, 300);
		s.click(Sandwiches1.similar((float) 0.5));

		s.wait(Bacon_English_Muffin_Sandwich, 300);
		s.click(Bacon_English_Muffin_Sandwich.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Bacon English Muffin Sandwich");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_English_Muffin_Sandwich_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_English_Muffin_Sandwich_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Bacon_English_Muffin_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Bacon_English_Muffin_Sandwich_Price();

		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Bacon English Muffin Sandwich");

			System.out.println(
					"***********Scenario029 PASS: Correct ala carte price of Bacon English Muffin Sandwich.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Bacon English Muffin Sandwich."
					+ " Expected Price: " + b.read_Bacon_English_Muffin_Sandwich_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario029 FAIL: Incorrect ala carte price of Bacon English Muffin Sandwich.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 30)
	public void siKuliTestCase0030(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent.createTest(
				"TC_0030: Verify Sausage English Muffin Sandwich Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Sandwiches1, 300);
		s.click(Sandwiches1.similar((float) 0.5));

		s.wait(Sausage_English_Muffin_Sandwich, 300);
		s.click(Sausage_English_Muffin_Sandwich.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Sausage English Muffin Sandwich");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_English_Muffin_Sandwich_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_English_Muffin_Sandwich_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Sausage_English_Muffin_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Sausage_English_Muffin_Sandwich_Price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Sausage English Muffin Sandwich");
			System.out.println(
					"***********Scenario030 PASS: Correct ala carte price of Sausage English Muffin Sandwich.***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage English Muffin Sandwich."
					+ " Expected Price: " + b.read_Sausage_English_Muffin_Sandwich_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario030 FAIL: Incorrect ala carte price of Sausage English Muffin Sandwich.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 31)
	public void siKuliTestCase0031(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent.createTest(
				"TC_0031: Verify Egg and Cheese English Muffin Sandwich Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Sandwiches1, 300);
		s.click(Sandwiches1.similar((float) 0.5));

		s.wait(Egg_and_Cheese_English_Muffin_Sandwich, 300);
		s.click(Egg_and_Cheese_English_Muffin_Sandwich.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Egg and Cheese English Muffin Sandwich");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Egg_and_Cheese_English_Muffin_Sandwich_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Egg_and_Cheese_English_Muffin_Sandwich_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Egg_and_Cheese_English_Muffin_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Egg_and_Cheese_English_Muffin_Sandwich_Price();

		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Egg and Cheese English Muffin Sandwich");

			System.out.println(
					"***********Scenario016 PASS: Correct ala carte price of Egg and Cheese English Muffin Sandwich.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Egg and Cheese English Muffin Sandwich."
					+ " Expected Price: " + b.read_Egg_and_Cheese_English_Muffin_Sandwich_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario031 FAIL: Incorrect ala carte price of Egg and Cheese English Muffin Sandwich.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 32)
	public void siKuliTestCase0032(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent.createTest("TC_0032: Verify Sausage and Bacon English Muffin Sandwich Price. " + "Region Id: "
				+ b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Sandwiches1, 300);
		s.click(Sandwiches1.similar((float) 0.5));

		s.wait(Sausage_and_Bacon_English_Muffin_Sandwich, 300);
		s.click(Sausage_and_Bacon_English_Muffin_Sandwich.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Sausage and Bacon English Muffin Sandwich");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_and_Bacon_English_Muffin_Sandwich_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_and_Bacon_English_Muffin_Sandwich_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Sausage_and_Bacon_English_Muffin_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Sausage_and_Bacon_English_Muffin_Sandwich_Price();

		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Sausage and Bacon English Muffin Sandwich");

			System.out.println(
					"***********Scenario032 PASS: Correct ala carte price of Sausage and Bacon English Muffin Sandwich.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage and Bacon English Muffin Sandwich."
					+ " Expected Price: " + b.read_Sausage_and_Bacon_English_Muffin_Sandwich_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario032 FAIL: Incorrect ala carte price of Sausage and Bacon English Muffin Sandwich.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 33)
	public void siKuliTestCase0033(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent
				.createTest("TC_0033: Verify Bacon Biscuit Sandwich Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		Thread.sleep(2000);

		s.wait(Sandwiches1, 300);
		s.click(Sandwiches1.similar((float) 0.5));

		s.wait(Bacon_Biscuit_Sandwich, 300);
		s.click(Bacon_Biscuit_Sandwich.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Bacon Biscuit Sandwich");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_Biscuit_Sandwich_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_Biscuit_Sandwich_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);

		System.out.println(b.read_Bacon_Biscuit_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Bacon_Biscuit_Sandwich_Price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Bacon Biscuit Sandwich");

			System.out.println(
					"***********Scenario033 PASS: Correct ala carte price of Bacon Biscuit Sandwich.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Bacon Biscuit Sandwich." + " Expected Price: "
					+ b.read_Bacon_Biscuit_Sandwich_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario033 FAIL: Incorrect ala carte price of Bacon Biscuit Sandwich.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	public void voiditem() throws FindFailed {

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 34)
	public void siKuliTestCase0034(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent
				.createTest("TC_0034:Verify Sausage Biscuit Sandwich Price" + "Region Id:" + b.read_Region_Id());

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		
		s.wait(Sandwiches, 300);
		s.click(Sandwiches.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sandwiches");
		
		s.wait(SausageBiscuit, 300);
		s.click(SausageBiscuit.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sausage_biscuit_Sandwich");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_biscuit_Sandwich_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_biscuit_Sandwich_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readSausageBiscuitPrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readSausageBiscuitPrice();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Sausage Biscuit Sandwich .");
			System.out.println(
					"***********Scenario34 PASS: Correct ala carte price of Sausage Biscuit Sandwich. ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage Biscuit Sandwich." + " Expected Price: "
					+ b.readSausageBiscuitPrice());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario34 FAIL: Incorrect ala carte price of Sausage Biscuit Sandwich . ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 35)
	public void siKuliTestCase0035(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent
				.createTest("TC_0035:Verify Egg and Cheese Biscuit Sandwich Price" + "Region Id:" + b.read_Region_Id());

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		
		s.wait(BrkSandwich, 300);
		s.click(BrkSandwich.similar((float) 0.5));
		
		testcase.log(Status.PASS, "User able to click on Sandwiches");
		s.wait(Egg_and_Cheese_Biscuit_Sandwich, 300);
		s.click(Egg_and_Cheese_Biscuit_Sandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Egg and Cheese Biscuit Sandwich");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Egg_and_Cheese_Biscuit_Sandwich_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Egg_and_Cheese_Biscuit_Sandwich_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.read_Egg_and_Cheese_Biscuit_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.read_Egg_and_Cheese_Biscuit_Sandwich_Price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Egg and Cheese Biscuit Sandwich .");
			System.out.println(
					"***********Scenario35 PASS: Correct ala carte price of Egg and Cheese Biscuit Sandwich. ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Egg and Cheese Biscuit Sandwich."
					+ " Expected Price: " + b.read_Egg_and_Cheese_Biscuit_Sandwich_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario35 FAIL: Incorrect ala carte price of Egg and Cheese Biscuit Sandwich . ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 36)
	public void siKuliTestCase0036(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent.createTest(
				"TC_0036:Verify Sausage and Bacon Biscuit Sandwich Price" + "Region Id:" + b.read_Region_Id());

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		
		s.wait(BrkSandwich, 300);
		s.click(BrkSandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sandwiches");
		
		s.wait(Sausage_and_Bacon_Biscuit_Sandwich, 300);
		s.click(Sausage_and_Bacon_Biscuit_Sandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sausage and Bacon Biscuit Sandwich");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_and_Bacon_Biscuit_Sandwich_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_and_Bacon_Biscuit_Sandwich_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.read_Sausage_Bacon_Biscuit_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.read_Sausage_Bacon_Biscuit_Sandwich_Price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Sausage and Bacon Biscuit Sandwich .");
			System.out.println(
					"***********Scenario36 PASS: Correct ala carte price of Sausage and Bacon Biscuit Sandwich. ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage and Bacon Biscuit Sandwich."
					+ " Expected Price: " + b.read_Sausage_Bacon_Biscuit_Sandwich_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario36 FAIL: Incorrect ala carte price of Sausage and Bacon Biscuit Sandwich . ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 37)
	public void siKuliTestCase0037(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent.createTest("TC_0037:Verify Bacon Bagel Sandwich Price" + "Region Id:" + b.read_Region_Id());

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		
		s.wait(BrkSandwich, 300);
		s.click(BrkSandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sandwiches");
		
		s.wait(Bacon_Bagel_Sandwich, 300);
		s.click(Bacon_Bagel_Sandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Bacon Bagel Sandwich");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_Bagel_Sandwich_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_Bagel_Sandwich_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.read_Bacon_Bagel_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.read_Bacon_Bagel_Sandwich_Price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Bacon Bagel Sandwich .");
			System.out.println(
					"***********Scenario37 PASS: Correct ala carte price of Bacon Bagel Sandwich. ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Bacon Bagel Sandwich." + " Expected Price: "
					+ b.read_Bacon_Bagel_Sandwich_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario37 FAIL: Incorrect ala carte price of Bacon Bagel Sandwich . ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 38)
	public void siKuliTestCase0038(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent.createTest("TC_0038:Verify Sausage Bagel Sandwich Price" + "Region Id:" + b.read_Region_Id());

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		
		s.wait(BrkSandwich, 300);
		s.click(BrkSandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sandwiches");
		
		s.wait(Sausage_Bagel_Sandwich, 300);
		s.click(Sausage_Bagel_Sandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sausage Bagel Sandwich");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_Bagel_Sandwich_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_Bagel_Sandwich_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.read_Sausage_Bagel_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.read_Sausage_Bagel_Sandwich_Price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Sausage Bagel Sandwich .");
			System.out.println(
					"***********Scenario38 PASS: Correct ala carte price of Sausage Bagel Sandwich. ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage Bagel Sandwich." + " Expected Price: "
					+ b.read_Sausage_Bagel_Sandwich_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario38 FAIL: Incorrect ala carte price of Sausage Bagel Sandwich . ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 39)
	public void siKuliTestCase0039(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent
				.createTest("TC_0039:Verify Egg and Cheese Bagel Sandwich Price" + "Region Id:" + b.read_Region_Id());

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		
		s.wait(BrkSandwich, 300);
		s.click(BrkSandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sandwiches");
		
		s.wait(Egg_and_Cheese_Bagel_Sandwich, 300);
		s.click(Egg_and_Cheese_Bagel_Sandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Egg and Cheese Bagel Sandwich");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Egg_and_Cheese_Bagel_Sandwich_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Egg_and_Cheese_Bagel_Sandwich_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.read_Egg_Cheese_Bagel_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.read_Egg_Cheese_Bagel_Sandwich_Price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Egg and Cheese Bagel Sandwich .");
			System.out.println(
					"***********Scenario39 PASS: Correct ala carte price of Egg and Cheese Bagel Sandwich. ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Egg and Cheese Bagel Sandwich."
					+ " Expected Price: " + b.read_Egg_Cheese_Bagel_Sandwich_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario39 FAIL: Incorrect ala carte price of Egg and Cheese Bagel Sandwich . ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 40)
	public void siKuliTestCase0040(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent.createTest(
				"TC_0040:Verify Sausage and Bacon Bagel Sandwich Price" + "Region Id:" + b.read_Region_Id());

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		
		s.wait(BrkSandwich, 300);
		s.click(BrkSandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sandwiches");
		
		s.wait(Sausage_and_Bacon_Bagel_Sandwich, 300);
		s.click(Sausage_and_Bacon_Bagel_Sandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sausage and Bacon Bagel Sandwich");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_and_Bacon_Bagel_Sandwich_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_and_Bacon_Bagel_Sandwich_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.read_Sausage_Bacon_Bagel_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.read_Sausage_Bacon_Bagel_Sandwich_Price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Sausage and Bacon Bagel Sandwich .");
			System.out.println(
					"***********Scenario40 PASS: Correct ala carte price of Sausage and Bacon Bagel Sandwich. ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage and Bacon Bagel Sandwich."
					+ " Expected Price: " + b.read_Sausage_Bacon_Bagel_Sandwich_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario40 FAIL: Incorrect ala carte price of Sausage and Bacon Bagel Sandwich . ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 41)
	public void siKuliTestCase0041(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent
				.createTest("TC_0041:Verify Bacon Croissant Sandwich Price" + "Region Id:" + b.read_Region_Id());

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		
		s.wait(BrkSandwich, 300);
		s.click(BrkSandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sandwiches");
		
		s.wait(Bacon_Croissant_Sandwich, 300);
		s.click(Bacon_Croissant_Sandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Bacon Croissant Sandwich");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_Croissant_Sandwich_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_Croissant_Sandwich_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.read_Bacon_Croissant_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.read_Bacon_Croissant_Sandwich_Price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Bacon Croissant Sandwich .");
			System.out.println(
					"***********Scenario41 PASS: Correct ala carte price of Bacon Croissant Sandwich. ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Bacon Croissant Sandwich." + " Expected Price: "
					+ b.read_Bacon_Croissant_Sandwich_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario41 FAIL: Incorrect ala carte price of Bacon Croissant Sandwich . ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 42)
	public void siKuliTestCase0042(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent
				.createTest("TC_0042:Verify Sausage Croissant Sandwich Price" + "Region Id:" + b.read_Region_Id());

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		
		s.wait(BrkSandwich, 300);
		s.click(BrkSandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sandwiches");
		
		s.wait(Sausage_Croissant_Sandwich, 300);
		s.click(Sausage_Croissant_Sandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sausage Croissant Sandwich");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_Croissant_Sandwich_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_Croissant_Sandwich_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.read_Sausage_Croissant_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.read_Sausage_Croissant_Sandwich_Price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Sausage Croissant Sandwich .");
			System.out.println(
					"***********Scenario42 PASS: Correct ala carte price of Sausage Croissant Sandwich. ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage Croissant Sandwich." + " Expected Price: "
					+ b.read_Sausage_Croissant_Sandwich_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario42 FAIL: Incorrect ala carte price of Sausage Croissant Sandwich . ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 43)
	public void siKuliTestCase0043(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent.createTest(
				"TC_0043:Verify Egg and Cheese Croissant Sandwich Price" + "Region Id:" + b.read_Region_Id());

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		s.wait(BrkSandwich, 300);
		s.click(BrkSandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sandwiches");
		
		s.wait(Egg_and_Cheese_Croissant_Sandwich, 300);
		s.click(Egg_and_Cheese_Croissant_Sandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Egg and Cheese Croissant Sandwich");
		
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Egg_and_Cheese_Croissant_Sandwich_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Egg_and_Cheese_Croissant_Sandwich_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.read_Egg_Cheese_Croissant_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.read_Egg_Cheese_Croissant_Sandwich_Price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Egg and Cheese Croissant Sandwich .");
			System.out.println(
					"***********Scenario43 PASS: Correct ala carte price of Egg and Cheese Croissant Sandwich. ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Egg and Cheese Croissant Sandwich."
					+ " Expected Price: " + b.read_Egg_Cheese_Croissant_Sandwich_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario43 FAIL: Incorrect ala carte price of Egg and Cheese Croissant Sandwich . ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 44)
	public void siKuliTestCase0044(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent.createTest(
				"TC_0044:Verify Sausage and Bacon Croissant Sandwich Price" + "Region Id:" + b.read_Region_Id());

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		
		s.wait(BrkSandwich, 300);
		s.click(BrkSandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sandwiches");
		
		s.wait(Sausage_and_Bacon_Croissant_Sandwich, 300);
		s.click(Sausage_and_Bacon_Croissant_Sandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sausage and Bacon Croissant Sandwich");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_and_Bacon_Croissant_Sandwich_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_and_Bacon_Croissant_Sandwich_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.read_Sausage_Bacon_Croissant_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.read_Sausage_Bacon_Croissant_Sandwich_Price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Sausage and Bacon Croissant Sandwich .");
			System.out.println(
					"***********Scenario44 PASS: Correct ala carte price of Sausage and Bacon Croissant Sandwich. ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage and Bacon Croissant Sandwich."
					+ " Expected Price: " + b.read_Sausage_Bacon_Croissant_Sandwich_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario44 FAIL: Incorrect ala carte price of Sausage and Bacon Croissant Sandwich . ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 45)
	public void siKuliTestCase0045(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent.createTest(
				"TC_0045:Verify Bacon Everything Croissant Sandwich Price" + "Region Id:" + b.read_Region_Id());

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		
		s.wait(BrkSandwich, 300);
		s.click(BrkSandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sandwiches");
		
		s.wait(Bacon_Everything_Croissant_Sandwich, 300);
		s.click(Bacon_Everything_Croissant_Sandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Bacon Everything Croissant Sandwich");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_Everything_Croissant_Sandwich_Price_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Bacon_Everything_Croissant_Sandwich_Price_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.read_Bacon_Everything_Croissant_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.read_Bacon_Everything_Croissant_Sandwich_Price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Sausage and Bacon Everything Croissant Sandwich .");
			System.out.println(
					"***********Scenario45 PASS: Correct ala carte price of Sausage and Bacon Everything Croissant Sandwich. ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Bacon Everything Croissant Sandwich."
					+ " Expected Price: " + b.read_Bacon_Everything_Croissant_Sandwich_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario45 FAIL: Incorrect ala carte price of Bacon Everything Croissant Sandwich . ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 46)
	public void siKuliTestCase0046(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent.createTest(
				"TC_0046:Verify Sausage Everything Croissant Sandwich Price" + "Region Id:" + b.read_Region_Id());

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		
		s.wait(BrkSandwich, 300);
		s.click(BrkSandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sandwiches");
		
		s.wait(Sausage_Everything_Croissant_Sandwich, 300);
		s.click(Sausage_Everything_Croissant_Sandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sausage Everything Croissant Sandwich");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_Everything_Croissant_Sandwich_Price_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Sausage_Everything_Croissant_Sandwich_Price_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.read_Sausage_Everything_Croissant_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.read_Sausage_Everything_Croissant_Sandwich_Price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Sausage Everything Croissant Sandwich .");
			System.out.println(
					"***********Scenario46 PASS: Correct ala carte price of Sausage Everything Croissant Sandwich. ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Sausage Everything Croissant Sandwich."
					+ " Expected Price: " + b.read_Sausage_Everything_Croissant_Sandwich_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario46 FAIL: Incorrect ala carte price of Sausage Everything Croissant Sandwich . ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}
	
	//************BEANS**********
	
	@Test(priority = 47)
	public void siKuliTestCase0047(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent.createTest(
				"TC_0047:Verify Small Beans Price" + "Region Id:" + b.read_Region_Id());

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		
		s.wait(OtherBrkFastButton, 300);
		s.click(OtherBrkFastButton.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Other");
		
		s.wait(SMBeans, 300);
		s.click(SMBeans.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Small Beans");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SMBeans_Price_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SMBeans_Price_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.read_SMBeans_Price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.read_SMBeans_Price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Small Beans .");
			System.out.println(
					"***********Scenario47 PASS: Correct ala carte price of Small Beans. ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Small Beans."
					+ " Expected Price: " + b.read_SMBeans_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario47 FAIL: Incorrect ala carte price of Small Beans . ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 48)
	public void siKuliTestCase0048(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent.createTest(
				"TC_0048:Verify Regular Beans Price" + "Region Id:" + b.read_Region_Id());

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		
		s.wait(OtherBrkFastButton, 300);
		s.click(OtherBrkFastButton.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Other");
		
		s.wait(RGBeans, 300);
		s.click(RGBeans.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Regular Beans");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RGBeans_Price_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RGBeans_Price_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.read_RGBeans_Price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.read_RGBeans_Price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Regular Beans .");
			System.out.println(
					"***********Scenario48 PASS: Correct ala carte price of Regular Beans. ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Regular Beans."
					+ " Expected Price: " + b.read_SMBeans_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario48 FAIL: Incorrect ala carte price of Regular Beans . ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}
	
	//*********Upto This Beans,***************


	@Test(priority = 49)
	public void siKuliTestCase0049(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent.createTest(
				"TC_0049:Verify Egg and Cheese Everything Croissant Sandwich Price" + "Region Id:" + b.read_Region_Id());

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		
		s.wait(BrkSandwich, 300);
		s.click(BrkSandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sandwiches");
		
		s.wait(Egg_and_Cheese_Everything_Croissant_Sandwich, 300);
		s.click(Egg_and_Cheese_Everything_Croissant_Sandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Egg and Cheese Everything Croissant Sandwich");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Egg_and_Cheese_Everything_Croissant_Sandwich_Price_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Egg_and_Cheese_Everything_Croissant_Sandwich_Price_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.read_Egg_Cheese_Everything_Croissant_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.read_Egg_Cheese_Everything_Croissant_Sandwich_Price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Egg and Cheese Everything Croissant Sandwich .");
			System.out.println(
					"***********Scenario50 PASS: Correct ala carte price of Egg and Cheese Everything Croissant Sandwich. ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Egg and Cheese Everything Croissant Sandwich."
					+ " Expected Price: " + b.read_Egg_Cheese_Everything_Croissant_Sandwich_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario50 FAIL: Incorrect ala carte price of Egg and Cheese Everything Croissant Sandwich . ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}
	
	@Test(priority = 50)
	public void siKuliTestCase0050(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent.createTest(
				"TC_0050:Verify Simply Sausage English Muffin Sandwich Price" + "Region Id:" + b.read_Region_Id());

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		
		s.wait(BrkSandwich, 300);
		s.click(BrkSandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sandwiches");
		
		s.wait(Simply_Sausage_English_Muffin_Sandwich, 300);
		s.click(Simply_Sausage_English_Muffin_Sandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Simply Sausage English Muffin Sandwich");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Simply_Sausage_English_Muffin_Sandwich_Price_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Simply_Sausage_English_Muffin_Sandwich_Price_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.read_Simply_Sausage_English_Muffin_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.read_Simply_Sausage_English_Muffin_Sandwich_Price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Simply Sausage English Muffin Sandwich .");
			System.out.println(
					"***********Scenario47 PASS: Correct ala carte price of Simply Sausage English Muffin Sandwich. ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Simply Sausage English Muffin Sandwich."
					+ " Expected Price: " + b.read_Simply_Sausage_English_Muffin_Sandwich_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario47 FAIL: Incorrect ala carte price of Simply Sausage English Muffin Sandwich . ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}
	
	@Test(priority = 51)
	public void siKuliTestCase0051(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent.createTest(
				"TC_0051:Verify Simply Sausage Biscuit Sandwich Price" + "Region Id:" + b.read_Region_Id());

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		
		s.wait(BrkSandwich, 300);
		s.click(BrkSandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sandwiches");
		
		s.wait(Simply_Sausage_Biscuit_Sandwich, 300);
		s.click(Simply_Sausage_Biscuit_Sandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Simply Sausage Biscuit Sandwich");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Simply_Sausage_Biscuit_Sandwich_Price_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Simply_Sausage_Biscuit_Sandwich_Price_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.read_Simply_Sausage_Biscuit_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.read_Simply_Sausage_Biscuit_Sandwich_Price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Simply Sausage Biscuit Sandwich .");
			System.out.println(
					"***********Scenario47 PASS: Correct ala carte price of Simply Sausage Biscuit Sandwich. ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Simply Sausage Biscuit Sandwich."
					+ " Expected Price: " + b.read_Simply_Sausage_Biscuit_Sandwich_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario47 FAIL: Incorrect ala carte price of Simply Sausage Biscuit Sandwich . ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}
	
	@Test(priority = 52)
	public void siKuliTestCase0052(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);
		testcase = extent.createTest(
				"TC_0052:Verify Steak English Muffin Sandwich Price" + "Region Id:" + b.read_Region_Id());

		Thread.sleep(2000);

		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Breakfast");
		
		s.wait(BrkSandwich, 300);
		s.click(BrkSandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Sandwiches");
		
		s.wait(Simply_Sausage_Biscuit_Sandwich, 300);
		s.click(Simply_Sausage_Biscuit_Sandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Steak English Muffin Sandwich");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Steak_English_Muffin_Sandwich_Price_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Steak_English_Muffin_Sandwich_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.read_Steak_English_Muffin_Sandwich_Price());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.read_Steak_English_Muffin_Sandwich_Price();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Steak English Muffin Sandwich .");
			System.out.println(
					"***********Scenario52 PASS: Correct ala carte price of Steak English Muffin Sandwich. ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Steak English Muffin Sandwich."
					+ " Expected Price: " + b.read_Steak_English_Muffin_Sandwich_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario52 FAIL: Incorrect ala carte price of Steak English Muffin Sandwich . ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}
	
	@Test(priority = 53)
	public void siKuliTestCase0053(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent.createTest("TC_0053: Verify Omelette Bites Price. " + "Region Id: " + b.read_Region_Id());

		
		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		s.wait(OtherBrkFastButton, 300);
		s.click(OtherBrkFastButton.similar((float) 0.5));
		s.wait(OMELETTE_BITES, 300);
		s.click(OMELETTE_BITES.similar((float) 0.5));

		testcase.log(Status.PASS, "User able to click on Omelette Bites");

		
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(425, 200, 60, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "Omelette_Bites_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Omelette_Bites_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		// System.out.println(imageText);

		// System.out.println(b.read_Omelette_Bites_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Omelette_Bites_Price();

		System.out.println("Price from picture in POS: " + a1);
		System.out.println("Price from pricing sheet: " + a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Omelette Bites");

			System.out.println("***********Scenario053 PASS: Correct ala carte price of Omelette Bites.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Omelette Bites." + " Expected Price: "
					+ b.read_Omelette_Bites_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario053 FAIL: Incorrect ala carte price of Omelette Bites.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 54)
	public void siKuliTestCase0054(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent
				.createTest("TC_0054: Verify Brk_Wrap_Bacon_Grilled Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(2000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		
		
		Thread.sleep(4000);
		s.wait(Wraps, 300);
		s.click(Wraps.similar((float) 0.5));
		s.wait(BRK_WRAP_BACON_GRILLED, 300);
		s.click(BRK_WRAP_BACON_GRILLED.similar((float) 0.5));

		testcase.log(Status.PASS, "User able to click on Brk_Wrap_Bacon_Grilled");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(425, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Brk_Wrap_Bacon_Grilled_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Brk_Wrap_Bacon_Grilled_Price_Withname");
		
		  
		  ITesseract image = new Tesseract(); image.setDatapath(".\\tessdata"); 
		  String
		  imageText=image.doOCR(new File(imagePath)); 
		  //System.out.println(imageText);
		  
		  
		  //System.out.println(b.read_Brk_Wrap_Bacon_Grilled_Price()); 
		  String a1=null;
		  String a2=null;
		  
		  
		  //Price validation 
		  String replaceAll = imageText.replaceAll("\\s",""); 
		  a1 =replaceAll;
		  
		  
		  a2 = b.read_Brk_Wrap_Bacon_Grilled_Price();
		  
		  System.out.println("Price from picture in POS: "+a1);
		  System.out.println("Price from pricing sheet: "+a2);
		  
		  
		  if(a1.equals(a2)){
		  
		  testcase.log(Status.PASS," Correct ala carte price of Brk Wrap Bacon Grilled"
		  );
		  
		  System.out.println("***********Scenario054 PASS: Correct ala carte price of Brk Wrap Bacon Grilled.  ***********"
		  );
		  
		  
		  } else {
		  
		  testcase.log(Status.
		  FAIL," Incorrect ala carte price of Brk Wrap Bacon Grilled."+" Expected Price: "+b.read_Brk_Wrap_Bacon_Grilled_Price());
		  
		  testcase.addScreenCaptureFromPath(pricewithname);
		  testcase.addScreenCaptureFromPath(imagePath);
		  System.out.
		  println("***********Scenario054 FAIL: Incorrect ala carte price of Brk Wrap Bacon Grilled.***********");
		  
		  
		  }
		  
		  
		  s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 55)
	public void siKuliTestCase0055(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent.createTest(
				"TC_0055: Verify Brk_Wrap_Bacon_Grilled_No_Egg Price. " + "Region Id: " + b.read_Region_Id());
		Thread.sleep(4000);
		
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		
		Thread.sleep(4000);
		s.wait(Wraps, 800);
		s.click(Wraps);
		
		s.wait(OtherBrkFastWrapButton, 300);
		s.click(OtherBrkFastWrapButton.similar((float) 0.5));
		
		
		
		s.wait(BRK_WRAP_BACON_GRILLED_NO_EGG, 300);
		s.click(BRK_WRAP_BACON_GRILLED_NO_EGG.similar((float) 0.5));

		testcase.log(Status.PASS, "User able to click on Brk_Wrap_Bacon_Grilled_No_Egg");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(425, 200, 60, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Brk_Wrap_Bacon_Grilled_No_Egg_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Brk_Wrap_Bacon_Grilled_No_Egg_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		// System.out.println(imageText);

		// System.out.println(b.read_Brk_Wrap_Bacon_Grilled_No_Egg_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Brk_Wrap_Bacon_Grilled_No_Egg_Price();

		System.out.println("Price from picture in POS: " + a1);
		System.out.println("Price from pricing sheet: " + a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Brk Wrap Bacon Grilled No Egg");

			System.out.println(
					"***********Scenario055 PASS: Correct ala carte price of Brk Wrap Bacon Grilled No Egg.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Brk Wrap Bacon Grilled No Egg."
					+ " Expected Price: " + b.read_Brk_Wrap_Bacon_Grilled_No_Egg_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario055 FAIL: Incorrect ala carte price of Brk Wrap Bacon Grilled No Egg.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

		  s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		 s.wait(VoidItem, 300);
			s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 56)
	public void siKuliTestCase0056(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent
				.createTest("TC_0056: Verify Brk_Wrap_Egg_Grilled Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(4000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		
		
		Thread.sleep(6000);
		s.wait(Wraps, 300);
		s.click(Wraps.similar((float) 0.5));
		
		
		
		s.wait(BRK_WRAP_EGG_GRILLED, 300);
		s.click(BRK_WRAP_EGG_GRILLED.similar((float) 0.5));
		
	
		testcase.log(Status.PASS, "User able to click on Brk_Wrap_Egg_Grilled");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 205, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Brk_Wrap_Egg_Grilled_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Brk_Wrap_Egg_Grilled_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		// System.out.println(imageText);

		// System.out.println(b.read_Brk_Wrap_Egg_Grilled_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Brk_Wrap_Egg_Grilled_Price();

		System.out.println("Price from picture in POS: " + a1);
		System.out.println("Price from pricing sheet: " + a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Brk Wrap Egg Grilled");

			System.out.println(
					"***********Scenario056 PASS: Correct ala carte price of Brk Wrap Egg Grilled.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Brk Wrap Egg Grilled." + " Expected Price: "
					+ b.read_Brk_Wrap_Egg_Grilled_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario056 FAIL: Incorrect ala carte price of Brk Wrap Egg Grilled.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 57)
	public void siKuliTestCase0057(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent
				.createTest("TC_0057: Verify Brk_Wrap_Sausage_Grilled Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(4000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		
		
		Thread.sleep(4000);
		s.wait(Wraps, 300);
		s.click(Wraps.similar((float) 0.5));
		s.wait(BRK_WRAP_SAUSAGE_GRILLED, 300);
		s.click(BRK_WRAP_SAUSAGE_GRILLED.similar((float) 0.5));

		testcase.log(Status.PASS, "User able to click on Brk_Wrap_Sausage_Grilled");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(425, 200, 60, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Brk_Wrap_Sausage_Grilled_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Brk_Wrap_Sausage_Grilled_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		// System.out.println(imageText);

		// System.out.println(b.read_Brk_Wrap_Sausage_Grilled_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Brk_Wrap_Sausage_Grilled_Price();

		System.out.println("Price from picture in POS: " + a1);
		System.out.println("Price from pricing sheet: " + a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Brk Wrap Sausage Grilled");

			System.out.println(
					"***********Scenario057 PASS: Correct ala carte price of Brk Wrap Sausage Grilled.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Brk Wrap Sausage Grilled." + " Expected Price: "
					+ b.read_Brk_Wrap_Sausage_Grilled_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario057 FAIL: Incorrect ala carte price of Brk Wrap Sausage Grilled.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 58)
	public void siKuliTestCase0058(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent.createTest(
				"TC_0058: Verify Brk_Wrap_Sausage_Grilled_No_Egg Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(4000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		
		
		Thread.sleep(4000);
		s.wait(Wraps, 300);
		s.click(Wraps.similar((float) 0.5));
		s.wait(OtherBrkFastWrapButton, 300);
		s.click(OtherBrkFastWrapButton.similar((float) 0.5));
		
		s.wait(BRK_WRAP_SAUSAGE_GRILLED_NO_EGG, 300);
		s.click(BRK_WRAP_SAUSAGE_GRILLED_NO_EGG.similar((float) 0.5));

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(425, 200, 60, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Brk_Wrap_Sausage_Grilled_No_Egg_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Brk_Wrap_Sausage_Grilled_No_Egg_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		// System.out.println(imageText);

		// System.out.println(b.read_Brk_Wrap_Sausage_Grilled_No_Egg_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Brk_Wrap_Sausage_Grilled_No_Egg_Price();

		System.out.println("Price from picture in POS: " + a1);
		System.out.println("Price from pricing sheet: " + a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Brk Wrap Sausage Grilled No Egg");

			System.out.println(
					"***********Scenario058 PASS: Correct ala carte price of Brk Wrap Sausage Grilled No Egg.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Brk Wrap Sausage Grilled No Egg."
					+ " Expected Price: " + b.read_Brk_Wrap_Sausage_Grilled_No_Egg_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario058 FAIL: Incorrect ala carte price of Brk Wrap Sausage Grilled No Egg.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

		  s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		
		
		 s.wait(VoidItem, 300);
			s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 59)
	public void siKuliTestCase0059(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent.createTest(
				"TC_0059: Verify Smokey Honey Bacon Breakfast Sandwich Biscuit Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(4000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		
		
		Thread.sleep(4000);
		s.wait(Sandwiches, 300);
		s.click(Sandwiches.similar((float) 0.5));
		s.wait(Other_Brk_Sand_Button, 300);
		s.click(Other_Brk_Sand_Button.similar((float) 0.5));
		
		s.wait(SmokyHoney_Bacon_Breakfast_sandwich, 300);
		s.click(SmokyHoney_Bacon_Breakfast_sandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Smokey Honey Bacon Breakfast Sandwich Biscuit");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Smokey_Honey_Bacon_Breakfast_Sandwich_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Smokey_Honey_Bacon_Breakfast_Sandwich_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		// System.out.println(imageText);

		// System.out.println(b.read_Brk_Wrap_Sausage_Grilled_No_Egg_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Smokey_Hny_Bcn_Brk_Sandwich_Biscuit_Price();

		System.out.println("Price from picture in POS: " + a1);
		System.out.println("Price from pricing sheet: " + a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Smokey Honey Bacon Breakfast Sandwich");

			System.out.println(
					"***********Scenario059 PASS: Correct ala carte price of Smokey Honey Bacon Breakfast Sandwich.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Smokey Honey Bacon Breakfast Sandwich."
					+ " Expected Price: " + b.read_Smokey_Hny_Bcn_Brk_Sandwich_Biscuit_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario059 FAIL: Incorrect ala carte price of Smokey Honey Bacon Breakfast Sandwich.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

		  s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		
		
		 s.wait(VoidItem, 300);
			s.click(VoidItem.similar((float) 0.5));

	}
	
	@Test(priority = 60)
	public void siKuliTestCase0060(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent.createTest(
				"TC_0060: Verify Smokey Honey Bacon Breakfast Sandwich English Muffin Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(4000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		
		
		Thread.sleep(4000);
		s.wait(Sandwiches, 300);
		s.click(Sandwiches.similar((float) 0.5));
		Thread.sleep(2000);
		s.wait(Other_Brk_Sand_Button, 300);
		s.click(Other_Brk_Sand_Button.similar((float) 0.5));
		
		s.wait(SmokyHoney_Bacon_Breakfast_sandwich, 300);
		s.click(SmokyHoney_Bacon_Breakfast_sandwich.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Smokey Honey Bacon Breakfast Sandwich English Muffin");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Smokey_Honey_Bacon_Breakfast_Sandwich_English_Muffin_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Smokey_Honey_Bacon_Breakfast_Sandwich_English_Muffin_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		// System.out.println(imageText);

		// System.out.println(b.read_Brk_Wrap_Sausage_Grilled_No_Egg_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Smokey_Hny_Bcn_Brk_Sandwich_Muffin_Price();

		System.out.println("Price from picture in POS: " + a1);
		System.out.println("Price from pricing sheet: " + a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Smokey Honey Bacon Breakfast Sandwich English Muffin");

			System.out.println(
					"***********Scenario060 PASS: Correct ala carte price of Smokey Honey Bacon Breakfast Sandwich English Muffin.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Smokey Honey Bacon Breakfast Sandwich English Muffin."
					+ " Expected Price: " + b.read_Smokey_Hny_Bcn_Brk_Sandwich_Muffin_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario060 FAIL: Incorrect ala carte price of Smokey Honey Bacon Breakfast Sandwich English Muffin.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

		  s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		
		
		 s.wait(VoidItem, 300);
			s.click(VoidItem.similar((float) 0.5));

	}
	
	@Test(priority = 61)
	public void siKuliTestCase0061(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BreakfastItems b = new BreakfastItems(s);

		testcase = extent.createTest(
				"TC_0061: Verify Smokey Honey Bacon Farmers Breakfast Sandwich English Muffin Price. " + "Region Id: " + b.read_Region_Id());

		Thread.sleep(4000);
		s.wait(Breakfast, 300);
		s.click(Breakfast.similar((float) 0.5));
		
		
		Thread.sleep(4000);
//		s.wait(Sandwiches, 300);
//		s.click(Sandwiches.similar((float) 0.5));
		//Thread.sleep(2000);
		s.wait(Farmers_Sandwiches, 300);
		s.click(Farmers_Sandwiches.similar((float) 0.5));
		
		s.wait(Smky_Hny_Bcn_Frm_Sand, 300);
		s.click(Smky_Hny_Bcn_Frm_Sand.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on Smokey Honey Bacon Farmers Breakfast Sandwich English Muffin");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(425, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Smky_Hny_Bcn_Frm_Sandh_English_Muffin_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Smky_Hny_Bcn_Frm_Sand_English_Muffin_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		// System.out.println(imageText);

		// System.out.println(b.read_Brk_Wrap_Sausage_Grilled_No_Egg_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Smokey_Hny_Bcn_Frm_Brk_Sandwich_Muffin_Price();

		System.out.println("Price from picture in POS: " + a1);
		System.out.println("Price from pricing sheet: " + a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Smokey Honey Bacon Farmers Breakfast Sandwich English Muffin");

			System.out.println(
					"***********Scenario061 PASS: Correct ala carte price of Smokey Honey Bacon Farmers Breakfast Sandwich English Muffin.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Smokey Honey Bacon Farmers Breakfast Sandwich English Muffin."
					+ " Expected Price: " + b.read_Smokey_Hny_Bcn_Frm_Brk_Sandwich_Muffin_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario061 FAIL: Incorrect ala carte price of Smokey Honey Bacon Farmers Breakfast Sandwich English Muffin.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

		  s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
		
		
		 s.wait(VoidItem, 300);
			s.click(VoidItem.similar((float) 0.5));

	}
	
	@Test(priority = 62) 

	public void siKuliTestCase0062(ExtentReports extent, ExtentTest testcase) throws FindFailed, IOException, TesseractException, InterruptedException  

	{	  

	BreakfastItems b = new BreakfastItems(s); 

	testcase=extent.createTest("TC_0060: Verify Craveables Bundle Price. "+"Region Id: "+b.read_Region_Id()); 

	Thread.sleep(2000); 
	s.wait(Breakfast,300); 
	s.click(Breakfast.similar((float)0.5)); 

	testcase.log(Status.PASS, "User able to click on Breakfast"); 

	Thread.sleep(2000); 
	s.wait(OtherBrkFastButton,300); 
	s.click(OtherBrkFastButton.similar((float)0.5)); 

	testcase.log(Status.PASS, " User able to click on Other "); 
	
	s.wait(DeliveryBundles,300); 
	s.click(DeliveryBundles.similar((float)0.5)); 

	testcase.log(Status.PASS, " User able to click on Delivery_Bundles "); 

	s.wait(Craveables_Bundle,300); 

	s.click(Craveables_Bundle.similar((float)0.5)); 

	testcase.log(Status.PASS, " User able to click on Craveables_Bundle "); 

	s.wait(EatIn, 300);   

	s.click(EatIn.similar((float)0.8)); 

	testcase.log(Status.PASS, "User able to click on Eat In"); 

	Thread.sleep(4000); 

	Rectangle rectangle=new Rectangle();

	rectangle.setBounds(420,200,60,30); 

	String imagePath  = capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Craveables_Bundle_Price"); 

	rectangle.setBounds(210,200,275,30); 

	String  pricewithname=capture(rectangle).save(System.getProperty("user.dir")+"/Image/", "Craveables_Bundle_Price_Withname"); 

	ITesseract image = new Tesseract(); 

	image.setDatapath(".\\tessdata"); 

	String imageText=image.doOCR(new File(imagePath)); 

	System.out.println(imageText); 

	System.out.println(b.read_Craveables_Bundle_price()); 

	String a1=null; 

	String a2=null; 

	//Price validation 

	String replaceAll = imageText.replaceAll("\\s",""); 

	a1 = replaceAll; 

	a2 =b.read_Craveables_Bundle_price(); 

	System.out.println(a1); 

	System.out.println(a2); 

	if(a1.equals(a2)){ 

	 testcase.log(Status.PASS," Correct ala carte price of Craveables Bundle"); 

	 System.out.println("***********Scenario060 PASS: Correct ala carte price of Craveables Bundle.  ***********"); 


	} 

	else { 

	testcase.log(Status.FAIL," Incorrect ala carte price of Craveables Bundle."+" Expected Price: "+b.read_Craveables_Bundle_price()); 

	testcase.addScreenCaptureFromPath(pricewithname); 

	System.out.println("***********Scenario062 FAIL: Incorrect ala carte price of Craveables Bundle.***********"); 

	} 

	s.wait(VoidItem, 300); 

	s.click(VoidItem.similar((float)0.5)); 

	s.wait(VoidItem, 300); 

	s.click(VoidItem.similar((float)0.5)); 

	s.wait(VoidItem, 300); 

	s.click(VoidItem.similar((float)0.5)); 

	} 

	
	
}
