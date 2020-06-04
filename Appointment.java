package mt;


import java.awt.AWTException;

import java.awt.Robot;

import java.awt.event.KeyEvent;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


public class Appointment
 {


	public static void main(String[] args)  throws InterruptedException, AWTException 
{

		System.setProperty("webdriver.chrome.driver","/home/sharukh/Downloads/chromedriverv79/chromedriver");
		WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;

	driver.get("https://www.mariatash.com/");

		//Thread.sleep(3000);	
	
		driver.findElement(By.xpath("(//div/div/div/button[@type='button'])[8]")).click();
		
		
		driver.findElement(By.xpath("(//span[.='Appointments'])[1]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("(//*[contains(text(),'BOOK NOW')])[3]")).click();
		Select number = new Select(driver.findElement(By.id("count")));
		number.selectByValue("2");
		WebElement option = driver.findElement(By.xpath("//label[@class='label translate-popup translate-popup custom-checkbox']"));
		option.click();
		if(option.isSelected()){
			System.out.print("Unchecked");
				}else {
			System.out.print("checked");
				}
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,550)");
		Thread.sleep(3000);
		//Customer :: 1
		WebElement fname = driver.findElement(By.name("customer[1][firstname]"));
		fname.sendKeys("shahrukh");
		System.out.println(fname.getAttribute("value"));
		WebElement lname = driver.findElement(By.id("lastname1"));
		lname.sendKeys("sufiyaan");
		System.out.println(lname.getAttribute("value"));
		WebElement email = driver.findElement(By.id("email1"));
		email.sendKeys("shahrukhsufiyaan@allureinc.co");
		System.out.println(email.getAttribute("value"));
		WebElement flag = driver.findElement(By.xpath("//div/div[@class='flag-container']"));
		flag.click();
		driver.findElement(By.id("iti-item-in")).click();
		driver.findElement(By.id("phonenumber1")).sendKeys("9503353784");
		driver.findElement(By.id("special-notes-1")).sendKeys("Test appointment");
		driver.findElement(By.xpath("//label[@class='label translate-popup para-normal']")).click();
		
		//Customer :: 2
		driver.findElement(By.id("firstname2")).sendKeys("sufiyaan");
		driver.findElement(By.id("lastname2")).sendKeys("sufiyaan");
		driver.findElement(By.id("email2")).sendKeys("shahrukhsufiyaan@allurecommerce.com");
		JavascriptExecutor js0 = (JavascriptExecutor) driver;
		js0.executeScript("window.scrollBy(0,150)");
		//WebElement flag2 = driver.findElement(By.xpath("(//div/div[@class='flag-container'])[2]"));
		//flag2.click();
		//driver.findElement(By.id("iti-item-ar")).click();
		driver.findElement(By.id("phonenumber2")).sendKeys("9503353784");
		driver.findElement(By.id("special-notes-2")).sendKeys("Test appointment 2");
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,-650)");
		driver.findElement(By.id("pick_ur_date_div")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		
		//driver.findElement(By.xpath("//td[@data-date='1581465600000']")).click();
				
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,500)");
		WebElement time = driver.findElement(By.xpath("//*[@title='19:10-19:29']"));
		time.click();
		
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,-400)");
		driver.findElement(By.xpath("//*[@class='datepicker-switch cc_pointer']")).click();
		Robot D = new Robot();
		D.keyPress(KeyEvent.VK_ENTER);
		
		//JavascriptExecutor js5 = (JavascriptExecutor)driver;
		//js5.executeScript("alert('ITs IS LIVE SITE SO NO CLICKing ON CONFIRM')");
	
		
		

	}

}