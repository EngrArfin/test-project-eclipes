package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.DriverSetup;

public class TC001_Locator extends DriverSetup {
	@Test
	public void location() throws InterruptedException {
		String baseUrl="https://demo.guru99.com/insurance/v1/index.php";
		   
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Arfin");
	}
	
	
	

}
