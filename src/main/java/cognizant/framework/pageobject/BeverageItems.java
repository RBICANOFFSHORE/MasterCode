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
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//import excel.Read_Data;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
//Frrom here editingy

public class BeverageItems extends Read_Data {

	ExtentReports extent;
	ExtentSparkReporter html;
	ExtentTest testcase;

	Pattern Beverages = new Pattern("C:\\Images For Sikuli\\Beverages.png");
	Pattern OriginalBlend = new Pattern("C:\\Images For Sikuli\\OriginalBlend.png");
	Pattern RefillSmallOriginalBlend = new Pattern("C:\\Images For Sikuli\\RefillSmallOriginalBlend.png");
	Pattern RefillMediumOriginalBlend = new Pattern("C:\\Images For Sikuli\\RefillMediumOriginalBlend.png");
	Pattern RefillLargeOriginalBlend = new Pattern("C:\\Images For Sikuli\\RefillLargeOriginalBlend.png");
	Pattern RefillExtraLargeOriginalBlend = new Pattern("C:\\Images For Sikuli\\RefillExtraLargeOriginalBlend.png");
	Pattern DarkRoast = new Pattern("C:\\Images For Sikuli\\DarkRoast.png");
	Pattern SmallDarkRoast = new Pattern("C:\\Images For Sikuli\\SmallDarkRoast.png");
	Pattern MediumDarkRoast = new Pattern("C:\\Images For Sikuli\\MediumDarkRoast.png");
	Pattern LargeDarkRoast = new Pattern("C:\\Images For Sikuli\\LargeDarkRoast.png");
	Pattern ExtraLargeDarkRoast = new Pattern("C:\\Images For Sikuli\\ExtraLargeDarkRoast.png");
	Pattern SmallRefillDarkRoast = new Pattern("C:\\Images For Sikuli\\SmallRefillDarkRoast.png");
	Pattern MediumRefillDarkRoast = new Pattern("C:\\Images For Sikuli\\MediumRefillDarkRoast.png");
	Pattern LargeRefillDarkRoast = new Pattern("C:\\Images For Sikuli\\LargeRefillDarkRoast.png");
	Pattern ExtraLargeRefillDarkRoast = new Pattern("C:\\Images For Sikuli\\ExtraLargeRefillDarkRoast.png");
	Pattern Decaf = new Pattern("C:\\Images For Sikuli\\Decaf.png");
	Pattern SmallSpecialtyTea = new Pattern("C:\\Images For Sikuli\\SmallSpecialtyTea.png");
	Pattern MediumSpecialtyTea = new Pattern("C:\\Images For Sikuli\\MediumSpecialtyTea.png");

	Pattern SteepedTea = new Pattern("C:\\Images For Sikuli\\SteepedTea.png");
	Pattern SteepedTeaSmall = new Pattern("C:\\\\Images For Sikuli\\\\SteepedTeaSmall.png");
	Pattern SteepedTeaMedium = new Pattern("C:\\\\Images For Sikuli\\\\SteepedTeaMedium.png");
	Pattern SteepedTeaLarge = new Pattern("C:\\\\Images For Sikuli\\\\SteepedTeaLarge.png");
	Pattern SteepedTeaExtraLarge = new Pattern("C:\\\\Images For Sikuli\\\\SteepedTeaExtraLarge.png");
	Pattern SteepedTeaSmallRefill = new Pattern("C:\\Images For Sikuli\\SteepedTeaSmallRefill.png");
	Pattern SteepedTeaMediumRefill = new Pattern("C:\\Images For Sikuli\\SteepedTeaMediumRefill.png");
	Pattern SteepedTeaLargeRefill = new Pattern("C:\\Images For Sikuli\\SteepedTeaLargeRefill.png");
	Pattern SteepedTeaExtraLargeRefill = new Pattern("C:\\Images For Sikuli\\SteepedTeaExtraLargeRefill.png");
	Pattern Latte = new Pattern("C:\\Images For Sikuli\\Latte.png");
	Pattern SmallLatte = new Pattern("C:\\Images For Sikuli\\SmallLatte.png");
	Pattern SmallRefillLatte = new Pattern("C:\\Images For Sikuli\\SmallRefillLatte.png");

	Pattern MediumLatte = new Pattern("C:\\Images For Sikuli\\MediumLatte.png");
	Pattern SmallDecaf = new Pattern("C:\\Images For Sikuli\\SmallDecaf.png");
	Pattern MediumDecaf = new Pattern("C:\\Images For Sikuli\\MediumDecaf.png");
	Pattern LargeDecaf = new Pattern("C:\\Images For Sikuli\\LargeDecaf.png");
	Pattern ExtraLargeDecaf = new Pattern("C:\\Images For Sikuli\\ExtraLargeDecaf.png");
	Pattern SmallDecafRefil = new Pattern("C:\\Images For Sikuli\\SmallDecafRefil.png");
	Pattern MediumDecafRefil = new Pattern("C:\\Images For Sikuli\\MediumDecafRefil.png");
	Pattern LargeDecafRefil = new Pattern("C:\\Images For Sikuli\\LargeDecafRefil.png");
	Pattern LargeLatte = new Pattern("C:\\Images For Sikuli\\LargeLatte.png");
	// Pattern ExtraLargeDecafRefil = new Pattern("C:\\Images For
	// Sikuli\\ExtraLargeDecafRefil.png");
	Pattern RefillDecafExtraLarge = new Pattern("C:\\Images For Sikuli\\RefillDecafExtraLarge.png");

	Pattern IcedBeverages = new Pattern("C:\\Images For Sikuli\\IcedBeverages.png");
	Pattern IcedCoffee = new Pattern("C:\\Images For Sikuli\\IcedCoffee.png");
	Pattern OrgIcedCoffee = new Pattern("C:\\Images For Sikuli\\OrgIcedCoffe.png");
	Pattern MDIcedCoffee = new Pattern("C:\\Images For Sikuli\\MDIcedCoffee.png");
	// adding new Iced Capp
	Pattern BeveragesButton = new Pattern("C:\\Images For Sikuli\\BeveragesButton.png");
	Pattern IcedCappuccino = new Pattern("C:\\Images For Sikuli\\IcedCappuccino.png");
	Pattern IcedCappuccinoLight = new Pattern("C:\\Images For Sikuli\\IcedCappuccinoLight.png");
	Pattern SmallIcedCappuccino = new Pattern("C:\\Images For Sikuli\\SmallIcedCappuccino.png");
	Pattern MediumIcedCappuccino = new Pattern("C:\\Images For Sikuli\\MediumIcedCappuccino.png");
	Pattern LargeIcedCappuccino = new Pattern("C:\\Images For Sikuli\\LargeIcedCappuccino.png");
	Pattern SmallRefilIcedCappuccino = new Pattern("C:\\Images For Sikuli\\SmallRefilIcedCappuccino.png");
	Pattern MediumRefilIcedCappuccino = new Pattern("C:\\Images For Sikuli\\MediumRefilIcedCappuccino.png");
	Pattern LargeRefilIcedCappuccino = new Pattern("C:\\Images For Sikuli\\LargeRefilIcedCappuccino.png");
	Pattern SmallIcedCappuccinoLight = new Pattern("C:\\Images For Sikuli\\SmallIcedCappuccinoLight.png");
	Pattern MediumIcedCappuccinoLight = new Pattern("C:\\Images For Sikuli\\MediumIcedCappuccinoLight.png");
	Pattern LargeIcedCappuccinoLight = new Pattern("C:\\Images For Sikuli\\LargeIcedCappuccinoLight.png");
	Pattern SmallRefilIcedCappuccinoLight = new Pattern("C:\\Images For Sikuli\\SmallRefilIcedCappuccinoLight.png");
	Pattern MediumRefilIcedCappuccinoLight = new Pattern("C:\\Images For Sikuli\\MediumRefilIcedCappuccinoLight.png");
	Pattern LargeRefilIcedCappuccinoLight = new Pattern("C:\\Images For Sikuli\\LargeRefilIcedCappuccinoLight.png");
	Pattern SmallMochaIcedCappuccino = new Pattern("C:\\Images For Sikuli\\SmallMochaIcedCappuccino.png");
	Pattern MediumMochaIcedCappuccino = new Pattern("C:\\Images For Sikuli\\MediumMochaIcedCappuccino.png");
	Pattern LargeMochaIcedCappuccino = new Pattern("C:\\Images For Sikuli\\LargeMochaIcedCappuccino.png");
	Pattern SmallRefilMochaIcedCappuccino = new Pattern("C:\\Images For Sikuli\\SmallRefilMochaIcedCappuccino.png");
	Pattern MediumRefilMochaIcedCappuccino = new Pattern("C:\\Images For Sikuli\\MediumRefilMochaIcedCappuccino.png");
	Pattern LargeRefilMochaIcedCappuccino = new Pattern("C:\\Images For Sikuli\\LargeRefilMochaIcedCappuccino.png");
	Pattern FlavouredIcedCappuccino = new Pattern("C:\\Images For Sikuli\\FlavouredIcedCappuccino.png");
	Pattern MochaIcedCappuccino = new Pattern("C:\\Images For Sikuli\\MochaIcedCappuccino.png");
	Pattern Pumpkin_Spice_Iced_Capp = new Pattern("C:\\Images For Sikuli\\Pumpkin_Spice_Iced_Capp.png");
	Pattern smallPumpkinSpiceIcedCapp = new Pattern("C:\\Images For Sikuli\\small_Pumpkin_Spice_Iced_Capp.png");
	Pattern mediumPumpkinSpiceIcedCapp = new Pattern("C:\\Images For Sikuli\\Medium_Pumpkin_Spice_Iced_Capp.png");
	Pattern largePumpkinSpiceIcedCapp = new Pattern("C:\\Images For Sikuli\\Large_Pumpkin_Spice_Iced_Capp.png");
	Pattern RefilSmallPumpkinSpiceIcedCapp = new Pattern(
			"C:\\Images For Sikuli\\Refil_Small_Pumpkin_Spice_Iced_Capp.png");
	Pattern RefilMediumPumpkinSpiceIcedCapp = new Pattern(
			"C:\\Images For Sikuli\\Refil_Medium_Pumpkin_Spice_Iced_Capp.png");
	Pattern RefilLargePumpkinSpiceIcedCapp = new Pattern(
			"C:\\Images For Sikuli\\Refil_Large_Pumpkin_Spice_Iced_Capp.png");
	Pattern smallRedeyeIcedCapp = new Pattern("C:\\Images For Sikuli\\ small Redeye Iced Capp.png");
	Pattern Americano = new Pattern("C:\\Images For Sikuli\\AmericanoButton.png");
	Pattern SmallAmericano = new Pattern("C:\\Images For Sikuli\\SmallAmericano.png");
	Pattern MediumAmericano = new Pattern("C:\\Images For Sikuli\\MediumAmericano.png");
	Pattern LargeAmericano = new Pattern("C:\\Images For Sikuli\\LargeAmericano.png");
	Pattern RefillSmallAmericano = new Pattern("C:\\Images For Sikuli\\RefillSmallAmericano.png");
	Pattern RefillMediumAmericano = new Pattern("C:\\Images For Sikuli\\RefillMediumAmericano.png");
	Pattern RefillLargeAmericano = new Pattern("C:\\Images For Sikuli\\RefillLargeAmericano.png");
	Pattern RedeyeIcedCapp = new Pattern("C:\\Images For Sikuli\\RedeyeIcedCappuccino.png");
	Pattern SmallRedeyeIcedCapp = new Pattern("C:\\Images For Sikuli\\SmallRedeyeIcedCappuccino.png");
	Pattern MediumRedeyeIcedCapp = new Pattern("C:\\Images For Sikuli\\MediumRedeyeIcedCappuccino.png");
	Pattern LargeRedeyeIcedCapp = new Pattern("C:\\Images For Sikuli\\LargeRedeyeIcedCappuccino.png");
	Pattern SmallRefillRedeyeIcedCapp = new Pattern("C:\\Images For Sikuli\\SmallRefillRedeyeIcedCappuccino.png");
	Pattern MediumRefillRedeyeIcedCapp = new Pattern("C:\\Images For Sikuli\\MediumRefillRedeyeIcedCappuccino.png");
	Pattern LargeRefillRedeyeIcedCapp = new Pattern("C:\\Images For Sikuli\\LargeRefillRedeyeIcedCappuccino.png");
	Pattern TeaLatteButton = new Pattern("C:\\Images For Sikuli\\TeaLatteButton.png");
	Pattern TeaLatteButton2 = new Pattern("C:\\Images For Sikuli\\TeaLatteButton2.png");
	Pattern SMTeaLatte = new Pattern("C:\\Images For Sikuli\\SMTeaLatte.png");
	Pattern MDTeaLatte = new Pattern("C:\\Images For Sikuli\\MDTeaLatte.png");
	Pattern LGTeaLatte = new Pattern("C:\\Images For Sikuli\\LGTeaLatte.png");
	Pattern RSTeaLatte = new Pattern("C:\\Images For Sikuli\\RSTeaLatte.png");
	Pattern RMTeaLatte = new Pattern("C:\\Images For Sikuli\\RMTeaLatte.png");
	Pattern RLTeaLatte = new Pattern("C:\\Images For Sikuli\\RLTeaLatte.png");
	// Pattern LondonFogButton2 = new Pattern("C:\\Images For
	// Sikuli\\LondonFogButton2.png");
	Pattern LondonFogButton = new Pattern("C:\\Images For Sikuli\\LondonFogButton.png");
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
	Pattern SMCoffee = new Pattern("C:/Images For Sikuli/SMCoffee.png");
	Pattern MDCoffee = new Pattern("C:/Images For Sikuli/MDCoffee.png");
	Pattern LGCoffee = new Pattern("C:/Images For Sikuli/LGCoffee.png");
	Pattern EatIn = new Pattern("C:/Images For Sikuli/EatIn.png");

	// Edited for pattern class

	Pattern CaramelIcedCapp = new Pattern("C:\\Images For Sikuli\\CaramelIcedCapp.png");
	Pattern smallCaramelIcedCapp = new Pattern("C:\\Images For Sikuli\\smallCaramelIcedCapp.png");
	Pattern mediumCaramelIcedCapp = new Pattern("C:\\Images For Sikuli\\mediumCaramelIcedCapp.png");
	Pattern largeCaramelIcedCapp = new Pattern("C:\\Images For Sikuli\\largeCaramelIcedCapp.png");
	Pattern RefilSmallCaramelIcedCapp = new Pattern("C:\\Images For Sikuli\\RefilSmallCaramelIcedCapp.png");
	Pattern RefilMediumCaramelIcedCapp = new Pattern("C:\\Images For Sikuli\\RefilMediumCaramelIcedCapp.png");
	Pattern RefilLargeCaramelIcedCapp = new Pattern("C:\\Images For Sikuli\\RefilLargeCaramelIcedCapp.png");
	Pattern VanilaIcedCapp = new Pattern("C:\\Images For Sikuli\\VanilaIcedCapp.png");
	Pattern smallVanilaIcedCapp = new Pattern("C:\\Images For Sikuli\\smallVanilaIcedCapp.png");
	Pattern mediumVanilaIcedCapp = new Pattern("C:\\Images For Sikuli\\mediumVanilaIcedCapp.png");
	Pattern largeVanilaIcedCapp = new Pattern("C:\\Images For Sikuli\\largeVanilaIcedCapp.png");
	Pattern RefilSmallVanilaIcedCapp = new Pattern("C:\\Images For Sikuli\\RefilSmallVanilaIcedCapp.png");
	Pattern RefilMediumVanilaIcedCapp = new Pattern("C:\\Images For Sikuli\\RefilMediumVanilaIcedCapp.png");
	Pattern RefilLargeVanilaIcedCapp = new Pattern("C:\\Images For Sikuli\\RefilLargeVanilaIcedCapp.png");

	Pattern CreamyChill = new Pattern("C:\\Images For Sikuli\\CreamyChill.png");
	Pattern ChocolateCreamyChill = new Pattern("C:\\Images For Sikuli\\ChocolateCreamyChill.png");
	Pattern VanillaCreamyChill = new Pattern("C:\\Images For Sikuli\\VanillaCreamyChill.png");
	Pattern StrawberryCreamyChill = new Pattern("C:\\Images For Sikuli\\StrawberryCreamyChill.png");
	Pattern SmallChocolateCreamyChill = new Pattern("C:\\Images For Sikuli\\SmallChocolateCreamyChill.png");
	Pattern MediumChocolateCreamyChill = new Pattern("C:\\Images For Sikuli\\MediumChocolateCreamyChill.png");
	Pattern LargeChocolateCreamyChill = new Pattern("C:\\Images For Sikuli\\LargeChocolateCreamyChill.png");
	Pattern RefilSmallChocolateCreamyChill = new Pattern("C:\\Images For Sikuli\\RefilSmallChocolateCreamyChill.png");
	Pattern RefilMediumChocolateCreamyChill = new Pattern("C:\\Images For Sikuli\\RefilMediumChocolateCreamyChill.png");
	Pattern RefilLargeChocolateCreamyChill = new Pattern("C:\\Images For Sikuli\\RefilLargeChocolateCreamyChill.png");
	Pattern SmallVanillaCreamyChill = new Pattern("C:\\Images For Sikuli\\SmallVanillaCreamyChill.png");
	Pattern MediumVanillaCreamyChill = new Pattern("C:\\Images For Sikuli\\MediumVanillaCreamyChill.png");
	Pattern LargeVanillaCreamyChill = new Pattern("C:\\Images For Sikuli\\LargeVanillaCreamyChill.png");
	Pattern RefilSmallVanillaCreamyChill = new Pattern("C:\\Images For Sikuli\\RefillSmallVanillaCreamyChill.png");
	Pattern RefilMediumVanillaCreamyChill = new Pattern("C:\\Images For Sikuli\\RefilMediumVanillaCreamyChill.png");
	Pattern RefilLargeVanillaCreamyChill = new Pattern("C:\\Images For Sikuli\\RefilLargeVanillaCreamyChill.png");
	Pattern SmallStrawberryCreamyChill = new Pattern("C:\\Images For Sikuli\\SmallStrawberryCreamyChill.png");
	Pattern MediumStrawberryCreamyChill = new Pattern("C:\\Images For Sikuli\\MediumStrawberryCreamyChill.png");
	Pattern LargeStrawberryCreamyChill = new Pattern("C:\\Images For Sikuli\\LargeStrawberryCreamyChill.png");
	Pattern RefilSmallStrawberryCreamyChill = new Pattern("C:\\Images For Sikuli\\RefilSmallStrawberryCreamyChill.png");
	Pattern RefilMediumStrawberryCreamyChill = new Pattern(
			"C:\\Images For Sikuli\\RefilMediumStrawberryCreamyChill.png");
	Pattern RefilLargeStrawberryCreamyChill = new Pattern("C:\\Images For Sikuli\\RefilLargeStrawberryCreamyChill.png");
	Pattern Frozen_Lemonade = new Pattern("C:\\Images For Sikuli\\Frozen_Lemonade.png");
	Pattern Original_Lemonade = new Pattern("C:\\Images For Sikuli\\Original_Lemonade.png");
	Pattern Small_Original_Lemonade = new Pattern("C:\\Images For Sikuli\\Small_Original_Lemonade.png");
	Pattern Medium_Original_Lemonade = new Pattern("C:\\Images For Sikuli\\Medium_Original_Lemonade.png");
	Pattern Large_Original_Lemonade = new Pattern("C:\\Images For Sikuli\\Large_Original_Lemonade.png");
	Pattern Refill_Small_Original_Lemonade = new Pattern("C:\\Images For Sikuli\\Refill_Small_Original_Lemonade.png");
	Pattern Refill_Medium_Original_Lemonade = new Pattern("C:\\Images For Sikuli\\Refill_Medium_Original_Lemonade.png");
	Pattern RefilL_Large_Original_Lemonade = new Pattern("C:\\Images For Sikuli\\RefilL_Large_Original_Lemonade.png");

	Pattern Small_Strawberry_Lemonade = new Pattern("C:\\Images For Sikuli\\Small_Strawberry_Lemonade.png");
	Pattern Medium_Strawberry_Lemonade = new Pattern("C:\\Images For Sikuli\\Medium_Strawberry_Lemonade.png");
	Pattern Large_Strawberry_Lemonade = new Pattern("C:\\Images For Sikuli\\Large_Strawberry_Lemonade.png");
	Pattern Refill_Small_Strawberry_Lemonade = new Pattern(
			"C:\\Images For Sikuli\\Refill_Small_Strawberry_Lemonade.png");
	Pattern Refill_Medium_Strawberry_Lemonade = new Pattern(
			"C:\\Images For Sikuli\\Refill_Medium_Strawberry_Lemonade.png");
	Pattern Refill_Large_Strawberry_Lemonade = new Pattern(
			"C:\\Images For Sikuli\\Refill_Large_Strawberry_Lemonade.png");
	Pattern Strawberry_Lemonade = new Pattern("C:\\Images For Sikuli\\Strawberry_Lemonade.png");

