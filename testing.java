package bs1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	driver.manage().window().maximize();
	
	
	Thread.sleep(2000); // for break 
	//creating an account
	

	driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("abirarshad0@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
	driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("abir");
	driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("arshad");
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abirarshad0@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("@c6EnH4DqpH.2qc");
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("abir");
	driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("arshad");
	driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("WirelessMore");
	driver.findElement(By.xpath("//*[@id=\"city\"]]")).sendKeys("New York");
	
	WebElement ddown = driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
	Select select= new Select(ddown);
	select.deselectByVisibleText("Alska");
	
	driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("55555");
	Thread.sleep(2000);
	
	WebElement country=driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
	Select s= new Select(country);
	s.deselectByVisibleText("United States");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("01718333267");
	driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("Mohakhali");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
	Thread.sleep(2000);
	
	// casual dress section
	
	driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Casual Dresses");
	driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
	Thread.sleep(2000);
	// select dresses
	
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).click();
	driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
	Thread.sleep(2000);
	
	// t-shirt section
	
	WebElement tshirt=driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/div"));
	Select c= new Select(tshirt);
	c.deselectByVisibleText("T-SHIRTS");
	Thread.sleep(2000);
	
	// filter blue
	
	driver.findElement(By.xpath("//*[@id=\"layered_id_attribute_group_14\"]")).click();
	Thread.sleep(2000);
	// add to cart
	
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")).click();
	Thread.sleep(2000);
	
	// proceed to checkout 
	
	driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
	Thread.sleep(2000);
	
	// agreement
	driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
	Thread.sleep(2000);
	
	// check payment
	driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
	Thread.sleep(2000);
	// sign out
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
	
	
	
	}

}
 