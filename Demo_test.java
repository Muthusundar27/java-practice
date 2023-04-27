package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo_test {

	public static void main(String[] args) {
//		String str = "C:\\Users\\a851335\\OneDrive - Atos\\Desktop\\java\\sample\\src\\lib\\chromedriver.exe";
		// TODO Auto-generated method stub
		 // System Property for chromedriver   
//	    System.setProperty("webdriver.chrome.driver", str);
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    // Instantiate a ChromeDriver class.  
	    WebDriver driver = new ChromeDriver(options);
	    
	    // Launch website  	
	    driver.navigate().to("http://www.javatpoint.com/");  
	    //Maximize the browser      
	    driver.manage().window().maximize();  
	    //Scroll down the webpage by 5000 pixels  	
	    JavascriptExecutor js = (JavascriptExecutor)driver;  	
	    js.executeScript("scrollBy(0, 5000)"); 
	    // Click on the Search button     
	    driver.findElement(By.linkText("Java")).click();
	    String URL ="URL";
	  	driver.get(URL);     
	      
  
	
		}

	}