	Pattern Quenchers = new Pattern("C:\\Images For Sikuli\\Quenchers.png");
	Pattern ClassicLemonade = new Pattern("C:\\Images For Sikuli\\ClassicLemonade.png");
	Pattern SmallClassicLemonade = new Pattern("C:\\Images For Sikuli\\SmallClassicLemonade.png");
	Pattern MediumClassicLemonade = new Pattern("C:\\Images For Sikuli\\MediumClassicLemonade.png");
	Pattern LargeClassicLemonade = new Pattern("C:\\Images For Sikuli\\LargeClassicLemonade.png");
	Pattern RefilSmallClassicLemonade = new Pattern("C:\\Images For Sikuli\\RefilSmallClassicLemonade.png");
	Pattern RefilMediumClassicLemonade = new Pattern("C:\\Images For Sikuli\\RefilMediumClassicLemonade.png");
	Pattern RefilLargeClassicLemonade = new Pattern("C:\\Images For Sikuli\\RefilLargeClassicLemonade.png");
	Pattern FruitSmoothie = new Pattern("C:\\Images For Sikuli\\FruitSmoothie.png");
	Pattern FruitSmoothieStrawberry = new Pattern("C:\\Images For Sikuli\\FruitSmoothieStrawberry.png");
	Pattern SmallFruitSmoothieStrawberry = new Pattern("C:\\Images For Sikuli\\SmallFruitSmoothieStrawberry.png");
	Pattern MediumFruitSmoothieStrawberry = new Pattern("C:\\Images For Sikuli\\MediumFruitSmoothieStrawberry.png");
	Pattern LargeFruitSmoothieStrawberry = new Pattern("C:\\Images For Sikuli\\LargeFruitSmoothieStrawberry.png");
	Pattern RefilSmallFruitSmoothieStrawberry = new Pattern(
			"C:\\Images For Sikuli\\RefilSmallFruitSmoothieStrawberry.png");
	Pattern RefilMediumFruitSmoothieStrawberry = new Pattern(
			"C:\\Images For Sikuli\\RefilMediumFruitSmoothieStrawberry.png");
	Pattern RefilLargeFruitSmoothieStrawberry = new Pattern(
			"C:\\Images For Sikuli\\RefilLargeFruitSmoothieStrawberry.png");
	Pattern BaileysIcedCapp = new Pattern("C:\\Images For Sikuli\\BaileysIcedCapp.png");
	Pattern SmallBaileysIcedCapp = new Pattern("C:\\Images For Sikuli\\SmallBaileysIcedCapp");
	Pattern MediumBaileysIcedCapp = new Pattern("C:\\Images For Sikuli\\MediumBaileysIcedCapp.png");
	Pattern LargeBaileysIcedCapp = new Pattern("C:\\Images For Sikuli\\Large_Baileyes_Iced_Capp.png");
	Pattern RefilSmallBaileysIcedCapp = new Pattern("C:\\Images For Sikuli\\RefilSmallBaileysIcedCapp.png");
	Pattern RefilMediumBaileysIcedCapp = new Pattern("C:\\Images For Sikuli\\RefilMediumBaileysIcedCapp.png");
	Pattern RefilLargeBaileysIcedCapp = new Pattern("C:\\Images For Sikuli\\RefilLargeBaileysIcedCapp.png");
	Pattern HotChocolate = new Pattern("C:\\Images For Sikuli\\Hot_Chocolate.png");
	Pattern SmallHotChocolate = new Pattern("C:\\Images For Sikuli\\Small_Hot_Chocolate.png");
	Pattern MediumHotChocolate = new Pattern("C:\\Images For Sikuli\\Medium_Hot_Chocolate.png");
	Pattern LargeHotChocolate = new Pattern("C:\\Images For Sikuli\\Large_Hot_Chocolate.png");
	Pattern ExtraLargeHotChocolate = new Pattern("C:\\Images For Sikuli\\Extra_Large_Hot_Chocolate.png");
	Pattern Refil_Small_Hot_Chocolate = new Pattern("C:\\Images For Sikuli\\Refil_Small_Hot_Chocolate.png");
	Pattern Refil_Medium_Hot_Chocolate = new Pattern("C:\\Images For Sikuli\\Refil_Medium_Hot_Chocolate.png");
	Pattern Refil_Large_Hot_Chocolate = new Pattern("C:\\Images For Sikuli\\Refil_Large_Hot_Chocolate.png");
	Pattern Refil_XL_Hot_Chocolate = new Pattern("C:\\Images For Sikuli\\Refil_XL_Hot_Chocolate.png");
	Pattern SS_Thermos_HotChocolate = new Pattern("C:\\Images For Sikuli\\SS_Thermos_HotChocolate.png");
	Pattern BR_Thermos_HotChocolate = new Pattern("C:\\Images For Sikuli\\BR_Thermos_HotChocolate.png");
	Pattern Take12_HotChocolate = new Pattern("C:\\Images For Sikuli\\Take12_HotChocolate.png");
	Pattern White_Hot_Chocolate = new Pattern("C:\\Images For Sikuli\\White_Hot_Chocolate.png");
	Pattern SM_White_Chocolate = new Pattern("C:\\Images For Sikuli\\SM_White_Chocolate.png");
	Pattern MD_White_HotChocolate = new Pattern("C:\\Images For Sikuli\\MD_White_HotChocolate.png");
	Pattern LG_White_HotChocolate = new Pattern("C:\\Images For Sikuli\\LG_White_HotChocolate.png");
	Pattern XL_White_HotChocolate = new Pattern("C:\\Images For Sikuli\\XL_White_HotChocolate.png");
	Pattern RS_White_HotChocolate = new Pattern("C:\\Images For Sikuli\\RS_White_HotChocolate.png");
	Pattern RM_White_HotChocolate = new Pattern("C:\\Images For Sikuli\\RM_White_HotChoclate.png");
	Pattern RL_White_HotChocolate = new Pattern("C:\\Images For Sikuli\\RL_White_HotChocolate.png");
	
	
	
	
	
	
	
	Screen s;

	public BeverageItems(Screen s) {
		// TODO Auto-generated constructor stub
		this.s = s;
	}

