package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_command {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System Property for ChromeDriver   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a851335\\OneDrive - Atos\\Desktop\\java\\sample\\src\\lib\\chromedriver.exe");  
		                  
		// Instantiate a ChromeDriver class.      
		WebDriver driver=new ChromeDriver();  
		          
		// Storing the Application Url in the String variable  
		String url = ("https://www.google.co.in/");  
		       
		//Launch the ToolsQA WebSite  
		driver.get(url);  
		       
		// Storing Title name in the String variable  
		String title = driver.getTitle();  
		       
		// Storing Title length in the Int variable  
		int titleLength = driver.getTitle().length();  
		       
		// Printing Title & Title length in the Console window  
		System.out.println("Title of the page is : " + title);  
		System.out.println("Length of the title is : "+ titleLength);  
		      
		// Storing URL in String variable  
		String actualUrl = driver.getCurrentUrl();  
		       
		if (actualUrl.equals("http://www.javatpoint.com/")){  
		System.out.println("Verification Successful - The correct Url is opened.");  
		}  
		else{  
		  
		System.out.println("Verification Failed - An incorrect Url is opened.");  
		         }  
		       
		// Storing Page Source in String variable  
		String pageSource = driver.getPageSource();  
		           
		// Storing Page Source length in Int variable  
		int pageSourceLength = pageSource.length();  
		           
		// Printing length of the Page Source on console  
		System.out.println("Total length of the Page Source is : " + pageSourceLength);  
		           
		  
		//Closing browser  
		 //driver.close();   
	
	}

}
