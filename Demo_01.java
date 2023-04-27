package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//	    options.addArguments("--remote-allow-origins=*");
	    // Instantiate a ChromeDriver class.  
//	    WebDriver driver = new ChromeDriver(options);
	    
//	   firefox launch
/*	    Webdriver driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        driver.get("https://www.google.com");   */
	    
	    EdgeOptions options = new EdgeOptions();
	    options.addArguments("--remote-allow-origins=*");

	    System.setProperty("webdriver.edge.driver", "C:\\Users\\a851335\\OneDrive - Atos\\Desktop\\java\\msedgedriver.exe");
	    WebDriver driver = new EdgeDriver(options);
        driver.get("http://www.javatpoint.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        

	}

}
