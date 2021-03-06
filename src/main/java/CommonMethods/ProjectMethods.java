package main.java.CommonMethods;


	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Parameters;

import main.java.Utilities.ExcelDataProvider;


	public class ProjectMethods extends SeMethods{
		
		public String browserName;
		public String dataSheetName;
		public String excelName;
		
		@BeforeSuite
		public void beforeSuite(){
			startResult();
			
		}

		@BeforeTest
		public void beforeTest(){
		}
		
	@BeforeMethod 
		public void beforeMethod(){
			//test = startTestCase(testCaseName, testDescription);
		test.assignCategory(category);
			test.assignAuthor(authors);
			
			//startApp(browserName);
			
		}
			
		@AfterSuite
		public void afterSuite(){
			endResult();
		}

		@AfterTest
		public void afterTest(){
		}
		
	@AfterMethod
		public void afterMethod(){
			endTestcase();
			//endResult();
			if(driver!=null) {
			    closeAllBrowsers();    
			}
				
		}
		
		@DataProvider(name="fetchData",parallel=false)
		public  Object[][] getData(){
			//return ExcelDataProvider.getData(dataSheetName);
			//return ExcelDataProvider.getData(excelName);
			return ExcelDataProvider.getData(excelName,dataSheetName);
		}	
		
	}



