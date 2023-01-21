package browserLaunch;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BrowserLaunch {
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver","E:\\Selenium files\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	// Get tile
    String title = driver.getTitle();
	System.out.println(title);
	
	//Get Current URL
	String URL = driver.getCurrentUrl();
	System.out.println(URL);
	
	//Get PageSource
String Source = driver.getPageSource();
 //System.out.println(Source);

// GET TExt

String text = driver.findElement(By.xpath("//a[@class='nav-a  ']")).getText();

System.out.println(text);

//Nvaigate

//driver.navigate().forward();
  
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iPhone" + Keys.ENTER);

//Dimension d = new Dimension(200,300);

//driver.manage().window().setSize(d);

  //    Dimension size = driver.manage().window().getSize();
 //System.out.println(size);

 // Screenshot
 
 //String path = "C:\\Users\\USER\\Documents\\GitHub\\Prashant\\SeleniumGit\\Screenshot";
 
 //TakesScreenshot ts = (TakesScreenshot)driver;
 
// File src = ts.getScreenshotAs(OutputType.FILE);
 
 // File des = new File(path + "ss1.png");
 
// FileHandler.copy(src, des);
 
 
 
 
 
 
}
}
