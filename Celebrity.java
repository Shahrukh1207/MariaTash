package mt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Celebrity {

	
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driver.get("https://www.mariatash.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div/div/button[@type='button'])[9]")).click();

		driver.findElement(By.xpath("(//span[.='Celebrity'])[1]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		
		driver.findElement(By.id("celebId_81")).click();
		driver.findElement(By.xpath("//div/div/ul/li/div/a[.='Quick View']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("addtocart")).click();
		
		
	}
}
