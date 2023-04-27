package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Radio_Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System Property for ChromeDriver   
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\a851335\\OneDrive - Atos\\Desktop\\java\\sample\\src\\lib\\chromedriver.exe");  
		 ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");         	                  
		// Instantiate a ChromeDriver class.      
		WebDriver driver =new ChromeDriver(options);  
		driver.get("C:\\Users\\a851335\\OneDrive - Atos\\Desktop\\java\\radio.html");
		 int a = driver.findElements(By.xpath("//input [@name='group1']")).size();  
	        System.out.println(a);  
	        for(int i=1;i<=a;i++)  
	        {  
	            driver.findElements(By.xpath("//input[@name='group1']")).get(2).click();  
	        }  
	    }
	}  