	@Test(priority = 4)
	public void siKuliTestCase004(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_004:Verify SMOriginalBlendPrice Price");
		BeverageItems b = new BeverageItems(s);

		Thread.sleep(2000);
		s.wait(SMCoffee, 600);
		s.click(SMCoffee.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on SMCoffee");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "SMOriginalBlendPrice");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readSMOriginalBlendPrice();
		System.out.println(a1);
		System.out.println(a2);
		/*
		 * try{ parseInt = Integer.parseInt(imageText); } catch(NumberFormatException
		 * ex){ System.out.println("Exception Handled"); }
		 */
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of SM Original Blend Price");
			System.out.println(
					"***********Scenario04 PASS: Correct ala carte price of SM Original Blend Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of SM Original Blend Price");
			System.out.println(
					"***********Scenario04 FAIL: Incorrect ala carte price of SM Original Blend Price ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 5)
	public void siKuliTestCase005(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_005:Verify MDCoffee Price");
		BeverageItems b = new BeverageItems(s);

		Thread.sleep(2000);
		s.wait(MDCoffee, 300);
		s.click(MDCoffee.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on MDCoffee");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "MDOriginalBlendPrice");
		// Added by Bishal
		rectangle.setBounds(210, 200, 275, 30);
		String imagePath1 = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MDOriginalBlendPricewithname");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readMdOriginalBlendPrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readMdOriginalBlendPrice();
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
			testcase.log(Status.PASS, " Correct ala carte price of MD Original Blend Price");
			System.out.println(
					"***********Scenario05 PASS: Correct ala carte price of Md Original Blend Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of MD Original Blend Price");
			testcase.addScreenCaptureFromPath(imagePath1);
			System.out.println(
					"***********Scenario05 FAIL: Incorrect ala carte price of Md Original Blend Price ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 6)
	public void siKuliTestCase006(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_006:Verify LGCoffee Price");
		BeverageItems b = new BeverageItems(s);

		Thread.sleep(2000);
		s.wait(LGCoffee, 300);
		s.click(LGCoffee.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on LGCoffee");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on EatIn");
		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "LGOriginalBlendPrice");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readLGOriginalBlendPrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readLGOriginalBlendPrice();
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
			testcase.log(Status.PASS, " Correct ala carte price of LG Original Blend Price");
			System.out.println(
					"***********Scenario06 PASS: Correct ala carte price of Large Original Blend Price ***********");
		} else {
			testcase.log(Status.FAIL, " InCorrect ala carte price of LG Original Blend Price");
			System.out.println(
					"***********Scenario06 FAIL: Incorrect ala carte price of Large Original Blend Price ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 7)
	public void siKuliTestCase007(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_007:Verify RefillSmallOriginalBlend Price");
		BeverageItems b = new BeverageItems(s);

		Thread.sleep(2000);

		s.wait(OriginalBlend, 300);
		s.click(OriginalBlend.similar((float) 0.5));
		s.wait(RefillSmallOriginalBlend, 300);
		s.click(RefillSmallOriginalBlend.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on RefillSmallOriginalBlend");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on EatIn");
		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RFSMOriginalBlendPrice");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readRefillSmallCoffeePrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readRefillSmallCoffeePrice();
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
			testcase.log(Status.PASS, " Correct ala carte price of Small Refill Original Blend Price");
			System.out.println(
					"***********Scenario07 PASS: Correct ala carte price of Small Refill Original Blend Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Small Refill Original Blend Price");
			System.out.println(
					"***********Scenario07 FAIL: Incorrect ala carte price of Small Refill Original Blend Price ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 8)
	public void siKuliTestCase008(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_008:Verify RefillMediumOriginalBlend Price");
		BeverageItems b = new BeverageItems(s);

		Thread.sleep(2000);

		s.wait(OriginalBlend, 300);
		s.click(OriginalBlend.similar((float) 0.5));
		s.wait(RefillMediumOriginalBlend, 300);
		s.click(RefillMediumOriginalBlend.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on RefillMediumOriginalBlend");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on EatIn");
		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RFMDOriginalBlendPrice");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readRefillMediumCoffeePrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readRefillMediumCoffeePrice();
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
			testcase.log(Status.PASS, " Correct ala carte price of Medium Refill Original Blend Price");
			System.out.println(
					"***********Scenario08 PASS: Correct ala carte price of Medium Refill Original Blend Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium Refill Original Blend Price");
			System.out.println(
					"***********Scenario08 FAIL: Incorrect ala carte price of Medium Refill Original Blend Price ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 9)
	public void siKuliTestCase009(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_009:Verify RefillLargeOriginalBlend Price");
		BeverageItems b = new BeverageItems(s);

		Thread.sleep(2000);

		s.wait(OriginalBlend, 300);
		s.click(OriginalBlend.similar((float) 0.5));
		s.wait(RefillLargeOriginalBlend, 300);
		s.click(RefillLargeOriginalBlend.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on RefillLargeOriginalBlend");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on EatIn");
		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RFLGOriginalBlendPrice");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readRefillLargeCoffeePrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readRefillLargeCoffeePrice();
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
			testcase.log(Status.PASS, " Correct ala carte price of Large Refill Original Blend Price");
			System.out.println(
					"***********Scenario09 PASS: Correct ala carte price of Large Refill Original Blend Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Refill Original Blend Price");
			System.out.println(
					"***********Scenario09 FAIL: Incorrect ala carte price of Large Refill Original Blend Price ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 10)
	public void siKuliTestCase010(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_010:Verify SmallDarkRoast Price");
		BeverageItems b = new BeverageItems(s);

		Thread.sleep(2000);

		s.wait(DarkRoast, 300);
		s.click(DarkRoast.similar((float) 0.5));
		s.wait(SmallDarkRoast, 300);
		s.click(SmallDarkRoast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on SmallDarkRoast");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on EatIn");
		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "SMDarkRoastPrice");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readSmallDarkRoastPrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readSmallDarkRoastPrice();
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
			testcase.log(Status.PASS, " Correct ala carte price of Small Dark Roast Coffee Price");
			System.out.println(
					"***********Scenario010 PASS: Correct ala carte price of Small Dark Roast Coffee Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Small Dark Roast Coffee Price");
			System.out.println(
					"***********Scenario010 FAIL: Incorrect ala carte price of Small Dark Roast Coffee Price ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 11)
	public void siKuliTestCase011(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_011:Verify MediumDarkRoast Price");
		BeverageItems b = new BeverageItems(s);

		Thread.sleep(2000);

		s.wait(DarkRoast, 300);
		s.click(DarkRoast.similar((float) 0.5));
		s.wait(MediumDarkRoast, 300);
		s.click(MediumDarkRoast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on MediumDarkRoast");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on EatIn");
		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "MDDarkRoastPrice");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readMediumDarkRoastPrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readMediumDarkRoastPrice();
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
			testcase.log(Status.PASS, " Correct ala carte price of Medium Dark Roast Coffee Price");
			System.out.println(
					"***********Scenario011 PASS: Correct ala carte price of Medium Dark Roast Coffee Price ***********");
		} else {
			testcase.log(Status.FAIL, " InCorrect ala carte price of Medium Dark Roast Coffee Price");
			System.out.println(
					"***********Scenario011 FAIL: Incorrect ala carte price of Medium Dark Roast Coffee Price ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 12)
	public void siKuliTestCase012(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_012:Verify LargeDarkRoast Price");
		BeverageItems b = new BeverageItems(s);

		Thread.sleep(2000);

		s.wait(DarkRoast, 300);
		s.click(DarkRoast.similar((float) 0.5));
		s.wait(LargeDarkRoast, 300);
		s.click(LargeDarkRoast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on LargeDarkRoast");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on EatIn");
		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "LGDarkRoastPrice");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readLargeDarkRoastPrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readLargeDarkRoastPrice();
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
			testcase.log(Status.PASS, " Correct ala carte price of Large Dark Roast Coffee Price");
			System.out.println(
					"***********Scenario12 PASS: Correct ala carte price of Large Dark Roast Coffee Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Dark Roast Coffee Price");
			System.out.println(
					"***********Scenario12 FAIL: Incorrect ala carte price of Large Dark Roast Coffee Price ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 13)
	public void siKuliTestCase013(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_013:Verify SmallRefillDarkRoast Price");
		BeverageItems b = new BeverageItems(s);

		Thread.sleep(2000);

		s.wait(DarkRoast, 300);
		s.click(DarkRoast.similar((float) 0.5));
		s.wait(SmallRefillDarkRoast, 300);
		s.click(SmallRefillDarkRoast.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on SmallRefillDarkRoast");
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on EatIn");
		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "RFSMDarkRoastPrice");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readSmallRefillDarkRoastPrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readSmallRefillDarkRoastPrice();
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
			testcase.log(Status.PASS, " Correct ala carte price of Small Refill Dark Roast Coffee Price");
			System.out.println(
					"***********Scenario13 PASS: Correct ala carte price of Small Refill Dark Roast Coffee Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Small Refill Dark Roast Coffee Price");
			System.out.println(
					"***********Scenario13 FAIL: Incorrect ala carte price of Small Refill Dark Roast Coffee Price ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 14)
	public void siKuliTestCase014(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_014:Verify SmallSpecialtyTea Price");
		BeverageItems b = new BeverageItems(s);

		Thread.sleep(2000);
		s.wait(SpecialtyTea, 300);
		s.click(SpecialtyTea.similar((float) 0.5));

		s.wait(SmallSpecialtyTea, 300);
		s.click(SmallSpecialtyTea.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on SmallSpecialtyTea");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on EatIn");
		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "SMSpecialityPrice");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readSmallSpecialityTeaPrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readSmallSpecialityTeaPrice();
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
			testcase.log(Status.PASS, " Correct ala carte price of SM Speciality Tea Price");
			System.out.println(
					"***********Scenario06 PASS: Correct ala carte price of SM Speciality Tea Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of SM Speciality Tea Price");
			System.out.println(
					"***********Scenario06 FAIL: Incorrect ala carte price of SM Speciality Tea Price ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 15)
	public void siKuliTestCase015(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_015:Verify MediumSpecialtyTea Price");
		BeverageItems b = new BeverageItems(s);

		Thread.sleep(2000);
		s.wait(SpecialtyTea, 300);
		s.click(SpecialtyTea.similar((float) 0.5));

		s.wait(MediumSpecialtyTea, 300);
		s.click(MediumSpecialtyTea.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on MediumSpecialtyTea");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on EatIn");
		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "MDSpecialityPrice");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readMediumSpecialityTeaPrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readMediumSpecialityTeaPrice();
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
			testcase.log(Status.PASS, " Correct ala carte price of MD Speciality Tea Price");
			System.out.println(
					"***********Scenario015 PASS: Correct ala carte price of MD Speciality Tea Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of MD Speciality Tea Price");
			System.out.println(
					"***********Scenario015 FAIL: Incorrect ala carte price of MD Speciality Tea Price ***********");

		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 16)
	public void sikuliTestCase016(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_016:Verify SteepedTeaSmall Price");
		BeverageItems b = new BeverageItems(s);

		Thread.sleep(2000);
		s.wait(SteepedTea, 300);
		s.click(SteepedTea.similar((float) 0.5));

		s.wait(SteepedTeaSmall, 300);
		s.click(SteepedTeaSmall.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on SteepedTeaSmall");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on EatIn");
		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "SMSteepedTeaPrice");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readSteepedTeaSmallPrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readSteepedTeaSmallPrice();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of SM Steeped Tea Price");
			System.out.println(
					"***********Scenario016 PASS: Correct ala carte price of SM Steeped Tea Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of SM Steeped Tea Price");
			System.out.println(
					"***********Scenario016 FAIL: Incorrect ala carte price of SM Steeped Tea Price ***********");
		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 17)
	public void sikuliTestCase017(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_017:Verify SteepedTeaMedium Price");
		BeverageItems b = new BeverageItems(s);

		Thread.sleep(2000);
		s.wait(SteepedTea, 300);
		s.click(SteepedTea.similar((float) 0.5));

		s.wait(SteepedTeaMedium, 300);
		s.click(SteepedTeaMedium.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on SteepedTeaMedium");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on EatIn");
		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "MDSteepedTeaPrice");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readSteepedTeaMediumPrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readSteepedTeaMediumPrice();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of MD Steeped Tea Price");
			System.out.println(
					"***********Scenario017 PASS: Correct ala carte price of MD Steeped Tea Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of MD Steeped Tea Price");
			System.out.println(
					"***********Scenario017 FAIL: Incorrect ala carte price of MD Steeped Tea Price ***********");
		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 18)
	public void sikuliTestCase018(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_018:Verify SteepedTeaLarge Price");
		BeverageItems b = new BeverageItems(s);

		Thread.sleep(2000);
		s.wait(SteepedTea, 300);
		s.click(SteepedTea.similar((float) 0.5));

		s.wait(SteepedTeaLarge, 300);
		s.click(SteepedTeaLarge.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on SteepedTeaLarge");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on EatIn");
		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "LGSteepedTeaPrice");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readSteepedTeaLargePrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readSteepedTeaLargePrice();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of LG Steeped Tea Price");
			System.out.println(
					"***********Scenario018 PASS: Correct ala carte price of LG Steeped Tea Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of LG Steeped Tea Price");
			System.out.println(
					"***********Scenario018 FAIL: Incorrect ala carte price of LG Steeped Tea Price ***********");
		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	/*
	 * @Test(priority = 11) public void sikuliTestCase00011()throws FindFailed,
	 * IOException, TesseractException, InterruptedException {
	 * testcase=extent.createTest("TC_0011:Verify TEA STEEPED ORANGE XL Price");
	 * 
	 * RegressionTest14feb b = new RegressionTest14feb();
	 * 
	 * Thread.sleep(2000); s.wait(SteepedTea, 300);
	 * s.click(SteepedTea.similar((float)0.5)); (Status.PASS,
	 * "User able to Click the SteepedTea Button"); s.wait(SteepedTeaExtraLarge,
	 * 300); s.click(SteepedTeaExtraLarge.similar((float)0.5)); (Status.PASS,
	 * "User able to Click the LargeSteepedTea Button"); s.wait(EatIn, 300);
	 * s.click(EatIn.similar((float)0.8)); (Status.PASS,
	 * "User able to Click the Eatin Button"); File Source = new
	 * File("SteepedTeaExtraLargePrice.png"); String Path =
	 * System.getProperty("user.dir")+"/Images/SteepedTeaExtraLargePrice.png";
	 * FileHandler.copy(Source, new File(Path)); ITesseract image = new Tesseract();
	 * image.setDatapath(".\\tessdata"); String imageText=image.doOCR(new
	 * File(Path)); System.out.println(imageText);
	 * System.out.println(b.readSteepedTeaExtraLargePrice()); String a1=null; String
	 * a2=null;
	 * 
	 * String replaceAll = imageText.replaceAll("\\s",""); a1 = replaceAll; a2 =
	 * b.readSteepedTeaExtraLargePrice(); System.out.println(a1);
	 * System.out.println(a2);
	 * 
	 * if(a1.equals(a2)){
	 * (Status.PASS," Correct ala carte price of XL Steeped Tea Price" );
	 * System.out.
	 * println("***********Scenario011 PASS: Correct ala carte price of XL Steeped Tea Price ***********"
	 * ); } else { (Status.FAIL,
	 * "Incorrect ala carte price of XL Steeped Tea Price"); System.out.
	 * println("***********Scenario011 FAIL: Incorrect ala carte price of XL Steeped Tea Price ***********"
	 * ); } s.wait(VoidItem, 300); s.click(VoidItem.similar((float)0.5)); }
	 */

	@Test(priority = 19)
	public void sikuliTestCase019(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_019:Verify SteepedTeaSmallRefill Price");
		BeverageItems b = new BeverageItems(s);

		Thread.sleep(2000);
		s.wait(SteepedTea, 300);
		s.click(SteepedTea.similar((float) 0.5));

		s.wait(SteepedTeaSmallRefill, 300);
		s.click(SteepedTeaSmallRefill.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on SteepedTeaSmallRefill");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on EatIn");
		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "RFSMSteepedTeaPrice");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readSteepedTeaSmallRefillPrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readSteepedTeaSmallRefillPrice();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of RF-SM Steeped Tea Price");
			System.out.println(
					"***********Scenario019 PASS: Correct ala carte price of RF-SM Steeped Tea Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of RF-SM Steeped Tea Price");
			System.out.println(
					"***********Scenario019 FAIL: Incorrect ala carte price of RF-SM Steeped Tea Price ***********");
		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 20)
	public void sikuliTestCase020(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_020:Verify SteepedTeaMediumRefill Price");
		BeverageItems b = new BeverageItems(s);

		Thread.sleep(2000);
		s.wait(SteepedTea, 300);
		s.click(SteepedTea.similar((float) 0.5));

		s.wait(SteepedTeaMediumRefill, 300);
		s.click(SteepedTeaMediumRefill.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on SteepedTeaMediumRefill");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on EatIn");
		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "RFSMSteepedTeaPrice");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readSteepedTeaMediumRefillPrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readSteepedTeaMediumRefillPrice();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of RF-MD Steeped Tea Price");
			System.out.println(
					"***********Scenario020 PASS: Correct ala carte price of RF-MD Steeped Tea Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of RF-MD Steeped Tea Price");
			System.out.println(
					"***********Scenario020 FAIL: Incorrect ala carte price of RF-MD Steeped Tea Price ***********");
		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	/*
	 * @Test(priority = 21) public void sikuliTestCase021()throws FindFailed,
	 * IOException, TesseractException, InterruptedException {
	 * 
	 * testcase=extent.createTest("TC_021:Verify SteepedTeaLargeRefill Price");
	 * Runner b = new Runner();
	 * 
	 * Thread.sleep(2000); s.wait(SteepedTea, 300);
	 * s.click(SteepedTea.similar((float)0.5));
	 * 
	 * s.wait(SteepedTeaLargeRefill, 300);
	 * s.click(SteepedTeaLargeRefill.similar((float)0.5));
	 * 
	 * s.wait(EatIn, 300); s.click(EatIn.similar((float)0.8));
	 * 
	 * Thread.sleep(4000); Rectangle rectangle=new Rectangle();
	 * rectangle.setBounds(420,200,60,30); String imagePath =
	 * capture(rectangle).save(System.getProperty("user.dir")+"/Image/",
	 * "RFLGSteepedTeaPrice"); ITesseract image = new Tesseract();
	 * image.setDatapath(".\\tessdata"); String imageText=image.doOCR(new
	 * File(imagePath)); System.out.println(imageText);
	 * System.out.println(b.readSteepedTeaLargeRefillPrice()); String a1=null;
	 * String a2=null;
	 * 
	 * String replaceAll = imageText.replaceAll("\\s",""); a1 = replaceAll; a2 =
	 * b.readSteepedTeaLargeRefillPrice(); System.out.println(a1);
	 * System.out.println(a2);
	 * 
	 * if(a1.equals(a2)){
	 * 
	 * System.out.
	 * println("***********Scenario021 PASS: Correct ala carte price of RF-LG Steeped Tea Price ***********"
	 * ); } else {
	 * 
	 * System.out.
	 * println("***********Scenario021 FAIL: Incorrect ala carte price of RF-LG Steeped Tea Price ***********"
	 * ); } s.wait(VoidItem, 300); s.click(VoidItem.similar((float)0.5)); }
	 * /*@Test(priority = 15) public void sikuliTestCase00015()throws FindFailed,
	 * IOException, TesseractException, InterruptedException {
	 * testcase=extent.createTest("TC_0015:Verify TEA STEEPED ORANGE RF-XL Price");
	 * 
	 * RegressionTest14feb b = new RegressionTest14feb();
	 * 
	 * Thread.sleep(2000); s.wait(SteepedTea, 300);
	 * s.click(SteepedTea.similar((float)0.5)); (Status.PASS,
	 * "User able to Click the SteepedTea Button");
	 * s.wait(SteepedTeaExtraLargeRefill, 300);
	 * s.click(SteepedTeaExtraLargeRefill.similar((float)0.5)); (Status.PASS,
	 * "User able to Click the SteepedTeaExtraLargeRefill Button"); s.wait(EatIn,
	 * 300); s.click(EatIn.similar((float)0.8)); (Status.PASS,
	 * "User able to Click the Eatin Button"); File Source = new
	 * File("SteepedTeaExtraLargeRefillPrice.png"); String Path =
	 * System.getProperty("user.dir")+"/Images/SteepedTeaExtraLargeRefillPrice.png";
	 * FileHandler.copy(Source, new File(Path)); ITesseract image = new Tesseract();
	 * image.setDatapath(".\\tessdata"); String imageText=image.doOCR(new
	 * File(Path)); System.out.println(imageText);
	 * System.out.println(b.readSteepedTeaExtraLargeRefillPrice()); String a1=null;
	 * String a2=null;
	 * 
	 * String replaceAll = imageText.replaceAll("\\s",""); a1 = replaceAll; a2 =
	 * b.readSteepedTeaExtraLargeRefillPrice(); System.out.println(a1);
	 * System.out.println(a2);
	 * 
	 * if(a1.equals(a2)){
	 * (Status.PASS," Correct ala carte price of RF-MD Steeped Tea Price" );
	 * System.out.
	 * println("***********Scenario015 PASS: Correct ala carte price of RF-XL Steeped Tea Price ***********"
	 * ); } else { (Status.FAIL,
	 * "Incorrect ala carte price of RF-MD Steeped Tea Price"); System.out.
	 * println("***********Scenario015 FAIL: Incorrect ala carte price of RF-XL Steeped Tea Price ***********"
	 * ); } s.wait(VoidItem, 300); s.click(VoidItem.similar((float)0.5)); }
	 */

	@Test(priority = 21)
	public void sikuliTestCase021(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_021:Verify SmallLatte Price");
		BeverageItems b = new BeverageItems(s);

		Thread.sleep(2000);
		s.wait(Latte, 300);
		s.click(Latte.similar((float) 0.5));

		s.wait(SmallLatte, 300);
		s.click(SmallLatte.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on SmallLatte");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on EatIn");
		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "SMLattePrice");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readSmallLattePrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readSmallLattePrice();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of SmallLatte Price");
			System.out.println("***********Scenario021 PASS: Correct ala carte price of SmallLatte Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of SmallLatte Price");
			System.out
					.println("***********Scenario021 FAIL: Incorrect ala carte price of SmallLatte Price ***********");
		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	/*
	 * @Test(priority = 17) public void sikuliTestCase00017()throws FindFailed,
	 * IOException, TesseractException, InterruptedException {
	 * testcase=extent.createTest("TC_0017:Verify LATTE - NM17 MD Price");
	 * 
	 * RegressionTest14feb b = new RegressionTest14feb();
	 * 
	 * Thread.sleep(2000); s.wait(Latte, 300); s.click(Latte.similar((float)0.5));
	 * 
	 * s.wait(MediumLatte, 300); s.click(MediumLatte.similar((float)0.5));
	 * (Status.PASS, "User able to Click the MediumLatte Button"); s.wait(EatIn,
	 * 300); s.click(EatIn.similar((float)0.8)); (Status.PASS,
	 * "User able to Click the Eatin Button"); File Source = new
	 * File("MediumLattePrice.png"); String Path =
	 * System.getProperty("user.dir")+"/Images/MediumLattePrice.png";
	 * FileHandler.copy(Source, new File(Path)); ITesseract image = new Tesseract();
	 * image.setDatapath(".\\tessdata"); String imageText=image.doOCR(new
	 * File(Path)); System.out.println(imageText);
	 * System.out.println(b.readMediumLattePrice()); String a1=null; String a2=null;
	 * 
	 * String replaceAll = imageText.replaceAll("\\s",""); a1 = replaceAll; a2 =
	 * b.readMediumLattePrice(); System.out.println(a1); System.out.println(a2);
	 * 
	 * if(a1.equals(a2)){
	 * (Status.PASS," Correct ala carte price of MediumLatte Price" ); System.out.
	 * println("***********Scenario017 PASS: Correct ala carte price of MediumLatte Price ***********"
	 * ); } else { (Status.FAIL, "Incorrect ala carte price of MediumLatte  Price");
	 * System.out.
	 * println("***********Scenario017 FAIL: Incorrect ala carte price of MediumLatte Price ***********"
	 * ); } s.wait(VoidItem, 300); s.click(VoidItem.similar((float)0.5)); }
	 */
	@Test(priority = 22)
	public void sikuliTestCase022(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_022:Verify LargeLatte Price");
		BeverageItems b = new BeverageItems(s);

		Thread.sleep(2000);
		s.wait(Latte, 300);
		s.click(Latte.similar((float) 0.5));

		s.wait(LargeLatte, 300);
		s.click(LargeLatte.similar((float) 0.5));
		testcase.log(Status.PASS, "User able to click on LargeLatte");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on EatIn");
		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "LGLattePrice");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
		System.out.println(b.readLargeLattePrice());
		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = b.readLargeLattePrice();
		System.out.println(a1);
		System.out.println(a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of LargeLatte Price");
			System.out.println("***********Scenario022 PASS: Correct ala carte price of LargeLatte Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of LargeLatte Price");
			System.out
					.println("***********Scenario022 FAIL: Incorrect ala carte price of LargeLatte Price ***********");
		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 23)
	public void sikuliTestCase023(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_023:Verify Small iced Cappuccino Price");
		BeverageItems b = new BeverageItems(s);
		Thread.sleep(7000);

		s.wait(Beverages1, 300);
		s.click(Beverages1);
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(IcedCappuccino, 300);
		s.click(IcedCappuccino);
		s.wait(SmallIcedCappuccino, 300);
		s.click(SmallIcedCappuccino);
		testcase.log(Status.PASS, "User able to click on Small Iced Cappuccino");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallIcedCappuccinoPrice");
//	 ScreenImage full = s.capture();
//	  String fullimage=full.save(System.getProperty("user.dir")+"/Image/", "fullpic");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallIcedCappuccinoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.readSmallIcedCappuccinoPrice());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");
		// replaceAll=imageText.replaceAll("[$,]","");
		a1 = replaceAll;
		a2 = String.valueOf(b.readSmallIcedCappuccinoPrice());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of SmallIcedCappuccino Price");
			System.out.println(
					"***********Scenario023 PASS: Correct ala carte price of SmallIcedCappuccino Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Small Iced Cappuccino . " + "Expected Price: "
					+ b.readSmallIcedCappuccinoPrice());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario023 FAIL: Incorrect ala carte price of SmallIcedCappuccino Price ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 24)
	public void sikuliTestCase024(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_024: Verify Medium Iced Cappuccino Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		s.wait(Beverages1, 300);
		s.click(Beverages1);
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(IcedCappuccino, 300);
		s.click(IcedCappuccino);
		s.wait(MediumIcedCappuccino, 300);
		s.click(MediumIcedCappuccino);
		testcase.log(Status.PASS, "User able to click on Medium Iced Cappuccino");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumIcedCappuccinoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumIcedCappuccinoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.readMediumIcedCappuccinoPrice());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.readMediumIcedCappuccinoPrice());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Medium Iced Cappuccino ");
			System.out.println(
					"***********Scenario024 PASS: Correct ala carte price of Medium Iced Cappuccino Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium Iced Cappuccino. " + "Expected Price: "
					+ b.readMediumIcedCappuccinoPrice());
			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario024 FAIL: Incorrect ala carte price of Medium Iced Cappuccino Price ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 25)
	public void sikuliTestCase025(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_025: Verify Large Iced Cappuccino Price." + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(IcedCappuccino, 300);
		s.click(IcedCappuccino);
		s.wait(LargeIcedCappuccino, 300);
		s.click(LargeIcedCappuccino);
		testcase.log(Status.PASS, "User able to click on Large Iced Cappuccino");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeIcedCappuccinoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeIcedCappuccinoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.readLargeIcedCappuccinoPrice());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.readLargeIcedCappuccinoPrice());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Large Iced Cappuccino ");
			System.out.println(
					"***********Scenario025 PASS: Correct ala carte price of LargeIcedCappuccino Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Iced Cappuccino. " + "Expected Price: "
					+ b.readLargeIcedCappuccinoPrice());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario025 FAIL: Incorrect ala carte price of Large Iced Cappuccino Price ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 26)
	public void sikuliTestCase026(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_026:Verify SmallRefilIcedCappuccino Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		s.wait(Beverages1, 300);
		s.click(Beverages1);
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(IcedCappuccino, 300);
		s.click(IcedCappuccino);
		s.wait(SmallRefilIcedCappuccino, 300);
		s.click(SmallRefilIcedCappuccino);
		testcase.log(Status.PASS, "User able to click on SmallRefilIcedCappuccino");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on EatIn");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallRefilIcedCappuccinoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallRefilIcedCappuccinoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.readSmallRefilIcedCappuccinoPrice());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.readSmallRefilIcedCappuccinoPrice());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of SmallRefilIcedCappuccino Price");
			System.out.println(
					"***********Scenario026 PASS: Correct ala carte price of SmallRefilIcedCappuccino Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of SmallRefilIcedCappuccino Price");
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario026 FAIL: Incorrect ala carte price of SmallRefilIcedCappuccino Price ***********");
		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 27)
	public void sikuliTestCase027(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_027: Verify Medium Refill Iced Cappuccino Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(IcedCappuccino, 300);
		s.click(IcedCappuccino);
		s.wait(MediumRefilIcedCappuccino, 300);
		s.click(MediumRefilIcedCappuccino);
		testcase.log(Status.PASS, "User able to click on Medium Refill Iced Cappuccino");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(415, 205, 65, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumRefilIcedCappuccinoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumRefilIcedCappuccinoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.readMediumRefilIcedCappuccinoPrice());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.readMediumRefilIcedCappuccinoPrice());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Medium Refill Iced Cappuccino ");
			System.out.println(
					"***********Scenario027 PASS: Correct ala carte price of MediumRefilIcedCappuccino Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium Refill Iced Cappuccino. "
					+ "Expected Price: " + b.readMediumRefilIcedCappuccinoPrice());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario027 FAIL: Incorrect ala carte price of MediumRefilIcedCappuccino Price ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 28)
	public void sikuliTestCase028(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_028: Verify Large Refill Iced Cappuccino Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(IcedCappuccino, 300);
		s.click(IcedCappuccino);
		s.wait(LargeRefilIcedCappuccino, 300);
		s.click(LargeRefilIcedCappuccino);
		testcase.log(Status.PASS, "User able to click on Large Refill Iced Cappuccino");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeRefilIcedCappuccinoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeRefilIcedCappuccinoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.readLargeRefilIcedCappuccinoPrice());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.readLargeRefilIcedCappuccinoPrice());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Large Refill Iced Cappuccino ");
			System.out.println(
					"***********Scenario028 PASS: Correct ala carte price of LargeRefilIcedCappuccino Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Refill Iced Cappuccino. "
					+ "Expected Price: " + b.readLargeRefilIcedCappuccinoPrice());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario028 FAIL: Incorrect ala carte price of LargeRefilIcedCappuccino Price ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 29)
	public void sikuliTestCase029(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_029:Verify SmallIcedCappuccinoLight Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(IcedCappuccinoLight, 300);
		s.click(IcedCappuccinoLight);
		s.wait(SmallIcedCappuccinoLight, 300);
		s.click(SmallIcedCappuccinoLight);
		testcase.log(Status.PASS, "User able to click on SmallIcedCappuccinoLight");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on EatIn");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallIcedCappuccinoLightPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallIcedCappuccinoLightPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.readSmallIcedCappuccinoLightPrice());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.readSmallIcedCappuccinoLightPrice());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of SmallIcedCappuccinoLight Price");
			System.out.println(
					"***********Scenario029 PASS: Correct ala carte price of SmallIcedCappuccinoLight Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of SmallIcedCappuccinoLight Price");
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario029 FAIL: Incorrect ala carte price of SmallIcedCappuccinoLight Price ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 30)
	public void sikuliTestCase030(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_030: Verify Medium Iced Cappuccino Light Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(IcedCappuccinoLight, 300);
		s.click(IcedCappuccinoLight);
		s.wait(MediumIcedCappuccinoLight, 300);
		s.click(MediumIcedCappuccinoLight);
		testcase.log(Status.PASS, "User able to click on Medium Iced Cappuccino Light");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumIcedCappuccinoLightPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumIcedCappuccinoLightPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.readMediumIcedCappuccinoLightPrice());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.readMediumIcedCappuccinoLightPrice());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Medium Iced Cappuccino Light ");
			System.out.println(
					"***********Scenario031 PASS: Correct ala carte price ofMediumIcedCappuccinoLight Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium Iced Cappuccino Light. "
					+ "Expected Price: " + b.readMediumIcedCappuccinoLightPrice());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario031 FAIL: Incorrect ala carte price ofMediumIcedCappuccinoLight Price ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 31)
	public void sikuliTestCase031(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent.createTest("TC_031: Verify Large Iced Cappuccino Light Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(IcedCappuccinoLight, 300);
		s.click(IcedCappuccinoLight);
		s.wait(LargeIcedCappuccinoLight, 300);
		s.click(LargeIcedCappuccinoLight);
		testcase.log(Status.PASS, "User able to click on Large Iced Cappuccino Light");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeIcedCappuccinoLightPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeIcedCappuccinoLightPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel ");

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.readLargeIcedCappuccinoLight());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Large Iced Cappuccino Light ");
			System.out.println(
					"***********Scenario032 PASS: Correct ala carte price ofLargeIcedCappuccinoLight Price ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Iced Cappuccino Light. " + "Expected Price: "
					+ b.readLargeIcedCappuccinoLight());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario032 FAIL: Incorrect ala carte price ofLargeIcedCappuccinoLight Price ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 32)
	public void sikuliTestCase032(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent
				.createTest("TC_032: Verify Small Refill Iced Cappuccino Light Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(IcedCappuccinoLight, 300);
		s.click(IcedCappuccinoLight);
		s.wait(SmallRefilIcedCappuccinoLight, 300);
		s.click(SmallRefilIcedCappuccinoLight);
		testcase.log(Status.PASS, "User able to click on Small Refill Iced Cappuccino Light");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallRefilIcedCappuccinoLightPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallRefilIcedCappuccinoLightPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.readSmallRefilIcedCappuccinoLightPrice());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.readSmallRefilIcedCappuccinoLightPrice());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Small Refil Iced Cappuccino Light ");
			System.out.println(
					"***********Scenario033 PASS: Correct ala carte price ofSmallRefilIcedCappuccinoLightPrice ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of SmallRefilIcedCappuccinoLightPrice");
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario033 FAIL: Incorrect ala carte price ofSmallRefilIcedCappuccinoLightPrice ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 33)
	public void sikuliTestCase033(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent
				.createTest("TC_033: Verify Medium Refill Iced Cappuccino Light Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);

		s.wait(IcedCappuccinoLight, 300);
		s.click(IcedCappuccinoLight);
		s.wait(MediumRefilIcedCappuccinoLight, 300);
		s.click(MediumRefilIcedCappuccinoLight);
		testcase.log(Status.PASS, "User able to click on Medium Refill Iced Cappuccino Light");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(410, 205, 70, 50);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumRefilIcedCappuccinoLightPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumRefilIcedCappuccinoLightPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.readMediumRefilIcedCappuccinoLightPrice());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.readMediumRefilIcedCappuccinoLightPrice());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Medium Refill Iced Cappuccino Light ");
			System.out.println(
					"***********Scenario034 PASS: Correct ala carte price ofMediumRefilIcedCappuccinoLightPrice ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium Refill Iced Cappuccino Light. "
					+ "Expected price: " + b.readMediumRefilIcedCappuccinoLightPrice());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario034 FAIL: Incorrect ala carte price ofMediumRefilIcedCappuccinoLightPrice ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 34)
	public void sikuliTestCase034(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		testcase = extent
				.createTest("TC_034: Verify Large Refill Iced Cappuccino Light Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(IcedCappuccinoLight, 300);
		s.click(IcedCappuccinoLight);
		s.wait(LargeRefilIcedCappuccinoLight, 300);
		s.click(LargeRefilIcedCappuccinoLight);
		testcase.log(Status.PASS, "User able to click on Large Refill Iced Cappuccino Light");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeRefilIcedCappuccinoLightPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeRefilIcedCappuccinoLightPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.readLargeRefilIcedCappuccinoLight());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.readLargeRefilIcedCappuccinoLight());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Large Refill Iced Cappuccino Light");
			System.out.println(
					"***********Scenario035 PASS: Correct ala carte price ofLargeRefilIcedCappuccinoLightPrice ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Refill Iced Cappuccino Light. "
					+ "Expected Price: " + b.readLargeRefilIcedCappuccinoLight());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario035 FAIL: Incorrect ala carte price ofLargeRefilIcedCappuccinoLightPrice ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 35)
	public void sikuliTestCase035(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BeverageItems b = new BeverageItems(s);
		testcase = extent
				.createTest("TC_035:Verify Small Mocha Iced Cappuccino Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//		s.click(Beverages1);
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		s.wait(MochaIcedCappuccino, 300);
		s.click(MochaIcedCappuccino);
		s.wait(SmallMochaIcedCappuccino, 300);
		s.click(SmallMochaIcedCappuccino);
		testcase.log(Status.PASS, "User able to click on Small Mocha Iced Cappuccino");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallMochaIcedCappuccinoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallMochaIcedCappuccinoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.readSmallMochaIcedCappuccino());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.readSmallMochaIcedCappuccino());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Small Mocha Iced Cappuccino Price");
			System.out.println(
					"***********Scenario035 PASS: Correct ala carte price of Small Mocha Iced Cappuccino ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Small Mocha Iced Cappuccino Price. "
					+ "Expected Price: " + readSmallMochaIcedCappuccino());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario035 FAIL: Incorrect ala carte price of Small Mocha Iced Cappuccino ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 36)
	public void sikuliTestCase036(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BeverageItems b = new BeverageItems(s);
		testcase = extent
				.createTest("TC_036:Verify Medium Mocha Iced Cappuccino Price. " + "Region Id:" + b.read_Region_Id());

		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		s.wait(MochaIcedCappuccino, 300);
		s.click(MochaIcedCappuccino);
		s.wait(MediumMochaIcedCappuccino, 300);
		s.click(MediumMochaIcedCappuccino);
		testcase.log(Status.PASS, "User able to click on Medium Mocha Iced Cappuccino");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(425, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumMochaIcedCappuccinoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumMochaIcedCappuccinoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.readMediumMochaIcedCappuccino());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.readMediumMochaIcedCappuccino());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Medium Mocha Iced Cappuccino Price");
			System.out.println(
					"***********Scenario036 PASS: Correct ala carte price of Medium Mocha Iced Cappuccino ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium Mocha Iced Cappuccino Price. "
					+ "Expected Price: " + readMediumMochaIcedCappuccino());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario036 FAIL: Incorrect ala carte price of Medium Mocha Iced Cappuccino ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 37)
	public void sikuliTestCase037(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BeverageItems b = new BeverageItems(s);
		testcase = extent
				.createTest("TC_037:Verify Large Mocha Iced Cappuccino Price. " + "Region Id:" + b.read_Region_Id());

		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		s.wait(MochaIcedCappuccino, 300);
		s.click(MochaIcedCappuccino);
		s.wait(LargeMochaIcedCappuccino, 300);
		s.click(LargeMochaIcedCappuccino);
		testcase.log(Status.PASS, "User able to click on Large Mocha Iced Cappuccino");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeMochaIcedCappuccinoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeMochaIcedCappuccinoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.readLargeMochaIcedCappuccino());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.readLargeMochaIcedCappuccino());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Large Mocha Iced Cappuccino Price");
			System.out.println(
					"***********Scenario037 PASS: Correct ala carte price of Large Mocha Iced Cappuccino ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Mocha Iced Cappuccino Price. "
					+ "Expected Price: " + readLargeMochaIcedCappuccino());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario037 FAIL: Incorrect ala carte price of Large Mocha Iced Cappuccino ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 38)
	public void sikuliTestCase038(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BeverageItems b = new BeverageItems(s);
		testcase = extent.createTest(
				"TC_038:Verify Small Refil Mocha Iced Cappuccino Price. " + "Region Id:" + b.read_Region_Id());

		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		s.wait(MochaIcedCappuccino, 300);
		s.click(MochaIcedCappuccino);
		s.wait(SmallRefilMochaIcedCappuccino, 300);
		s.click(SmallRefilMochaIcedCappuccino);
		testcase.log(Status.PASS, "User able to click on Small Refil Mocha Iced Cappuccino");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(425, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallRefilMochaIcedCappuccinoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallRefilMochaIcedCappuccinoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.readSmallRefilMochaIcedCappuccino());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.readSmallRefilMochaIcedCappuccino());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Small Refil Mocha Iced Cappuccino Price");
			System.out.println(
					"***********Scenario038 PASS: Correct ala carte price of Small Refil Mocha Iced Cappuccino ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Small Refil Mocha Iced Cappuccino Price. "
					+ "Expected Price: " + readSmallRefilMochaIcedCappuccino());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario038 FAIL: Incorrect ala carte price of Small Refil Mocha Iced Cappuccino ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 39)
	public void sikuliTestCase039(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BeverageItems b = new BeverageItems(s);
		testcase = extent.createTest(
				"TC_039:Verify Medium Refil Mocha Iced Cappuccino Price. " + "Region Id:" + b.read_Region_Id());

		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		s.wait(MochaIcedCappuccino, 300);
		s.click(MochaIcedCappuccino);
		s.wait(MediumRefilMochaIcedCappuccino, 300);
		s.click(MediumRefilMochaIcedCappuccino);
		testcase.log(Status.PASS, "User able to click on Medium Refil Mocha Iced Cappuccino");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(425, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumRefilMochaIcedCappuccinoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumRefilMochaIcedCappuccinoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.readMediumRefilMochaIcedCappuccino());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.readMediumRefilMochaIcedCappuccino());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Medium Refil Mocha Iced Cappuccino Price");
			System.out.println(
					"***********Scenario039 PASS: Correct ala carte price of Medium Refil Mocha Iced Cappuccino ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium Refil Mocha Iced Cappuccino Price. "
					+ "Expected Price: " + readMediumRefilMochaIcedCappuccino());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario039 FAIL: Incorrect ala carte price of Medium Refil Mocha Iced Cappuccino ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 40)
	public void sikuliTestCase040(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BeverageItems b = new BeverageItems(s);
		testcase = extent.createTest(
				"TC_040:Verify Large Refil Mocha Iced Cappuccino Price. " + "Region Id:" + b.read_Region_Id());

		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		s.wait(MochaIcedCappuccino, 300);
		s.click(MochaIcedCappuccino);
		s.wait(LargeRefilMochaIcedCappuccino, 300);
		s.click(LargeRefilMochaIcedCappuccino);
		testcase.log(Status.PASS, "User able to click on Large Refil Mocha Iced Cappuccino");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(425, 200, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeRefilMochaIcedCappuccinoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeRefilMochaIcedCappuccinoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.readLargeRefilMochaIcedCappuccino());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.readLargeRefilMochaIcedCappuccino());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Large Refil Mocha Iced Cappuccino Price");
			System.out.println(
					"***********Scenario040 PASS: Correct ala carte price of Large Refil Mocha Iced Cappuccino ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Refil Mocha Iced Cappuccino Price. "
					+ "Expected Price: " + readLargeRefilMochaIcedCappuccino());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario040 FAIL: Incorrect ala carte price of Large Refil Mocha Iced Cappuccino ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 41)
	public void sikuliTestCase041(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_041:Verify Small Americano Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		s.wait(Beverages1, 300);
		s.click(Beverages1);
		Thread.sleep(2000);
		s.wait(Americano, 300);
		s.click(Americano);
		s.wait(SmallAmericano, 300);
		s.click(SmallAmericano);
		testcase.log(Status.PASS, "User able to click on Small Americano");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "SmallAmericanoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallAmericanoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.SM_Americano_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.SM_Americano_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Small Americano ");
			System.out.println("***********Scenario035 PASS: Correct ala carte price of Small Americano ***********");
		} else {
			testcase.log(Status.FAIL,
					" Incorrect ala carte price of Small Americano. " + "Expected Price: " + SM_Americano_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario041 FAIL: Incorrect ala carte price of Small Americano ***********");
		}

		s.wait(VoidItem, 100);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 42)
	public void sikuliTestCase042(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_042:Verify Medium Americano Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);
		Thread.sleep(2000);
		s.wait(Americano, 300);
		s.click(Americano);
		s.wait(MediumAmericano, 300);
		s.click(MediumAmericano);
		testcase.log(Status.PASS, "User able to click on Medium Americano");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(410, 205, 70, 50);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "MediumAmericanoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumAmericanoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.MD_Americano_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.MD_Americano_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Medium Americano ");
			System.out.println("***********Scenario042 PASS: Correct ala carte price of Medium Americano ***********");
		} else {
			testcase.log(Status.FAIL,
					" Incorrect ala carte price of Medium Americano. " + "Expected Price: " + MD_Americano_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out
					.println("***********Scenario042 FAIL: Incorrect ala carte price of Medium Americano ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 43)
	public void sikuliTestCase043(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_043:Verify Large Americano Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		s.wait(Americano, 300);
		s.click(Americano);
		s.wait(LargeAmericano, 300);
		s.click(LargeAmericano);
		testcase.log(Status.PASS, "User able to click on Large Americano");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "LargeAmericanoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeAmericanoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.LG_Americano_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.LG_Americano_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Large Americano ");
			System.out.println("***********Scenario043 PASS: Correct ala carte price of Large Americano ***********");
		} else {
			testcase.log(Status.FAIL,
					" Incorrect ala carte price of Large Americano. " + "Expected Price: " + LG_Americano_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario043 FAIL: Incorrect ala carte price of Large Americano ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 44)
	public void sikuliTestCase044(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_044:Verify Refill Small Americano Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		s.wait(Americano, 300);
		s.click(Americano);
		s.wait(RefillSmallAmericano, 300);
		s.click(RefillSmallAmericano);
		testcase.log(Status.PASS, "User able to click on Refill Small Americano");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefillSmallAmericanoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefillSmallAmericanoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.RS_Americano_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.RS_Americano_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Refill Small Americano ");
			System.out.println(
					"***********Scenario043 PASS: Correct ala carte price of Refill Small Americano ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Refill Small Americano. " + "Expected Price: "
					+ RS_Americano_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario043 FAIL: Incorrect ala carte price of Refill Small Americano ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 45)
	public void sikuliTestCase045(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_045:Verify Refill Medium Americano Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		s.wait(Americano, 300);
		s.click(Americano);
		s.wait(RefillMediumAmericano, 300);
		s.click(RefillMediumAmericano);
		testcase.log(Status.PASS, "User able to click on Refill Medium Americano");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(410, 205, 70, 50);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefillMediumAmericanoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefillMediumAmericanoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.RM_Americano_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.RM_Americano_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Refill Medium Americano ");
			System.out.println(
					"***********Scenario043 PASS: Correct ala carte price of Refill Medium Americano ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Refill Medium Americano. " + "Expected Price: "
					+ RM_Americano_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario043 FAIL: Incorrect ala carte price of Refill Medium Americano ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 46)
	public void sikuliTestCase046(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_046:Verify Refill Large Americano Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		s.wait(Americano, 300);
		s.click(Americano);
		s.wait(RefillLargeAmericano, 300);
		s.click(RefillLargeAmericano);
		testcase.log(Status.PASS, "User able to click on Refill Large Americano");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefillLargeAmericanoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefillLargeAmericanoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.RL_Americano_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.RL_Americano_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Refill Large Americano ");
			System.out.println(
					"***********Scenario043 PASS: Correct ala carte price of Refill Large Americano ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Refill Large Americano. " + "Expected Price: "
					+ RL_Americano_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario043 FAIL: Incorrect ala carte price of Refill Large Americano ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 47)
	public void sikuliTestCase047(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BeverageItems b = new BeverageItems(s);
		testcase = extent
				.createTest("TC_047:Verify Medium Redeye Iced Cappuccino Price. " + "Region Id: " + b.read_Region_Id());

		s.wait(Beverages1, 300);
		s.click(Beverages1);
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		s.wait(RedeyeIcedCapp, 300);
		s.click(RedeyeIcedCapp);
		s.wait(MediumRedeyeIcedCapp, 300);
		s.click(MediumRedeyeIcedCapp);
		testcase.log(Status.PASS, "User able to click on Medium Redeye Iced Cappuccino");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumRedeyeIcedCappuccinoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumRedeyeIcedCappuccinoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.MD_Redeye_Iced_Capp_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.MD_Redeye_Iced_Capp_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Medium Redeye Iced Cappuccino ");
			System.out.println(
					"***********Scenario047 PASS: Correct ala carte price of Medium Redeye Iced Cappuccino ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium Redeye Iced Cappuccino. "
					+ "Expected Price: " + MD_Redeye_Iced_Capp_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario047 FAIL: Incorrect ala carte price of Medium Redeye Iced Cappuccino ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 48)
	public void sikuliTestCase048(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BeverageItems b = new BeverageItems(s);
		testcase = extent
				.createTest("TC_048:Verify Large Redeye Iced Cappuccino Price. " + "Region Id: " + b.read_Region_Id());

		// s.wait(Beverages1,300);
		// s.click(Beverages1);
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		s.wait(RedeyeIcedCapp, 300);
		s.click(RedeyeIcedCapp);
		s.wait(LargeRedeyeIcedCapp, 300);
		s.click(LargeRedeyeIcedCapp);
		testcase.log(Status.PASS, "User able to click on Large Redeye Iced Cappuccino");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeRedeyeIcedCappuccinoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeRedeyeIcedCappuccinoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.LG_Redeye_Iced_Capp_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.LG_Redeye_Iced_Capp_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Large Redeye Iced Cappuccino ");
			System.out.println(
					"***********Scenario048 PASS: Correct ala carte price of Large Redeye Iced Cappuccino ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Redeye Iced Cappuccino. "
					+ "Expected Price: " + LG_Redeye_Iced_Capp_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario048 FAIL: Incorrect ala carte price of Large Redeye Iced Cappuccino ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 49)
	public void sikuliTestCase049(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BeverageItems b = new BeverageItems(s);
		testcase = extent.createTest(
				"TC_049:Verify Refill Medium Redeye Iced Cappuccino Price. " + "Region Id: " + b.read_Region_Id());

		// s.wait(Beverages1,300);
		// s.click(Beverages1);
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		s.wait(RedeyeIcedCapp, 300);
		s.click(RedeyeIcedCapp);
		s.wait(MediumRefillRedeyeIcedCapp, 300);
		s.click(MediumRefillRedeyeIcedCapp);
		testcase.log(Status.PASS, "User able to click on Refill Medium Redeye Iced Cappuccino");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumRefillRedeyeIcedCappuccinoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumRefillRedeyeIcedCappuccinoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.RM_Redeye_Iced_Capp_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.RM_Redeye_Iced_Capp_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Refill Medium Redeye Iced Cappuccino ");
			System.out.println(
					"***********Scenario049 PASS: Correct ala carte price of Refill Medium Redeye Iced Cappuccino ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Refill Medium Redeye Iced Cappuccino. "
					+ "Expected Price: " + RM_Redeye_Iced_Capp_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario049 FAIL: Incorrect ala carte price of Refill Medium Redeye Iced Cappuccino ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 50)
	public void sikuliTestCase050(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BeverageItems b = new BeverageItems(s);
		testcase = extent.createTest(
				"TC_50:Verify Refill Large Redeye Iced Cappuccino Price. " + "Region Id: " + b.read_Region_Id());

		// s.wait(Beverages1,300);
		// s.click(Beverages1);
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		s.wait(RedeyeIcedCapp, 300);
		s.click(RedeyeIcedCapp);
		s.wait(LargeRefillRedeyeIcedCapp, 300);
		s.click(LargeRefillRedeyeIcedCapp);
		testcase.log(Status.PASS, "User able to click on Refill Large Redeye Iced Cappuccino");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefillLargeRedeyeIcedCappuccinoPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefillLargeRedeyeIcedCappuccinoPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.RL_Redeye_Iced_Capp_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.RL_Redeye_Iced_Capp_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Refill Large Redeye Iced Cappuccino ");
			System.out.println(
					"***********Scenario050 PASS: Correct ala carte price of Refill Large Redeye Iced Cappuccino ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Refill Large Redeye Iced Cappuccino. "
					+ "Expected Price: " + RL_Redeye_Iced_Capp_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario050 FAIL: Incorrect ala carte price of Refill Large Redeye Iced Cappuccino ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 51)
	public void sikuliTestCase051(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_51:Verify Small Tea Latte Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		s.wait(Beverages1, 300);
		s.click(Beverages1);
		s.wait(TeaLatteButton, 500);
		s.click(TeaLatteButton);
		s.wait(TeaLatteButton2, 500);
		s.click(TeaLatteButton2);
		s.wait(SMTeaLatte, 300);
		s.click(SMTeaLatte);
		testcase.log(Status.PASS, "User able to click on Small Tea Latte");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "SMTeaLattePrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SMTeaLattewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.SM_Tea_Latte_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.SM_Tea_Latte_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Small Tea Latte ");
			System.out.println("***********Scenario05 PASS: Correct ala carte price of Small Tea Latte ***********");
		} else {
			testcase.log(Status.FAIL,
					" Incorrect ala carte price of Small Tea Latte. " + "Expected Price: " + SM_Tea_Latte_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario051 FAIL: Incorrect ala carte price of Small Tea Latte ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 52)
	public void sikuliTestCase052(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_52:Verify Medium Tea Latte Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		// s.wait(Beverages1,300);
		// s.click(Beverages1);
		s.wait(TeaLatteButton, 500);
		s.click(TeaLatteButton);
		s.wait(TeaLatteButton2, 500);
		s.click(TeaLatteButton2);
		s.wait(MDTeaLatte, 300);
		s.click(MDTeaLatte);
		testcase.log(Status.PASS, "User able to click on Medium Tea Latte");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(410, 205, 70, 50);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "MDTeaLattePrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MDTeaLattewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.MD_Tea_Latte_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.MD_Tea_Latte_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Medium Tea Latte ");
			System.out.println("***********Scenario052 PASS: Correct ala carte price of Medium Tea Latte ***********");
		} else {
			testcase.log(Status.FAIL,
					" Incorrect ala carte price of Medium Tea Latte. " + "Expected Price: " + MD_Tea_Latte_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out
					.println("***********Scenario052 FAIL: Incorrect ala carte price of Medium Tea Latte ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 53)
	public void sikuliTestCase053(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_53:Verify Large Tea Latte Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		// s.wait(Beverages1,300);
		// s.click(Beverages1);
		s.wait(TeaLatteButton, 500);
		s.click(TeaLatteButton);
		s.wait(TeaLatteButton2, 500);
		s.click(TeaLatteButton2);
		s.wait(LGTeaLatte, 300);
		s.click(LGTeaLatte);
		testcase.log(Status.PASS, "User able to click on Large Tea Latte");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "LGTeaLattePrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LGTeaLattewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.LG_Tea_Latte_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.LG_Tea_Latte_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Large Tea Latte ");
			System.out.println("***********Scenario053 PASS: Correct ala carte price of Large Tea Latte ***********");
		} else {
			testcase.log(Status.FAIL,
					" Incorrect ala carte price of Large Tea Latte. " + "Expected Price: " + LG_Tea_Latte_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println("***********Scenario053 FAIL: Incorrect ala carte price of Large Tea Latte ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 54)
	public void sikuliTestCase054(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_54:Verify Reffil Small Tea Latte Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		// s.wait(Beverages1,300);
		// s.click(Beverages1);
		s.wait(TeaLatteButton, 500);
		s.click(TeaLatteButton);
		s.wait(TeaLatteButton2, 500);
		s.click(TeaLatteButton2);
		s.wait(RSTeaLatte, 300);
		s.click(RSTeaLatte);
		testcase.log(Status.PASS, "User able to click on Reffil Small Tea Latte");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(410, 205, 70, 50);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "RSTeaLattePrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RSTeaLattewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.RS_Tea_Latte_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.RS_Tea_Latte_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Reffil Small Tea Latte ");
			System.out.println(
					"***********Scenario054 PASS: Correct ala carte price of Reffil Small Tea Latte ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Reffil Small Tea Latte. " + "Expected Price: "
					+ RS_Tea_Latte_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			testcase.addScreenCaptureFromPath(imagePath);
			System.out.println(
					"***********Scenario054 FAIL: Incorrect ala carte price of Reffil Small Tea Latte ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 55)
	public void sikuliTestCase055(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_55:Verify Reffil Medium Tea Latte Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		// s.wait(Beverages1,300);
		// s.click(Beverages1);
		s.wait(TeaLatteButton, 500);
		s.click(TeaLatteButton);
		s.wait(TeaLatteButton2, 500);
		s.click(TeaLatteButton2);
		s.wait(RMTeaLatte, 300);
		s.click(RMTeaLatte);
		testcase.log(Status.PASS, "User able to click on Reffil Medium Tea Latte");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "RMTeaLattePrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RMTeaLattewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.RM_Tea_Latte_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.RM_Tea_Latte_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Reffil Medium Tea Latte ");
			System.out.println(
					"***********Scenario055 PASS: Correct ala carte price of Reffil Small Tea Latte ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Refill Medium Tea Latte. " + "Expected Price: "
					+ RM_Tea_Latte_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario055 FAIL: Incorrect ala carte price of Reffil Medium Tea Latte ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 56)
	public void sikuliTestCase056(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_56:Verify Reffil Large Tea Latte Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		// s.wait(Beverages1,300);
		// s.click(Beverages1);
		s.wait(TeaLatteButton, 500);
		s.click(TeaLatteButton);
		s.wait(TeaLatteButton2, 500);
		s.click(TeaLatteButton2);
		s.wait(RLTeaLatte, 300);
		s.click(RLTeaLatte);
		testcase.log(Status.PASS, "User able to click on Reffil Large Tea Latte");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "RLTeaLattePrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RLTeaLattewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.RL_Tea_Latte_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.RL_Tea_Latte_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Reffil Large Tea Latte ");
			System.out.println(
					"***********Scenario056 PASS: Correct ala carte price of Reffil Large Tea Latte ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Refill Large Tea Latte. " + "Expected Price: "
					+ RM_Tea_Latte_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario056 FAIL: Incorrect ala carte price of Reffil Large Tea Latte ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 57)
	public void sikuliTestCase057(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_57:Verify Small London Fog Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		// s.wait(Beverages1,3000);
		// s.click(Beverages1);
		s.wait(TeaLatteButton, 500);
		s.click(TeaLatteButton);
		s.wait(LondonFogButton, 500);
		s.click(LondonFogButton);
		s.wait(SMLondonFog, 300);
		s.click(SMLondonFog);
		testcase.log(Status.PASS, "User able to click on Small London Fog ");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "SMLondonFogPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SMLondonFogwithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.SM_London_Fog_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.SM_London_Fog_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Small London Fog ");
			System.out.println("***********Scenario057 PASS: Correct ala carte price of Small London Fog ***********");
		} else {
			testcase.log(Status.FAIL,
					" Incorrect ala carte price of Small London Fog. " + "Expected Price: " + SM_London_Fog_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out
					.println("***********Scenario057 FAIL: Incorrect ala carte price of Small London Fog ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 58)
	public void sikuliTestCase058(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_58:Verify Medium London Fog Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		// s.wait(Beverages1,3000);
		// s.click(Beverages1);
		s.wait(TeaLatteButton, 500);
		s.click(TeaLatteButton);
		s.wait(LondonFogButton, 500);
		s.click(LondonFogButton);
		s.wait(MDLondonFog, 300);
		s.click(MDLondonFog);
		testcase.log(Status.PASS, "User able to click on Medium London Fog ");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(410, 205, 70, 50);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "MDLondonFogPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MDLondonFogwithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.MD_London_Fog_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.MD_London_Fog_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Medium London Fog ");
			System.out.println("***********Scenario058 PASS: Correct ala carte price of Medium London Fog ***********");
		} else {
			testcase.log(Status.FAIL,
					" Incorrect ala carte price of Medium London Fog. " + "Expected Price: " + MD_London_Fog_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out
					.println("***********Scenario058 FAIL: Incorrect ala carte price of Medium London Fog ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 59)
	public void sikuliTestCase059(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_59:Verify Large London Fog Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		// s.wait(Beverages1,3000);
		// s.click(Beverages1);
		s.wait(TeaLatteButton, 500);
		s.click(TeaLatteButton);
		s.wait(LondonFogButton, 500);
		s.click(LondonFogButton);
		s.wait(LGLondonFog, 300);
		s.click(LGLondonFog);
		testcase.log(Status.PASS, "User able to click on Large London Fog ");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "LGLondonFogPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LGLondonFogwithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.LG_London_Fog_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.LG_London_Fog_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Large London Fog ");
			System.out.println("***********Scenario059 PASS: Correct ala carte price of Large London Fog ***********");
		} else {
			testcase.log(Status.FAIL,
					" Incorrect ala carte price of  Large London Fog. " + "Expected Price: " + LG_London_Fog_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out
					.println("***********Scenario059 FAIL: Incorrect ala carte price of Large London Fog ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 60)
	public void sikuliTestCase060(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_60:Verify Refill Small London Fog Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		// s.wait(Beverages1,3000);
		// s.click(Beverages1);
		s.wait(TeaLatteButton, 500);
		s.click(TeaLatteButton);
		s.wait(LondonFogButton, 500);
		s.click(LondonFogButton);
		s.wait(RSLondonFog, 300);
		s.click(RSLondonFog);
		testcase.log(Status.PASS, "User able to click on Refill Small London Fog ");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(410, 205, 70, 50);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "RSLondonFogPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RSLondonFogwithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.RS_London_Fog_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.RS_London_Fog_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Refilll Small London Fog ");
			System.out.println(
					"***********Scenario060PASS: Correct ala carte price of Refill Small London Fog ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Refilll Small London Fog. " + "Expected Price: "
					+ RS_London_Fog_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario060 FAIL: Incorrect ala carte price of Refill Small London Fog ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 61)
	public void sikuliTestCase061(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		testcase = extent.createTest("TC_61:Verify Refill Medium London Fog Price. " + "(Region Id: 7000054)");
		BeverageItems b = new BeverageItems(s);

		// s.wait(Beverages1,3000);
		// s.click(Beverages1);
		s.wait(TeaLatteButton, 500);
		s.click(TeaLatteButton);
		s.wait(LondonFogButton, 500);
		s.click(LondonFogButton);
		s.wait(RMLondonFog, 300);
		s.click(RMLondonFog);
		testcase.log(Status.PASS, "User able to click on Refill Medium London Fog ");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "RMLondonFogPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RMLondonFogwithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.RM_London_Fog_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.RM_London_Fog_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Refill Medium London Fog ");
			System.out.println(
					"***********Scenario061 PASS: Correct ala carte price of Refill Medium London Fog ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Refill Medium London Fog. " + "Expected Price: "
					+ RM_London_Fog_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario061 FAIL: Incorrect ala carte price of Refill Medium London Fog ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 62)
	public void sikuliTestCase062(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BeverageItems b = new BeverageItems(s);
		testcase = extent
				.createTest("TC_62:Verify Refill Large London Fog Price. " + "Region Id: " + b.read_Region_Id());

		// s.wait(Beverages1,3000);
		// s.click(Beverages1);
		s.wait(TeaLatteButton, 500);
		s.click(TeaLatteButton);
		s.wait(LondonFogButton, 500);
		s.click(LondonFogButton);
		s.wait(RLLondonFog, 300);
		s.click(RLLondonFog);
		testcase.log(Status.PASS, "User able to click on Refill Large London Fog ");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/", "RLLondonFogPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RLLondonFogwithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.RL_London_Fog_price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.RL_London_Fog_price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Refill Large London Fog ");
			System.out.println(
					"***********Scenario062 PASS: Correct ala carte price of Refill Large London Fog ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Refill Large London Fog. " + "Expected Price: "
					+ RL_London_Fog_price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario062 FAIL: Incorrect ala carte price of Refill Large London Fog ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 63)

	public void sikuliTestCase063(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_63:Verify Small Pumpkin Spice Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

		s.wait(Beverages1, 300);

		s.click(Beverages1);

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(FlavouredIcedCappuccino, 300);

		s.click(FlavouredIcedCappuccino);

		s.wait(Pumpkin_Spice_Iced_Capp, 300);

		s.click(Pumpkin_Spice_Iced_Capp);

		s.wait(smallPumpkinSpiceIcedCapp, 300);

		s.click(smallPumpkinSpiceIcedCapp);

		testcase.log(Status.PASS, "User able to click on Small Pumpkin Spice Iced Capp");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"smallPumpkinSpiceIcedCappPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"smallPumpkinSpiceIcedCappPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_small_Pumpkin_Spice_Iced_Capp_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_small_Pumpkin_Spice_Iced_Capp_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Small Pumpkin Spice Iced Capp ");

			System.out.println(
					"***********Scenario063 PASS: Correct ala carte price of Small Pumpkin Spice Iced Capp ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Small Pumpkin Spice Iced Capp. "
					+ "Expected Price: " + read_small_Pumpkin_Spice_Iced_Capp_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			// testcase.log(Status.FAIL,(Markup)testcase.addScreenCaptureFromPath(pricewithname));

			System.out.println(
					"***********Scenario063 FAIL: Incorrect ala carte price of Small Pumpkin Spice Iced Capp ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 64)

	public void sikuliTestCase064(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_64:Verify Medium Pumpkin Spice Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//
//		s.click(Beverages1);

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(FlavouredIcedCappuccino, 300);

		s.click(FlavouredIcedCappuccino);

		s.wait(Pumpkin_Spice_Iced_Capp, 300);

		s.click(Pumpkin_Spice_Iced_Capp);

		s.wait(mediumPumpkinSpiceIcedCapp, 300);

		s.click(mediumPumpkinSpiceIcedCapp);

		testcase.log(Status.PASS, "User able to click on Medium Pumpkin Spice Iced Capp");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"mediumPumpkinSpiceIcedCappPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"mediumPumpkinSpiceIcedCappPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_medium_Pumpkin_Spice_Iced_Capp_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_medium_Pumpkin_Spice_Iced_Capp_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Medium Pumpkin Spice Iced Capp ");

			System.out.println(
					"***********Scenario064 PASS: Correct ala carte price of Medium Pumpkin Spice Iced Capp ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium Pumpkin Spice Iced Capp. "
					+ "Expected Price: " + read_medium_Pumpkin_Spice_Iced_Capp_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario064 FAIL: Incorrect ala carte price of Medium Pumpkin Spice Iced Capp ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 65)

	public void sikuliTestCase065(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_65:Verify Large Pumpkin Spice Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//
//		s.click(Beverages1);

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(FlavouredIcedCappuccino, 300);

		s.click(FlavouredIcedCappuccino);

		s.wait(Pumpkin_Spice_Iced_Capp, 300);

		s.click(Pumpkin_Spice_Iced_Capp);

		s.wait(largePumpkinSpiceIcedCapp, 300);

		s.click(largePumpkinSpiceIcedCapp);

		testcase.log(Status.PASS, "User able to click on Large Pumpkin Spice Iced Capp");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"largePumpkinSpiceIcedCappPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"largePumpkinSpiceIcedCappPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_large_Pumpkin_Spice_Iced_Capp_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_large_Pumpkin_Spice_Iced_Capp_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Large Pumpkin Spice Iced Capp ");

			System.out.println(
					"***********Scenario065 PASS: Correct ala carte price of Large Pumpkin Spice Iced Capp ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Pumpkin Spice Iced Capp. "
					+ "Expected Price: " + read_large_Pumpkin_Spice_Iced_Capp_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario65 FAIL: Incorrect ala carte price of Large Pumpkin Spice Iced Capp ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 66)

	public void sikuliTestCase066(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_66:Verify Refil Small Pumpkin Spice Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//
//		s.click(Beverages1);

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(FlavouredIcedCappuccino, 300);

		s.click(FlavouredIcedCappuccino);

		s.wait(Pumpkin_Spice_Iced_Capp, 300);

		s.click(Pumpkin_Spice_Iced_Capp);

		s.wait(RefilSmallPumpkinSpiceIcedCapp, 300);

		s.click(RefilSmallPumpkinSpiceIcedCapp);

		testcase.log(Status.PASS, "User able to click on Refil Small Pumpkin Spice Iced Capp");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilSmallPumpkinSpiceIcedCappPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilSmallPumpkinSpiceIcedCappPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Small_Pumpkin_Spice_Iced_Capp_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Small_Pumpkin_Spice_Iced_Capp_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Small Pumpkin Spice Iced Capp ");

			System.out.println(
					"***********Scenario066 PASS: Correct ala carte price of Refil Small Pumpkin Spice Iced Capp ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Small Pumpkin Spice Iced Capp. "
					+ "Expected Price: " + read_Refil_Small_Pumpkin_Spice_Iced_Capp_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario066 FAIL: Incorrect ala carte price of Refil Small Pumpkin Spice Iced Capp ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 67)

	public void sikuliTestCase067(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_67:Verify Refil Medium Pumpkin Spice Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//
//		s.click(Beverages1);

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(FlavouredIcedCappuccino, 300);

		s.click(FlavouredIcedCappuccino);

		s.wait(Pumpkin_Spice_Iced_Capp, 300);

		s.click(Pumpkin_Spice_Iced_Capp);

		s.wait(RefilMediumPumpkinSpiceIcedCapp, 300);

		s.click(RefilMediumPumpkinSpiceIcedCapp);

		testcase.log(Status.PASS, "User able to click on Refil Medium Pumpkin Spice Iced Capp");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilMediumPumpkinSpiceIcedCappPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilMediumPumpkinSpiceIcedCappPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Medium_Pumpkin_Spice_Iced_Capp_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Medium_Pumpkin_Spice_Iced_Capp_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Medium Pumpkin Spice Iced Capp ");

			System.out.println(
					"***********Scenario067 PASS: Correct ala carte price of Refil Medium Pumpkin Spice Iced Capp ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Medium Pumpkin Spice Iced Capp. "
					+ "Expected Price: " + read_Refil_Medium_Pumpkin_Spice_Iced_Capp_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario067 FAIL: Incorrect ala carte price of Refil Medium Pumpkin Spice Iced Capp ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 68)

	public void sikuliTestCase068(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_68:Verify Refil Large Pumpkin Spice Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//
//		s.click(Beverages1);

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(FlavouredIcedCappuccino, 300);

		s.click(FlavouredIcedCappuccino);

		s.wait(Pumpkin_Spice_Iced_Capp, 300);

		s.click(Pumpkin_Spice_Iced_Capp);

		s.wait(RefilLargePumpkinSpiceIcedCapp, 300);

		s.click(RefilLargePumpkinSpiceIcedCapp);

		testcase.log(Status.PASS, "User able to click on Refil Large Pumpkin Spice Iced Capp");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilLargePumpkinSpiceIcedCappPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilLargePumpkinSpiceIcedCappPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Large_Pumpkin_Spice_Iced_Capp_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Large_Pumpkin_Spice_Iced_Capp_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Large Pumpkin Spice Iced Capp ");

			System.out.println(
					"***********Scenario068 PASS: Correct ala carte price of Refil Large Pumpkin Spice Iced Capp ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Large Pumpkin Spice Iced Capp. "
					+ "Expected Price: " + read_Refil_Large_Pumpkin_Spice_Iced_Capp_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario068 FAIL: Incorrect ala carte price of Refil Large Pumpkin Spice Iced Capp ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 69)

	public void sikuliTestCase069(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest("TC_69:Verify Small Redeye Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(FlavouredIcedCappuccino, 300);

		s.click(FlavouredIcedCappuccino);

		s.wait(RedeyeIcedCapp, 300);

		s.click(RedeyeIcedCapp);

		s.wait(smallRedeyeIcedCapp, 300);

		s.click(smallRedeyeIcedCapp);

		testcase.log(Status.PASS, "User able to click on Small Redeye Iced Capp");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallRedeyeIcedCappPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallRedeyeIcedCappPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Small_Redeye_Iced_Capp());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Small_Redeye_Iced_Capp());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Small Redeye Iced Capp ");

			System.out.println(
					"***********Scenario069 PASS: Correct ala carte price of Small Redeye Iced Capp ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Small Redeye Iced Capp. " + "Expected Price: "
					+ read_Small_Redeye_Iced_Capp());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario069 FAIL: Incorrect ala carte price of Small Redeye Iced Capp ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 70)

	public void sikuliTestCase070(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_70:Verify Refil Small Redeye Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(FlavouredIcedCappuccino, 300);

		s.click(FlavouredIcedCappuccino);

		s.wait(RedeyeIcedCapp, 300);

		s.click(RedeyeIcedCapp);

		s.wait(SmallRefillRedeyeIcedCapp, 300);

		s.click(SmallRefillRedeyeIcedCapp);

		testcase.log(Status.PASS, "User able to click on Refil Small Redeye Iced Capp");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilSmallRedeyeIcedCappPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilSmallRedeyeIcedCappPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Small_Redeye_Iced_Capp());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Small_Redeye_Iced_Capp());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Small Redeye Iced Capp ");

			System.out.println(
					"***********Scenario070 PASS: Correct ala carte price of Refil Small Redeye Iced Capp ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Small Redeye Iced Capp. "
					+ "Expected Price: " + read_Refil_Small_Redeye_Iced_Capp());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario070 FAIL: Incorrect ala carte price of Refil Small Redeye Iced Capp ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 71)

	public void sikuliTestCase071(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_71:Verify Small Caramel Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//	s.click(Beverages1); 
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);

		Thread.sleep(2000);
		s.wait(CaramelIcedCapp, 300);
		s.click(CaramelIcedCapp);
		s.wait(smallCaramelIcedCapp, 300);
		s.click(smallCaramelIcedCapp);
		testcase.log(Status.PASS, "User able to click on Small Caramel Iced Capp");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallCaramelIcedCappPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallCaramelIcedCappPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.read_Small_Caramel_Iced_Capp_Price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.read_Small_Caramel_Iced_Capp_Price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);
		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Small Caramel Iced Capp ");
			System.out.println(
					"***********Scenario071 PASS: Correct ala carte price of Small Caramel Iced Capp ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Small Caramel Iced Capp. " + "Expected Price: "
					+ read_Small_Caramel_Iced_Capp_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario071 FAIL: Incorrect ala carte price of Small Caramel Iced Capp ***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 72)

	public void sikuliTestCase072(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);
		testcase = extent
				.createTest("TC_72:Verify Medium Caramel Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

		// s.wait(Beverages1,300);
		// s.click(Beverages1);
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		Thread.sleep(2000);
		s.wait(CaramelIcedCapp, 300);
		s.click(CaramelIcedCapp);
		s.wait(mediumCaramelIcedCapp, 300);
		s.click(mediumCaramelIcedCapp);
		testcase.log(Status.PASS, "User able to click on Medium Caramel Iced Capp");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumCaramelIcedCappPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumCaramelIcedCappPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.read_Medium_Caramel_Iced_Capp_Price());

		String a1 = null;
		String a2 = null;
		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.read_Medium_Caramel_Iced_Capp_Price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Medium Caramel Iced Capp ");
			System.out.println(
					"***********Scenario072 PASS: Correct ala carte price of Medium Caramel Iced Capp ***********");
		}

		else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium Caramel Iced Capp. " + "Expected Price: "
					+ read_Medium_Caramel_Iced_Capp_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario072 FAIL: Incorrect ala carte price of Medium Caramel Iced Capp ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 73)

	public void sikuliTestCase073(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);
		testcase = extent
				.createTest("TC_73:Verify Large Caramel Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

		// s.wait(Beverages1,300);
		// s.click(Beverages1);
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		s.wait(CaramelIcedCapp, 300);
		s.click(CaramelIcedCapp);
		s.wait(largeCaramelIcedCapp, 300);
		s.click(largeCaramelIcedCapp);
		testcase.log(Status.PASS, "User able to click on Large Caramel Iced Capp");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeCaramelIcedCappPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeCaramelIcedCappPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.read_Large_Caramel_Iced_Capp_Price());
		String a1 = null;
		String a2 = null;
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = String.valueOf(b.read_Large_Caramel_Iced_Capp_Price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Large Caramel Iced Capp ");
			System.out.println(
					"***********Scenario073 PASS: Correct ala carte price of Large Caramel Iced Capp ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Caramel Iced Capp. " + "Expected Price: "
					+ read_Large_Caramel_Iced_Capp_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario073 FAIL: Incorrect ala carte price of Large Caramel Iced Capp ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 74)

	public void sikuliTestCase074(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);
		testcase = extent
				.createTest("TC_74:Verify Refil Small Caramel Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

		// s.wait(Beverages1,300);
		// s.click(Beverages1);
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		s.wait(CaramelIcedCapp, 300);
		s.click(CaramelIcedCapp);
		s.wait(RefilSmallCaramelIcedCapp, 300);
		s.click(RefilSmallCaramelIcedCapp);
		testcase.log(Status.PASS, "User able to click on Refil Small Caramel Iced Capp");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilSmallCaramelIcedCappPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilSmallCaramelIcedCappPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.read_Rifil_Small_Caramel_Iced_Capp_Price());

		String a1 = null;
		String a2 = null;
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = String.valueOf(b.read_Rifil_Small_Caramel_Iced_Capp_Price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Refil Small Caramel Iced Capp ");
			System.out.println(
					"***********Scenario074 PASS: Correct ala carte price of Refil Small Caramel Iced Capp ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Small Caramel Iced Capp. "
					+ "Expected Price: " + read_Rifil_Small_Caramel_Iced_Capp_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario074 FAIL: Incorrect ala carte price of Refil Small Caramel Iced Capp ***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 75)

	public void sikuliTestCase075(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);
		testcase = extent
				.createTest("TC_75:Verify Refil Medium Caramel Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

		// s.wait(Beverages1,300);
		// s.click(Beverages1);
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		s.wait(CaramelIcedCapp, 300);
		s.click(CaramelIcedCapp);
		s.wait(RefilMediumCaramelIcedCapp, 300);
		s.click(RefilMediumCaramelIcedCapp);
		testcase.log(Status.PASS, "User able to click on Refil Medium Caramel Iced Capp");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilMediumCaramelIcedCappPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilMediumCaramelIcedCappPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.read_Rifil_Medium_Caramel_Iced_Capp_Price());

		String a1 = null;
		String a2 = null;
		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.read_Rifil_Medium_Caramel_Iced_Capp_Price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);
		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Refil Medium Caramel Iced Capp ");
			System.out.println(
					"***********Scenario075 PASS: Correct ala carte price of Refil Medium Caramel Iced Capp ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Medium Caramel Iced Capp. "
					+ "Expected Price: " + read_Rifil_Medium_Caramel_Iced_Capp_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario075 FAIL: Incorrect ala carte price of Refil Medium Caramel Iced Capp ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 76)

	public void sikuliTestCase076(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);
		testcase = extent
				.createTest("TC_76:Verify Refil Large Caramel Iced Capp Price. " + "Region Id:" + b.read_Region_Id());
		// s.wait(Beverages1,300);
		// s.click(Beverages1);
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		s.wait(CaramelIcedCapp, 300);
		s.click(CaramelIcedCapp);
		s.wait(RefilLargeCaramelIcedCapp, 300);
		s.click(RefilLargeCaramelIcedCapp);
		testcase.log(Status.PASS, "User able to click on Refil Large Caramel Iced Capp");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilLargeCaramelIcedCappPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilLargeCaramelIcedCappPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.read_Rifil_Large_Caramel_Iced_Capp_Price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.read_Rifil_Large_Caramel_Iced_Capp_Price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Refil Large Caramel Iced Capp ");
			System.out.println(
					"***********Scenario076 PASS: Correct ala carte price of Refil Large Caramel Iced Capp ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Large Caramel Iced Capp. "
					+ "Expected Price: " + read_Rifil_Large_Caramel_Iced_Capp_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario076 FAIL: Incorrect ala carte price of Refil Large Caramel Iced Capp ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 77)

	public void sikuliTestCase077(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);
		testcase = extent.createTest("TC_77:Verify Small Vanila Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//	s.click(Beverages1); 
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		s.wait(VanilaIcedCapp, 300);
		s.click(VanilaIcedCapp);
		s.wait(smallVanilaIcedCapp, 300);
		s.click(smallVanilaIcedCapp);
		testcase.log(Status.PASS, "User able to click on Small Vanila Iced Capp");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"smallVanilaIcedCappPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"smallVanilaIcedCappPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.read_Small_Vanila_Iced_Capp_Price());

		String a1 = null;
		String a2 = null;
		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.read_Small_Vanila_Iced_Capp_Price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Small Vanila Iced Capp ");
			System.out.println(
					"***********Scenario077 PASS: Correct ala carte price of Small Vanila Iced Capp ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Small Vanila Iced Capp. " + "Expected Price: "
					+ read_Small_Vanila_Iced_Capp_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario077 FAIL: Incorrect ala carte price of Small Vanila Iced Capp ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 78)

	public void sikuliTestCase078(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);
		testcase = extent
				.createTest("TC_78:Verify Medium Vanila Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

		// s.wait(Beverages1,300);
		// s.click(Beverages1);
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		s.wait(VanilaIcedCapp, 300);
		s.click(VanilaIcedCapp);
		s.wait(mediumVanilaIcedCapp, 300);
		s.click(mediumVanilaIcedCapp);
		testcase.log(Status.PASS, "User able to click on Medium Vanila Iced Capp");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"mediumVanilaIcedCappPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"mediumVanilaIcedCappPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.read_Medium_Vanila_Iced_Capp_Price());
		String a1 = null;
		String a2 = null;
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = String.valueOf(b.read_Medium_Vanila_Iced_Capp_Price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);
		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Medium Vanila Iced Capp ");
			System.out.println(
					"***********Scenario078 PASS: Correct ala carte price of Medium Vanila Iced Capp ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium Vanila Iced Capp. " + "Expected Price: "
					+ read_Medium_Vanila_Iced_Capp_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario078 FAIL: Incorrect ala carte price of Medium Vanila Iced Capp ***********");
		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 79)

	public void sikuliTestCase079(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);
		testcase = extent.createTest("TC_79:Verify Large Vanila Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

		// s.wait(Beverages1,300);
		// s.click(Beverages1);
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		s.wait(VanilaIcedCapp, 300);
		s.click(VanilaIcedCapp);
		s.wait(largeVanilaIcedCapp, 300);
		s.click(largeVanilaIcedCapp);
		testcase.log(Status.PASS, "User able to click on Large Vanila Iced Capp");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"largeVanilaIcedCappPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"largeVanilaIcedCappPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.read_Large_Vanila_Iced_Capp_Price());
		String a1 = null;
		String a2 = null;
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = String.valueOf(b.read_Large_Vanila_Iced_Capp_Price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);
		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Large Vanila Iced Capp ");
			System.out.println(
					"***********Scenario079 PASS: Correct ala carte price of Large Vanila Iced Capp ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Vanila Iced Capp. " + "Expected Price: "
					+ read_Large_Vanila_Iced_Capp_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario079 FAIL: Incorrect ala carte price of Large Vanila Iced Capp ***********");
		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 80)

	public void sikuliTestCase080(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);
		testcase = extent
				.createTest("TC_80:Verify Refil Small Vanila Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

		// s.wait(Beverages1,300);
		// s.click(Beverages1);
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		s.wait(VanilaIcedCapp, 300);
		s.click(VanilaIcedCapp);
		s.wait(RefilSmallVanilaIcedCapp, 300);
		s.click(RefilSmallVanilaIcedCapp);
		testcase.log(Status.PASS, "User able to click on Refil Small Vanila Iced Capp");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilSmallVanilaIcedCappPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilSmallVanilaIcedCappPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.read_Refil_Small_Vanila_Iced_Capp_Price());

		String a1 = null;
		String a2 = null;
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = String.valueOf(b.read_Refil_Small_Vanila_Iced_Capp_Price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);
		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Refil Small Vanila Iced Capp ");
			System.out.println(
					"***********Scenario080 PASS: Correct ala carte price of Refil Small Vanila Iced Capp ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Small Vanila Iced Capp. "
					+ "Expected Price: " + read_Refil_Small_Vanila_Iced_Capp_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario080 FAIL: Incorrect ala carte price of Refil Small Vanila Iced Capp ***********");
		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 81)

	public void sikuliTestCase081(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BeverageItems b = new BeverageItems(s);
		testcase = extent
				.createTest("TC_81:Verify Refil Medium Vanila Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

		// s.wait(Beverages1,300);
		// s.click(Beverages1);
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		s.wait(VanilaIcedCapp, 300);
		s.click(VanilaIcedCapp);
		s.wait(RefilMediumVanilaIcedCapp, 300);
		s.click(RefilMediumVanilaIcedCapp);
		testcase.log(Status.PASS, "User able to click on Refil Medium Vanila Iced Capp");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilMediumVanilaIcedCappPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilMediumVanilaIcedCappPricewithname");

		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.read_Refil_Medium_Vanila_Iced_Capp_Price());
		String a1 = null;
		String a2 = null;
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = String.valueOf(b.read_Refil_Medium_Vanila_Iced_Capp_Price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);
		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Refil Medium Vanila Iced Capp ");
			System.out.println(
					"***********Scenario081 PASS: Correct ala carte price of Refil Medium Vanila Iced Capp ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Medium Vanila Iced Capp. "
					+ "Expected Price: " + read_Refil_Medium_Vanila_Iced_Capp_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario081 FAIL: Incorrect ala carte price of Refil Medium Vanila Iced Capp ***********");
		}
		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 82)

	public void sikuliTestCase082(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);
		testcase = extent
				.createTest("TC_82:Verify Refil Large Vanila Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

		// s.wait(Beverages1,300);
		// s.click(Beverages1);
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(FlavouredIcedCappuccino, 300);
		s.click(FlavouredIcedCappuccino);
		s.wait(VanilaIcedCapp, 300);
		s.click(VanilaIcedCapp);
		s.wait(RefilLargeVanilaIcedCapp, 300);
		s.click(RefilLargeVanilaIcedCapp);
		testcase.log(Status.PASS, "User able to click on Refil Large Vanila Iced Capp");
		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");
		Thread.sleep(7000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 70, 40);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilLargeVanilaIcedCappPrice");
		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilLargeVanilaIcedCappPricewithname");
		System.out.println("price screen shot clicked");
		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		System.out.println("frompic " + imageText);
		System.out.println("fromexcel " + b.read_Refil_Large_Vanila_Iced_Capp_Price());
		String a1 = null;
		String a2 = null;
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;
		a2 = String.valueOf(b.read_Refil_Large_Vanila_Iced_Capp_Price());
		System.out.println("from pic " + a1);
		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);
		System.out.println(value);
		if (a1.equals(a2)) {
			System.out.println("same");
		}
		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Refil Large Vanila Iced Capp ");
			System.out.println(
					"***********Scenario082 PASS: Correct ala carte price of Refil Large Vanila Iced Capp ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Large Vanila Iced Capp. "
					+ "Expected Price: " + read_Refil_Large_Vanila_Iced_Capp_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario082 FAIL: Incorrect ala carte price of Refil Large Vanila Iced Capp ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 83)

	public void sikuliTestCase083(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_83:Verify Small Chocolate Creamy Chill Price. " + "Region Id:" + b.read_Region_Id());

		s.wait(Beverages1, 300);
		s.click(Beverages1);

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(CreamyChill, 300);

		s.click(CreamyChill);

		s.wait(ChocolateCreamyChill, 300);

		s.click(ChocolateCreamyChill);

		s.wait(SmallChocolateCreamyChill, 300);

		s.click(SmallChocolateCreamyChill);

		testcase.log(Status.PASS, "User able to click on Small Chocolate Creamy Chill");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(425, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallChocolateCreamyChillPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallChocolateCreamyChillPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Small_Chocolate_Creamy_Chill_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Small_Chocolate_Creamy_Chill_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Small Chocolate Creamy Chill ");

			System.out.println(
					"***********Scenario083 PASS: Correct ala carte price of Small Chocolate Creamy Chill ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Small Chocolate Creamy Chill. "
					+ "Expected Price: " + read_Small_Chocolate_Creamy_Chill_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario083 FAIL: Incorrect ala carte price of Small Chocolate Creamy Chill ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 84)

	public void sikuliTestCase084(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_84:Verify Medium Chocolate Creamy Chill Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(CreamyChill, 300);

		s.click(CreamyChill);

		s.wait(ChocolateCreamyChill, 300);

		s.click(ChocolateCreamyChill);

		s.wait(MediumChocolateCreamyChill, 300);

		s.click(MediumChocolateCreamyChill);

		testcase.log(Status.PASS, "User able to click on Medium Chocolate Creamy Chill");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(425, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumChocolateCreamyChillPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumChocolateCreamyChillPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Medium_Chocolate_Creamy_Chill_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Medium_Chocolate_Creamy_Chill_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Medium Chocolate Creamy Chill ");

			System.out.println(
					"***********Scenario084 PASS: Correct ala carte price of Medium Chocolate Creamy Chill ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium Chocolate Creamy Chill. "
					+ "Expected Price: " + read_Medium_Chocolate_Creamy_Chill_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario084 FAIL: Incorrect ala carte price of Medium Chocolate Creamy Chill ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 85)

	public void sikuliTestCase085(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_85:Verify Large Chocolate Creamy Chill Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(CreamyChill, 300);

		s.click(CreamyChill);

		s.wait(ChocolateCreamyChill, 300);

		s.click(ChocolateCreamyChill);

		s.wait(LargeChocolateCreamyChill, 300);

		s.click(LargeChocolateCreamyChill);

		testcase.log(Status.PASS, "User able to click on Large Chocolate Creamy Chill");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(425, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeChocolateCreamyChillPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeChocolateCreamyChillPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Large_Chocolate_Creamy_Chill_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Large_Chocolate_Creamy_Chill_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Large Chocolate Creamy Chill ");

			System.out.println(
					"***********Scenario085 PASS: Correct ala carte price of Large Chocolate Creamy Chill ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Chocolate Creamy Chill. "
					+ "Expected Price: " + read_Large_Chocolate_Creamy_Chill_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario085 FAIL: Incorrect ala carte price of Large Chocolate Creamy Chill ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 86)

	public void sikuliTestCase086(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_86:Verify Refil Small Chocolate Creamy Chill Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(CreamyChill, 300);

		s.click(CreamyChill);

		s.wait(ChocolateCreamyChill, 300);

		s.click(ChocolateCreamyChill);

		s.wait(RefilSmallChocolateCreamyChill, 300);

		s.click(RefilSmallChocolateCreamyChill);

		testcase.log(Status.PASS, "User able to click on Refil Small Chocolate Creamy Chill");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(425, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilSmallChocolateCreamyChillPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilSmallChocolateCreamyChillPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Small_Chocolate_Creamy_Chill_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Small_Chocolate_Creamy_Chill_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Small Chocolate Creamy Chill ");

			System.out.println(
					"***********Scenario086 PASS: Correct ala carte price of Refil Small Chocolate Creamy Chill ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Small Chocolate Creamy Chill. "
					+ "Expected Price: " + read_Refil_Small_Chocolate_Creamy_Chill_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario086 FAIL: Incorrect ala carte price of Refil Small Chocolate Creamy Chill ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 87)

	public void sikuliTestCase087(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_87:Verify Refil Medium Chocolate Creamy Chill Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(CreamyChill, 300);

		s.click(CreamyChill);

		s.wait(ChocolateCreamyChill, 300);

		s.click(ChocolateCreamyChill);

		s.wait(RefilMediumChocolateCreamyChill, 300);

		s.click(RefilMediumChocolateCreamyChill);

		testcase.log(Status.PASS, "User able to click on Refil Medium Chocolate Creamy Chill");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(425, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilMediumChocolateCreamyChillPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilMediumChocolateCreamyChillPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Medium_Chocolate_Creamy_Chill_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Medium_Chocolate_Creamy_Chill_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Medium Chocolate Creamy Chill ");

			System.out.println(
					"***********Scenario087 PASS: Correct ala carte price of Refil Medium Chocolate Creamy Chill ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Medium Chocolate Creamy Chill. "
					+ "Expected Price: " + read_Refil_Medium_Chocolate_Creamy_Chill_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario087 FAIL: Incorrect ala carte price of Refil Medium Chocolate Creamy Chill ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 88)

	public void sikuliTestCase088(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_88:Verify Refil Large Chocolate Creamy Chill Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(CreamyChill, 300);

		s.click(CreamyChill);

		s.wait(ChocolateCreamyChill, 300);

		s.click(ChocolateCreamyChill);

		s.wait(RefilLargeChocolateCreamyChill, 300);

		s.click(RefilLargeChocolateCreamyChill);

		testcase.log(Status.PASS, "User able to click on Refil Large Chocolate Creamy Chill");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(425, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilLargeChocolateCreamyChillPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilLargeChocolateCreamyChillPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Large_Chocolate_Creamy_Chill_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Large_Chocolate_Creamy_Chill_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Large Chocolate Creamy Chill ");

			System.out.println(
					"***********Scenario088 PASS: Correct ala carte price of Refil Large Chocolate Creamy Chill ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Large Chocolate Creamy Chill. "
					+ "Expected Price: " + read_Refil_Large_Chocolate_Creamy_Chill_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario088 FAIL: Incorrect ala carte price of Refil Large Chocolate Creamy Chill ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 89)

	public void sikuliTestCase089(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_89:Verify Small Vanilla Creamy Chill Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//	s.click(Beverages1); 
		s.wait(IcedBeverages, 300);
		s.click(IcedBeverages);
		s.wait(CreamyChill, 300);
		s.click(CreamyChill);
		Thread.sleep(2500);
		s.wait(VanillaCreamyChill, 300);
		s.click(VanillaCreamyChill);
		Thread.sleep(2000);
		s.wait(SmallVanillaCreamyChill, 300);
		s.click(SmallVanillaCreamyChill);

		testcase.log(Status.PASS, "User able to click on Small Vanilla Creamy Chill");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(425, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallVanillaCreamyChillPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallVanillaCreamyChillPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Small_Vanilla_Creamy_Chill_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Small_Vanilla_Creamy_Chill_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Small Vanilla Creamy Chill ");

			System.out.println(
					"***********Scenario089 PASS: Correct ala carte price of Small Vanilla Creamy Chill ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Small Vanilla Creamy Chill. " + "Expected Price: "
					+ read_Small_Vanilla_Creamy_Chill_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario089 FAIL: Incorrect ala carte price of Small Vanilla Creamy Chill ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 90)

	public void sikuliTestCase090(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_90:Verify Medium Vanilla Creamy Chill Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(CreamyChill, 300);

		s.click(CreamyChill);
		Thread.sleep(2000);

		s.wait(VanillaCreamyChill, 300);

		s.click(VanillaCreamyChill);

		Thread.sleep(2500);

		s.wait(MediumVanillaCreamyChill, 300);

		s.click(MediumVanillaCreamyChill);

		testcase.log(Status.PASS, "User able to click on Medium Vanilla Creamy Chill");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(425, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumVanillaCreamyChillPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumVanillaCreamyChillPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Medium_Vanilla_Creamy_Chill_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Medium_Vanilla_Creamy_Chill_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Medium Vanilla Creamy Chill ");

			System.out.println(
					"***********Scenario090 PASS: Correct ala carte price of Medium Vanilla Creamy Chill ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium Vanilla Creamy Chill. " + "Expected Price: "
					+ read_Medium_Vanilla_Creamy_Chill_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario090 FAIL: Incorrect ala carte price of Medium Vanilla Creamy Chill ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 91)

	public void sikuliTestCase091(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_91:Verify Large Vanilla Creamy Chill Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);
		Thread.sleep(2000);

		s.wait(CreamyChill, 300);

		s.click(CreamyChill);

		Thread.sleep(2000);

		s.wait(VanillaCreamyChill, 300);

		s.click(VanillaCreamyChill);

		Thread.sleep(2500);

		s.wait(LargeVanillaCreamyChill, 300);

		s.click(LargeVanillaCreamyChill);

		testcase.log(Status.PASS, "User able to click on Large Vanilla Creamy Chill");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(425, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeVanillaCreamyChillPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeVanillaCreamyChillPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Large_Vanilla_Creamy_Chill_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Large_Vanilla_Creamy_Chill_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Large Vanilla Creamy Chill ");

			System.out.println(
					"***********Scenario091 PASS: Correct ala carte price of Large Vanilla Creamy Chill ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Vanilla Creamy Chill. " + "Expected Price: "
					+ read_Large_Vanilla_Creamy_Chill_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario091 FAIL: Incorrect ala carte price of Large Vanilla Creamy Chill ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 92)

	public void sikuliTestCase092(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_92:Verify Refil Small Vanilla Creamy Chill Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);
		Thread.sleep(2000);

		s.wait(CreamyChill, 300);
		s.click(CreamyChill);

		Thread.sleep(2000);
		s.wait(VanillaCreamyChill, 300);

		s.click(VanillaCreamyChill);
		Thread.sleep(2500);

		s.wait(RefilSmallVanillaCreamyChill, 300);

		s.click(RefilSmallVanillaCreamyChill);

		testcase.log(Status.PASS, "User able to click on Refil Small Vanilla Creamy Chill");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(425, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilSmallVanillaCreamyChillPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilSmallVanillaCreamyChillPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Small_Vanilla_Creamy_Chill_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Small_Vanilla_Creamy_Chill_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Small Vanilla Creamy Chill ");

			System.out.println(
					"***********Scenario092 PASS: Correct ala carte price of Refil Small Vanilla Creamy Chill ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Small Vanilla Creamy Chill. "
					+ "Expected Price: " + read_Refil_Small_Vanilla_Creamy_Chill_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario092 FAIL: Incorrect ala carte price of Refil Small Vanilla Creamy Chill ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 93)

	public void sikuliTestCase093(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_93:Verify Refil Medium Vanilla Creamy Chill Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(CreamyChill, 300);

		s.click(CreamyChill);

		Thread.sleep(2000);

		s.wait(VanillaCreamyChill, 300);

		s.click(VanillaCreamyChill);

		Thread.sleep(2500);

		s.wait(RefilMediumVanillaCreamyChill, 300);

		s.click(RefilMediumVanillaCreamyChill);

		testcase.log(Status.PASS, "User able to click on Refil Medium Vanilla Creamy Chill");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(425, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilMediumVanillaCreamyChillPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilMediumVanillaCreamyChillPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Medium_Vanilla_Creamy_Chill_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Medium_Vanilla_Creamy_Chill_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Medium Vanilla Creamy Chill ");

			System.out.println(
					"***********Scenario093 PASS: Correct ala carte price of Refil Medium Vanilla Creamy Chill ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Medium Vanilla Creamy Chill. "
					+ "Expected Price: " + read_Refil_Medium_Vanilla_Creamy_Chill_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario093 FAIL: Incorrect ala carte price of Refil Medium Vanilla Creamy Chill ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 94)

	public void sikuliTestCase094(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_94:Verify Refil Large Vanilla Creamy Chill Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(CreamyChill, 300);

		s.click(CreamyChill);
		Thread.sleep(2000);

		s.wait(VanillaCreamyChill, 300);

		s.click(VanillaCreamyChill);

		Thread.sleep(2500);

		s.wait(RefilLargeVanillaCreamyChill, 300);

		s.click(RefilLargeVanillaCreamyChill);

		testcase.log(Status.PASS, "User able to click on Refil Large Vanilla Creamy Chill");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(425, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilLargeVanillaCreamyChillPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilLargeVanillaCreamyChillPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Large_Vanilla_Creamy_Chill_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Large_Vanilla_Creamy_Chill_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Large Vanilla Creamy Chill ");

			System.out.println(
					"***********Scenario094 PASS: Correct ala carte price of Refil Large Vanilla Creamy Chill ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Large Vanilla Creamy Chill. "
					+ "Expected Price: " + read_Refil_Large_Vanilla_Creamy_Chill_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario094 FAIL: Incorrect ala carte price of Refil Large Vanilla Creamy Chill ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 95)

	public void sikuliTestCase095(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_95:Verify Small Strawberry Creamy Chill Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(CreamyChill, 300);

		s.click(CreamyChill);
		Thread.sleep(2000);

		s.wait(StrawberryCreamyChill, 300);

		s.click(StrawberryCreamyChill);

		Thread.sleep(3000);

		s.wait(SmallStrawberryCreamyChill, 300);

		s.click(SmallStrawberryCreamyChill);

		testcase.log(Status.PASS, "User able to click on Small Strawberry Creamy Chill");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(425, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallStrawberryCreamyChillPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallStrawberryCreamyChillPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Small_Strawberry_Creamy_Chill_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Small_Strawberry_Creamy_Chill_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Small Strawberry Creamy Chill ");

			System.out.println(
					"***********Scenario095 PASS: Correct ala carte price of Small Strawberry Creamy Chill ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Small Strawberry Creamy Chill. "
					+ "Expected Price: " + read_Small_Strawberry_Creamy_Chill_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario095 FAIL: Incorrect ala carte price of Small Strawberry Creamy Chill ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 96)

	public void sikuliTestCase096(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_96:Verify Medium Strawberry Creamy Chill Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(CreamyChill, 300);

		s.click(CreamyChill);

		Thread.sleep(2000);

		s.wait(StrawberryCreamyChill, 300);

		s.click(StrawberryCreamyChill);

		Thread.sleep(3000);

		s.wait(MediumStrawberryCreamyChill, 300);

		s.click(MediumStrawberryCreamyChill);

		testcase.log(Status.PASS, "User able to click on Medium Strawberry Creamy Chill");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(425, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumStrawberryCreamyChillPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumStrawberryCreamyChillPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Medium_Strawberry_Creamy_Chill_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Medium_Strawberry_Creamy_Chill_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Medium Strawberry Creamy Chill ");

			System.out.println(
					"***********Scenario096 PASS: Correct ala carte price of Medium Strawberry Creamy Chill ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium Strawberry Creamy Chill. "
					+ "Expected Price: " + read_Medium_Strawberry_Creamy_Chill_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario096 FAIL: Incorrect ala carte price of Medium Strawberry Creamy Chill ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 97)

	public void sikuliTestCase097(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_97:Verify Large Strawberry Creamy Chill Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(CreamyChill, 300);

		s.click(CreamyChill);
		Thread.sleep(2000);

		s.wait(StrawberryCreamyChill, 300);

		s.click(StrawberryCreamyChill);

		Thread.sleep(3000);

		s.wait(LargeStrawberryCreamyChill, 300);

		s.click(LargeStrawberryCreamyChill);

		testcase.log(Status.PASS, "User able to click on Large Strawberry Creamy Chill");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(425, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeStrawberryCreamyChillChillPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeStrawberryCreamyChillPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Large_Strawberry_Creamy_Chill_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Large_Strawberry_Creamy_Chill_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Large Strawberry Creamy Chill ");

			System.out.println(
					"***********Scenario097 PASS: Correct ala carte price of Large Strawberry Creamy Chill ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Strawberry Creamy Chill. "
					+ "Expected Price: " + read_Large_Strawberry_Creamy_Chill_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario097 FAIL: Incorrect ala carte price of Large Strawberry Creamy Chill ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 98)

	public void sikuliTestCase098(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_98:Verify Refil Small Strawberry Creamy Chill Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(CreamyChill, 300);

		s.click(CreamyChill);
		Thread.sleep(2000);

		s.wait(StrawberryCreamyChill, 300);

		s.click(StrawberryCreamyChill);

		Thread.sleep(3000);

		s.wait(RefilSmallStrawberryCreamyChill, 300);

		s.click(RefilSmallStrawberryCreamyChill);

		testcase.log(Status.PASS, "User able to click on Refil Small Strawberry Creamy Chill");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(425, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilSmallStrawberryCreamyChillPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilSmallStrawberryCreamyChillPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Small_Strawberry_Creamy_Chill_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Small_Strawberry_Creamy_Chill_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Small Strawberry Creamy Chill ");

			System.out.println(
					"***********Scenario098 PASS: Correct ala carte price of Refil Small Strawberry Creamy Chill ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Small Strawberry Creamy Chill. "
					+ "Expected Price: " + read_Refil_Small_Strawberry_Creamy_Chill_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario098 FAIL: Incorrect ala carte price of Refil Small Strawberry Creamy Chill ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 99)

	public void sikuliTestCase099(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_99:Verify Refil Medium Strawberry Creamy Chill Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(CreamyChill, 300);

		s.click(CreamyChill);

		Thread.sleep(2000);

		s.wait(StrawberryCreamyChill, 300);

		s.click(StrawberryCreamyChill);

		Thread.sleep(3000);

		s.wait(RefilMediumStrawberryCreamyChill, 300);

		s.click(RefilMediumStrawberryCreamyChill);

		testcase.log(Status.PASS, "User able to click on Refil Medium Strawberry Creamy Chill");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilMediumStrawberryCreamyChillPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilMediumStrawberryCreamyChillPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Medium_Strawberry_Creamy_Chill_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Medium_Strawberry_Creamy_Chill_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Medium Strawberry Creamy Chill ");

			System.out.println(
					"***********Scenario099 PASS: Correct ala carte price of Refil Medium Strawberry Creamy Chill ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Medium Strawberry Creamy Chill. "
					+ "Expected Price: " + read_Refil_Medium_Strawberry_Creamy_Chill_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario099 FAIL: Incorrect ala carte price of Refil Medium Strawberry Creamy Chill ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 100)

	public void sikuliTestCase100(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_100:Verify Refil Large Strawberry Creamy Chill Price. " + "Region Id:" + b.read_Region_Id());

		// s.wait(Beverages1,300);

		// s.click(Beverages1);

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(CreamyChill, 300);

		s.click(CreamyChill);
		Thread.sleep(2000);

		s.wait(StrawberryCreamyChill, 300);

		s.click(StrawberryCreamyChill);

		Thread.sleep(3000);

		s.wait(RefilLargeStrawberryCreamyChill, 300);

		s.click(RefilLargeStrawberryCreamyChill);

		testcase.log(Status.PASS, "User able to click on Refil Large Strawberry Creamy Chill");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilLargeStrawberryCreamyChillPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilLargeStrawberryCreamyChillPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Large_Strawberry_Creamy_Chill_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Large_Strawberry_Creamy_Chill_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Large Strawberry Creamy Chill ");

			System.out.println(
					"***********Scenario100 PASS: Correct ala carte price of Refil Large Strawberry Creamy Chill ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Large Strawberry Creamy Chill. "
					+ "Expected Price: " + read_Refil_Large_Strawberry_Creamy_Chill_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario100 FAIL: Incorrect ala carte price of Refil Large Strawberry Creamy Chill ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 101)
	public void sikuliTestCase101(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BeverageItems b = new BeverageItems(s);
		testcase = extent
				.createTest("TC_101:Verify Small Original Lemonade Price." + "Region Id: " + b.read_Region_Id());

		// s.wait(Beverages1,300);
		// s.click(Beverages1);
		s.wait(IcedBeverages, 500);
		s.click(IcedBeverages);
		Thread.sleep(2000);
		s.wait(Frozen_Lemonade, 500);
		s.click(Frozen_Lemonade);
		Thread.sleep(2000);
		s.wait(Original_Lemonade, 500);
		s.click(Original_Lemonade.similar((float) 0.8));
		s.wait(Small_Original_Lemonade, 500);
		s.click(Small_Original_Lemonade);

		testcase.log(Status.PASS, "User is able to click on Small Original Lemonade ");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User is able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 205, 65, 35);
		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Small_Original_Lemonade_Price");

		rectangle.setBounds(210, 200, 275, 30);
		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Small_Original_Lemonade_withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));

		// System.out.println("frompic "+imageText);
		// System.out.println("fromexcel "+b.read_Small_Orginal_Lemonade_Price());

		String a1 = null;
		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;
		a2 = String.valueOf(b.read_Small_Orginal_Lemonade_Price());
		System.out.println("Price from picture in POS: " + a1);
		System.out.println("Price from pricing sheet: " + a2);

		if (a1.equals(a2)) {
			testcase.log(Status.PASS, " Correct ala carte price of Small Original Lemonade ");
			System.out.println(
					"***********Scenario101 PASS: Correct ala carte price of Small Original Lemonade ***********");
		} else {
			testcase.log(Status.FAIL, " Incorrect ala carte price of Small Original Lemonade. " + "Expected Price: "
					+ b.read_Small_Orginal_Lemonade_Price());
			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario0101 FAIL: Incorrect ala carte price of Small Original Lemonade ***********");
		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 102)
	public void sikuliTestCase102(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BeverageItems b = new BeverageItems(s);
		testcase = extent
				.createTest("TC_102: Verify Medium Original Lemonade Price. " + "Region Id: " + b.read_Region_Id());

		s.wait(IcedBeverages, 500);
		s.click(IcedBeverages);
		s.wait(Frozen_Lemonade, 500);
		s.click(Frozen_Lemonade);
		s.wait(Original_Lemonade, 500);
		s.click(Original_Lemonade.similar((float) 0.8));
		s.wait(Medium_Original_Lemonade, 500);
		s.click(Medium_Original_Lemonade);

		testcase.log(Status.PASS, "User able to click on Medium Original Lemonade");

		Thread.sleep(2000);

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User is able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 205, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Medium_Original_Lemonade_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Medium_Original_Lemonade_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		// System.out.println(imageText);

		// System.out.println(b.read_Medium_Original_Lemonade_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Medium_Original_Lemonade_Price();
		System.out.println("Price from picture in POS: " + a1);
		System.out.println("Price from pricing sheet:" + a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Medium Original Lemonade");

			System.out.println(
					"***********Scenario0102 PASS: Correct ala carte price of Medium Original Lemonade.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium Original Lemonade." + " Expected Price: "
					+ b.read_Medium_Original_Lemonade_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario0102 FAIL: Incorrect ala carte price of Medium Original Lemonade.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 103)
	public void sikuliTestCase103(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {

		BeverageItems b = new BeverageItems(s);
		testcase = extent
				.createTest("TC_103: Verify Large Original Lemonade Price. " + "Region Id: " + b.read_Region_Id());

		s.wait(IcedBeverages, 500);
		s.click(IcedBeverages);
		s.wait(Frozen_Lemonade, 500);
		s.click(Frozen_Lemonade);
		s.wait(Original_Lemonade, 500);
		s.click(Original_Lemonade.similar((float) 0.8));
		s.wait(Large_Original_Lemonade, 500);
		s.click(Large_Original_Lemonade);

		testcase.log(Status.PASS, "User able to click on Large Original Lemonade");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 205, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Large_Original_Lemonade_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Large_Original_Lemonade_Price_Withname ");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		// System.out.println(imageText);

		// System.out.println(b.read_Large_Original_Lemonade_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Large_Original_Lemonade_Price();
		System.out.println("Price from picture in POS: " + a1);
		System.out.println("Price from pricing sheet: " + a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Large Original Lemonade");

			System.out.println(
					"***********Scenario0103 PASS: Correct ala carte price of Large Original Lemonade.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Original Lemonade." + " Expected Price: "
					+ b.read_Large_Original_Lemonade_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario0103 FAIL: Incorrect ala carte price of Large Original Lemonade.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 104)
	public void sikuliTestCase104(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_104: Verify Refill Small Original Lemonade Price. " + "Region Id: " + b.read_Region_Id());

		s.wait(IcedBeverages, 500);
		s.click(IcedBeverages);
		s.wait(Frozen_Lemonade, 500);
		s.click(Frozen_Lemonade);
		s.wait(Original_Lemonade, 500);
		s.click(Original_Lemonade.similar((float) 0.8));
		s.wait(Refill_Small_Original_Lemonade, 500);
		s.click(Refill_Small_Original_Lemonade);

		testcase.log(Status.PASS, "User able to click on Refill Small Original Lemonade");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 205, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Refill_Small_Original_Lemonade_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Refill_Small_Original_Lemonade_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		// System.out.println(imageText);

		// System.out.println(b.read_Refill_Small_Original_Lemonade_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Refill_Small_Original_Lemonade_Price();
		System.out.println("Price from picture in POS: " + a1);
		System.out.println("Price from pricing sheet: " + a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refill Small Original Lemonade");

			System.out.println(
					"***********Scenario0104 PASS: Correct ala carte price of Refill Small Original Lemonade.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refill Small Original Lemonade."
					+ " Expected Price: " + b.read_Refill_Small_Original_Lemonade_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario0104 FAIL: Incorrect ala carte price of Refill Small Original Lemonade.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 105)
	public void sikuliTestCase105(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_105: Verify Refill Medium Original Lemonade Price. " + "Region Id: " + b.read_Region_Id());

		s.wait(IcedBeverages, 500);
		s.click(IcedBeverages);
		s.wait(Frozen_Lemonade, 500);
		s.click(Frozen_Lemonade);
		s.wait(Original_Lemonade, 500);
		s.click(Original_Lemonade.similar((float) 0.8));
		s.wait(Refill_Medium_Original_Lemonade, 500);
		s.click(Refill_Medium_Original_Lemonade);

		testcase.log(Status.PASS, "User able to click on Refill Medium Original Lemonade");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(425, 200, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Refill_Medium_Original_Lemonade_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Refill_Medium_Original_Lemonade_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		// System.out.println(imageText);

		// System.out.println(b.read_Refill_Medium_Original_Lemonade_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Refill_Medium_Original_Lemonade_Price();
		System.out.println("Price from picture in POS: " + a1);
		System.out.println("Price from pricing sheet: " + a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refill Medium Original Lemonade");

			System.out.println(
					"***********Scenario0105 PASS: Correct ala carte price of Refill Medium Original Lemonade.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refill Medium Original Lemonade."
					+ " Expected Price: " + b.read_Refill_Medium_Original_Lemonade_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario0105 FAIL: Incorrect ala carte price of Refill Medium Original Lemonade.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 106)
	public void sikuliTestCase106(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_106: Verify Refill Large Original Lemonade Price. " + "Region Id: " + b.read_Region_Id());

		s.wait(IcedBeverages, 500);
		s.click(IcedBeverages);
		s.wait(Frozen_Lemonade, 500);
		s.click(Frozen_Lemonade);
		s.wait(Original_Lemonade, 500);
		s.click(Original_Lemonade.similar((float) 0.8));
		s.wait(RefilL_Large_Original_Lemonade, 500);
		s.click(RefilL_Large_Original_Lemonade);

		testcase.log(Status.PASS, "User able to click on Refill Large Original Lemonade");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 205, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilL_Large_Original_Lemonade_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilL_Large_Original_Lemonade_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		// System.out.println(imageText);

		// System.out.println(b.read_Refil_Large_Original_Lemonade_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Refil_Large_Original_Lemonade_Price();
		System.out.println("Price from picture in POS: " + a1);
		System.out.println("Price from pricing sheet: " + a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refill Large Original Lemonade");
			System.out.println(
					"***********Scenario0106 PASS: Correct ala carte price of Refill Large Original Lemonade.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refill Large Original Lemonade."
					+ " Expected Price: " + b.read_Refil_Large_Original_Lemonade_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario0106 FAIL: Incorrect ala carte price of Refill Large Original Lemonade.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 107)
	public void sikuliTestCase107(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_107: Verify Small Strawberry Lemonade Price. " + "Region Id: " + b.read_Region_Id());

		s.wait(IcedBeverages, 500);
		s.click(IcedBeverages);
		s.wait(Frozen_Lemonade, 500);
		s.click(Frozen_Lemonade);
		s.wait(Strawberry_Lemonade, 500);
		s.click(Strawberry_Lemonade.similar((float) 0.8));
		s.wait(Small_Strawberry_Lemonade, 300);
		s.click(Small_Strawberry_Lemonade);

		testcase.log(Status.PASS, "User able to click on Small Strawberry Lemonade");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 205, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Small_Strawberry_Lemonade_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Small_Strawberry_Lemonade_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		// System.out.println(imageText);

		// System.out.println(b.read_Small_Strawberry_Lemonade_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Small_Strawberry_Lemonade_Price();

		System.out.println("Price from picture in POS: " + a1);
		System.out.println("Price from pricing sheet: " + a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Small Strawberry Lemonade");

			System.out.println(
					"***********Scenario0107 PASS: Correct ala carte price of Small Strawberry Lemonade.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Small Strawberry Lemonade." + " Expected Price: "
					+ b.read_Small_Strawberry_Lemonade_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario0107 FAIL: Incorrect ala carte price of Small Strawberry Lemonade.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 108)
	public void sikuliTestCase108(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_108: Verify Medium Strawberry Lemonade Price. " + "Region Id: " + b.read_Region_Id());

		s.wait(IcedBeverages, 500);
		s.click(IcedBeverages);
		s.wait(Frozen_Lemonade, 500);
		s.click(Frozen_Lemonade);
		s.wait(Strawberry_Lemonade, 500);
		s.click(Strawberry_Lemonade.similar((float) 0.8));
		s.wait(Medium_Strawberry_Lemonade, 300);
		s.click(Medium_Strawberry_Lemonade);

		testcase.log(Status.PASS, "User able to click on Medium Strawberry Lemonade");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 205, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Medium_Strawberry_Lemonade_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Medium_Strawberry_Lemonade_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		// System.out.println(imageText);

		// System.out.println(b.read_Medium_Strawberry_Lemonade_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Medium_Strawberry_Lemonade_Price();

		System.out.println("Price from picture in POS: " + a1);
		System.out.println("Price from pricing sheet: " + a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Medium Strawberry Lemonade");

			System.out.println(
					"***********Scenario0108 PASS: Correct ala carte price of Medium Strawberry Lemonade.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium Strawberry Lemonade." + " Expected Price: "
					+ b.read_Medium_Strawberry_Lemonade_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario0108 FAIL: Incorrect ala carte price of Medium Strawberry Lemonade.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 109)
	public void sikuliTestCase109(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_109: Verify Large Strawberry Lemonade Price. " + "Region Id: " + b.read_Region_Id());

		s.wait(IcedBeverages, 500);
		s.click(IcedBeverages);
		s.wait(Frozen_Lemonade, 500);
		s.click(Frozen_Lemonade);
		s.wait(Strawberry_Lemonade, 500);
		s.click(Strawberry_Lemonade.similar((float) 0.8));
		s.wait(Large_Strawberry_Lemonade, 500);
		s.click(Large_Strawberry_Lemonade);

		testcase.log(Status.PASS, "User able to click on Large Strawberry Lemonade");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 205, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Large_Strawberry_Lemonade_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Large_Strawberry_Lemonade_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		// System.out.println(imageText);

		// System.out.println(b.read_Large_Strawberry_Lemonade_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Large_Strawberry_Lemonade_Price();

		System.out.println("Price from picture in POS: " + a1);
		System.out.println("Price from pricing sheet: " + a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Large Strawberry Lemonade");

			System.out.println(
					"***********Scenario0109 PASS: Correct ala carte price of Large Strawberry Lemonade.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Strawberry Lemonade." + " Expected Price: "
					+ b.read_Large_Strawberry_Lemonade_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario0109 FAIL: Incorrect ala carte price of Large Strawberry Lemonade.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 110)
	public void sikuliTestCase110(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_110: Verify Refill Small Strawberry Lemonade Price. " + "Region Id: " + b.read_Region_Id());

		s.wait(IcedBeverages, 500);
		s.click(IcedBeverages);
		s.wait(Frozen_Lemonade, 500);
		s.click(Frozen_Lemonade);
		s.wait(Strawberry_Lemonade, 500);
		s.click(Strawberry_Lemonade.similar((float) 0.8));
		s.wait(Refill_Small_Strawberry_Lemonade, 500);
		s.click(Refill_Small_Strawberry_Lemonade);

		testcase.log(Status.PASS, "User able to click on Refill Small Strawberry Lemonade");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Refill_Small_Strawberry_Lemonade_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Refill_Small_Strawberry_Lemonade_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		// System.out.println(imageText);

		// System.out.println(b.read_Refill_Small_Strawberry_Lemonade_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Refill_Small_Strawberry_Lemonade_Price();

		System.out.println("Price from picture in POS: " + a1);
		System.out.println("Price from pricing sheet: " + a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refill Small Strawberry Lemonade");

			System.out.println(
					"***********Scenario0110 PASS: Correct ala carte price of Refill Small Strawberry Lemonade.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refill Small Strawberry Lemonade."
					+ " Expected Price: " + b.read_Refill_Small_Strawberry_Lemonade_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario0110 FAIL: Incorrect ala carte price of Refill Small Strawberry Lemonade.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 111)
	public void sikuliTestCase111(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_111: Verify Refill Medium Strawberry Lemonade Price. " + "Region Id: " + b.read_Region_Id());

		s.wait(IcedBeverages, 500);
		s.click(IcedBeverages);
		s.wait(Frozen_Lemonade, 500);
		s.click(Frozen_Lemonade);
		s.wait(Strawberry_Lemonade, 500);
		s.click(Strawberry_Lemonade.similar((float) 0.8));
		s.wait(Refill_Medium_Strawberry_Lemonade, 500);
		s.click(Refill_Medium_Strawberry_Lemonade);

		testcase.log(Status.PASS, "User able to click on Refill Medium Strawberry Lemonade");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Refill_Medium_Strawberry_Lemonade_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Refill_Medium_Strawberry_Lemonade_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		// System.out.println(imageText);

		// System.out.println(b.read_Refill_Medium_Strawberry_Lemonade_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Refill_Medium_Strawberry_Lemonade_Price();

		System.out.println("Price from picture in POS: " + a1);
		System.out.println("Price from pricing sheet: " + a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refill Medium Strawberry Lemonade");

			System.out.println(
					"***********Scenario0111 PASS: Correct ala carte price of Refill Medium Strawberry Lemonade.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refill Medium Strawberry Lemonade."
					+ " Expected Price: " + b.read_Refill_Medium_Strawberry_Lemonade_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario0111 FAIL: Incorrect ala carte price of Refill Medium Strawberry Lemonade.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 112)
	public void sikuliTestCase112(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException {
		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_112: Verify Refill Large Strawberry Lemonade Price. " + "Region Id: " + b.read_Region_Id());

		s.wait(IcedBeverages, 500);
		s.click(IcedBeverages);
		s.wait(Frozen_Lemonade, 500);
		s.click(Frozen_Lemonade);
		s.wait(Strawberry_Lemonade, 500);
		s.click(Strawberry_Lemonade.similar((float) 0.8));
		s.wait(Refill_Large_Strawberry_Lemonade, 500);
		s.click(Refill_Large_Strawberry_Lemonade);

		testcase.log(Status.PASS, "User able to click on Refill Large Strawberry Lemonade");

		s.wait(EatIn, 300);
		s.click(EatIn.similar((float) 0.8));
		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(4000);
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Refill_Large_Strawberry_Lemonade_Price");
		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"Refill_Large_Strawberry_Lemonade_Price_Withname");

		ITesseract image = new Tesseract();
		image.setDatapath(".\\tessdata");
		String imageText = image.doOCR(new File(imagePath));
		// System.out.println(imageText);

		// System.out.println(b.read_Refill_Large_Strawberry_Lemonade_Price());
		String a1 = null;
		String a2 = null;

		// Price validation
		String replaceAll = imageText.replaceAll("\\s", "");
		a1 = replaceAll;

		a2 = b.read_Refill_Large_Strawberry_Lemonade_Price();

		System.out.println("Price from picture in POS: " + a1);
		System.out.println("Price from pricing sheet: " + a2);

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refill Large Strawberry Lemonade");

			System.out.println(
					"***********Scenario0112 PASS: Correct ala carte price of Refill Large Strawberry Lemonade.  ***********");

		} else {

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refill Large Strawberry Lemonade."
					+ " Expected Price: " + b.read_Refill_Large_Strawberry_Lemonade_Price());

			testcase.addScreenCaptureFromPath(pricewithname);
			System.out.println(
					"***********Scenario0112 FAIL: Incorrect ala carte price of Refill Large Strawberry Lemonade.***********");

		}

		s.wait(VoidItem, 300);
		s.click(VoidItem.similar((float) 0.5));
	}

	@Test(priority = 113)

	public void sikuliTestCase113(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_113:Verify Small Fruit Smoothie Strawberry Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(FruitSmoothie, 300);

		s.click(FruitSmoothie);

		s.wait(FruitSmoothieStrawberry, 300);

		s.click(FruitSmoothieStrawberry);

		s.wait(SmallFruitSmoothieStrawberry, 300);

		s.click(SmallFruitSmoothieStrawberry);

		testcase.log(Status.PASS, "User able to click on Small Fruit Smoothie Strawberry");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallFruitSmoothieStrawberryPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallFruitSmoothieStrawberryPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Small_Fruit_Smoothie_Strawberry_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Small_Fruit_Smoothie_Strawberry_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Small Fruit Smoothie Strawberry ");

			System.out.println(
					"***********Scenario113 PASS: Correct ala carte price of Small Fruit Smoothie Strawberry ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Small Fruit Smoothie Strawberry. "
					+ "Expected Price: " + read_Small_Fruit_Smoothie_Strawberry_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario113 FAIL: Incorrect ala carte price of Small Fruit Smoothie Strawberry ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 114)

	public void sikuliTestCase114(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_114:Verify Medium Fruit Smoothie Strawberry Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(FruitSmoothie, 300);

		s.click(FruitSmoothie);

		s.wait(FruitSmoothieStrawberry, 300);

		s.click(FruitSmoothieStrawberry);

		s.wait(MediumFruitSmoothieStrawberry, 300);

		s.click(MediumFruitSmoothieStrawberry);

		testcase.log(Status.PASS, "User able to click on Medium Fruit Smoothie Strawberry");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumFruitSmoothieStrawberryPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumFruitSmoothieStrawberryPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Medium_Fruit_Smoothie_Strawberry_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Medium_Fruit_Smoothie_Strawberry_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Medium Fruit Smoothie Strawberry ");

			System.out.println(
					"***********Scenario114 PASS: Correct ala carte price of Medium Fruit Smoothie Strawberry ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium Fruit Smoothie Strawberry. "
					+ "Expected Price: " + read_Medium_Fruit_Smoothie_Strawberry_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario114 FAIL: Incorrect ala carte price of Medium Fruit Smoothie Strawberry ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 115)

	public void sikuliTestCase115(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_115:Verify Large Fruit Smoothie Strawberry Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(FruitSmoothie, 300);

		s.click(FruitSmoothie);

		s.wait(FruitSmoothieStrawberry, 300);

		s.click(FruitSmoothieStrawberry);

		s.wait(LargeFruitSmoothieStrawberry, 300);

		s.click(LargeFruitSmoothieStrawberry);

		testcase.log(Status.PASS, "User able to click on Large Fruit Smoothie Strawberry");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeFruitSmoothieStrawberryPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeFruitSmoothieStrawberryPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Large_Fruit_Smoothie_Strawberry_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Large_Fruit_Smoothie_Strawberry_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Large Fruit Smoothie Strawberry ");

			System.out.println(
					"***********Scenario115 PASS: Correct ala carte price of Large Fruit Smoothie Strawberry ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Fruit Smoothie Strawberry. "
					+ "Expected Price: " + read_Large_Fruit_Smoothie_Strawberry_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario115 FAIL: Incorrect ala carte price of Large Fruit Smoothie Strawberry ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 116)

	public void sikuliTestCase116(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_116:Verify Refil Small Fruit Smoothie Strawberry Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(FruitSmoothie, 300);

		s.click(FruitSmoothie);

		s.wait(FruitSmoothieStrawberry, 300);

		s.click(FruitSmoothieStrawberry);

		s.wait(RefilSmallFruitSmoothieStrawberry, 300);

		s.click(RefilSmallFruitSmoothieStrawberry);

		testcase.log(Status.PASS, "User able to click on Refil Small Fruit Smoothie Strawberry");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilSmallFruitSmoothieStrawberryPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilSmallFruitSmoothieStrawberryPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Small_Fruit_Smoothie_Strawberry_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Small_Fruit_Smoothie_Strawberry_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Small Fruit Smoothie Strawberry ");

			System.out.println(
					"***********Scenario116 PASS: Correct ala carte price of Refil Small Fruit Smoothie Strawberry ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Small Fruit Smoothie Strawberry. "
					+ "Expected Price: " + read_Refil_Small_Fruit_Smoothie_Strawberry_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario116 FAIL: Incorrect ala carte price of Refil Small Fruit Smoothie Strawberry ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 117)

	public void sikuliTestCase117(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_117:Verify Refil Medium Fruit Smoothie Strawberry Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(FruitSmoothie, 300);

		s.click(FruitSmoothie);

		s.wait(FruitSmoothieStrawberry, 300);

		s.click(FruitSmoothieStrawberry);

		s.wait(RefilMediumFruitSmoothieStrawberry, 300);

		s.click(RefilMediumFruitSmoothieStrawberry);

		testcase.log(Status.PASS, "User able to click on Refil Medium Fruit Smoothie Strawberry");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilMediumFruitSmoothieStrawberryPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilMediumFruitSmoothieStrawberryPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Medium_Fruit_Smoothie_Strawberry_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Medium_Fruit_Smoothie_Strawberry_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Medium Fruit Smoothie Strawberry ");

			System.out.println(
					"***********Scenario117 PASS: Correct ala carte price of Refil Medium Fruit Smoothie Strawberry ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Medium Fruit Smoothie Strawberry. "
					+ "Expected Price: " + read_Refil_Medium_Fruit_Smoothie_Strawberry_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario117 FAIL: Incorrect ala carte price of Refil Medium Fruit Smoothie Strawberry ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 118)

	public void sikuliTestCase118(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest(
				"TC_118:Verify Refil Large Fruit Smoothie Strawberry Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(FruitSmoothie, 300);

		s.click(FruitSmoothie);

		s.wait(FruitSmoothieStrawberry, 300);

		s.click(FruitSmoothieStrawberry);

		s.wait(RefilLargeFruitSmoothieStrawberry, 300);

		s.click(RefilLargeFruitSmoothieStrawberry);

		testcase.log(Status.PASS, "User able to click on Refil Large Fruit Smoothie Strawberry");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 60, 30);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilLargeFruitSmoothieStrawberryPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilLargeFruitSmoothieStrawberryPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Large_Fruit_Smoothie_Strawberry_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Large_Fruit_Smoothie_Strawberry_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Large Fruit Smoothie Strawberry ");

			System.out.println(
					"***********Scenario118 PASS: Correct ala carte price of Refil Large Fruit Smoothie Strawberry ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Large Fruit Smoothie Strawberry. "
					+ "Expected Price: " + read_Refil_Large_Fruit_Smoothie_Strawberry_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario118 FAIL: Incorrect ala carte price of Refil Large Fruit Smoothie Strawberry ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 119)

	public void sikuliTestCase119(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_119:Verify Small Classic Lemonade Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(Quenchers, 300);

		s.click(Quenchers);

		s.wait(ClassicLemonade, 300);

		s.click(ClassicLemonade);
		Thread.sleep(2000);

		s.wait(SmallClassicLemonade, 300);

		s.click(SmallClassicLemonade);

		testcase.log(Status.PASS, "User able to click on Small Classic Lemonade");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallClassicLemonadePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallClassicLemonadePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Small_Classic_Lemonade_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Small_Classic_Lemonade_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Small Classic Lemonade ");

			System.out.println(
					"***********Scenario119 PASS: Correct ala carte price of Small Classic Lemonade ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Small Classic Lemonade. " + "Expected Price: "
					+ read_Small_Classic_Lemonade_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario119 FAIL: Incorrect ala carte price of Small Classic Lemonade ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 120)

	public void sikuliTestCase120(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_120:Verify Medium Classic Lemonade Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(Quenchers, 300);

		s.click(Quenchers);

		s.wait(ClassicLemonade, 300);

		s.click(ClassicLemonade);
		Thread.sleep(2000);

		s.wait(MediumClassicLemonade, 300);

		s.click(MediumClassicLemonade);

		testcase.log(Status.PASS, "User able to click on Medium Classic Lemonade");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 205, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumClassicLemonadePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumClassicLemonadePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Medium_Classic_Lemonade_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Medium_Classic_Lemonade_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Medium Classic Lemonade ");

			System.out.println(
					"***********Scenario120 PASS: Correct ala carte price of Medium Classic Lemonade ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium Classic Lemonade. " + "Expected Price: "
					+ read_Medium_Classic_Lemonade_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario120 FAIL: Incorrect ala carte price of Medium Classic Lemonade ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 121)

	public void sikuliTestCase121(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_121:Verify Large Classic Lemonade Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(Quenchers, 300);

		s.click(Quenchers);

		s.wait(ClassicLemonade, 300);

		s.click(ClassicLemonade);
		Thread.sleep(2000);

		s.wait(LargeClassicLemonade, 300);

		s.click(LargeClassicLemonade);

		testcase.log(Status.PASS, "User able to click on Large Classic Lemonade");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 205, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeClassicLemonadePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeClassicLemonadePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Large_Classic_Lemonade_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Large_Classic_Lemonade_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Large Classic Lemonade ");

			System.out.println(
					"***********Scenario121 PASS: Correct ala carte price of Large Classic Lemonade ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Classic Lemonade. " + "Expected Price: "
					+ read_Large_Classic_Lemonade_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario121 FAIL: Incorrect ala carte price of Large Classic Lemonade ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 122)

	public void sikuliTestCase122(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_122:Verify Refil Small Classic Lemonade Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(Quenchers, 300);

		s.click(Quenchers);

		s.wait(ClassicLemonade, 300);

		s.click(ClassicLemonade);

		Thread.sleep(2000);

		s.wait(RefilSmallClassicLemonade, 300);

		s.click(RefilSmallClassicLemonade);

		testcase.log(Status.PASS, "User able to click on Refil Small Classic Lemonade");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilSmallClassicLemonadePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilSmallClassicLemonadePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Small_Classic_Lemonade_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Small_Classic_Lemonade_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Small Classic Lemonade ");

			System.out.println(
					"***********Scenario122 PASS: Correct ala carte price of Refil Small Classic Lemonade ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Small Classic Lemonade. "
					+ "Expected Price: " + read_Refil_Small_Classic_Lemonade_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario122 FAIL: Incorrect ala carte price of Refil Small Classic Lemonade ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 123)

	public void sikuliTestCase123(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_123:Verify Refil Medium Classic Lemonade Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(Quenchers, 300);

		s.click(Quenchers);

		s.wait(ClassicLemonade, 300);

		s.click(ClassicLemonade);
		Thread.sleep(2000);

		s.wait(RefilMediumClassicLemonade, 300);

		s.click(RefilMediumClassicLemonade);

		testcase.log(Status.PASS, "User able to click on Refil Medium Classic Lemonade");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 205, 65, 35);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilMediumClassicLemonadePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilMediumClassicLemonadePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Medium_Classic_Lemonade_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Medium_Classic_Lemonade_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Medium Classic Lemonade ");

			System.out.println(
					"***********Scenario123 PASS: Correct ala carte price of Refil Medium Classic Lemonade ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Medium Classic Lemonade. "
					+ "Expected Price: " + read_Refil_Medium_Classic_Lemonade_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario123 FAIL: Incorrect ala carte price of Refil Medium Classic Lemonade ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 124)

	public void sikuliTestCase124(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_124:Verify Refil Large Classic Lemonade Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(Quenchers, 300);

		s.click(Quenchers);

		s.wait(ClassicLemonade, 300);

		s.click(ClassicLemonade);
		Thread.sleep(2000);

		s.wait(RefilLargeClassicLemonade, 300);

		s.click(RefilLargeClassicLemonade);

		testcase.log(Status.PASS, "User able to click on Refil Large Classic Lemonade");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilLargeClassicLemonadePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilLargeClassicLemonadePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Large_Classic_Lemonade_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Large_Classic_Lemonade_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Large Classic Lemonade ");

			System.out.println(
					"***********Scenario124 PASS: Correct ala carte price of Refil Large Classic Lemonade ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Large Classic Lemonade. "
					+ "Expected Price: " + read_Refil_Large_Classic_Lemonade_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario124 FAIL: Incorrect ala carte price of Refil Large Classic Lemonade ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 125)

	public void sikuliTestCase125(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_125:Verify Small Baileys Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(FlavouredIcedCappuccino, 300);

		s.click(FlavouredIcedCappuccino);

		s.wait(BaileysIcedCapp, 300);

		s.click(BaileysIcedCapp);

		Thread.sleep(3000);

		s.wait(SmallBaileysIcedCapp, 300);

		s.click(SmallBaileysIcedCapp);

		testcase.log(Status.PASS, "User able to click on Small Baileys Iced Capp");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallBaileysIcedCappPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SmallBaileysIcedCappPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Small_Baileys_Iced_Capp_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Small_Baileys_Iced_Capp_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Small Baileys Iced Capp ");

			System.out.println(
					"***********Scenario125 PASS: Correct ala carte price of Small Baileys Iced Capp ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Small Baileys Iced Capp. " + "Expected Price: "
					+ read_Small_Baileys_Iced_Capp_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario125 FAIL: Incorrect ala carte price of Small Baileys Iced Capp ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 126)

	public void sikuliTestCase126(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_126:Verify Medium Baileys Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(FlavouredIcedCappuccino, 300);

		s.click(FlavouredIcedCappuccino);

		s.wait(BaileysIcedCapp, 300);

		s.click(BaileysIcedCapp);

		s.wait(MediumBaileysIcedCapp, 300);

		s.click(MediumBaileysIcedCapp);

		testcase.log(Status.PASS, "User able to click on Medium Baileys Iced Capp");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumBaileysIcedCappPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MediumBaileysIcedCappPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Medium_Baileys_Iced_Capp_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Medium_Baileys_Iced_Capp_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Medium Baileys Iced Capp ");

			System.out.println(
					"***********Scenario126 PASS: Correct ala carte price of Medium Baileys Iced Capp ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium Baileys Iced Capp. " + "Expected Price: "
					+ read_Medium_Baileys_Iced_Capp_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario126 FAIL: Incorrect ala carte price of Medium Baileys Iced Capp ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 127)

	public void sikuliTestCase127(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_127:Verify Large Baileys Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(FlavouredIcedCappuccino, 300);

		s.click(FlavouredIcedCappuccino);

		s.wait(BaileysIcedCapp, 300);

		s.click(BaileysIcedCapp);

		Thread.sleep(3000);
		s.wait(LargeBaileysIcedCapp, 300);

		s.click(LargeBaileysIcedCapp);

		testcase.log(Status.PASS, "User able to click on Large Baileys Iced Capp");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeBaileysIcedCappPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LargeBaileysIcedCappPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Large_Baileys_Iced_Capp_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Large_Baileys_Iced_Capp_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Large Baileys Iced Capp ");

			System.out.println(
					"***********Scenario127 PASS: Correct ala carte price of Large Baileys Iced Capp ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Baileys Iced Capp. " + "Expected Price: "
					+ read_Large_Baileys_Iced_Capp_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario127 FAIL: Incorrect ala carte price of Large Baileys Iced Capp ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 128)

	public void sikuliTestCase128(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_128:Verify Refil Small Baileys Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(FlavouredIcedCappuccino, 300);

		s.click(FlavouredIcedCappuccino);

		s.wait(BaileysIcedCapp, 300);

		s.click(BaileysIcedCapp);

		Thread.sleep(2000);

		s.wait(RefilSmallBaileysIcedCapp, 300);

		s.click(RefilSmallBaileysIcedCapp);

		testcase.log(Status.PASS, "User able to click on Refil Small Baileys Iced Capp");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilSmallBaileysIcedCappPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilSmallBaileysIcedCappPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Small_Baileys_Iced_Capp_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Small_Baileys_Iced_Capp_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Small Baileys Iced Capp ");

			System.out.println(
					"***********Scenario128 PASS: Correct ala carte price of Refil Small Baileys Iced Capp ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Small Baileys Iced Capp. "
					+ "Expected Price: " + read_Refil_Small_Baileys_Iced_Capp_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario128 FAIL: Incorrect ala carte price of Refil Small Baileys Iced Capp ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 129)

	public void sikuliTestCase129(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_129:Verify Refil Medium Baileys Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(FlavouredIcedCappuccino, 300);

		s.click(FlavouredIcedCappuccino);

		s.wait(BaileysIcedCapp, 300);

		s.click(BaileysIcedCapp);

		Thread.sleep(2500);

		s.wait(RefilMediumBaileysIcedCapp, 300);

		s.click(RefilMediumBaileysIcedCapp);

		testcase.log(Status.PASS, "User able to click on Refil Medium Baileys Iced Capp");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilMediumBaileysIcedCappPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilMediumBaileysIcedCappPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Medium_Baileys_Iced_Capp_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Medium_Baileys_Iced_Capp_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Medium Baileys Iced Capp ");

			System.out.println(
					"***********Scenario129 PASS: Correct ala carte price of Refil Medium Baileys Iced Capp ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Medium Baileys Iced Capp. "
					+ "Expected Price: " + read_Refil_Medium_Baileys_Iced_Capp_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario129 FAIL: Incorrect ala carte price of Refil Medium Baileys Iced Capp ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 130)

	public void sikuliTestCase130(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent
				.createTest("TC_130:Verify Refil Large Baileys Iced Capp Price. " + "Region Id:" + b.read_Region_Id());

//	s.wait(Beverages1,300); 
//
//	s.click(Beverages1); 

		s.wait(IcedBeverages, 300);

		s.click(IcedBeverages);

		s.wait(FlavouredIcedCappuccino, 300);

		s.click(FlavouredIcedCappuccino);

		s.wait(BaileysIcedCapp, 300);

		s.click(BaileysIcedCapp);

		s.wait(RefilLargeBaileysIcedCapp, 300);

		s.click(RefilLargeBaileysIcedCapp);

		testcase.log(Status.PASS, "User able to click on Refil Large Baileys Iced Capp");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilLargeBaileysIcedCappCappPrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RefilLargeBaileysIcedCappPricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_Refil_Large_Baileys_Iced_Capp_Price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_Refil_Large_Baileys_Iced_Capp_Price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Large Baileys Iced Capp ");

			System.out.println(
					"***********Scenario130 PASS: Correct ala carte price of Refil Large Baileys Iced Capp ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Large Baileys Iced Capp. "
					+ "Expected Price: " + read_Refil_Large_Baileys_Iced_Capp_Price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario130 FAIL: Incorrect ala carte price of Refil Large Baileys Iced Capp ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}


	@Test(priority = 131)

	public void sikuliTestCase131(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest("TC_131:Verify Small Hot Chocolate Price. " + "Region Id:" + b.read_Region_Id());

		s.wait(Beverages1, 300);

		s.click(Beverages1);

		s.wait(HotChocolate, 300);

		s.click(HotChocolate);

		s.wait(SmallHotChocolate, 300);

		s.click(SmallHotChocolate);

		testcase.log(Status.PASS, "User able to click on Small Hot Chocolate");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SMHotChocolatePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SMHotChocolatePricePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_SMHotChocolate_price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_SMHotChocolate_price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Small Hot Chocolate ");

			System.out.println(
					"***********Scenario131 PASS: Correct ala carte price of Small Hot Chocolate ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Small Hot Chocolate "
					+ "Expected Price: " + read_SMHotChocolate_price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario131 FAIL: Incorrect ala carte price of Small Hot Chocolate ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 132)

	public void sikuliTestCase132(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest("TC_132:Verify Medium Hot Chocolate Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//		s.click(Beverages1);

		s.wait(HotChocolate, 300);

		s.click(HotChocolate);

		s.wait(MediumHotChocolate, 300);

		s.click(MediumHotChocolate);

		testcase.log(Status.PASS, "User able to click on Medium Hot Chocolate");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MDHotChocolatePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MDHotChocolatePricePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_MDHotChocolate_price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_MDHotChocolate_price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Medium Hot Chocolate ");

			System.out.println(
					"***********Scenario132 PASS: Correct ala carte price of Medium Hot Chocolate ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium Hot Chocolate "
					+ "Expected Price: " + read_MDHotChocolate_price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario132 FAIL: Incorrect ala carte price of Medium Hot Chocolate ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}
	
	@Test(priority = 133)

	public void sikuliTestCase133(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest("TC_133:Verify Large Hot Chocolate Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//		s.click(Beverages1);

		s.wait(HotChocolate, 300);

		s.click(HotChocolate);

		s.wait(LargeHotChocolate, 300);

		s.click(LargeHotChocolate);

		testcase.log(Status.PASS, "User able to click on Large Hot Chocolate");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LGHotChocolatePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LGHotChocolatePricePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_LGHotChocolate_price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_LGHotChocolate_price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Large Hot Chocolate ");

			System.out.println(
					"***********Scenario133 PASS: Correct ala carte price of Large Hot Chocolate ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Large Hot Chocolate "
					+ "Expected Price: " + read_LGHotChocolate_price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario133 FAIL: Incorrect ala carte price of Large Hot Chocolate ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 134)

	public void sikuliTestCase134(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest("TC_134:Verify Refil Small Hot Chocolate Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//		s.click(Beverages1);

		s.wait(HotChocolate, 300);

		s.click(HotChocolate);

		s.wait(Refil_Small_Hot_Chocolate, 300);

		s.click(Refil_Small_Hot_Chocolate);

		testcase.log(Status.PASS, "User able to click on Refil Small Hot Chocolate");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RSHotChocolatePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RSHotChocolatePricePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_RSHotChocolate_price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_RSHotChocolate_price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Small Hot Chocolate ");

			System.out.println(
					"***********Scenario134 PASS: Correct ala carte price of Refil Small Hot Chocolate ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Small Hot Chocolate "
					+ "Expected Price: " + read_RSHotChocolate_price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario134 FAIL: Incorrect ala carte price of Refil Small Hot Chocolate ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}

	@Test(priority = 135)

	public void sikuliTestCase135(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest("TC_135:Verify Refil Medium Hot Chocolate Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//		s.click(Beverages1);

		s.wait(HotChocolate, 300);

		s.click(HotChocolate);

		s.wait(Refil_Medium_Hot_Chocolate, 300);

		s.click(Refil_Medium_Hot_Chocolate);

		testcase.log(Status.PASS, "User able to click on Refil Medium Hot Chocolate");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RMHotChocolatePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RMHotChocolatePricePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_RMHotChocolate_price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_RMHotChocolate_price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Medium Hot Chocolate ");

			System.out.println(
					"***********Scenario135 PASS: Correct ala carte price of Refil Medium Hot Chocolate ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Medium Hot Chocolate "
					+ "Expected Price: " + read_RMHotChocolate_price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario135 FAIL: Incorrect ala carte price of Refil Medium Hot Chocolate ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}
	
	@Test(priority = 136)

	public void sikuliTestCase136(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest("TC_136:Verify Refil Large Hot Chocolate Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//		s.click(Beverages1);

		s.wait(HotChocolate, 300);

		s.click(HotChocolate);

		s.wait(Refil_Large_Hot_Chocolate, 300);

		s.click(Refil_Large_Hot_Chocolate);

		testcase.log(Status.PASS, "User able to click on Refil Large Hot Chocolate");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RLHotChocolatePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RLHotChocolatePricePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_RLHotChocolate_price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_RLHotChocolate_price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Large Hot Chocolate ");

			System.out.println(
					"***********Scenario136 PASS: Correct ala carte price of Refil Large Hot Chocolate ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Large Hot Chocolate "
					+ "Expected Price: " + read_RLHotChocolate_price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario136 FAIL: Incorrect ala carte price of Refil Large Hot Chocolate ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}
	
	@Test(priority = 137)

	public void sikuliTestCase137(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest("TC_137:Verify Extra Large Hot Chocolate Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//		s.click(Beverages1);

		s.wait(HotChocolate, 300);

		s.click(HotChocolate);

		s.wait(ExtraLargeHotChocolate, 300);

		s.click(ExtraLargeHotChocolate);

		testcase.log(Status.PASS, "User able to click on Extra Large Hot Chocolate");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"XLHotChocolatePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"XLHotChocolatePricePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_XLHotChocolate_price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_XLHotChocolate_price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Extra Large Hot Chocolate ");

			System.out.println(
					"***********Scenario137 PASS: Correct ala carte price of Extra Large Hot Chocolate ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Extra Large Hot Chocolate "
					+ "Expected Price: " + read_XLHotChocolate_price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario137 FAIL: Incorrect ala carte price of Extra Large Hot Chocolate ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}
	
	@Test(priority = 138)

	public void sikuliTestCase138(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest("TC_138:Verify Refil Extra Large Hot Chocolate Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//		s.click(Beverages1);

		s.wait(HotChocolate, 300);

		s.click(HotChocolate);

		s.wait(Refil_XL_Hot_Chocolate, 300);

		s.click(Refil_XL_Hot_Chocolate);

		testcase.log(Status.PASS, "User able to click on Refil Extra Large Hot Chocolate");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RXLHotChocolatePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RXLHotChocolatePricePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_RXLHotChocolate_price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_RXLHotChocolate_price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Extra Large Hot Chocolate ");

			System.out.println(
					"***********Scenario138 PASS: Correct ala carte price of Refil Extra Large Hot Chocolate ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Extra Large Hot Chocolate "
					+ "Expected Price: " + read_RXLHotChocolate_price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario138 FAIL: Incorrect ala carte price of Refil Extra Large Hot Chocolate ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}
	
	@Test(priority = 139)

	public void sikuliTestCase139(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest("TC_139:Verify SS Thermos Hot Chocolate Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//		s.click(Beverages1);

		s.wait(HotChocolate, 300);

		s.click(HotChocolate);

		s.wait(SS_Thermos_HotChocolate, 300);

		s.click(SS_Thermos_HotChocolate);

		testcase.log(Status.PASS, "User able to click on SS Thermos Hot Chocolate");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SSHotChocolatePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SSHotChocolatePricePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_SSHotChocolate_price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_SSHotChocolate_price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of SS Thermos Hot Chocolate ");

			System.out.println(
					"***********Scenario139 PASS: Correct ala carte price of SS Thermos Hot Chocolate ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of SS Thermos Hot Chocolate "
					+ "Expected Price: " + read_SSHotChocolate_price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario139 FAIL: Incorrect ala carte price of SS Thermos Hot Chocolate ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}
	
	@Test(priority = 140)

	public void sikuliTestCase140(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest("TC_140:Verify BR Thermos Hot Chocolate Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//		s.click(Beverages1);

		s.wait(HotChocolate, 300);

		s.click(HotChocolate);

		s.wait(BR_Thermos_HotChocolate, 300);

		s.click(BR_Thermos_HotChocolate);

		testcase.log(Status.PASS, "User able to click on BR Thermos Hot Chocolate");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"BRHotChocolatePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"BRHotChocolatePricePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_BRHotChocolate_price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_BRHotChocolate_price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of BR Thermos Hot Chocolate ");

			System.out.println(
					"***********Scenario140 PASS: Correct ala carte price of BR Thermos Hot Chocolate ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of BR Thermos Hot Chocolate "
					+ "Expected Price: " + read_BRHotChocolate_price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario140 FAIL: Incorrect ala carte price of BR Thermos Hot Chocolate ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}
	
	@Test(priority = 141)

	public void sikuliTestCase141(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest("TC_141:Verify Take 12 Hot Chocolate Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//		s.click(Beverages1);

		s.wait(HotChocolate, 300);

		s.click(HotChocolate);

		s.wait(Take12_HotChocolate, 300);

		s.click(Take12_HotChocolate);

		testcase.log(Status.PASS, "User able to click on Take 12 Hot Chocolate");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"T12HotChocolatePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"T12HotChocolatePricePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_T12HotChocolate_price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_T12HotChocolate_price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Take 12 Hot Chocolate ");

			System.out.println(
					"***********Scenario141 PASS: Correct ala carte price of Take 12 Hot Chocolate ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Take 12 Hot Chocolate "
					+ "Expected Price: " + read_T12HotChocolate_price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario141 FAIL: Incorrect ala carte price of Take 12 Hot Chocolate ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}
	
	@Test(priority = 142)

	public void sikuliTestCase142(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest("TC_142:Verify Small White Hot Chocolate Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//		s.click(Beverages1);

		s.wait(White_Hot_Chocolate, 300);

		s.click(White_Hot_Chocolate);

		s.wait(SM_White_Chocolate, 300);

		s.click(SM_White_Chocolate);

		testcase.log(Status.PASS, "User able to click on Small White Hot Chocolate");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SMWHotChocolatePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"SMWHotChocolatePricePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_SM_White_HotChocolate_price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_SM_White_HotChocolate_price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Small White Hot Chocolate ");

			System.out.println(
					"***********Scenario142 PASS: Correct ala carte price of Small White Hot Chocolate ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Small White Hot Chocolate "
					+ "Expected Price: " + read_T12HotChocolate_price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario142 FAIL: Incorrect ala carte price of Small White Hot Chocolate ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}
	
	@Test(priority = 143)

	public void sikuliTestCase143(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest("TC_143:Verify Medium White Hot Chocolate Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//		s.click(Beverages1);

		s.wait(White_Hot_Chocolate, 300);

		s.click(White_Hot_Chocolate);

		s.wait(MD_White_HotChocolate, 300);

		s.click(MD_White_HotChocolate);

		testcase.log(Status.PASS, "User able to click on Medium White Hot Chocolate");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MDWHotChocolatePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"MDWHotChocolatePricePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_MD_White_HotChocolate_price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_MD_White_HotChocolate_price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Medium White Hot Chocolate ");

			System.out.println(
					"***********Scenario143 PASS: Correct ala carte price of Medium White Hot Chocolate ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Medium White Hot Chocolate "
					+ "Expected Price: " + read_MD_White_HotChocolate_price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario143 FAIL: Incorrect ala carte price of Medium White Hot Chocolate ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}
	
	@Test(priority = 144)

	public void sikuliTestCase144(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest("TC_144:Verify Large White Hot Chocolate Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//		s.click(Beverages1);

		s.wait(White_Hot_Chocolate, 300);

		s.click(White_Hot_Chocolate);

		s.wait(LG_White_HotChocolate, 300);

		s.click(LG_White_HotChocolate);

		testcase.log(Status.PASS, "User able to click on Large White Hot Chocolate");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LGWHotChocolatePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"LGWHotChocolatePricePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_LG_White_HotChocolate_price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_LG_White_HotChocolate_price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Large White Hot Chocolate ");

			System.out.println(
					"***********Scenario144 PASS: Correct ala carte price of Large White Hot Chocolate ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Large White Hot Chocolate "
					+ "Expected Price: " + read_LG_White_HotChocolate_price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario144 FAIL: Incorrect ala carte price of Large White Hot Chocolate ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}
	
	@Test(priority = 145)

	public void sikuliTestCase145(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest("TC_145:Verify Extra Large White Hot Chocolate Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//		s.click(Beverages1);

		s.wait(White_Hot_Chocolate, 300);

		s.click(White_Hot_Chocolate);

		s.wait(XL_White_HotChocolate, 300);

		s.click(XL_White_HotChocolate);

		testcase.log(Status.PASS, "User able to click on Extra Large White Hot Chocolate");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"XLWHotChocolatePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"XLWHotChocolatePricePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_XL_White_HotChocolate_price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_XL_White_HotChocolate_price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Extra Large White Hot Chocolate ");

			System.out.println(
					"***********Scenario145 PASS: Correct ala carte price of Extra Large White Hot Chocolate ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Extra Large White Hot Chocolate "
					+ "Expected Price: " + read_XL_White_HotChocolate_price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario145 FAIL: Incorrect ala carte price of Extra Large White Hot Chocolate ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}
	
	@Test(priority = 146)

	public void sikuliTestCase146(ExtentReports extent, ExtentTest testcase)
			throws FindFailed, IOException, TesseractException, InterruptedException

	{

		BeverageItems b = new BeverageItems(s);

		testcase = extent.createTest("TC_146:Verify Refil Small White Hot Chocolate Price. " + "Region Id:" + b.read_Region_Id());

//		s.wait(Beverages1, 300);
//		s.click(Beverages1);

		s.wait(White_Hot_Chocolate, 300);

		s.click(White_Hot_Chocolate);

		s.wait(RS_White_HotChocolate, 300);

		s.click(RS_White_HotChocolate);

		testcase.log(Status.PASS, "User able to click on Refil Small White Hot Chocolate");

		s.wait(EatIn, 300);

		s.click(EatIn.similar((float) 0.8));

		testcase.log(Status.PASS, "User able to click on Eat In");

		Thread.sleep(7000);

		Rectangle rectangle = new Rectangle();

		rectangle.setBounds(420, 200, 70, 40);

		String imagePath = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RSWHotChocolatePrice");

		rectangle.setBounds(210, 200, 275, 30);

		String pricewithname = capture(rectangle).save(System.getProperty("user.dir") + "/Image/",
				"RSWHotChocolatePricePricewithname");

		System.out.println("price screen shot clicked");

		ITesseract image = new Tesseract();

		image.setDatapath(".\\tessdata");

		String imageText = image.doOCR(new File(imagePath));

		System.out.println("frompic " + imageText);

		System.out.println("fromexcel " + b.read_RS_White_HotChocolate_price());

		String a1 = null;

		String a2 = null;

		String replaceAll = imageText.replaceAll("\\s", "");

		a1 = replaceAll;

		a2 = String.valueOf(b.read_RS_White_HotChocolate_price());

		System.out.println("from pic " + a1);

		System.out.println("from excel " + a2);

		int value = a1.compareTo(a2);

		System.out.println(value);

		if (a1.equals(a2)) {

			System.out.println("same");

		}

		if (a1.equals(a2)) {

			testcase.log(Status.PASS, " Correct ala carte price of Refil Small White Hot Chocolate ");

			System.out.println(
					"***********Scenario146 PASS: Correct ala carte price of Refil Small White Hot Chocolate ***********");

		}

		else

		{

			testcase.log(Status.FAIL, " Incorrect ala carte price of Refil Small White Hot Chocolate "
					+ "Expected Price: " + read_RS_White_HotChocolate_price());

			testcase.addScreenCaptureFromPath(pricewithname);

			System.out.println(
					"***********Scenario146 FAIL: Incorrect ala carte price of Refil Small White Hot Chocolate ***********");

		}

		s.wait(VoidItem, 300);

		s.click(VoidItem.similar((float) 0.5));

	}
	
}
