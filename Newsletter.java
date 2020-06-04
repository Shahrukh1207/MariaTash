package mt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newsletter {

	
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/sharukh/Downloads/chromedriverv79/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driver.get("https://www.mariatash.com/");
		//driver.findElement(By.xpath("(//div/div/button[@type='button'])[9]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/div/div/input[@aria-label='Your email']")).sendKeys("Shahrukhsufiyaan@allureinc.co");
		driver.findElement(By.xpath("//div/div/div/input[@aria-label='First Name']")).sendKeys("Shahrukh");
		driver.findElement(By.xpath("//div/div/div/input[@aria-label='Last Name']")).sendKeys("Sufiyaan");
		//driver.findElement(By.id("downshift-0-input")).click();
	
		
		
	}
}