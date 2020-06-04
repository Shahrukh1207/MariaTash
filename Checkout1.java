package mt;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkout1 {
	
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/sharukh/Downloads/chromedriverv79/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driver.get("https://www.mariatash.com/");
		
		driver.findElement(By.xpath("(//div/div/button[@type='button'])[9]")).click();
		
			//SELECTING MENU : LOBE EARRING
		driver.findElement(By.xpath("(//div/ul/li[@class='level0 nav-1 first level-top parent nav-item main_menu'])[1]")).click();
		driver.findElement(By.xpath("(//a[.='Lobe Earrings'])[1]")).click();
			
			//PRODUCT NO::1
		driver.findElement(By.id("img-27248")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
			
			// CHANGING OF PRODUCT IMAGE
		driver.findElement(By.xpath("//div/div/div[@class='thumb thumb4']")).click();
		Thread.sleep(2000);
			
			// INCREASING QUANTITY OF PRODUCT
			//driver.findElement(By.xpath("//div/span[.='+']")).click();
			//Thread.sleep(2000);
			
			// ADDING PRODUCT TO CART
		driver.findElement(By.id("addtocart")).click();
		Thread.sleep(5000);
			
			//PRODUCT NO::2
		driver.findElement(By.xpath("(//div/ul/li/a[span='Jewelry'])[1]")).click();
		driver.findElement(By.xpath("(//a[.='Lobe Earrings'])[1]")).click();
		JavascriptExecutor js0 = (JavascriptExecutor) driver;
		js0.executeScript("window.scrollBy(0,1500)");
		driver.findElement(By.id("img-25868")).click();
		driver.findElement(By.xpath("//div/div/ul/li[span='6.5mm']")).click();
			
			//ADD TO CART
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.id("addtocart")).click();
		Thread.sleep(4000);
			
			// SELECTING SHOPPING CART
		driver.findElement(By.xpath("//*[@id='ajax_cart_content']")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,200)");
			
			//CLICKING ON CHECKOUT BUTTON
		driver.findElement(By.xpath("//div/ul/li/button/span[.='Checkout']")).click();
					
			//LOGIN + CHECKOUT
		WebElement username = driver.findElement(By.id("username-login"));
		username.sendKeys("shahrukhsufiyaan@allureinc.co");
		System.out.println(username.getAttribute("value"));
				
		WebElement password = driver.findElement(By.id("passwd-login"));
		password.sendKeys("12qwaszx");
		System.out.println(password.getAttribute("value"));
			
		WebElement success = driver.findElement(By.id("signin-btn-popup"));
			success.click();
				if(success.isEnabled()) {
					System.out.println("LoggedIn");
					}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/div/ul/li/button/span[.='Checkout']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,400)");
												
													//WebElement ship = driver.findElement(By.xpath("(//*[@class='checkmark'])[1]"));
													//ship.click();
													//if(ship.isSelected()) {
													//System.out.println("unchecked");
													//		} else {
													//		System.out.println("checked");
													//		}
						
			//ADDRESS SELECTION
		driver.findElement(By.xpath("(//*[@class='checkmark'])[1]")).click();
		Thread.sleep(2000);
			// FIRST PRODUCT ADDRESS
		Select ship1 = new Select(driver.findElement(By.xpath("(//div/div/p/select[@class='validate-select'])[1]")));
		ship1.selectByValue("728664");
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,200)");
		
			//SECOND PRODUCT ADDRESS
		Select ship2 = new Select(driver.findElement(By.xpath("(//div/div/p/select[@class='validate-select'])[2]")));
		ship2.selectByValue("714322");
		driver.findElement(By.xpath("//button/span[.='Next']")).click();			
		
			//SHIPPING METHOD
		Select method1 = new Select(driver.findElement(By.xpath("(//div/div/div/select[@class='select-type-one validate-select'])[1]")));
		method1.selectByValue("matrixrate_matrixrate_3#0#1");
		Select method2 = new Select(driver.findElement(By.xpath("(//div/div/div/select[@class='select-type-one validate-select'])[2]")));
		method2.selectByValue("matrixrate_matrixrate_3#0#1");
		
		driver.findElement(By.xpath("//button/span[.='Next']")).click();
		
		JavascriptExecutor js7 = (JavascriptExecutor) driver;
		js7.executeScript("window.scrollBy(0,200)");
										
			//COUPON SECTION
			//driver.findElement(By.id("promoCodeLinkRemove")).click();
			//driver.findElement(By.id("promoCode")).clear();
			//Thread.sleep(2000);
		WebElement promo = driver.findElement(By.id("promoCode"));
		promo.sendKeys("4uWruyuc");
		System.out.println(promo.getAttribute("value"));
		driver.findElement(By.xpath("(//div/a/span[.='Apply'])[2]")).click();
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("window.scrollBy(0,500)");
					
					//PAYMENT SECTION
		driver.findElement(By.id("label-authnetcim")).click();
		driver.findElement(By.id("authnetcim_cc_number")).sendKeys("41111111111111111");
		driver.findElement(By.id("authnetcim_cc_holdername")).sendKeys("shahrukh");
		Select month = new Select(driver.findElement(By.id("authnetcim_cc_exp_month")));
			month.selectByValue("4");
		Select year = new Select(driver.findElement(By.id("authnetcim_cc_exp_year")));
			year.selectByValue("2023");
		WebElement cvv = driver.findElement(By.id("authnetcim_cc_cid"));
			cvv.sendKeys("324");
		System.out.println(cvv.getAttribute("value"));
		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.xpath("//button/span[.='Next']")).click();
		JavascriptExecutor js9 = (JavascriptExecutor) driver;
		js9.executeScript("window.scrollBy(0,600)");
	
	
	}
}