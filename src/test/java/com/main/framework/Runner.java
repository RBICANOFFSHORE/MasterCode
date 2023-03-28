package com.main.framework;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.reports.framework.Report;

import models.Item;
import retry.RetryAnalyserClass;


public class Runner {

	PageObjects ob;
	ExtentReports reports = null;
	ExtentTest test = null;
	Report rep;

	@BeforeClass
	public void setUp()
	{	
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		reports = new ExtentReports(".\\ExtentReports\\Report_"+date+".html", true);
		rep = new Report();
		ob = new PageObjects(reports,rep);
		ob.setupSuite();
	}
	
	
	//,retryAnalyzer = RetryAnalyserClass.class
	@Test(priority=0,description="Validate user is able to login",retryAnalyzer = RetryAnalyserClass.class)
	public void validateLogin() throws Exception
	{


		ob
		.launchUrl(true)
		.enterAppPassword()
		.clickApplyBtn()
		.clickLoginLink()
		.enterEmail()
		.clickSignIn()
		.enterOtp()
		.validateLogin();

		
	}

	@Test(dependsOnMethods="validateLogin",retryAnalyzer = RetryAnalyserClass.class,enabled=true)
	public void selectLocation(){

		ob.clickLocationLink()
		.clickFavAddsLink()
		.clickLocation()
		.clickOrderBtn();

		
	}
	@DataProvider(name="testData")
	public JSONObject[] getItemData(){
		JSONObject[] o = readItemJsonFile("itemsArrayCan"); 
		return o;

	}

	JSONObject itemG =null;
	
	@Test(dataProvider="testData",dependsOnMethods="selectLocation",enabled=true)
	public void fetchItemData(JSONObject item){

		ob
		.clickCategory(item.get("category").toString(),item.get("item_name").toString())
		.clickSubCategory(item.get("sub_category").toString())
		.clickItem()
		.validatePrice(item.get("price").toString())
		.addItemToCart()
		.clickCartIcon()
		.clickCheckoutBtn()
		.getCartPagePrice(item.get("price").toString())
		.clickContinueBtn()
		.clickPlaceSecureOrderbtn()
		.getOrderSummaryPrice(item.get("price").toString());
		
		ob.launchUrl(false)
		.clickHeaderOrderButton();
		
	/*	.clickHomeButton()
		.clickOrderButton()
		.clickLocationFooter()
		.clickFavAddsLink()
		.clickLocation()
		.clickOrderBtn();*/
		
		

	}

	@AfterClass
	public void tearDown(){
		ob.tearDown();
		
	}

	@SuppressWarnings("unchecked")
	public JSONObject[] readItemJsonFile(String filename) 
	{
		//JSON parser object to parse read file
		JSONParser jsonParser = new JSONParser();
		JSONObject[] itemsArray = null;
		try (FileReader reader = new FileReader(".\\TestDataSet\\"+filename+".json"))
		{
			//Read JSON file
			Object obj = jsonParser.parse(reader);

			JSONArray itemsList = (JSONArray) obj;

			itemsArray = new JSONObject[itemsList.size()];
			System.out.println("size is : "+itemsList.size());

			int counter=0;
			for(Object item : itemsList){
				JSONObject item1= (JSONObject) item;

				try {
					//Get employee object within list
					JSONObject itemObject = (JSONObject) item1.get("item");
					itemsArray[counter] = itemObject;
					
					
					String category = (String) itemObject.get("category");    			
					String price = (String) itemObject.get("price");
					String item_name = (String) itemObject.get("item_name");		
					String sub_category = (String) itemObject.get("sub_category");			
					String size = (String) itemObject.get("size");
					String region = (String) itemObject.get("region");
				} catch (Exception e) {

					e.printStackTrace();

				}
				counter++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return itemsArray;
	}

	private static Item parseItems(JSONObject items) 
	{
		try {
			//Get employee object within list
			JSONObject employeeObject = (JSONObject) items.get("item");
			String category = (String) employeeObject.get("category");    			
			String price = (String) employeeObject.get("price");
			String item_name = (String) employeeObject.get("item_name");		
			String sub_category = (String) employeeObject.get("sub_category");			
			String size = (String) employeeObject.get("size");
			String region = (String) employeeObject.get("region");

			return new Item( item_name,size,sub_category,price,category,region);
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}
	}
}
