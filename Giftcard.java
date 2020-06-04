package mt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Giftcard {
	
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/sharukh/Downloads/chromedriverv79/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driver.get("https://www.mariatash.com/");
		
		driver.findElement(By.xpath("(//div/div/button[@type='button'])[9]")).click();
		
//WebElement agree = driver.findElement(By.xpath("//*[@title='I Agree']"));
//agree.click();
//if(agree.isDisplayed()) {
//System.out.println("Displayed");
//	} else {
//	System.out.println("Hidden");
//	}
//driver.findElement(By.xpath("//*[@onclick='mb_popup.closeDialog(mb_popups[24])']")).click();
		
		driver.findElement(By.xpath("(//span[.='Gift Cards'])[1]")).click();
		Select amount = new Select(driver.findElement(By.name("card_amount")));
		amount.selectByValue("30");
		
		//SENDER__DETAIL
		WebElement sendername= driver.findElement(By.id("mail-from"));
		sendername.sendKeys("SHAHRUKH SUFIYAAN");
		System.out.println(sendername.getAttribute("value"));
		WebElement senderemail = driver.findElement(By.id("mail-from-email"));
		senderemail.sendKeys("shahrukhsufiyaan@allureinc.co");
		System.out.println(senderemail.getAttribute("value"));
		
		
		//driver.findElement(By.id("deliver_immediately")).click();
	
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,450)");
		
		Select month = new Select(driver.findElement(By.xpath("//div/div/div/div/select[@class='date_selector_month ']")));
		month.selectByValue("8");
		
		Select day = new Select(driver.findElement(By.xpath("//div/div/div/div/select[@class='date_selector_day ']")));
		day.selectByValue("15");
		
		Select year = new Select(driver.findElement(By.xpath("//div/div/div/div/select[@class='date_selector_year ']")));
		year.selectByValue("2020");
		
		//RECEIVER_DETAIL
		WebElement Rname = driver.findElement(By.id("mail-to"));
		Rname.sendKeys("Shahrukhsufiyaan");
		System.out.println(Rname.getAttribute("value"));
		WebElement Remail = driver.findElement(By.id("mail-to-email"));
		Remail.sendKeys("shahrukhsufiyaan@allureinc.co");
		System.out.println(Remail.getAttribute("value"));
		WebElement msg = driver.findElement(By.id("mail-message"));
		msg.sendKeys("this is test gift card");
		System.out.println(msg.getAttribute("value"));
	
		driver.findElement(By.id("addtocart")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
