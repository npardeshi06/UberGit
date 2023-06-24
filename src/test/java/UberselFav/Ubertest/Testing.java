package UberselFav.Ubertest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class  Testing{
	ExtentReports report;
	 ExtentTest test;
 App fav = new App();
 
    @Before
	public void setUp() throws Exception {
		report = new ExtentReports("C:/Reports/extent-report.html");
		test = report.startTest("verify launch browser test");
	fav.openBrowser();
	test.log(LogStatus.INFO, "Browser started");
	fav.openuber();
 }
 
   @Test
	public void test() throws InterruptedException {
		test.log(LogStatus.INFO, "entering favourite");
		
		fav.enterfav("Mehfill Indian Cuisine (Queen St)");
		test.log(LogStatus.INFO, "Selecting Fav");
		fav.clickon();
	    fav.selectfav();
	
	}

	@After
	public void tearDown() throws Exception {
		test.log(LogStatus.INFO, "Browser closed");
		fav.closeBrowser();
		report.endTest(test);
		report.flush();
		
	}

	
		
        
	

}

