package selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","G:\\Eclipse_oxy_workspace\\Java_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		driver.findElement(By.xpath("//div[@id='hmenu-customer-name']")).click();
		driver.findElement(By.id("ap_email")).sendKeys("vikastejatumma@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("xxxxxx");
		driver.findElement(By.id("signInSubmit")).click();*/
		driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Smartphones & Basic Mobiles')]")).click();
		driver.findElement(By.xpath("//body[@class='a-aui_157141-c a-aui_72554-c a-aui_dropdown_187959-c a-aui_pci_risk_banner_210084-c a-aui_perf_130093-c a-aui_tnr_v2_180836-c a-aui_ux_145937-c a-meter-animate']/div[@id='a-page']/div[@class='a-fixed-left-flipped-grid s-padding-left-small s-padding-right-small s-span-page a-spacing-top-small']/div[@class='a-fixed-left-grid-inner']/div[@class='a-fixed-left-grid-col a-col-right']/div[@id='container']/div[@id='merchandised-content']/div[@class='a-section octopus-pc-asin-card']/div[@class='a-section octopus-pc-card octopus-best-seller-card']/div[@class='a-section octopus-pc-card-content']/ul[@class='a-unordered-list a-nostyle a-horizontal octopus-pc-card-list octopus-pc-card-height-v3']/li[1]/span[1]/div[1]/a[1]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(10000);
		driver.close();
	}

}
