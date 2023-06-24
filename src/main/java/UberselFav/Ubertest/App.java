package UberselFav.Ubertest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class App {
   WebDriver driver ; 
   
   @FindBy(xpath = "//input[@class='d0 d3 dd de df dg dh di dj cu bb']")
   public static WebElement enterfav;
   
   @FindBy(xpath = "//div[@class='cg d1 ci d2']")
   public static WebElement clickon;
   
   @FindBy(xpath = "//button[@aria-label='Add to favorites']")
   public static WebElement selectfav;
   
  
    public void openBrowser() {
	   System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
  		driver = new ChromeDriver();
  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    	   //  driver.manage().window().maximize();
    	   PageFactory.initElements(driver, this);
   }
   public void openuber() {
	String baseUrl = "https://www.ubereats.com/ca/feed?diningMode=DELIVERY&pl=JTdCJTIyYWRkcmVzcyUyMiUzQSUyMk9udGFyaW8lMjBTY2llbmNlJTIwQ2VudHJlJTIyJTJDJTIycmVmZXJlbmNlJTIyJTNBJTIyYjkwMjQ2N2EtYTZkMS1mMWViLTFkZDgtMDI5NTgxODQ1ZDJiJTIyJTJDJTIycmVmZXJlbmNlVHlwZSUyMiUzQSUyMnViZXJfcGxhY2VzJTIyJTJDJTIybGF0aXR1ZGUlMjIlM0E0My43MTY4MTI2JTJDJTIybG9uZ2l0dWRlJTIyJTNBLTc5LjMzOTE1MzIlN0Q%3D";
	driver.get(baseUrl);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
}
   public void closeBrowser() throws InterruptedException {
	Thread.sleep(2000);
	driver.quit();
}
   public void enterfav(String EnterFav) throws InterruptedException {
	   enterfav.sendKeys(EnterFav);
	   Thread.sleep(2000);
	   
   }
   public void clickon() throws InterruptedException {
	   Thread.sleep(2000);
	   clickon.click();
   
	  
   }
	 

 public void selectfav() throws InterruptedException {
	   
	   Thread.sleep(2000);
	   selectfav.click();
 }
}