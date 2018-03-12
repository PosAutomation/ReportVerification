import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StockVerify {
	
	WebDriver Driver;
	
	
	@Test
	public void Test() throws InterruptedException
	{	
	System.setProperty("webdriver.chrome.driver", "D://Java//chromedriver.exe");
	WebDriver Driver = new ChromeDriver();		
	Driver.get("");
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Driver.findElement(By.xpath("//input[@placeholder='Your device secret']")).sendKeys("19ec6744-4c57-4d65-8715-a6e2d09f2fb3");
	Driver.findElement(By.xpath("//button[@class='button is-info is-outlined is-fullwidth']")).click();
	Driver.findElement(By.xpath("//input[@name='email']")).sendKeys("");
	Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
	Driver.findElement(By.xpath(".//*[@id='app']/section/div/div/div/div/div[1]/form/div[3]/button")).click();
	//logger.log(LogStatus.PASS, "Successfully Logged IN");
	//Login
	Thread.sleep(10000);
	Thread.sleep(4000);

	Driver.findElement(By.xpath("//a[@href='/store/inventory']")).click();
	//Driver.findElement(By.xpath(".//*[@id='app']/div/div[4]/section/section/div[1]/div[2]/div[2]/nav/button[2]")).click();
			
		for(int i=1;i<=50;i++){
		
			
			
               //Driver.findElement(By.xPath("//tr[4]/td["+ i +"]/a/span")).click();
			WebElement TotalPrice =   Driver.findElement(By.xpath(".//*[@id='app']/div/div[4]/section/section/div[2]/div/table/tbody/tr["+i+"]/td[5]"));
			String str;
			str=TotalPrice.getText();
			
			System.out.println("Printing " + str);
		
	
		  
		
			Driver.findElement(By.xpath(".//*[@id='app']/div/div[4]/section/section/div[1]/div[2]/div[2]/nav/button[2]")).click();
		
}
	
	
	
	}
	
	
	
	
	
	
	}
