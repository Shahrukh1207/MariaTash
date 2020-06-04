package mt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static WebDriver driver;
		//this will highlight username field
    public static void highlight(WebDriver driver, WebElement ele) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: grey; border: 2px solid yellow;');", ele);
    }
    	//this will highlight the password field
    public static void highlight1(WebDriver driver, WebElement ele1) {    
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid blue;');", ele1);
    }
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","/home/sharukh/Downloads/chromedriverv79/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driver.get("https://www.mariatash.com/");
		driver.findElement(By.xpath("(//div/div/button[@type='button'])[9]")).click();
			
		driver.findElement(By.id("sign_in_label")).click();
		
		WebElement username = driver.findElement(By.id("username-login"));
		highlight(driver,username);
		username.sendKeys("shahrukhsufiyaan@allureinc.co");
		
		WebElement password = driver.findElement(By.id("passwd-login"));
		highlight1(driver,password);
		password.sendKeys("12qwaszx");
		
		driver.findElement(By.id("signin-btn-popup")).click();
				
		//driver.findElement(By.xpath("//div/ul/li[@class='icon-user position-relative']")).click();
		//driver.findElement(By.xpath("//div/ul/li[@class='user-sign-out']")).click();
		//Thread.sleep(6000);
		//driver.findElement(By.id("sign_in_label")).click();
			
		//	driver.findElement(By.xpath("//div/ul/li/div/div/div[@class='select-currency main-nav-link-dropdown']")).click();
		//	driver.findElement(By.xpath("((//*[span='AUD'])[1]")).click();
			Thread.sleep(3000);
		JavascriptExecutor js5 = (JavascriptExecutor)driver;
		js5.executeScript("alert('your logged in')");	
			
			
	}

}




			
			



		
