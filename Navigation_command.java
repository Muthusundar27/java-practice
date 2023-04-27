package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigation_command {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System Property for ChromeDriver   
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\a851335\\OneDrive - Atos\\Desktop\\java\\sample\\src\\lib\\chromedriver.exe");  
		  ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");              
		// Instantiate a ChromeDriver class.      
		WebDriver driver=new ChromeDriver(options);  
		  // Launch Website    
        driver.navigate().to("https://www.javatpoint.com/selenium-features");     

        //Click on the Link Text using click() command    
        driver.findElement(By.xpath("(//*[@class='next'])[4]")).click();  

        //Go back to Home Page  
        driver.navigate().back(); 
        
        //Maximize the window
        driver.manage().window().maximize();

        //Go forward to Registration page  
        driver.navigate().forward();  

        // Go back to Home page  
        driver.navigate().to("https://www.javatpoint.com/selenium-features");  

        //Refresh browser  
        driver.navigate().refresh();  
    
        //Closing browser  
       driver.close();   
        
	}

}
