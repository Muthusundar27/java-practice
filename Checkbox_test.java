package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Checkbox_test {

	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
	        WebDriver driver = new ChromeDriver(options);
	        driver.navigate().to("https://accounts.google.com/");
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,150)", "");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        WebElement Dropdown = driver.findElement(By.xpath("//div[@class='VfPpkd-TkwUic']"));
	        Dropdown.click();
//	      Select select = new Select(Dropdown);        Thread.sleep(2000);
	        WebElement Dropdown1 = driver.findElement(By.xpath("(//span[text()='English (United Kingdom)'])/../.."));
	        Dropdown1.click();
//	              select.selectByVisibleText("English (United Kingdom)");//      select.selectByIndex(3);/
	        }
}