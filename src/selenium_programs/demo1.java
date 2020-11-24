package selenium_programs;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class demo1 {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","G:\\Eclipse_oxy_workspace\\Java_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("vikas@123");
		driver.findElement(By.name("pass")).sendKeys("132");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		//((JavascriptExecutor)driver).executeScript("document.name('identifier').value ='vikas'");
		
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
	    /*driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//h3[contains(text(),'Selenium Python Bindings 2')]")).click();*/
	    //driver.quit();
	   
	    

}

	
}
